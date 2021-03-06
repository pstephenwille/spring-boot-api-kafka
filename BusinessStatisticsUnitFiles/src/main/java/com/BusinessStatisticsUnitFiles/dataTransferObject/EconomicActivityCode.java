package com.BusinessStatisticsUnitFiles.dataTransferObject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/*@JsonInclude(JsonInclude.Include.NON_NULL)*/
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class EconomicActivityCode {

    @JsonProperty("economicActivityCode")
    private String economicActivityCode;

    @JsonProperty("description")
    private String description;

    @JsonProperty("status")
    private int status = 1;




    public String getEconomicActivityCode() { return economicActivityCode; }

    public void setEconomicActivityCode(String economicActivityCode) { this.economicActivityCode = economicActivityCode; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public int getStatus() { return status; }

    public void setStatus(int status) { this.status = status; }
}

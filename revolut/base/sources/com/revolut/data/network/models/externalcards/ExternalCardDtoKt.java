package com.revolut.data.network.models.externalcards;

import com.revolut.data.network.models.externalcards.ExternalCardDto;
import com.revolut.data.network.models.externalcards.IssuerInfoDto;
import kotlin.Metadata;
import no3.b;
import v0.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0002\u0010\u0007\u001a\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/revolut/data/network/models/externalcards/ExternalCardDto$RestrictionsDto;", "", "toDebugString", "(Lcom/revolut/data/network/models/externalcards/ExternalCardDto$RestrictionsDto;)Ljava/lang/String;", "Lno3/b;", "(Lno3/b;)Ljava/lang/String;", "Lcom/revolut/data/network/models/externalcards/IssuerInfoDto;", "(Lcom/revolut/data/network/models/externalcards/IssuerInfoDto;)Ljava/lang/String;", "Lcom/revolut/data/network/models/externalcards/IssuerInfoDto$OutageDto;", "(Lcom/revolut/data/network/models/externalcards/IssuerInfoDto$OutageDto;)Ljava/lang/String;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ExternalCardDtoKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String toDebugString(ExternalCardDto.RestrictionsDto restrictionsDto) {
        if (restrictionsDto == null) {
            return null;
        }
        String statusTitle = restrictionsDto.getStatusTitle();
        String summary = restrictionsDto.getSummary();
        return a.i(a.m("RestrictionsDto(statusTitle=", statusTitle, ", summary=", summary, ", message="), restrictionsDto.getMessage(), ")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toDebugString(b bVar) {
        if (bVar == null) {
            return null;
        }
        String addressLine1 = bVar.getAddressLine1();
        String addressLine2 = bVar.getAddressLine2();
        String region = bVar.getRegion();
        String city = bVar.getCity();
        String postcode = bVar.getPostcode();
        String country = bVar.getCountry();
        String street = bVar.getStreet();
        String streetName = bVar.getStreetName();
        String houseNumber = bVar.getHouseNumber();
        String flat = bVar.getFlat();
        String neighborhood = bVar.getNeighborhood();
        String houseName = bVar.getHouseName();
        String streetType = bVar.getStreetType();
        String landmark = bVar.getLandmark();
        String format = bVar.getFormat();
        StringBuilder sbM = a.m("AddressDto(addressLine1=", addressLine1, ", addressLine2=", addressLine2, ", region=");
        j6.a.D(sbM, region, ", city=", city, ", postcode=");
        j6.a.D(sbM, postcode, ", country=", country, ", street=");
        j6.a.D(sbM, street, ", streetName=", streetName, ", houseNumber=");
        j6.a.D(sbM, houseNumber, ", flat=", flat, ", neighborhood=");
        j6.a.D(sbM, neighborhood, ", houseName=", houseName, ", streetType=");
        j6.a.D(sbM, streetType, ", landmark=", landmark, ", format=");
        return a.i(sbM, format, ")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toDebugString(IssuerInfoDto issuerInfoDto) {
        if (issuerInfoDto == null) {
            return null;
        }
        String bin = issuerInfoDto.getBin();
        String name = issuerInfoDto.getName();
        String logoUrl = issuerInfoDto.getLogoUrl();
        String colour = issuerInfoDto.getColour();
        String bgColour = issuerInfoDto.getBgColour();
        String cardType = issuerInfoDto.getCardType();
        String cardBrand = issuerInfoDto.getCardBrand();
        String currency = issuerInfoDto.getCurrency();
        String country = issuerInfoDto.getCountry();
        boolean supported = issuerInfoDto.getSupported();
        Float fee2 = issuerInfoDto.getFee();
        Long errorCode = issuerInfoDto.getErrorCode();
        boolean postcodeRequired = issuerInfoDto.getPostcodeRequired();
        String cardSubtype = issuerInfoDto.getCardSubtype();
        String feeDisclosure = issuerInfoDto.getFeeDisclosure();
        String binId = issuerInfoDto.getBinId();
        String debugString = toDebugString(issuerInfoDto.getOutage());
        StringBuilder sbM = a.m("IssuerInfoDto(bin=", bin, ", name=", name, ", logoUrl=");
        j6.a.D(sbM, logoUrl, ", colour=", colour, ", bgColour=");
        j6.a.D(sbM, bgColour, ", cardType=", cardType, ", cardBrand=");
        j6.a.D(sbM, cardBrand, ", currency=", currency, ", country=");
        sbM.append(country);
        sbM.append(", supported=");
        sbM.append(supported);
        sbM.append(", fee=");
        sbM.append(fee2);
        sbM.append(", errorCode=");
        sbM.append(errorCode);
        sbM.append(", postcodeRequired=");
        sbM.append(postcodeRequired);
        sbM.append(", cardSubtype=");
        sbM.append(cardSubtype);
        sbM.append(", feeDisclosure=");
        j6.a.D(sbM, feeDisclosure, ", binId=", binId, ", outage=");
        return a.i(sbM, debugString, ")");
    }

    private static final String toDebugString(IssuerInfoDto.OutageDto outageDto) {
        if (outageDto == null) {
            return null;
        }
        String title = outageDto.getTitle();
        String message = outageDto.getMessage();
        return a.i(a.m("OutageDto(title=", title, ", message=", message, ", summary="), outageDto.getSummary(), ")");
    }
}

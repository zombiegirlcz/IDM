package com.revolut.data.network.models.beneficiary;

import com.revolut.data.network.models.address.AddressModel;
import kotlin.Metadata;
import v0.a;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0002¨\u0006\u0003"}, d2 = {"toStableString", "", "Lcom/revolut/data/network/models/address/AddressModel;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class BeneficiaryExtraFieldsDtoKt {
    private static final String toStableString(AddressModel addressModel) {
        if (addressModel == null) {
            return "null";
        }
        String streetLine1 = addressModel.getStreetLine1();
        String streetLine2 = addressModel.getStreetLine2();
        String streetName = addressModel.getStreetName();
        String houseNumber = addressModel.getHouseNumber();
        String region = addressModel.getRegion();
        String city = addressModel.getCity();
        String postcode = addressModel.getPostcode();
        String country = addressModel.getCountry();
        String fullAddress = addressModel.getFullAddress();
        String neighborhood = addressModel.getNeighborhood();
        StringBuilder sbM = a.m("{streetLine1=", streetLine1, ", streetLine2=", streetLine2, ", streetName=");
        j6.a.D(sbM, streetName, ", houseNumber=", houseNumber, ", region=");
        j6.a.D(sbM, region, ", city=", city, ", postcode=");
        j6.a.D(sbM, postcode, ", country=", country, ", fullAddress=");
        String strW = j6.a.w(sbM, fullAddress, ", neighborhood=", neighborhood, "}");
        return strW == null ? "null" : strW;
    }
}

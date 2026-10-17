package com.revolut.data.network.models.address.mapper;

import com.revolut.data.network.models.address.AddressModel;
import com.revolut.feature.address.models.Address;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0001¨\u0006\u0004"}, d2 = {"toDomain", "Lcom/revolut/feature/address/models/Address;", "Lcom/revolut/data/network/models/address/AddressModel;", "toNetworkModel", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class LegacyAddressMapperKt {
    @NotNull
    public static final Address toDomain(@NotNull AddressModel addressModel) {
        Intrinsics.checkNotNullParameter(addressModel, "<this>");
        String streetLine1 = addressModel.getStreetLine1();
        String streetLine2 = addressModel.getStreetLine2();
        String streetName = addressModel.getStreetName();
        String houseNumber = addressModel.getHouseNumber();
        return new Address(streetLine1, streetLine2, addressModel.getRegion(), addressModel.getCity(), addressModel.getPostcode(), addressModel.getCountry(), null, null, streetName, houseNumber, null, null, null, null, null, 31936, null);
    }

    @NotNull
    public static final AddressModel toNetworkModel(@NotNull Address address) {
        String str;
        Intrinsics.checkNotNullParameter(address, "<this>");
        String streetLine1 = address.getStreetLine1();
        String streetLine2 = address.getStreetLine2();
        String street = address.getStreet();
        String houseNumber = address.getHouseNumber();
        String region = address.getRegion();
        String city = address.getCity();
        String postcode = address.getPostcode();
        if (postcode != null) {
            if (postcode.length() == 0) {
                postcode = null;
            }
            str = postcode;
        } else {
            str = null;
        }
        return new AddressModel(streetLine1, streetLine2, street, houseNumber, region, city, str, address.getCountry(), address.getFullAddress(), address.getNeighborhood());
    }
}

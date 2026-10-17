package com.revolut.data.network.models.externalcards;

import com.revolut.data.network.models.address.AddressModel;
import com.revolut.feature.address.models.Address;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toDomain", "Lcom/revolut/feature/address/models/Address;", "Lcom/revolut/data/network/models/address/AddressModel;", "retail_data_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class AddressMapperKt {
    @NotNull
    public static final Address toDomain(@NotNull AddressModel addressModel) {
        Intrinsics.checkNotNullParameter(addressModel, "<this>");
        return new Address(addressModel.getStreetLine1(), addressModel.getStreetLine2(), addressModel.getRegion(), addressModel.getCity(), addressModel.getPostcode(), addressModel.getCountry(), null, null, null, null, null, null, null, null, null, 32704, null);
    }
}

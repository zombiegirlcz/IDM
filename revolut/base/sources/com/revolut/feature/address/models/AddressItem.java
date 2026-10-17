package com.revolut.feature.address.models;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/revolut/feature/address/models/AddressItem;", "Ljava/io/Serializable;", "elementId", "", "address", "Lcom/revolut/feature/address/models/Address;", "<init>", "(Ljava/lang/String;Lcom/revolut/feature/address/models/Address;)V", "getElementId", "()Ljava/lang/String;", "getAddress", "()Lcom/revolut/feature/address/models/Address;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature_address_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddressItem implements Serializable {

    @NotNull
    private final Address address;
    private final String elementId;

    public AddressItem(String str, @NotNull Address address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.elementId = str;
        this.address = address;
    }

    public static /* synthetic */ AddressItem copy$default(AddressItem addressItem, String str, Address address, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = addressItem.elementId;
        }
        if ((i & 2) != 0) {
            address = addressItem.address;
        }
        return addressItem.copy(str, address);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getElementId() {
        return this.elementId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Address getAddress() {
        return this.address;
    }

    @NotNull
    public final AddressItem copy(String elementId, @NotNull Address address) {
        Intrinsics.checkNotNullParameter(address, "address");
        return new AddressItem(elementId, address);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressItem)) {
            return false;
        }
        AddressItem addressItem = (AddressItem) other;
        return Intrinsics.f(this.elementId, addressItem.elementId) && Intrinsics.f(this.address, addressItem.address);
    }

    @NotNull
    public final Address getAddress() {
        return this.address;
    }

    public final String getElementId() {
        return this.elementId;
    }

    public int hashCode() {
        String str = this.elementId;
        return this.address.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}

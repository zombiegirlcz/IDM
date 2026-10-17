package com.revolut.feature.address.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/revolut/feature/address/models/AddressSuggestion;", "Landroid/os/Parcelable;", "verified", "", "address", "Lcom/revolut/feature/address/models/Address;", "failureReason", "Lcom/revolut/feature/address/models/AddressVerificationFailureReason;", "<init>", "(ZLcom/revolut/feature/address/models/Address;Lcom/revolut/feature/address/models/AddressVerificationFailureReason;)V", "getVerified", "()Z", "getAddress", "()Lcom/revolut/feature/address/models/Address;", "getFailureReason", "()Lcom/revolut/feature/address/models/AddressVerificationFailureReason;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature_address_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddressSuggestion implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AddressSuggestion> CREATOR = new Creator();
    private final Address address;
    private final AddressVerificationFailureReason failureReason;
    private final boolean verified;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AddressSuggestion> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressSuggestion createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AddressSuggestion(parcel.readInt() != 0, parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? AddressVerificationFailureReason.valueOf(parcel.readString()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressSuggestion[] newArray(int i) {
            return new AddressSuggestion[i];
        }
    }

    public AddressSuggestion(boolean z, Address address, AddressVerificationFailureReason addressVerificationFailureReason) {
        this.verified = z;
        this.address = address;
        this.failureReason = addressVerificationFailureReason;
    }

    public static /* synthetic */ AddressSuggestion copy$default(AddressSuggestion addressSuggestion, boolean z, Address address, AddressVerificationFailureReason addressVerificationFailureReason, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = addressSuggestion.verified;
        }
        if ((i & 2) != 0) {
            address = addressSuggestion.address;
        }
        if ((i & 4) != 0) {
            addressVerificationFailureReason = addressSuggestion.failureReason;
        }
        return addressSuggestion.copy(z, address, addressVerificationFailureReason);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getVerified() {
        return this.verified;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Address getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AddressVerificationFailureReason getFailureReason() {
        return this.failureReason;
    }

    @NotNull
    public final AddressSuggestion copy(boolean verified, Address address, AddressVerificationFailureReason failureReason) {
        return new AddressSuggestion(verified, address, failureReason);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressSuggestion)) {
            return false;
        }
        AddressSuggestion addressSuggestion = (AddressSuggestion) other;
        return this.verified == addressSuggestion.verified && Intrinsics.f(this.address, addressSuggestion.address) && this.failureReason == addressSuggestion.failureReason;
    }

    public final Address getAddress() {
        return this.address;
    }

    public final AddressVerificationFailureReason getFailureReason() {
        return this.failureReason;
    }

    public final boolean getVerified() {
        return this.verified;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.verified) * 31;
        Address address = this.address;
        int iHashCode2 = (iHashCode + (address == null ? 0 : address.hashCode())) * 31;
        AddressVerificationFailureReason addressVerificationFailureReason = this.failureReason;
        return iHashCode2 + (addressVerificationFailureReason != null ? addressVerificationFailureReason.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.verified ? 1 : 0);
        Address address = this.address;
        if (address == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            address.writeToParcel(dest, flags);
        }
        AddressVerificationFailureReason addressVerificationFailureReason = this.failureReason;
        if (addressVerificationFailureReason == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(addressVerificationFailureReason.name());
        }
    }

    public /* synthetic */ AddressSuggestion(boolean z, Address address, AddressVerificationFailureReason addressVerificationFailureReason, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : address, (i & 4) != 0 ? null : addressVerificationFailureReason);
    }
}

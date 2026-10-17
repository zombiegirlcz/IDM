package com.revolut.feature.crypto.remittance.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/crypto/remittance/models/CryptoBeneficiaryRecipientAddress;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_remittance_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoBeneficiaryRecipientAddress implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<CryptoBeneficiaryRecipientAddress> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f70989c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoBeneficiaryRecipientAddress(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoBeneficiaryRecipientAddress[i];
        }
    }

    public CryptoBeneficiaryRecipientAddress(String country, String str, String addressLine1, String str2) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(addressLine1, "addressLine1");
        this.f70987a = country;
        this.f70988b = str;
        this.f70989c = addressLine1;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoBeneficiaryRecipientAddress)) {
            return false;
        }
        CryptoBeneficiaryRecipientAddress cryptoBeneficiaryRecipientAddress = (CryptoBeneficiaryRecipientAddress) obj2;
        return Intrinsics.f(this.f70987a, cryptoBeneficiaryRecipientAddress.f70987a) && Intrinsics.f(this.f70988b, cryptoBeneficiaryRecipientAddress.f70988b) && Intrinsics.f(this.f70989c, cryptoBeneficiaryRecipientAddress.f70989c) && Intrinsics.f(this.d, cryptoBeneficiaryRecipientAddress.d);
    }

    public final int hashCode() {
        int iHashCode = this.f70987a.hashCode() * 31;
        String str = this.f70988b;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f70989c);
        String str2 = this.d;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70987a);
        dest.writeString(this.f70988b);
        dest.writeString(this.f70989c);
        dest.writeString(this.d);
    }
}

package com.revolut.feature.crypto.remittance.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import wje.m;
import wk5.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00062\u00020\u00012\u00020\u0002:\u0001\u0007J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/feature/crypto/remittance/models/CryptoAddressRecipientDetails;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_crypto_remittance_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoAddressRecipientDetails implements Parcelable, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f70984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f70985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f70986c;
    public final CryptoBeneficiaryRecipientAddress d;
    public final String e;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<CryptoAddressRecipientDetails> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.crypto.remittance.models.CryptoAddressRecipientDetails$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoAddressRecipientDetails(parcel.readString(), i.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : CryptoBeneficiaryRecipientAddress.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoAddressRecipientDetails[i];
        }
    }

    public CryptoAddressRecipientDetails(String str, i type, String str2, CryptoBeneficiaryRecipientAddress cryptoBeneficiaryRecipientAddress, String str3) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f70984a = str;
        this.f70985b = type;
        this.f70986c = str2;
        this.d = cryptoBeneficiaryRecipientAddress;
        this.e = str3;
    }

    public final String a() {
        String[] elements = {this.f70984a, this.f70986c};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return y.u(y.o(d.E(elements), new m(18)), " ", null, 62);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoAddressRecipientDetails)) {
            return false;
        }
        CryptoAddressRecipientDetails cryptoAddressRecipientDetails = (CryptoAddressRecipientDetails) obj2;
        return Intrinsics.f(this.f70984a, cryptoAddressRecipientDetails.f70984a) && this.f70985b == cryptoAddressRecipientDetails.f70985b && Intrinsics.f(this.f70986c, cryptoAddressRecipientDetails.f70986c) && Intrinsics.f(this.d, cryptoAddressRecipientDetails.d) && Intrinsics.f(this.e, cryptoAddressRecipientDetails.e);
    }

    public final int hashCode() {
        String str = this.f70984a;
        int iHashCode = (this.f70985b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.f70986c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        CryptoBeneficiaryRecipientAddress cryptoBeneficiaryRecipientAddress = this.d;
        int iHashCode3 = (iHashCode2 + (cryptoBeneficiaryRecipientAddress == null ? 0 : cryptoBeneficiaryRecipientAddress.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70984a);
        dest.writeString(this.f70985b.name());
        dest.writeString(this.f70986c);
        CryptoBeneficiaryRecipientAddress cryptoBeneficiaryRecipientAddress = this.d;
        if (cryptoBeneficiaryRecipientAddress == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cryptoBeneficiaryRecipientAddress.writeToParcel(dest, i);
        }
        dest.writeString(this.e);
    }

    public /* synthetic */ CryptoAddressRecipientDetails(String str, i iVar, String str2, String str3, int i) {
        this(str, iVar, str2, (CryptoBeneficiaryRecipientAddress) null, (i & 16) != 0 ? null : str3);
    }
}

package com.revolut.feature.crypto.withdraw.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.remittance.models.CryptoAddressRecipientDetails;
import java.util.List;
import ko5.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wk5.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/api/models/CryptoWallet;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_crypto_withdraw_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoWallet implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f71086c;
    public final CryptoAddressRecipientDetails d;
    public final List e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f71087g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CryptoWithdrawLimits f71088h;
    public final String i;

    @NotNull
    public static final Parcelable.Creator<CryptoWallet> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoWallet(parcel.readString(), parcel.readString(), k.valueOf(parcel.readString()), (CryptoAddressRecipientDetails) parcel.readParcelable(CryptoWallet.class.getClassLoader()), parcel.createStringArrayList(), parcel.readInt() != 0, e.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : CryptoWithdrawLimits.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoWallet[i];
        }
    }

    public CryptoWallet(String id10, String address, k addressType, CryptoAddressRecipientDetails cryptoAddressRecipientDetails, List linkedBeneficiaries, boolean z, e status, CryptoWithdrawLimits cryptoWithdrawLimits, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(addressType, "addressType");
        Intrinsics.checkNotNullParameter(linkedBeneficiaries, "linkedBeneficiaries");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f71084a = id10;
        this.f71085b = address;
        this.f71086c = addressType;
        this.d = cryptoAddressRecipientDetails;
        this.e = linkedBeneficiaries;
        this.f = z;
        this.f71087g = status;
        this.f71088h = cryptoWithdrawLimits;
        this.i = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoWallet)) {
            return false;
        }
        CryptoWallet cryptoWallet = (CryptoWallet) obj2;
        return Intrinsics.f(this.f71084a, cryptoWallet.f71084a) && Intrinsics.f(this.f71085b, cryptoWallet.f71085b) && this.f71086c == cryptoWallet.f71086c && Intrinsics.f(this.d, cryptoWallet.d) && Intrinsics.f(this.e, cryptoWallet.e) && this.f == cryptoWallet.f && this.f71087g == cryptoWallet.f71087g && Intrinsics.f(this.f71088h, cryptoWallet.f71088h) && Intrinsics.f(this.i, cryptoWallet.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f71086c.hashCode() + p.a.c(this.f71084a.hashCode() * 31, 31, this.f71085b)) * 31;
        CryptoAddressRecipientDetails cryptoAddressRecipientDetails = this.d;
        int iHashCode2 = (this.f71087g.hashCode() + j6.a.c(p.a.d((iHashCode + (cryptoAddressRecipientDetails == null ? 0 : cryptoAddressRecipientDetails.hashCode())) * 31, 31, this.e), 31, this.f)) * 31;
        CryptoWithdrawLimits cryptoWithdrawLimits = this.f71088h;
        int iHashCode3 = (iHashCode2 + (cryptoWithdrawLimits == null ? 0 : cryptoWithdrawLimits.hashCode())) * 31;
        String str = this.i;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71084a);
        dest.writeString(this.f71085b);
        dest.writeString(this.f71086c.name());
        dest.writeParcelable(this.d, i);
        dest.writeStringList(this.e);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeString(this.f71087g.name());
        CryptoWithdrawLimits cryptoWithdrawLimits = this.f71088h;
        if (cryptoWithdrawLimits == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cryptoWithdrawLimits.writeToParcel(dest, i);
        }
        dest.writeString(this.i);
    }
}

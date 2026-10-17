package com.revolut.feature.crypto.withdraw.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/api/models/CryptoWithdrawOrderDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoWithdrawOrderDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CryptoWithdrawOrderDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71100b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoWithdrawOrderDetails(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoWithdrawOrderDetails[i];
        }
    }

    public CryptoWithdrawOrderDetails(String addressId, String str) {
        Intrinsics.checkNotNullParameter(addressId, "addressId");
        this.f71099a = addressId;
        this.f71100b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoWithdrawOrderDetails)) {
            return false;
        }
        CryptoWithdrawOrderDetails cryptoWithdrawOrderDetails = (CryptoWithdrawOrderDetails) obj2;
        return Intrinsics.f(this.f71099a, cryptoWithdrawOrderDetails.f71099a) && Intrinsics.f(this.f71100b, cryptoWithdrawOrderDetails.f71100b);
    }

    public final int hashCode() {
        int iHashCode = this.f71099a.hashCode() * 31;
        String str = this.f71100b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71099a);
        dest.writeString(this.f71100b);
    }
}

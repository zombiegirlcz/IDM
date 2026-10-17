package com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.withdraw.api.models.FiatCryptoFeesBreakdown;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/crypto/withdraw/impl/ui/withdrawtoaddress/review/CryptoWithdrawToAddressReviewContract$BlockchainWithFee", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoWithdrawToAddressReviewContract$BlockchainWithFee implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CryptoWithdrawToAddressReviewContract$BlockchainWithFee> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wk5.a f71180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FiatCryptoFeesBreakdown f71181b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoWithdrawToAddressReviewContract$BlockchainWithFee(wk5.a.valueOf(parcel.readString()), (FiatCryptoFeesBreakdown) parcel.readParcelable(CryptoWithdrawToAddressReviewContract$BlockchainWithFee.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoWithdrawToAddressReviewContract$BlockchainWithFee[i];
        }
    }

    public CryptoWithdrawToAddressReviewContract$BlockchainWithFee(wk5.a blockchain, FiatCryptoFeesBreakdown fiatCryptoFeesBreakdown) {
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        this.f71180a = blockchain;
        this.f71181b = fiatCryptoFeesBreakdown;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoWithdrawToAddressReviewContract$BlockchainWithFee)) {
            return false;
        }
        CryptoWithdrawToAddressReviewContract$BlockchainWithFee cryptoWithdrawToAddressReviewContract$BlockchainWithFee = (CryptoWithdrawToAddressReviewContract$BlockchainWithFee) obj2;
        return this.f71180a == cryptoWithdrawToAddressReviewContract$BlockchainWithFee.f71180a && Intrinsics.f(this.f71181b, cryptoWithdrawToAddressReviewContract$BlockchainWithFee.f71181b);
    }

    public final int hashCode() {
        int iHashCode = this.f71180a.hashCode() * 31;
        FiatCryptoFeesBreakdown fiatCryptoFeesBreakdown = this.f71181b;
        return iHashCode + (fiatCryptoFeesBreakdown == null ? 0 : fiatCryptoFeesBreakdown.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71180a.name());
        dest.writeParcelable(this.f71181b, i);
    }
}

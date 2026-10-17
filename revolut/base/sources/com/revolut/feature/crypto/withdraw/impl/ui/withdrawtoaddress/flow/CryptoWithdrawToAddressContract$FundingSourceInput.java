package com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/crypto/withdraw/impl/ui/withdrawtoaddress/flow/CryptoWithdrawToAddressContract$FundingSourceInput", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoWithdrawToAddressContract$FundingSourceInput implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CryptoWithdrawToAddressContract$FundingSourceInput> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1j.a f71172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f71173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f71174c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoWithdrawToAddressContract$FundingSourceInput(k1j.a.valueOf(parcel.readString()), (AccountId) parcel.readParcelable(CryptoWithdrawToAddressContract$FundingSourceInput.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoWithdrawToAddressContract$FundingSourceInput[i];
        }
    }

    public CryptoWithdrawToAddressContract$FundingSourceInput(k1j.a balanceType, AccountId accountId, String balanceId) {
        Intrinsics.checkNotNullParameter(balanceType, "balanceType");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(balanceId, "balanceId");
        this.f71172a = balanceType;
        this.f71173b = accountId;
        this.f71174c = balanceId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoWithdrawToAddressContract$FundingSourceInput)) {
            return false;
        }
        CryptoWithdrawToAddressContract$FundingSourceInput cryptoWithdrawToAddressContract$FundingSourceInput = (CryptoWithdrawToAddressContract$FundingSourceInput) obj2;
        return this.f71172a == cryptoWithdrawToAddressContract$FundingSourceInput.f71172a && Intrinsics.f(this.f71173b, cryptoWithdrawToAddressContract$FundingSourceInput.f71173b) && Intrinsics.f(this.f71174c, cryptoWithdrawToAddressContract$FundingSourceInput.f71174c);
    }

    public final int hashCode() {
        return this.f71174c.hashCode() + l.b(this.f71173b, this.f71172a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71172a.name());
        dest.writeParcelable(this.f71173b, i);
        dest.writeString(this.f71174c);
    }
}

package com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.remittance.models.CryptoAddressCounterparty;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawLimits;
import com.revolut.feature.crypto.withdraw.api.models.FiatCryptoMoney;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/crypto/withdraw/impl/ui_v3/send/confirmation/CryptoSendConfirmationControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoSendConfirmationControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CryptoSendConfirmationControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoAddress f71313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f71314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FiatCryptoMoney f71315c;
    public final FundingSource d;
    public final b e;
    public final FiatCryptoMoney f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CryptoWithdrawLimits f71316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CryptoAddressCounterparty f71317h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CryptoSendConfirmationControllerContract$InputData((CryptoAddress) parcel.readParcelable(CryptoSendConfirmationControllerContract$InputData.class.getClassLoader()), parcel.readInt() != 0, (FiatCryptoMoney) parcel.readParcelable(CryptoSendConfirmationControllerContract$InputData.class.getClassLoader()), (FundingSource) parcel.readParcelable(CryptoSendConfirmationControllerContract$InputData.class.getClassLoader()), (b) parcel.readSerializable(), (FiatCryptoMoney) parcel.readParcelable(CryptoSendConfirmationControllerContract$InputData.class.getClassLoader()), (CryptoWithdrawLimits) parcel.readParcelable(CryptoSendConfirmationControllerContract$InputData.class.getClassLoader()), (CryptoAddressCounterparty) parcel.readParcelable(CryptoSendConfirmationControllerContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoSendConfirmationControllerContract$InputData[i];
        }
    }

    public CryptoSendConfirmationControllerContract$InputData(CryptoAddress beneficiary, boolean z, FiatCryptoMoney sourcePocketBalance, FundingSource fundingSource, b sourceCurrency, FiatCryptoMoney recipientTargetAmount, CryptoWithdrawLimits withdrawLimits, CryptoAddressCounterparty recipientPreCheckResult) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(sourcePocketBalance, "sourcePocketBalance");
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(recipientTargetAmount, "recipientTargetAmount");
        Intrinsics.checkNotNullParameter(withdrawLimits, "withdrawLimits");
        Intrinsics.checkNotNullParameter(recipientPreCheckResult, "recipientPreCheckResult");
        this.f71313a = beneficiary;
        this.f71314b = z;
        this.f71315c = sourcePocketBalance;
        this.d = fundingSource;
        this.e = sourceCurrency;
        this.f = recipientTargetAmount;
        this.f71316g = withdrawLimits;
        this.f71317h = recipientPreCheckResult;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoSendConfirmationControllerContract$InputData)) {
            return false;
        }
        CryptoSendConfirmationControllerContract$InputData cryptoSendConfirmationControllerContract$InputData = (CryptoSendConfirmationControllerContract$InputData) obj2;
        return Intrinsics.f(this.f71313a, cryptoSendConfirmationControllerContract$InputData.f71313a) && this.f71314b == cryptoSendConfirmationControllerContract$InputData.f71314b && Intrinsics.f(this.f71315c, cryptoSendConfirmationControllerContract$InputData.f71315c) && Intrinsics.f(this.d, cryptoSendConfirmationControllerContract$InputData.d) && Intrinsics.f(this.e, cryptoSendConfirmationControllerContract$InputData.e) && Intrinsics.f(this.f, cryptoSendConfirmationControllerContract$InputData.f) && Intrinsics.f(this.f71316g, cryptoSendConfirmationControllerContract$InputData.f71316g) && Intrinsics.f(this.f71317h, cryptoSendConfirmationControllerContract$InputData.f71317h);
    }

    public final int hashCode() {
        return this.f71317h.hashCode() + ((this.f71316g.hashCode() + ((this.f.hashCode() + l.j(this.e, (this.d.hashCode() + ((this.f71315c.hashCode() + j6.a.c(this.f71313a.hashCode() * 31, 31, this.f71314b)) * 31)) * 31, 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f71313a, i);
        dest.writeInt(this.f71314b ? 1 : 0);
        dest.writeParcelable(this.f71315c, i);
        dest.writeParcelable(this.d, i);
        dest.writeSerializable(this.e);
        dest.writeParcelable(this.f, i);
        dest.writeParcelable(this.f71316g, i);
        dest.writeParcelable(this.f71317h, i);
    }
}

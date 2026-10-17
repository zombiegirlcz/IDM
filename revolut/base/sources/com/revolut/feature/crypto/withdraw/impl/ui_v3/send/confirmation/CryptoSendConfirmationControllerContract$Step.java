package com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawFeesBreakdown;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawLimits;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/crypto/withdraw/impl/ui_v3/send/confirmation/CryptoSendConfirmationControllerContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Fees", "RemainingLimit", "CrossCurrencyPrice", "FeeBreakdown", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/send/confirmation/CryptoSendConfirmationControllerContract$Step$CrossCurrencyPrice;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/send/confirmation/CryptoSendConfirmationControllerContract$Step$FeeBreakdown;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/send/confirmation/CryptoSendConfirmationControllerContract$Step$Fees;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/send/confirmation/CryptoSendConfirmationControllerContract$Step$RemainingLimit;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CryptoSendConfirmationControllerContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/send/confirmation/CryptoSendConfirmationControllerContract$Step$CrossCurrencyPrice;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/send/confirmation/CryptoSendConfirmationControllerContract$Step;", "<init>", "()V", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CrossCurrencyPrice implements CryptoSendConfirmationControllerContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrossCurrencyPrice f71318a = new CrossCurrencyPrice();

        @NotNull
        public static final Parcelable.Creator<CrossCurrencyPrice> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CrossCurrencyPrice.f71318a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CrossCurrencyPrice[i];
            }
        }

        private CrossCurrencyPrice() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/send/confirmation/CryptoSendConfirmationControllerContract$Step$FeeBreakdown;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/send/confirmation/CryptoSendConfirmationControllerContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FeeBreakdown implements CryptoSendConfirmationControllerContract$Step {

        @NotNull
        public static final Parcelable.Creator<FeeBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CryptoWithdrawFeesBreakdown f71319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n9l.a f71320b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FeeBreakdown((CryptoWithdrawFeesBreakdown) parcel.readParcelable(FeeBreakdown.class.getClassLoader()), (n9l.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FeeBreakdown[i];
            }
        }

        public FeeBreakdown(CryptoWithdrawFeesBreakdown fees, n9l.a aVar) {
            Intrinsics.checkNotNullParameter(fees, "fees");
            this.f71319a = fees;
            this.f71320b = aVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FeeBreakdown)) {
                return false;
            }
            FeeBreakdown feeBreakdown = (FeeBreakdown) obj2;
            return Intrinsics.f(this.f71319a, feeBreakdown.f71319a) && Intrinsics.f(this.f71320b, feeBreakdown.f71320b);
        }

        public final int hashCode() {
            int iHashCode = this.f71319a.hashCode() * 31;
            n9l.a aVar = this.f71320b;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f71319a, i);
            dest.writeSerializable(this.f71320b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/send/confirmation/CryptoSendConfirmationControllerContract$Step$Fees;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/send/confirmation/CryptoSendConfirmationControllerContract$Step;", "<init>", "()V", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Fees implements CryptoSendConfirmationControllerContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Fees f71321a = new Fees();

        @NotNull
        public static final Parcelable.Creator<Fees> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Fees.f71321a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Fees[i];
            }
        }

        private Fees() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/send/confirmation/CryptoSendConfirmationControllerContract$Step$RemainingLimit;", "Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/send/confirmation/CryptoSendConfirmationControllerContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RemainingLimit implements CryptoSendConfirmationControllerContract$Step {

        @NotNull
        public static final Parcelable.Creator<RemainingLimit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CryptoWithdrawLimits f71322a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RemainingLimit((CryptoWithdrawLimits) parcel.readParcelable(RemainingLimit.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RemainingLimit[i];
            }
        }

        public RemainingLimit(CryptoWithdrawLimits limits) {
            Intrinsics.checkNotNullParameter(limits, "limits");
            this.f71322a = limits;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RemainingLimit) && Intrinsics.f(this.f71322a, ((RemainingLimit) obj2).f71322a);
        }

        public final int hashCode() {
            return this.f71322a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f71322a, i);
        }
    }
}

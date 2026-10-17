package com.revolut.feature_move_money.impl.flow.delegate;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.security_hub.api.models.WalletBalanceLimit;
import com.revolut.feature.transfer.models.quotes.TransferAvailabilityReason;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z7i.l;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"com/revolut/feature_move_money/impl/flow/delegate/ValidationResult$ConfirmationModalRequired", "Lz7i/l;", "Landroid/os/Parcelable;", "SavingsChallengeWithdrawConfirmationRequired", "KillSwitchConfirmationRequired", "CfdMarginCallRiskIncrease", "WalletBalanceLimitExceeded", "Lcom/revolut/feature_move_money/impl/flow/delegate/ValidationResult$ConfirmationModalRequired$CfdMarginCallRiskIncrease;", "Lcom/revolut/feature_move_money/impl/flow/delegate/ValidationResult$ConfirmationModalRequired$KillSwitchConfirmationRequired;", "Lcom/revolut/feature_move_money/impl/flow/delegate/ValidationResult$ConfirmationModalRequired$SavingsChallengeWithdrawConfirmationRequired;", "Lcom/revolut/feature_move_money/impl/flow/delegate/ValidationResult$ConfirmationModalRequired$WalletBalanceLimitExceeded;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ValidationResult$ConfirmationModalRequired extends l, Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/flow/delegate/ValidationResult$ConfirmationModalRequired$CfdMarginCallRiskIncrease;", "Lcom/revolut/feature_move_money/impl/flow/delegate/ValidationResult$ConfirmationModalRequired;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CfdMarginCallRiskIncrease implements ValidationResult$ConfirmationModalRequired {

        @NotNull
        public static final Parcelable.Creator<CfdMarginCallRiskIncrease> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f97380a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CfdMarginCallRiskIncrease((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CfdMarginCallRiskIncrease[i];
            }
        }

        public CfdMarginCallRiskIncrease(d amount) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            this.f97380a = amount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CfdMarginCallRiskIncrease) && Intrinsics.f(this.f97380a, ((CfdMarginCallRiskIncrease) obj2).f97380a);
        }

        public final int hashCode() {
            return this.f97380a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f97380a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature_move_money/impl/flow/delegate/ValidationResult$ConfirmationModalRequired$KillSwitchConfirmationRequired;", "Lcom/revolut/feature_move_money/impl/flow/delegate/ValidationResult$ConfirmationModalRequired;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature_move_money/impl/flow/delegate/b", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class KillSwitchConfirmationRequired implements ValidationResult$ConfirmationModalRequired {

        @NotNull
        public static final Parcelable.Creator<KillSwitchConfirmationRequired> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransferAvailabilityReason f97381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f97382b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new KillSwitchConfirmationRequired((TransferAvailabilityReason) parcel.readParcelable(KillSwitchConfirmationRequired.class.getClassLoader()), b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new KillSwitchConfirmationRequired[i];
            }
        }

        public KillSwitchConfirmationRequired(TransferAvailabilityReason reason, b variant) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(variant, "variant");
            this.f97381a = reason;
            this.f97382b = variant;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof KillSwitchConfirmationRequired)) {
                return false;
            }
            KillSwitchConfirmationRequired killSwitchConfirmationRequired = (KillSwitchConfirmationRequired) obj2;
            return Intrinsics.f(this.f97381a, killSwitchConfirmationRequired.f97381a) && this.f97382b == killSwitchConfirmationRequired.f97382b;
        }

        public final int hashCode() {
            return this.f97382b.hashCode() + (this.f97381a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97381a, i);
            dest.writeString(this.f97382b.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_move_money/impl/flow/delegate/ValidationResult$ConfirmationModalRequired$SavingsChallengeWithdrawConfirmationRequired;", "Lcom/revolut/feature_move_money/impl/flow/delegate/ValidationResult$ConfirmationModalRequired;", "<init>", "()V", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SavingsChallengeWithdrawConfirmationRequired implements ValidationResult$ConfirmationModalRequired {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SavingsChallengeWithdrawConfirmationRequired f97383a = new SavingsChallengeWithdrawConfirmationRequired();

        @NotNull
        public static final Parcelable.Creator<SavingsChallengeWithdrawConfirmationRequired> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SavingsChallengeWithdrawConfirmationRequired.f97383a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavingsChallengeWithdrawConfirmationRequired[i];
            }
        }

        private SavingsChallengeWithdrawConfirmationRequired() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/flow/delegate/ValidationResult$ConfirmationModalRequired$WalletBalanceLimitExceeded;", "Lcom/revolut/feature_move_money/impl/flow/delegate/ValidationResult$ConfirmationModalRequired;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WalletBalanceLimitExceeded implements ValidationResult$ConfirmationModalRequired {

        @NotNull
        public static final Parcelable.Creator<WalletBalanceLimitExceeded> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WalletBalanceLimit f97384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f97385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f97386c;
        public final d d;
        public final d e;
        public final Clause f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WalletBalanceLimitExceeded((WalletBalanceLimit) parcel.readParcelable(WalletBalanceLimitExceeded.class.getClassLoader()), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), (Clause) parcel.readParcelable(WalletBalanceLimitExceeded.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WalletBalanceLimitExceeded[i];
            }
        }

        public WalletBalanceLimitExceeded(WalletBalanceLimit limit, d dVar, d remainingInDestinationCurrency, d currentValueInDestinationCurrency, d maxValueInDestinationCurrency, Clause targetAccountTitle) {
            Intrinsics.checkNotNullParameter(limit, "limit");
            Intrinsics.checkNotNullParameter(remainingInDestinationCurrency, "remainingInDestinationCurrency");
            Intrinsics.checkNotNullParameter(currentValueInDestinationCurrency, "currentValueInDestinationCurrency");
            Intrinsics.checkNotNullParameter(maxValueInDestinationCurrency, "maxValueInDestinationCurrency");
            Intrinsics.checkNotNullParameter(targetAccountTitle, "targetAccountTitle");
            this.f97384a = limit;
            this.f97385b = dVar;
            this.f97386c = remainingInDestinationCurrency;
            this.d = currentValueInDestinationCurrency;
            this.e = maxValueInDestinationCurrency;
            this.f = targetAccountTitle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WalletBalanceLimitExceeded)) {
                return false;
            }
            WalletBalanceLimitExceeded walletBalanceLimitExceeded = (WalletBalanceLimitExceeded) obj2;
            return Intrinsics.f(this.f97384a, walletBalanceLimitExceeded.f97384a) && Intrinsics.f(this.f97385b, walletBalanceLimitExceeded.f97385b) && Intrinsics.f(this.f97386c, walletBalanceLimitExceeded.f97386c) && Intrinsics.f(this.d, walletBalanceLimitExceeded.d) && Intrinsics.f(this.e, walletBalanceLimitExceeded.e) && Intrinsics.f(this.f, walletBalanceLimitExceeded.f);
        }

        public final int hashCode() {
            int iHashCode = this.f97384a.hashCode() * 31;
            d dVar = this.f97385b;
            return this.f.hashCode() + v7.c(v7.c(v7.c((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f97386c), 31, this.d), 31, this.e);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f97384a, i);
            dest.writeSerializable(this.f97385b);
            dest.writeSerializable(this.f97386c);
            dest.writeSerializable(this.d);
            dest.writeSerializable(this.e);
            dest.writeParcelable(this.f, i);
        }
    }
}

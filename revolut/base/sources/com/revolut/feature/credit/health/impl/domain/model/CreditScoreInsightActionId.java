package com.revolut.feature.credit.health.impl.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0012\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0082\u0001\u0012\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId;", "Landroid/os/Parcelable;", "UpdateLocalPhoneNumber", "ApplySecuredCreditCard", "CheckCreditBureauData", "PayDownBalancesEarly", "SwitchSalaryToRevolut", "UpdateId", "CompleteRepayment", "CloseUnusedCreditCards", "CloseUnusedCreditAccounts", "UseRevolutBudgetingTools", "KeepFixedDebtsLow", "SettleOverdueBalances", "StayUnderUtilisation", "WaitBeforeApplying", "ReduceMonthlySpending", "IncreaseSavings", "LowerMonthlyDebtRepayments", "MaintainSavings", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$ApplySecuredCreditCard;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$CheckCreditBureauData;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$CloseUnusedCreditAccounts;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$CloseUnusedCreditCards;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$CompleteRepayment;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$IncreaseSavings;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$KeepFixedDebtsLow;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$LowerMonthlyDebtRepayments;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$MaintainSavings;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$PayDownBalancesEarly;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$ReduceMonthlySpending;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$SettleOverdueBalances;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$StayUnderUtilisation;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$SwitchSalaryToRevolut;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$UpdateId;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$UpdateLocalPhoneNumber;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$UseRevolutBudgetingTools;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$WaitBeforeApplying;", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditScoreInsightActionId extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$ApplySecuredCreditCard;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId;", "<init>", "()V", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ApplySecuredCreditCard implements CreditScoreInsightActionId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApplySecuredCreditCard f69967a = new ApplySecuredCreditCard();

        @NotNull
        public static final Parcelable.Creator<ApplySecuredCreditCard> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ApplySecuredCreditCard.f69967a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApplySecuredCreditCard[i];
            }
        }

        private ApplySecuredCreditCard() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$CheckCreditBureauData;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId;", "<init>", "()V", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CheckCreditBureauData implements CreditScoreInsightActionId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CheckCreditBureauData f69968a = new CheckCreditBureauData();

        @NotNull
        public static final Parcelable.Creator<CheckCreditBureauData> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CheckCreditBureauData.f69968a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CheckCreditBureauData[i];
            }
        }

        private CheckCreditBureauData() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$CloseUnusedCreditAccounts;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId;", "<init>", "()V", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CloseUnusedCreditAccounts implements CreditScoreInsightActionId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CloseUnusedCreditAccounts f69969a = new CloseUnusedCreditAccounts();

        @NotNull
        public static final Parcelable.Creator<CloseUnusedCreditAccounts> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CloseUnusedCreditAccounts.f69969a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CloseUnusedCreditAccounts[i];
            }
        }

        private CloseUnusedCreditAccounts() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$CloseUnusedCreditCards;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId;", "<init>", "()V", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CloseUnusedCreditCards implements CreditScoreInsightActionId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CloseUnusedCreditCards f69970a = new CloseUnusedCreditCards();

        @NotNull
        public static final Parcelable.Creator<CloseUnusedCreditCards> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CloseUnusedCreditCards.f69970a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CloseUnusedCreditCards[i];
            }
        }

        private CloseUnusedCreditCards() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$CompleteRepayment;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId;", "<init>", "()V", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CompleteRepayment implements CreditScoreInsightActionId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CompleteRepayment f69971a = new CompleteRepayment();

        @NotNull
        public static final Parcelable.Creator<CompleteRepayment> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CompleteRepayment.f69971a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CompleteRepayment[i];
            }
        }

        private CompleteRepayment() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$IncreaseSavings;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId;", "", "toString", "()Ljava/lang/String;", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IncreaseSavings implements CreditScoreInsightActionId {

        @NotNull
        public static final Parcelable.Creator<IncreaseSavings> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f69972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f69973b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IncreaseSavings(parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IncreaseSavings[i];
            }
        }

        public IncreaseSavings(int i, int i2) {
            this.f69972a = i;
            this.f69973b = i2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof IncreaseSavings)) {
                return false;
            }
            IncreaseSavings increaseSavings = (IncreaseSavings) obj2;
            return this.f69972a == increaseSavings.f69972a && this.f69973b == increaseSavings.f69973b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f69973b) + (Integer.hashCode(this.f69972a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f69972a);
            dest.writeInt(this.f69973b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$KeepFixedDebtsLow;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId;", "<init>", "()V", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class KeepFixedDebtsLow implements CreditScoreInsightActionId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final KeepFixedDebtsLow f69974a = new KeepFixedDebtsLow();

        @NotNull
        public static final Parcelable.Creator<KeepFixedDebtsLow> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return KeepFixedDebtsLow.f69974a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new KeepFixedDebtsLow[i];
            }
        }

        private KeepFixedDebtsLow() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$LowerMonthlyDebtRepayments;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId;", "", "toString", "()Ljava/lang/String;", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LowerMonthlyDebtRepayments implements CreditScoreInsightActionId {

        @NotNull
        public static final Parcelable.Creator<LowerMonthlyDebtRepayments> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f69975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f69976b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LowerMonthlyDebtRepayments(parcel.readDouble(), parcel.readDouble());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LowerMonthlyDebtRepayments[i];
            }
        }

        public LowerMonthlyDebtRepayments(double d, double d5) {
            this.f69975a = d;
            this.f69976b = d5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LowerMonthlyDebtRepayments)) {
                return false;
            }
            LowerMonthlyDebtRepayments lowerMonthlyDebtRepayments = (LowerMonthlyDebtRepayments) obj2;
            return Double.compare(this.f69975a, lowerMonthlyDebtRepayments.f69975a) == 0 && Double.compare(this.f69976b, lowerMonthlyDebtRepayments.f69976b) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f69976b) + (Double.hashCode(this.f69975a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeDouble(this.f69975a);
            dest.writeDouble(this.f69976b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$MaintainSavings;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId;", "", "toString", "()Ljava/lang/String;", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MaintainSavings implements CreditScoreInsightActionId {

        @NotNull
        public static final Parcelable.Creator<MaintainSavings> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f69977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f69978b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MaintainSavings(parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MaintainSavings[i];
            }
        }

        public MaintainSavings(int i, int i2) {
            this.f69977a = i;
            this.f69978b = i2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MaintainSavings)) {
                return false;
            }
            MaintainSavings maintainSavings = (MaintainSavings) obj2;
            return this.f69977a == maintainSavings.f69977a && this.f69978b == maintainSavings.f69978b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f69978b) + (Integer.hashCode(this.f69977a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f69977a);
            dest.writeInt(this.f69978b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$PayDownBalancesEarly;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId;", "<init>", "()V", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PayDownBalancesEarly implements CreditScoreInsightActionId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PayDownBalancesEarly f69979a = new PayDownBalancesEarly();

        @NotNull
        public static final Parcelable.Creator<PayDownBalancesEarly> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PayDownBalancesEarly.f69979a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PayDownBalancesEarly[i];
            }
        }

        private PayDownBalancesEarly() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$ReduceMonthlySpending;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId;", "", "toString", "()Ljava/lang/String;", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReduceMonthlySpending implements CreditScoreInsightActionId {

        @NotNull
        public static final Parcelable.Creator<ReduceMonthlySpending> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f69980a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReduceMonthlySpending(parcel.readDouble());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReduceMonthlySpending[i];
            }
        }

        public ReduceMonthlySpending(double d) {
            this.f69980a = d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ReduceMonthlySpending) && Double.compare(this.f69980a, ((ReduceMonthlySpending) obj2).f69980a) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f69980a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeDouble(this.f69980a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$SettleOverdueBalances;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId;", "", "toString", "()Ljava/lang/String;", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SettleOverdueBalances implements CreditScoreInsightActionId {

        @NotNull
        public static final Parcelable.Creator<SettleOverdueBalances> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f69981a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SettleOverdueBalances(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SettleOverdueBalances[i];
            }
        }

        public SettleOverdueBalances(int i) {
            this.f69981a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SettleOverdueBalances) && this.f69981a == ((SettleOverdueBalances) obj2).f69981a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f69981a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f69981a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$StayUnderUtilisation;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId;", "", "toString", "()Ljava/lang/String;", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StayUnderUtilisation implements CreditScoreInsightActionId {

        @NotNull
        public static final Parcelable.Creator<StayUnderUtilisation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f69982a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StayUnderUtilisation(parcel.readDouble());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StayUnderUtilisation[i];
            }
        }

        public StayUnderUtilisation(double d) {
            this.f69982a = d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StayUnderUtilisation) && Double.compare(this.f69982a, ((StayUnderUtilisation) obj2).f69982a) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f69982a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeDouble(this.f69982a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$SwitchSalaryToRevolut;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId;", "<init>", "()V", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SwitchSalaryToRevolut implements CreditScoreInsightActionId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SwitchSalaryToRevolut f69983a = new SwitchSalaryToRevolut();

        @NotNull
        public static final Parcelable.Creator<SwitchSalaryToRevolut> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SwitchSalaryToRevolut.f69983a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SwitchSalaryToRevolut[i];
            }
        }

        private SwitchSalaryToRevolut() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$UpdateId;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId;", "<init>", "()V", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UpdateId implements CreditScoreInsightActionId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UpdateId f69984a = new UpdateId();

        @NotNull
        public static final Parcelable.Creator<UpdateId> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UpdateId.f69984a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpdateId[i];
            }
        }

        private UpdateId() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$UpdateLocalPhoneNumber;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId;", "<init>", "()V", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UpdateLocalPhoneNumber implements CreditScoreInsightActionId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UpdateLocalPhoneNumber f69985a = new UpdateLocalPhoneNumber();

        @NotNull
        public static final Parcelable.Creator<UpdateLocalPhoneNumber> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UpdateLocalPhoneNumber.f69985a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpdateLocalPhoneNumber[i];
            }
        }

        private UpdateLocalPhoneNumber() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$UseRevolutBudgetingTools;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId;", "<init>", "()V", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UseRevolutBudgetingTools implements CreditScoreInsightActionId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UseRevolutBudgetingTools f69986a = new UseRevolutBudgetingTools();

        @NotNull
        public static final Parcelable.Creator<UseRevolutBudgetingTools> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UseRevolutBudgetingTools.f69986a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UseRevolutBudgetingTools[i];
            }
        }

        private UseRevolutBudgetingTools() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId$WaitBeforeApplying;", "Lcom/revolut/feature/credit/health/impl/domain/model/CreditScoreInsightActionId;", "", "toString", "()Ljava/lang/String;", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WaitBeforeApplying implements CreditScoreInsightActionId {

        @NotNull
        public static final Parcelable.Creator<WaitBeforeApplying> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f69987a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WaitBeforeApplying(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WaitBeforeApplying[i];
            }
        }

        public WaitBeforeApplying(int i) {
            this.f69987a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof WaitBeforeApplying) && this.f69987a == ((WaitBeforeApplying) obj2).f69987a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f69987a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f69987a);
        }
    }
}

package com.revolut.feature.credit.loan.impl.ui.rev10.accountdetails;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.loan.api.mapper.LoanInterestRateTypeInfo;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanStampDuty;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/loan/impl/ui/rev10/accountdetails/LoanAccountDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "RepaymentAmountExplainer", "RepaymentStampDutyExplainer", "RepaymentDayExplainer", "LoanStateExplainer", "FundsAvailableExplainer", "HowRepaymentWorksExplainer", "InterestRateTypeExplainer", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/accountdetails/LoanAccountDetailsScreenContract$ModalStep$FundsAvailableExplainer;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/accountdetails/LoanAccountDetailsScreenContract$ModalStep$HowRepaymentWorksExplainer;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/accountdetails/LoanAccountDetailsScreenContract$ModalStep$InterestRateTypeExplainer;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/accountdetails/LoanAccountDetailsScreenContract$ModalStep$LoanStateExplainer;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/accountdetails/LoanAccountDetailsScreenContract$ModalStep$RepaymentAmountExplainer;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/accountdetails/LoanAccountDetailsScreenContract$ModalStep$RepaymentDayExplainer;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/accountdetails/LoanAccountDetailsScreenContract$ModalStep$RepaymentStampDutyExplainer;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LoanAccountDetailsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/accountdetails/LoanAccountDetailsScreenContract$ModalStep$FundsAvailableExplainer;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/accountdetails/LoanAccountDetailsScreenContract$ModalStep;", "<init>", "()V", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FundsAvailableExplainer implements LoanAccountDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FundsAvailableExplainer f70344a = new FundsAvailableExplainer();

        @NotNull
        public static final Parcelable.Creator<FundsAvailableExplainer> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FundsAvailableExplainer.f70344a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FundsAvailableExplainer[i];
            }
        }

        private FundsAvailableExplainer() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/accountdetails/LoanAccountDetailsScreenContract$ModalStep$HowRepaymentWorksExplainer;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/accountdetails/LoanAccountDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HowRepaymentWorksExplainer implements LoanAccountDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<HowRepaymentWorksExplainer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f70345a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HowRepaymentWorksExplainer(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HowRepaymentWorksExplainer[i];
            }
        }

        public HowRepaymentWorksExplainer(boolean z) {
            this.f70345a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof HowRepaymentWorksExplainer) && this.f70345a == ((HowRepaymentWorksExplainer) obj2).f70345a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f70345a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f70345a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/accountdetails/LoanAccountDetailsScreenContract$ModalStep$InterestRateTypeExplainer;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/accountdetails/LoanAccountDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InterestRateTypeExplainer implements LoanAccountDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<InterestRateTypeExplainer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LoanInterestRateTypeInfo f70346a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InterestRateTypeExplainer((LoanInterestRateTypeInfo) parcel.readParcelable(InterestRateTypeExplainer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InterestRateTypeExplainer[i];
            }
        }

        public InterestRateTypeExplainer(LoanInterestRateTypeInfo rate) {
            Intrinsics.checkNotNullParameter(rate, "rate");
            this.f70346a = rate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InterestRateTypeExplainer) && Intrinsics.f(this.f70346a, ((InterestRateTypeExplainer) obj2).f70346a);
        }

        public final int hashCode() {
            return this.f70346a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f70346a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/accountdetails/LoanAccountDetailsScreenContract$ModalStep$LoanStateExplainer;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/accountdetails/LoanAccountDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LoanStateExplainer implements LoanAccountDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<LoanStateExplainer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Loan f70347a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LoanStateExplainer((Loan) parcel.readParcelable(LoanStateExplainer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LoanStateExplainer[i];
            }
        }

        public LoanStateExplainer(Loan loan) {
            Intrinsics.checkNotNullParameter(loan, "loan");
            this.f70347a = loan;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LoanStateExplainer) && Intrinsics.f(this.f70347a, ((LoanStateExplainer) obj2).f70347a);
        }

        public final int hashCode() {
            return this.f70347a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f70347a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/accountdetails/LoanAccountDetailsScreenContract$ModalStep$RepaymentAmountExplainer;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/accountdetails/LoanAccountDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RepaymentAmountExplainer implements LoanAccountDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RepaymentAmountExplainer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70348a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RepaymentAmountExplainer(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RepaymentAmountExplainer[i];
            }
        }

        public RepaymentAmountExplainer(String listId) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            this.f70348a = listId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RepaymentAmountExplainer) && Intrinsics.f(this.f70348a, ((RepaymentAmountExplainer) obj2).f70348a);
        }

        public final int hashCode() {
            return this.f70348a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70348a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/accountdetails/LoanAccountDetailsScreenContract$ModalStep$RepaymentDayExplainer;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/accountdetails/LoanAccountDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RepaymentDayExplainer implements LoanAccountDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RepaymentDayExplainer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f70349a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RepaymentDayExplainer((LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RepaymentDayExplainer[i];
            }
        }

        public RepaymentDayExplainer(LocalDate firstRepaymentDate) {
            Intrinsics.checkNotNullParameter(firstRepaymentDate, "firstRepaymentDate");
            this.f70349a = firstRepaymentDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RepaymentDayExplainer) && Intrinsics.f(this.f70349a, ((RepaymentDayExplainer) obj2).f70349a);
        }

        public final int hashCode() {
            return this.f70349a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f70349a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/accountdetails/LoanAccountDetailsScreenContract$ModalStep$RepaymentStampDutyExplainer;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/accountdetails/LoanAccountDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RepaymentStampDutyExplainer implements LoanAccountDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RepaymentStampDutyExplainer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LoanStampDuty f70350a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RepaymentStampDutyExplainer((LoanStampDuty) parcel.readParcelable(RepaymentStampDutyExplainer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RepaymentStampDutyExplainer[i];
            }
        }

        public RepaymentStampDutyExplainer(LoanStampDuty stampDuty) {
            Intrinsics.checkNotNullParameter(stampDuty, "stampDuty");
            this.f70350a = stampDuty;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RepaymentStampDutyExplainer) && Intrinsics.f(this.f70350a, ((RepaymentStampDutyExplainer) obj2).f70350a);
        }

        public final int hashCode() {
            return this.f70350a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f70350a, i);
        }
    }
}

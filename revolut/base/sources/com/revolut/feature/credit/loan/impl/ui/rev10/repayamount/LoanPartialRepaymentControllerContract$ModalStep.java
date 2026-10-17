package com.revolut.feature.credit.loan.impl.ui.rev10.repayamount;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import com.revolut.feature.credit.loan.api.models.rev10.LoanStampDuty;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/credit/loan/impl/ui/rev10/repayamount/LoanPartialRepaymentControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Picker", "RepaymentStampDutyExplainer", "LoanStateExplainer", "MonthlyRepaymentReductionExplainer", "FinalRepaymentReductionExplainer", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayamount/LoanPartialRepaymentControllerContract$ModalStep$FinalRepaymentReductionExplainer;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayamount/LoanPartialRepaymentControllerContract$ModalStep$LoanStateExplainer;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayamount/LoanPartialRepaymentControllerContract$ModalStep$MonthlyRepaymentReductionExplainer;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayamount/LoanPartialRepaymentControllerContract$ModalStep$Picker;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayamount/LoanPartialRepaymentControllerContract$ModalStep$RepaymentStampDutyExplainer;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LoanPartialRepaymentControllerContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayamount/LoanPartialRepaymentControllerContract$ModalStep$FinalRepaymentReductionExplainer;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayamount/LoanPartialRepaymentControllerContract$ModalStep;", "<init>", "()V", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FinalRepaymentReductionExplainer implements LoanPartialRepaymentControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FinalRepaymentReductionExplainer f70490a = new FinalRepaymentReductionExplainer();

        @NotNull
        public static final Parcelable.Creator<FinalRepaymentReductionExplainer> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FinalRepaymentReductionExplainer.f70490a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FinalRepaymentReductionExplainer[i];
            }
        }

        private FinalRepaymentReductionExplainer() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayamount/LoanPartialRepaymentControllerContract$ModalStep$LoanStateExplainer;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayamount/LoanPartialRepaymentControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LoanStateExplainer implements LoanPartialRepaymentControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<LoanStateExplainer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Loan f70491a;

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
            this.f70491a = loan;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LoanStateExplainer) && Intrinsics.f(this.f70491a, ((LoanStateExplainer) obj2).f70491a);
        }

        public final int hashCode() {
            return this.f70491a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f70491a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayamount/LoanPartialRepaymentControllerContract$ModalStep$MonthlyRepaymentReductionExplainer;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayamount/LoanPartialRepaymentControllerContract$ModalStep;", "<init>", "()V", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MonthlyRepaymentReductionExplainer implements LoanPartialRepaymentControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MonthlyRepaymentReductionExplainer f70492a = new MonthlyRepaymentReductionExplainer();

        @NotNull
        public static final Parcelable.Creator<MonthlyRepaymentReductionExplainer> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MonthlyRepaymentReductionExplainer.f70492a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MonthlyRepaymentReductionExplainer[i];
            }
        }

        private MonthlyRepaymentReductionExplainer() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayamount/LoanPartialRepaymentControllerContract$ModalStep$Picker;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayamount/LoanPartialRepaymentControllerContract$ModalStep;", "<init>", "()V", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Picker implements LoanPartialRepaymentControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Picker f70493a = new Picker();

        @NotNull
        public static final Parcelable.Creator<Picker> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Picker.f70493a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Picker[i];
            }
        }

        private Picker() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayamount/LoanPartialRepaymentControllerContract$ModalStep$RepaymentStampDutyExplainer;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayamount/LoanPartialRepaymentControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RepaymentStampDutyExplainer implements LoanPartialRepaymentControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RepaymentStampDutyExplainer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LoanStampDuty f70494a;

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
            this.f70494a = stampDuty;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RepaymentStampDutyExplainer) && Intrinsics.f(this.f70494a, ((RepaymentStampDutyExplainer) obj2).f70494a);
        }

        public final int hashCode() {
            return this.f70494a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f70494a, i);
        }
    }
}

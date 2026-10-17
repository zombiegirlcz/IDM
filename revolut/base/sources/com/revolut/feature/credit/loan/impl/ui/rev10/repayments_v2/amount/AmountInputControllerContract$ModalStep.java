package com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.amount;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.api.models.rev10.LoanStampDuty;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.LoanRepaymentAccountModelExtension;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/credit/loan/impl/ui/rev10/repayments_v2/amount/AmountInputControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "StrategyPicker", "AccountPicker", "LoanStateExplainer", "RepaymentStampDutyExplainer", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayments_v2/amount/AmountInputControllerContract$ModalStep$AccountPicker;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayments_v2/amount/AmountInputControllerContract$ModalStep$LoanStateExplainer;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayments_v2/amount/AmountInputControllerContract$ModalStep$RepaymentStampDutyExplainer;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayments_v2/amount/AmountInputControllerContract$ModalStep$StrategyPicker;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AmountInputControllerContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayments_v2/amount/AmountInputControllerContract$ModalStep$AccountPicker;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayments_v2/amount/AmountInputControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountPicker implements AmountInputControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AccountPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LoanRepaymentAccountModelExtension.RepaymentAccountState f70548a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountPicker(LoanRepaymentAccountModelExtension.RepaymentAccountState.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountPicker[i];
            }
        }

        public AccountPicker(LoanRepaymentAccountModelExtension.RepaymentAccountState accountState) {
            Intrinsics.checkNotNullParameter(accountState, "accountState");
            this.f70548a = accountState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AccountPicker) && Intrinsics.f(this.f70548a, ((AccountPicker) obj2).f70548a);
        }

        public final int hashCode() {
            return this.f70548a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f70548a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayments_v2/amount/AmountInputControllerContract$ModalStep$LoanStateExplainer;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayments_v2/amount/AmountInputControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LoanStateExplainer implements AmountInputControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<LoanStateExplainer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LoanDetails f70549a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LoanStateExplainer((LoanDetails) parcel.readParcelable(LoanStateExplainer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LoanStateExplainer[i];
            }
        }

        public LoanStateExplainer(LoanDetails loanDetails) {
            Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
            this.f70549a = loanDetails;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LoanStateExplainer) && Intrinsics.f(this.f70549a, ((LoanStateExplainer) obj2).f70549a);
        }

        public final int hashCode() {
            return this.f70549a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f70549a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayments_v2/amount/AmountInputControllerContract$ModalStep$RepaymentStampDutyExplainer;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayments_v2/amount/AmountInputControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RepaymentStampDutyExplainer implements AmountInputControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RepaymentStampDutyExplainer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LoanStampDuty f70550a;

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
            this.f70550a = stampDuty;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RepaymentStampDutyExplainer) && Intrinsics.f(this.f70550a, ((RepaymentStampDutyExplainer) obj2).f70550a);
        }

        public final int hashCode() {
            return this.f70550a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f70550a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayments_v2/amount/AmountInputControllerContract$ModalStep$StrategyPicker;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayments_v2/amount/AmountInputControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StrategyPicker implements AmountInputControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<StrategyPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f70551a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(StrategyPicker.class, parcel, arrayList, iE, 1);
                }
                return new StrategyPicker(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StrategyPicker[i];
            }
        }

        public StrategyPicker(List availableStrategies) {
            Intrinsics.checkNotNullParameter(availableStrategies, "availableStrategies");
            this.f70551a = availableStrategies;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StrategyPicker) && this.f70551a.equals(((StrategyPicker) obj2).f70551a);
        }

        public final int hashCode() {
            return this.f70551a.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            ?? r06 = this.f70551a;
            dest.writeInt(r06.size());
            Iterator it8 = r06.iterator();
            while (it8.hasNext()) {
                dest.writeParcelable((Parcelable) it8.next(), i);
            }
        }
    }
}

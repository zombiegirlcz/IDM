package com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.loan.api.models.LoanRepaymentAccountData;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q35.g0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/credit/loan/impl/ui/rev10/repayments_v2/LoanRepaymentFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ChooseAmount", "ConfirmPayment", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayments_v2/LoanRepaymentFlowContract$Step$ChooseAmount;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayments_v2/LoanRepaymentFlowContract$Step$ConfirmPayment;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LoanRepaymentFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayments_v2/LoanRepaymentFlowContract$Step$ChooseAmount;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayments_v2/LoanRepaymentFlowContract$Step;", "<init>", "()V", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChooseAmount extends LoanRepaymentFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ChooseAmount f70539a = new ChooseAmount();

        @NotNull
        public static final Parcelable.Creator<ChooseAmount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChooseAmount.f70539a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChooseAmount[i];
            }
        }

        private ChooseAmount() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayments_v2/LoanRepaymentFlowContract$Step$ConfirmPayment;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayments_v2/LoanRepaymentFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConfirmPayment extends LoanRepaymentFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ConfirmPayment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f70540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g0 f70541b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LoanRepaymentAccountData f70542c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConfirmPayment((LoanRepaymentAccountData) parcel.readParcelable(ConfirmPayment.class.getClassLoader()), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : g0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmPayment[i];
            }
        }

        public ConfirmPayment(LoanRepaymentAccountData loanRepaymentAccountData, d amount, g0 g0Var) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            this.f70540a = amount;
            this.f70541b = g0Var;
            this.f70542c = loanRepaymentAccountData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ConfirmPayment)) {
                return false;
            }
            ConfirmPayment confirmPayment = (ConfirmPayment) obj2;
            return Intrinsics.f(this.f70540a, confirmPayment.f70540a) && this.f70541b == confirmPayment.f70541b && Intrinsics.f(this.f70542c, confirmPayment.f70542c);
        }

        public final int hashCode() {
            int iHashCode = this.f70540a.hashCode() * 31;
            g0 g0Var = this.f70541b;
            int iHashCode2 = (iHashCode + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
            LoanRepaymentAccountData loanRepaymentAccountData = this.f70542c;
            return iHashCode2 + (loanRepaymentAccountData != null ? loanRepaymentAccountData.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f70540a);
            g0 g0Var = this.f70541b;
            if (g0Var == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(g0Var.name());
            }
            dest.writeParcelable(this.f70542c, i);
        }
    }

    private LoanRepaymentFlowContract$Step() {
    }
}

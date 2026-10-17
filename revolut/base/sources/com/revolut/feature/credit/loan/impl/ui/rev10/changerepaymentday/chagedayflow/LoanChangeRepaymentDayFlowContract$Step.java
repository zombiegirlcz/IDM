package com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.chagedayflow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/credit/loan/impl/ui/rev10/changerepaymentday/chagedayflow/LoanChangeRepaymentDayFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "SelectNewRepaymentDay", "SelectNewRepaymentDayV2", "ConfirmNewRepaymentDay", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/changerepaymentday/chagedayflow/LoanChangeRepaymentDayFlowContract$Step$ConfirmNewRepaymentDay;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/changerepaymentday/chagedayflow/LoanChangeRepaymentDayFlowContract$Step$SelectNewRepaymentDay;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/changerepaymentday/chagedayflow/LoanChangeRepaymentDayFlowContract$Step$SelectNewRepaymentDayV2;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LoanChangeRepaymentDayFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/changerepaymentday/chagedayflow/LoanChangeRepaymentDayFlowContract$Step$ConfirmNewRepaymentDay;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/changerepaymentday/chagedayflow/LoanChangeRepaymentDayFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConfirmNewRepaymentDay extends LoanChangeRepaymentDayFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ConfirmNewRepaymentDay> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f70390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wi0.b f70391b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConfirmNewRepaymentDay(parcel.readInt(), (wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmNewRepaymentDay[i];
            }
        }

        public ConfirmNewRepaymentDay(int i, wi0.b countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f70390a = i;
            this.f70391b = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ConfirmNewRepaymentDay)) {
                return false;
            }
            ConfirmNewRepaymentDay confirmNewRepaymentDay = (ConfirmNewRepaymentDay) obj2;
            return this.f70390a == confirmNewRepaymentDay.f70390a && Intrinsics.f(this.f70391b, confirmNewRepaymentDay.f70391b);
        }

        public final int hashCode() {
            return this.f70391b.f297794a.hashCode() + (Integer.hashCode(this.f70390a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f70390a);
            dest.writeSerializable(this.f70391b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/changerepaymentday/chagedayflow/LoanChangeRepaymentDayFlowContract$Step$SelectNewRepaymentDay;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/changerepaymentday/chagedayflow/LoanChangeRepaymentDayFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectNewRepaymentDay extends LoanChangeRepaymentDayFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SelectNewRepaymentDay> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LoanDetails f70392a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectNewRepaymentDay((LoanDetails) parcel.readParcelable(SelectNewRepaymentDay.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectNewRepaymentDay[i];
            }
        }

        public SelectNewRepaymentDay(LoanDetails loanDetails) {
            Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
            this.f70392a = loanDetails;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SelectNewRepaymentDay) && Intrinsics.f(this.f70392a, ((SelectNewRepaymentDay) obj2).f70392a);
        }

        public final int hashCode() {
            return this.f70392a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f70392a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/changerepaymentday/chagedayflow/LoanChangeRepaymentDayFlowContract$Step$SelectNewRepaymentDayV2;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/changerepaymentday/chagedayflow/LoanChangeRepaymentDayFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectNewRepaymentDayV2 extends LoanChangeRepaymentDayFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SelectNewRepaymentDayV2> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LoanDetails f70393a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectNewRepaymentDayV2((LoanDetails) parcel.readParcelable(SelectNewRepaymentDayV2.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectNewRepaymentDayV2[i];
            }
        }

        public SelectNewRepaymentDayV2(LoanDetails loanDetails) {
            Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
            this.f70393a = loanDetails;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SelectNewRepaymentDayV2) && Intrinsics.f(this.f70393a, ((SelectNewRepaymentDayV2) obj2).f70393a);
        }

        public final int hashCode() {
            return this.f70393a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f70393a, i);
        }
    }

    private LoanChangeRepaymentDayFlowContract$Step() {
    }
}

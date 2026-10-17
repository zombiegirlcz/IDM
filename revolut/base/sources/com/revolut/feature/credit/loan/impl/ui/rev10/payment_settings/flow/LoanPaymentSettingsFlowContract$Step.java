package com.revolut.feature.credit.loan.impl.ui.rev10.payment_settings.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x35.e;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/credit/loan/impl/ui/rev10/payment_settings/flow/LoanPaymentSettingsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Hub", "ChangeAutoPayAccount", "PayWithInfo", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/payment_settings/flow/LoanPaymentSettingsFlowContract$Step$ChangeAutoPayAccount;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/payment_settings/flow/LoanPaymentSettingsFlowContract$Step$Hub;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/payment_settings/flow/LoanPaymentSettingsFlowContract$Step$PayWithInfo;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LoanPaymentSettingsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/payment_settings/flow/LoanPaymentSettingsFlowContract$Step$ChangeAutoPayAccount;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/payment_settings/flow/LoanPaymentSettingsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChangeAutoPayAccount extends LoanPaymentSettingsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ChangeAutoPayAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LoanDetails f70448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f70449b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChangeAutoPayAccount((LoanDetails) parcel.readParcelable(ChangeAutoPayAccount.class.getClassLoader()), (e) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChangeAutoPayAccount[i];
            }
        }

        public ChangeAutoPayAccount(LoanDetails loanDetails, e eVar) {
            Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
            this.f70448a = loanDetails;
            this.f70449b = eVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ChangeAutoPayAccount)) {
                return false;
            }
            ChangeAutoPayAccount changeAutoPayAccount = (ChangeAutoPayAccount) obj2;
            return Intrinsics.f(this.f70448a, changeAutoPayAccount.f70448a) && Intrinsics.f(this.f70449b, changeAutoPayAccount.f70449b);
        }

        public final int hashCode() {
            int iHashCode = this.f70448a.hashCode() * 31;
            e eVar = this.f70449b;
            return iHashCode + (eVar == null ? 0 : eVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f70448a, i);
            dest.writeSerializable(this.f70449b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/payment_settings/flow/LoanPaymentSettingsFlowContract$Step$Hub;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/payment_settings/flow/LoanPaymentSettingsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Hub extends LoanPaymentSettingsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Hub> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70450a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Hub(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Hub[i];
            }
        }

        public Hub(String loanId) {
            Intrinsics.checkNotNullParameter(loanId, "loanId");
            this.f70450a = loanId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Hub) && Intrinsics.f(this.f70450a, ((Hub) obj2).f70450a);
        }

        public final int hashCode() {
            return this.f70450a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70450a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/payment_settings/flow/LoanPaymentSettingsFlowContract$Step$PayWithInfo;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/payment_settings/flow/LoanPaymentSettingsFlowContract$Step;", "<init>", "()V", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PayWithInfo extends LoanPaymentSettingsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PayWithInfo f70451a = new PayWithInfo();

        @NotNull
        public static final Parcelable.Creator<PayWithInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PayWithInfo.f70451a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PayWithInfo[i];
            }
        }

        private PayWithInfo() {
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

    private LoanPaymentSettingsFlowContract$Step() {
    }
}

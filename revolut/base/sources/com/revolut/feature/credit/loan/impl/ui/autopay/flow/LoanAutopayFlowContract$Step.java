package com.revolut.feature.credit.loan.impl.ui.autopay.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/credit/loan/impl/ui/autopay/flow/LoanAutopayFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "AutoPayPrompt", "SelectPaymentMethod", "AddExternalAccount", "ConfirmAutopay", "Lcom/revolut/feature/credit/loan/impl/ui/autopay/flow/LoanAutopayFlowContract$Step$AddExternalAccount;", "Lcom/revolut/feature/credit/loan/impl/ui/autopay/flow/LoanAutopayFlowContract$Step$AutoPayPrompt;", "Lcom/revolut/feature/credit/loan/impl/ui/autopay/flow/LoanAutopayFlowContract$Step$ConfirmAutopay;", "Lcom/revolut/feature/credit/loan/impl/ui/autopay/flow/LoanAutopayFlowContract$Step$SelectPaymentMethod;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LoanAutopayFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/autopay/flow/LoanAutopayFlowContract$Step$AddExternalAccount;", "Lcom/revolut/feature/credit/loan/impl/ui/autopay/flow/LoanAutopayFlowContract$Step;", "<init>", "()V", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddExternalAccount extends LoanAutopayFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddExternalAccount f70317a = new AddExternalAccount();

        @NotNull
        public static final Parcelable.Creator<AddExternalAccount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddExternalAccount.f70317a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddExternalAccount[i];
            }
        }

        private AddExternalAccount() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/autopay/flow/LoanAutopayFlowContract$Step$AutoPayPrompt;", "Lcom/revolut/feature/credit/loan/impl/ui/autopay/flow/LoanAutopayFlowContract$Step;", "<init>", "()V", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AutoPayPrompt extends LoanAutopayFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AutoPayPrompt f70318a = new AutoPayPrompt();

        @NotNull
        public static final Parcelable.Creator<AutoPayPrompt> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AutoPayPrompt.f70318a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AutoPayPrompt[i];
            }
        }

        private AutoPayPrompt() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/autopay/flow/LoanAutopayFlowContract$Step$ConfirmAutopay;", "Lcom/revolut/feature/credit/loan/impl/ui/autopay/flow/LoanAutopayFlowContract$Step;", "<init>", "()V", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ConfirmAutopay extends LoanAutopayFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ConfirmAutopay f70319a = new ConfirmAutopay();

        @NotNull
        public static final Parcelable.Creator<ConfirmAutopay> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ConfirmAutopay.f70319a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmAutopay[i];
            }
        }

        private ConfirmAutopay() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/autopay/flow/LoanAutopayFlowContract$Step$SelectPaymentMethod;", "Lcom/revolut/feature/credit/loan/impl/ui/autopay/flow/LoanAutopayFlowContract$Step;", "<init>", "()V", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectPaymentMethod extends LoanAutopayFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectPaymentMethod f70320a = new SelectPaymentMethod();

        @NotNull
        public static final Parcelable.Creator<SelectPaymentMethod> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectPaymentMethod.f70320a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectPaymentMethod[i];
            }
        }

        private SelectPaymentMethod() {
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

    private LoanAutopayFlowContract$Step() {
    }
}

package com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x35.b;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/loan/impl/ui/rev10/instalmentdetails/LoanInstalmentDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Explainer", "AccountDetails", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/instalmentdetails/LoanInstalmentDetailsScreenContract$ModalStep$AccountDetails;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/instalmentdetails/LoanInstalmentDetailsScreenContract$ModalStep$Explainer;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LoanInstalmentDetailsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/instalmentdetails/LoanInstalmentDetailsScreenContract$ModalStep$AccountDetails;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/instalmentdetails/LoanInstalmentDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountDetails implements LoanInstalmentDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AccountDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f70428a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountDetails((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountDetails[i];
            }
        }

        public AccountDetails(b account) {
            Intrinsics.checkNotNullParameter(account, "account");
            this.f70428a = account;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AccountDetails) && Intrinsics.f(this.f70428a, ((AccountDetails) obj2).f70428a);
        }

        public final int hashCode() {
            return this.f70428a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f70428a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/instalmentdetails/LoanInstalmentDetailsScreenContract$ModalStep$Explainer;", "Lcom/revolut/feature/credit/loan/impl/ui/rev10/instalmentdetails/LoanInstalmentDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Explainer implements LoanInstalmentDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Explainer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LoanPaymentScheduleMapper$ScheduleStep$InfoExplainer f70429a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Explainer(LoanPaymentScheduleMapper$ScheduleStep$InfoExplainer.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Explainer[i];
            }
        }

        public Explainer(LoanPaymentScheduleMapper$ScheduleStep$InfoExplainer info) {
            Intrinsics.checkNotNullParameter(info, "info");
            this.f70429a = info;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Explainer) && Intrinsics.f(this.f70429a, ((Explainer) obj2).f70429a);
        }

        public final int hashCode() {
            return this.f70429a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f70429a.writeToParcel(dest, i);
        }
    }
}

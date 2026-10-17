package com.revolut.feature.credit.loan.impl.ui.direct_debit_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.direct.debit.account_selection.models.AccountSelectionSelectedData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/credit/loan/impl/ui/direct_debit_selection/LoanDirectDebitFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AccountDetails", "AccountSelection", "AccountConfirmation", "NewAccount", "Lcom/revolut/feature/credit/loan/impl/ui/direct_debit_selection/LoanDirectDebitFlowContract$Step$AccountConfirmation;", "Lcom/revolut/feature/credit/loan/impl/ui/direct_debit_selection/LoanDirectDebitFlowContract$Step$AccountDetails;", "Lcom/revolut/feature/credit/loan/impl/ui/direct_debit_selection/LoanDirectDebitFlowContract$Step$AccountSelection;", "Lcom/revolut/feature/credit/loan/impl/ui/direct_debit_selection/LoanDirectDebitFlowContract$Step$NewAccount;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface LoanDirectDebitFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/direct_debit_selection/LoanDirectDebitFlowContract$Step$AccountConfirmation;", "Lcom/revolut/feature/credit/loan/impl/ui/direct_debit_selection/LoanDirectDebitFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountConfirmation implements LoanDirectDebitFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AccountConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccountSelectionSelectedData f70333a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountConfirmation((AccountSelectionSelectedData) parcel.readParcelable(AccountConfirmation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountConfirmation[i];
            }
        }

        public AccountConfirmation(AccountSelectionSelectedData selectedData) {
            Intrinsics.checkNotNullParameter(selectedData, "selectedData");
            this.f70333a = selectedData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AccountConfirmation) && Intrinsics.f(this.f70333a, ((AccountConfirmation) obj2).f70333a);
        }

        public final int hashCode() {
            return this.f70333a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f70333a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/direct_debit_selection/LoanDirectDebitFlowContract$Step$AccountDetails;", "Lcom/revolut/feature/credit/loan/impl/ui/direct_debit_selection/LoanDirectDebitFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountDetails implements LoanDirectDebitFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AccountDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final py4.a f70334a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountDetails((py4.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountDetails[i];
            }
        }

        public AccountDetails(py4.a accountInfo) {
            Intrinsics.checkNotNullParameter(accountInfo, "accountInfo");
            this.f70334a = accountInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AccountDetails) && Intrinsics.f(this.f70334a, ((AccountDetails) obj2).f70334a);
        }

        public final int hashCode() {
            return this.f70334a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f70334a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/direct_debit_selection/LoanDirectDebitFlowContract$Step$AccountSelection;", "Lcom/revolut/feature/credit/loan/impl/ui/direct_debit_selection/LoanDirectDebitFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountSelection implements LoanDirectDebitFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AccountSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70335a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AccountSelection(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountSelection[i];
            }
        }

        public AccountSelection(String facilityId) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            this.f70335a = facilityId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AccountSelection) && Intrinsics.f(this.f70335a, ((AccountSelection) obj2).f70335a);
        }

        public final int hashCode() {
            return this.f70335a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70335a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/direct_debit_selection/LoanDirectDebitFlowContract$Step$NewAccount;", "Lcom/revolut/feature/credit/loan/impl/ui/direct_debit_selection/LoanDirectDebitFlowContract$Step;", "<init>", "()V", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NewAccount implements LoanDirectDebitFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NewAccount f70336a = new NewAccount();

        @NotNull
        public static final Parcelable.Creator<NewAccount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NewAccount.f70336a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewAccount[i];
            }
        }

        private NewAccount() {
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
}

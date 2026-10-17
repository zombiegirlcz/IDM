package com.revolut.feature.credit.application.plugins.impl.ui.direct_debit;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.direct.debit.account_selection.models.AccountSelectionSelectedData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/direct_debit/DirectDebitContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "AccountSelection", "AccountDetails", "NewAccount", "AccountConfirmation", "ProfileAddress", "Lcom/revolut/feature/credit/application/plugins/impl/ui/direct_debit/DirectDebitContract$Step$AccountConfirmation;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/direct_debit/DirectDebitContract$Step$AccountDetails;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/direct_debit/DirectDebitContract$Step$AccountSelection;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/direct_debit/DirectDebitContract$Step$NewAccount;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/direct_debit/DirectDebitContract$Step$ProfileAddress;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DirectDebitContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/direct_debit/DirectDebitContract$Step$AccountConfirmation;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/direct_debit/DirectDebitContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountConfirmation extends DirectDebitContract$Step {

        @NotNull
        public static final Parcelable.Creator<AccountConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccountSelectionSelectedData f67529a;

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
            this.f67529a = selectedData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AccountConfirmation) && Intrinsics.f(this.f67529a, ((AccountConfirmation) obj2).f67529a);
        }

        public final int hashCode() {
            return this.f67529a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f67529a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/direct_debit/DirectDebitContract$Step$AccountDetails;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/direct_debit/DirectDebitContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountDetails extends DirectDebitContract$Step {

        @NotNull
        public static final Parcelable.Creator<AccountDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final py4.a f67530a;

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
            this.f67530a = accountInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AccountDetails) && Intrinsics.f(this.f67530a, ((AccountDetails) obj2).f67530a);
        }

        public final int hashCode() {
            return this.f67530a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67530a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/direct_debit/DirectDebitContract$Step$AccountSelection;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/direct_debit/DirectDebitContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AccountSelection extends DirectDebitContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AccountSelection f67531a = new AccountSelection();

        @NotNull
        public static final Parcelable.Creator<AccountSelection> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AccountSelection.f67531a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountSelection[i];
            }
        }

        private AccountSelection() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/direct_debit/DirectDebitContract$Step$NewAccount;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/direct_debit/DirectDebitContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NewAccount extends DirectDebitContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NewAccount f67532a = new NewAccount();

        @NotNull
        public static final Parcelable.Creator<NewAccount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NewAccount.f67532a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/direct_debit/DirectDebitContract$Step$ProfileAddress;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/direct_debit/DirectDebitContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ProfileAddress extends DirectDebitContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProfileAddress f67533a = new ProfileAddress();

        @NotNull
        public static final Parcelable.Creator<ProfileAddress> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ProfileAddress.f67533a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProfileAddress[i];
            }
        }

        private ProfileAddress() {
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

    private DirectDebitContract$Step() {
    }
}

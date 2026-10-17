package com.revolut.retail.feature.balance.picker.impl.balance_picker_v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.ParcelableControllerDescriptor;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/balance/picker/impl/balance_picker_v2/BalancePickerScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AddNewCurrencyAccount", "HiddenAccounts", "DisabledBalanceExplanationStep", "ExcludedLockedBalances", "Lcom/revolut/retail/feature/balance/picker/impl/balance_picker_v2/BalancePickerScreenContract$ModalStep$AddNewCurrencyAccount;", "Lcom/revolut/retail/feature/balance/picker/impl/balance_picker_v2/BalancePickerScreenContract$ModalStep$DisabledBalanceExplanationStep;", "Lcom/revolut/retail/feature/balance/picker/impl/balance_picker_v2/BalancePickerScreenContract$ModalStep$ExcludedLockedBalances;", "Lcom/revolut/retail/feature/balance/picker/impl/balance_picker_v2/BalancePickerScreenContract$ModalStep$HiddenAccounts;", "feature_balance_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BalancePickerScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/impl/balance_picker_v2/BalancePickerScreenContract$ModalStep$AddNewCurrencyAccount;", "Lcom/revolut/retail/feature/balance/picker/impl/balance_picker_v2/BalancePickerScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddNewCurrencyAccount implements BalancePickerScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AddNewCurrencyAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BalancePickerScreenContract$NonExistingAccountsInfo f99497a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddNewCurrencyAccount(BalancePickerScreenContract$NonExistingAccountsInfo.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddNewCurrencyAccount[i];
            }
        }

        public AddNewCurrencyAccount(BalancePickerScreenContract$NonExistingAccountsInfo accountInfo) {
            Intrinsics.checkNotNullParameter(accountInfo, "accountInfo");
            this.f99497a = accountInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AddNewCurrencyAccount) && Intrinsics.f(this.f99497a, ((AddNewCurrencyAccount) obj2).f99497a);
        }

        public final int hashCode() {
            return this.f99497a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f99497a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/impl/balance_picker_v2/BalancePickerScreenContract$ModalStep$DisabledBalanceExplanationStep;", "Lcom/revolut/retail/feature/balance/picker/impl/balance_picker_v2/BalancePickerScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DisabledBalanceExplanationStep implements BalancePickerScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<DisabledBalanceExplanationStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ParcelableControllerDescriptor f99498a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DisabledBalanceExplanationStep((ParcelableControllerDescriptor) parcel.readParcelable(DisabledBalanceExplanationStep.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DisabledBalanceExplanationStep[i];
            }
        }

        public DisabledBalanceExplanationStep(ParcelableControllerDescriptor explanationDescriptor) {
            Intrinsics.checkNotNullParameter(explanationDescriptor, "explanationDescriptor");
            this.f99498a = explanationDescriptor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DisabledBalanceExplanationStep) && Intrinsics.f(this.f99498a, ((DisabledBalanceExplanationStep) obj2).f99498a);
        }

        public final int hashCode() {
            return this.f99498a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f99498a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/impl/balance_picker_v2/BalancePickerScreenContract$ModalStep$ExcludedLockedBalances;", "Lcom/revolut/retail/feature/balance/picker/impl/balance_picker_v2/BalancePickerScreenContract$ModalStep;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExcludedLockedBalances implements BalancePickerScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ExcludedLockedBalances f99499a = new ExcludedLockedBalances();

        @NotNull
        public static final Parcelable.Creator<ExcludedLockedBalances> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ExcludedLockedBalances.f99499a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExcludedLockedBalances[i];
            }
        }

        private ExcludedLockedBalances() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof ExcludedLockedBalances);
        }

        public final int hashCode() {
            return 1320484209;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/impl/balance_picker_v2/BalancePickerScreenContract$ModalStep$HiddenAccounts;", "Lcom/revolut/retail/feature/balance/picker/impl/balance_picker_v2/BalancePickerScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HiddenAccounts implements BalancePickerScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<HiddenAccounts> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f99500a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new HiddenAccounts(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HiddenAccounts[i];
            }
        }

        public HiddenAccounts(String selectedCountryProfileId) {
            Intrinsics.checkNotNullParameter(selectedCountryProfileId, "selectedCountryProfileId");
            this.f99500a = selectedCountryProfileId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof HiddenAccounts) && Intrinsics.f(this.f99500a, ((HiddenAccounts) obj2).f99500a);
        }

        public final int hashCode() {
            return this.f99500a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99500a);
        }
    }
}

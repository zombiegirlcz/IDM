package com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.openbanking.instructions.InstitutionInstructions;
import com.revolut.feature.external_accounts.api.navigation.CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData;
import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.model.CrossBorderCountryDepartmentUiModel;
import com.revolut.feature.external_accounts.impl.ui.link.screens.iban.IbanScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Institutions", "CountryDepartments", "Branches", "CreateMandate", "Instructions", "Iban", "DifferentCurrencyBottomSheet", "TakeUserRegionForGlobalBankDialog", "InstitutionNotAvailableDialog", "InstitutionNotListedDialog", "CountryNotListedDialog", "BranchNotListedDialog", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step$BranchNotListedDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step$Branches;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step$CountryDepartments;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step$CountryNotListedDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step$CreateMandate;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step$DifferentCurrencyBottomSheet;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step$Iban;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step$InstitutionNotAvailableDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step$InstitutionNotListedDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step$Institutions;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step$Instructions;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step$TakeUserRegionForGlobalBankDialog;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CrossBorderEasyBankTransferFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step$BranchNotListedDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BranchNotListedDialog extends CrossBorderEasyBankTransferFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BranchNotListedDialog f72817a = new BranchNotListedDialog();

        @NotNull
        public static final Parcelable.Creator<BranchNotListedDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BranchNotListedDialog.f72817a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BranchNotListedDialog[i];
            }
        }

        private BranchNotListedDialog() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step$Branches;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Branches extends CrossBorderEasyBankTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Branches> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f72820c;
        public final xi0.b d;
        public final String e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Branches(parcel.readString(), parcel.readString(), parcel.readInt() != 0, (xi0.b) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Branches[i];
            }
        }

        public Branches(String institutionId, String coreInstitutionName, boolean z, xi0.b supportedCurrency, String str) {
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            Intrinsics.checkNotNullParameter(coreInstitutionName, "coreInstitutionName");
            Intrinsics.checkNotNullParameter(supportedCurrency, "supportedCurrency");
            this.f72818a = institutionId;
            this.f72819b = coreInstitutionName;
            this.f72820c = z;
            this.d = supportedCurrency;
            this.e = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Branches)) {
                return false;
            }
            Branches branches = (Branches) obj2;
            return Intrinsics.f(this.f72818a, branches.f72818a) && Intrinsics.f(this.f72819b, branches.f72819b) && this.f72820c == branches.f72820c && Intrinsics.f(this.d, branches.d) && Intrinsics.f(this.e, branches.e);
        }

        public final int hashCode() {
            int iJ = l.j(this.d, j6.a.c(p.a.c(this.f72818a.hashCode() * 31, 31, this.f72819b), 31, this.f72820c), 31);
            String str = this.e;
            return iJ + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72818a);
            dest.writeString(this.f72819b);
            dest.writeInt(this.f72820c ? 1 : 0);
            dest.writeSerializable(this.d);
            dest.writeString(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step$CountryDepartments;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CountryDepartments extends CrossBorderEasyBankTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CountryDepartments> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final io3.b f72823c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CountryDepartments(parcel.readString(), parcel.readString(), (io3.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CountryDepartments[i];
            }
        }

        public CountryDepartments(String coreInstitutionId, String coreInstitutionName, io3.b coreInstitutionLogo) {
            Intrinsics.checkNotNullParameter(coreInstitutionId, "coreInstitutionId");
            Intrinsics.checkNotNullParameter(coreInstitutionName, "coreInstitutionName");
            Intrinsics.checkNotNullParameter(coreInstitutionLogo, "coreInstitutionLogo");
            this.f72821a = coreInstitutionId;
            this.f72822b = coreInstitutionName;
            this.f72823c = coreInstitutionLogo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CountryDepartments)) {
                return false;
            }
            CountryDepartments countryDepartments = (CountryDepartments) obj2;
            return Intrinsics.f(this.f72821a, countryDepartments.f72821a) && Intrinsics.f(this.f72822b, countryDepartments.f72822b) && Intrinsics.f(this.f72823c, countryDepartments.f72823c);
        }

        public final int hashCode() {
            return this.f72823c.hashCode() + p.a.c(this.f72821a.hashCode() * 31, 31, this.f72822b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72821a);
            dest.writeString(this.f72822b);
            dest.writeSerializable(this.f72823c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step$CountryNotListedDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CountryNotListedDialog extends CrossBorderEasyBankTransferFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CountryNotListedDialog f72824a = new CountryNotListedDialog();

        @NotNull
        public static final Parcelable.Creator<CountryNotListedDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CountryNotListedDialog.f72824a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CountryNotListedDialog[i];
            }
        }

        private CountryNotListedDialog() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step$CreateMandate;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreateMandate extends CrossBorderEasyBankTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CreateMandate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72826b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f72827c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreateMandate(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateMandate[i];
            }
        }

        public CreateMandate(String institutionId, String coreInstitutionName, String str, boolean z) {
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            Intrinsics.checkNotNullParameter(coreInstitutionName, "coreInstitutionName");
            this.f72825a = institutionId;
            this.f72826b = coreInstitutionName;
            this.f72827c = z;
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CreateMandate)) {
                return false;
            }
            CreateMandate createMandate = (CreateMandate) obj2;
            return Intrinsics.f(this.f72825a, createMandate.f72825a) && Intrinsics.f(this.f72826b, createMandate.f72826b) && this.f72827c == createMandate.f72827c && Intrinsics.f(this.d, createMandate.d);
        }

        public final int hashCode() {
            int iC = j6.a.c(p.a.c(this.f72825a.hashCode() * 31, 31, this.f72826b), 31, this.f72827c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72825a);
            dest.writeString(this.f72826b);
            dest.writeInt(this.f72827c ? 1 : 0);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step$DifferentCurrencyBottomSheet;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DifferentCurrencyBottomSheet extends CrossBorderEasyBankTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DifferentCurrencyBottomSheet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData f72828a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DifferentCurrencyBottomSheet((CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData) parcel.readParcelable(DifferentCurrencyBottomSheet.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DifferentCurrencyBottomSheet[i];
            }
        }

        public DifferentCurrencyBottomSheet(CrossBorderEasyBankTransferDescriptor$PreselectedInstitutionData preselectedInstitutionData) {
            Intrinsics.checkNotNullParameter(preselectedInstitutionData, "preselectedInstitutionData");
            this.f72828a = preselectedInstitutionData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DifferentCurrencyBottomSheet) && Intrinsics.f(this.f72828a, ((DifferentCurrencyBottomSheet) obj2).f72828a);
        }

        public final int hashCode() {
            return this.f72828a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f72828a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step$Iban;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Iban extends CrossBorderEasyBankTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Iban> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IbanScreenContract$InputData f72831c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Iban(parcel.readString(), parcel.readString(), IbanScreenContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Iban[i];
            }
        }

        public Iban(String institutionId, String str, IbanScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f72829a = institutionId;
            this.f72830b = str;
            this.f72831c = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Iban)) {
                return false;
            }
            Iban iban = (Iban) obj2;
            return Intrinsics.f(this.f72829a, iban.f72829a) && Intrinsics.f(this.f72830b, iban.f72830b) && Intrinsics.f(this.f72831c, iban.f72831c);
        }

        public final int hashCode() {
            int iHashCode = this.f72829a.hashCode() * 31;
            String str = this.f72830b;
            return this.f72831c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72829a);
            dest.writeString(this.f72830b);
            this.f72831c.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step$InstitutionNotAvailableDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InstitutionNotAvailableDialog extends CrossBorderEasyBankTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InstitutionNotAvailableDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72833b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InstitutionNotAvailableDialog(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InstitutionNotAvailableDialog[i];
            }
        }

        public InstitutionNotAvailableDialog(String dialogTitle, String dialogDescription) {
            Intrinsics.checkNotNullParameter(dialogTitle, "dialogTitle");
            Intrinsics.checkNotNullParameter(dialogDescription, "dialogDescription");
            this.f72832a = dialogTitle;
            this.f72833b = dialogDescription;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InstitutionNotAvailableDialog)) {
                return false;
            }
            InstitutionNotAvailableDialog institutionNotAvailableDialog = (InstitutionNotAvailableDialog) obj2;
            return Intrinsics.f(this.f72832a, institutionNotAvailableDialog.f72832a) && Intrinsics.f(this.f72833b, institutionNotAvailableDialog.f72833b);
        }

        public final int hashCode() {
            return this.f72833b.hashCode() + (this.f72832a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72832a);
            dest.writeString(this.f72833b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step$InstitutionNotListedDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InstitutionNotListedDialog extends CrossBorderEasyBankTransferFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InstitutionNotListedDialog f72834a = new InstitutionNotListedDialog();

        @NotNull
        public static final Parcelable.Creator<InstitutionNotListedDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InstitutionNotListedDialog.f72834a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InstitutionNotListedDialog[i];
            }
        }

        private InstitutionNotListedDialog() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step$Institutions;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Institutions extends CrossBorderEasyBankTransferFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Institutions f72835a = new Institutions();

        @NotNull
        public static final Parcelable.Creator<Institutions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Institutions.f72835a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Institutions[i];
            }
        }

        private Institutions() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step$Instructions;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Instructions extends CrossBorderEasyBankTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Instructions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InstitutionInstructions f72838c;
        public final boolean d;
        public final String e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Instructions(parcel.readString(), parcel.readString(), (InstitutionInstructions) parcel.readParcelable(Instructions.class.getClassLoader()), parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Instructions[i];
            }
        }

        public Instructions(String institutionId, String coreInstitutionName, InstitutionInstructions instructions, boolean z, String str) {
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            Intrinsics.checkNotNullParameter(coreInstitutionName, "coreInstitutionName");
            Intrinsics.checkNotNullParameter(instructions, "instructions");
            this.f72836a = institutionId;
            this.f72837b = coreInstitutionName;
            this.f72838c = instructions;
            this.d = z;
            this.e = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Instructions)) {
                return false;
            }
            Instructions instructions = (Instructions) obj2;
            return Intrinsics.f(this.f72836a, instructions.f72836a) && Intrinsics.f(this.f72837b, instructions.f72837b) && Intrinsics.f(this.f72838c, instructions.f72838c) && this.d == instructions.d && Intrinsics.f(this.e, instructions.e);
        }

        public final int hashCode() {
            int iC = j6.a.c((this.f72838c.hashCode() + p.a.c(this.f72836a.hashCode() * 31, 31, this.f72837b)) * 31, 31, this.d);
            String str = this.e;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72836a);
            dest.writeString(this.f72837b);
            dest.writeParcelable(this.f72838c, i);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeString(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step$TakeUserRegionForGlobalBankDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/easy_bank_transfer/CrossBorderEasyBankTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TakeUserRegionForGlobalBankDialog extends CrossBorderEasyBankTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TakeUserRegionForGlobalBankDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final io3.b f72841c;
        public final CrossBorderCountryDepartmentUiModel d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TakeUserRegionForGlobalBankDialog(parcel.readString(), parcel.readString(), (io3.b) parcel.readSerializable(), CrossBorderCountryDepartmentUiModel.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TakeUserRegionForGlobalBankDialog[i];
            }
        }

        public TakeUserRegionForGlobalBankDialog(String coreInstitutionId, String coreInstitutionName, io3.b coreInstitutionLogo, CrossBorderCountryDepartmentUiModel countryDepartment) {
            Intrinsics.checkNotNullParameter(coreInstitutionId, "coreInstitutionId");
            Intrinsics.checkNotNullParameter(coreInstitutionName, "coreInstitutionName");
            Intrinsics.checkNotNullParameter(coreInstitutionLogo, "coreInstitutionLogo");
            Intrinsics.checkNotNullParameter(countryDepartment, "countryDepartment");
            this.f72839a = coreInstitutionId;
            this.f72840b = coreInstitutionName;
            this.f72841c = coreInstitutionLogo;
            this.d = countryDepartment;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TakeUserRegionForGlobalBankDialog)) {
                return false;
            }
            TakeUserRegionForGlobalBankDialog takeUserRegionForGlobalBankDialog = (TakeUserRegionForGlobalBankDialog) obj2;
            return Intrinsics.f(this.f72839a, takeUserRegionForGlobalBankDialog.f72839a) && Intrinsics.f(this.f72840b, takeUserRegionForGlobalBankDialog.f72840b) && Intrinsics.f(this.f72841c, takeUserRegionForGlobalBankDialog.f72841c) && Intrinsics.f(this.d, takeUserRegionForGlobalBankDialog.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.f72841c.hashCode() + p.a.c(this.f72839a.hashCode() * 31, 31, this.f72840b)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72839a);
            dest.writeString(this.f72840b);
            dest.writeSerializable(this.f72841c);
            this.d.writeToParcel(dest, i);
        }
    }

    private CrossBorderEasyBankTransferFlowContract$Step() {
    }
}

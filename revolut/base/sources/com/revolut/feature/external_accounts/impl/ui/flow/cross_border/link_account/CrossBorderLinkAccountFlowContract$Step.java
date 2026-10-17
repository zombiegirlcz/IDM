package com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.CrossBorderLinkAccountFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.model.CrossBorderCountryDepartmentUiModel;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\r\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\r\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Institutions", "CountryDepartments", "Branches", "Consent", "ConsentForPreselectedInstitution", "InstitutionOffLineErrorDialog", "InstitutionAlreadyLinkErrorDialog", "InstitutionLinkLimitErrorDialog", "InstitutionNotListedDialog", "CountryDepartmentNotListedDialog", "BranchNotListedDialog", "TakeUserRegionForGlobalBankDialog", "InstitutionNotAvailableDialog", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step$BranchNotListedDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step$Branches;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step$Consent;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step$ConsentForPreselectedInstitution;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step$CountryDepartmentNotListedDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step$CountryDepartments;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step$InstitutionAlreadyLinkErrorDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step$InstitutionLinkLimitErrorDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step$InstitutionNotAvailableDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step$InstitutionNotListedDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step$InstitutionOffLineErrorDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step$Institutions;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step$TakeUserRegionForGlobalBankDialog;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CrossBorderLinkAccountFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step$BranchNotListedDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BranchNotListedDialog extends CrossBorderLinkAccountFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BranchNotListedDialog f72867a = new BranchNotListedDialog();

        @NotNull
        public static final Parcelable.Creator<BranchNotListedDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BranchNotListedDialog.f72867a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step$Branches;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Branches extends CrossBorderLinkAccountFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Branches> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72869b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Branches(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Branches[i];
            }
        }

        public Branches(String institutionId, String coreInstitutionName) {
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            Intrinsics.checkNotNullParameter(coreInstitutionName, "coreInstitutionName");
            this.f72868a = institutionId;
            this.f72869b = coreInstitutionName;
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
            return Intrinsics.f(this.f72868a, branches.f72868a) && Intrinsics.f(this.f72869b, branches.f72869b);
        }

        public final int hashCode() {
            return this.f72869b.hashCode() + (this.f72868a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72868a);
            dest.writeString(this.f72869b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step$Consent;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Consent extends CrossBorderLinkAccountFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Consent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72871b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f72872c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Consent(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Consent[i];
            }
        }

        public Consent(String institutionId, String coreInstitutionName, String str) {
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            Intrinsics.checkNotNullParameter(coreInstitutionName, "coreInstitutionName");
            this.f72870a = institutionId;
            this.f72871b = coreInstitutionName;
            this.f72872c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Consent)) {
                return false;
            }
            Consent consent = (Consent) obj2;
            return Intrinsics.f(this.f72870a, consent.f72870a) && Intrinsics.f(this.f72871b, consent.f72871b) && Intrinsics.f(this.f72872c, consent.f72872c);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f72870a.hashCode() * 31, 31, this.f72871b);
            String str = this.f72872c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72870a);
            dest.writeString(this.f72871b);
            dest.writeString(this.f72872c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step$ConsentForPreselectedInstitution;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConsentForPreselectedInstitution extends CrossBorderLinkAccountFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ConsentForPreselectedInstitution> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CrossBorderLinkAccountFlowContract$InputData.PreselectedInstitution f72873a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConsentForPreselectedInstitution(CrossBorderLinkAccountFlowContract$InputData.PreselectedInstitution.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConsentForPreselectedInstitution[i];
            }
        }

        public ConsentForPreselectedInstitution(CrossBorderLinkAccountFlowContract$InputData.PreselectedInstitution preselectedInstitution) {
            Intrinsics.checkNotNullParameter(preselectedInstitution, "preselectedInstitution");
            this.f72873a = preselectedInstitution;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ConsentForPreselectedInstitution) && Intrinsics.f(this.f72873a, ((ConsentForPreselectedInstitution) obj2).f72873a);
        }

        public final int hashCode() {
            return this.f72873a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f72873a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step$CountryDepartmentNotListedDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CountryDepartmentNotListedDialog extends CrossBorderLinkAccountFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CountryDepartmentNotListedDialog f72874a = new CountryDepartmentNotListedDialog();

        @NotNull
        public static final Parcelable.Creator<CountryDepartmentNotListedDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CountryDepartmentNotListedDialog.f72874a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CountryDepartmentNotListedDialog[i];
            }
        }

        private CountryDepartmentNotListedDialog() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step$CountryDepartments;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CountryDepartments extends CrossBorderLinkAccountFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CountryDepartments> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72876b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CountryDepartments(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CountryDepartments[i];
            }
        }

        public CountryDepartments(String coreInstitutionId, String coreInstitutionName) {
            Intrinsics.checkNotNullParameter(coreInstitutionId, "coreInstitutionId");
            Intrinsics.checkNotNullParameter(coreInstitutionName, "coreInstitutionName");
            this.f72875a = coreInstitutionId;
            this.f72876b = coreInstitutionName;
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
            return Intrinsics.f(this.f72875a, countryDepartments.f72875a) && Intrinsics.f(this.f72876b, countryDepartments.f72876b);
        }

        public final int hashCode() {
            return this.f72876b.hashCode() + (this.f72875a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72875a);
            dest.writeString(this.f72876b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step$InstitutionAlreadyLinkErrorDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InstitutionAlreadyLinkErrorDialog extends CrossBorderLinkAccountFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InstitutionAlreadyLinkErrorDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72877a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InstitutionAlreadyLinkErrorDialog(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InstitutionAlreadyLinkErrorDialog[i];
            }
        }

        public InstitutionAlreadyLinkErrorDialog(String institutionName) {
            Intrinsics.checkNotNullParameter(institutionName, "institutionName");
            this.f72877a = institutionName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InstitutionAlreadyLinkErrorDialog) && Intrinsics.f(this.f72877a, ((InstitutionAlreadyLinkErrorDialog) obj2).f72877a);
        }

        public final int hashCode() {
            return this.f72877a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72877a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step$InstitutionLinkLimitErrorDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InstitutionLinkLimitErrorDialog extends CrossBorderLinkAccountFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InstitutionLinkLimitErrorDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f72878a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InstitutionLinkLimitErrorDialog(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InstitutionLinkLimitErrorDialog[i];
            }
        }

        public InstitutionLinkLimitErrorDialog(int i) {
            this.f72878a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InstitutionLinkLimitErrorDialog) && this.f72878a == ((InstitutionLinkLimitErrorDialog) obj2).f72878a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f72878a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f72878a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step$InstitutionNotAvailableDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InstitutionNotAvailableDialog extends CrossBorderLinkAccountFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InstitutionNotAvailableDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72880b;

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
            this.f72879a = dialogTitle;
            this.f72880b = dialogDescription;
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
            return Intrinsics.f(this.f72879a, institutionNotAvailableDialog.f72879a) && Intrinsics.f(this.f72880b, institutionNotAvailableDialog.f72880b);
        }

        public final int hashCode() {
            return this.f72880b.hashCode() + (this.f72879a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72879a);
            dest.writeString(this.f72880b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step$InstitutionNotListedDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InstitutionNotListedDialog extends CrossBorderLinkAccountFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InstitutionNotListedDialog f72881a = new InstitutionNotListedDialog();

        @NotNull
        public static final Parcelable.Creator<InstitutionNotListedDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InstitutionNotListedDialog.f72881a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step$InstitutionOffLineErrorDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InstitutionOffLineErrorDialog extends CrossBorderLinkAccountFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InstitutionOffLineErrorDialog f72882a = new InstitutionOffLineErrorDialog();

        @NotNull
        public static final Parcelable.Creator<InstitutionOffLineErrorDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InstitutionOffLineErrorDialog.f72882a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InstitutionOffLineErrorDialog[i];
            }
        }

        private InstitutionOffLineErrorDialog() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step$Institutions;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Institutions extends CrossBorderLinkAccountFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Institutions f72883a = new Institutions();

        @NotNull
        public static final Parcelable.Creator<Institutions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Institutions.f72883a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step$TakeUserRegionForGlobalBankDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/flow/cross_border/link_account/CrossBorderLinkAccountFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TakeUserRegionForGlobalBankDialog extends CrossBorderLinkAccountFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TakeUserRegionForGlobalBankDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72884a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72885b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CrossBorderCountryDepartmentUiModel f72886c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TakeUserRegionForGlobalBankDialog(parcel.readString(), parcel.readString(), CrossBorderCountryDepartmentUiModel.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TakeUserRegionForGlobalBankDialog[i];
            }
        }

        public TakeUserRegionForGlobalBankDialog(String coreInstitutionId, String coreInstitutionName, CrossBorderCountryDepartmentUiModel countryDepartment) {
            Intrinsics.checkNotNullParameter(coreInstitutionId, "coreInstitutionId");
            Intrinsics.checkNotNullParameter(coreInstitutionName, "coreInstitutionName");
            Intrinsics.checkNotNullParameter(countryDepartment, "countryDepartment");
            this.f72884a = coreInstitutionId;
            this.f72885b = coreInstitutionName;
            this.f72886c = countryDepartment;
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
            return Intrinsics.f(this.f72884a, takeUserRegionForGlobalBankDialog.f72884a) && Intrinsics.f(this.f72885b, takeUserRegionForGlobalBankDialog.f72885b) && Intrinsics.f(this.f72886c, takeUserRegionForGlobalBankDialog.f72886c);
        }

        public final int hashCode() {
            return this.f72886c.hashCode() + p.a.c(this.f72884a.hashCode() * 31, 31, this.f72885b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72884a);
            dest.writeString(this.f72885b);
            this.f72886c.writeToParcel(dest, i);
        }
    }

    private CrossBorderLinkAccountFlowContract$Step() {
    }
}

package com.revolut.feature.external_accounts.impl.ui.link.flow.link_account;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.LinkAccountFlowContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/link/flow/link_account/LinkAccountFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Institutions", "Branches", "Consent", "ConsentForPreselectedInstitution", "ReviewAccountLinkingDetails", "InstitutionOffLineErrorDialog", "InstitutionAlreadyLinkErrorDialog", "InstitutionLinkLimitErrorDialog", "InstitutionNotAvailableDialog", "Lcom/revolut/feature/external_accounts/impl/ui/link/flow/link_account/LinkAccountFlowContract$Step$Branches;", "Lcom/revolut/feature/external_accounts/impl/ui/link/flow/link_account/LinkAccountFlowContract$Step$Consent;", "Lcom/revolut/feature/external_accounts/impl/ui/link/flow/link_account/LinkAccountFlowContract$Step$ConsentForPreselectedInstitution;", "Lcom/revolut/feature/external_accounts/impl/ui/link/flow/link_account/LinkAccountFlowContract$Step$InstitutionAlreadyLinkErrorDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/link/flow/link_account/LinkAccountFlowContract$Step$InstitutionLinkLimitErrorDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/link/flow/link_account/LinkAccountFlowContract$Step$InstitutionNotAvailableDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/link/flow/link_account/LinkAccountFlowContract$Step$InstitutionOffLineErrorDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/link/flow/link_account/LinkAccountFlowContract$Step$Institutions;", "Lcom/revolut/feature/external_accounts/impl/ui/link/flow/link_account/LinkAccountFlowContract$Step$ReviewAccountLinkingDetails;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LinkAccountFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/link/flow/link_account/LinkAccountFlowContract$Step$Branches;", "Lcom/revolut/feature/external_accounts/impl/ui/link/flow/link_account/LinkAccountFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Branches extends LinkAccountFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Branches> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExternalInstitution f72999a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Branches((ExternalInstitution) parcel.readParcelable(Branches.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Branches[i];
            }
        }

        public Branches(ExternalInstitution institution) {
            Intrinsics.checkNotNullParameter(institution, "institution");
            this.f72999a = institution;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Branches) && Intrinsics.f(this.f72999a, ((Branches) obj2).f72999a);
        }

        public final int hashCode() {
            return this.f72999a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f72999a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/link/flow/link_account/LinkAccountFlowContract$Step$Consent;", "Lcom/revolut/feature/external_accounts/impl/ui/link/flow/link_account/LinkAccountFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Consent extends LinkAccountFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Consent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExternalInstitution f73000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f73001b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Consent((ExternalInstitution) parcel.readParcelable(Consent.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Consent[i];
            }
        }

        public Consent(ExternalInstitution institution, String str) {
            Intrinsics.checkNotNullParameter(institution, "institution");
            this.f73000a = institution;
            this.f73001b = str;
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
            return Intrinsics.f(this.f73000a, consent.f73000a) && Intrinsics.f(this.f73001b, consent.f73001b);
        }

        public final int hashCode() {
            int iHashCode = this.f73000a.hashCode() * 31;
            String str = this.f73001b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73000a, i);
            dest.writeString(this.f73001b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/link/flow/link_account/LinkAccountFlowContract$Step$ConsentForPreselectedInstitution;", "Lcom/revolut/feature/external_accounts/impl/ui/link/flow/link_account/LinkAccountFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConsentForPreselectedInstitution extends LinkAccountFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ConsentForPreselectedInstitution> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkAccountFlowContract$InputData.PreselectedInstitution f73002a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConsentForPreselectedInstitution(LinkAccountFlowContract$InputData.PreselectedInstitution.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConsentForPreselectedInstitution[i];
            }
        }

        public ConsentForPreselectedInstitution(LinkAccountFlowContract$InputData.PreselectedInstitution preselectedInstitution) {
            Intrinsics.checkNotNullParameter(preselectedInstitution, "preselectedInstitution");
            this.f73002a = preselectedInstitution;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ConsentForPreselectedInstitution) && Intrinsics.f(this.f73002a, ((ConsentForPreselectedInstitution) obj2).f73002a);
        }

        public final int hashCode() {
            return this.f73002a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f73002a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/link/flow/link_account/LinkAccountFlowContract$Step$InstitutionAlreadyLinkErrorDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/link/flow/link_account/LinkAccountFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InstitutionAlreadyLinkErrorDialog extends LinkAccountFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InstitutionAlreadyLinkErrorDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73003a;

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
            this.f73003a = institutionName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InstitutionAlreadyLinkErrorDialog) && Intrinsics.f(this.f73003a, ((InstitutionAlreadyLinkErrorDialog) obj2).f73003a);
        }

        public final int hashCode() {
            return this.f73003a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73003a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/link/flow/link_account/LinkAccountFlowContract$Step$InstitutionLinkLimitErrorDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/link/flow/link_account/LinkAccountFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InstitutionLinkLimitErrorDialog extends LinkAccountFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InstitutionLinkLimitErrorDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f73004a;

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
            this.f73004a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InstitutionLinkLimitErrorDialog) && this.f73004a == ((InstitutionLinkLimitErrorDialog) obj2).f73004a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f73004a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f73004a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/link/flow/link_account/LinkAccountFlowContract$Step$InstitutionNotAvailableDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/link/flow/link_account/LinkAccountFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InstitutionNotAvailableDialog extends LinkAccountFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<InstitutionNotAvailableDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73005a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InstitutionNotAvailableDialog(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InstitutionNotAvailableDialog[i];
            }
        }

        public InstitutionNotAvailableDialog(String institutionName) {
            Intrinsics.checkNotNullParameter(institutionName, "institutionName");
            this.f73005a = institutionName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InstitutionNotAvailableDialog) && Intrinsics.f(this.f73005a, ((InstitutionNotAvailableDialog) obj2).f73005a);
        }

        public final int hashCode() {
            return this.f73005a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73005a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/link/flow/link_account/LinkAccountFlowContract$Step$InstitutionOffLineErrorDialog;", "Lcom/revolut/feature/external_accounts/impl/ui/link/flow/link_account/LinkAccountFlowContract$Step;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InstitutionOffLineErrorDialog extends LinkAccountFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InstitutionOffLineErrorDialog f73006a = new InstitutionOffLineErrorDialog();

        @NotNull
        public static final Parcelable.Creator<InstitutionOffLineErrorDialog> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InstitutionOffLineErrorDialog.f73006a;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/link/flow/link_account/LinkAccountFlowContract$Step$Institutions;", "Lcom/revolut/feature/external_accounts/impl/ui/link/flow/link_account/LinkAccountFlowContract$Step;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Institutions extends LinkAccountFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Institutions f73007a = new Institutions();

        @NotNull
        public static final Parcelable.Creator<Institutions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Institutions.f73007a;
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

    private LinkAccountFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/link/flow/link_account/LinkAccountFlowContract$Step$ReviewAccountLinkingDetails;", "Lcom/revolut/feature/external_accounts/impl/ui/link/flow/link_account/LinkAccountFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReviewAccountLinkingDetails extends LinkAccountFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ReviewAccountLinkingDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f73009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f73010c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReviewAccountLinkingDetails(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReviewAccountLinkingDetails[i];
            }
        }

        public ReviewAccountLinkingDetails(String institutionId, String institutionName, String str, boolean z) {
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
            Intrinsics.checkNotNullParameter(institutionName, "institutionName");
            this.f73008a = institutionId;
            this.f73009b = institutionName;
            this.f73010c = str;
            this.d = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ReviewAccountLinkingDetails)) {
                return false;
            }
            ReviewAccountLinkingDetails reviewAccountLinkingDetails = (ReviewAccountLinkingDetails) obj2;
            return Intrinsics.f(this.f73008a, reviewAccountLinkingDetails.f73008a) && Intrinsics.f(this.f73009b, reviewAccountLinkingDetails.f73009b) && Intrinsics.f(this.f73010c, reviewAccountLinkingDetails.f73010c) && this.d == reviewAccountLinkingDetails.d;
        }

        public final int hashCode() {
            int iC = p.a.c(this.f73008a.hashCode() * 31, 31, this.f73009b);
            String str = this.f73010c;
            return Boolean.hashCode(this.d) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73008a);
            dest.writeString(this.f73009b);
            dest.writeString(this.f73010c);
            dest.writeInt(this.d ? 1 : 0);
        }

        public /* synthetic */ ReviewAccountLinkingDetails(String str, String str2, String str3, int i) {
            this(str, str2, (i & 4) != 0 ? null : str3, false);
        }
    }
}

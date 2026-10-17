package com.revolut.shared.feature.workflow.engine.api.workflow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.backend_flow.domain.endpoint.BackendFlowApiEndpoints;
import com.revolut.feature.identity.auth.domain.model.IndividualIdentityId;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.shared.feature.workflow.engine.api.models.DataPoint;
import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepConfiguration;
import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepNavigation;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.CreditConsentExpiryCollection;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.CreditConsentExplicitTerm;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowScreenConfiguration;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ril.h;
import ril.j;
import sil.d;
import wi0.b;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u001a\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u0082\u0001\u0019\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./01234¨\u00065À\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/WorkflowFlowStep;", "IdentityDeclarations", "Kyc", "NavigationHub", "Form", "Address", "TaxResidency", "TaxResidenciesCollection", "ContactSelection", "til/b", "OnboardingStep", "CreditOnboardingPluginStep", "Qes", "Employer", "RiskAssessment", "UserDetailsStep", "TermsReview", "ResidentialAddressCollection", "ResidentialAddressCollectionV2", "IdentitySignIn", "RegisteredIdentitySignIn", "TransactionCountries", "PepConnections", "PodBeneficiaries", "CreditConsent", "SendGuardianInvitation", "PricingPlansPrompt", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$Address;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$ContactSelection;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$CreditConsent;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$CreditOnboardingPluginStep;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$Employer;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$Form;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$IdentityDeclarations;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$IdentitySignIn;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$Kyc;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$NavigationHub;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$OnboardingStep;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$PepConnections;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$PodBeneficiaries;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$PricingPlansPrompt;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$Qes;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$RegisteredIdentitySignIn;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$ResidentialAddressCollection;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$ResidentialAddressCollectionV2;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$RiskAssessment;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$SendGuardianInvitation;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$TaxResidenciesCollection;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$TaxResidency;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$TermsReview;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$TransactionCountries;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$UserDetailsStep;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SharedStep extends WorkflowFlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$Address;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Address implements SharedStep {

        @NotNull
        public static final Parcelable.Creator<Address> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowStepNavigation f105692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f105694c;
        public final boolean d;
        public final boolean e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                WorkflowStepNavigation workflowStepNavigationCreateFromParcel = WorkflowStepNavigation.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                b bVar = (b) parcel.readSerializable();
                boolean z3 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                return new Address(workflowStepNavigationCreateFromParcel, string, bVar, z3, parcel.readInt() == 0 ? z : true);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Address[i];
            }
        }

        public Address(WorkflowStepNavigation navigation, String str, b countryCode, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f105692a = navigation;
            this.f105693b = str;
            this.f105694c = countryCode;
            this.d = z;
            this.e = z3;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: G9, reason: from getter */
        public final boolean getE() {
            return this.e;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF105812b() {
            return this.f105693b;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: X3, reason: from getter */
        public final boolean getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Address)) {
                return false;
            }
            Address address = (Address) obj2;
            return Intrinsics.f(this.f105692a, address.f105692a) && Intrinsics.f(this.f105693b, address.f105693b) && Intrinsics.f(this.f105694c, address.f105694c) && this.d == address.d && this.e == address.e;
        }

        public final int hashCode() {
            int iHashCode = this.f105692a.hashCode() * 31;
            String str = this.f105693b;
            return Boolean.hashCode(this.e) + j6.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f105694c.f297794a), 31, this.d);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: p7, reason: from getter */
        public final WorkflowStepNavigation getF105811a() {
            return this.f105692a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f105692a.writeToParcel(dest, i);
            dest.writeString(this.f105693b);
            dest.writeSerializable(this.f105694c);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeInt(this.e ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$ContactSelection;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ContactSelection implements SharedStep {

        @NotNull
        public static final Parcelable.Creator<ContactSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowStepNavigation f105695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105697c;
        public final String d;
        public final String e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f105698g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f105699h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f105700j;
        public final boolean k;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                boolean z4;
                boolean z6;
                boolean z11;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                WorkflowStepNavigation workflowStepNavigationCreateFromParcel = WorkflowStepNavigation.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                boolean z12 = false;
                boolean z29 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z12 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = true;
                    z29 = z;
                }
                if (parcel.readInt() != 0) {
                    z4 = z3;
                } else {
                    z4 = z3;
                    z3 = z;
                }
                if (parcel.readInt() != 0) {
                    z6 = z4;
                } else {
                    z6 = z4;
                    z4 = z;
                }
                if (parcel.readInt() != 0) {
                    z11 = z6;
                } else {
                    z11 = z6;
                    z6 = z;
                }
                if (parcel.readInt() == 0) {
                    z11 = z;
                }
                return new ContactSelection(workflowStepNavigationCreateFromParcel, string, string2, string3, string4, z12, z29, z3, z4, z6, z11);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ContactSelection[i];
            }
        }

        public ContactSelection(WorkflowStepNavigation navigation, String stepId, String title, String submitButton, String searchPlaceholder, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(stepId, "stepId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(submitButton, "submitButton");
            Intrinsics.checkNotNullParameter(searchPlaceholder, "searchPlaceholder");
            this.f105695a = navigation;
            this.f105696b = stepId;
            this.f105697c = title;
            this.d = submitButton;
            this.e = searchPlaceholder;
            this.f = z;
            this.f105698g = z3;
            this.f105699h = z4;
            this.i = z6;
            this.f105700j = z11;
            this.k = z12;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: G9, reason: from getter */
        public final boolean getE() {
            return this.k;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF105812b() {
            return this.f105696b;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: X3, reason: from getter */
        public final boolean getD() {
            return this.f105700j;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ContactSelection)) {
                return false;
            }
            ContactSelection contactSelection = (ContactSelection) obj2;
            return Intrinsics.f(this.f105695a, contactSelection.f105695a) && Intrinsics.f(this.f105696b, contactSelection.f105696b) && Intrinsics.f(this.f105697c, contactSelection.f105697c) && Intrinsics.f(this.d, contactSelection.d) && Intrinsics.f(this.e, contactSelection.e) && this.f == contactSelection.f && this.f105698g == contactSelection.f105698g && this.f105699h == contactSelection.f105699h && this.i == contactSelection.i && this.f105700j == contactSelection.f105700j && this.k == contactSelection.k;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.k) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f105695a.hashCode() * 31, 31, this.f105696b), 31, this.f105697c), 31, this.d), 31, this.e), 31, this.f), 31, this.f105698g), 31, this.f105699h), 31, this.i), 31, this.f105700j);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: p7, reason: from getter */
        public final WorkflowStepNavigation getF105811a() {
            return this.f105695a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f105695a.writeToParcel(dest, i);
            dest.writeString(this.f105696b);
            dest.writeString(this.f105697c);
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeInt(this.f ? 1 : 0);
            dest.writeInt(this.f105698g ? 1 : 0);
            dest.writeInt(this.f105699h ? 1 : 0);
            dest.writeInt(this.i ? 1 : 0);
            dest.writeInt(this.f105700j ? 1 : 0);
            dest.writeInt(this.k ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$CreditConsent;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreditConsent implements SharedStep {

        @NotNull
        public static final Parcelable.Creator<CreditConsent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowStepNavigation f105701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f105703c;
        public final boolean d;
        public final String e;
        public final List f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final CreditConsentExpiryCollection f105704g;

        public static final class a implements Parcelable.Creator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                int i;
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                WorkflowStepNavigation workflowStepNavigationCreateFromParcel = WorkflowStepNavigation.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                int iA = 0;
                boolean z = true;
                if (parcel.readInt() != 0) {
                    i = 1;
                } else {
                    i = 1;
                    z = false;
                }
                boolean z3 = parcel.readInt() != 0 ? i : 0;
                String string2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i2 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i2);
                    while (iA != i2) {
                        iA = org.bouncycastle.jcajce.provider.digest.a.a(CreditConsentExplicitTerm.CREATOR, parcel, arrayList2, iA, i);
                    }
                    arrayList = arrayList2;
                }
                return new CreditConsent(workflowStepNavigationCreateFromParcel, string, z, z3, string2, arrayList, parcel.readInt() != 0 ? CreditConsentExpiryCollection.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditConsent[i];
            }
        }

        public CreditConsent(WorkflowStepNavigation navigation, String stepId, boolean z, boolean z3, String str, List list, CreditConsentExpiryCollection creditConsentExpiryCollection) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(stepId, "stepId");
            this.f105701a = navigation;
            this.f105702b = stepId;
            this.f105703c = z;
            this.d = z3;
            this.e = str;
            this.f = list;
            this.f105704g = creditConsentExpiryCollection;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: G9, reason: from getter */
        public final boolean getE() {
            return this.d;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF105812b() {
            return this.f105702b;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: X3, reason: from getter */
        public final boolean getD() {
            return this.f105703c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CreditConsent)) {
                return false;
            }
            CreditConsent creditConsent = (CreditConsent) obj2;
            return Intrinsics.f(this.f105701a, creditConsent.f105701a) && Intrinsics.f(this.f105702b, creditConsent.f105702b) && this.f105703c == creditConsent.f105703c && this.d == creditConsent.d && Intrinsics.f(this.e, creditConsent.e) && Intrinsics.f(this.f, creditConsent.f) && Intrinsics.f(this.f105704g, creditConsent.f105704g);
        }

        public final int hashCode() {
            int iC = j6.a.c(j6.a.c(p.a.c(this.f105701a.hashCode() * 31, 31, this.f105702b), 31, this.f105703c), 31, this.d);
            String str = this.e;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            List list = this.f;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            CreditConsentExpiryCollection creditConsentExpiryCollection = this.f105704g;
            return iHashCode2 + (creditConsentExpiryCollection != null ? creditConsentExpiryCollection.hashCode() : 0);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: p7, reason: from getter */
        public final WorkflowStepNavigation getF105811a() {
            return this.f105701a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f105701a.writeToParcel(dest, i);
            dest.writeString(this.f105702b);
            dest.writeInt(this.f105703c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeString(this.e);
            List list = this.f;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = v0.a.q(dest, 1, list);
                while (itQ.hasNext()) {
                    ((CreditConsentExplicitTerm) itQ.next()).writeToParcel(dest, i);
                }
            }
            CreditConsentExpiryCollection creditConsentExpiryCollection = this.f105704g;
            if (creditConsentExpiryCollection == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                creditConsentExpiryCollection.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$CreditOnboardingPluginStep;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep;", "Ltil/b;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreditOnboardingPluginStep implements SharedStep, til.b {

        @NotNull
        public static final Parcelable.Creator<CreditOnboardingPluginStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowStepNavigation f105705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105707c;
        public final boolean d;
        public final boolean e;
        public final ril.b f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                WorkflowStepNavigation workflowStepNavigationCreateFromParcel = WorkflowStepNavigation.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                String string2 = parcel.readString();
                boolean z3 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                return new CreditOnboardingPluginStep(workflowStepNavigationCreateFromParcel, string, string2, z3, parcel.readInt() == 0 ? z : true, ril.b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreditOnboardingPluginStep[i];
            }
        }

        public CreditOnboardingPluginStep(WorkflowStepNavigation navigation, String str, String workflowStepId, boolean z, boolean z3, ril.b stepName) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(workflowStepId, "workflowStepId");
            Intrinsics.checkNotNullParameter(stepName, "stepName");
            this.f105705a = navigation;
            this.f105706b = str;
            this.f105707c = workflowStepId;
            this.d = z;
            this.e = z3;
            this.f = stepName;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: G9, reason: from getter */
        public final boolean getE() {
            return this.e;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF105812b() {
            return this.f105706b;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: X3, reason: from getter */
        public final boolean getD() {
            return this.d;
        }

        @Override // til.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF105757c() {
            return this.f105707c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CreditOnboardingPluginStep)) {
                return false;
            }
            CreditOnboardingPluginStep creditOnboardingPluginStep = (CreditOnboardingPluginStep) obj2;
            return Intrinsics.f(this.f105705a, creditOnboardingPluginStep.f105705a) && Intrinsics.f(this.f105706b, creditOnboardingPluginStep.f105706b) && Intrinsics.f(this.f105707c, creditOnboardingPluginStep.f105707c) && this.d == creditOnboardingPluginStep.d && this.e == creditOnboardingPluginStep.e && this.f == creditOnboardingPluginStep.f;
        }

        @Override // til.b
        /* JADX INFO: renamed from: getName */
        public final String getE() {
            return this.f.name();
        }

        public final int hashCode() {
            int iHashCode = this.f105705a.hashCode() * 31;
            String str = this.f105706b;
            return this.f.hashCode() + j6.a.c(j6.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f105707c), 31, this.d), 31, this.e);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: p7, reason: from getter */
        public final WorkflowStepNavigation getF105811a() {
            return this.f105705a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f105705a.writeToParcel(dest, i);
            dest.writeString(this.f105706b);
            dest.writeString(this.f105707c);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeInt(this.e ? 1 : 0);
            dest.writeString(this.f.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$Employer;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Employer implements SharedStep {

        @NotNull
        public static final Parcelable.Creator<Employer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowStepNavigation f105708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f105710c;
        public final boolean d;
        public final b e;
        public final boolean f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                b bVar;
                boolean z4;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                WorkflowStepNavigation workflowStepNavigationCreateFromParcel = WorkflowStepNavigation.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                boolean z6 = false;
                boolean z11 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z6 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = true;
                    z11 = z;
                }
                b bVar2 = (b) parcel.readSerializable();
                if (parcel.readInt() != 0) {
                    z4 = z3;
                    bVar = bVar2;
                } else {
                    bVar = bVar2;
                    z4 = z;
                }
                return new Employer(workflowStepNavigationCreateFromParcel, string, z6, z11, bVar, z4);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Employer[i];
            }
        }

        public Employer(WorkflowStepNavigation navigation, String stepId, boolean z, boolean z3, b countryCode, boolean z4) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(stepId, "stepId");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f105708a = navigation;
            this.f105709b = stepId;
            this.f105710c = z;
            this.d = z3;
            this.e = countryCode;
            this.f = z4;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: G9, reason: from getter */
        public final boolean getE() {
            return this.d;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF105812b() {
            return this.f105709b;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: X3, reason: from getter */
        public final boolean getD() {
            return this.f105710c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Employer)) {
                return false;
            }
            Employer employer = (Employer) obj2;
            return Intrinsics.f(this.f105708a, employer.f105708a) && Intrinsics.f(this.f105709b, employer.f105709b) && this.f105710c == employer.f105710c && this.d == employer.d && Intrinsics.f(this.e, employer.e) && this.f == employer.f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + p.a.c(j6.a.c(j6.a.c(p.a.c(this.f105708a.hashCode() * 31, 31, this.f105709b), 31, this.f105710c), 31, this.d), 31, this.e.f297794a);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: p7, reason: from getter */
        public final WorkflowStepNavigation getF105811a() {
            return this.f105708a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f105708a.writeToParcel(dest, i);
            dest.writeString(this.f105709b);
            dest.writeInt(this.f105710c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeSerializable(this.e);
            dest.writeInt(this.f ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$Form;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Form implements SharedStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowStepNavigation f105711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WorkflowFlowType f105712b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105713c;
        public final String d;
        public final Map e;
        public final AnalyticsProduct f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final AnalyticsContext f105714g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final BackendFlowApiEndpoints f105715h;
        public final WorkflowConfiguration.Extras i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final UUID f105716j;
        public final boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f105717l;

        @NotNull
        public static final Parcelable.Creator<Form> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                WorkflowStepNavigation workflowStepNavigationCreateFromParcel = WorkflowStepNavigation.CREATOR.createFromParcel(parcel);
                WorkflowFlowType workflowFlowType = (WorkflowFlowType) parcel.readParcelable(Form.class.getClassLoader());
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new Form(workflowStepNavigationCreateFromParcel, workflowFlowType, string, string2, linkedHashMap, (AnalyticsProduct) parcel.readParcelable(Form.class.getClassLoader()), (AnalyticsContext) parcel.readParcelable(Form.class.getClassLoader()), (BackendFlowApiEndpoints) parcel.readParcelable(Form.class.getClassLoader()), parcel.readInt() == 0 ? null : WorkflowConfiguration.Extras.CREATOR.createFromParcel(parcel), (UUID) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Form[i];
            }
        }

        public Form(WorkflowStepNavigation navigation, WorkflowFlowType flowType, String stepId, String formId, Map formParams, AnalyticsProduct analyticsProduct, AnalyticsContext analyticsContext, BackendFlowApiEndpoints backendFlowApiEndpoints, WorkflowConfiguration.Extras extras, UUID sessionId, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            Intrinsics.checkNotNullParameter(stepId, "stepId");
            Intrinsics.checkNotNullParameter(formId, "formId");
            Intrinsics.checkNotNullParameter(formParams, "formParams");
            Intrinsics.checkNotNullParameter(backendFlowApiEndpoints, "backendFlowApiEndpoints");
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            this.f105711a = navigation;
            this.f105712b = flowType;
            this.f105713c = stepId;
            this.d = formId;
            this.e = formParams;
            this.f = analyticsProduct;
            this.f105714g = analyticsContext;
            this.f105715h = backendFlowApiEndpoints;
            this.i = extras;
            this.f105716j = sessionId;
            this.k = z;
            this.f105717l = z3;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: G9, reason: from getter */
        public final boolean getE() {
            return this.f105717l;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF105812b() {
            return this.f105713c;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: X3, reason: from getter */
        public final boolean getD() {
            return this.k;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Form)) {
                return false;
            }
            Form form = (Form) obj2;
            return Intrinsics.f(this.f105711a, form.f105711a) && Intrinsics.f(this.f105712b, form.f105712b) && Intrinsics.f(this.f105713c, form.f105713c) && Intrinsics.f(this.d, form.d) && Intrinsics.f(this.e, form.e) && Intrinsics.f(this.f, form.f) && Intrinsics.f(this.f105714g, form.f105714g) && Intrinsics.f(this.f105715h, form.f105715h) && Intrinsics.f(this.i, form.i) && Intrinsics.f(this.f105716j, form.f105716j) && this.k == form.k && this.f105717l == form.f105717l;
        }

        public final int hashCode() {
            int iE = p.a.e(p.a.c(p.a.c((this.f105712b.hashCode() + (this.f105711a.hashCode() * 31)) * 31, 31, this.f105713c), 31, this.d), 31, this.e);
            AnalyticsProduct analyticsProduct = this.f;
            int iHashCode = (iE + (analyticsProduct == null ? 0 : analyticsProduct.hashCode())) * 31;
            AnalyticsContext analyticsContext = this.f105714g;
            int iC = p.a.c((iHashCode + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31, 31, this.f105715h.f63223a);
            WorkflowConfiguration.Extras extras = this.i;
            return Boolean.hashCode(this.f105717l) + j6.a.c(t61.a.f(this.f105716j, (iC + (extras != null ? Boolean.hashCode(extras.f78240a) : 0)) * 31, 31), 31, this.k);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: p7, reason: from getter */
        public final WorkflowStepNavigation getF105811a() {
            return this.f105711a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f105711a.writeToParcel(dest, i);
            dest.writeParcelable(this.f105712b, i);
            dest.writeString(this.f105713c);
            dest.writeString(this.d);
            Iterator itZ = j6.a.z(this.e, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
            dest.writeParcelable(this.f, i);
            dest.writeParcelable(this.f105714g, i);
            dest.writeParcelable(this.f105715h, i);
            WorkflowConfiguration.Extras extras = this.i;
            if (extras == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                extras.writeToParcel(dest, i);
            }
            dest.writeSerializable(this.f105716j);
            dest.writeInt(this.k ? 1 : 0);
            dest.writeInt(this.f105717l ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$IdentityDeclarations;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IdentityDeclarations implements SharedStep {

        @NotNull
        public static final Parcelable.Creator<IdentityDeclarations> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowStepNavigation f105718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f105720c;
        public final String d;
        public final List e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final b f105721g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final WorkflowScreenConfiguration f105722h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f105723j;

        public static final class a implements Parcelable.Creator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                int i;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                WorkflowStepNavigation workflowStepNavigationCreateFromParcel = WorkflowStepNavigation.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                boolean z = true;
                if (parcel.readInt() != 0) {
                    i = 1;
                } else {
                    i = 1;
                    z = false;
                }
                String string2 = parcel.readString();
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iA = 0;
                while (iA != i2) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(DataPoint.CREATOR, parcel, arrayList, iA, i);
                }
                return new IdentityDeclarations(workflowStepNavigationCreateFromParcel, string, z, string2, arrayList, parcel.readInt() != 0 ? i : 0, (b) parcel.readSerializable(), parcel.readInt() == 0 ? null : WorkflowScreenConfiguration.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? i : 0, parcel.readInt() != 0 ? i : 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IdentityDeclarations[i];
            }
        }

        public IdentityDeclarations(WorkflowStepNavigation navigation, String str, boolean z, String str2, List dataPoints, boolean z3, b countryCode, WorkflowScreenConfiguration workflowScreenConfiguration, boolean z4, boolean z6) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(dataPoints, "dataPoints");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f105718a = navigation;
            this.f105719b = str;
            this.f105720c = z;
            this.d = str2;
            this.e = dataPoints;
            this.f = z3;
            this.f105721g = countryCode;
            this.f105722h = workflowScreenConfiguration;
            this.i = z4;
            this.f105723j = z6;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: G9, reason: from getter */
        public final boolean getE() {
            return this.f105723j;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF105812b() {
            return this.f105719b;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: X3, reason: from getter */
        public final boolean getD() {
            return this.f105720c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof IdentityDeclarations)) {
                return false;
            }
            IdentityDeclarations identityDeclarations = (IdentityDeclarations) obj2;
            return Intrinsics.f(this.f105718a, identityDeclarations.f105718a) && Intrinsics.f(this.f105719b, identityDeclarations.f105719b) && this.f105720c == identityDeclarations.f105720c && Intrinsics.f(this.d, identityDeclarations.d) && Intrinsics.f(this.e, identityDeclarations.e) && this.f == identityDeclarations.f && Intrinsics.f(this.f105721g, identityDeclarations.f105721g) && Intrinsics.f(this.f105722h, identityDeclarations.f105722h) && this.i == identityDeclarations.i && this.f105723j == identityDeclarations.f105723j;
        }

        public final int hashCode() {
            int iHashCode = this.f105718a.hashCode() * 31;
            String str = this.f105719b;
            int iC = j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f105720c);
            String str2 = this.d;
            int iC2 = p.a.c(j6.a.c(p.a.d((iC + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.f105721g.f297794a);
            WorkflowScreenConfiguration workflowScreenConfiguration = this.f105722h;
            return Boolean.hashCode(this.f105723j) + j6.a.c((iC2 + (workflowScreenConfiguration != null ? workflowScreenConfiguration.hashCode() : 0)) * 31, 31, this.i);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: p7, reason: from getter */
        public final WorkflowStepNavigation getF105811a() {
            return this.f105718a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f105718a.writeToParcel(dest, i);
            dest.writeString(this.f105719b);
            dest.writeInt(this.f105720c ? 1 : 0);
            dest.writeString(this.d);
            Iterator itV = p.a.v(this.e, dest);
            while (itV.hasNext()) {
                ((DataPoint) itV.next()).writeToParcel(dest, i);
            }
            dest.writeInt(this.f ? 1 : 0);
            dest.writeSerializable(this.f105721g);
            WorkflowScreenConfiguration workflowScreenConfiguration = this.f105722h;
            if (workflowScreenConfiguration == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                workflowScreenConfiguration.writeToParcel(dest, i);
            }
            dest.writeInt(this.i ? 1 : 0);
            dest.writeInt(this.f105723j ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$IdentitySignIn;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IdentitySignIn implements SharedStep {

        @NotNull
        public static final Parcelable.Creator<IdentitySignIn> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowStepNavigation f105724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f105726c;
        public final String d;
        public final boolean e;
        public final WorkflowScreenConfiguration f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                WorkflowStepNavigation workflowStepNavigationCreateFromParcel = WorkflowStepNavigation.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                boolean z3 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                String str = ((IndividualIdentityId) parcel.readParcelable(IdentitySignIn.class.getClassLoader())).f74763a;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new IdentitySignIn(workflowStepNavigationCreateFromParcel, string, z3, str, z, parcel.readInt() == 0 ? null : WorkflowScreenConfiguration.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IdentitySignIn[i];
            }
        }

        public IdentitySignIn(WorkflowStepNavigation navigation, String str, boolean z, String identityId, boolean z3, WorkflowScreenConfiguration workflowScreenConfiguration) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(identityId, "identityId");
            this.f105724a = navigation;
            this.f105725b = str;
            this.f105726c = z;
            this.d = identityId;
            this.e = z3;
            this.f = workflowScreenConfiguration;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: G9, reason: from getter */
        public final boolean getE() {
            return this.e;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF105812b() {
            return this.f105725b;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: X3, reason: from getter */
        public final boolean getD() {
            return this.f105726c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof IdentitySignIn)) {
                return false;
            }
            IdentitySignIn identitySignIn = (IdentitySignIn) obj2;
            return Intrinsics.f(this.f105724a, identitySignIn.f105724a) && Intrinsics.f(this.f105725b, identitySignIn.f105725b) && this.f105726c == identitySignIn.f105726c && Intrinsics.f(this.d, identitySignIn.d) && this.e == identitySignIn.e && Intrinsics.f(this.f, identitySignIn.f);
        }

        public final int hashCode() {
            int iHashCode = this.f105724a.hashCode() * 31;
            String str = this.f105725b;
            int iC = j6.a.c(p.a.c(j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f105726c), 31, this.d), 31, this.e);
            WorkflowScreenConfiguration workflowScreenConfiguration = this.f;
            return iC + (workflowScreenConfiguration != null ? workflowScreenConfiguration.hashCode() : 0);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: p7, reason: from getter */
        public final WorkflowStepNavigation getF105811a() {
            return this.f105724a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f105724a.writeToParcel(dest, i);
            dest.writeString(this.f105725b);
            dest.writeInt(this.f105726c ? 1 : 0);
            dest.writeParcelable(new IndividualIdentityId(this.d), i);
            dest.writeInt(this.e ? 1 : 0);
            WorkflowScreenConfiguration workflowScreenConfiguration = this.f;
            if (workflowScreenConfiguration == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                workflowScreenConfiguration.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0006\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$Kyc;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep;", "<init>", "()V", "Companion", "Default", "TaxResidency", "NameChange", "Address", "Savings", "a", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$Kyc$Address;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$Kyc$Default;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$Kyc$NameChange;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$Kyc$Savings;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$Kyc$TaxResidency;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Kyc implements SharedStep {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$Kyc$Address;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$Kyc;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Address extends Kyc {

            @NotNull
            public static final Parcelable.Creator<Address> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WorkflowStepNavigation f105727a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final b f105728b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f105729c;
            public final String d;
            public final boolean e;
            public final boolean f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final boolean f105730g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final String f105731h;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    boolean z;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    WorkflowStepNavigation workflowStepNavigationCreateFromParcel = WorkflowStepNavigation.CREATOR.createFromParcel(parcel);
                    b bVar = (b) parcel.readSerializable();
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    boolean z3 = true;
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = true;
                        z3 = false;
                    }
                    return new Address(workflowStepNavigationCreateFromParcel, string, string2, parcel.readString(), bVar, z3, parcel.readInt() != 0 ? z : false, parcel.readInt() != 0 ? z : false);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Address[i];
                }
            }

            public Address(WorkflowStepNavigation navigation, String str, String str2, String str3, b countryCode, boolean z, boolean z3, boolean z4) {
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                this.f105727a = navigation;
                this.f105728b = countryCode;
                this.f105729c = str;
                this.d = str2;
                this.e = z;
                this.f = z3;
                this.f105730g = z4;
                this.f105731h = str3;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: G9, reason: from getter */
            public final boolean getE() {
                return this.f105730g;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: H1, reason: from getter */
            public final String getF105812b() {
                return this.d;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: X3, reason: from getter */
            public final boolean getD() {
                return this.f;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep.Kyc
            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getE() {
                return this.e;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep.Kyc
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF105749c() {
                return this.f105729c;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep.Kyc
            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getF105751h() {
                return this.f105731h;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Address)) {
                    return false;
                }
                Address address = (Address) obj2;
                return Intrinsics.f(this.f105727a, address.f105727a) && Intrinsics.f(this.f105728b, address.f105728b) && Intrinsics.f(this.f105729c, address.f105729c) && Intrinsics.f(this.d, address.d) && this.e == address.e && this.f == address.f && this.f105730g == address.f105730g && Intrinsics.f(this.f105731h, address.f105731h);
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep.Kyc
            /* JADX INFO: renamed from: getCountryCode, reason: from getter */
            public final b getF105748b() {
                return this.f105728b;
            }

            public final int hashCode() {
                int iC = p.a.c(this.f105727a.hashCode() * 31, 31, this.f105728b.f297794a);
                String str = this.f105729c;
                int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.d;
                int iC2 = j6.a.c(j6.a.c(j6.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.f105730g);
                String str3 = this.f105731h;
                return iC2 + (str3 != null ? str3.hashCode() : 0);
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: p7, reason: from getter */
            public final WorkflowStepNavigation getF105811a() {
                return this.f105727a;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f105727a.writeToParcel(dest, i);
                dest.writeSerializable(this.f105728b);
                dest.writeString(this.f105729c);
                dest.writeString(this.d);
                dest.writeInt(this.e ? 1 : 0);
                dest.writeInt(this.f ? 1 : 0);
                dest.writeInt(this.f105730g ? 1 : 0);
                dest.writeString(this.f105731h);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$Kyc$Default;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$Kyc;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Default extends Kyc {

            @NotNull
            public static final Parcelable.Creator<Default> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WorkflowStepNavigation f105732a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final b f105733b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f105734c;
            public final String d;
            public final boolean e;
            public final boolean f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final String f105735g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final boolean f105736h;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    boolean z;
                    boolean z3;
                    boolean z4;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    WorkflowStepNavigation workflowStepNavigationCreateFromParcel = WorkflowStepNavigation.CREATOR.createFromParcel(parcel);
                    b bVar = (b) parcel.readSerializable();
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    boolean z6 = true;
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = true;
                        z6 = false;
                    }
                    if (parcel.readInt() != 0) {
                        z3 = z;
                        z4 = false;
                    } else {
                        z3 = false;
                        z4 = false;
                    }
                    String string3 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z4 = z;
                    }
                    return new Default(workflowStepNavigationCreateFromParcel, string, string2, string3, bVar, z6, z3, z4);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Default[i];
                }
            }

            public Default(WorkflowStepNavigation navigation, String str, String str2, String str3, b countryCode, boolean z, boolean z3, boolean z4) {
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                this.f105732a = navigation;
                this.f105733b = countryCode;
                this.f105734c = str;
                this.d = str2;
                this.e = z;
                this.f = z3;
                this.f105735g = str3;
                this.f105736h = z4;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: G9, reason: from getter */
            public final boolean getE() {
                return this.f105736h;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: H1, reason: from getter */
            public final String getF105812b() {
                return this.d;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: X3, reason: from getter */
            public final boolean getD() {
                return this.f;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep.Kyc
            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getE() {
                return this.e;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep.Kyc
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF105749c() {
                return this.f105734c;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep.Kyc
            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getF105751h() {
                return this.f105735g;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Default)) {
                    return false;
                }
                Default r56 = (Default) obj2;
                return Intrinsics.f(this.f105732a, r56.f105732a) && Intrinsics.f(this.f105733b, r56.f105733b) && Intrinsics.f(this.f105734c, r56.f105734c) && Intrinsics.f(this.d, r56.d) && this.e == r56.e && this.f == r56.f && Intrinsics.f(this.f105735g, r56.f105735g) && this.f105736h == r56.f105736h;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep.Kyc
            /* JADX INFO: renamed from: getCountryCode, reason: from getter */
            public final b getF105748b() {
                return this.f105733b;
            }

            public final int hashCode() {
                int iC = p.a.c(this.f105732a.hashCode() * 31, 31, this.f105733b.f297794a);
                String str = this.f105734c;
                int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.d;
                int iC2 = j6.a.c(j6.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e), 31, this.f);
                String str3 = this.f105735g;
                return Boolean.hashCode(this.f105736h) + ((iC2 + (str3 != null ? str3.hashCode() : 0)) * 31);
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: p7, reason: from getter */
            public final WorkflowStepNavigation getF105811a() {
                return this.f105732a;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f105732a.writeToParcel(dest, i);
                dest.writeSerializable(this.f105733b);
                dest.writeString(this.f105734c);
                dest.writeString(this.d);
                dest.writeInt(this.e ? 1 : 0);
                dest.writeInt(this.f ? 1 : 0);
                dest.writeString(this.f105735g);
                dest.writeInt(this.f105736h ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$Kyc$NameChange;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$Kyc;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NameChange extends Kyc {

            @NotNull
            public static final Parcelable.Creator<NameChange> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WorkflowStepNavigation f105737a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final b f105738b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f105739c;
            public final String d;
            public final boolean e;
            public final boolean f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final boolean f105740g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final String f105741h;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    boolean z;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    WorkflowStepNavigation workflowStepNavigationCreateFromParcel = WorkflowStepNavigation.CREATOR.createFromParcel(parcel);
                    b bVar = (b) parcel.readSerializable();
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    boolean z3 = true;
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = true;
                        z3 = false;
                    }
                    return new NameChange(workflowStepNavigationCreateFromParcel, string, string2, parcel.readString(), bVar, z3, parcel.readInt() != 0 ? z : false, parcel.readInt() != 0 ? z : false);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NameChange[i];
                }
            }

            public NameChange(WorkflowStepNavigation navigation, String str, String stepId, String str2, b countryCode, boolean z, boolean z3, boolean z4) {
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                Intrinsics.checkNotNullParameter(stepId, "stepId");
                this.f105737a = navigation;
                this.f105738b = countryCode;
                this.f105739c = str;
                this.d = stepId;
                this.e = z;
                this.f = z3;
                this.f105740g = z4;
                this.f105741h = str2;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: G9, reason: from getter */
            public final boolean getE() {
                return this.f105740g;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: H1, reason: from getter */
            public final String getF105812b() {
                return this.d;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: X3, reason: from getter */
            public final boolean getD() {
                return this.f;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep.Kyc
            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getE() {
                return this.e;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep.Kyc
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF105749c() {
                return this.f105739c;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep.Kyc
            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getF105751h() {
                return this.f105741h;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof NameChange)) {
                    return false;
                }
                NameChange nameChange = (NameChange) obj2;
                return Intrinsics.f(this.f105737a, nameChange.f105737a) && Intrinsics.f(this.f105738b, nameChange.f105738b) && Intrinsics.f(this.f105739c, nameChange.f105739c) && Intrinsics.f(this.d, nameChange.d) && this.e == nameChange.e && this.f == nameChange.f && this.f105740g == nameChange.f105740g && Intrinsics.f(this.f105741h, nameChange.f105741h);
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep.Kyc
            /* JADX INFO: renamed from: getCountryCode, reason: from getter */
            public final b getF105748b() {
                return this.f105738b;
            }

            public final int hashCode() {
                int iC = p.a.c(this.f105737a.hashCode() * 31, 31, this.f105738b.f297794a);
                String str = this.f105739c;
                int iC2 = j6.a.c(j6.a.c(j6.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.f105740g);
                String str2 = this.f105741h;
                return iC2 + (str2 != null ? str2.hashCode() : 0);
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: p7, reason: from getter */
            public final WorkflowStepNavigation getF105811a() {
                return this.f105737a;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f105737a.writeToParcel(dest, i);
                dest.writeSerializable(this.f105738b);
                dest.writeString(this.f105739c);
                dest.writeString(this.d);
                dest.writeInt(this.e ? 1 : 0);
                dest.writeInt(this.f ? 1 : 0);
                dest.writeInt(this.f105740g ? 1 : 0);
                dest.writeString(this.f105741h);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$Kyc$Savings;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$Kyc;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Savings extends Kyc {

            @NotNull
            public static final Parcelable.Creator<Savings> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WorkflowStepNavigation f105742a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final b f105743b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f105744c;
            public final String d;
            public final boolean e;
            public final boolean f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final String f105745g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final boolean f105746h;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    boolean z;
                    boolean z3;
                    boolean z4;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    WorkflowStepNavigation workflowStepNavigationCreateFromParcel = WorkflowStepNavigation.CREATOR.createFromParcel(parcel);
                    b bVar = (b) parcel.readSerializable();
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    boolean z6 = true;
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = true;
                        z6 = false;
                    }
                    if (parcel.readInt() != 0) {
                        z3 = z;
                        z4 = false;
                    } else {
                        z3 = false;
                        z4 = false;
                    }
                    String string3 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z4 = z;
                    }
                    return new Savings(workflowStepNavigationCreateFromParcel, string, string2, string3, bVar, z6, z3, z4);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Savings[i];
                }
            }

            public Savings(WorkflowStepNavigation navigation, String str, String str2, String str3, b countryCode, boolean z, boolean z3, boolean z4) {
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                this.f105742a = navigation;
                this.f105743b = countryCode;
                this.f105744c = str;
                this.d = str2;
                this.e = z;
                this.f = z3;
                this.f105745g = str3;
                this.f105746h = z4;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: G9, reason: from getter */
            public final boolean getE() {
                return this.f105746h;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: H1, reason: from getter */
            public final String getF105812b() {
                return this.d;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: X3, reason: from getter */
            public final boolean getD() {
                return this.f;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep.Kyc
            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getE() {
                return this.e;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep.Kyc
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF105749c() {
                return this.f105744c;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep.Kyc
            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getF105751h() {
                return this.f105745g;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Savings)) {
                    return false;
                }
                Savings savings = (Savings) obj2;
                return Intrinsics.f(this.f105742a, savings.f105742a) && Intrinsics.f(this.f105743b, savings.f105743b) && Intrinsics.f(this.f105744c, savings.f105744c) && Intrinsics.f(this.d, savings.d) && this.e == savings.e && this.f == savings.f && Intrinsics.f(this.f105745g, savings.f105745g) && this.f105746h == savings.f105746h;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep.Kyc
            /* JADX INFO: renamed from: getCountryCode, reason: from getter */
            public final b getF105748b() {
                return this.f105743b;
            }

            public final int hashCode() {
                int iC = p.a.c(this.f105742a.hashCode() * 31, 31, this.f105743b.f297794a);
                String str = this.f105744c;
                int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.d;
                int iC2 = j6.a.c(j6.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e), 31, this.f);
                String str3 = this.f105745g;
                return Boolean.hashCode(this.f105746h) + ((iC2 + (str3 != null ? str3.hashCode() : 0)) * 31);
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: p7, reason: from getter */
            public final WorkflowStepNavigation getF105811a() {
                return this.f105742a;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f105742a.writeToParcel(dest, i);
                dest.writeSerializable(this.f105743b);
                dest.writeString(this.f105744c);
                dest.writeString(this.d);
                dest.writeInt(this.e ? 1 : 0);
                dest.writeInt(this.f ? 1 : 0);
                dest.writeString(this.f105745g);
                dest.writeInt(this.f105746h ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$Kyc$TaxResidency;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$Kyc;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TaxResidency extends Kyc {

            @NotNull
            public static final Parcelable.Creator<TaxResidency> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WorkflowStepNavigation f105747a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final b f105748b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f105749c;
            public final String d;
            public final boolean e;
            public final boolean f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final boolean f105750g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final String f105751h;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    boolean z;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    WorkflowStepNavigation workflowStepNavigationCreateFromParcel = WorkflowStepNavigation.CREATOR.createFromParcel(parcel);
                    b bVar = (b) parcel.readSerializable();
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    boolean z3 = true;
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = true;
                        z3 = false;
                    }
                    return new TaxResidency(workflowStepNavigationCreateFromParcel, string, string2, parcel.readString(), bVar, z3, parcel.readInt() != 0 ? z : false, parcel.readInt() != 0 ? z : false);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new TaxResidency[i];
                }
            }

            public TaxResidency(WorkflowStepNavigation navigation, String str, String str2, String str3, b countryCode, boolean z, boolean z3, boolean z4) {
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                this.f105747a = navigation;
                this.f105748b = countryCode;
                this.f105749c = str;
                this.d = str2;
                this.e = z;
                this.f = z3;
                this.f105750g = z4;
                this.f105751h = str3;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: G9, reason: from getter */
            public final boolean getE() {
                return this.f105750g;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: H1, reason: from getter */
            public final String getF105812b() {
                return this.d;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: X3, reason: from getter */
            public final boolean getD() {
                return this.f;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep.Kyc
            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getE() {
                return this.e;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep.Kyc
            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getF105749c() {
                return this.f105749c;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep.Kyc
            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getF105751h() {
                return this.f105751h;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof TaxResidency)) {
                    return false;
                }
                TaxResidency taxResidency = (TaxResidency) obj2;
                return Intrinsics.f(this.f105747a, taxResidency.f105747a) && Intrinsics.f(this.f105748b, taxResidency.f105748b) && Intrinsics.f(this.f105749c, taxResidency.f105749c) && Intrinsics.f(this.d, taxResidency.d) && this.e == taxResidency.e && this.f == taxResidency.f && this.f105750g == taxResidency.f105750g && Intrinsics.f(this.f105751h, taxResidency.f105751h);
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep.Kyc
            /* JADX INFO: renamed from: getCountryCode, reason: from getter */
            public final b getF105748b() {
                return this.f105748b;
            }

            public final int hashCode() {
                int iC = p.a.c(this.f105747a.hashCode() * 31, 31, this.f105748b.f297794a);
                String str = this.f105749c;
                int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.d;
                int iC2 = j6.a.c(j6.a.c(j6.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.f105750g);
                String str3 = this.f105751h;
                return iC2 + (str3 != null ? str3.hashCode() : 0);
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: p7, reason: from getter */
            public final WorkflowStepNavigation getF105811a() {
                return this.f105747a;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f105747a.writeToParcel(dest, i);
                dest.writeSerializable(this.f105748b);
                dest.writeString(this.f105749c);
                dest.writeString(this.d);
                dest.writeInt(this.e ? 1 : 0);
                dest.writeInt(this.f ? 1 : 0);
                dest.writeInt(this.f105750g ? 1 : 0);
                dest.writeString(this.f105751h);
            }
        }

        /* JADX INFO: renamed from: com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep$Kyc$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        private Kyc() {
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean getE();

        /* JADX INFO: renamed from: b */
        public abstract String getF105749c();

        /* JADX INFO: renamed from: c */
        public abstract String getF105751h();

        /* JADX INFO: renamed from: getCountryCode */
        public abstract b getF105748b();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$NavigationHub;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NavigationHub implements SharedStep {

        @NotNull
        public static final Parcelable.Creator<NavigationHub> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowStepNavigation f105752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105753b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f105754c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NavigationHub(WorkflowStepNavigation.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NavigationHub[i];
            }
        }

        public NavigationHub(WorkflowStepNavigation navigation, String stepId, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(stepId, "stepId");
            this.f105752a = navigation;
            this.f105753b = stepId;
            this.f105754c = z;
            this.d = z3;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: G9, reason: from getter */
        public final boolean getE() {
            return this.d;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF105812b() {
            return this.f105753b;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: X3, reason: from getter */
        public final boolean getD() {
            return this.f105754c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NavigationHub)) {
                return false;
            }
            NavigationHub navigationHub = (NavigationHub) obj2;
            return Intrinsics.f(this.f105752a, navigationHub.f105752a) && Intrinsics.f(this.f105753b, navigationHub.f105753b) && this.f105754c == navigationHub.f105754c && this.d == navigationHub.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + j6.a.c(p.a.c(this.f105752a.hashCode() * 31, 31, this.f105753b), 31, this.f105754c);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: p7, reason: from getter */
        public final WorkflowStepNavigation getF105811a() {
            return this.f105752a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f105752a.writeToParcel(dest, i);
            dest.writeString(this.f105753b);
            dest.writeInt(this.f105754c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$OnboardingStep;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep;", "Ltil/b;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OnboardingStep implements SharedStep, til.b {

        @NotNull
        public static final Parcelable.Creator<OnboardingStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowStepNavigation f105755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105757c;
        public final boolean d;
        public final String e;
        public final boolean f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                WorkflowStepNavigation workflowStepNavigationCreateFromParcel = WorkflowStepNavigation.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                String string2 = parcel.readString();
                boolean z3 = true;
                boolean z4 = false;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = true;
                    z3 = false;
                }
                String string3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z4 = z;
                }
                return new OnboardingStep(workflowStepNavigationCreateFromParcel, string, string2, string3, z3, z4);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OnboardingStep[i];
            }
        }

        public OnboardingStep(WorkflowStepNavigation navigation, String str, String workflowStepId, String name, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(workflowStepId, "workflowStepId");
            Intrinsics.checkNotNullParameter(name, "name");
            this.f105755a = navigation;
            this.f105756b = str;
            this.f105757c = workflowStepId;
            this.d = z;
            this.e = name;
            this.f = z3;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: G9, reason: from getter */
        public final boolean getE() {
            return this.f;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF105812b() {
            return this.f105756b;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: X3, reason: from getter */
        public final boolean getD() {
            return this.d;
        }

        @Override // til.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF105757c() {
            return this.f105757c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OnboardingStep)) {
                return false;
            }
            OnboardingStep onboardingStep = (OnboardingStep) obj2;
            return Intrinsics.f(this.f105755a, onboardingStep.f105755a) && Intrinsics.f(this.f105756b, onboardingStep.f105756b) && Intrinsics.f(this.f105757c, onboardingStep.f105757c) && this.d == onboardingStep.d && Intrinsics.f(this.e, onboardingStep.e) && this.f == onboardingStep.f;
        }

        @Override // til.b
        /* JADX INFO: renamed from: getName, reason: from getter */
        public final String getE() {
            return this.e;
        }

        public final int hashCode() {
            int iHashCode = this.f105755a.hashCode() * 31;
            String str = this.f105756b;
            return Boolean.hashCode(this.f) + p.a.c(j6.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f105757c), 31, this.d), 31, this.e);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: p7, reason: from getter */
        public final WorkflowStepNavigation getF105811a() {
            return this.f105755a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f105755a.writeToParcel(dest, i);
            dest.writeString(this.f105756b);
            dest.writeString(this.f105757c);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeString(this.e);
            dest.writeInt(this.f ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$PepConnections;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PepConnections implements SharedStep {

        @NotNull
        public static final Parcelable.Creator<PepConnections> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowStepNavigation f105758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f105759b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105760c;
        public final boolean d;
        public final h e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                WorkflowStepNavigation workflowStepNavigationCreateFromParcel = WorkflowStepNavigation.CREATOR.createFromParcel(parcel);
                boolean z4 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                    z3 = true;
                } else {
                    z = false;
                    z3 = true;
                }
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    z3 = z;
                }
                return new PepConnections(workflowStepNavigationCreateFromParcel, z4, string, z3, h.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PepConnections[i];
            }
        }

        public PepConnections(WorkflowStepNavigation navigation, boolean z, String stepId, boolean z3, h workflowScreenName) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(stepId, "stepId");
            Intrinsics.checkNotNullParameter(workflowScreenName, "workflowScreenName");
            this.f105758a = navigation;
            this.f105759b = z;
            this.f105760c = stepId;
            this.d = z3;
            this.e = workflowScreenName;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: G9, reason: from getter */
        public final boolean getE() {
            return this.f105759b;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF105812b() {
            return this.f105760c;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: X3, reason: from getter */
        public final boolean getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PepConnections)) {
                return false;
            }
            PepConnections pepConnections = (PepConnections) obj2;
            return Intrinsics.f(this.f105758a, pepConnections.f105758a) && this.f105759b == pepConnections.f105759b && Intrinsics.f(this.f105760c, pepConnections.f105760c) && this.d == pepConnections.d && this.e == pepConnections.e;
        }

        public final int hashCode() {
            return this.e.hashCode() + j6.a.c(p.a.c(j6.a.c(this.f105758a.hashCode() * 31, 31, this.f105759b), 31, this.f105760c), 31, this.d);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: p7, reason: from getter */
        public final WorkflowStepNavigation getF105811a() {
            return this.f105758a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f105758a.writeToParcel(dest, i);
            dest.writeInt(this.f105759b ? 1 : 0);
            dest.writeString(this.f105760c);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeString(this.e.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$PodBeneficiaries;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PodBeneficiaries implements SharedStep {

        @NotNull
        public static final Parcelable.Creator<PodBeneficiaries> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowStepNavigation f105761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f105763c;
        public final boolean d;
        public final b e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final d f105764g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                WorkflowStepNavigation workflowStepNavigationCreateFromParcel = WorkflowStepNavigation.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                boolean z4 = false;
                boolean z6 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = true;
                    z6 = z;
                }
                b bVar = (b) parcel.readSerializable();
                if (parcel.readInt() != 0) {
                    z = z3;
                }
                return new PodBeneficiaries(workflowStepNavigationCreateFromParcel, string, z4, z6, bVar, z, d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PodBeneficiaries[i];
            }
        }

        public PodBeneficiaries(WorkflowStepNavigation navigation, String stepId, boolean z, boolean z3, b countryCode, boolean z4, d flowType) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(stepId, "stepId");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            this.f105761a = navigation;
            this.f105762b = stepId;
            this.f105763c = z;
            this.d = z3;
            this.e = countryCode;
            this.f = z4;
            this.f105764g = flowType;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: G9, reason: from getter */
        public final boolean getE() {
            return this.d;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF105812b() {
            return this.f105762b;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: X3, reason: from getter */
        public final boolean getD() {
            return this.f105763c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PodBeneficiaries)) {
                return false;
            }
            PodBeneficiaries podBeneficiaries = (PodBeneficiaries) obj2;
            return Intrinsics.f(this.f105761a, podBeneficiaries.f105761a) && Intrinsics.f(this.f105762b, podBeneficiaries.f105762b) && this.f105763c == podBeneficiaries.f105763c && this.d == podBeneficiaries.d && Intrinsics.f(this.e, podBeneficiaries.e) && this.f == podBeneficiaries.f && this.f105764g == podBeneficiaries.f105764g;
        }

        public final int hashCode() {
            return this.f105764g.hashCode() + j6.a.c(p.a.c(j6.a.c(j6.a.c(p.a.c(this.f105761a.hashCode() * 31, 31, this.f105762b), 31, this.f105763c), 31, this.d), 31, this.e.f297794a), 31, this.f);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: p7, reason: from getter */
        public final WorkflowStepNavigation getF105811a() {
            return this.f105761a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f105761a.writeToParcel(dest, i);
            dest.writeString(this.f105762b);
            dest.writeInt(this.f105763c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeSerializable(this.e);
            dest.writeInt(this.f ? 1 : 0);
            dest.writeString(this.f105764g.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$PricingPlansPrompt;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PricingPlansPrompt implements SharedStep {

        @NotNull
        public static final Parcelable.Creator<PricingPlansPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowStepNavigation f105765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105766b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f105767c;
        public final boolean d;
        public final String e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                WorkflowStepNavigation workflowStepNavigationCreateFromParcel = WorkflowStepNavigation.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                boolean z3 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = true;
                    z3 = false;
                }
                return new PricingPlansPrompt(workflowStepNavigationCreateFromParcel, string, parcel.readString(), z3, parcel.readInt() != 0 ? z : false);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PricingPlansPrompt[i];
            }
        }

        public PricingPlansPrompt(WorkflowStepNavigation navigation, String stepId, String promptType, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(stepId, "stepId");
            Intrinsics.checkNotNullParameter(promptType, "promptType");
            this.f105765a = navigation;
            this.f105766b = stepId;
            this.f105767c = z;
            this.d = z3;
            this.e = promptType;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: G9, reason: from getter */
        public final boolean getE() {
            return this.d;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF105812b() {
            return this.f105766b;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: X3, reason: from getter */
        public final boolean getD() {
            return this.f105767c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PricingPlansPrompt)) {
                return false;
            }
            PricingPlansPrompt pricingPlansPrompt = (PricingPlansPrompt) obj2;
            return Intrinsics.f(this.f105765a, pricingPlansPrompt.f105765a) && Intrinsics.f(this.f105766b, pricingPlansPrompt.f105766b) && this.f105767c == pricingPlansPrompt.f105767c && this.d == pricingPlansPrompt.d && Intrinsics.f(this.e, pricingPlansPrompt.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + j6.a.c(j6.a.c(p.a.c(this.f105765a.hashCode() * 31, 31, this.f105766b), 31, this.f105767c), 31, this.d);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: p7, reason: from getter */
        public final WorkflowStepNavigation getF105811a() {
            return this.f105765a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f105765a.writeToParcel(dest, i);
            dest.writeString(this.f105766b);
            dest.writeInt(this.f105767c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeString(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$Qes;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep;", "<init>", "()V", "QesWorkflowStep", "QesEligibilityStep", "WorkflowConfiguration", "com/revolut/shared/feature/workflow/engine/api/workflow/a", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$Qes$QesEligibilityStep;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$Qes$QesWorkflowStep;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Qes implements SharedStep {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$Qes$QesEligibilityStep;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$Qes;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class QesEligibilityStep extends Qes {

            @NotNull
            public static final Parcelable.Creator<QesEligibilityStep> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WorkflowStepNavigation f105768a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f105769b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final b f105770c;
            public final boolean d;
            public final boolean e;
            public final boolean f;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    boolean z;
                    boolean z3;
                    b bVar;
                    boolean z4;
                    boolean z6;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    WorkflowStepNavigation workflowStepNavigationCreateFromParcel = WorkflowStepNavigation.CREATOR.createFromParcel(parcel);
                    boolean z11 = false;
                    if (parcel.readInt() != 0) {
                        z = false;
                        z11 = true;
                    } else {
                        z = false;
                    }
                    b bVar2 = (b) parcel.readSerializable();
                    if (parcel.readInt() != 0) {
                        z3 = true;
                        bVar = bVar2;
                        z4 = true;
                    } else {
                        z3 = true;
                        bVar = bVar2;
                        z4 = z;
                    }
                    if (parcel.readInt() != 0) {
                        z6 = z3;
                    } else {
                        z6 = z3;
                        z3 = z;
                    }
                    if (parcel.readInt() == 0) {
                        z6 = z;
                    }
                    return new QesEligibilityStep(workflowStepNavigationCreateFromParcel, z11, bVar, z4, z3, z6);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new QesEligibilityStep[i];
                }
            }

            public QesEligibilityStep(WorkflowStepNavigation navigation, boolean z, b userCountryCode, boolean z3, boolean z4, boolean z6) {
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                Intrinsics.checkNotNullParameter(userCountryCode, "userCountryCode");
                this.f105768a = navigation;
                this.f105769b = z;
                this.f105770c = userCountryCode;
                this.d = z3;
                this.e = z4;
                this.f = z6;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: G9, reason: from getter */
            public final boolean getE() {
                return this.f;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: X3, reason: from getter */
            public final boolean getD() {
                return this.e;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep.Qes
            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getF105773c() {
                return this.d;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep.Qes
            /* JADX INFO: renamed from: b, reason: from getter */
            public final boolean getF105772b() {
                return this.f105769b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof QesEligibilityStep)) {
                    return false;
                }
                QesEligibilityStep qesEligibilityStep = (QesEligibilityStep) obj2;
                return Intrinsics.f(this.f105768a, qesEligibilityStep.f105768a) && this.f105769b == qesEligibilityStep.f105769b && Intrinsics.f(this.f105770c, qesEligibilityStep.f105770c) && this.d == qesEligibilityStep.d && this.e == qesEligibilityStep.e && this.f == qesEligibilityStep.f;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f) + j6.a.c(j6.a.c(p.a.c(j6.a.c(this.f105768a.hashCode() * 31, 31, this.f105769b), 31, this.f105770c.f297794a), 31, this.d), 31, this.e);
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: p7, reason: from getter */
            public final WorkflowStepNavigation getF105811a() {
                return this.f105768a;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f105768a.writeToParcel(dest, i);
                dest.writeInt(this.f105769b ? 1 : 0);
                dest.writeSerializable(this.f105770c);
                dest.writeInt(this.d ? 1 : 0);
                dest.writeInt(this.e ? 1 : 0);
                dest.writeInt(this.f ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$Qes$QesWorkflowStep;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$Qes;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class QesWorkflowStep extends Qes {

            @NotNull
            public static final Parcelable.Creator<QesWorkflowStep> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WorkflowStepNavigation f105771a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f105772b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f105773c;
            public final WorkflowConfiguration d;
            public final boolean e;
            public final boolean f;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    boolean z;
                    boolean z3;
                    boolean z4;
                    WorkflowConfiguration workflowConfiguration;
                    boolean z6;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    WorkflowStepNavigation workflowStepNavigationCreateFromParcel = WorkflowStepNavigation.CREATOR.createFromParcel(parcel);
                    boolean z11 = false;
                    boolean z12 = true;
                    if (parcel.readInt() != 0) {
                        z = false;
                        z11 = true;
                    } else {
                        z = false;
                    }
                    if (parcel.readInt() != 0) {
                        z3 = true;
                    } else {
                        z3 = true;
                        z12 = z;
                    }
                    WorkflowConfiguration workflowConfigurationCreateFromParcel = WorkflowConfiguration.CREATOR.createFromParcel(parcel);
                    if (parcel.readInt() != 0) {
                        z4 = z3;
                        workflowConfiguration = workflowConfigurationCreateFromParcel;
                        z6 = z4;
                    } else {
                        z4 = z3;
                        workflowConfiguration = workflowConfigurationCreateFromParcel;
                        z6 = z;
                    }
                    if (parcel.readInt() == 0) {
                        z4 = z;
                    }
                    return new QesWorkflowStep(workflowStepNavigationCreateFromParcel, z11, z12, workflowConfiguration, z6, z4);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new QesWorkflowStep[i];
                }
            }

            public QesWorkflowStep(WorkflowStepNavigation navigation, boolean z, boolean z3, WorkflowConfiguration workflowConfiguration, boolean z4, boolean z6) {
                Intrinsics.checkNotNullParameter(navigation, "navigation");
                Intrinsics.checkNotNullParameter(workflowConfiguration, "workflowConfiguration");
                this.f105771a = navigation;
                this.f105772b = z;
                this.f105773c = z3;
                this.d = workflowConfiguration;
                this.e = z4;
                this.f = z6;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: G9, reason: from getter */
            public final boolean getE() {
                return this.f;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: X3, reason: from getter */
            public final boolean getD() {
                return this.e;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep.Qes
            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getF105773c() {
                return this.f105773c;
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.SharedStep.Qes
            /* JADX INFO: renamed from: b, reason: from getter */
            public final boolean getF105772b() {
                return this.f105772b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof QesWorkflowStep)) {
                    return false;
                }
                QesWorkflowStep qesWorkflowStep = (QesWorkflowStep) obj2;
                return Intrinsics.f(this.f105771a, qesWorkflowStep.f105771a) && this.f105772b == qesWorkflowStep.f105772b && this.f105773c == qesWorkflowStep.f105773c && Intrinsics.f(this.d, qesWorkflowStep.d) && this.e == qesWorkflowStep.e && this.f == qesWorkflowStep.f;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f) + j6.a.c((this.d.hashCode() + j6.a.c(j6.a.c(this.f105771a.hashCode() * 31, 31, this.f105772b), 31, this.f105773c)) * 31, 31, this.e);
            }

            @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
            /* JADX INFO: renamed from: p7, reason: from getter */
            public final WorkflowStepNavigation getF105811a() {
                return this.f105771a;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f105771a.writeToParcel(dest, i);
                dest.writeInt(this.f105772b ? 1 : 0);
                dest.writeInt(this.f105773c ? 1 : 0);
                this.d.writeToParcel(dest, i);
                dest.writeInt(this.e ? 1 : 0);
                dest.writeInt(this.f ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$Qes$WorkflowConfiguration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class WorkflowConfiguration implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<WorkflowConfiguration> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f105774a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final j f105775b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final com.revolut.shared.feature.workflow.engine.api.workflow.a f105776c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new WorkflowConfiguration(parcel.readString(), j.valueOf(parcel.readString()), com.revolut.shared.feature.workflow.engine.api.workflow.a.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new WorkflowConfiguration[i];
                }
            }

            public WorkflowConfiguration(String workFlowStepId, j signatureProcessType, com.revolut.shared.feature.workflow.engine.api.workflow.a authenticationMethod) {
                Intrinsics.checkNotNullParameter(workFlowStepId, "workFlowStepId");
                Intrinsics.checkNotNullParameter(signatureProcessType, "signatureProcessType");
                Intrinsics.checkNotNullParameter(authenticationMethod, "authenticationMethod");
                this.f105774a = workFlowStepId;
                this.f105775b = signatureProcessType;
                this.f105776c = authenticationMethod;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof WorkflowConfiguration)) {
                    return false;
                }
                WorkflowConfiguration workflowConfiguration = (WorkflowConfiguration) obj2;
                return Intrinsics.f(this.f105774a, workflowConfiguration.f105774a) && this.f105775b == workflowConfiguration.f105775b && this.f105776c == workflowConfiguration.f105776c;
            }

            public final int hashCode() {
                return this.f105776c.hashCode() + ((this.f105775b.hashCode() + (this.f105774a.hashCode() * 31)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f105774a);
                dest.writeString(this.f105775b.name());
                dest.writeString(this.f105776c.name());
            }
        }

        private Qes() {
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: H1 */
        public final String getF105812b() {
            return null;
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean getF105773c();

        /* JADX INFO: renamed from: b */
        public abstract boolean getF105772b();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$RegisteredIdentitySignIn;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RegisteredIdentitySignIn implements SharedStep {

        @NotNull
        public static final Parcelable.Creator<RegisteredIdentitySignIn> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowStepNavigation f105777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105778b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f105779c;
        public final String d;
        public final String e;
        public final boolean f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                String str;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                WorkflowStepNavigation workflowStepNavigationCreateFromParcel = WorkflowStepNavigation.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                boolean z3 = parcel.readInt() != 0;
                String str2 = ((IndividualIdentityId) parcel.readParcelable(RegisteredIdentitySignIn.class.getClassLoader())).f74763a;
                String str3 = ((RegisteredIdentityId) parcel.readParcelable(RegisteredIdentitySignIn.class.getClassLoader())).f74764a;
                if (parcel.readInt() != 0) {
                    str = str2;
                    z = true;
                } else {
                    z = false;
                    str = str2;
                }
                return new RegisteredIdentitySignIn(workflowStepNavigationCreateFromParcel, string, str, str3, z3, z);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RegisteredIdentitySignIn[i];
            }
        }

        public RegisteredIdentitySignIn(WorkflowStepNavigation navigation, String str, String identityId, String registeredIdentityId, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(identityId, "identityId");
            Intrinsics.checkNotNullParameter(registeredIdentityId, "registeredIdentityId");
            this.f105777a = navigation;
            this.f105778b = str;
            this.f105779c = z;
            this.d = identityId;
            this.e = registeredIdentityId;
            this.f = z3;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: G9, reason: from getter */
        public final boolean getE() {
            return this.f;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF105812b() {
            return this.f105778b;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: X3, reason: from getter */
        public final boolean getD() {
            return this.f105779c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RegisteredIdentitySignIn)) {
                return false;
            }
            RegisteredIdentitySignIn registeredIdentitySignIn = (RegisteredIdentitySignIn) obj2;
            return Intrinsics.f(this.f105777a, registeredIdentitySignIn.f105777a) && Intrinsics.f(this.f105778b, registeredIdentitySignIn.f105778b) && this.f105779c == registeredIdentitySignIn.f105779c && Intrinsics.f(this.d, registeredIdentitySignIn.d) && Intrinsics.f(this.e, registeredIdentitySignIn.e) && this.f == registeredIdentitySignIn.f;
        }

        public final int hashCode() {
            int iHashCode = this.f105777a.hashCode() * 31;
            String str = this.f105778b;
            return Boolean.hashCode(this.f) + p.a.c(p.a.c(j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f105779c), 31, this.d), 31, this.e);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: p7, reason: from getter */
        public final WorkflowStepNavigation getF105811a() {
            return this.f105777a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f105777a.writeToParcel(dest, i);
            dest.writeString(this.f105778b);
            dest.writeInt(this.f105779c ? 1 : 0);
            dest.writeParcelable(new IndividualIdentityId(this.d), i);
            e.x(this.e, dest, i);
            dest.writeInt(this.f ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$ResidentialAddressCollection;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ResidentialAddressCollection implements SharedStep {

        @NotNull
        public static final Parcelable.Creator<ResidentialAddressCollection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowStepNavigation f105780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105781b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f105782c;
        public final boolean d;
        public final com.revolut.feature.address.models.Address e;
        public final sil.a f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                WorkflowStepNavigation workflowStepNavigationCreateFromParcel = WorkflowStepNavigation.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                boolean z3 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                return new ResidentialAddressCollection(workflowStepNavigationCreateFromParcel, string, z3, parcel.readInt() == 0 ? z : true, (com.revolut.feature.address.models.Address) parcel.readParcelable(ResidentialAddressCollection.class.getClassLoader()), sil.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ResidentialAddressCollection[i];
            }
        }

        public ResidentialAddressCollection(WorkflowStepNavigation navigation, String stepId, boolean z, boolean z3, com.revolut.feature.address.models.Address address, sil.a countryChoiceState) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(stepId, "stepId");
            Intrinsics.checkNotNullParameter(countryChoiceState, "countryChoiceState");
            this.f105780a = navigation;
            this.f105781b = stepId;
            this.f105782c = z;
            this.d = z3;
            this.e = address;
            this.f = countryChoiceState;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: G9, reason: from getter */
        public final boolean getE() {
            return this.d;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF105812b() {
            return this.f105781b;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: X3, reason: from getter */
        public final boolean getD() {
            return this.f105782c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ResidentialAddressCollection)) {
                return false;
            }
            ResidentialAddressCollection residentialAddressCollection = (ResidentialAddressCollection) obj2;
            return Intrinsics.f(this.f105780a, residentialAddressCollection.f105780a) && Intrinsics.f(this.f105781b, residentialAddressCollection.f105781b) && this.f105782c == residentialAddressCollection.f105782c && this.d == residentialAddressCollection.d && Intrinsics.f(this.e, residentialAddressCollection.e) && this.f == residentialAddressCollection.f;
        }

        public final int hashCode() {
            int iC = j6.a.c(j6.a.c(p.a.c(this.f105780a.hashCode() * 31, 31, this.f105781b), 31, this.f105782c), 31, this.d);
            com.revolut.feature.address.models.Address address = this.e;
            return this.f.hashCode() + ((iC + (address == null ? 0 : address.hashCode())) * 31);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: p7, reason: from getter */
        public final WorkflowStepNavigation getF105811a() {
            return this.f105780a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f105780a.writeToParcel(dest, i);
            dest.writeString(this.f105781b);
            dest.writeInt(this.f105782c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeParcelable(this.e, i);
            dest.writeString(this.f.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$ResidentialAddressCollectionV2;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep;", "", "toString", "()Ljava/lang/String;", "PrefillChoice", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ResidentialAddressCollectionV2 implements SharedStep {

        @NotNull
        public static final Parcelable.Creator<ResidentialAddressCollectionV2> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowStepNavigation f105783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105784b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f105785c;
        public final boolean d;
        public final PrefillChoice e;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$ResidentialAddressCollectionV2$PrefillChoice;", "Landroid/os/Parcelable;", "<init>", "()V", "Address", "Country", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$ResidentialAddressCollectionV2$PrefillChoice$Address;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$ResidentialAddressCollectionV2$PrefillChoice$Country;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static abstract class PrefillChoice implements Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$ResidentialAddressCollectionV2$PrefillChoice$Address;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$ResidentialAddressCollectionV2$PrefillChoice;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Address extends PrefillChoice {

                @NotNull
                public static final Parcelable.Creator<Address> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final com.revolut.feature.address.models.Address f105786a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Address((com.revolut.feature.address.models.Address) parcel.readParcelable(Address.class.getClassLoader()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Address[i];
                    }
                }

                public Address(com.revolut.feature.address.models.Address address) {
                    Intrinsics.checkNotNullParameter(address, "address");
                    this.f105786a = address;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof Address) && Intrinsics.f(this.f105786a, ((Address) obj2).f105786a);
                }

                public final int hashCode() {
                    return this.f105786a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeParcelable(this.f105786a, i);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$ResidentialAddressCollectionV2$PrefillChoice$Country;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$ResidentialAddressCollectionV2$PrefillChoice;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Country extends PrefillChoice {

                @NotNull
                public static final Parcelable.Creator<Country> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final b f105787a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Country((b) parcel.readSerializable());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Country[i];
                    }
                }

                public Country(b countryCode) {
                    Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                    this.f105787a = countryCode;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof Country) && Intrinsics.f(this.f105787a, ((Country) obj2).f105787a);
                }

                public final int hashCode() {
                    return this.f105787a.f297794a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeSerializable(this.f105787a);
                }
            }

            private PrefillChoice() {
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                WorkflowStepNavigation workflowStepNavigationCreateFromParcel = WorkflowStepNavigation.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                boolean z3 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                return new ResidentialAddressCollectionV2(workflowStepNavigationCreateFromParcel, string, z3, parcel.readInt() == 0 ? z : true, (PrefillChoice) parcel.readParcelable(ResidentialAddressCollectionV2.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ResidentialAddressCollectionV2[i];
            }
        }

        public ResidentialAddressCollectionV2(WorkflowStepNavigation navigation, String stepId, boolean z, boolean z3, PrefillChoice prefillChoice) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(stepId, "stepId");
            Intrinsics.checkNotNullParameter(prefillChoice, "prefillChoice");
            this.f105783a = navigation;
            this.f105784b = stepId;
            this.f105785c = z;
            this.d = z3;
            this.e = prefillChoice;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: G9, reason: from getter */
        public final boolean getE() {
            return this.d;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF105812b() {
            return this.f105784b;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: X3, reason: from getter */
        public final boolean getD() {
            return this.f105785c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ResidentialAddressCollectionV2)) {
                return false;
            }
            ResidentialAddressCollectionV2 residentialAddressCollectionV2 = (ResidentialAddressCollectionV2) obj2;
            return Intrinsics.f(this.f105783a, residentialAddressCollectionV2.f105783a) && Intrinsics.f(this.f105784b, residentialAddressCollectionV2.f105784b) && this.f105785c == residentialAddressCollectionV2.f105785c && this.d == residentialAddressCollectionV2.d && Intrinsics.f(this.e, residentialAddressCollectionV2.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + j6.a.c(j6.a.c(p.a.c(this.f105783a.hashCode() * 31, 31, this.f105784b), 31, this.f105785c), 31, this.d);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: p7, reason: from getter */
        public final WorkflowStepNavigation getF105811a() {
            return this.f105783a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f105783a.writeToParcel(dest, i);
            dest.writeString(this.f105784b);
            dest.writeInt(this.f105785c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeParcelable(this.e, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$RiskAssessment;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RiskAssessment implements SharedStep {

        @NotNull
        public static final Parcelable.Creator<RiskAssessment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowStepNavigation f105788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f105790c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RiskAssessment(WorkflowStepNavigation.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RiskAssessment[i];
            }
        }

        public RiskAssessment(WorkflowStepNavigation navigation, String stepId, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(stepId, "stepId");
            this.f105788a = navigation;
            this.f105789b = stepId;
            this.f105790c = z;
            this.d = z3;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: G9, reason: from getter */
        public final boolean getE() {
            return this.d;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF105812b() {
            return this.f105789b;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: X3, reason: from getter */
        public final boolean getD() {
            return this.f105790c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RiskAssessment)) {
                return false;
            }
            RiskAssessment riskAssessment = (RiskAssessment) obj2;
            return Intrinsics.f(this.f105788a, riskAssessment.f105788a) && Intrinsics.f(this.f105789b, riskAssessment.f105789b) && this.f105790c == riskAssessment.f105790c && this.d == riskAssessment.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + j6.a.c(p.a.c(this.f105788a.hashCode() * 31, 31, this.f105789b), 31, this.f105790c);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: p7, reason: from getter */
        public final WorkflowStepNavigation getF105811a() {
            return this.f105788a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f105788a.writeToParcel(dest, i);
            dest.writeString(this.f105789b);
            dest.writeInt(this.f105790c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$SendGuardianInvitation;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SendGuardianInvitation implements SharedStep {

        @NotNull
        public static final Parcelable.Creator<SendGuardianInvitation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowStepNavigation f105791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f105793c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SendGuardianInvitation(WorkflowStepNavigation.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SendGuardianInvitation[i];
            }
        }

        public SendGuardianInvitation(WorkflowStepNavigation navigation, String stepId, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(stepId, "stepId");
            this.f105791a = navigation;
            this.f105792b = stepId;
            this.f105793c = z;
            this.d = z3;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: G9, reason: from getter */
        public final boolean getE() {
            return this.d;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF105812b() {
            return this.f105792b;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: X3, reason: from getter */
        public final boolean getD() {
            return this.f105793c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SendGuardianInvitation)) {
                return false;
            }
            SendGuardianInvitation sendGuardianInvitation = (SendGuardianInvitation) obj2;
            return Intrinsics.f(this.f105791a, sendGuardianInvitation.f105791a) && Intrinsics.f(this.f105792b, sendGuardianInvitation.f105792b) && this.f105793c == sendGuardianInvitation.f105793c && this.d == sendGuardianInvitation.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + j6.a.c(p.a.c(this.f105791a.hashCode() * 31, 31, this.f105792b), 31, this.f105793c);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: p7, reason: from getter */
        public final WorkflowStepNavigation getF105811a() {
            return this.f105791a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f105791a.writeToParcel(dest, i);
            dest.writeString(this.f105792b);
            dest.writeInt(this.f105793c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$TaxResidenciesCollection;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxResidenciesCollection implements SharedStep {

        @NotNull
        public static final Parcelable.Creator<TaxResidenciesCollection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowStepNavigation f105794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105796c;
        public final String d;
        public final boolean e;
        public final WorkflowStepConfiguration.Screen.TaxResidenciesCollection.ProductConfigurationKey f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f105797g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f105798h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                WorkflowStepConfiguration.Screen.TaxResidenciesCollection.ProductConfigurationKey productConfigurationKey;
                boolean z4;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                WorkflowStepNavigation workflowStepNavigationCreateFromParcel = WorkflowStepNavigation.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                boolean z6 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z6 = true;
                } else {
                    z = false;
                }
                WorkflowStepConfiguration.Screen.TaxResidenciesCollection.ProductConfigurationKey productConfigurationKeyCreateFromParcel = WorkflowStepConfiguration.Screen.TaxResidenciesCollection.ProductConfigurationKey.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    z3 = true;
                    productConfigurationKey = productConfigurationKeyCreateFromParcel;
                    z4 = true;
                } else {
                    z3 = true;
                    productConfigurationKey = productConfigurationKeyCreateFromParcel;
                    z4 = z;
                }
                if (parcel.readInt() == 0) {
                    z3 = z;
                }
                return new TaxResidenciesCollection(workflowStepNavigationCreateFromParcel, string, string2, string3, z6, productConfigurationKey, z4, z3);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxResidenciesCollection[i];
            }
        }

        public TaxResidenciesCollection(WorkflowStepNavigation navigation, String stepId, String str, String flowType, boolean z, WorkflowStepConfiguration.Screen.TaxResidenciesCollection.ProductConfigurationKey productConfigurationKey, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(stepId, "stepId");
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            Intrinsics.checkNotNullParameter(productConfigurationKey, "productConfigurationKey");
            this.f105794a = navigation;
            this.f105795b = stepId;
            this.f105796c = str;
            this.d = flowType;
            this.e = z;
            this.f = productConfigurationKey;
            this.f105797g = z3;
            this.f105798h = z4;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: G9, reason: from getter */
        public final boolean getE() {
            return this.f105798h;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF105812b() {
            return this.f105795b;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: X3, reason: from getter */
        public final boolean getD() {
            return this.f105797g;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TaxResidenciesCollection)) {
                return false;
            }
            TaxResidenciesCollection taxResidenciesCollection = (TaxResidenciesCollection) obj2;
            return Intrinsics.f(this.f105794a, taxResidenciesCollection.f105794a) && Intrinsics.f(this.f105795b, taxResidenciesCollection.f105795b) && Intrinsics.f(this.f105796c, taxResidenciesCollection.f105796c) && Intrinsics.f(this.d, taxResidenciesCollection.d) && this.e == taxResidenciesCollection.e && Intrinsics.f(this.f, taxResidenciesCollection.f) && this.f105797g == taxResidenciesCollection.f105797g && this.f105798h == taxResidenciesCollection.f105798h;
        }

        public final int hashCode() {
            int iC = p.a.c(this.f105794a.hashCode() * 31, 31, this.f105795b);
            String str = this.f105796c;
            return Boolean.hashCode(this.f105798h) + j6.a.c((this.f.hashCode() + j6.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e)) * 31, 31, this.f105797g);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: p7, reason: from getter */
        public final WorkflowStepNavigation getF105811a() {
            return this.f105794a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f105794a.writeToParcel(dest, i);
            dest.writeString(this.f105795b);
            dest.writeString(this.f105796c);
            dest.writeString(this.d);
            dest.writeInt(this.e ? 1 : 0);
            this.f.writeToParcel(dest, i);
            dest.writeInt(this.f105797g ? 1 : 0);
            dest.writeInt(this.f105798h ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$TaxResidency;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxResidency implements SharedStep {

        @NotNull
        public static final Parcelable.Creator<TaxResidency> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowStepNavigation f105799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105800b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f105801c;
        public final boolean d;
        public final boolean e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                WorkflowStepNavigation workflowStepNavigationCreateFromParcel = WorkflowStepNavigation.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                b bVar = (b) parcel.readSerializable();
                boolean z3 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                return new TaxResidency(workflowStepNavigationCreateFromParcel, string, bVar, z3, parcel.readInt() == 0 ? z : true);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxResidency[i];
            }
        }

        public TaxResidency(WorkflowStepNavigation navigation, String str, b countryCode, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f105799a = navigation;
            this.f105800b = str;
            this.f105801c = countryCode;
            this.d = z;
            this.e = z3;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: G9, reason: from getter */
        public final boolean getE() {
            return this.e;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF105812b() {
            return this.f105800b;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: X3, reason: from getter */
        public final boolean getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TaxResidency)) {
                return false;
            }
            TaxResidency taxResidency = (TaxResidency) obj2;
            return Intrinsics.f(this.f105799a, taxResidency.f105799a) && Intrinsics.f(this.f105800b, taxResidency.f105800b) && Intrinsics.f(this.f105801c, taxResidency.f105801c) && this.d == taxResidency.d && this.e == taxResidency.e;
        }

        public final int hashCode() {
            int iHashCode = this.f105799a.hashCode() * 31;
            String str = this.f105800b;
            return Boolean.hashCode(this.e) + j6.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f105801c.f297794a), 31, this.d);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: p7, reason: from getter */
        public final WorkflowStepNavigation getF105811a() {
            return this.f105799a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f105799a.writeToParcel(dest, i);
            dest.writeString(this.f105800b);
            dest.writeSerializable(this.f105801c);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeInt(this.e ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$TermsReview;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TermsReview implements SharedStep {

        @NotNull
        public static final Parcelable.Creator<TermsReview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowStepNavigation f105802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105803b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f105804c;
        public final String d;
        public final List e;
        public final boolean f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                WorkflowStepNavigation workflowStepNavigationCreateFromParcel = WorkflowStepNavigation.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                boolean z4 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                    z3 = true;
                } else {
                    z = false;
                    z3 = true;
                }
                String string2 = parcel.readString();
                boolean z6 = z3;
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                if (parcel.readInt() == 0) {
                    z6 = z;
                }
                return new TermsReview(workflowStepNavigationCreateFromParcel, string, z4, string2, arrayListCreateStringArrayList, z6);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TermsReview[i];
            }
        }

        public TermsReview(WorkflowStepNavigation navigation, String stepId, boolean z, String countryCode, List termsIds, boolean z3) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(stepId, "stepId");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(termsIds, "termsIds");
            this.f105802a = navigation;
            this.f105803b = stepId;
            this.f105804c = z;
            this.d = countryCode;
            this.e = termsIds;
            this.f = z3;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: G9, reason: from getter */
        public final boolean getE() {
            return this.f;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF105812b() {
            return this.f105803b;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: X3, reason: from getter */
        public final boolean getD() {
            return this.f105804c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TermsReview)) {
                return false;
            }
            TermsReview termsReview = (TermsReview) obj2;
            return Intrinsics.f(this.f105802a, termsReview.f105802a) && Intrinsics.f(this.f105803b, termsReview.f105803b) && this.f105804c == termsReview.f105804c && Intrinsics.f(this.d, termsReview.d) && Intrinsics.f(this.e, termsReview.e) && this.f == termsReview.f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + p.a.d(p.a.c(j6.a.c(p.a.c(this.f105802a.hashCode() * 31, 31, this.f105803b), 31, this.f105804c), 31, this.d), 31, this.e);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: p7, reason: from getter */
        public final WorkflowStepNavigation getF105811a() {
            return this.f105802a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f105802a.writeToParcel(dest, i);
            dest.writeString(this.f105803b);
            dest.writeInt(this.f105804c ? 1 : 0);
            dest.writeString(this.d);
            dest.writeStringList(this.e);
            dest.writeInt(this.f ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$TransactionCountries;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionCountries implements SharedStep {

        @NotNull
        public static final Parcelable.Creator<TransactionCountries> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowStepNavigation f105805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f105807c;
        public final boolean d;
        public final String e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ArrayList f105808g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ArrayList f105809h;
        public final b i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f105810j;

        public static final class a implements Parcelable.Creator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                int i;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                WorkflowStepNavigation workflowStepNavigationCreateFromParcel = WorkflowStepNavigation.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                boolean z = true;
                if (parcel.readInt() != 0) {
                    i = 1;
                } else {
                    i = 1;
                    z = false;
                }
                boolean z3 = parcel.readInt() != 0 ? i : 0;
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iC = 0;
                while (iC != i2) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, i);
                }
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                int iC2 = 0;
                while (iC2 != i3) {
                    iC2 = ch.qos.logback.core.util.a.c(parcel, arrayList2, iC2, i);
                }
                return new TransactionCountries(workflowStepNavigationCreateFromParcel, string, z, z3, string2, string3, arrayList, arrayList2, (b) parcel.readSerializable(), parcel.readInt() != 0 ? i : 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionCountries[i];
            }
        }

        public TransactionCountries(WorkflowStepNavigation navigation, String stepId, boolean z, boolean z3, String title, String subtitle, ArrayList suggestedCountries, ArrayList allCountries, b currentCountry, boolean z4) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(stepId, "stepId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(suggestedCountries, "suggestedCountries");
            Intrinsics.checkNotNullParameter(allCountries, "allCountries");
            Intrinsics.checkNotNullParameter(currentCountry, "currentCountry");
            this.f105805a = navigation;
            this.f105806b = stepId;
            this.f105807c = z;
            this.d = z3;
            this.e = title;
            this.f = subtitle;
            this.f105808g = suggestedCountries;
            this.f105809h = allCountries;
            this.i = currentCountry;
            this.f105810j = z4;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: G9, reason: from getter */
        public final boolean getE() {
            return this.d;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF105812b() {
            return this.f105806b;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: X3, reason: from getter */
        public final boolean getD() {
            return this.f105807c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TransactionCountries)) {
                return false;
            }
            TransactionCountries transactionCountries = (TransactionCountries) obj2;
            return Intrinsics.f(this.f105805a, transactionCountries.f105805a) && Intrinsics.f(this.f105806b, transactionCountries.f105806b) && this.f105807c == transactionCountries.f105807c && this.d == transactionCountries.d && Intrinsics.f(this.e, transactionCountries.e) && Intrinsics.f(this.f, transactionCountries.f) && this.f105808g.equals(transactionCountries.f105808g) && this.f105809h.equals(transactionCountries.f105809h) && Intrinsics.f(this.i, transactionCountries.i) && this.f105810j == transactionCountries.f105810j;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f105810j) + p.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f105809h, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f105808g, p.a.c(p.a.c(j6.a.c(j6.a.c(p.a.c(this.f105805a.hashCode() * 31, 31, this.f105806b), 31, this.f105807c), 31, this.d), 31, this.e), 31, this.f), 31), 31), 31, this.i.f297794a);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: p7, reason: from getter */
        public final WorkflowStepNavigation getF105811a() {
            return this.f105805a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f105805a.writeToParcel(dest, i);
            dest.writeString(this.f105806b);
            dest.writeInt(this.f105807c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeString(this.e);
            dest.writeString(this.f);
            Iterator itY = j6.a.y(this.f105808g, dest);
            while (itY.hasNext()) {
                dest.writeSerializable((Serializable) itY.next());
            }
            Iterator itY2 = j6.a.y(this.f105809h, dest);
            while (itY2.hasNext()) {
                dest.writeSerializable((Serializable) itY2.next());
            }
            dest.writeSerializable(this.i);
            dest.writeInt(this.f105810j ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep$UserDetailsStep;", "Lcom/revolut/shared/feature/workflow/engine/api/workflow/SharedStep;", "", "toString", "()Ljava/lang/String;", "feature_shared_workflow_engine_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UserDetailsStep implements SharedStep {

        @NotNull
        public static final Parcelable.Creator<UserDetailsStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WorkflowStepNavigation f105811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105812b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f105813c;
        public final boolean d;
        public final boolean e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                WorkflowStepNavigation workflowStepNavigationCreateFromParcel = WorkflowStepNavigation.CREATOR.createFromParcel(parcel);
                String string = parcel.readString();
                String string2 = parcel.readString();
                boolean z3 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                return new UserDetailsStep(workflowStepNavigationCreateFromParcel, string, string2, z3, parcel.readInt() == 0 ? z : true);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UserDetailsStep[i];
            }
        }

        public UserDetailsStep(WorkflowStepNavigation navigation, String stepId, String workflowId, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            Intrinsics.checkNotNullParameter(stepId, "stepId");
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.f105811a = navigation;
            this.f105812b = stepId;
            this.f105813c = workflowId;
            this.d = z;
            this.e = z3;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: G9, reason: from getter */
        public final boolean getE() {
            return this.e;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: H1, reason: from getter */
        public final String getF105812b() {
            return this.f105812b;
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: X3, reason: from getter */
        public final boolean getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UserDetailsStep)) {
                return false;
            }
            UserDetailsStep userDetailsStep = (UserDetailsStep) obj2;
            return Intrinsics.f(this.f105811a, userDetailsStep.f105811a) && Intrinsics.f(this.f105812b, userDetailsStep.f105812b) && Intrinsics.f(this.f105813c, userDetailsStep.f105813c) && this.d == userDetailsStep.d && this.e == userDetailsStep.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + j6.a.c(p.a.c(p.a.c(this.f105811a.hashCode() * 31, 31, this.f105812b), 31, this.f105813c), 31, this.d);
        }

        @Override // com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowStep
        /* JADX INFO: renamed from: p7, reason: from getter */
        public final WorkflowStepNavigation getF105811a() {
            return this.f105811a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f105811a.writeToParcel(dest, i);
            dest.writeString(this.f105812b);
            dest.writeString(this.f105813c);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeInt(this.e ? 1 : 0);
        }
    }
}

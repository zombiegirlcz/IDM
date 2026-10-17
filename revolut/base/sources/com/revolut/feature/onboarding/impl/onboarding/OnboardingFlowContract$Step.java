package com.revolut.feature.onboarding.impl.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.kyc.api.KycContract$Requirement;
import com.revolut.feature.onboarding.api.user_under_18.UserUnder18Data;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.pod_nominees.api.navigation.PodNomineesFlowUseCase;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:(\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001',-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQR¨\u0006S"}, d2 = {"com/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Name", "DateOfBirth", "DuplicateAccount", "MarketingConsent", "CanNotOpenAccount", "RiskCheck", "UserUnder18", "Email", "EmailWithMarketingConsent", "Occupation", "WaitingList", "WaitingListActivationReady", "Country", "RetailAndCreditTerms", "PurposeOfAccount", "PoliticallyExposedPersonDeclaration", "MonthlyIncome", "PasscodeCreation", "BankTerms", "ContactsPermission", "Citizenship", "AddressVerificationKyc", "TaxResidency", "Address", "Workflow", "ProductLifecycle", "Biometric", "ProfileDetails", "ContactsSync", "Qes", "AiCallsConsent", "AnalyticsEventTrackingConsent", "PodBeneficiaries", "WaitingVerification", "ProductOnboarding", "JuniorGraduationAccountLinked", "JuniorGraduationIdentification", "DocumentKyc", "DocumentId", "ga9/e", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$Address;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$AddressVerificationKyc;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$AiCallsConsent;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$AnalyticsEventTrackingConsent;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$BankTerms;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$Biometric;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$CanNotOpenAccount;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$Citizenship;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$ContactsPermission;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$ContactsSync;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$Country;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$DateOfBirth;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$DocumentId;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$DocumentKyc;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$DuplicateAccount;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$Email;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$EmailWithMarketingConsent;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$JuniorGraduationAccountLinked;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$JuniorGraduationIdentification;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$MarketingConsent;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$MonthlyIncome;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$Name;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$Occupation;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$PasscodeCreation;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$PodBeneficiaries;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$PoliticallyExposedPersonDeclaration;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$ProductLifecycle;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$ProductOnboarding;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$ProfileDetails;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$PurposeOfAccount;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$Qes;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$RetailAndCreditTerms;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$RiskCheck;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$TaxResidency;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$UserUnder18;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$WaitingList;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$WaitingListActivationReady;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$WaitingVerification;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$Workflow;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OnboardingFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$Address;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Address extends OnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Address> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f78315a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Address((wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Address[i];
            }
        }

        public Address(wi0.b countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f78315a = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Address) && Intrinsics.f(this.f78315a, ((Address) obj2).f78315a);
        }

        public final int hashCode() {
            return this.f78315a.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78315a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$AddressVerificationKyc;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddressVerificationKyc extends OnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AddressVerificationKyc> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f78316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final KycContract$Requirement f78317b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddressVerificationKyc((KycContract$Requirement) parcel.readParcelable(AddressVerificationKyc.class.getClassLoader()), (wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddressVerificationKyc[i];
            }
        }

        public AddressVerificationKyc(KycContract$Requirement requirement, wi0.b country) {
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(requirement, "requirement");
            this.f78316a = country;
            this.f78317b = requirement;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AddressVerificationKyc)) {
                return false;
            }
            AddressVerificationKyc addressVerificationKyc = (AddressVerificationKyc) obj2;
            return Intrinsics.f(this.f78316a, addressVerificationKyc.f78316a) && Intrinsics.f(this.f78317b, addressVerificationKyc.f78317b);
        }

        public final int hashCode() {
            return this.f78317b.hashCode() + (this.f78316a.f297794a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78316a);
            dest.writeParcelable(this.f78317b, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$AiCallsConsent;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "<init>", "()V", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AiCallsConsent extends OnboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AiCallsConsent f78318a = new AiCallsConsent();

        @NotNull
        public static final Parcelable.Creator<AiCallsConsent> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AiCallsConsent.f78318a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AiCallsConsent[i];
            }
        }

        private AiCallsConsent() {
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$AnalyticsEventTrackingConsent;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "Lga9/e;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AnalyticsEventTrackingConsent extends OnboardingFlowContract$Step implements ga9.e {

        @NotNull
        public static final Parcelable.Creator<AnalyticsEventTrackingConsent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f78319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f78320b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AnalyticsEventTrackingConsent(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AnalyticsEventTrackingConsent[i];
            }
        }

        public AnalyticsEventTrackingConsent(boolean z, boolean z3) {
            this.f78319a = z;
            this.f78320b = z3;
        }

        @Override // ga9.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF78352c() {
            return this.f78320b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AnalyticsEventTrackingConsent)) {
                return false;
            }
            AnalyticsEventTrackingConsent analyticsEventTrackingConsent = (AnalyticsEventTrackingConsent) obj2;
            return this.f78319a == analyticsEventTrackingConsent.f78319a && this.f78320b == analyticsEventTrackingConsent.f78320b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f78320b) + (Boolean.hashCode(this.f78319a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f78319a ? 1 : 0);
            dest.writeInt(this.f78320b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$BankTerms;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BankTerms extends OnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BankTerms> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f78321a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BankTerms((wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BankTerms[i];
            }
        }

        public BankTerms(wi0.b countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f78321a = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BankTerms) && Intrinsics.f(this.f78321a, ((BankTerms) obj2).f78321a);
        }

        public final int hashCode() {
            return this.f78321a.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78321a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$Biometric;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Biometric extends OnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Biometric> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f78322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f78323b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                LinkedHashSet linkedHashSet;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashSet2.add(my8.k.valueOf(parcel.readString()));
                    }
                    linkedHashSet = linkedHashSet2;
                }
                return new Biometric(linkedHashSet, string);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Biometric[i];
            }
        }

        public Biometric(LinkedHashSet linkedHashSet, String str) {
            this.f78322a = str;
            this.f78323b = linkedHashSet;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Biometric)) {
                return false;
            }
            Biometric biometric = (Biometric) obj2;
            return Intrinsics.f(this.f78322a, biometric.f78322a) && Intrinsics.f(this.f78323b, biometric.f78323b);
        }

        public final int hashCode() {
            String str = this.f78322a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Set set = this.f78323b;
            return iHashCode + (set != null ? set.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78322a);
            Set set = this.f78323b;
            if (set == null) {
                dest.writeInt(0);
                return;
            }
            Iterator itQ = kii.e.q(dest, 1, set);
            while (itQ.hasNext()) {
                dest.writeString(((my8.k) itQ.next()).name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$CanNotOpenAccount;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CanNotOpenAccount extends OnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CanNotOpenAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f78324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f78325b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CanNotOpenAccount(parcel.readInt(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CanNotOpenAccount[i];
            }
        }

        public CanNotOpenAccount(int i, boolean z) {
            this.f78324a = i;
            this.f78325b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CanNotOpenAccount)) {
                return false;
            }
            CanNotOpenAccount canNotOpenAccount = (CanNotOpenAccount) obj2;
            return this.f78324a == canNotOpenAccount.f78324a && this.f78325b == canNotOpenAccount.f78325b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f78325b) + (Integer.hashCode(this.f78324a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f78324a);
            dest.writeInt(this.f78325b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$Citizenship;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Citizenship extends OnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Citizenship> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f78326a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Citizenship((wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Citizenship[i];
            }
        }

        public Citizenship(wi0.b country) {
            Intrinsics.checkNotNullParameter(country, "country");
            this.f78326a = country;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Citizenship) && Intrinsics.f(this.f78326a, ((Citizenship) obj2).f78326a);
        }

        public final int hashCode() {
            return this.f78326a.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78326a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$ContactsPermission;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "<init>", "()V", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ContactsPermission extends OnboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ContactsPermission f78327a = new ContactsPermission();

        @NotNull
        public static final Parcelable.Creator<ContactsPermission> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ContactsPermission.f78327a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ContactsPermission[i];
            }
        }

        private ContactsPermission() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$ContactsSync;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "<init>", "()V", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ContactsSync extends OnboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ContactsSync f78328a = new ContactsSync();

        @NotNull
        public static final Parcelable.Creator<ContactsSync> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ContactsSync.f78328a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ContactsSync[i];
            }
        }

        private ContactsSync() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$DateOfBirth;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DateOfBirth extends OnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DateOfBirth> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f78332a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DateOfBirth((LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DateOfBirth[i];
            }
        }

        public DateOfBirth(LocalDate localDate) {
            this.f78332a = localDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DateOfBirth) && Intrinsics.f(this.f78332a, ((DateOfBirth) obj2).f78332a);
        }

        public final int hashCode() {
            LocalDate localDate = this.f78332a;
            if (localDate == null) {
                return 0;
            }
            return localDate.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78332a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$DocumentId;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentId extends OnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DocumentId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f78333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final KycContract$Requirement f78334b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentId((KycContract$Requirement) parcel.readParcelable(DocumentId.class.getClassLoader()), (wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentId[i];
            }
        }

        public DocumentId(KycContract$Requirement requirement, wi0.b countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(requirement, "requirement");
            this.f78333a = countryCode;
            this.f78334b = requirement;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DocumentId)) {
                return false;
            }
            DocumentId documentId = (DocumentId) obj2;
            return Intrinsics.f(this.f78333a, documentId.f78333a) && Intrinsics.f(this.f78334b, documentId.f78334b);
        }

        public final int hashCode() {
            return this.f78334b.hashCode() + (this.f78333a.f297794a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78333a);
            dest.writeParcelable(this.f78334b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$DocumentKyc;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentKyc extends OnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DocumentKyc> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f78335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final KycContract$Requirement f78336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f78337c;
        public final yt8.e d;
        public final Set e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                wi0.b bVar = (wi0.b) parcel.readSerializable();
                KycContract$Requirement kycContract$Requirement = (KycContract$Requirement) parcel.readParcelable(DocumentKyc.class.getClassLoader());
                String string = parcel.readString();
                yt8.e eVarValueOf = parcel.readInt() == 0 ? null : yt8.e.valueOf(parcel.readString());
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(my8.k.valueOf(parcel.readString()));
                }
                return new DocumentKyc(bVar, kycContract$Requirement, string, eVarValueOf, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentKyc[i];
            }
        }

        public DocumentKyc(wi0.b countryCode, KycContract$Requirement requirement, String deeplink, yt8.e eVar, Set acceptedKycConsents) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(requirement, "requirement");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(acceptedKycConsents, "acceptedKycConsents");
            this.f78335a = countryCode;
            this.f78336b = requirement;
            this.f78337c = deeplink;
            this.d = eVar;
            this.e = acceptedKycConsents;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DocumentKyc)) {
                return false;
            }
            DocumentKyc documentKyc = (DocumentKyc) obj2;
            return Intrinsics.f(this.f78335a, documentKyc.f78335a) && Intrinsics.f(this.f78336b, documentKyc.f78336b) && Intrinsics.f(this.f78337c, documentKyc.f78337c) && this.d == documentKyc.d && Intrinsics.f(this.e, documentKyc.e);
        }

        public final int hashCode() {
            int iC = p.a.c((this.f78336b.hashCode() + (this.f78335a.f297794a.hashCode() * 31)) * 31, 31, this.f78337c);
            yt8.e eVar = this.d;
            return this.e.hashCode() + ((iC + (eVar == null ? 0 : eVar.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78335a);
            dest.writeParcelable(this.f78336b, i);
            dest.writeString(this.f78337c);
            yt8.e eVar = this.d;
            if (eVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(eVar.name());
            }
            Iterator itV = ehe.n.v(this.e, dest);
            while (itV.hasNext()) {
                dest.writeString(((my8.k) itV.next()).name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$DuplicateAccount;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "<init>", "()V", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DuplicateAccount extends OnboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DuplicateAccount f78338a = new DuplicateAccount();

        @NotNull
        public static final Parcelable.Creator<DuplicateAccount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DuplicateAccount.f78338a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DuplicateAccount[i];
            }
        }

        private DuplicateAccount() {
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$Email;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "Lga9/e;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Email extends OnboardingFlowContract$Step implements ga9.e {

        @NotNull
        public static final Parcelable.Creator<Email> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f78339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f78340b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f78341c;
        public final boolean d;
        public final boolean e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                boolean z4;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                wi0.b bVar = (wi0.b) parcel.readSerializable();
                boolean z6 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z6 = true;
                    z3 = true;
                } else {
                    z = false;
                    z3 = true;
                }
                String string = parcel.readString();
                if (parcel.readInt() != 0) {
                    z4 = z3;
                } else {
                    z4 = z3;
                    z3 = z;
                }
                if (parcel.readInt() == 0) {
                    z4 = z;
                }
                return new Email(bVar, z6, string, z3, z4);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Email[i];
            }
        }

        public Email(wi0.b country, boolean z, String prefillEmail, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(prefillEmail, "prefillEmail");
            this.f78339a = country;
            this.f78340b = z;
            this.f78341c = prefillEmail;
            this.d = z3;
            this.e = z4;
        }

        @Override // ga9.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF78352c() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Email)) {
                return false;
            }
            Email email = (Email) obj2;
            return Intrinsics.f(this.f78339a, email.f78339a) && this.f78340b == email.f78340b && Intrinsics.f(this.f78341c, email.f78341c) && this.d == email.d && this.e == email.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + j6.a.c(p.a.c(j6.a.c(this.f78339a.f297794a.hashCode() * 31, 31, this.f78340b), 31, this.f78341c), 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78339a);
            dest.writeInt(this.f78340b ? 1 : 0);
            dest.writeString(this.f78341c);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeInt(this.e ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$EmailWithMarketingConsent;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "Lga9/e;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EmailWithMarketingConsent extends OnboardingFlowContract$Step implements ga9.e {

        @NotNull
        public static final Parcelable.Creator<EmailWithMarketingConsent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f78342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f78343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f78344c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                boolean z4;
                boolean z6;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                wi0.b bVar = (wi0.b) parcel.readSerializable();
                boolean z11 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z11 = true;
                    z3 = true;
                } else {
                    z = false;
                    z3 = true;
                }
                String string = parcel.readString();
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
                if (parcel.readInt() == 0) {
                    z6 = z;
                }
                return new EmailWithMarketingConsent(bVar, z11, string, z3, z4, z6);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EmailWithMarketingConsent[i];
            }
        }

        public EmailWithMarketingConsent(wi0.b country, boolean z, String prefillEmail, boolean z3, boolean z4, boolean z6) {
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(prefillEmail, "prefillEmail");
            this.f78342a = country;
            this.f78343b = z;
            this.f78344c = prefillEmail;
            this.d = z3;
            this.e = z4;
            this.f = z6;
        }

        @Override // ga9.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF78352c() {
            return this.f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EmailWithMarketingConsent)) {
                return false;
            }
            EmailWithMarketingConsent emailWithMarketingConsent = (EmailWithMarketingConsent) obj2;
            return Intrinsics.f(this.f78342a, emailWithMarketingConsent.f78342a) && this.f78343b == emailWithMarketingConsent.f78343b && Intrinsics.f(this.f78344c, emailWithMarketingConsent.f78344c) && this.d == emailWithMarketingConsent.d && this.e == emailWithMarketingConsent.e && this.f == emailWithMarketingConsent.f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + j6.a.c(j6.a.c(p.a.c(j6.a.c(this.f78342a.f297794a.hashCode() * 31, 31, this.f78343b), 31, this.f78344c), 31, this.d), 31, this.e);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78342a);
            dest.writeInt(this.f78343b ? 1 : 0);
            dest.writeString(this.f78344c);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeInt(this.e ? 1 : 0);
            dest.writeInt(this.f ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$JuniorGraduationAccountLinked;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "Lga9/e;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JuniorGraduationAccountLinked extends OnboardingFlowContract$Step implements ga9.e {

        @NotNull
        public static final Parcelable.Creator<JuniorGraduationAccountLinked> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f78345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f78346b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JuniorGraduationAccountLinked(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JuniorGraduationAccountLinked[i];
            }
        }

        public JuniorGraduationAccountLinked(boolean z, boolean z3) {
            this.f78345a = z;
            this.f78346b = z3;
        }

        @Override // ga9.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF78352c() {
            return this.f78346b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof JuniorGraduationAccountLinked)) {
                return false;
            }
            JuniorGraduationAccountLinked juniorGraduationAccountLinked = (JuniorGraduationAccountLinked) obj2;
            return this.f78345a == juniorGraduationAccountLinked.f78345a && this.f78346b == juniorGraduationAccountLinked.f78346b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f78346b) + (Boolean.hashCode(this.f78345a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f78345a ? 1 : 0);
            dest.writeInt(this.f78346b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$JuniorGraduationIdentification;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JuniorGraduationIdentification extends OnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<JuniorGraduationIdentification> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f78347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f78348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f78349c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JuniorGraduationIdentification(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JuniorGraduationIdentification[i];
            }
        }

        public JuniorGraduationIdentification(String juniorFirstName, String phoneNumber, boolean z) {
            Intrinsics.checkNotNullParameter(juniorFirstName, "juniorFirstName");
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            this.f78347a = juniorFirstName;
            this.f78348b = phoneNumber;
            this.f78349c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof JuniorGraduationIdentification)) {
                return false;
            }
            JuniorGraduationIdentification juniorGraduationIdentification = (JuniorGraduationIdentification) obj2;
            return Intrinsics.f(this.f78347a, juniorGraduationIdentification.f78347a) && Intrinsics.f(this.f78348b, juniorGraduationIdentification.f78348b) && this.f78349c == juniorGraduationIdentification.f78349c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f78349c) + p.a.c(this.f78347a.hashCode() * 31, 31, this.f78348b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78347a);
            dest.writeString(this.f78348b);
            dest.writeInt(this.f78349c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$MarketingConsent;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "Lga9/e;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MarketingConsent extends OnboardingFlowContract$Step implements ga9.e {

        @NotNull
        public static final Parcelable.Creator<MarketingConsent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f78350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f78351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f78352c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MarketingConsent((wi0.b) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MarketingConsent[i];
            }
        }

        public MarketingConsent(wi0.b countryCode, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f78350a = countryCode;
            this.f78351b = z;
            this.f78352c = z3;
        }

        @Override // ga9.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF78352c() {
            return this.f78352c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MarketingConsent)) {
                return false;
            }
            MarketingConsent marketingConsent = (MarketingConsent) obj2;
            return Intrinsics.f(this.f78350a, marketingConsent.f78350a) && this.f78351b == marketingConsent.f78351b && this.f78352c == marketingConsent.f78352c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f78352c) + j6.a.c(this.f78350a.f297794a.hashCode() * 31, 31, this.f78351b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78350a);
            dest.writeInt(this.f78351b ? 1 : 0);
            dest.writeInt(this.f78352c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$MonthlyIncome;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MonthlyIncome extends OnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MonthlyIncome> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f78353a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MonthlyIncome((xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MonthlyIncome[i];
            }
        }

        public MonthlyIncome(xi0.b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f78353a = currency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MonthlyIncome) && Intrinsics.f(this.f78353a, ((MonthlyIncome) obj2).f78353a);
        }

        public final int hashCode() {
            return this.f78353a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78353a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$Name;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Name extends OnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Name> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f78354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f78355b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Name((wi0.b) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Name[i];
            }
        }

        public Name(wi0.b country, boolean z) {
            Intrinsics.checkNotNullParameter(country, "country");
            this.f78354a = country;
            this.f78355b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Name)) {
                return false;
            }
            Name name = (Name) obj2;
            return Intrinsics.f(this.f78354a, name.f78354a) && this.f78355b == name.f78355b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f78355b) + (this.f78354a.f297794a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78354a);
            dest.writeInt(this.f78355b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$Occupation;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Occupation extends OnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Occupation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f78356a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Occupation((wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Occupation[i];
            }
        }

        public Occupation(wi0.b country) {
            Intrinsics.checkNotNullParameter(country, "country");
            this.f78356a = country;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Occupation) && Intrinsics.f(this.f78356a, ((Occupation) obj2).f78356a);
        }

        public final int hashCode() {
            return this.f78356a.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78356a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$PasscodeCreation;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PasscodeCreation extends OnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PasscodeCreation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f78357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f78358b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PasscodeCreation(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PasscodeCreation[i];
            }
        }

        public PasscodeCreation(String phoneNumber, boolean z) {
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            this.f78357a = phoneNumber;
            this.f78358b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PasscodeCreation)) {
                return false;
            }
            PasscodeCreation passcodeCreation = (PasscodeCreation) obj2;
            return Intrinsics.f(this.f78357a, passcodeCreation.f78357a) && this.f78358b == passcodeCreation.f78358b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f78358b) + (this.f78357a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78357a);
            dest.writeInt(this.f78358b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$PodBeneficiaries;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PodBeneficiaries extends OnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PodBeneficiaries> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f78359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PodNomineesFlowUseCase f78360b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PodBeneficiaries((PodNomineesFlowUseCase) parcel.readParcelable(PodBeneficiaries.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PodBeneficiaries[i];
            }
        }

        public PodBeneficiaries(PodNomineesFlowUseCase useCase, boolean z) {
            Intrinsics.checkNotNullParameter(useCase, "useCase");
            this.f78359a = z;
            this.f78360b = useCase;
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
            return this.f78359a == podBeneficiaries.f78359a && Intrinsics.f(this.f78360b, podBeneficiaries.f78360b);
        }

        public final int hashCode() {
            return this.f78360b.hashCode() + (Boolean.hashCode(this.f78359a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f78359a ? 1 : 0);
            dest.writeParcelable(this.f78360b, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$PoliticallyExposedPersonDeclaration;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "<init>", "()V", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PoliticallyExposedPersonDeclaration extends OnboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PoliticallyExposedPersonDeclaration f78361a = new PoliticallyExposedPersonDeclaration();

        @NotNull
        public static final Parcelable.Creator<PoliticallyExposedPersonDeclaration> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PoliticallyExposedPersonDeclaration.f78361a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PoliticallyExposedPersonDeclaration[i];
            }
        }

        private PoliticallyExposedPersonDeclaration() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$ProductLifecycle;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductLifecycle extends OnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ProductLifecycle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f78362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f78363b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProductLifecycle((wi0.b) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductLifecycle[i];
            }
        }

        public ProductLifecycle(wi0.b countryCode, String str) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f78362a = countryCode;
            this.f78363b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ProductLifecycle)) {
                return false;
            }
            ProductLifecycle productLifecycle = (ProductLifecycle) obj2;
            return Intrinsics.f(this.f78362a, productLifecycle.f78362a) && Intrinsics.f(this.f78363b, productLifecycle.f78363b);
        }

        public final int hashCode() {
            int iHashCode = this.f78362a.f297794a.hashCode() * 31;
            String str = this.f78363b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78362a);
            dest.writeString(this.f78363b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$ProductOnboarding;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "<init>", "()V", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ProductOnboarding extends OnboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProductOnboarding f78364a = new ProductOnboarding();

        @NotNull
        public static final Parcelable.Creator<ProductOnboarding> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ProductOnboarding.f78364a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductOnboarding[i];
            }
        }

        private ProductOnboarding() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$ProfileDetails;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "<init>", "()V", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ProfileDetails extends OnboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProfileDetails f78365a = new ProfileDetails();

        @NotNull
        public static final Parcelable.Creator<ProfileDetails> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ProfileDetails.f78365a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProfileDetails[i];
            }
        }

        private ProfileDetails() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$PurposeOfAccount;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PurposeOfAccount extends OnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PurposeOfAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f78366a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PurposeOfAccount((wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PurposeOfAccount[i];
            }
        }

        public PurposeOfAccount(wi0.b countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f78366a = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PurposeOfAccount) && Intrinsics.f(this.f78366a, ((PurposeOfAccount) obj2).f78366a);
        }

        public final int hashCode() {
            return this.f78366a.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78366a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$Qes;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Qes extends OnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Qes> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f78367a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Qes((wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Qes[i];
            }
        }

        public Qes(wi0.b countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f78367a = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Qes) && Intrinsics.f(this.f78367a, ((Qes) obj2).f78367a);
        }

        public final int hashCode() {
            return this.f78367a.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78367a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$RetailAndCreditTerms;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RetailAndCreditTerms extends OnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RetailAndCreditTerms> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f78368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t89.a f78369b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RetailAndCreditTerms((wi0.b) parcel.readSerializable(), t89.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RetailAndCreditTerms[i];
            }
        }

        public RetailAndCreditTerms(wi0.b countryCode, t89.a countryTerms) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(countryTerms, "countryTerms");
            this.f78368a = countryCode;
            this.f78369b = countryTerms;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RetailAndCreditTerms)) {
                return false;
            }
            RetailAndCreditTerms retailAndCreditTerms = (RetailAndCreditTerms) obj2;
            return Intrinsics.f(this.f78368a, retailAndCreditTerms.f78368a) && this.f78369b == retailAndCreditTerms.f78369b;
        }

        public final int hashCode() {
            return this.f78369b.hashCode() + (this.f78368a.f297794a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78368a);
            dest.writeString(this.f78369b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$RiskCheck;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RiskCheck extends OnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RiskCheck> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f78370a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RiskCheck(parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RiskCheck[i];
            }
        }

        public RiskCheck(long j2) {
            this.f78370a = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RiskCheck) && this.f78370a == ((RiskCheck) obj2).f78370a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f78370a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeLong(this.f78370a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$TaxResidency;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxResidency extends OnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<TaxResidency> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f78371a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaxResidency((wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxResidency[i];
            }
        }

        public TaxResidency(wi0.b userCountry) {
            Intrinsics.checkNotNullParameter(userCountry, "userCountry");
            this.f78371a = userCountry;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TaxResidency) && Intrinsics.f(this.f78371a, ((TaxResidency) obj2).f78371a);
        }

        public final int hashCode() {
            return this.f78371a.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78371a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$UserUnder18;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UserUnder18 extends OnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<UserUnder18> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UserUnder18Data f78372a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UserUnder18((UserUnder18Data) parcel.readParcelable(UserUnder18.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UserUnder18[i];
            }
        }

        public UserUnder18(UserUnder18Data userUnder18Data) {
            Intrinsics.checkNotNullParameter(userUnder18Data, "userUnder18Data");
            this.f78372a = userUnder18Data;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UserUnder18) && Intrinsics.f(this.f78372a, ((UserUnder18) obj2).f78372a);
        }

        public final int hashCode() {
            return this.f78372a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f78372a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$WaitingList;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WaitingList extends OnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<WaitingList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f78373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f78374b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WaitingList((wi0.b) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WaitingList[i];
            }
        }

        public WaitingList(wi0.b country, boolean z) {
            Intrinsics.checkNotNullParameter(country, "country");
            this.f78373a = country;
            this.f78374b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WaitingList)) {
                return false;
            }
            WaitingList waitingList = (WaitingList) obj2;
            return Intrinsics.f(this.f78373a, waitingList.f78373a) && this.f78374b == waitingList.f78374b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f78374b) + (this.f78373a.f297794a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78373a);
            dest.writeInt(this.f78374b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$WaitingListActivationReady;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WaitingListActivationReady extends OnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<WaitingListActivationReady> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f78375a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WaitingListActivationReady((wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WaitingListActivationReady[i];
            }
        }

        public WaitingListActivationReady(wi0.b countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f78375a = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof WaitingListActivationReady) && Intrinsics.f(this.f78375a, ((WaitingListActivationReady) obj2).f78375a);
        }

        public final int hashCode() {
            return this.f78375a.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78375a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$WaitingVerification;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WaitingVerification extends OnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<WaitingVerification> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f78376a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WaitingVerification(parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WaitingVerification[i];
            }
        }

        public WaitingVerification(long j2) {
            this.f78376a = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof WaitingVerification) && this.f78376a == ((WaitingVerification) obj2).f78376a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f78376a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeLong(this.f78376a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$Workflow;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Workflow extends OnboardingFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Workflow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f78377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f78378b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f78379c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Workflow(parcel.readString(), parcel.readString(), (wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Workflow[i];
            }
        }

        public Workflow(String workflowId, String str, wi0.b countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            this.f78377a = countryCode;
            this.f78378b = workflowId;
            this.f78379c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Workflow)) {
                return false;
            }
            Workflow workflow = (Workflow) obj2;
            return Intrinsics.f(this.f78377a, workflow.f78377a) && Intrinsics.f(this.f78378b, workflow.f78378b) && Intrinsics.f(this.f78379c, workflow.f78379c);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f78377a.f297794a.hashCode() * 31, 31, this.f78378b);
            String str = this.f78379c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78377a);
            dest.writeString(this.f78378b);
            dest.writeString(this.f78379c);
        }
    }

    private OnboardingFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step$Country;", "Lcom/revolut/feature/onboarding/impl/onboarding/OnboardingFlowContract$Step;", "Lga9/e;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Country extends OnboardingFlowContract$Step implements ga9.e {

        @NotNull
        public static final Parcelable.Creator<Country> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f78329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f78330b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f78331c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Country((wi0.b) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Country[i];
            }
        }

        public Country(wi0.b countryCode, boolean z, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f78329a = countryCode;
            this.f78330b = z;
            this.f78331c = z3;
            this.d = z4;
        }

        @Override // ga9.e
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF78352c() {
            return this.f78331c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Country)) {
                return false;
            }
            Country country = (Country) obj2;
            return Intrinsics.f(this.f78329a, country.f78329a) && this.f78330b == country.f78330b && this.f78331c == country.f78331c && this.d == country.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(this.f78329a.f297794a.hashCode() * 31, 31, this.f78330b), 31, this.f78331c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f78329a);
            dest.writeInt(this.f78330b ? 1 : 0);
            dest.writeInt(this.f78331c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
        }

        public /* synthetic */ Country(int i, wi0.b bVar, boolean z, boolean z3) {
            this(bVar, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z3, (i & 8) == 0);
        }
    }
}

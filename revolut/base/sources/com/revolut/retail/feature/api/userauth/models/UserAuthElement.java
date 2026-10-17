package com.revolut.retail.feature.api.userauth.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yt8.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:&\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'\u0082\u0001&()*+,-./0123456789:;<=>?@ABCDEFGHIJKLM¨\u0006NÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "Landroid/os/Parcelable;", "Country", "RetailAndCreditTerms", "Name", "DateOfBirth", "Address", "Email", "Occupation", "PurposeOfAccount", "TaxResidencies", "DuplicateAccount", "Password", "WaitingList", "ActivationReady", "ContactsPermission", "SelfieKyc", "ProfileDetails", "DocumentKyc", "AddressVerificationKyc", "RiskCheck", "BankTerms", "EmailWithMarketingConsent", "MarketingConsent", "PoliticallyExposedPersonDeclaration", "MonthlyIncome", "Citizenship", "ContactsSync", "JuniorGraduation", "JuniorGraduationAccountLinked", "Unsupported", "DocumentId", "Workflow", "Qes", "AiCallsConsent", "TrackingConsent", "PodBeneficiaries", "WaitingVerification", "ProductOnboarding", "ProductLifecycle", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$ActivationReady;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$Address;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$AddressVerificationKyc;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$AiCallsConsent;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$BankTerms;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$Citizenship;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$ContactsPermission;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$ContactsSync;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$Country;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$DateOfBirth;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$DocumentId;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$DocumentKyc;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$DuplicateAccount;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$Email;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$EmailWithMarketingConsent;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$JuniorGraduation;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$JuniorGraduationAccountLinked;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$MarketingConsent;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$MonthlyIncome;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$Name;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$Occupation;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$Password;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$PodBeneficiaries;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$PoliticallyExposedPersonDeclaration;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$ProductLifecycle;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$ProductOnboarding;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$ProfileDetails;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$PurposeOfAccount;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$Qes;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$RetailAndCreditTerms;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$RiskCheck;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$SelfieKyc;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$TaxResidencies;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$TrackingConsent;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$Unsupported;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$WaitingList;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$WaitingVerification;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$Workflow;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface UserAuthElement extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$ActivationReady;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ActivationReady implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<ActivationReady> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99277a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ActivationReady(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActivationReady[i];
            }
        }

        public ActivationReady(boolean z) {
            this.f99277a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ActivationReady) && this.f99277a == ((ActivationReady) obj2).f99277a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99277a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f99277a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$Address;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Address implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<Address> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99278a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Address(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Address[i];
            }
        }

        public Address(boolean z) {
            this.f99278a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Address) && this.f99278a == ((Address) obj2).f99278a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99278a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f99278a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$AddressVerificationKyc;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddressVerificationKyc implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<AddressVerificationKyc> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f99280b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddressVerificationKyc(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddressVerificationKyc[i];
            }
        }

        public AddressVerificationKyc(boolean z, boolean z3) {
            this.f99279a = z;
            this.f99280b = z3;
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
            return this.f99279a == addressVerificationKyc.f99279a && this.f99280b == addressVerificationKyc.f99280b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99280b) + (Boolean.hashCode(this.f99279a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f99279a ? 1 : 0);
            dest.writeInt(this.f99280b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$AiCallsConsent;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AiCallsConsent implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<AiCallsConsent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99281a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AiCallsConsent(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AiCallsConsent[i];
            }
        }

        public AiCallsConsent(boolean z) {
            this.f99281a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AiCallsConsent) && this.f99281a == ((AiCallsConsent) obj2).f99281a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99281a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f99281a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$BankTerms;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BankTerms implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<BankTerms> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f99283b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BankTerms(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BankTerms[i];
            }
        }

        public BankTerms(boolean z, boolean z3) {
            this.f99282a = z;
            this.f99283b = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BankTerms)) {
                return false;
            }
            BankTerms bankTerms = (BankTerms) obj2;
            return this.f99282a == bankTerms.f99282a && this.f99283b == bankTerms.f99283b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99283b) + (Boolean.hashCode(this.f99282a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f99282a ? 1 : 0);
            dest.writeInt(this.f99283b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$Citizenship;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Citizenship implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<Citizenship> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99284a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Citizenship(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Citizenship[i];
            }
        }

        public Citizenship(boolean z) {
            this.f99284a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Citizenship) && this.f99284a == ((Citizenship) obj2).f99284a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99284a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f99284a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$ContactsPermission;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ContactsPermission implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<ContactsPermission> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99285a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ContactsPermission(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ContactsPermission[i];
            }
        }

        public ContactsPermission(boolean z) {
            this.f99285a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ContactsPermission) && this.f99285a == ((ContactsPermission) obj2).f99285a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99285a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f99285a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$ContactsSync;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ContactsSync implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<ContactsSync> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99286a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ContactsSync(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ContactsSync[i];
            }
        }

        public ContactsSync(boolean z) {
            this.f99286a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ContactsSync) && this.f99286a == ((ContactsSync) obj2).f99286a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99286a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f99286a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$Country;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Country implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<Country> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f99287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f99288b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Country(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Country[i];
            }
        }

        public Country(String str, boolean z) {
            this.f99287a = str;
            this.f99288b = z;
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
            return Intrinsics.f(this.f99287a, country.f99287a) && this.f99288b == country.f99288b;
        }

        public final int hashCode() {
            String str = this.f99287a;
            return Boolean.hashCode(this.f99288b) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99287a);
            dest.writeInt(this.f99288b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$DateOfBirth;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DateOfBirth implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<DateOfBirth> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99289a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DateOfBirth(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DateOfBirth[i];
            }
        }

        public DateOfBirth(boolean z) {
            this.f99289a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DateOfBirth) && this.f99289a == ((DateOfBirth) obj2).f99289a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99289a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f99289a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$DocumentId;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentId implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<DocumentId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f99291b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentId(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentId[i];
            }
        }

        public DocumentId(boolean z, boolean z3) {
            this.f99290a = z;
            this.f99291b = z3;
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
            return this.f99290a == documentId.f99290a && this.f99291b == documentId.f99291b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99291b) + (Boolean.hashCode(this.f99290a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f99290a ? 1 : 0);
            dest.writeInt(this.f99291b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$DocumentKyc;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentKyc implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<DocumentKyc> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f99293b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f99294c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentKyc(parcel.readInt() != 0, parcel.readInt() == 0 ? null : e.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentKyc[i];
            }
        }

        public DocumentKyc(boolean z, e eVar, boolean z3) {
            this.f99292a = z;
            this.f99293b = eVar;
            this.f99294c = z3;
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
            return this.f99292a == documentKyc.f99292a && this.f99293b == documentKyc.f99293b && this.f99294c == documentKyc.f99294c;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f99292a) * 31;
            e eVar = this.f99293b;
            return Boolean.hashCode(this.f99294c) + ((iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f99292a ? 1 : 0);
            e eVar = this.f99293b;
            if (eVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(eVar.name());
            }
            dest.writeInt(this.f99294c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$DuplicateAccount;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "com/revolut/retail/feature/api/userauth/models/a", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DuplicateAccount implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<DuplicateAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.revolut.retail.feature.api.userauth.models.a f99295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f99296b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DuplicateAccount(com.revolut.retail.feature.api.userauth.models.a.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DuplicateAccount[i];
            }
        }

        public DuplicateAccount(com.revolut.retail.feature.api.userauth.models.a similarity, boolean z) {
            Intrinsics.checkNotNullParameter(similarity, "similarity");
            this.f99295a = similarity;
            this.f99296b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DuplicateAccount)) {
                return false;
            }
            DuplicateAccount duplicateAccount = (DuplicateAccount) obj2;
            return this.f99295a == duplicateAccount.f99295a && this.f99296b == duplicateAccount.f99296b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99296b) + (this.f99295a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99295a.name());
            dest.writeInt(this.f99296b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$Email;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Email implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<Email> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f99298b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Email(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Email[i];
            }
        }

        public Email(boolean z, boolean z3) {
            this.f99297a = z;
            this.f99298b = z3;
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
            return this.f99297a == email.f99297a && this.f99298b == email.f99298b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99298b) + (Boolean.hashCode(this.f99297a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f99297a ? 1 : 0);
            dest.writeInt(this.f99298b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$EmailWithMarketingConsent;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EmailWithMarketingConsent implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<EmailWithMarketingConsent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f99300b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EmailWithMarketingConsent(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EmailWithMarketingConsent[i];
            }
        }

        public EmailWithMarketingConsent(boolean z, boolean z3) {
            this.f99299a = z;
            this.f99300b = z3;
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
            return this.f99299a == emailWithMarketingConsent.f99299a && this.f99300b == emailWithMarketingConsent.f99300b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99300b) + (Boolean.hashCode(this.f99299a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f99299a ? 1 : 0);
            dest.writeInt(this.f99300b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$JuniorGraduation;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JuniorGraduation implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<JuniorGraduation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f99301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f99302b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JuniorGraduation(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JuniorGraduation[i];
            }
        }

        public JuniorGraduation(String juniorFirstName, boolean z) {
            Intrinsics.checkNotNullParameter(juniorFirstName, "juniorFirstName");
            this.f99301a = juniorFirstName;
            this.f99302b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof JuniorGraduation)) {
                return false;
            }
            JuniorGraduation juniorGraduation = (JuniorGraduation) obj2;
            return Intrinsics.f(this.f99301a, juniorGraduation.f99301a) && this.f99302b == juniorGraduation.f99302b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99302b) + (this.f99301a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99301a);
            dest.writeInt(this.f99302b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$JuniorGraduationAccountLinked;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JuniorGraduationAccountLinked implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<JuniorGraduationAccountLinked> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99303a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JuniorGraduationAccountLinked(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JuniorGraduationAccountLinked[i];
            }
        }

        public JuniorGraduationAccountLinked(boolean z) {
            this.f99303a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof JuniorGraduationAccountLinked) && this.f99303a == ((JuniorGraduationAccountLinked) obj2).f99303a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99303a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f99303a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$MarketingConsent;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MarketingConsent implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<MarketingConsent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99304a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MarketingConsent(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MarketingConsent[i];
            }
        }

        public MarketingConsent(boolean z) {
            this.f99304a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MarketingConsent) && this.f99304a == ((MarketingConsent) obj2).f99304a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99304a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f99304a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$MonthlyIncome;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MonthlyIncome implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<MonthlyIncome> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99305a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MonthlyIncome(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MonthlyIncome[i];
            }
        }

        public MonthlyIncome(boolean z) {
            this.f99305a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MonthlyIncome) && this.f99305a == ((MonthlyIncome) obj2).f99305a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99305a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f99305a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$Name;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Name implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<Name> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f99307b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Name(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Name[i];
            }
        }

        public Name(boolean z, boolean z3) {
            this.f99306a = z;
            this.f99307b = z3;
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
            return this.f99306a == name.f99306a && this.f99307b == name.f99307b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99307b) + (Boolean.hashCode(this.f99306a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f99306a ? 1 : 0);
            dest.writeInt(this.f99307b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$Occupation;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Occupation implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<Occupation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99308a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Occupation(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Occupation[i];
            }
        }

        public Occupation(boolean z) {
            this.f99308a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Occupation) && this.f99308a == ((Occupation) obj2).f99308a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99308a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f99308a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$Password;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "com/revolut/retail/feature/api/userauth/models/b", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Password implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<Password> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f99309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f99310b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Password(b.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Password[i];
            }
        }

        public Password(b mode, boolean z) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.f99309a = mode;
            this.f99310b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Password)) {
                return false;
            }
            Password password = (Password) obj2;
            return this.f99309a == password.f99309a && this.f99310b == password.f99310b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99310b) + (this.f99309a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99309a.name());
            dest.writeInt(this.f99310b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$PodBeneficiaries;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PodBeneficiaries implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<PodBeneficiaries> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99311a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PodBeneficiaries(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PodBeneficiaries[i];
            }
        }

        public PodBeneficiaries(boolean z) {
            this.f99311a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PodBeneficiaries) && this.f99311a == ((PodBeneficiaries) obj2).f99311a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99311a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f99311a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$PoliticallyExposedPersonDeclaration;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PoliticallyExposedPersonDeclaration implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<PoliticallyExposedPersonDeclaration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99312a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PoliticallyExposedPersonDeclaration(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PoliticallyExposedPersonDeclaration[i];
            }
        }

        public PoliticallyExposedPersonDeclaration(boolean z) {
            this.f99312a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PoliticallyExposedPersonDeclaration) && this.f99312a == ((PoliticallyExposedPersonDeclaration) obj2).f99312a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99312a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f99312a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$ProductLifecycle;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductLifecycle implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<ProductLifecycle> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99313a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProductLifecycle(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductLifecycle[i];
            }
        }

        public ProductLifecycle(boolean z) {
            this.f99313a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ProductLifecycle) && this.f99313a == ((ProductLifecycle) obj2).f99313a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99313a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f99313a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$ProductOnboarding;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductOnboarding implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<ProductOnboarding> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99314a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProductOnboarding(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductOnboarding[i];
            }
        }

        public ProductOnboarding(boolean z) {
            this.f99314a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ProductOnboarding) && this.f99314a == ((ProductOnboarding) obj2).f99314a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99314a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f99314a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$ProfileDetails;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProfileDetails implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<ProfileDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99315a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProfileDetails(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProfileDetails[i];
            }
        }

        public ProfileDetails(boolean z) {
            this.f99315a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ProfileDetails) && this.f99315a == ((ProfileDetails) obj2).f99315a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99315a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f99315a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$PurposeOfAccount;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PurposeOfAccount implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<PurposeOfAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99316a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PurposeOfAccount(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PurposeOfAccount[i];
            }
        }

        public PurposeOfAccount(boolean z) {
            this.f99316a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PurposeOfAccount) && this.f99316a == ((PurposeOfAccount) obj2).f99316a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99316a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f99316a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$Qes;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Qes implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<Qes> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99317a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Qes(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Qes[i];
            }
        }

        public Qes(boolean z) {
            this.f99317a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Qes) && this.f99317a == ((Qes) obj2).f99317a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99317a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f99317a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$RetailAndCreditTerms;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RetailAndCreditTerms implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<RetailAndCreditTerms> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99318a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RetailAndCreditTerms(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RetailAndCreditTerms[i];
            }
        }

        public RetailAndCreditTerms(boolean z) {
            this.f99318a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RetailAndCreditTerms) && this.f99318a == ((RetailAndCreditTerms) obj2).f99318a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99318a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f99318a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$RiskCheck;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RiskCheck implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<RiskCheck> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f99319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f99320b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RiskCheck(parcel.readLong(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RiskCheck[i];
            }
        }

        public RiskCheck(long j2, boolean z) {
            this.f99319a = j2;
            this.f99320b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RiskCheck)) {
                return false;
            }
            RiskCheck riskCheck = (RiskCheck) obj2;
            return this.f99319a == riskCheck.f99319a && this.f99320b == riskCheck.f99320b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99320b) + (Long.hashCode(this.f99319a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeLong(this.f99319a);
            dest.writeInt(this.f99320b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$SelfieKyc;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelfieKyc implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<SelfieKyc> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f99321a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f99322b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelfieKyc(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelfieKyc[i];
            }
        }

        public SelfieKyc(String str, boolean z) {
            this.f99321a = str;
            this.f99322b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SelfieKyc)) {
                return false;
            }
            SelfieKyc selfieKyc = (SelfieKyc) obj2;
            return Intrinsics.f(this.f99321a, selfieKyc.f99321a) && this.f99322b == selfieKyc.f99322b;
        }

        public final int hashCode() {
            String str = this.f99321a;
            return Boolean.hashCode(this.f99322b) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99321a);
            dest.writeInt(this.f99322b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$TaxResidencies;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxResidencies implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<TaxResidencies> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99323a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaxResidencies(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxResidencies[i];
            }
        }

        public TaxResidencies(boolean z) {
            this.f99323a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TaxResidencies) && this.f99323a == ((TaxResidencies) obj2).f99323a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99323a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f99323a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$TrackingConsent;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TrackingConsent implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<TrackingConsent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f99325b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TrackingConsent(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TrackingConsent[i];
            }
        }

        public TrackingConsent(boolean z, boolean z3) {
            this.f99324a = z;
            this.f99325b = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TrackingConsent)) {
                return false;
            }
            TrackingConsent trackingConsent = (TrackingConsent) obj2;
            return this.f99324a == trackingConsent.f99324a && this.f99325b == trackingConsent.f99325b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99325b) + (Boolean.hashCode(this.f99324a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f99324a ? 1 : 0);
            dest.writeInt(this.f99325b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$Unsupported;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Unsupported implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<Unsupported> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f99326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f99327b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Unsupported(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unsupported[i];
            }
        }

        public Unsupported(String id10, boolean z) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f99326a = id10;
            this.f99327b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Unsupported)) {
                return false;
            }
            Unsupported unsupported = (Unsupported) obj2;
            return Intrinsics.f(this.f99326a, unsupported.f99326a) && this.f99327b == unsupported.f99327b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99327b) + (this.f99326a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99326a);
            dest.writeInt(this.f99327b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$WaitingList;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WaitingList implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<WaitingList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f99328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f99329b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WaitingList(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WaitingList[i];
            }
        }

        public WaitingList(String id10, boolean z) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f99328a = id10;
            this.f99329b = z;
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
            return Intrinsics.f(this.f99328a, waitingList.f99328a) && this.f99329b == waitingList.f99329b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99329b) + (this.f99328a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99328a);
            dest.writeInt(this.f99329b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$WaitingVerification;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WaitingVerification implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<WaitingVerification> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f99330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f99331b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WaitingVerification(parcel.readLong(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WaitingVerification[i];
            }
        }

        public WaitingVerification(long j2, boolean z) {
            this.f99330a = j2;
            this.f99331b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WaitingVerification)) {
                return false;
            }
            WaitingVerification waitingVerification = (WaitingVerification) obj2;
            return this.f99330a == waitingVerification.f99330a && this.f99331b == waitingVerification.f99331b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99331b) + (Long.hashCode(this.f99330a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeLong(this.f99330a);
            dest.writeInt(this.f99331b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement$Workflow;", "Lcom/revolut/retail/feature/api/userauth/models/UserAuthElement;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Workflow implements UserAuthElement {

        @NotNull
        public static final Parcelable.Creator<Workflow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f99332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f99333b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f99334c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Workflow(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Workflow[i];
            }
        }

        public Workflow(String workflowId, String uuid, boolean z) {
            Intrinsics.checkNotNullParameter(workflowId, "workflowId");
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            this.f99332a = workflowId;
            this.f99333b = uuid;
            this.f99334c = z;
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
            return Intrinsics.f(this.f99332a, workflow.f99332a) && Intrinsics.f(this.f99333b, workflow.f99333b) && this.f99334c == workflow.f99334c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f99334c) + p.a.c(this.f99332a.hashCode() * 31, 31, this.f99333b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99332a);
            dest.writeString(this.f99333b);
            dest.writeInt(this.f99334c ? 1 : 0);
        }
    }
}

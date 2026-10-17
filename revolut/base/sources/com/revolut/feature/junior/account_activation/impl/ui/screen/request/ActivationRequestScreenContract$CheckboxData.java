package com.revolut.feature.junior.account_activation.impl.ui.screen.request;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/junior/account_activation/impl/ui/screen/request/ActivationRequestScreenContract$CheckboxData", "Landroid/os/Parcelable;", "PersonalDataAccurate", "PersonalDataKidControlDetails", "TermsAndConditions", "SameAddress", "AccountPurpose", "Lcom/revolut/feature/junior/account_activation/impl/ui/screen/request/ActivationRequestScreenContract$CheckboxData$AccountPurpose;", "Lcom/revolut/feature/junior/account_activation/impl/ui/screen/request/ActivationRequestScreenContract$CheckboxData$PersonalDataAccurate;", "Lcom/revolut/feature/junior/account_activation/impl/ui/screen/request/ActivationRequestScreenContract$CheckboxData$PersonalDataKidControlDetails;", "Lcom/revolut/feature/junior/account_activation/impl/ui/screen/request/ActivationRequestScreenContract$CheckboxData$SameAddress;", "Lcom/revolut/feature/junior/account_activation/impl/ui/screen/request/ActivationRequestScreenContract$CheckboxData$TermsAndConditions;", "feature_junior_account_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ActivationRequestScreenContract$CheckboxData implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76669a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior/account_activation/impl/ui/screen/request/ActivationRequestScreenContract$CheckboxData$AccountPurpose;", "Lcom/revolut/feature/junior/account_activation/impl/ui/screen/request/ActivationRequestScreenContract$CheckboxData;", "<init>", "()V", "feature_junior_account_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AccountPurpose extends ActivationRequestScreenContract$CheckboxData {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final AccountPurpose f76670b = new AccountPurpose();

        @NotNull
        public static final Parcelable.Creator<AccountPurpose> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AccountPurpose.f76670b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountPurpose[i];
            }
        }

        private AccountPurpose() {
            super("ID_CHECKBOX_YOUTH_ACCOUNT_PURPOSE");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior/account_activation/impl/ui/screen/request/ActivationRequestScreenContract$CheckboxData$PersonalDataAccurate;", "Lcom/revolut/feature/junior/account_activation/impl/ui/screen/request/ActivationRequestScreenContract$CheckboxData;", "<init>", "()V", "feature_junior_account_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PersonalDataAccurate extends ActivationRequestScreenContract$CheckboxData {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final PersonalDataAccurate f76671b = new PersonalDataAccurate();

        @NotNull
        public static final Parcelable.Creator<PersonalDataAccurate> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PersonalDataAccurate.f76671b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PersonalDataAccurate[i];
            }
        }

        private PersonalDataAccurate() {
            super("CHECKBOX_PERSONAL_DATA_ACCURATE");
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior/account_activation/impl/ui/screen/request/ActivationRequestScreenContract$CheckboxData$PersonalDataKidControlDetails;", "Lcom/revolut/feature/junior/account_activation/impl/ui/screen/request/ActivationRequestScreenContract$CheckboxData;", "", "toString", "()Ljava/lang/String;", "feature_junior_account_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PersonalDataKidControlDetails extends ActivationRequestScreenContract$CheckboxData {

        @NotNull
        public static final Parcelable.Creator<PersonalDataKidControlDetails> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f76672b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PersonalDataKidControlDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PersonalDataKidControlDetails[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PersonalDataKidControlDetails(String dataProtectionTerms) {
            super("CHECKBOX_PERSONAL_DATA_KID_CONTROL_DETAILS");
            Intrinsics.checkNotNullParameter(dataProtectionTerms, "dataProtectionTerms");
            this.f76672b = dataProtectionTerms;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PersonalDataKidControlDetails) && Intrinsics.f(this.f76672b, ((PersonalDataKidControlDetails) obj2).f76672b);
        }

        public final int hashCode() {
            return this.f76672b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76672b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior/account_activation/impl/ui/screen/request/ActivationRequestScreenContract$CheckboxData$SameAddress;", "Lcom/revolut/feature/junior/account_activation/impl/ui/screen/request/ActivationRequestScreenContract$CheckboxData;", "", "toString", "()Ljava/lang/String;", "feature_junior_account_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SameAddress extends ActivationRequestScreenContract$CheckboxData {

        @NotNull
        public static final Parcelable.Creator<SameAddress> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f76673b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SameAddress(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SameAddress[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SameAddress(String juniorFirstName) {
            super("SAME_ADDRESS");
            Intrinsics.checkNotNullParameter(juniorFirstName, "juniorFirstName");
            this.f76673b = juniorFirstName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SameAddress) && Intrinsics.f(this.f76673b, ((SameAddress) obj2).f76673b);
        }

        public final int hashCode() {
            return this.f76673b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76673b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior/account_activation/impl/ui/screen/request/ActivationRequestScreenContract$CheckboxData$TermsAndConditions;", "Lcom/revolut/feature/junior/account_activation/impl/ui/screen/request/ActivationRequestScreenContract$CheckboxData;", "<init>", "()V", "feature_junior_account_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TermsAndConditions extends ActivationRequestScreenContract$CheckboxData {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final TermsAndConditions f76674b = new TermsAndConditions();

        @NotNull
        public static final Parcelable.Creator<TermsAndConditions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TermsAndConditions.f76674b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TermsAndConditions[i];
            }
        }

        private TermsAndConditions() {
            super("CHECKBOX_TERMS_AND_CONDITIONS");
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

    public ActivationRequestScreenContract$CheckboxData(String str) {
        this.f76669a = str;
    }
}

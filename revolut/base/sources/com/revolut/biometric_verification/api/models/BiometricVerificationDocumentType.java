package com.revolut.biometric_verification.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/biometric_verification/api/models/BiometricVerificationDocumentType;", "Landroid/os/Parcelable;", "Passport", "DrivingLicence", "IdentityCard", "ResidencePermit", "Visa", "BirthCertificate", "Lcom/revolut/biometric_verification/api/models/BiometricVerificationDocumentType$BirthCertificate;", "Lcom/revolut/biometric_verification/api/models/BiometricVerificationDocumentType$DrivingLicence;", "Lcom/revolut/biometric_verification/api/models/BiometricVerificationDocumentType$IdentityCard;", "Lcom/revolut/biometric_verification/api/models/BiometricVerificationDocumentType$Passport;", "Lcom/revolut/biometric_verification/api/models/BiometricVerificationDocumentType$ResidencePermit;", "Lcom/revolut/biometric_verification/api/models/BiometricVerificationDocumentType$Visa;", "biometric_verification_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BiometricVerificationDocumentType extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/biometric_verification/api/models/BiometricVerificationDocumentType$BirthCertificate;", "Lcom/revolut/biometric_verification/api/models/BiometricVerificationDocumentType;", "<init>", "()V", "biometric_verification_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BirthCertificate implements BiometricVerificationDocumentType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BirthCertificate f50384a = new BirthCertificate();

        @NotNull
        public static final Parcelable.Creator<BirthCertificate> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BirthCertificate.f50384a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BirthCertificate[i];
            }
        }

        private BirthCertificate() {
        }

        @Override // com.revolut.biometric_verification.api.models.BiometricVerificationDocumentType
        public final String V3() {
            return "BIRTH_CERTIFICATE";
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/biometric_verification/api/models/BiometricVerificationDocumentType$DrivingLicence;", "Lcom/revolut/biometric_verification/api/models/BiometricVerificationDocumentType;", "<init>", "()V", "biometric_verification_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DrivingLicence implements BiometricVerificationDocumentType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DrivingLicence f50385a = new DrivingLicence();

        @NotNull
        public static final Parcelable.Creator<DrivingLicence> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DrivingLicence.f50385a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DrivingLicence[i];
            }
        }

        private DrivingLicence() {
        }

        @Override // com.revolut.biometric_verification.api.models.BiometricVerificationDocumentType
        public final String V3() {
            return "DRIVING_LICENCE";
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/biometric_verification/api/models/BiometricVerificationDocumentType$IdentityCard;", "Lcom/revolut/biometric_verification/api/models/BiometricVerificationDocumentType;", "<init>", "()V", "biometric_verification_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IdentityCard implements BiometricVerificationDocumentType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final IdentityCard f50386a = new IdentityCard();

        @NotNull
        public static final Parcelable.Creator<IdentityCard> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IdentityCard.f50386a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IdentityCard[i];
            }
        }

        private IdentityCard() {
        }

        @Override // com.revolut.biometric_verification.api.models.BiometricVerificationDocumentType
        public final String V3() {
            return "IDENTITY_CARD";
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/biometric_verification/api/models/BiometricVerificationDocumentType$Passport;", "Lcom/revolut/biometric_verification/api/models/BiometricVerificationDocumentType;", "<init>", "()V", "biometric_verification_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Passport implements BiometricVerificationDocumentType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Passport f50387a = new Passport();

        @NotNull
        public static final Parcelable.Creator<Passport> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Passport.f50387a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Passport[i];
            }
        }

        private Passport() {
        }

        @Override // com.revolut.biometric_verification.api.models.BiometricVerificationDocumentType
        public final String V3() {
            return "PASSPORT";
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/biometric_verification/api/models/BiometricVerificationDocumentType$ResidencePermit;", "Lcom/revolut/biometric_verification/api/models/BiometricVerificationDocumentType;", "<init>", "()V", "biometric_verification_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ResidencePermit implements BiometricVerificationDocumentType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ResidencePermit f50388a = new ResidencePermit();

        @NotNull
        public static final Parcelable.Creator<ResidencePermit> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ResidencePermit.f50388a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ResidencePermit[i];
            }
        }

        private ResidencePermit() {
        }

        @Override // com.revolut.biometric_verification.api.models.BiometricVerificationDocumentType
        public final String V3() {
            return "RESIDENCE_PERMIT";
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/biometric_verification/api/models/BiometricVerificationDocumentType$Visa;", "Lcom/revolut/biometric_verification/api/models/BiometricVerificationDocumentType;", "<init>", "()V", "biometric_verification_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Visa implements BiometricVerificationDocumentType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Visa f50389a = new Visa();

        @NotNull
        public static final Parcelable.Creator<Visa> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Visa.f50389a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Visa[i];
            }
        }

        private Visa() {
        }

        @Override // com.revolut.biometric_verification.api.models.BiometricVerificationDocumentType
        public final String V3() {
            return "VISA";
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

    String V3();
}

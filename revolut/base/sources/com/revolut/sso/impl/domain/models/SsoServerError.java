package com.revolut.sso.impl.domain.models;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Set;
import jkl.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00060\u0001j\u0002`\u0002:$\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'(B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001$)*+,-./0123456789:;<=>?@ABCDEFGHIJKL¨\u0006M"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "AccountIsNotRelatedToUser", "AuthenticationReviewing", "AuthenticationRejected", "CaptchaRequired", "ChallengeNoLongerAvailable", "CodeExpiredOrInvalid", "CountryMismatch", "DeviceIdHardwareIdMismatch", "ConfirmationRequired", "EmailIsTheSame", "EvidenceNotVerifiedYet", "ExternalIdentityVerificationFailed", "FeatureNotAvailable", "Forbidden", "IdentityInUse", "LocationDistance", "LocationRequired", "LoginRejected", "TooManyChallenges", "PasscodeContainsBirthDate", "PasscodeContainsCurrentDate", "PasscodeContainsIndividualCreatedDate", "PasscodeIsNotStrong", "PasscodeIsTheSame", "PasswordInvalid", "PasswordIsTheSame", "PasswordNotStrongEnough", "PasswordTooLong", "PhoneIsTheSame", "PhoneResidencyMismatch", "SessionTokenAuthFailed", "SessionTokenExpired", "SessionTokenInvalid", "SocialAccountUnlinked", "SsoRequired", "Unauthorised", "Lcom/revolut/sso/impl/domain/models/SsoServerError$AccountIsNotRelatedToUser;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$AuthenticationRejected;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$AuthenticationReviewing;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$CaptchaRequired;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$ChallengeNoLongerAvailable;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$CodeExpiredOrInvalid;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$ConfirmationRequired;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$CountryMismatch;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$DeviceIdHardwareIdMismatch;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$EmailIsTheSame;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$EvidenceNotVerifiedYet;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$ExternalIdentityVerificationFailed;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$FeatureNotAvailable;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$Forbidden;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$IdentityInUse;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$LocationDistance;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$LocationRequired;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$LoginRejected;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$PasscodeContainsBirthDate;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$PasscodeContainsCurrentDate;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$PasscodeContainsIndividualCreatedDate;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$PasscodeIsNotStrong;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$PasscodeIsTheSame;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$PasswordInvalid;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$PasswordIsTheSame;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$PasswordNotStrongEnough;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$PasswordTooLong;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$PhoneIsTheSame;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$PhoneResidencyMismatch;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$SessionTokenAuthFailed;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$SessionTokenExpired;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$SessionTokenInvalid;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$SocialAccountUnlinked;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$SsoRequired;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$TooManyChallenges;", "Lcom/revolut/sso/impl/domain/models/SsoServerError$Unauthorised;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SsoServerError extends Exception {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$AccountIsNotRelatedToUser;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountIsNotRelatedToUser extends SsoServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106161a;

        public AccountIsNotRelatedToUser(String str) {
            super(0);
            this.f106161a = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AccountIsNotRelatedToUser) && Intrinsics.f(this.f106161a, ((AccountIsNotRelatedToUser) obj2).f106161a);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f106161a;
        }

        public final int hashCode() {
            String str = this.f106161a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$AuthenticationRejected;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AuthenticationRejected extends SsoServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ZonedDateTime f106162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f106163b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f106164c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthenticationRejected(ZonedDateTime zonedDateTime, Set actions, String str) {
            super(0);
            Intrinsics.checkNotNullParameter(actions, "actions");
            this.f106162a = zonedDateTime;
            this.f106163b = actions;
            this.f106164c = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AuthenticationRejected)) {
                return false;
            }
            AuthenticationRejected authenticationRejected = (AuthenticationRejected) obj2;
            return Intrinsics.f(this.f106162a, authenticationRejected.f106162a) && Intrinsics.f(this.f106163b, authenticationRejected.f106163b) && Intrinsics.f(this.f106164c, authenticationRejected.f106164c);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f106164c;
        }

        public final int hashCode() {
            ZonedDateTime zonedDateTime = this.f106162a;
            int iF = p.a.f((zonedDateTime == null ? 0 : zonedDateTime.hashCode()) * 31, 31, this.f106163b);
            String str = this.f106164c;
            return iF + (str != null ? str.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$AuthenticationReviewing;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AuthenticationReviewing extends SsoServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106165a;

        public AuthenticationReviewing(String str) {
            super(0);
            this.f106165a = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AuthenticationReviewing) && Intrinsics.f(this.f106165a, ((AuthenticationReviewing) obj2).f106165a);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f106165a;
        }

        public final int hashCode() {
            String str = this.f106165a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$CaptchaRequired;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CaptchaRequired extends SsoServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106166a;

        public CaptchaRequired(String str) {
            super(0);
            this.f106166a = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CaptchaRequired) && Intrinsics.f(this.f106166a, ((CaptchaRequired) obj2).f106166a);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f106166a;
        }

        public final int hashCode() {
            String str = this.f106166a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$ChallengeNoLongerAvailable;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChallengeNoLongerAvailable extends SsoServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106167a;

        public ChallengeNoLongerAvailable(String str) {
            super(0);
            this.f106167a = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ChallengeNoLongerAvailable) && Intrinsics.f(this.f106167a, ((ChallengeNoLongerAvailable) obj2).f106167a);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f106167a;
        }

        public final int hashCode() {
            String str = this.f106167a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$CodeExpiredOrInvalid;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CodeExpiredOrInvalid extends SsoServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106168a;

        public CodeExpiredOrInvalid(String str) {
            super(0);
            this.f106168a = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CodeExpiredOrInvalid) && Intrinsics.f(this.f106168a, ((CodeExpiredOrInvalid) obj2).f106168a);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f106168a;
        }

        public final int hashCode() {
            String str = this.f106168a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$ConfirmationRequired;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConfirmationRequired extends SsoServerError {
        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof ConfirmationRequired);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return null;
        }

        public final int hashCode() {
            return 0;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$CountryMismatch;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CountryMismatch extends SsoServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106169a;

        public CountryMismatch(String str) {
            super(0);
            this.f106169a = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CountryMismatch) && Intrinsics.f(this.f106169a, ((CountryMismatch) obj2).f106169a);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f106169a;
        }

        public final int hashCode() {
            String str = this.f106169a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$DeviceIdHardwareIdMismatch;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DeviceIdHardwareIdMismatch extends SsoServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106170a;

        public DeviceIdHardwareIdMismatch(String str) {
            super(0);
            this.f106170a = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DeviceIdHardwareIdMismatch) && Intrinsics.f(this.f106170a, ((DeviceIdHardwareIdMismatch) obj2).f106170a);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f106170a;
        }

        public final int hashCode() {
            String str = this.f106170a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$EmailIsTheSame;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EmailIsTheSame extends SsoServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106171a;

        public EmailIsTheSame(String str) {
            super(0);
            this.f106171a = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EmailIsTheSame) && Intrinsics.f(this.f106171a, ((EmailIsTheSame) obj2).f106171a);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f106171a;
        }

        public final int hashCode() {
            String str = this.f106171a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$EvidenceNotVerifiedYet;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EvidenceNotVerifiedYet extends SsoServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f106172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f106173b;

        public EvidenceNotVerifiedYet(int i, String str) {
            super(0);
            this.f106172a = i;
            this.f106173b = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EvidenceNotVerifiedYet)) {
                return false;
            }
            EvidenceNotVerifiedYet evidenceNotVerifiedYet = (EvidenceNotVerifiedYet) obj2;
            return this.f106172a == evidenceNotVerifiedYet.f106172a && Intrinsics.f(this.f106173b, evidenceNotVerifiedYet.f106173b);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f106173b;
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f106172a) * 31;
            String str = this.f106173b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$ExternalIdentityVerificationFailed;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExternalIdentityVerificationFailed extends SsoServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106174a;

        public ExternalIdentityVerificationFailed(String str) {
            super(0);
            this.f106174a = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ExternalIdentityVerificationFailed) && Intrinsics.f(this.f106174a, ((ExternalIdentityVerificationFailed) obj2).f106174a);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f106174a;
        }

        public final int hashCode() {
            String str = this.f106174a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$FeatureNotAvailable;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FeatureNotAvailable extends SsoServerError {
        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof FeatureNotAvailable);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return null;
        }

        public final int hashCode() {
            return 0;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$Forbidden;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Forbidden extends SsoServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106175a;

        public Forbidden(String str) {
            super(0);
            this.f106175a = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Forbidden) && Intrinsics.f(this.f106175a, ((Forbidden) obj2).f106175a);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f106175a;
        }

        public final int hashCode() {
            String str = this.f106175a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$IdentityInUse;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IdentityInUse extends SsoServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106176a;

        public IdentityInUse(String str) {
            super(0);
            this.f106176a = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof IdentityInUse) && Intrinsics.f(this.f106176a, ((IdentityInUse) obj2).f106176a);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f106176a;
        }

        public final int hashCode() {
            String str = this.f106176a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$LocationDistance;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LocationDistance extends SsoServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106177a;

        public LocationDistance(String str) {
            super(0);
            this.f106177a = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LocationDistance) && Intrinsics.f(this.f106177a, ((LocationDistance) obj2).f106177a);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f106177a;
        }

        public final int hashCode() {
            String str = this.f106177a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$LocationRequired;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LocationRequired extends SsoServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106178a;

        public LocationRequired(String str) {
            super(0);
            this.f106178a = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LocationRequired) && Intrinsics.f(this.f106178a, ((LocationRequired) obj2).f106178a);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f106178a;
        }

        public final int hashCode() {
            String str = this.f106178a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$LoginRejected;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LoginRejected extends SsoServerError {
        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof LoginRejected);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return null;
        }

        public final int hashCode() {
            return 0;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$PasscodeContainsBirthDate;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PasscodeContainsBirthDate extends SsoServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106179a;

        public PasscodeContainsBirthDate(String str) {
            super(0);
            this.f106179a = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PasscodeContainsBirthDate) && Intrinsics.f(this.f106179a, ((PasscodeContainsBirthDate) obj2).f106179a);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f106179a;
        }

        public final int hashCode() {
            String str = this.f106179a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$PasscodeContainsCurrentDate;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PasscodeContainsCurrentDate extends SsoServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106180a;

        public PasscodeContainsCurrentDate(String str) {
            super(0);
            this.f106180a = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PasscodeContainsCurrentDate) && Intrinsics.f(this.f106180a, ((PasscodeContainsCurrentDate) obj2).f106180a);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f106180a;
        }

        public final int hashCode() {
            String str = this.f106180a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$PasscodeContainsIndividualCreatedDate;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PasscodeContainsIndividualCreatedDate extends SsoServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106181a;

        public PasscodeContainsIndividualCreatedDate(String str) {
            super(0);
            this.f106181a = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PasscodeContainsIndividualCreatedDate) && Intrinsics.f(this.f106181a, ((PasscodeContainsIndividualCreatedDate) obj2).f106181a);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f106181a;
        }

        public final int hashCode() {
            String str = this.f106181a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$PasscodeIsNotStrong;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PasscodeIsNotStrong extends SsoServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106182a;

        public PasscodeIsNotStrong(String str) {
            super(0);
            this.f106182a = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PasscodeIsNotStrong) && Intrinsics.f(this.f106182a, ((PasscodeIsNotStrong) obj2).f106182a);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f106182a;
        }

        public final int hashCode() {
            String str = this.f106182a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$PasscodeIsTheSame;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PasscodeIsTheSame extends SsoServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106183a;

        public PasscodeIsTheSame(String str) {
            super(0);
            this.f106183a = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PasscodeIsTheSame) && Intrinsics.f(this.f106183a, ((PasscodeIsTheSame) obj2).f106183a);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f106183a;
        }

        public final int hashCode() {
            String str = this.f106183a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$PasswordInvalid;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PasswordInvalid extends SsoServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106184a;

        public PasswordInvalid(String str) {
            super(0);
            this.f106184a = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PasswordInvalid) && Intrinsics.f(this.f106184a, ((PasswordInvalid) obj2).f106184a);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f106184a;
        }

        public final int hashCode() {
            String str = this.f106184a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$PasswordIsTheSame;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PasswordIsTheSame extends SsoServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106185a;

        public PasswordIsTheSame(String str) {
            super(0);
            this.f106185a = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PasswordIsTheSame) && Intrinsics.f(this.f106185a, ((PasswordIsTheSame) obj2).f106185a);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f106185a;
        }

        public final int hashCode() {
            String str = this.f106185a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$PasswordNotStrongEnough;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PasswordNotStrongEnough extends SsoServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106186a;

        public PasswordNotStrongEnough(String str) {
            super(0);
            this.f106186a = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PasswordNotStrongEnough) && Intrinsics.f(this.f106186a, ((PasswordNotStrongEnough) obj2).f106186a);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f106186a;
        }

        public final int hashCode() {
            String str = this.f106186a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$PasswordTooLong;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PasswordTooLong extends SsoServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106187a;

        public PasswordTooLong(String str) {
            super(0);
            this.f106187a = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PasswordTooLong) && Intrinsics.f(this.f106187a, ((PasswordTooLong) obj2).f106187a);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f106187a;
        }

        public final int hashCode() {
            String str = this.f106187a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$PhoneIsTheSame;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PhoneIsTheSame extends SsoServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106188a;

        public PhoneIsTheSame(String str) {
            super(0);
            this.f106188a = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PhoneIsTheSame) && Intrinsics.f(this.f106188a, ((PhoneIsTheSame) obj2).f106188a);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f106188a;
        }

        public final int hashCode() {
            String str = this.f106188a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$PhoneResidencyMismatch;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PhoneResidencyMismatch extends SsoServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106189a;

        public PhoneResidencyMismatch(String str) {
            super(0);
            this.f106189a = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PhoneResidencyMismatch) && Intrinsics.f(this.f106189a, ((PhoneResidencyMismatch) obj2).f106189a);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f106189a;
        }

        public final int hashCode() {
            String str = this.f106189a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$SessionTokenAuthFailed;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SessionTokenAuthFailed extends SsoServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106190a;

        public SessionTokenAuthFailed(String str) {
            super(0);
            this.f106190a = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SessionTokenAuthFailed) && Intrinsics.f(this.f106190a, ((SessionTokenAuthFailed) obj2).f106190a);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f106190a;
        }

        public final int hashCode() {
            String str = this.f106190a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$SessionTokenExpired;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SessionTokenExpired extends SsoServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106191a;

        public SessionTokenExpired(String str) {
            super(0);
            this.f106191a = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SessionTokenExpired) && Intrinsics.f(this.f106191a, ((SessionTokenExpired) obj2).f106191a);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f106191a;
        }

        public final int hashCode() {
            String str = this.f106191a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$SessionTokenInvalid;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SessionTokenInvalid extends SsoServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106192a;

        public SessionTokenInvalid(String str) {
            super(0);
            this.f106192a = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SessionTokenInvalid) && Intrinsics.f(this.f106192a, ((SessionTokenInvalid) obj2).f106192a);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f106192a;
        }

        public final int hashCode() {
            String str = this.f106192a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$SocialAccountUnlinked;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SocialAccountUnlinked extends SsoServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f106193a;

        public SocialAccountUnlinked(String str) {
            super(0);
            this.f106193a = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SocialAccountUnlinked) && Intrinsics.f(this.f106193a, ((SocialAccountUnlinked) obj2).f106193a);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f106193a;
        }

        public final int hashCode() {
            String str = this.f106193a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$SsoRequired;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SsoRequired extends SsoServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f106194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f106195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f106196c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SsoRequired(String state, String str, List acceptedAuthenticationContexts) {
            super(0);
            Intrinsics.checkNotNullParameter(acceptedAuthenticationContexts, "acceptedAuthenticationContexts");
            Intrinsics.checkNotNullParameter(state, "state");
            this.f106194a = acceptedAuthenticationContexts;
            this.f106195b = state;
            this.f106196c = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getF106194a() {
            return this.f106194a;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF106195b() {
            return this.f106195b;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SsoRequired)) {
                return false;
            }
            SsoRequired ssoRequired = (SsoRequired) obj2;
            return Intrinsics.f(this.f106194a, ssoRequired.f106194a) && Intrinsics.f(this.f106195b, ssoRequired.f106195b) && Intrinsics.f(this.f106196c, ssoRequired.f106196c);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f106196c;
        }

        public final int hashCode() {
            int iC = p.a.c(this.f106194a.hashCode() * 31, 31, this.f106195b);
            String str = this.f106196c;
            return iC + (str == null ? 0 : str.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$TooManyChallenges;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TooManyChallenges extends SsoServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f106197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ZonedDateTime f106198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set f106199c;
        public final String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TooManyChallenges(i iVar, ZonedDateTime zonedDateTime, Set actions, String str) {
            super(0);
            Intrinsics.checkNotNullParameter(actions, "actions");
            this.f106197a = iVar;
            this.f106198b = zonedDateTime;
            this.f106199c = actions;
            this.d = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TooManyChallenges)) {
                return false;
            }
            TooManyChallenges tooManyChallenges = (TooManyChallenges) obj2;
            return this.f106197a == tooManyChallenges.f106197a && Intrinsics.f(this.f106198b, tooManyChallenges.f106198b) && Intrinsics.f(this.f106199c, tooManyChallenges.f106199c) && Intrinsics.f(this.d, tooManyChallenges.d);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.d;
        }

        public final int hashCode() {
            i iVar = this.f106197a;
            int iHashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
            ZonedDateTime zonedDateTime = this.f106198b;
            int iF = p.a.f((iHashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31, 31, this.f106199c);
            String str = this.d;
            return iF + (str != null ? str.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/domain/models/SsoServerError$Unauthorised;", "Lcom/revolut/sso/impl/domain/models/SsoServerError;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Unauthorised extends SsoServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f106200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f106201b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f106202c;

        public Unauthorised(i iVar, Integer num, String str) {
            super(0);
            this.f106200a = iVar;
            this.f106201b = num;
            this.f106202c = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Unauthorised)) {
                return false;
            }
            Unauthorised unauthorised = (Unauthorised) obj2;
            return this.f106200a == unauthorised.f106200a && Intrinsics.f(this.f106201b, unauthorised.f106201b) && Intrinsics.f(this.f106202c, unauthorised.f106202c);
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.f106202c;
        }

        public final int hashCode() {
            i iVar = this.f106200a;
            int iHashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
            Integer num = this.f106201b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f106202c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }
    }

    public /* synthetic */ SsoServerError(int i) {
        this();
    }

    private SsoServerError() {
    }
}

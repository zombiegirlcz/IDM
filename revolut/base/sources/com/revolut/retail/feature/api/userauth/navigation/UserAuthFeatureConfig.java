package com.revolut.retail.feature.api.userauth.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import bjl.n;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.feature.api.userauth.models.SignInOrigin;
import com.revolut.sso.api.models.RevolutAccountSession;
import com.revolut.sso.api.models.UICustomization;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "<init>", "()V", "Main", "PersonalisedGraduationSignUp", "AutoSignInAfterSsoForgotPasscode", "AutoSignInAfterSsoUnlockAppWithBiometrics", "UseCase", "SignInParams", "Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$AutoSignInAfterSsoForgotPasscode;", "Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$AutoSignInAfterSsoUnlockAppWithBiometrics;", "Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$Main;", "Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$PersonalisedGraduationSignUp;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class UserAuthFeatureConfig implements FeatureConfig {

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$AutoSignInAfterSsoForgotPasscode;", "Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AutoSignInAfterSsoForgotPasscode extends UserAuthFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<AutoSignInAfterSsoForgotPasscode> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f99335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f99336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f99337c;
        public final boolean d;
        public final UseCase e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AutoSignInAfterSsoForgotPasscode(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (UseCase) parcel.readParcelable(AutoSignInAfterSsoForgotPasscode.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AutoSignInAfterSsoForgotPasscode[i];
            }
        }

        public AutoSignInAfterSsoForgotPasscode(String codeVerifier, String passcode, String authCode, boolean z, UseCase useCase) {
            Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
            Intrinsics.checkNotNullParameter(passcode, "passcode");
            Intrinsics.checkNotNullParameter(authCode, "authCode");
            Intrinsics.checkNotNullParameter(useCase, "useCase");
            this.f99335a = codeVerifier;
            this.f99336b = passcode;
            this.f99337c = authCode;
            this.d = z;
            this.e = useCase;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AutoSignInAfterSsoForgotPasscode)) {
                return false;
            }
            AutoSignInAfterSsoForgotPasscode autoSignInAfterSsoForgotPasscode = (AutoSignInAfterSsoForgotPasscode) obj2;
            return Intrinsics.f(this.f99335a, autoSignInAfterSsoForgotPasscode.f99335a) && Intrinsics.f(this.f99336b, autoSignInAfterSsoForgotPasscode.f99336b) && Intrinsics.f(this.f99337c, autoSignInAfterSsoForgotPasscode.f99337c) && this.d == autoSignInAfterSsoForgotPasscode.d && Intrinsics.f(this.e, autoSignInAfterSsoForgotPasscode.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + j6.a.c(p.a.c(p.a.c(this.f99335a.hashCode() * 31, 31, this.f99336b), 31, this.f99337c), 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99335a);
            dest.writeString(this.f99336b);
            dest.writeString(this.f99337c);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeParcelable(this.e, i);
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$AutoSignInAfterSsoUnlockAppWithBiometrics;", "Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AutoSignInAfterSsoUnlockAppWithBiometrics extends UserAuthFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<AutoSignInAfterSsoUnlockAppWithBiometrics> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f99338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f99339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f99340c;
        public final UseCase d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AutoSignInAfterSsoUnlockAppWithBiometrics(parcel.readString(), parcel.readString(), parcel.readInt() != 0, (UseCase) parcel.readParcelable(AutoSignInAfterSsoUnlockAppWithBiometrics.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AutoSignInAfterSsoUnlockAppWithBiometrics[i];
            }
        }

        public AutoSignInAfterSsoUnlockAppWithBiometrics(String codeVerifier, String authCode, boolean z, UseCase useCase) {
            Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
            Intrinsics.checkNotNullParameter(authCode, "authCode");
            Intrinsics.checkNotNullParameter(useCase, "useCase");
            this.f99338a = codeVerifier;
            this.f99339b = authCode;
            this.f99340c = z;
            this.d = useCase;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AutoSignInAfterSsoUnlockAppWithBiometrics)) {
                return false;
            }
            AutoSignInAfterSsoUnlockAppWithBiometrics autoSignInAfterSsoUnlockAppWithBiometrics = (AutoSignInAfterSsoUnlockAppWithBiometrics) obj2;
            return Intrinsics.f(this.f99338a, autoSignInAfterSsoUnlockAppWithBiometrics.f99338a) && Intrinsics.f(this.f99339b, autoSignInAfterSsoUnlockAppWithBiometrics.f99339b) && this.f99340c == autoSignInAfterSsoUnlockAppWithBiometrics.f99340c && Intrinsics.f(this.d, autoSignInAfterSsoUnlockAppWithBiometrics.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + j6.a.c(p.a.c(this.f99338a.hashCode() * 31, 31, this.f99339b), 31, this.f99340c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99338a);
            dest.writeString(this.f99339b);
            dest.writeInt(this.f99340c ? 1 : 0);
            dest.writeParcelable(this.d, i);
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$PersonalisedGraduationSignUp;", "Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Params", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PersonalisedGraduationSignUp extends UserAuthFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<PersonalisedGraduationSignUp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Params f99347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final UseCase.CombinedAuthentication f99348c;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$PersonalisedGraduationSignUp$Params;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Params implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Params> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f99349a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f99350b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f99351c;
            public final Long d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Params(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Params[i];
                }
            }

            public Params(String userName, Long l2, String str, String str2) {
                Intrinsics.checkNotNullParameter(userName, "userName");
                this.f99349a = userName;
                this.f99350b = str;
                this.f99351c = str2;
                this.d = l2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Params)) {
                    return false;
                }
                Params params = (Params) obj2;
                return Intrinsics.f(this.f99349a, params.f99349a) && Intrinsics.f(this.f99350b, params.f99350b) && Intrinsics.f(this.f99351c, params.f99351c) && Intrinsics.f(this.d, params.d);
            }

            public final int hashCode() {
                int iHashCode = this.f99349a.hashCode() * 31;
                String str = this.f99350b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f99351c;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Long l2 = this.d;
                return iHashCode3 + (l2 != null ? l2.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f99349a);
                dest.writeString(this.f99350b);
                dest.writeString(this.f99351c);
                Long l2 = this.d;
                if (l2 == null) {
                    dest.writeInt(0);
                } else {
                    b.A(dest, 1, l2);
                }
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PersonalisedGraduationSignUp(parcel.readInt() != 0, Params.CREATOR.createFromParcel(parcel), UseCase.CombinedAuthentication.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PersonalisedGraduationSignUp[i];
            }
        }

        public PersonalisedGraduationSignUp(boolean z, Params params, UseCase.CombinedAuthentication fallback) {
            Intrinsics.checkNotNullParameter(params, "params");
            Intrinsics.checkNotNullParameter(fallback, "fallback");
            this.f99346a = z;
            this.f99347b = params;
            this.f99348c = fallback;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PersonalisedGraduationSignUp)) {
                return false;
            }
            PersonalisedGraduationSignUp personalisedGraduationSignUp = (PersonalisedGraduationSignUp) obj2;
            return this.f99346a == personalisedGraduationSignUp.f99346a && Intrinsics.f(this.f99347b, personalisedGraduationSignUp.f99347b) && Intrinsics.f(this.f99348c, personalisedGraduationSignUp.f99348c);
        }

        public final int hashCode() {
            return this.f99348c.hashCode() + ((this.f99347b.hashCode() + (Boolean.hashCode(this.f99346a) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f99346a ? 1 : 0);
            this.f99347b.writeToParcel(dest, i);
            this.f99348c.writeToParcel(dest, i);
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$SignInParams;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SignInParams implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SignInParams> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevolutAccountSession f99352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SignInOrigin f99353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final UICustomization f99354c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SignInParams((RevolutAccountSession) parcel.readParcelable(SignInParams.class.getClassLoader()), (SignInOrigin) parcel.readParcelable(SignInParams.class.getClassLoader()), (UICustomization) parcel.readParcelable(SignInParams.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SignInParams[i];
            }
        }

        public SignInParams(RevolutAccountSession revolutAccountSession, SignInOrigin origin, UICustomization uiCustomization) {
            Intrinsics.checkNotNullParameter(origin, "origin");
            Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
            this.f99352a = revolutAccountSession;
            this.f99353b = origin;
            this.f99354c = uiCustomization;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SignInParams)) {
                return false;
            }
            SignInParams signInParams = (SignInParams) obj2;
            return Intrinsics.f(this.f99352a, signInParams.f99352a) && Intrinsics.f(this.f99353b, signInParams.f99353b) && Intrinsics.f(this.f99354c, signInParams.f99354c);
        }

        public final int hashCode() {
            RevolutAccountSession revolutAccountSession = this.f99352a;
            return this.f99354c.hashCode() + ((this.f99353b.hashCode() + ((revolutAccountSession == null ? 0 : revolutAccountSession.hashCode()) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f99352a, i);
            dest.writeParcelable(this.f99353b, i);
            dest.writeParcelable(this.f99354c, i);
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$UseCase;", "Landroid/os/Parcelable;", "<init>", "()V", "ForgotPasscode", "SignIn", "SignUp", "SignUpWithJuniorGraduationConfirmation", "SignUpWithDeepLink", "CombinedAuthentication", "Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$UseCase$CombinedAuthentication;", "Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$UseCase$ForgotPasscode;", "Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$UseCase$SignIn;", "Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$UseCase$SignUp;", "Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$UseCase$SignUpWithDeepLink;", "Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$UseCase$SignUpWithJuniorGraduationConfirmation;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class UseCase implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$UseCase$CombinedAuthentication;", "Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$UseCase;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CombinedAuthentication extends UseCase {

            @NotNull
            public static final Parcelable.Creator<CombinedAuthentication> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f99355a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f99356b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final p0j.a f99357c;
            public final boolean d;
            public final boolean e;
            public final n f;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    boolean z;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    p0j.a aVarValueOf = p0j.a.valueOf(parcel.readString());
                    boolean z3 = false;
                    if (parcel.readInt() != 0) {
                        z = false;
                        z3 = true;
                    } else {
                        z = false;
                    }
                    return new CombinedAuthentication(string, string2, aVarValueOf, z3, parcel.readInt() == 0 ? z : true, parcel.readInt() == 0 ? null : n.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CombinedAuthentication[i];
                }
            }

            public CombinedAuthentication(String detectedCountryCode, String str, p0j.a mode, boolean z, boolean z3, n nVar) {
                Intrinsics.checkNotNullParameter(detectedCountryCode, "detectedCountryCode");
                Intrinsics.checkNotNullParameter(mode, "mode");
                this.f99355a = detectedCountryCode;
                this.f99356b = str;
                this.f99357c = mode;
                this.d = z;
                this.e = z3;
                this.f = nVar;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof CombinedAuthentication)) {
                    return false;
                }
                CombinedAuthentication combinedAuthentication = (CombinedAuthentication) obj2;
                return Intrinsics.f(this.f99355a, combinedAuthentication.f99355a) && Intrinsics.f(this.f99356b, combinedAuthentication.f99356b) && this.f99357c == combinedAuthentication.f99357c && this.d == combinedAuthentication.d && this.e == combinedAuthentication.e && this.f == combinedAuthentication.f;
            }

            public final int hashCode() {
                int iHashCode = this.f99355a.hashCode() * 31;
                String str = this.f99356b;
                int iC = j6.a.c(j6.a.c((this.f99357c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.d), 31, this.e);
                n nVar = this.f;
                return iC + (nVar != null ? nVar.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f99355a);
                dest.writeString(this.f99356b);
                dest.writeString(this.f99357c.name());
                dest.writeInt(this.d ? 1 : 0);
                dest.writeInt(this.e ? 1 : 0);
                n nVar = this.f;
                if (nVar == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(nVar.name());
                }
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$UseCase$ForgotPasscode;", "Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$UseCase;", "<init>", "()V", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class ForgotPasscode extends UseCase {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ForgotPasscode f99358a = new ForgotPasscode();

            @NotNull
            public static final Parcelable.Creator<ForgotPasscode> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ForgotPasscode.f99358a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ForgotPasscode[i];
                }
            }

            private ForgotPasscode() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$UseCase$SignIn;", "Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$UseCase;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SignIn extends UseCase {

            @NotNull
            public static final Parcelable.Creator<SignIn> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SignInParams f99359a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SignIn(SignInParams.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SignIn[i];
                }
            }

            public SignIn() {
                this(0);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof SignIn) && Intrinsics.f(this.f99359a, ((SignIn) obj2).f99359a);
            }

            public final int hashCode() {
                return this.f99359a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f99359a.writeToParcel(dest, i);
            }

            public SignIn(SignInParams signInParams) {
                Intrinsics.checkNotNullParameter(signInParams, "signInParams");
                this.f99359a = signInParams;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public /* synthetic */ SignIn(int i) {
                this(new SignInParams(null, SignInOrigin.Default.f99273a, new UICustomization(null, 0 == true ? 1 : 0, 31)));
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$UseCase$SignUp;", "Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$UseCase;", "<init>", "()V", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class SignUp extends UseCase {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SignUp f99360a = new SignUp();

            @NotNull
            public static final Parcelable.Creator<SignUp> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return SignUp.f99360a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SignUp[i];
                }
            }

            private SignUp() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$UseCase$SignUpWithDeepLink;", "Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$UseCase;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SignUpWithDeepLink extends UseCase {

            @NotNull
            public static final Parcelable.Creator<SignUpWithDeepLink> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f99361a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SignUpWithDeepLink(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SignUpWithDeepLink[i];
                }
            }

            public SignUpWithDeepLink(String deepLinkUrl) {
                Intrinsics.checkNotNullParameter(deepLinkUrl, "deepLinkUrl");
                this.f99361a = deepLinkUrl;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof SignUpWithDeepLink) && Intrinsics.f(this.f99361a, ((SignUpWithDeepLink) obj2).f99361a);
            }

            public final int hashCode() {
                return this.f99361a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f99361a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$UseCase$SignUpWithJuniorGraduationConfirmation;", "Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$UseCase;", "<init>", "()V", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class SignUpWithJuniorGraduationConfirmation extends UseCase {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SignUpWithJuniorGraduationConfirmation f99362a = new SignUpWithJuniorGraduationConfirmation();

            @NotNull
            public static final Parcelable.Creator<SignUpWithJuniorGraduationConfirmation> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return SignUpWithJuniorGraduationConfirmation.f99362a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SignUpWithJuniorGraduationConfirmation[i];
                }
            }

            private SignUpWithJuniorGraduationConfirmation() {
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

        private UseCase() {
        }
    }

    private UserAuthFeatureConfig() {
    }

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$Main;", "Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig;", "", "toString", "()Ljava/lang/String;", "SSODeeplinkData", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Main extends UserAuthFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Main> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f99341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f99342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SSODeeplinkData f99343c;
        public final boolean d;
        public final UseCase e;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$Main$SSODeeplinkData;", "Landroid/os/Parcelable;", "BankId", "DAP", "Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$Main$SSODeeplinkData$BankId;", "Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$Main$SSODeeplinkData$DAP;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface SSODeeplinkData extends Parcelable {

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$Main$SSODeeplinkData$BankId;", "Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$Main$SSODeeplinkData;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class BankId implements SSODeeplinkData {

                @NotNull
                public static final Parcelable.Creator<BankId> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f99344a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new BankId(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new BankId[i];
                    }
                }

                public BankId(String challengeId) {
                    Intrinsics.checkNotNullParameter(challengeId, "challengeId");
                    this.f99344a = challengeId;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof BankId) && Intrinsics.f(this.f99344a, ((BankId) obj2).f99344a);
                }

                public final int hashCode() {
                    return this.f99344a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f99344a);
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$Main$SSODeeplinkData$DAP;", "Lcom/revolut/retail/feature/api/userauth/navigation/UserAuthFeatureConfig$Main$SSODeeplinkData;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class DAP implements SSODeeplinkData {

                @NotNull
                public static final Parcelable.Creator<DAP> CREATOR = new a();

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f99345a;

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new DAP(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new DAP[i];
                    }
                }

                public DAP(String challengeId) {
                    Intrinsics.checkNotNullParameter(challengeId, "challengeId");
                    this.f99345a = challengeId;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    return (obj2 instanceof DAP) && Intrinsics.f(this.f99345a, ((DAP) obj2).f99345a);
                }

                public final int hashCode() {
                    return this.f99345a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.f99345a);
                }
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                boolean z3 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                SSODeeplinkData sSODeeplinkData = (SSODeeplinkData) parcel.readParcelable(Main.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new Main(string, z3, sSODeeplinkData, z, (UseCase) parcel.readParcelable(Main.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Main[i];
            }
        }

        public Main(String str, boolean z, SSODeeplinkData sSODeeplinkData, boolean z3, UseCase useCase) {
            Intrinsics.checkNotNullParameter(useCase, "useCase");
            this.f99341a = str;
            this.f99342b = z;
            this.f99343c = sSODeeplinkData;
            this.d = z3;
            this.e = useCase;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Main)) {
                return false;
            }
            Main main = (Main) obj2;
            return Intrinsics.f(this.f99341a, main.f99341a) && this.f99342b == main.f99342b && Intrinsics.f(this.f99343c, main.f99343c) && this.d == main.d && Intrinsics.f(this.e, main.e);
        }

        public final int hashCode() {
            String str = this.f99341a;
            int iC = j6.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f99342b);
            SSODeeplinkData sSODeeplinkData = this.f99343c;
            return this.e.hashCode() + j6.a.c((iC + (sSODeeplinkData != null ? sSODeeplinkData.hashCode() : 0)) * 31, 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99341a);
            dest.writeInt(this.f99342b ? 1 : 0);
            dest.writeParcelable(this.f99343c, i);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeParcelable(this.e, i);
        }

        public /* synthetic */ Main(String str, SSODeeplinkData sSODeeplinkData, boolean z, UseCase useCase, int i) {
            this((i & 1) != 0 ? null : str, true, (i & 4) != 0 ? null : sSODeeplinkData, (i & 8) != 0 ? false : z, useCase);
        }
    }
}

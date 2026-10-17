package com.revolut.retail.feature.impl.userauth.shared;

import android.os.Parcel;
import android.os.Parcelable;
import bjl.n;
import com.revolut.feature.junior_graduation.api.model.PersonalisedGraduationData;
import com.revolut.retail.feature.api.userauth.models.SignInOrigin;
import com.revolut.retail.feature.api.userauth.navigation.UserAuthFeatureConfig;
import com.revolut.retail.feature.impl.userauth.screen.revolut_sso.domain.SignInMode;
import com.revolut.sso.api.models.UICustomization;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/shared/UserAuthUseCase;", "Landroid/os/Parcelable;", "<init>", "()V", "ForgotPasscode", "SignIn", "SignUp", "CombinedAuthentication", "PersonalisedGraduationSignUp", "Lcom/revolut/retail/feature/impl/userauth/shared/UserAuthUseCase$CombinedAuthentication;", "Lcom/revolut/retail/feature/impl/userauth/shared/UserAuthUseCase$ForgotPasscode;", "Lcom/revolut/retail/feature/impl/userauth/shared/UserAuthUseCase$PersonalisedGraduationSignUp;", "Lcom/revolut/retail/feature/impl/userauth/shared/UserAuthUseCase$SignIn;", "Lcom/revolut/retail/feature/impl/userauth/shared/UserAuthUseCase$SignUp;", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class UserAuthUseCase implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/shared/UserAuthUseCase$CombinedAuthentication;", "Lcom/revolut/retail/feature/impl/userauth/shared/UserAuthUseCase;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CombinedAuthentication extends UserAuthUseCase {

        @NotNull
        public static final Parcelable.Creator<CombinedAuthentication> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f101733b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p0j.a f101734c;
        public final boolean d;
        public final n e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CombinedAuthentication(parcel.readString(), parcel.readString(), p0j.a.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : n.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CombinedAuthentication[i];
            }
        }

        public CombinedAuthentication(String detectedCountryCode, String str, p0j.a mode, boolean z, n nVar) {
            Intrinsics.checkNotNullParameter(detectedCountryCode, "detectedCountryCode");
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.f101732a = detectedCountryCode;
            this.f101733b = str;
            this.f101734c = mode;
            this.d = z;
            this.e = nVar;
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
            return Intrinsics.f(this.f101732a, combinedAuthentication.f101732a) && Intrinsics.f(this.f101733b, combinedAuthentication.f101733b) && this.f101734c == combinedAuthentication.f101734c && this.d == combinedAuthentication.d && this.e == combinedAuthentication.e;
        }

        public final int hashCode() {
            int iHashCode = this.f101732a.hashCode() * 31;
            String str = this.f101733b;
            int iC = j6.a.c((this.f101734c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.d);
            n nVar = this.e;
            return iC + (nVar != null ? nVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101732a);
            dest.writeString(this.f101733b);
            dest.writeString(this.f101734c.name());
            dest.writeInt(this.d ? 1 : 0);
            n nVar = this.e;
            if (nVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(nVar.name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/shared/UserAuthUseCase$ForgotPasscode;", "Lcom/revolut/retail/feature/impl/userauth/shared/UserAuthUseCase;", "<init>", "()V", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ForgotPasscode extends UserAuthUseCase {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ForgotPasscode f101735a = new ForgotPasscode();

        @NotNull
        public static final Parcelable.Creator<ForgotPasscode> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ForgotPasscode.f101735a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/shared/UserAuthUseCase$PersonalisedGraduationSignUp;", "Lcom/revolut/retail/feature/impl/userauth/shared/UserAuthUseCase;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PersonalisedGraduationSignUp extends UserAuthUseCase {

        @NotNull
        public static final Parcelable.Creator<PersonalisedGraduationSignUp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PersonalisedGraduationData f101736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CombinedAuthentication f101737b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PersonalisedGraduationSignUp((PersonalisedGraduationData) parcel.readParcelable(PersonalisedGraduationSignUp.class.getClassLoader()), CombinedAuthentication.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PersonalisedGraduationSignUp[i];
            }
        }

        public PersonalisedGraduationSignUp(PersonalisedGraduationData personalisedData, CombinedAuthentication fallback) {
            Intrinsics.checkNotNullParameter(personalisedData, "personalisedData");
            Intrinsics.checkNotNullParameter(fallback, "fallback");
            this.f101736a = personalisedData;
            this.f101737b = fallback;
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
            return Intrinsics.f(this.f101736a, personalisedGraduationSignUp.f101736a) && Intrinsics.f(this.f101737b, personalisedGraduationSignUp.f101737b);
        }

        public final int hashCode() {
            return this.f101737b.hashCode() + (this.f101736a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101736a, i);
            this.f101737b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/shared/UserAuthUseCase$SignIn;", "Lcom/revolut/retail/feature/impl/userauth/shared/UserAuthUseCase;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SignIn extends UserAuthUseCase {

        @NotNull
        public static final Parcelable.Creator<SignIn> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SignInMode f101738a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SignIn((SignInMode) parcel.readParcelable(SignIn.class.getClassLoader()));
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
            return (obj2 instanceof SignIn) && Intrinsics.f(this.f101738a, ((SignIn) obj2).f101738a);
        }

        public final int hashCode() {
            return this.f101738a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101738a, i);
        }

        public SignIn(SignInMode signInMode) {
            Intrinsics.checkNotNullParameter(signInMode, "signInMode");
            this.f101738a = signInMode;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ SignIn(int i) {
            this(new SignInMode.Default(new UserAuthFeatureConfig.SignInParams(null, SignInOrigin.Default.f99273a, new UICustomization(null, 0 == true ? 1 : 0, 31))));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/shared/UserAuthUseCase$SignUp;", "Lcom/revolut/retail/feature/impl/userauth/shared/UserAuthUseCase;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SignUp extends UserAuthUseCase {

        @NotNull
        public static final Parcelable.Creator<SignUp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f101740b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SignUp(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SignUp[i];
            }
        }

        public SignUp() {
            this((String) null, 3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SignUp)) {
                return false;
            }
            SignUp signUp = (SignUp) obj2;
            return Intrinsics.f(this.f101739a, signUp.f101739a) && this.f101740b == signUp.f101740b;
        }

        public final int hashCode() {
            String str = this.f101739a;
            return Boolean.hashCode(this.f101740b) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101739a);
            dest.writeInt(this.f101740b ? 1 : 0);
        }

        public SignUp(String str, boolean z) {
            this.f101739a = str;
            this.f101740b = z;
        }

        public /* synthetic */ SignUp(String str, int i) {
            this((i & 1) != 0 ? null : str, (i & 2) == 0);
        }
    }

    private UserAuthUseCase() {
    }
}

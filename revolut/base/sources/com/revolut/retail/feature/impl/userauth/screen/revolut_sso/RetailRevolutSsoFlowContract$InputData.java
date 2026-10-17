package com.revolut.retail.feature.impl.userauth.screen.revolut_sso;

import android.os.Parcel;
import android.os.Parcelable;
import bjl.n;
import com.revolut.feature.junior_graduation.api.model.PersonalisedGraduationData;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.impl.userauth.screen.revolut_sso.domain.SignInMode;
import com.revolut.sso.api.login.RevolutSsoApi$DefaultIdentifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "SignIn", "SignUp", "ForgotPasscode", "CombinedAuthentication", "PersonalisedGraduationSignUp", "Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$InputData$CombinedAuthentication;", "Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$InputData$ForgotPasscode;", "Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$InputData$PersonalisedGraduationSignUp;", "Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$InputData$SignIn;", "Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$InputData$SignUp;", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RetailRevolutSsoFlowContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$InputData$CombinedAuthentication;", "Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CombinedAuthentication implements RetailRevolutSsoFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<CombinedAuthentication> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f101689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p0j.a f101690c;
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
            this.f101688a = detectedCountryCode;
            this.f101689b = str;
            this.f101690c = mode;
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
            return Intrinsics.f(this.f101688a, combinedAuthentication.f101688a) && Intrinsics.f(this.f101689b, combinedAuthentication.f101689b) && this.f101690c == combinedAuthentication.f101690c && this.d == combinedAuthentication.d && this.e == combinedAuthentication.e;
        }

        public final int hashCode() {
            int iHashCode = this.f101688a.hashCode() * 31;
            String str = this.f101689b;
            int iC = j6.a.c((this.f101690c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.d);
            n nVar = this.e;
            return iC + (nVar != null ? nVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101688a);
            dest.writeString(this.f101689b);
            dest.writeString(this.f101690c.name());
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$InputData$ForgotPasscode;", "Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$InputData;", "<init>", "()V", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ForgotPasscode implements RetailRevolutSsoFlowContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ForgotPasscode f101691a = new ForgotPasscode();

        @NotNull
        public static final Parcelable.Creator<ForgotPasscode> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ForgotPasscode.f101691a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$InputData$PersonalisedGraduationSignUp;", "Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PersonalisedGraduationSignUp implements RetailRevolutSsoFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<PersonalisedGraduationSignUp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PersonalisedGraduationData f101692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CombinedAuthentication f101693b;

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
            this.f101692a = personalisedData;
            this.f101693b = fallback;
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
            return Intrinsics.f(this.f101692a, personalisedGraduationSignUp.f101692a) && Intrinsics.f(this.f101693b, personalisedGraduationSignUp.f101693b);
        }

        public final int hashCode() {
            return this.f101693b.hashCode() + (this.f101692a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101692a, i);
            this.f101693b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$InputData$SignIn;", "Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SignIn implements RetailRevolutSsoFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<SignIn> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SignInMode f101694a;

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

        public SignIn(SignInMode signInMode) {
            Intrinsics.checkNotNullParameter(signInMode, "signInMode");
            this.f101694a = signInMode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SignIn) && Intrinsics.f(this.f101694a, ((SignIn) obj2).f101694a);
        }

        public final int hashCode() {
            return this.f101694a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101694a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$InputData$SignUp;", "Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SignUp implements RetailRevolutSsoFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<SignUp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevolutSsoApi$DefaultIdentifier.Preferred f101695a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SignUp((RevolutSsoApi$DefaultIdentifier.Preferred) parcel.readParcelable(SignUp.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SignUp[i];
            }
        }

        public SignUp(RevolutSsoApi$DefaultIdentifier.Preferred defaultIdentifier) {
            Intrinsics.checkNotNullParameter(defaultIdentifier, "defaultIdentifier");
            this.f101695a = defaultIdentifier;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SignUp) && this.f101695a == ((SignUp) obj2).f101695a;
        }

        public final int hashCode() {
            return this.f101695a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101695a, i);
        }
    }
}

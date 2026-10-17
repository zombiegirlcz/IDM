package com.revolut.retail.feature.impl.userauth.screen.revolut_sso;

import android.os.Parcel;
import android.os.Parcelable;
import bjl.n;
import com.revolut.feature.junior_graduation.api.model.PersonalisedGraduationData;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.api.userauth.navigation.UserAuthFeatureConfig;
import com.revolut.sso.api.login.RevolutSsoApi$DefaultIdentifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "SignIn", "SignUp", "ForgotPasscode", "CombinedAuthentication", "PersonalisedSignUp", "GraduationNotAvailableYet", "Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$Step$CombinedAuthentication;", "Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$Step$ForgotPasscode;", "Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$Step$GraduationNotAvailableYet;", "Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$Step$PersonalisedSignUp;", "Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$Step$SignIn;", "Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$Step$SignUp;", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RetailRevolutSsoFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$Step$CombinedAuthentication;", "Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CombinedAuthentication implements RetailRevolutSsoFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CombinedAuthentication> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f101697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p0j.a f101698c;
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
            this.f101696a = detectedCountryCode;
            this.f101697b = str;
            this.f101698c = mode;
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
            return Intrinsics.f(this.f101696a, combinedAuthentication.f101696a) && Intrinsics.f(this.f101697b, combinedAuthentication.f101697b) && this.f101698c == combinedAuthentication.f101698c && this.d == combinedAuthentication.d && this.e == combinedAuthentication.e;
        }

        public final int hashCode() {
            int iHashCode = this.f101696a.hashCode() * 31;
            String str = this.f101697b;
            int iC = j6.a.c((this.f101698c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.d);
            n nVar = this.e;
            return iC + (nVar != null ? nVar.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101696a);
            dest.writeString(this.f101697b);
            dest.writeString(this.f101698c.name());
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$Step$ForgotPasscode;", "Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$Step;", "<init>", "()V", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ForgotPasscode implements RetailRevolutSsoFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ForgotPasscode f101699a = new ForgotPasscode();

        @NotNull
        public static final Parcelable.Creator<ForgotPasscode> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ForgotPasscode.f101699a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$Step$GraduationNotAvailableYet;", "Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GraduationNotAvailableYet implements RetailRevolutSsoFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<GraduationNotAvailableYet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f101700a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GraduationNotAvailableYet(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GraduationNotAvailableYet[i];
            }
        }

        public GraduationNotAvailableYet(int i) {
            this.f101700a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof GraduationNotAvailableYet) && this.f101700a == ((GraduationNotAvailableYet) obj2).f101700a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f101700a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f101700a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$Step$PersonalisedSignUp;", "Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PersonalisedSignUp implements RetailRevolutSsoFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PersonalisedSignUp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PersonalisedGraduationData f101701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CombinedAuthentication f101702b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PersonalisedSignUp((PersonalisedGraduationData) parcel.readParcelable(PersonalisedSignUp.class.getClassLoader()), CombinedAuthentication.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PersonalisedSignUp[i];
            }
        }

        public PersonalisedSignUp(PersonalisedGraduationData personalisedData, CombinedAuthentication fallback) {
            Intrinsics.checkNotNullParameter(personalisedData, "personalisedData");
            Intrinsics.checkNotNullParameter(fallback, "fallback");
            this.f101701a = personalisedData;
            this.f101702b = fallback;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PersonalisedSignUp)) {
                return false;
            }
            PersonalisedSignUp personalisedSignUp = (PersonalisedSignUp) obj2;
            return Intrinsics.f(this.f101701a, personalisedSignUp.f101701a) && Intrinsics.f(this.f101702b, personalisedSignUp.f101702b);
        }

        public final int hashCode() {
            return this.f101702b.hashCode() + (this.f101701a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101701a, i);
            this.f101702b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$Step$SignIn;", "Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SignIn implements RetailRevolutSsoFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SignIn> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UserAuthFeatureConfig.SignInParams f101703a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SignIn((UserAuthFeatureConfig.SignInParams) parcel.readParcelable(SignIn.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SignIn[i];
            }
        }

        public SignIn(UserAuthFeatureConfig.SignInParams signInParams) {
            Intrinsics.checkNotNullParameter(signInParams, "signInParams");
            this.f101703a = signInParams;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SignIn) && Intrinsics.f(this.f101703a, ((SignIn) obj2).f101703a);
        }

        public final int hashCode() {
            return this.f101703a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101703a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$Step$SignUp;", "Lcom/revolut/retail/feature/impl/userauth/screen/revolut_sso/RetailRevolutSsoFlowContract$Step;", "defaultIdentifier", "Lcom/revolut/sso/api/login/RevolutSsoApi$DefaultIdentifier;", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SignUp implements RetailRevolutSsoFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SignUp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevolutSsoApi$DefaultIdentifier f101704a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                RevolutSsoApi$DefaultIdentifier defaultIdentifier = (RevolutSsoApi$DefaultIdentifier) j6.a.f(parcel, "parcel", SignUp.class);
                Intrinsics.checkNotNullParameter(defaultIdentifier, "defaultIdentifier");
                return new SignUp(defaultIdentifier);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SignUp[i];
            }
        }

        public /* synthetic */ SignUp(RevolutSsoApi$DefaultIdentifier revolutSsoApi$DefaultIdentifier) {
            this.f101704a = revolutSsoApi$DefaultIdentifier;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (obj2 instanceof SignUp) {
                return Intrinsics.f(this.f101704a, ((SignUp) obj2).f101704a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f101704a.hashCode();
        }

        public final String toString() {
            return "SignUp(defaultIdentifier=" + this.f101704a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101704a, i);
        }
    }
}

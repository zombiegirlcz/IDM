package com.revolut.retail.feature.impl.userauth.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.feature.impl.userauth.screen.revolut_sso.SsoDeeplinkDataConfiguration$DeeplinkData;
import com.revolut.retail.feature.impl.userauth.shared.UserAuthUseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/flow/UserOnboardingFlowDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "UserOnboarding", "SsoEmailOtpAuthentication", "SsoDeeplinkAuthentication", "cwj/f", "Lcom/revolut/retail/feature/impl/userauth/flow/UserOnboardingFlowDestination$SsoDeeplinkAuthentication;", "Lcom/revolut/retail/feature/impl/userauth/flow/UserOnboardingFlowDestination$SsoEmailOtpAuthentication;", "Lcom/revolut/retail/feature/impl/userauth/flow/UserOnboardingFlowDestination$UserOnboarding;", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface UserOnboardingFlowDestination extends KompotDestination {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/flow/UserOnboardingFlowDestination$SsoDeeplinkAuthentication;", "Lcom/revolut/retail/feature/impl/userauth/flow/UserOnboardingFlowDestination;", "Lcwj/f;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SsoDeeplinkAuthentication implements UserOnboardingFlowDestination, cwj.f {

        @NotNull
        public static final Parcelable.Creator<SsoDeeplinkAuthentication> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UserAuthUseCase f101665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SsoDeeplinkDataConfiguration$DeeplinkData f101666b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SsoDeeplinkAuthentication((UserAuthUseCase) parcel.readParcelable(SsoDeeplinkAuthentication.class.getClassLoader()), (SsoDeeplinkDataConfiguration$DeeplinkData) parcel.readParcelable(SsoDeeplinkAuthentication.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SsoDeeplinkAuthentication[i];
            }
        }

        public SsoDeeplinkAuthentication(UserAuthUseCase userAuthUseCase, SsoDeeplinkDataConfiguration$DeeplinkData deeplinkData) {
            Intrinsics.checkNotNullParameter(userAuthUseCase, "userAuthUseCase");
            Intrinsics.checkNotNullParameter(deeplinkData, "deeplinkData");
            this.f101665a = userAuthUseCase;
            this.f101666b = deeplinkData;
        }

        @Override // com.revolut.retail.feature.impl.userauth.flow.UserOnboardingFlowDestination
        /* JADX INFO: renamed from: B6, reason: from getter */
        public final UserAuthUseCase getF101669a() {
            return this.f101665a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SsoDeeplinkAuthentication)) {
                return false;
            }
            SsoDeeplinkAuthentication ssoDeeplinkAuthentication = (SsoDeeplinkAuthentication) obj2;
            return Intrinsics.f(this.f101665a, ssoDeeplinkAuthentication.f101665a) && Intrinsics.f(this.f101666b, ssoDeeplinkAuthentication.f101666b);
        }

        public final int hashCode() {
            return this.f101666b.hashCode() + (this.f101665a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101665a, i);
            dest.writeParcelable(this.f101666b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/flow/UserOnboardingFlowDestination$SsoEmailOtpAuthentication;", "Lcom/revolut/retail/feature/impl/userauth/flow/UserOnboardingFlowDestination;", "Lcwj/f;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SsoEmailOtpAuthentication implements UserOnboardingFlowDestination, cwj.f {

        @NotNull
        public static final Parcelable.Creator<SsoEmailOtpAuthentication> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UserAuthUseCase f101667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f101668b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SsoEmailOtpAuthentication((UserAuthUseCase) parcel.readParcelable(SsoEmailOtpAuthentication.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SsoEmailOtpAuthentication[i];
            }
        }

        public SsoEmailOtpAuthentication(UserAuthUseCase userAuthUseCase, String otpCode) {
            Intrinsics.checkNotNullParameter(userAuthUseCase, "userAuthUseCase");
            Intrinsics.checkNotNullParameter(otpCode, "otpCode");
            this.f101667a = userAuthUseCase;
            this.f101668b = otpCode;
        }

        @Override // com.revolut.retail.feature.impl.userauth.flow.UserOnboardingFlowDestination
        /* JADX INFO: renamed from: B6, reason: from getter */
        public final UserAuthUseCase getF101669a() {
            return this.f101667a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SsoEmailOtpAuthentication)) {
                return false;
            }
            SsoEmailOtpAuthentication ssoEmailOtpAuthentication = (SsoEmailOtpAuthentication) obj2;
            return Intrinsics.f(this.f101667a, ssoEmailOtpAuthentication.f101667a) && Intrinsics.f(this.f101668b, ssoEmailOtpAuthentication.f101668b);
        }

        public final int hashCode() {
            return this.f101668b.hashCode() + (this.f101667a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101667a, i);
            dest.writeString(this.f101668b);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/flow/UserOnboardingFlowDestination$UserOnboarding;", "Lcom/revolut/retail/feature/impl/userauth/flow/UserOnboardingFlowDestination;", "Lcwj/f;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UserOnboarding implements UserOnboardingFlowDestination, cwj.f {

        @NotNull
        public static final Parcelable.Creator<UserOnboarding> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UserAuthUseCase f101669a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UserOnboarding((UserAuthUseCase) parcel.readParcelable(UserOnboarding.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UserOnboarding[i];
            }
        }

        public UserOnboarding(UserAuthUseCase userAuthUseCase) {
            Intrinsics.checkNotNullParameter(userAuthUseCase, "userAuthUseCase");
            this.f101669a = userAuthUseCase;
        }

        @Override // com.revolut.retail.feature.impl.userauth.flow.UserOnboardingFlowDestination
        /* JADX INFO: renamed from: B6, reason: from getter */
        public final UserAuthUseCase getF101669a() {
            return this.f101669a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UserOnboarding) && Intrinsics.f(this.f101669a, ((UserOnboarding) obj2).f101669a);
        }

        public final int hashCode() {
            return this.f101669a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101669a, i);
        }
    }

    /* JADX INFO: renamed from: B6 */
    UserAuthUseCase getF101669a();
}

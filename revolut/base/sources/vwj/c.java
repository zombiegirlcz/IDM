package vwj;

import a0.d;
import android.content.Context;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.feature.junior_graduation.api.model.PersonalisedGraduationData;
import com.revolut.feature.onboarding.core.launcher.OnboardingLauncherActivity;
import com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.feature.api.userauth.navigation.UserAuthFeatureConfig;
import com.revolut.retail.feature.impl.userauth.flow.UserOnboardingFlowDestination;
import com.revolut.retail.feature.impl.userauth.screen.revolut_sso.SsoDeeplinkDataConfiguration$DeeplinkData;
import com.revolut.retail.feature.impl.userauth.screen.revolut_sso.domain.SignInMode;
import com.revolut.retail.feature.impl.userauth.shared.UserAuthUseCase;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements uri.a {
    public static ActivityNavigateCommand d(KompotDestination kompotDestination, a aVar) {
        int i = b.f292761a[aVar.ordinal()];
        if (i == 1) {
            return new ActivityNavigateCommand(new ExplicitActivityDestination(OnboardingLauncherActivity.class), new KompotFlowContract$Configuration.Standalone(kompotDestination, false, false), null, null, 335577088, null, null, null, null, false, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        }
        if (i == 2) {
            return new ActivityNavigateCommand(new ExplicitActivityDestination(OnboardingLauncherActivity.class), new KompotFlowContract$Configuration.Standalone(kompotDestination, false, false), d.x("ONBOARDING_EXTRA_BACKGROUND_MODE", "ONBOARDING_EXTRA_BACKGROUND_MODE_STARTUP"), null, 65536, null, null, null, new ActivityAnimation.ContentTransition(true), false, 744);
        }
        if (i == 3) {
            return new ActivityNavigateCommand(new ExplicitActivityDestination(OnboardingLauncherActivity.class), new KompotFlowContract$Configuration.Standalone(kompotDestination, false, false), null, null, 603979776, null, null, null, null, false, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof UserAuthFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        ActivityNavigateCommand activityNavigateCommandD;
        UserAuthUseCase combinedAuthentication;
        KompotDestination userOnboarding;
        SsoDeeplinkDataConfiguration$DeeplinkData dap;
        UserAuthFeatureConfig config = (UserAuthFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof UserAuthFeatureConfig.Main) {
            UserAuthFeatureConfig.Main main = (UserAuthFeatureConfig.Main) config;
            UserAuthFeatureConfig.UseCase useCase = main.e;
            if (useCase instanceof UserAuthFeatureConfig.UseCase.ForgotPasscode) {
                combinedAuthentication = UserAuthUseCase.ForgotPasscode.f101735a;
            } else if (useCase instanceof UserAuthFeatureConfig.UseCase.SignIn) {
                combinedAuthentication = new UserAuthUseCase.SignIn(new SignInMode.Default(((UserAuthFeatureConfig.UseCase.SignIn) useCase).f99359a));
            } else if (useCase instanceof UserAuthFeatureConfig.UseCase.SignUp) {
                combinedAuthentication = new UserAuthUseCase.SignUp((String) null, 3);
            } else if (useCase instanceof UserAuthFeatureConfig.UseCase.SignUpWithJuniorGraduationConfirmation) {
                combinedAuthentication = new UserAuthUseCase.SignUp((String) null, 1);
            } else if (useCase instanceof UserAuthFeatureConfig.UseCase.SignUpWithDeepLink) {
                combinedAuthentication = new UserAuthUseCase.SignUp(((UserAuthFeatureConfig.UseCase.SignUpWithDeepLink) useCase).f99361a, 2);
            } else {
                if (!(useCase instanceof UserAuthFeatureConfig.UseCase.CombinedAuthentication)) {
                    throw new NoWhenBranchMatchedException();
                }
                UserAuthFeatureConfig.UseCase.CombinedAuthentication combinedAuthentication2 = (UserAuthFeatureConfig.UseCase.CombinedAuthentication) useCase;
                combinedAuthentication = new UserAuthUseCase.CombinedAuthentication(combinedAuthentication2.f99355a, combinedAuthentication2.f99356b, combinedAuthentication2.f99357c, combinedAuthentication2.e, combinedAuthentication2.f);
            }
            String str = main.f99341a;
            UserAuthFeatureConfig.Main.SSODeeplinkData sSODeeplinkData = main.f99343c;
            if (str != null) {
                userOnboarding = new UserOnboardingFlowDestination.SsoEmailOtpAuthentication(combinedAuthentication, str);
            } else if (sSODeeplinkData != null) {
                if (sSODeeplinkData instanceof UserAuthFeatureConfig.Main.SSODeeplinkData.BankId) {
                    dap = new SsoDeeplinkDataConfiguration$DeeplinkData.BankId(((UserAuthFeatureConfig.Main.SSODeeplinkData.BankId) sSODeeplinkData).f99344a);
                } else {
                    if (!(sSODeeplinkData instanceof UserAuthFeatureConfig.Main.SSODeeplinkData.DAP)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dap = new SsoDeeplinkDataConfiguration$DeeplinkData.DAP(((UserAuthFeatureConfig.Main.SSODeeplinkData.DAP) sSODeeplinkData).f99345a);
                }
                userOnboarding = new UserOnboardingFlowDestination.SsoDeeplinkAuthentication(combinedAuthentication, dap);
            } else {
                userOnboarding = new UserOnboardingFlowDestination.UserOnboarding(combinedAuthentication);
            }
            UserAuthFeatureConfig.UseCase.CombinedAuthentication combinedAuthentication3 = useCase instanceof UserAuthFeatureConfig.UseCase.CombinedAuthentication ? (UserAuthFeatureConfig.UseCase.CombinedAuthentication) useCase : null;
            activityNavigateCommandD = d(userOnboarding, main.d ? a.AS_TOP : combinedAuthentication3 != null && combinedAuthentication3.d ? a.STARTUP : a.SINGLE_TOP);
        } else if (config instanceof UserAuthFeatureConfig.AutoSignInAfterSsoForgotPasscode) {
            UserAuthFeatureConfig.AutoSignInAfterSsoForgotPasscode autoSignInAfterSsoForgotPasscode = (UserAuthFeatureConfig.AutoSignInAfterSsoForgotPasscode) config;
            UserAuthFeatureConfig.UseCase useCase2 = autoSignInAfterSsoForgotPasscode.e;
            if (!(useCase2 instanceof UserAuthFeatureConfig.UseCase.SignIn) && !(useCase2 instanceof UserAuthFeatureConfig.UseCase.CombinedAuthentication)) {
                if (!(useCase2 instanceof UserAuthFeatureConfig.UseCase.ForgotPasscode) && !(useCase2 instanceof UserAuthFeatureConfig.UseCase.SignUp) && !(useCase2 instanceof UserAuthFeatureConfig.UseCase.SignUpWithJuniorGraduationConfirmation) && !(useCase2 instanceof UserAuthFeatureConfig.UseCase.SignUpWithDeepLink)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException(useCase2.getClass().getSimpleName().concat(" use case is not supported"));
            }
            activityNavigateCommandD = d(new UserOnboardingFlowDestination.UserOnboarding(new UserAuthUseCase.SignIn(new SignInMode.AutoWithPasscode(autoSignInAfterSsoForgotPasscode.f99335a, autoSignInAfterSsoForgotPasscode.f99336b, autoSignInAfterSsoForgotPasscode.f99337c))), autoSignInAfterSsoForgotPasscode.d ? a.AS_TOP : a.SINGLE_TOP);
        } else if (config instanceof UserAuthFeatureConfig.AutoSignInAfterSsoUnlockAppWithBiometrics) {
            UserAuthFeatureConfig.AutoSignInAfterSsoUnlockAppWithBiometrics autoSignInAfterSsoUnlockAppWithBiometrics = (UserAuthFeatureConfig.AutoSignInAfterSsoUnlockAppWithBiometrics) config;
            UserAuthFeatureConfig.UseCase useCase3 = autoSignInAfterSsoUnlockAppWithBiometrics.d;
            if (!(useCase3 instanceof UserAuthFeatureConfig.UseCase.SignIn) && !(useCase3 instanceof UserAuthFeatureConfig.UseCase.CombinedAuthentication)) {
                if (!(useCase3 instanceof UserAuthFeatureConfig.UseCase.ForgotPasscode) && !(useCase3 instanceof UserAuthFeatureConfig.UseCase.SignUp) && !(useCase3 instanceof UserAuthFeatureConfig.UseCase.SignUpWithJuniorGraduationConfirmation) && !(useCase3 instanceof UserAuthFeatureConfig.UseCase.SignUpWithDeepLink)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException(useCase3.getClass().getSimpleName().concat(" use case is not supported"));
            }
            activityNavigateCommandD = d(new UserOnboardingFlowDestination.UserOnboarding(new UserAuthUseCase.SignIn(new SignInMode.AutoWithPasskey(autoSignInAfterSsoUnlockAppWithBiometrics.f99338a, autoSignInAfterSsoUnlockAppWithBiometrics.f99339b))), autoSignInAfterSsoUnlockAppWithBiometrics.f99340c ? a.AS_TOP : a.SINGLE_TOP);
        } else {
            if (!(config instanceof UserAuthFeatureConfig.PersonalisedGraduationSignUp)) {
                throw new NoWhenBranchMatchedException();
            }
            UserAuthFeatureConfig.PersonalisedGraduationSignUp personalisedGraduationSignUp = (UserAuthFeatureConfig.PersonalisedGraduationSignUp) config;
            UserAuthFeatureConfig.PersonalisedGraduationSignUp.Params params = personalisedGraduationSignUp.f99347b;
            PersonalisedGraduationData personalisedGraduationData = new PersonalisedGraduationData(params.f99349a, params.d, params.f99350b, params.f99351c);
            UserAuthFeatureConfig.UseCase.CombinedAuthentication combinedAuthentication4 = personalisedGraduationSignUp.f99348c;
            activityNavigateCommandD = d(new UserOnboardingFlowDestination.UserOnboarding(new UserAuthUseCase.PersonalisedGraduationSignUp(personalisedGraduationData, new UserAuthUseCase.CombinedAuthentication(combinedAuthentication4.f99355a, combinedAuthentication4.f99356b, combinedAuthentication4.f99357c, combinedAuthentication4.e, combinedAuthentication4.f))), personalisedGraduationSignUp.f99346a ? a.AS_TOP : a.STARTUP);
        }
        navigator.c(activityNavigateCommandD);
    }
}

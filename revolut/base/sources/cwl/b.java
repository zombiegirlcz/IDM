package cwl;

import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.api.userauth.navigation.UserAuthFeatureConfig;
import com.revolut.retail.feature.api.userauth.navigation.UserOnboardingNavigationProvider$UseCase;
import cu8.u0;
import efm.d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ufm.i;
import v3e.s;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f109852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f109853c;

    public /* synthetic */ b(g gVar, boolean z, int i) {
        this.f109851a = i;
        this.f109852b = gVar;
        this.f109853c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f109851a) {
            case 0:
                Boolean shouldShowPcwOnboarding = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(shouldShowPcwOnboarding, "shouldShowPcwOnboarding");
                boolean zBooleanValue = shouldShowPcwOnboarding.booleanValue();
                g gVar = this.f109852b;
                return zBooleanValue ? ((y9k.b) gVar.f109867c).a() : com.revolut.retail.feature.api.userauth.navigation.a.a(gVar.f109865a, this.f109853c, null, 5);
            default:
                m0j.a userOnboardingState = (m0j.a) obj2;
                Intrinsics.checkNotNullParameter(userOnboardingState, "userOnboardingState");
                int i = d.f109859b[userOnboardingState.ordinal()];
                g gVar2 = this.f109852b;
                boolean z = this.f109853c;
                if (i == 1) {
                    aoi.g.a().d("APP_TO_LOGIN_STARTUP_TIME_COLD_START");
                    aoi.g.a().d("APP_TO_LOGIN_STARTUP_TIME_COLD_START_NO_PARALLEL");
                    aoi.g.a().d("APP_TO_LOGIN_STARTUP_TIME_COLD_START_PARALLEL");
                    d0 d0VarFirstOrError = ((dak.b) gVar2.f109866b.f303746a).a().firstOrError();
                    s sVar = new s(new whi.b(2), 18);
                    d0VarFirstOrError.getClass();
                    i iVar = new i(d0VarFirstOrError, sVar, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                    return new i(ue0.e.I(iVar, h0.f322473a, new whi.b(3)), new u0(11, new b(gVar2, z, 0)), 0);
                }
                if (i == 2) {
                    aoi.g.a().d("APP_TO_LOGIN_STARTUP_TIME_COLD_START");
                    aoi.g.a().d("APP_TO_LOGIN_STARTUP_TIME_COLD_START_NO_PARALLEL");
                    aoi.g.a().d("APP_TO_LOGIN_STARTUP_TIME_COLD_START_PARALLEL");
                    return com.revolut.retail.feature.api.userauth.navigation.a.a(gVar2.f109865a, z, UserOnboardingNavigationProvider$UseCase.SignUp.f99365a, 1);
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                ufm.b bVarM = d0.m(new FeatureCommand(new UserAuthFeatureConfig.Main((String) null, (UserAuthFeatureConfig.Main.SSODeeplinkData) null, true, (UserAuthFeatureConfig.UseCase) new UserAuthFeatureConfig.UseCase.SignIn(0), 7)));
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM;
        }
    }
}

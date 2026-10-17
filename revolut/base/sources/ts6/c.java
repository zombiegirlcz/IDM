package ts6;

import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState;
import com.revolut.feature.freelancer.common.models.partner.PartnerConfirmParams;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.DummyCommand;
import java.util.HashMap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f273994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s0 f273995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jf0.c f273996c;

    public /* synthetic */ c(s0 s0Var, jf0.c cVar, int i) {
        this.f273994a = i;
        this.f273995b = s0Var;
        this.f273996c = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f273994a) {
            case 0:
                Boolean isNetNewUserJoined = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isNetNewUserJoined, "isNetNewUserJoined");
                if (isNetNewUserJoined.booleanValue()) {
                    return efm.k.g(new BridgeDestination(DummyCommand.f98635a));
                }
                tr6.a aVarC = t0.c(this.f273996c);
                kotlinx.coroutines.d dVar = skm.p0.f264003c;
                s0 s0Var = this.f273995b;
                Continuation continuation = null;
                pfm.a aVarE = pd.b.n(dVar, new tqh.j(s0Var, aVarC, continuation, 2)).e(pd.b.n(dVar, new i(s0Var, continuation, 1)));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                rfm.e eVar = new rfm.e(s0Var.k(u0.SHOW_INTRO), ue0.e.v(aVarE), 0);
                Intrinsics.checkNotNullExpressionValue(eVar, "andThen(...)");
                return eVar;
            default:
                FreelancerAccountOnboardingState accountDetails = (FreelancerAccountOnboardingState) obj2;
                Intrinsics.checkNotNullParameter(accountDetails, "accountDetails");
                Intrinsics.checkNotNullParameter(accountDetails, "<this>");
                if (!(accountDetails instanceof FreelancerAccountOnboardingState.Onboarded) || !((FreelancerAccountOnboardingState.Onboarded) accountDetails).f73273a.d.contains(lr6.b0.ECOMMERCE)) {
                    return s0.l(this.f273995b, null, 3);
                }
                jf0.c deeplink = this.f273996c;
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                HashMap map = deeplink.d;
                kotlin.jvm.internal.t0 t0Var = kotlin.jvm.internal.t0.f186434a;
                m70.a.c(t0Var);
                String str = (String) map.getOrDefault("scope", "");
                HashMap map2 = deeplink.d;
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                String str2 = (String) map2.getOrDefault("state_token", "");
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                String str3 = (String) map2.getOrDefault("code_challenge_method", "");
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                String str4 = (String) map2.getOrDefault("redirect_uri", "");
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                String str5 = (String) map2.getOrDefault("client_id", "");
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                String str6 = (String) map2.getOrDefault("code_challenge", "");
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                return efm.k.g(new FreelancerBizFeatureConfig.ConfirmEcommerceIntegration(new PartnerConfirmParams(str, str2, str3, str4, str5, str6, (String) map2.getOrDefault("integration_type", ""))));
        }
    }
}

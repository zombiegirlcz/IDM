package fzj;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.pricingplans.api.PricingPlansApi$Toggles;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.limits.impl.ui.limits.flow.SettingsLimitsDestination;
import com.revolut.retail.feature.limits.impl.ui.limits.flow.SettingsLimitsFlowContract$InputData;
import com.revolut.retail.feature.limits.impl.ui.limits_prompt.flow.LimitsPromptFlowContract$Configuration;
import com.revolut.retail.feature.limits.impl.ui.limits_prompt.flow.LimitsPromptFlowContract$Limit;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.KompotPricingPlanFeatureConfig;
import efm.d0;
import fag.g;
import java.util.HashMap;
import java.util.Set;
import jf0.c;
import jte.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nzj.f;
import org.jetbrains.annotations.NotNull;
import q06.h;
import sri.m;
import wp5.y;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements azj.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f139204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f139205b;

    public b(gte.a featureToggleInteractor, m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f139204a = navigator;
        this.f139205b = featureToggleInteractor;
    }

    @Override // jf0.d, q06.k
    public final boolean a(c cVar) {
        return y.D(cVar, "deeplink", 1, "account-limits");
    }

    public final ParcelableDestination b(c cVar) {
        String strE = cVar.e(2);
        HashMap map = cVar.d;
        boolean zF = Intrinsics.f(strE, "ATM");
        AccountId joint = AccountId.Personal.f51414a;
        if (zF) {
            f.Companion.getClass();
            return new BridgeDestination(new ActivityNavigateCommand(nzj.a.f221074b, new LimitsPromptFlowContract$Configuration(LimitsPromptFlowContract$Limit.Atm.f101789a, joint), null, null, 0, null, null, null, null, false, 1020));
        }
        if (((d) this.f139205b).c(PricingPlansApi$Toggles.HideLegacyPlanLimits.f81001c)) {
            return KompotPricingPlanFeatureConfig.PlanHubV2Destination.f102881a;
        }
        Set setY0 = kotlin.collections.d.y0(com.revolut.retail.feature.limits.api.navigation.b.values());
        String str = (String) map.get("id");
        if (str != null) {
            if (!Intrinsics.f(map.get("accountType"), "JOINT")) {
                str = null;
            }
            if (str != null) {
                joint = new AccountId.Joint(str, "");
            }
        }
        return new SettingsLimitsDestination(new SettingsLimitsFlowContract$InputData(joint, setY0));
    }

    @Override // q06.k
    public final Object e(c cVar, Continuation continuation) {
        return new h(b(cVar), null);
    }

    @Override // jf0.d
    public final d0 f(c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        NaviCommand naviCommandE = u0.e(b(deeplink));
        if (Intrinsics.f(deeplink.e(2), "ATM") && z) {
            naviCommandE = com.revolut.retail.core.navigation.a.c(gc0.c.f(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP)), naviCommandE);
        }
        ufm.c cVar = new ufm.c(new g(this, naviCommandE, 2), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return cVar;
    }
}

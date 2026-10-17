package ak3;

import com.revolut.feature.commodities.onboarding.api.CommoditiesOnboardingApi$Toggles$InvestCommoditiesToEtc;
import com.revolut.feature.commodities.onboarding.api.navigation.CommoditiesOnboardingDestination$Risks;
import com.revolut.feature.commodities.onboarding.impl.ui_kompot.risks.CommoditiesOnboardingRisksController;
import dki.g;
import gc0.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5662a = 0;

    @Override // nte.a
    public final List e() {
        return u.c(CommoditiesOnboardingApi$Toggles$InvestCommoditiesToEtc.f65947c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CommoditiesOnboardingDestination$Risks) {
            return c.b(new CommoditiesOnboardingRisksController(), new a(destination, 0));
        }
        return null;
    }
}

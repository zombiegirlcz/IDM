package ymk;

import com.revolut.retail.feature.pricing_plans.ui.impl.model.PlanLayoutType;
import dfj.m0;
import ggk.g0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final egk.e f315023a;

    public a(egk.e pricingPlansUiInteractor) {
        Intrinsics.checkNotNullParameter(pricingPlansUiInteractor, "pricingPlansUiInteractor");
        this.f315023a = pricingPlansUiInteractor;
    }

    public static Flow a(a aVar, String planId, PlanLayoutType layoutType, g0 entryPoint) {
        egk.e eVar = aVar.f315023a;
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(layoutType, "layoutType");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        if ((layoutType instanceof PlanLayoutType.Default) || (layoutType instanceof PlanLayoutType.SwitchToFamily)) {
            return ((wik.t) eVar).f(planId, entryPoint, loadingStrategy);
        }
        if (!(layoutType instanceof PlanLayoutType.Gifting)) {
            throw new NoWhenBranchMatchedException();
        }
        String receiverUserName = ((PlanLayoutType.Gifting) layoutType).f103312a;
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(receiverUserName, "receiverUserName");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return new m0(nim.a.v(((wik.t) eVar).e(receiverUserName, loadingStrategy), new wb3.k(planId, 10)), planId, 3);
    }
}

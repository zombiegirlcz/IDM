package av7;

import au6.e2;
import com.revolut.data.model.Data;
import com.revolut.feature.insurance_common.data.model.Banner;
import com.revolut.feature.insurance_embedded.impl.ui.screen.coverage_list.CoverageListScreenContract$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import gu7.j1;
import gu7.j4;
import gu7.m4;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nr7.d;
import wli.x;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends jki.g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f9939p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hu7.b f9940q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final or7.a f9941r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f9942s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p stateMapper, CoverageListScreenContract$InputData inputData, x deeplinkHandler, hu7.b coverageRepository, or7.a insuranceCommonRepository) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(coverageRepository, "coverageRepository");
        Intrinsics.checkNotNullParameter(insuranceCommonRepository, "insuranceCommonRepository");
        this.f9939p = deeplinkHandler;
        this.f9940q = coverageRepository;
        this.f9941r = insuranceCommonRepository;
        this.f9942s = new e(inputData.f76087a, new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, nim.a.v(hu7.b.a(this.f9940q, ((e) t2()).f9928a), new auj.o(this, 1)), null, null, new ap7.k(this, null, 24), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        n2(new k(this, null, 1), new whi.b(6));
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f9942s;
    }

    public final void y2(Object obj2, String listId) {
        j1 j1Var;
        Banner banner;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Continuation continuation = null;
        int i = 1;
        if (!(obj2 instanceof j4)) {
            if (obj2 instanceof nr7.c) {
                l2(new l(this, (nr7.c) obj2, continuation, 0), new yi5.b(26));
                return;
            }
            if (!(obj2 instanceof d.a) || !Intrinsics.f(listId, "BANNER_ITEM") || (j1Var = (j1) ((e) t2()).f9929b.getContent()) == null || (banner = j1Var.f146770c) == null) {
                return;
            }
            x2(new e2(8));
            l2(new l(this, banner, continuation, i), new yi5.b(26));
            return;
        }
        j4 j4Var = (j4) obj2;
        gu7.a aVar = j4Var.d;
        String str = j4Var.f146771a;
        int i2 = j.f9935a[aVar.f146707a.ordinal()];
        if (i2 == 1) {
            C1(new BridgeDestination(new FeatureCommand(new PricingPlanFeatureConfig.UpgradeToAnyPlan(xfa.b.INSURANCE_HOME, null, 14))));
            return;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = jli.h.f175850a;
        } else {
            m4 m4Var = aVar.f146708b;
            if (m4Var != null) {
                if (str == null) {
                    str = "";
                }
                v2(new f(m4Var.f146796b, m4Var.f146795a, str));
            }
        }
    }
}

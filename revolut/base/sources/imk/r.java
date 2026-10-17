package imk;

import com.revolut.feature.pricingplans.models.PlanScreenElementView;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubScreenConfig;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubScreenHeader;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.PlanHubV2Screen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import mx0.k2;
import mx0.r1;
import mx0.u1;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PlanHubV2Screen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(PlanHubV2Screen planHubV2Screen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = planHubV2Screen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.v, continuation, 0);
            case 1:
                return new r(this.v, continuation, 1);
            case 2:
                return new r(this.v, continuation, 2);
            case 3:
                return new r(this.v, continuation, 3);
            case 4:
                return new r(this.v, continuation, 4);
            case 5:
                return new r(this.v, continuation, 5);
            case 6:
                return new r(this.v, continuation, 6);
            default:
                return new r(this.v, continuation, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((r) create((k2) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((r) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((r) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((r) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((r) create((tx0.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((r) create((tx0.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((r) create((r1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((r) create((u1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PlanHubScreenHeader.Standard.Description description;
        PlanScreenElementView.Action action;
        int i = this.u;
        PlanHubV2Screen planHubV2Screen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g) planHubV2Screen.d()).h0();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                planHubV2Screen.m2().onBackPressed();
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g) planHubV2Screen.d()).O2();
                break;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                planHubV2Screen.m2().onBackPressed();
                break;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g) planHubV2Screen.d()).O2();
                break;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g gVar = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g) planHubV2Screen.d();
                PlanHubScreenConfig planHubScreenConfig = (PlanHubScreenConfig) ((u) ((j2) gVar.C.f22677a).getValue()).f162546b.getContent();
                PlanHubScreenHeader planHubScreenHeader = planHubScreenConfig != null ? planHubScreenConfig.f102661a : null;
                PlanHubScreenHeader.Standard standard = planHubScreenHeader instanceof PlanHubScreenHeader.Standard ? (PlanHubScreenHeader.Standard) planHubScreenHeader : null;
                if (standard != null && (description = standard.e) != null && (action = description.f102684g) != null) {
                    gVar.J2(action.f81005a);
                }
                break;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g gVar2 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g) planHubV2Screen.d();
                gVar2.H2(gVar2.C, new im3.e(5));
                gVar2.f103577y.f103567h = null;
                gVar2.f103575w.d3();
                break;
            default:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g gVar3 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g) planHubV2Screen.d();
                if (((u) ((j2) gVar3.C.f22677a).getValue()).f162547c instanceof a0) {
                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.a aVar9 = gVar3.f103577y;
                    int i2 = gVar3.B;
                    f fVar = f.INTRO;
                    aVar9.f103566g = Integer.valueOf(i2);
                    aVar9.f103567h = fVar;
                }
                break;
        }
        return Unit.f186387a;
    }
}

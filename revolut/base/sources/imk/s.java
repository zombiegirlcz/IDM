package imk;

import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.PlanHubV2Screen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PlanHubV2Screen f162544w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(PlanHubV2Screen planHubV2Screen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f162544w = planHubV2Screen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                s sVar = new s(this.f162544w, continuation, 0);
                sVar.v = obj2;
                return sVar;
            default:
                s sVar2 = new s(this.f162544w, continuation, 1);
                sVar2.v = obj2;
                return sVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((s) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PlanHubV2Screen planHubV2Screen = this.f162544w;
        switch (i) {
            case 0:
                String deeplink = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i0 i0VarF3 = planHubV2Screen.f3();
                Intrinsics.h(deeplink);
                com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g gVar = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g) i0VarF3;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                gVar.J2(deeplink);
                break;
            default:
                String deeplink2 = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i0 i0VarF32 = planHubV2Screen.f3();
                Intrinsics.h(deeplink2);
                com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g gVar2 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g) i0VarF32;
                gVar2.getClass();
                Intrinsics.checkNotNullParameter(deeplink2, "deeplink");
                gVar2.J2(deeplink2);
                break;
        }
        return Unit.f186387a;
    }
}

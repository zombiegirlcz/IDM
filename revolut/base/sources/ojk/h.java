package ojk;

import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.BasePricingPlanBEDrivenViewController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BasePricingPlanBEDrivenViewController f225820w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(BasePricingPlanBEDrivenViewController basePricingPlanBEDrivenViewController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f225820w = basePricingPlanBEDrivenViewController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f225820w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            case 1:
                h hVar2 = new h(this.f225820w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
            case 2:
                h hVar3 = new h(this.f225820w, continuation, 2);
                hVar3.v = obj2;
                return hVar3;
            case 3:
                h hVar4 = new h(this.f225820w, continuation, 3);
                hVar4.v = obj2;
                return hVar4;
            default:
                h hVar5 = new h(this.f225820w, continuation, 4);
                hVar5.v = obj2;
                return hVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((h) create((z) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((h) create((z) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((h) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BasePricingPlanBEDrivenViewController basePricingPlanBEDrivenViewController = this.f225820w;
        switch (i) {
            case 0:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c0 c0VarD3 = basePricingPlanBEDrivenViewController.d3();
                Intrinsics.h(clickData);
                q qVar = (q) c0VarD3;
                qVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj3 = clickData.d;
                if (obj3 instanceof u) {
                    qVar.J2(((u) obj3).f225843a);
                }
                break;
            case 1:
                z zVar = (z) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((q) basePricingPlanBEDrivenViewController.d3()).K2(zVar.f225848a);
                break;
            case 2:
                z zVar2 = (z) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((q) basePricingPlanBEDrivenViewController.d3()).K2(zVar2.f225849b);
                break;
            case 3:
                g6 g6Var = (g6) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c0 c0VarD32 = basePricingPlanBEDrivenViewController.d3();
                String id10 = g6Var.f54199a;
                q qVar2 = (q) c0VarD32;
                qVar2.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                qVar2.H2(qVar2.L2(), new ofg.a(id10, qVar2));
                break;
            default:
                Object obj4 = this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVar3 = (q) basePricingPlanBEDrivenViewController.d3();
                qVar3.getClass();
                if (obj4 instanceof u) {
                    qVar3.J2(((u) obj4).f225843a);
                }
                break;
        }
        return Unit.f186387a;
    }
}

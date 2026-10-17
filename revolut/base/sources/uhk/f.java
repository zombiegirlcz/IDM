package uhk;

import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.PlanDowngradeFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.PlanDowngradeFlowContract$Step;
import efm.d0;
import ffk.t;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ud3.f0;
import wik.n;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a f280265w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f280265w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f280265w, continuation, 0);
            case 1:
                return new f(this.f280265w, continuation, 1);
            case 2:
                return new f(this.f280265w, continuation, 2);
            case 3:
                return new f(this.f280265w, continuation, 3);
            case 4:
                return new f(this.f280265w, continuation, 4);
            case 5:
                return new f(this.f280265w, continuation, 5);
            case 6:
                return new f(this.f280265w, continuation, 6);
            default:
                return new f(this.f280265w, continuation, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((f) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a aVar = this.f280265w;
                PlanDowngradeFlowContract$InputData planDowngradeFlowContract$InputData = aVar.o;
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    this.v = 1;
                    Object objA = nim.a.a(((n) aVar.f103162p).b(planDowngradeFlowContract$InputData.f103153a), this);
                    if (objA != obj3) {
                        objA = Unit.f186387a;
                    }
                    if (objA == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                oki.h.u2(aVar, aVar.f103165s, new PlanDowngradeFlowContract$Step.BenefitsToLose(planDowngradeFlowContract$InputData.f103153a, planDowngradeFlowContract$InputData.f103154b), null, 6);
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                Continuation continuation = null;
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a aVar3 = this.f280265w;
                if (i2 == 0) {
                    o.b(obj2);
                    t tVar = aVar3.f103163q;
                    PlanDowngradeFlowContract$InputData planDowngradeFlowContract$InputData2 = aVar3.o;
                    d0 d0VarFirstOrError = m70.a.g(t.u(tVar, planDowngradeFlowContract$InputData2.f103153a, planDowngradeFlowContract$InputData2.f103154b, false, 8), null, new f0(19), 1).firstOrError();
                    Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                    this.v = 1;
                    obj2 = nim.a.b(d0VarFirstOrError, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                List list = ((qha.a) obj2).k;
                List list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    aVar3.l2(new g(aVar3, continuation, 4), new yi5.b(26));
                } else {
                    oki.h.u2(aVar3, aVar3.f103165s, new PlanDowngradeFlowContract$Step.BlockDowngrade(list), null, 6);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a aVar5 = this.f280265w;
                    f fVar = new f(aVar5, null, 1);
                    this.v = 1;
                    if (aVar5.p2(this, fVar) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a aVar6 = this.f280265w;
                PlanDowngradeFlowContract$InputData planDowngradeFlowContract$InputData3 = aVar6.o;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    d0 d0VarF = aVar6.f103163q.f(planDowngradeFlowContract$InputData3.f103153a);
                    this.v = 1;
                    obj2 = nim.a.b(d0VarF, this);
                    if (obj2 == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                hha.d dVar = (hha.d) ((od0.i) obj2).f224257a;
                if (dVar == null) {
                    throw new IllegalStateException(j6.a.q("no plans with id ", planDowngradeFlowContract$InputData3.f103153a));
                }
                aVar6.C2(new d(dVar, planDowngradeFlowContract$InputData3.f103154b));
                return Unit.f186387a;
            case 4:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a aVar9 = this.f280265w;
                f fVar2 = new f(aVar9, null, 3);
                this.v = 1;
                Object objB = pu7.a.B(aVar9.k, "plan_selection_confirm", fVar2, this);
                return objB == aVar8 ? aVar8 : objB;
            case 5:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    o.b(obj2);
                    com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a aVar11 = this.f280265w;
                    h hVar = new h(aVar11, null);
                    this.v = 1;
                    if (aVar11.p2(this, hVar) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a.I2(this.f280265w, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    o.b(obj2);
                    com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_downgrade.a aVar14 = this.f280265w;
                    f fVar3 = new f(aVar14, null, 6);
                    this.v = 1;
                    if (aVar14.p2(this, fVar3) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}

package eik;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f126681w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f126682x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i, int i2, Object obj2, Continuation continuation) {
        super(1, continuation);
        this.u = i2;
        this.f126682x = obj2;
        this.f126681w = i;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p(this.f126681w, 0, (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g) this.f126682x, continuation);
            case 1:
                return new p(this.f126681w, 1, (ew1.m) this.f126682x, continuation);
            case 2:
                return new p(this.f126681w, 2, (i84.j) this.f126682x, continuation);
            case 3:
                return new p(this.f126681w, 3, (oqk.k) this.f126682x, continuation);
            default:
                return new p(this.f126681w, 4, (com.revolut.trading.orders.ui.screens.investment_plan.projection.a) this.f126682x, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((p) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        int i2 = this.f126681w;
        Object obj3 = this.f126682x;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g) obj3).J2(i2, false, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    ew1.m mVar = (ew1.m) obj3;
                    bg2.s sVar = new bg2.s(i2, mVar, (Continuation) null);
                    this.v = 1;
                    if (do3.q.t(mVar, sVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                i84.j jVar = (i84.j) obj3;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    g84.e eVar = jVar.o;
                    this.v = 1;
                    obj2 = ((g84.m) eVar).c(i2, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                nu3.g gVar = ((nu3.c) obj2).e;
                if (gVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                jVar.H2(jVar.f159443q, new i84.h(gVar, 1));
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    pfm.r rVarC = ((oqk.k) obj3).o.c(i2);
                    this.v = 1;
                    if (nim.a.a(rVarC, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                com.revolut.trading.orders.ui.screens.investment_plan.projection.a aVar5 = (com.revolut.trading.orders.ui.screens.investment_plan.projection.a) obj3;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    zul.x xVar = com.revolut.trading.orders.ui.screens.investment_plan.projection.a.Companion;
                    w4l.h loadingStrategy = w4l.h.f294642c;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    jhi.b bVarG = mo3.a.g(nim.a.v(vkm.q.q(nim.a.v(aVar5.f107039r.b(new dil.a(aVar5.o.f107031a, null, com.revolut.trading.orders.ui.screens.investment_plan.projection.a.D), loadingStrategy), new zr2.o(28))), new wk4.k(i2, 14)), null, new zs4.d(6), 1);
                    this.v = 1;
                    obj2 = vkm.q.x(bVarG, this);
                    if (obj2 == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar5.H2(aVar5.C, new vtf.b(9, (dj0.d) obj2));
                return Unit.f186387a;
        }
    }
}

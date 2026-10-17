package d7j;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class t1 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g f112058w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t1(int i, com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar, Continuation continuation) {
        super(1, continuation);
        this.u = i;
        this.f112058w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t1(0, this.f112058w, continuation);
            case 1:
                return new t1(1, this.f112058w, continuation);
            case 2:
                return new t1(2, this.f112058w, continuation);
            case 3:
                return new t1(3, this.f112058w, continuation);
            default:
                return new t1(4, this.f112058w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((t1) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar = this.f112058w;
                    q0 q0Var = new q0(gVar, 8);
                    this.v = 1;
                    if (gVar.P2(this, q0Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar2 = this.f112058w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    c64.d dVar = new c64.d(gVar2, null, 27);
                    this.v = 1;
                    obj2 = zh9.u0.b0(gVar2.X(), "NEXT_BUTTON_LOADING_TAG", dVar, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                f0 f0Var = (f0) obj2;
                if (f0Var == null) {
                    return Unit.f186387a;
                }
                gVar2.f99866x.Q();
                gVar2.C2(f0Var);
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g.M2(this.f112058w, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar3 = this.f112058w;
                    q0 q0Var2 = new q0(gVar3, 9);
                    this.v = 1;
                    if (gVar3.P2(this, q0Var2) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar4 = this.f112058w;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    vkm.t0 t0Var = new vkm.t0(gVar4.T.B(new p0(10)), 1);
                    this.v = 1;
                    obj2 = vkm.q.x(t0Var, this);
                    if (obj2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                this.v = 2;
                if (gVar4.O2((wd6.h) obj2, this) == aVar5) {
                    return aVar5;
                }
                return Unit.f186387a;
        }
    }
}

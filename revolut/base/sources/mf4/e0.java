package mf4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class e0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g f204851w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g gVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f204851w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e0(this.f204851w, continuation, 0);
            case 1:
                return new e0(this.f204851w, continuation, 1);
            case 2:
                return new e0(this.f204851w, continuation, 2);
            case 3:
                return new e0(this.f204851w, continuation, 3);
            default:
                return new e0(this.f204851w, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((e0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g gVar = this.f204851w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    e eVar = gVar.f68151q;
                    this.v = 1;
                    obj2 = ((a0) eVar).j(this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                this.v = 2;
                if (c84.t.N2(gVar, (it3.d) obj2, this, 2) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g gVar2 = this.f204851w;
                    e0 e0Var = new e0(gVar2, null, 0);
                    this.v = 1;
                    if (gVar2.p2(this, e0Var) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g gVar3 = this.f204851w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    e eVar2 = gVar3.f68151q;
                    this.v = 1;
                    obj2 = ((a0) eVar2).s(this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                this.v = 2;
                if (c84.t.N2(gVar3, (it3.d) obj2, this, 2) == aVar3) {
                    return aVar3;
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    e eVar3 = this.f204851w.f68151q;
                    this.v = 1;
                    obj2 = ((a0) eVar3).o(this);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return ((cv3.b0) obj2).f109237a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g gVar4 = this.f204851w;
                com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.f fVar = new com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.f(gVar4, null);
                this.v = 1;
                Object objB = pu7.a.B(gVar4.k, "load intro", fVar, this);
                return objB == aVar5 ? aVar5 : objB;
        }
    }
}

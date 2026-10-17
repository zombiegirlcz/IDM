package qee;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import pfm.z;
import rfm.f0;
import skm.e0;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a f245135w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f245135w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o(this.f245135w, continuation, 0);
            case 1:
                return new o(this.f245135w, continuation, 1);
            case 2:
                return new o(this.f245135w, continuation, 2);
            case 3:
                return new o(this.f245135w, continuation, 3);
            case 4:
                return new o(this.f245135w, continuation, 4);
            default:
                return new o(this.f245135w, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a aVar2 = this.f245135w;
                Object objH = aVar2.f89437p.h(aVar2.o.f89433a, this);
                return objH == aVar ? aVar : objH;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a aVar4 = this.f245135w;
                    z zVarA = aVar4.f89438q.a(aVar4.o.f89433a, true);
                    this.v = 1;
                    obj2 = nim.a.b(zVarA, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return ((od0.i) obj2).f224257a;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a aVar6 = this.f245135w;
                f0 f0VarT = zi0.c.t(aVar6.f89441t.g(aVar6.o.f89433a));
                this.v = 1;
                Object objB = nim.a.b(f0VarT, this);
                return objB == aVar5 ? aVar5 : objB;
            case 3:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                p pVar = new p(this.f245135w, null);
                this.v = 1;
                Object objO = e0.o(pVar, this);
                return objO == aVar7 ? aVar7 : objO;
            case 4:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a aVar9 = this.f245135w;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    obj2 = aVar9.f89437p.h(aVar9.o.f89433a, this);
                    if (obj2 == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 != 2 && i6 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                h93.f0 f0Var = (h93.f0) obj2;
                if (f0Var.W) {
                    this.v = 2;
                    if (com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a.J2(aVar9, f0Var, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    this.v = 3;
                    if (aVar9.K2(f0Var, this) == aVar8) {
                        return aVar8;
                    }
                }
                return Unit.f186387a;
            default:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a aVar11 = this.f245135w;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    z6l.s sVar = aVar11.f89437p;
                    String str = aVar11.o.f89433a;
                    this.v = 1;
                    obj2 = sVar.h(str, this);
                    if (obj2 == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar11.H2(aVar11.f89443x, new avc.o((h93.f0) obj2, 9));
                return Unit.f186387a;
        }
    }
}

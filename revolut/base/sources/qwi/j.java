package qwi;

import cu8.r0;
import dwi.d0;
import hwi.j0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import ks8.j;
import ks8.m;
import ocb.u;
import pfm.n;
import pfm.r;
import te0.w;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e f249958w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f249958w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f249958w, continuation, 0);
            default:
                return new j(this.f249958w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e eVar = this.f249958w;
                if (i == 0) {
                    o.b(obj2);
                    r0 r0Var = eVar.f99016r;
                    this.v = 1;
                    obj2 = m.b(r0Var, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        eVar.H2(eVar.z, new u(zBooleanValue, 27));
                        eVar.N2(zBooleanValue);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                ks8.j jVar = (ks8.j) obj2;
                if (jVar instanceof ks8.i) {
                    eVar.C1(u0.b(((ks8.i) jVar).f189312a));
                    oki.h.D2(eVar.A);
                    return Unit.f186387a;
                }
                if (!(jVar instanceof j.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.v = 2;
                obj2 = com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e.K2(eVar, this);
                if (obj2 == aVar) {
                    return aVar;
                }
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                eVar.H2(eVar.z, new u(zBooleanValue2, 27));
                eVar.N2(zBooleanValue2);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    j0 j0Var = ((d0) this.f249958w.f99018t).f120417b;
                    j0Var.getClass();
                    n nVar = new n(new h4d.d(j0Var, 6), 1);
                    Intrinsics.checkNotNullExpressionValue(nVar, "fromCallable(...)");
                    r rVarG0 = w.g0(nVar);
                    this.v = 1;
                    if (nim.a.a(rVarG0, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}

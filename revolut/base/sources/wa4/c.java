package wa4;

import c84.t;
import efm.d0;
import ft3.h1;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import p24.p;
import te0.w;
import ufm.n;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f295809w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f295809w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f295809w, continuation, 0);
            default:
                return new c(this.f295809w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((c) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                e eVar = this.f295809w;
                if (i == 0) {
                    o.b(obj2);
                    hw3.c cVar = eVar.f295813q;
                    h1 productPayload = w0.F(eVar.f295812p.f67643c);
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(productPayload, "productPayload");
                    p pVar = cVar.f156055a;
                    pVar.getClass();
                    Intrinsics.checkNotNullParameter(productPayload, "productPayload");
                    d0<tt3.a> d0VarFinishEmergencyPayment = pVar.f232057c.finishEmergencyPayment(productPayload.f137835a);
                    p24.b bVar = new p24.b(4, new p24.e(pVar, 1));
                    d0VarFinishEmergencyPayment.getClass();
                    ufm.i iVar = new ufm.i(d0VarFinishEmergencyPayment, bVar, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                    n nVarI0 = w.i0(iVar);
                    this.v = 1;
                    obj2 = nim.a.b(nVarI0, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                this.v = 2;
                if (t.N2(eVar, (it3.d) obj2, this, 2) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    e eVar2 = this.f295809w;
                    c cVar2 = new c(eVar2, null, 0);
                    this.v = 1;
                    if (eVar2.p2(this, cVar2) == aVar2) {
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

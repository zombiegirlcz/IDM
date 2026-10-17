package s94;

import c84.t;
import efm.d0;
import ft3.h1;
import gim.i;
import it3.d;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import p24.e;
import p24.p;
import te0.w;
import ufm.n;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f261108w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f261108w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a(this.f261108w, continuation, 0);
            default:
                return new a(this.f261108w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((a) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                b bVar = this.f261108w;
                if (i == 0) {
                    o.b(obj2);
                    hw3.c cVar = bVar.f261110q;
                    h1 productPayload = w0.F(bVar.f261109p.f67539a);
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(productPayload, "productPayload");
                    p pVar = cVar.f156055a;
                    pVar.getClass();
                    Intrinsics.checkNotNullParameter(productPayload, "productPayload");
                    d0<tt3.a> d0VarResetDirectDebit = pVar.f232057c.resetDirectDebit(productPayload.f137835a);
                    p24.b bVar2 = new p24.b(15, new e(pVar, 8));
                    d0VarResetDirectDebit.getClass();
                    ufm.i iVar = new ufm.i(d0VarResetDirectDebit, bVar2, 1);
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
                if (t.N2(bVar, (d) obj2, this, 2) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    b bVar3 = this.f261108w;
                    a aVar3 = new a(bVar3, null, 0);
                    this.v = 1;
                    if (bVar3.p2(this, aVar3) == aVar2) {
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

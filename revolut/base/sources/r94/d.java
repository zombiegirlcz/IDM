package r94;

import bk4.f;
import bk4.g;
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
public final class d extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.a f252521w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f252522x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f252523y;
    public final /* synthetic */ f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.a aVar, String str, String str2, f fVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f252521w = aVar;
        this.f252522x = str;
        this.f252523y = str2;
        this.z = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f252521w, this.f252522x, this.f252523y, this.z, continuation, 0);
            default:
                return new d(this.f252521w, this.f252522x, this.f252523y, this.z, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((d) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.a aVar2 = this.f252521w;
                if (i == 0) {
                    o.b(obj2);
                    hw3.c cVar = aVar2.f67535q;
                    h1 productPayload = w0.F(aVar2.f67534p.f67526b);
                    String str = this.f252522x;
                    String str2 = this.f252523y;
                    f fVar = this.z;
                    g request = new g(str, str2, fVar);
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(productPayload, "productPayload");
                    Intrinsics.checkNotNullParameter(request, "request");
                    p pVar = cVar.f156055a;
                    pVar.getClass();
                    Intrinsics.checkNotNullParameter(productPayload, "productPayload");
                    Intrinsics.checkNotNullParameter(request, "request");
                    d0<tt3.a> d0VarSubmitDirectDebit = pVar.f232057c.submitDirectDebit(productPayload.f137835a, new v04.c(str, str2, fVar.a()));
                    p24.b bVar = new p24.b(16, new p24.e(pVar, 11));
                    d0VarSubmitDirectDebit.getClass();
                    ufm.i iVar = new ufm.i(d0VarSubmitDirectDebit, bVar, 1);
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
                if (t.N2(aVar2, (it3.d) obj2, this, 2) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.a aVar4 = this.f252521w;
                    d dVar = new d(aVar4, this.f252522x, this.f252523y, this.z, null, 0);
                    this.v = 1;
                    if (aVar4.p2(this, dVar) == aVar3) {
                        return aVar3;
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

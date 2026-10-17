package ri4;

import efm.d0;
import ft3.g1;
import ft3.j1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes22.dex */
public final class m extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f254547w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f254547w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.f254547w, continuation, 0);
            case 1:
                return new m(this.f254547w, continuation, 1);
            case 2:
                return new m(this.f254547w, continuation, 2);
            default:
                return new m(this.f254547w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((m) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                n nVar = this.f254547w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    hw3.c cVar = nVar.f254549q;
                    j1 productType = nVar.f254551s.f68476a.d;
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(productType, "productType");
                    p24.p pVar = cVar.f156055a;
                    pVar.getClass();
                    Intrinsics.checkNotNullParameter(productType, "productType");
                    d0<tt3.a> d0VarAcceptSpousalConsent = pVar.f232057c.acceptSpousalConsent(g1.i(productType));
                    p24.b bVar = new p24.b(13, new p24.e(pVar, 10));
                    d0VarAcceptSpousalConsent.getClass();
                    ufm.i iVar = new ufm.i(d0VarAcceptSpousalConsent, bVar, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                    ufm.n nVarI0 = w.i0(iVar);
                    this.v = 1;
                    obj2 = nim.a.b(nVarI0, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                it3.d dVar = (it3.d) obj2;
                Intrinsics.h(dVar);
                n.y2(nVar, dVar);
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    n nVar2 = this.f254547w;
                    m mVar = new m(nVar2, null, 0);
                    this.v = 1;
                    if (nVar2.p2(this, mVar) == aVar2) {
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
                n nVar3 = this.f254547w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    hw3.c cVar2 = nVar3.f254549q;
                    j1 productType2 = nVar3.f254551s.f68476a.d;
                    cVar2.getClass();
                    Intrinsics.checkNotNullParameter(productType2, "productType");
                    p24.p pVar2 = cVar2.f156055a;
                    pVar2.getClass();
                    Intrinsics.checkNotNullParameter(productType2, "productType");
                    d0<tt3.a> d0VarDeclineSpousalConsent = pVar2.f232057c.declineSpousalConsent(g1.i(productType2));
                    p24.b bVar2 = new p24.b(11, new p24.e(pVar2, 7));
                    d0VarDeclineSpousalConsent.getClass();
                    ufm.i iVar2 = new ufm.i(d0VarDeclineSpousalConsent, bVar2, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                    ufm.n nVarI02 = w.i0(iVar2);
                    this.v = 1;
                    obj2 = nim.a.b(nVarI02, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                it3.d dVar2 = (it3.d) obj2;
                Intrinsics.h(dVar2);
                n.y2(nVar3, dVar2);
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    n nVar4 = this.f254547w;
                    m mVar2 = new m(nVar4, null, 2);
                    this.v = 1;
                    if (nVar4.p2(this, mVar2) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}

package ij9;

import efm.d0;
import ieg.y;
import igh.k;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import w4l.j;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f161746w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f161746w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f161746w, continuation, 0);
            default:
                return new g(this.f161746w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((g) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                i iVar = this.f161746w;
                if (i == 0) {
                    o.b(obj2);
                    d0 d0VarFirstOrError = m70.a.g(nim.a.w(rd0.e.c(((ti9.g) iVar.f161749m).k(j.f294644c), kotlin.coroutines.g.f186406a), new k(28)), null, new y(27), 1).firstOrError();
                    Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                    ihd.c cVar = new ihd.c(1, new ii4.b(iVar, 6));
                    d0VarFirstOrError.getClass();
                    ufm.i iVar2 = new ufm.i(d0VarFirstOrError, cVar, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                    this.v = 1;
                    obj2 = nim.a.b(iVar2, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                rp0.y yVar = (rp0.y) obj2;
                j60.a aVar2 = iVar.f161748l;
                Intrinsics.h(yVar);
                aVar2.x(yVar);
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    i iVar3 = this.f161746w;
                    d dVar = new d(iVar3, null, 1);
                    this.v = 1;
                    if (iVar3.Y2(this, dVar) == aVar3) {
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

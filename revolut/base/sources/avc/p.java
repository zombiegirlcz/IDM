package avc;

import ha3.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class p extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f10004w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(r rVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f10004w = rVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p(this.f10004w, continuation, 0);
            default:
                return new p(this.f10004w, continuation, 1);
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
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                r rVar = this.f10004w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    pfm.h hVarL = ((x) rVar.o).l(((e) ((j2) rVar.f10006p.f22677a).getValue()).f9995a.f150110a);
                    this.v = 1;
                    if (nim.a.a(hVarL, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                rVar.C2(g.f9996a);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                r rVar2 = this.f10004w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    pfm.h hVarI = ((x) rVar2.o).I(((e) ((j2) rVar2.f10006p.f22677a).getValue()).f9995a.f150110a);
                    this.v = 1;
                    if (nim.a.a(hVarI, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                rVar2.C2(h.f9997a);
                return Unit.f186387a;
        }
    }
}

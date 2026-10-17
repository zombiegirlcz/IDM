package zuh;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f325471w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(o oVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f325471w = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f325471w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            default:
                h hVar2 = new h(this.f325471w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        pil.a aVar = (pil.a) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(aVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        o oVar = this.f325471w;
        switch (i) {
            case 0:
                pil.a aVar = (pil.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bvh.c cVar = (bvh.c) j6.a.k(bvh.c.class, oVar.f325480a, o.a(aVar));
                if (cVar != null) {
                    return v13.d.w(cVar);
                }
                return null;
            default:
                pil.a aVar3 = (pil.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oVar.f325481b.remove(o.a(aVar3));
                oVar.f325480a.I0(o.a(aVar3));
                return Unit.f186387a;
        }
    }
}

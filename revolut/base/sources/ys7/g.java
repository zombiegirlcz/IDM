package ys7;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zr7.t;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f316423w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f316423w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f316423w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            default:
                g gVar2 = new g(this.f316423w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        f fVar = (f) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(fVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        h hVar = this.f316423w;
        switch (i) {
            case 0:
                f fVar = (f) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                t tVar = (t) j6.a.k(t.class, hVar.f316426c, fVar.getKey());
                if (tVar != null) {
                    return ifk.b.z(tVar);
                }
                return null;
            default:
                f key = (f) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                hVar.f316426c.I0(key.getKey());
                xx4.d dVar = hVar.f316425b;
                Intrinsics.checkNotNullParameter(key, "key");
                dVar.f309396a.remove(key.getKey());
                return Unit.f186387a;
        }
    }
}

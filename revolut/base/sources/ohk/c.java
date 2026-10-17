package ohk;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.q;
import vkm.z1;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f225386w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, h hVar, Continuation continuation) {
        super(1, continuation);
        this.v = gVar;
        this.f225386w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, this.f225386w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        String str = this.f225386w.f225394a;
        g gVar = this.v;
        gVar.c3(str, new o10.c(gVar, 16), new o9h.b(gVar, 23));
        z1 z1Var = gVar.o;
        this.u = 1;
        Object objX = q.x(z1Var, this);
        return objX == aVar ? aVar : objX;
    }
}

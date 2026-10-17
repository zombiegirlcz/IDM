package rs2;

import hx7.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.o0;
import wim.z;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ ru.k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f256945w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(n nVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f256945w = nVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        ru.k kVar = (ru.k) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                h hVar = new h(this.f256945w, continuation, 0);
                hVar.v = kVar;
                return hVar.invokeSuspend(Unit.f186387a);
            default:
                h hVar2 = new h(this.f256945w, continuation, 1);
                hVar2.v = kVar;
                return hVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        n nVar = this.f256945w;
        switch (i) {
            case 0:
                ru.k kVar = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                nVar.f256955b.G(q.j0(kVar), "ACTIVE_CAMPAIGN_STATE_KEY", z.d(o0.b(tu.d.class)));
                break;
            default:
                ru.k kVar2 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                nVar.f256955b.G(q.j0(kVar2), "INACTIVE_CAMPAIGN_STATE_KEY", z.d(o0.b(tu.d.class)));
                break;
        }
        return Unit.f186387a;
    }
}

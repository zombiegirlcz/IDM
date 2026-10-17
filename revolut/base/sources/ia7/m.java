package ia7;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f159964w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f159964w = nVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        j jVar = (j) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                m mVar = new m(this.f159964w, continuation, 0);
                mVar.v = jVar;
                return mVar.invokeSuspend(Unit.f186387a);
            default:
                m mVar2 = new m(this.f159964w, continuation, 1);
                mVar2.v = jVar;
                return mVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Class cls = Long.TYPE;
        n nVar = this.f159964w;
        switch (i) {
            case 0:
                ue0.c cVar = nVar.f159966b;
                j jVar = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (jVar.f159962a != null) {
                    c cVar2 = d.Companion;
                    z9h.n.l(String.class, cVar, nVar.b().c(), jVar.f159962a);
                } else {
                    c cVar3 = d.Companion;
                    cVar.I0(nVar.b().c());
                }
                com.google.android.gms.internal.mlkit_vision_face.a.B(cls, cVar, nVar.b().d(), new Long(jVar.f159963b));
                break;
            default:
                ue0.c cVar4 = nVar.f159966b;
                j jVar2 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (jVar2.f159962a != null) {
                    c cVar5 = d.Companion;
                    z9h.n.l(String.class, cVar4, nVar.b().f(), jVar2.f159962a);
                } else {
                    c cVar6 = d.Companion;
                    cVar4.I0(nVar.b().f());
                }
                com.google.android.gms.internal.mlkit_vision_face.a.B(cls, cVar4, nVar.b().i(), new Long(jVar2.f159963b));
                break;
        }
        return Unit.f186387a;
    }
}

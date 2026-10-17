package y5b;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ r5b.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f311042w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j jVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f311042w = jVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        r5b.e eVar = (r5b.e) obj3;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                h hVar = new h(this.f311042w, continuation, 0);
                hVar.v = eVar;
                return hVar.invokeSuspend(Unit.f186387a);
            default:
                h hVar2 = new h(this.f311042w, continuation, 1);
                hVar2.v = eVar;
                return hVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        j jVar = this.f311042w;
        switch (i) {
            case 0:
                r5b.e eVar = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jVar.f311049b.G(x5d.b.A(eVar), "KEY_CREATE_ACCOUNT", wim.z.d(o0.b(w5b.d0.class)));
                break;
            default:
                r5b.e eVar2 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                jVar.f311049b.G(x5d.b.A(eVar2), "KEY_LINK_ACCOUNT", wim.z.d(o0.b(w5b.d0.class)));
                break;
        }
        return Unit.f186387a;
    }
}

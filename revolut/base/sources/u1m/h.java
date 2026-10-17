package u1m;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ awl.b f276471w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o oVar, awl.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = oVar;
        this.f276471w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, this.f276471w, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        CoroutineScope coroutineScope = (CoroutineScope) this.u;
        o oVar = this.v;
        awl.b bVar = this.f276471w;
        skm.e0.C(coroutineScope, null, null, new e(oVar, bVar, null), 3);
        skm.e0.C(coroutineScope, null, null, new g(oVar, bVar, null), 3);
        return Unit.f186387a;
    }
}

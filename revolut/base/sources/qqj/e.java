package qqj;

import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Long f248559w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f248560x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ List f248561y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, Long l2, long j2, List list, Continuation continuation) {
        super(2, continuation);
        this.v = hVar;
        this.f248559w = l2;
        this.f248560x = j2;
        this.f248561y = list;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, this.f248559w, this.f248560x, this.f248561y, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list = (List) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = this.v;
        hVar.f248566c.f(h.b(hVar, this.f248559w, this.f248560x, this.f248561y), list);
        return Unit.f186387a;
    }
}

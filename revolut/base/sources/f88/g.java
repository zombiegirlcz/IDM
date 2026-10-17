package f88;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ esj.e f132752w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(esj.e eVar, Continuation continuation) {
        super(continuation);
        this.f132752w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f132752w.emit(null, this);
    }
}

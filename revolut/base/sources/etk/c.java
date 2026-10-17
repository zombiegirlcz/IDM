package etk;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ esj.e f129445w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(esj.e eVar, Continuation continuation) {
        super(continuation);
        this.f129445w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f129445w.emit(null, this);
    }
}

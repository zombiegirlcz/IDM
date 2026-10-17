package es;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes17.dex */
public final class r extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ egh.e f128768w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(egh.e eVar, Continuation continuation) {
        super(continuation);
        this.f128768w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f128768w.emit(null, this);
    }
}

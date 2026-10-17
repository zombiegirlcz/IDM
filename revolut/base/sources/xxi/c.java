package xxi;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ xv5.f f309535w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(xv5.f fVar, Continuation continuation) {
        super(continuation);
        this.f309535w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f309535w.emit(null, this);
    }
}

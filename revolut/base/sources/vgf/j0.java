package vgf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class j0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v6e.p f289109w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(v6e.p pVar, Continuation continuation) {
        super(continuation);
        this.f289109w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f289109w.emit(null, this);
    }
}

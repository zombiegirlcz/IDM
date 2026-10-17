package vea;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class v extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v6e.p f288242w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(v6e.p pVar, Continuation continuation) {
        super(continuation);
        this.f288242w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f288242w.emit(null, this);
    }
}

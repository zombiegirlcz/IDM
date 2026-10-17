package rrc;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class c0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ pc7.c f256758w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(pc7.c cVar, Continuation continuation) {
        super(continuation);
        this.f256758w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f256758w.emit(null, this);
    }
}

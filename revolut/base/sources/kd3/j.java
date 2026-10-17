package kd3;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ kbb.n f182789w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(kbb.n nVar, Continuation continuation) {
        super(continuation);
        this.f182789w = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f182789w.emit(null, this);
    }
}

package qce;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class i0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ qb3.p f244734w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(qb3.p pVar, Continuation continuation) {
        super(continuation);
        this.f244734w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f244734w.emit(null, this);
    }
}

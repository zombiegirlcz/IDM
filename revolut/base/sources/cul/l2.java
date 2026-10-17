package cul;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class l2 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c1 f109134w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(c1 c1Var, Continuation continuation) {
        super(continuation);
        this.f109134w = c1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f109134w.emit(null, this);
    }
}

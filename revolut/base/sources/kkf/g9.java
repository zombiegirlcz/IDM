package kkf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class g9 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h9 f184707w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9(h9 h9Var, Continuation continuation) {
        super(continuation);
        this.f184707w = h9Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f184707w.emit(null, this);
    }
}

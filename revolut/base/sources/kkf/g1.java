package kkf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class g1 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b8d.a0 f184695w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(b8d.a0 a0Var, Continuation continuation) {
        super(continuation);
        this.f184695w = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f184695w.emit(null, this);
    }
}

package vha;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class f0 extends gim.c {
    public sfe.m u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q0 f289363w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f289364x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(q0 q0Var, Continuation continuation) {
        super(continuation);
        this.f289363w = q0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f289364x |= Integer.MIN_VALUE;
        return this.f289363w.e3(null, this);
    }
}

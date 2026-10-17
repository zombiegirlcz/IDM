package v2e;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q2e.m0 f285700w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(q2e.m0 m0Var, Continuation continuation) {
        super(continuation);
        this.f285700w = m0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f285700w.emit(null, this);
    }
}

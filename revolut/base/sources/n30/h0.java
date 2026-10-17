package n30;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes19.dex */
public final class h0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ eg.n0 f211630w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(eg.n0 n0Var, Continuation continuation) {
        super(continuation);
        this.f211630w = n0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f211630w.emit(null, this);
    }
}

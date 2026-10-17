package swc;

import eg.n0;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n0 f266189w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n0 n0Var, Continuation continuation) {
        super(continuation);
        this.f266189w = n0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f266189w.emit(null, this);
    }
}

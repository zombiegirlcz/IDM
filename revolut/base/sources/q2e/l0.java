package q2e;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class l0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m0 f241599w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(m0 m0Var, Continuation continuation) {
        super(continuation);
        this.f241599w = m0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f241599w.emit(null, this);
    }
}

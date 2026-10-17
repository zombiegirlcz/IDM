package n1g;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class q extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b8d.a0 f211340w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(b8d.a0 a0Var, Continuation continuation) {
        super(continuation);
        this.f211340w = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f211340w.emit(null, this);
    }
}

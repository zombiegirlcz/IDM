package eg;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n0 f125466w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, Continuation continuation) {
        super(continuation);
        this.f125466w = n0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f125466w.emit(null, this);
    }
}

package n8i;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class z0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y0 f213493w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(y0 y0Var, Continuation continuation) {
        super(continuation);
        this.f213493w = y0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f213493w.emit(null, this);
    }
}

package b8d;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class z extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a0 f13202w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, Continuation continuation) {
        super(continuation);
        this.f13202w = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f13202w.emit(null, this);
    }
}

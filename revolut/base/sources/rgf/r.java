package rgf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class r extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r74.a0 f254168w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(r74.a0 a0Var, Continuation continuation) {
        super(continuation);
        this.f254168w = a0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f254168w.emit(null, this);
    }
}

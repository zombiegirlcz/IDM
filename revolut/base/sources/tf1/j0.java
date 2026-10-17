package tf1;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes20.dex */
public final class j0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h0 f270172w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(h0 h0Var, Continuation continuation) {
        super(continuation);
        this.f270172w = h0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f270172w.emit(null, this);
    }
}

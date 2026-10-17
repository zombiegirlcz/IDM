package ft4;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class h0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ahe.f0 f137906w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ahe.f0 f0Var, Continuation continuation) {
        super(continuation);
        this.f137906w = f0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f137906w.emit(null, this);
    }
}

package vo8;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ vgf.n0 f290879w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(vgf.n0 n0Var, Continuation continuation) {
        super(continuation);
        this.f290879w = n0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f290879w.emit(null, this);
    }
}

package w38;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class t0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u0 f294213w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, Continuation continuation) {
        super(continuation);
        this.f294213w = u0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f294213w.emit(null, this);
    }
}

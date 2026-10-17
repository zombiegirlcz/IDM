package w4i;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class c0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ vy5.c0 f294570w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(vy5.c0 c0Var, Continuation continuation) {
        super(continuation);
        this.f294570w = c0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f294570w.emit(null, this);
    }
}

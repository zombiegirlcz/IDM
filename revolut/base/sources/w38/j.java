package w38;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ vy5.c0 f294183w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(vy5.c0 c0Var, Continuation continuation) {
        super(continuation);
        this.f294183w = c0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f294183w.emit(null, this);
    }
}

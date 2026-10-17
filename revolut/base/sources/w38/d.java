package w38;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ vy5.c0 f294165w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(vy5.c0 c0Var, Continuation continuation) {
        super(continuation);
        this.f294165w = c0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f294165w.emit(null, this);
    }
}

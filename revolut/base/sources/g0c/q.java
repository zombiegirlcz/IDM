package g0c;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f139442w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(o oVar, Continuation continuation) {
        super(continuation);
        this.f139442w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f139442w.emit(null, this);
    }
}

package t73;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class q2 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f268525w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(v vVar, Continuation continuation) {
        super(continuation);
        this.f268525w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f268525w.emit(null, this);
    }
}

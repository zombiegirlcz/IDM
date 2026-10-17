package m9d;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class q0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ly4.d f203737w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(ly4.d dVar, Continuation continuation) {
        super(continuation);
        this.f203737w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f203737w.emit(null, this);
    }
}

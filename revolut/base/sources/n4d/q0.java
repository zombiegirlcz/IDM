package n4d;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class q0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n1j.d f212392w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(n1j.d dVar, Continuation continuation) {
        super(continuation);
        this.f212392w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f212392w.emit(null, this);
    }
}

package nfl;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n1j.d f215092w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n1j.d dVar, Continuation continuation) {
        super(continuation);
        this.f215092w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f215092w.emit(null, this);
    }
}

package n33;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class s0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n1j.d f211805w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(n1j.d dVar, Continuation continuation) {
        super(continuation);
        this.f211805w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f211805w.emit(null, this);
    }
}

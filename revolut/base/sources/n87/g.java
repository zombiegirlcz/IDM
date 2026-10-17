package n87;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n1j.d f213252w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(n1j.d dVar, Continuation continuation) {
        super(continuation);
        this.f213252w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f213252w.emit(null, this);
    }
}

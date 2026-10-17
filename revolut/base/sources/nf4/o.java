package nf4;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class o extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n1j.d f214821w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(n1j.d dVar, Continuation continuation) {
        super(continuation);
        this.f214821w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f214821w.emit(null, this);
    }
}

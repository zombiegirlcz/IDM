package e65;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class o extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f122907w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, Continuation continuation) {
        super(continuation);
        this.f122907w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f122907w.emit(null, this);
    }
}

package tjh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class o extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ nj8.g f271761w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(nj8.g gVar, Continuation continuation) {
        super(continuation);
        this.f271761w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f271761w.emit(null, this);
    }
}

package btk;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ bq5.o f18632w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(bq5.o oVar, Continuation continuation) {
        super(continuation);
        this.f18632w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f18632w.emit(null, this);
    }
}

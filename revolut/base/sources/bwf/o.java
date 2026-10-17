package bwf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ bq5.o f19343w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(bq5.o oVar, Continuation continuation) {
        super(continuation);
        this.f19343w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f19343w.emit(null, this);
    }
}

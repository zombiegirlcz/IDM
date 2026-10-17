package c2d;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ bq5.o f20705w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(bq5.o oVar, Continuation continuation) {
        super(continuation);
        this.f20705w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f20705w.emit(null, this);
    }
}

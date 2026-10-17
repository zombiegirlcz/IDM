package c64;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class w extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ bq5.o f21650w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(bq5.o oVar, Continuation continuation) {
        super(continuation);
        this.f21650w = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f21650w.emit(null, this);
    }
}

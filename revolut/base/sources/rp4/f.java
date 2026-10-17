package rp4;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ rnb.c f256262w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(rnb.c cVar, Continuation continuation) {
        super(continuation);
        this.f256262w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f256262w.emit(null, this);
    }
}

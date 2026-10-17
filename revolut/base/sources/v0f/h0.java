package v0f;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class h0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ uxh.c f284809w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(uxh.c cVar, Continuation continuation) {
        super(continuation);
        this.f284809w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f284809w.emit(null, this);
    }
}

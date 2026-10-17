package v0f;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ uxh.c f284819w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(uxh.c cVar, Continuation continuation) {
        super(continuation);
        this.f284819w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f284819w.emit(null, this);
    }
}

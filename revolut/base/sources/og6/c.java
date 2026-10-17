package og6;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ oce.c f225041w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(oce.c cVar, Continuation continuation) {
        super(continuation);
        this.f225041w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f225041w.emit(null, this);
    }
}

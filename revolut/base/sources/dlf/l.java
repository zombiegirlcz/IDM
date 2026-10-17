package dlf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dc0.c f115750w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(dc0.c cVar, Continuation continuation) {
        super(continuation);
        this.f115750w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f115750w.emit(null, this);
    }
}

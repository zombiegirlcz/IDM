package ihd;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i8c.c f161377w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i8c.c cVar, Continuation continuation) {
        super(continuation);
        this.f161377w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f161377w.emit(null, this);
    }
}

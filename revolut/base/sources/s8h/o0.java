package s8h;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class o0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s6b.c f261026w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(s6b.c cVar, Continuation continuation) {
        super(continuation);
        this.f261026w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f261026w.emit(null, this);
    }
}

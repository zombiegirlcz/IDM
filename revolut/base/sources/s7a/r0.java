package s7a;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class r0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s6b.c f260631w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s6b.c cVar, Continuation continuation) {
        super(continuation);
        this.f260631w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f260631w.emit(null, this);
    }
}

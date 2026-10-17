package tzl;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ sij.c f275992w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(sij.c cVar, Continuation continuation) {
        super(continuation);
        this.f275992w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f275992w.emit(null, this);
    }
}

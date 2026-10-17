package s6e;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class r extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s6b.c f260306w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s6b.c cVar, Continuation continuation) {
        super(continuation);
        this.f260306w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f260306w.emit(null, this);
    }
}

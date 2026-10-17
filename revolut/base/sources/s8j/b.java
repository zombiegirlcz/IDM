package s8j;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s6b.c f261052w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(s6b.c cVar, Continuation continuation) {
        super(continuation);
        this.f261052w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f261052w.emit(null, this);
    }
}

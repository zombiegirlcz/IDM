package tjf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class j0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ te8.j f271669w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(te8.j jVar, Continuation continuation) {
        super(continuation);
        this.f271669w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f271669w.emit(null, this);
    }
}

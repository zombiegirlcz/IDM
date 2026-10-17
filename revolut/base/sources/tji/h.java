package tji;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ te8.j f271789w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(te8.j jVar, Continuation continuation) {
        super(continuation);
        this.f271789w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f271789w.emit(null, this);
    }
}

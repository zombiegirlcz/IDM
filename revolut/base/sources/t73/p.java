package t73;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class p extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t05.f f268498w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(t05.f fVar, Continuation continuation) {
        super(continuation);
        this.f268498w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f268498w.emit(null, this);
    }
}

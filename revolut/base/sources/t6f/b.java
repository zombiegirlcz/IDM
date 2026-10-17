package t6f;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t05.f f268328w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(t05.f fVar, Continuation continuation) {
        super(continuation);
        this.f268328w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f268328w.emit(null, this);
    }
}

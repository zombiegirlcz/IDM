package d6e;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f111511w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d dVar, Continuation continuation) {
        super(continuation);
        this.f111511w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f111511w.emit(null, this);
    }
}

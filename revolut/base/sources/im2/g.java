package im2;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i8c.c f162287w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i8c.c cVar, Continuation continuation) {
        super(continuation);
        this.f162287w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f162287w.emit(null, this);
    }
}

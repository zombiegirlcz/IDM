package hui;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class z extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f155703w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(d dVar, Continuation continuation) {
        super(continuation);
        this.f155703w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f155703w.emit(null, this);
    }
}

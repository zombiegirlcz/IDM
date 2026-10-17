package mjf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class z extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ mhd.f f206041w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(mhd.f fVar, Continuation continuation) {
        super(continuation);
        this.f206041w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f206041w.emit(null, this);
    }
}

package mkk;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class p extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ mhd.f f206496w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(mhd.f fVar, Continuation continuation) {
        super(continuation);
        this.f206496w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f206496w.emit(null, this);
    }
}

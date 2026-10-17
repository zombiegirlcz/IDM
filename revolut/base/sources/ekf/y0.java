package ekf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class y0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ egh.e f127143w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(egh.e eVar, Continuation continuation) {
        super(continuation);
        this.f127143w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f127143w.emit(null, this);
    }
}

package tp4;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class q extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ tnb.j f273285w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(tnb.j jVar, Continuation continuation) {
        super(continuation);
        this.f273285w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f273285w.emit(null, this);
    }
}

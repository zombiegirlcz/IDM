package zq5;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ zj6.d f324366w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(zj6.d dVar, Continuation continuation) {
        super(continuation);
        this.f324366w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f324366w.emit(null, this);
    }
}

package j3i;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class q extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ahd.b f171211w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ahd.b bVar, Continuation continuation) {
        super(continuation);
        this.f171211w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f171211w.emit(null, this);
    }
}

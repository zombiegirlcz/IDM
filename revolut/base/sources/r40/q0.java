package r40;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes19.dex */
public final class q0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ qph.g f251361w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(qph.g gVar, Continuation continuation) {
        super(continuation);
        this.f251361w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f251361w.emit(null, this);
    }
}

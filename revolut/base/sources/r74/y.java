package r74;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class y extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ qph.g f252017w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(qph.g gVar, Continuation continuation) {
        super(continuation);
        this.f252017w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f252017w.emit(null, this);
    }
}

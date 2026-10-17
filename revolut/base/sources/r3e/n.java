package r3e;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ qph.g f251289w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(qph.g gVar, Continuation continuation) {
        super(continuation);
        this.f251289w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f251289w.emit(null, this);
    }
}

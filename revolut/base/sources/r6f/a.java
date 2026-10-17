package r6f;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ qph.g f251827w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(qph.g gVar, Continuation continuation) {
        super(continuation);
        this.f251827w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f251827w.emit(null, this);
    }
}

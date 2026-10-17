package qph;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ qb3.p f248400w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(qb3.p pVar, Continuation continuation) {
        super(continuation);
        this.f248400w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f248400w.emit(null, this);
    }
}

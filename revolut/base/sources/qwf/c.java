package qwf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ qph.g f249914w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(qph.g gVar, Continuation continuation) {
        super(continuation);
        this.f249914w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f249914w.emit(null, this);
    }
}

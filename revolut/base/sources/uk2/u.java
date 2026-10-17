package uk2;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class u extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u97.e f280663w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(u97.e eVar, Continuation continuation) {
        super(continuation);
        this.f280663w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f280663w.emit(null, this);
    }
}

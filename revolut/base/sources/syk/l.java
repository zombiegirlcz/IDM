package syk;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ spb.f f266691w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(spb.f fVar, Continuation continuation) {
        super(continuation);
        this.f266691w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f266691w.emit(null, this);
    }
}

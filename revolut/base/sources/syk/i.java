package syk;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ spb.f f266689w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(spb.f fVar, Continuation continuation) {
        super(continuation);
        this.f266689w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f266689w.emit(null, this);
    }
}

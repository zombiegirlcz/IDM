package lh9;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l5d.d f195189w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(l5d.d dVar, Continuation continuation) {
        super(continuation);
        this.f195189w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f195189w.emit(null, this);
    }
}

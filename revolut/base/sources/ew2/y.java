package ew2;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class y extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ esj.e f130068w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(esj.e eVar, Continuation continuation) {
        super(continuation);
        this.f130068w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f130068w.emit(null, this);
    }
}

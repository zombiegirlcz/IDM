package kmc;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ klj.e f185773w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(klj.e eVar, Continuation continuation) {
        super(continuation);
        this.f185773w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f185773w.emit(null, this);
    }
}

package lrk;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class q extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ lkf.q f199548w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(lkf.q qVar, Continuation continuation) {
        super(continuation);
        this.f199548w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f199548w.emit(null, this);
    }
}

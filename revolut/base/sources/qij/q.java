package qij;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class q extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ qb3.p f246743w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(qb3.p pVar, Continuation continuation) {
        super(continuation);
        this.f246743w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f246743w.emit(null, this);
    }
}

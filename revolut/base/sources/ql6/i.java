package ql6;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ qb3.p f247208w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(qb3.p pVar, Continuation continuation) {
        super(continuation);
        this.f247208w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f247208w.emit(null, this);
    }
}

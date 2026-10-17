package qp5;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ qb3.p f248280w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(qb3.p pVar, Continuation continuation) {
        super(continuation);
        this.f248280w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f248280w.emit(null, this);
    }
}

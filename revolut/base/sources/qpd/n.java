package qpd;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ qb3.p f248363w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(qb3.p pVar, Continuation continuation) {
        super(continuation);
        this.f248363w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f248363w.emit(null, this);
    }
}

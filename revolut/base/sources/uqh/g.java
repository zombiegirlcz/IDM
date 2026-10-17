package uqh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ uh7.q f282147w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(uh7.q qVar, Continuation continuation) {
        super(continuation);
        this.f282147w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f282147w.emit(null, this);
    }
}

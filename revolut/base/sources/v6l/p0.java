package v6l;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class p0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v6e.p f286489w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(v6e.p pVar, Continuation continuation) {
        super(continuation);
        this.f286489w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f286489w.emit(null, this);
    }
}

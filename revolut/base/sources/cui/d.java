package cui;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ cq6.i f109004w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(cq6.i iVar, Continuation continuation) {
        super(continuation);
        this.f109004w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f109004w.emit(null, this);
    }
}

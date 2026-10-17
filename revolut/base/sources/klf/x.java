package klf;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class x extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ cxe.t f185600w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(cxe.t tVar, Continuation continuation) {
        super(continuation);
        this.f185600w = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f185600w.emit(null, this);
    }
}

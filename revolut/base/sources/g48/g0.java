package g48;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ cxe.t f140370w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(cxe.t tVar, Continuation continuation) {
        super(continuation);
        this.f140370w = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f140370w.emit(null, this);
    }
}

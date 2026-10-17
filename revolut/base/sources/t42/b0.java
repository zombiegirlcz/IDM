package t42;

/* JADX INFO: loaded from: classes20.dex */
public final class b0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f267842w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f267842w |= Integer.MIN_VALUE;
        return this.v.M2(null, this);
    }
}

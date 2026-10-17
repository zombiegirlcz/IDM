package zbk;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f320962w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.d dVar, gim.c cVar) {
        super(cVar);
        this.v = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f320962w |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.d.I2(this.v, null, this);
    }
}

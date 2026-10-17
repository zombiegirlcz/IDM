package ack;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3172w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f3172w |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender.b.I2(this.v, this);
    }
}

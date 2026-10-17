package njj;

/* JADX INFO: loaded from: classes11.dex */
public final class a1 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f216540w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f216540w |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.a.I2(this.v, this);
    }
}

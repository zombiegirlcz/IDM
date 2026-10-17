package dmj;

/* JADX INFO: loaded from: classes11.dex */
public final class u0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f116184w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f116184w |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c.I2(this.v, this);
    }
}

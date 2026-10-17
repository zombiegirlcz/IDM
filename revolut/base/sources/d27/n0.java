package d27;

import com.revolut.feature.shared.order_initiation.api.domain.OrderInitiationPage;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends gim.c {
    public OrderInitiationPage u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a f110758w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f110759x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a aVar, gim.c cVar) {
        super(cVar);
        this.f110758w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f110759x |= Integer.MIN_VALUE;
        return com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a.J2(this.f110758w, null, this);
    }
}

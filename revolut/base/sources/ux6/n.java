package ux6;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f283887w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f283887w |= Integer.MIN_VALUE;
        return com.revolut.feature.freelancer.impl.ui.invoice.screen.customer_list.a.I2(this.v, null, this);
    }
}

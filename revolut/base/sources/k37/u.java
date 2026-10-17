package k37;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f180647w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f180647w |= Integer.MIN_VALUE;
        return com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment.b.I2(this.v, null, this);
    }
}

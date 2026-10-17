package c37;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.flow.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f20918w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.flow.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f20918w |= Integer.MIN_VALUE;
        return com.revolut.feature.freelancer.impl.ui.tax_hub.assessment.flow.b.I2(this.v, this);
    }
}

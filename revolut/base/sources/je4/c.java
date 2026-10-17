package je4;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f173209w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow.d dVar, gim.c cVar) {
        super(cVar);
        this.v = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f173209w |= Integer.MIN_VALUE;
        return this.v.S2(this);
    }
}

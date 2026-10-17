package qwi;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f249960w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e eVar, gim.c cVar) {
        super(cVar);
        this.v = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f249960w |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e.L2(this.v, this);
    }
}

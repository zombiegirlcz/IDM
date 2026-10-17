package qwi;

import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.c {
    public Set u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e f249956w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f249957x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e eVar, gim.c cVar) {
        super(cVar);
        this.f249956w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f249957x |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e.J2(this.f249956w, this);
    }
}

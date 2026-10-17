package je4;

import xy3.s;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.c {
    public s u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow.d f173210w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f173211x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow.d dVar, gim.c cVar) {
        super(cVar);
        this.f173210w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f173211x |= Integer.MIN_VALUE;
        return com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow.d.P2(this.f173210w, null, null, this);
    }
}

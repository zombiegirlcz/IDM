package jcc;

import com.revolut.feature.revolutpay.promoted_merchants.api.navigation.PromotedMerchantsDestination;
import eub.i;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f172761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f172762b;

    public b(e eVar, c cVar) {
        this.f172761a = eVar;
        this.f172762b = cVar;
    }

    @Override // phm.a
    public final Object get() {
        PromotedMerchantsDestination.InputData inputData = this.f172762b.f172763a;
        i iVarE = this.f172761a.f172772h.e();
        s.j(iVarE);
        return new com.revolut.feature.revolutpay.promoted_merchants.impl.ui.flow.promotedmerchants.b(inputData, iVarE);
    }
}

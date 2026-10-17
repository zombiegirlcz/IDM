package hdg;

import cli.g;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.price_breakdown.partner_taxes_disclaimer.TravelHotelsPartnerTaxesDisclaimerScreenContract$InputData;
import hba.k;
import i9g.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends h implements c {
    public final TravelHotelsPartnerTaxesDisclaimerScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f151430p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final cli.y f151431q;

    public d(e stateMapper, TravelHotelsPartnerTaxesDisclaimerScreenContract$InputData inputData, y travelHotelsInventoryProviderInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(travelHotelsInventoryProviderInteractor, "travelHotelsInventoryProviderInteractor");
        this.o = inputData;
        this.f151430p = travelHotelsInventoryProviderInteractor;
        this.f151431q = mra.d.b(this, new b(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, rd0.e.b(this.f151430p.a(this.o.f93973a)), null, null, new k(this, (Continuation) null, 5), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f151431q;
    }
}

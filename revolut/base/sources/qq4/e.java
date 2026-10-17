package qq4;

import al4.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.credit_cards.CreditCardsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nyb.j;
import oki.h;
import om4.x2;
import qp7.g;
import qpb.i;
import yji.l;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends h implements dli.b {
    public final CreditCardsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f248486p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mt8.d f248487q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final an4.e f248488r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final lal.a f248489s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j f248490t;
    public final y u;

    public e(CreditCardsScreenContract$InputData inputData, n creditCardInteractor, mt8.d kycInteractor, an4.e navigationFactory, lal.a creditCardInfoSectionsInteractor, j revPointsEarningRatesInteractor, f stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(navigationFactory, "navigationFactory");
        Intrinsics.checkNotNullParameter(creditCardInfoSectionsInteractor, "creditCardInfoSectionsInteractor");
        Intrinsics.checkNotNullParameter(revPointsEarningRatesInteractor, "revPointsEarningRatesInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f248486p = creditCardInteractor;
        this.f248487q = kycInteractor;
        this.f248488r = navigationFactory;
        this.f248489s = creditCardInfoSectionsInteractor;
        this.f248490t = revPointsEarningRatesInteractor;
        this.u = mra.d.b(this, new c(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        CreditCardsScreenContract$InputData creditCardsScreenContract$InputData = this.o;
        akg.n nVarH = ((x2) this.f248486p).h(creditCardsScreenContract$InputData.f69171a, w4l.h.f294642c);
        Flow flowA = this.f248489s.A(creditCardsScreenContract$InputData.f69171a);
        wkm.d dVarE = ((qt8.d) this.f248487q).e(false);
        l.a1(this, rd0.e.n(nim.a.v(nim.a.u(new qkg.a(2, 1, null), u0.m(u0.i(nVarH, flowA, dVarE), nim.a.A(nim.a.v(rd0.e.b(j.a(this.f248490t)), new i(13)), new i(14)))), new i(12)), h0.f322473a), null, null, new g(this, null, 3), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}

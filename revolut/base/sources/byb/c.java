package byb;

import al4.q;
import bs9.i0;
import com.revolut.core.model.account.AccountId;
import efm.r;
import ffk.t;
import jxb.l;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import nya.b0;
import nyb.j;
import rd0.e;
import te0.w;
import w4l.i;
import yji.n;
import z6l.s;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends n implements ztb.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j f19794l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f19795m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final wsg.n f19796n;
    public final s o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f19797p;

    public c(j revPointsEarningRatesInteractor, t pricingPlanInteractor, q creditCardProductInteractor, wsg.n walletInteractor, s revolutCardsInteractor, b earningRatesAggregateMapper) {
        Intrinsics.checkNotNullParameter(revPointsEarningRatesInteractor, "revPointsEarningRatesInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(earningRatesAggregateMapper, "earningRatesAggregateMapper");
        this.f19794l = revPointsEarningRatesInteractor;
        this.f19795m = pricingPlanInteractor;
        this.f19796n = walletInteractor;
        this.o = revolutCardsInteractor;
        this.f19797p = earningRatesAggregateMapper;
    }

    public final r Z2() {
        j jVar = this.f19794l;
        r rVarW = nim.a.w(((l) jVar.f220800a).f179127g.e(Unit.f186387a, i.f294643c), new b0(jVar, 2));
        t tVar = this.f19795m;
        r map = w.o(rVarW, tVar.q(), tVar.x(), this.f19796n.K(AccountId.Personal.f51414a), e.c(i6l.a.a(this.o, null, 7), g.f186406a)).map(new i0(18, new bq7.j(this, 27)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}

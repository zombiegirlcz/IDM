package ved;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alert_details.SharedAlertDetailsScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem;
import java.math.BigDecimal;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.g1;
import vkm.j2;
import vkm.q;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.u;
import zhm.v;
import zhm.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends jki.g implements jki.h {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final efd.a f288280p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SharedAlertDetailsScreenContract$InputData f288281q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final sfd.b f288282r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n3d.c f288283s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g1 f288284t;
    public final ped.a u;
    public final j2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j2 f288285w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final j2 f288286x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final j2 f288287y;
    public final TextLocalisedClause z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(jki.p stateMapper, efd.a alertsInteractor, SharedAlertDetailsScreenContract$InputData inputData, sfd.b currencyChartBuilder, n3d.c watchlistFooterDelegate, g1 shotDialogDisplayer, ped.a alertsDialogFactory) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(alertsInteractor, "alertsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(currencyChartBuilder, "currencyChartBuilder");
        Intrinsics.checkNotNullParameter(watchlistFooterDelegate, "watchlistFooterDelegate");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(alertsDialogFactory, "alertsDialogFactory");
        this.f288280p = alertsInteractor;
        this.f288281q = inputData;
        this.f288282r = currencyChartBuilder;
        this.f288283s = watchlistFooterDelegate;
        this.f288284t = shotDialogDisplayer;
        this.u = alertsDialogFactory;
        this.v = q.c(new ngd.c(ngd.b.LINE, (ngd.a) d0.b0(((l2d.n) alertsInteractor).a(r2().f288267a.getF86877b().d))));
        od0.i.Companion.getClass();
        od0.i iVar = od0.i.f224256b;
        this.f288285w = q.c(iVar);
        this.f288286x = q.c(iVar);
        this.f288287y = q.c(new Object());
        this.z = new TextLocalisedClause(R$string.shared_alerts_alert_details_disclaimer, null, null, 14);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, this.v, null, new uwe.f(this, continuation, 27), 3);
        AlertItem alertItem = this.f288281q.f86714a;
        yji.l.b1(this, ta6.a.h(q.Q(this.f288287y, new sdi.a(continuation, this, alertItem, 19)), this.f288285w, this.f288286x, k.f288274a), null, new l(this, alertItem, (Continuation) null), 3);
        yji.l.b1(this, ((l2d.n) this.f288280p).e(q0.c(new Pair(alertItem.getF86877b().d, u.c(ngm.n.t(alertItem)))), true), null, new l(alertItem, this, (Continuation) null), 3);
        yji.l.b1(this, this.f288283s.b(y0.b(((g) t2()).f288267a.getF86877b().d)), null, new v44.e(this, continuation, 29), 3);
    }

    @Override // jki.g
    /* JADX INFO: renamed from: y2, reason: merged with bridge method [inline-methods] */
    public final g r2() {
        AlertItem alertItem = this.f288281q.f86714a;
        tfd.b.Companion.getClass();
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        xi0.b.Companion.getClass();
        xi0.b bVar = xi0.b.i;
        dj0.d dVar = new dj0.d(0L, bVar);
        ngd.b bVar2 = ngd.b.LINE;
        ngd.a aVar = ngd.a.ONE_DAY;
        f0 f0Var = f0.f322471a;
        return new g(alertItem, new tfd.b(ZERO, null, true, bVar, 0.0d, dVar, null, bVar2, aVar, f0Var, v.k(aVar, ngd.a.ONE_WEEK, ngd.a.ONE_MONTH, ngd.a.THREE_MONTHS, ngd.a.SIX_MONTHS, ngd.a.ONE_YEAR), false, true, null, this.z), f0Var, true);
    }
}

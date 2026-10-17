package i0e;

import ahe.y0;
import com.revolut.core.ui_kit.delegates.g5;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.statements.R$string;
import com.revolut.feature.statements.api.models.StatementPeriod;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.q0;
import vkm.v1;
import vkm.z1;

/* JADX INFO: loaded from: classes7.dex */
public final class q extends yji.n implements g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c f157380l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final zxd.c f157381m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h f157382n;
    public final j60.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j2 f157383p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j2 f157384q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ConcurrentHashMap f157385r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z1 f157386s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j2 f157387t;

    public q(c mapper, zxd.c statementsInteractor, h statementSelectorPeriodCalculator, j60.a bottomExpandableExtension) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(statementSelectorPeriodCalculator, "statementSelectorPeriodCalculator");
        Intrinsics.checkNotNullParameter(bottomExpandableExtension, "bottomExpandableExtension");
        this.f157380l = mapper;
        this.f157381m = statementsInteractor;
        this.f157382n = statementSelectorPeriodCalculator;
        this.o = bottomExpandableExtension;
        this.f157383p = vkm.q.c(null);
        this.f157384q = vkm.q.c(null);
        this.f157385r = new ConcurrentHashMap();
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f157386s = z1VarB;
        this.f157387t = vkm.q.c(new n(null, null));
    }

    public static String Z2(String str, Collection collection) throws IOException {
        String strConcat;
        String strK0 = zhm.d0.k0(zhm.d0.O0(collection), null, null, null, 0, null, 63);
        if (str == null || (strConcat = "_".concat(str)) == null) {
            strConcat = "";
        }
        return a0.d.r(strK0, strConcat);
    }

    @Override // yji.n
    public final void E2() {
        this.f157385r.clear();
    }

    public final void b3(a0 period, boolean z) {
        StatementPeriod statementPeriod = period.f157353a;
        StatementPeriod statementPeriod2 = period.f157354b;
        ((r) this.f157380l).getClass();
        Intrinsics.checkNotNullParameter(period, "period");
        LocalDate start = z ? statementPeriod2.getStart() : statementPeriod2.getEnd();
        LocalDate start2 = z ? statementPeriod.getStart() : statementPeriod2.getStart();
        LocalDate end2 = z ? statementPeriod2.getEnd() : statementPeriod.getEnd();
        TextLocalisedClause textLocalisedClause = z ? new TextLocalisedClause(R$string.statement_period_from, null, null, 14) : new TextLocalisedClause(R$string.statement_period_to, null, null, 14);
        String str = z ? "CUSTOM_DATE_SELECTOR_FROM_LIST_ID" : "CUSTOM_DATE_SELECTOR_TO_LIST_ID";
        rp0.t tVar = new rp0.t(textLocalisedClause, null, null, 30);
        List listC = zhm.u.c(new g5(str, start, start, true, null, start2, end2, null, null, null, 0, 0, 1048368));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        this.o.x(new rp0.y(listC, tVar, rp0.l.WINDOW, null, null, null, 1016));
    }

    public final ghk.a0 c3(Set productTypes, io3.h availablePeriodType, Set filteringItemIds, String str) {
        Intrinsics.checkNotNullParameter(productTypes, "productTypes");
        Intrinsics.checkNotNullParameter(availablePeriodType, "availablePeriodType");
        Intrinsics.checkNotNullParameter(filteringItemIds, "filteringItemIds");
        return d3(nim.a.v(new v1(new g0a.e(28, this, productTypes, str, (Continuation) null)), new a83.d0(27, productTypes)), availablePeriodType, filteringItemIds);
    }

    public final ghk.a0 d3(akg.n nVar, io3.h hVar, Set set) {
        y0 y0Var = new y0(10, this, nVar, set, hVar, (Continuation) null);
        return new ghk.a0(new q0(vkm.q.Q(this.f157386s, y0Var), new hp2.d(this, null, 29), 1), this.f157380l, 25);
    }
}

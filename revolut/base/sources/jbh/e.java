package jbh;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.math.BigDecimal;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l9.l;
import nel.n;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements j1h.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nbh.f f172635a;

    public e(adh.a assetPerformanceCalculator, nbh.f instrumentRowProvider, c performanceAssetImageMapper) {
        opk.a ratesExtensions = opk.a.f227688a;
        Intrinsics.checkNotNullParameter(ratesExtensions, "ratesExtensions");
        Intrinsics.checkNotNullParameter(assetPerformanceCalculator, "assetPerformanceCalculator");
        Intrinsics.checkNotNullParameter(instrumentRowProvider, "instrumentRowProvider");
        Intrinsics.checkNotNullParameter(performanceAssetImageMapper, "performanceAssetImageMapper");
        this.f172635a = instrumentRowProvider;
    }

    public static String c(vel.f fVar) {
        return j6.a.q("PERFORMANCE_ASSET_DELEGATE_ID_", fVar instanceof vel.b ? fVar.a() : fVar.c());
    }

    public static CompositeClause g(BigDecimal bigDecimal, vel.f fVar) {
        return fVar.d() ? xqi.a.b(bigDecimal, false, 7) : l.N(bigDecimal);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea  */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [com.revolut.core.ui_kit.delegates.RowDelegate$Model$c] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r18v0, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r20v1, types: [com.revolut.core.ui_kit.models.Clause] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.delegates.RowDelegate.Model d(vel.f r30, java.lang.Object r31, com.revolut.analytics.tracking.v3.AnalyticsContext r32) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jbh.e.d(vel.f, java.lang.Object, com.revolut.analytics.tracking.v3.AnalyticsContext):com.revolut.core.ui_kit.delegates.RowDelegate$Model");
    }

    public final Clause e(vel.f fVar) {
        if (!(fVar instanceof vel.c) && !(fVar instanceof vel.b)) {
            if (!(fVar instanceof vel.e)) {
                if (fVar instanceof vel.d) {
                    return fVar.d() ? new CurrencyClause(((vel.d) fVar).f288352a, CurrencyClause.Format.Ticker.f57756a, null, 4) : new TextClause(fVar.c(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                }
                throw new NoWhenBranchMatchedException();
            }
            vel.e eVar = (vel.e) fVar;
            n nVar = eVar.f288355a.f214560a;
            switch (d.f172634a[nVar.f214597c.ordinal()]) {
                case 1:
                    return this.f172635a.f(nVar);
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 13:
                case 14:
                case 15:
                    return new TextClause(eVar.c(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                case 11:
                case 12:
                    return new TextClause(nVar.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return new TextClause(fVar.c(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public final Clause f(vel.f fVar) {
        if (fVar instanceof vel.d) {
            return new CurrencyClause(((vel.d) fVar).f288352a, CurrencyClause.Format.DisplayName.f57755a, null, 4);
        }
        if (fVar instanceof vel.e) {
            return this.f172635a.f(((vel.e) fVar).f288355a.f214560a);
        }
        if (fVar instanceof vel.c) {
            return new TextClause(fVar.c(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (!(fVar instanceof vel.b)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = R$string.invest_markets_currency_pair_title;
        vel.a aVar = ((vel.b) fVar).f288347a;
        xi0.b bVar = aVar.f288344a;
        CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
        return new TextLocalisedClause(i, v.k(new CurrencyClause(bVar, ticker, null, 4), new CurrencyClause(aVar.f288345b, ticker, null, 4)), null, 12);
    }
}

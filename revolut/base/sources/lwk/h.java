package lwk;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements iwk.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zvk.d f200470a;

    public h(zvk.d assetStatsUIMapper) {
        Intrinsics.checkNotNullParameter(assetStatsUIMapper, "assetStatsUIMapper");
        this.f200470a = assetStatsUIMapper;
    }

    @Override // iwk.g
    public final List c(afl.q stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        afl.p pVar = stats.f4631h;
        if (pVar == null || pVar.f4624a == null) {
            return zhm.f0.f322471a;
        }
        AssetStatsId.Etf etf2 = AssetStatsId.Etf.RISK_RATING_SRI;
        Clause clauseD = this.f200470a.d(stats, etf2);
        List listL = zhm.v.l(clauseD != null ? new CellDetailsDelegate.Model("STATS_RISK_RATING_EEA", new TextLocalisedClause(zvk.d.b(etf2), null, null, 14), clauseD, null, zvk.d.c(etf2), true, 0, null, etf2, null, null, 0, null, false, null, 0, 0, 0, 0, 1048008) : null);
        iwk.g.d(listL);
        return listL;
    }
}

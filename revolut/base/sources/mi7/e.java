package mi7;

import aw0.p9;
import aw0.wa;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.wealth.resources.R$string;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qi7.g;
import qi7.h;
import vel.f;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jbh.e f205620a;

    public e(jbh.e performanceAssetsMapper, b riskMapper, c returnClauseMapper) {
        Intrinsics.checkNotNullParameter(performanceAssetsMapper, "performanceAssetsMapper");
        Intrinsics.checkNotNullParameter(riskMapper, "riskMapper");
        Intrinsics.checkNotNullParameter(returnClauseMapper, "returnClauseMapper");
        this.f205620a = performanceAssetsMapper;
    }

    public final RowDelegate.Model a(h collectionInstrument, oh7.a viewType) {
        Intrinsics.checkNotNullParameter(collectionInstrument, "collectionInstrument");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        g gVar = collectionInstrument.f246672b;
        f fVar = collectionInstrument.f246671a;
        qi7.f fVar2 = gVar instanceof qi7.f ? (qi7.f) gVar : null;
        if (fVar2 == null) {
            return null;
        }
        BigDecimal totalShareholderReturn = fVar2.f246668a;
        int i = d.f205619a[viewType.ordinal()];
        jbh.e eVar = this.f205620a;
        if (i != 1) {
            if (i == 2) {
                return RowDelegate.Model.x(j1h.b.a(eVar, fVar, new oh7.b(collectionInstrument), 4), null, null, null, c.a(totalShareholderReturn), null, 0, null, false, null, null, 0, 0, 0, 0, null, -33, 15);
            }
            throw new NoWhenBranchMatchedException();
        }
        RowDelegate.Model modelA = j1h.b.a(eVar, fVar, new oh7.b(collectionInstrument), 4);
        BigDecimal volatility = fVar2.f246670c;
        Intrinsics.checkNotNullParameter(volatility, "volatility");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(volatility.compareTo(new BigDecimal("0.2")) < 0 ? R$string.invest_recommended_buys_risk_filter_low : volatility.compareTo(new BigDecimal("0.4")) < 0 ? R$string.invest_recommended_buys_risk_filter_medium : R$string.invest_recommended_buys_risk_filter_high, null, null, 14);
        Intrinsics.checkNotNullParameter(totalShareholderReturn, "totalShareholderReturn");
        BigDecimal bigDecimalMultiply = totalShareholderReturn.multiply(new BigDecimal("100"));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        PercentageClause.Format.Custom custom = new PercentageClause.Format.Custom(2, p9.ALWAYS, wa.SHOW_ALL_ZEROES, RoundingMode.HALF_DOWN);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        return RowDelegate.Model.x(modelA, null, null, null, textLocalisedClause, null, 0, new RowDelegate.Model.c.b(new PercentageClause(bigDecimalMultiply, custom, new Custom(Integer.valueOf(totalShareholderReturn.compareTo(bigDecimal) < 0 ? R$attr.uikit_colorPerformanceNegative : totalShareholderReturn.compareTo(bigDecimal) > 0 ? R$attr.uikit_colorPerformancePositive : R$attr.uikit_colorPerformanceStatic), false, null, false, null, 254)), new TextLocalisedClause(R$string.invest_recommended_buys_exp_return, null, null, 14), null, false, 124), false, null, null, 0, 0, 0, 0, null, -1057, 15);
    }
}

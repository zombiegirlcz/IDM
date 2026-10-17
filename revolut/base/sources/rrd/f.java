package rrd;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.api.custom_assets.models.CustomAsset;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class f {
    public static CompositeClause a(CustomAsset asset) {
        dj0.d dVar;
        Pair pair;
        Intrinsics.checkNotNullParameter(asset, "asset");
        Object obj2 = asset.i.get("purchaseAmount");
        dj0.d dVar2 = obj2 instanceof dj0.d ? (dj0.d) obj2 : null;
        if (dVar2 != null) {
            long j2 = dVar2.f115082a;
            if (j2 != 0 && (dVar = asset.f99218c) != null) {
                long j3 = dVar.f115082a - j2;
                BigDecimal bigDecimalDivide = new BigDecimal(j3).multiply(new BigDecimal(100)).divide(new BigDecimal(j2), 2, RoundingMode.HALF_UP);
                if (j3 > 0) {
                    pair = new Pair(Integer.valueOf(R$drawable.uikit_icn_10_stocks_arrow_up), Integer.valueOf(R$attr.uikit_colorPerformancePositive));
                } else if (j3 < 0) {
                    pair = new Pair(Integer.valueOf(R$drawable.uikit_icn_10_stocks_arrow_down), Integer.valueOf(R$attr.uikit_colorPerformanceNegative));
                }
                int iIntValue = ((Number) pair.f186385a).intValue();
                int iIntValue2 = ((Number) pair.f186386b).intValue();
                BigDecimal bigDecimalAbs = bigDecimalDivide.abs();
                List listK = v.k(new ImageClause(iIntValue, new ImageClauseTint.Color(iIntValue2), (Float) null, (Float) null, 28), new PercentageClause(bigDecimalAbs, bigDecimalAbs.compareTo(BigDecimal.ONE) < 0 ? new PercentageClause.Format.Custom(2, 14, null, null, null) : new PercentageClause.Format.Custom(0, 14, null, null, null), new Custom(new Custom.Color.Solid(iIntValue2), false, false, 254)));
                m70.a.t(t0.f186434a);
                return new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            }
        }
        return null;
    }
}

package hs6;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import f01.c;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rr6.g;
import rr6.i;
import zhm.r0;
import zhm.u;
import zhm.v;
import zr6.d;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f155003a;

    public b(c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f155003a = uiKitResources;
    }

    public final String a(Clause clause) {
        return this.f155003a.b(clause).toString();
    }

    public final LinkedHashMap b(BigDecimal bigDecimal, BigDecimal bigDecimal2, g gVar) {
        Double d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (bigDecimal != null) {
            linkedHashMap.put("CBrate", a(new PercentageClause(bigDecimal, (PercentageClause.Format) null, (Style) null, 6)));
        }
        if (bigDecimal2 != null) {
            linkedHashMap.put("fixedplancashback", a(new PercentageClause(bigDecimal2, (PercentageClause.Format) null, (Style) null, 6)));
        }
        if (gVar != null) {
            rr6.a aVar = gVar.f256707b;
            if (bigDecimal2 != null && (d = gVar.f256708c) != null) {
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d.doubleValue());
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                BigDecimal bigDecimalAdd = bigDecimal2.add(bigDecimalValueOf);
                Intrinsics.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
                linkedHashMap.put("boostedplancashback", a(new PercentageClause(bigDecimalAdd, (PercentageClause.Format) null, (Style) null, 6)));
            }
            linkedHashMap.put("maximum_boost", a(new MoneyClause(aVar.f256697b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)));
            for (i iVar : aVar.f256696a) {
                linkedHashMap.put(j6.a.l(iVar.f256711a, "tier_", "_amount"), a(new MoneyClause(iVar.f256713c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)));
                if (bigDecimal2 != null) {
                    String strL = j6.a.l(iVar.f256711a, "plan_tier_", "_rate_total");
                    BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(iVar.f256712b);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
                    BigDecimal bigDecimalAdd2 = bigDecimal2.add(bigDecimalValueOf2);
                    Intrinsics.checkNotNullExpressionValue(bigDecimalAdd2, "add(...)");
                    linkedHashMap.put(strL, a(new PercentageClause(bigDecimalAdd2, (PercentageClause.Format) null, (Style) null, 6)));
                }
            }
        }
        return linkedHashMap;
    }

    public final Map c(d fee2, g boosterInfo) {
        Intrinsics.checkNotNullParameter(fee2, "fee");
        Intrinsics.checkNotNullParameter(boosterInfo, "boosterInfo");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_processing_fees_fee_percentage_caption, u.c(new PercentageClause(fee2.f324609a, (PercentageClause.Format) null, (Custom) null, 6)), null, 12);
        dj0.d dVar = fee2.f324610b;
        MoneyClause moneyClause = dVar != null ? new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : null;
        if (moneyClause != null) {
            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_processing_fees_fee_percentage_and_absolute_caption, v.k(textLocalisedClause, moneyClause), null, 12);
        }
        Double d = boosterInfo.f256708c;
        return r0.k(new Pair("Pricing", a(textLocalisedClause)), new Pair("maximum_boost", a(d != null ? new PercentageClause(d.doubleValue(), (PercentageClause.Format) null, (Custom) null, 6) : new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126))));
    }
}

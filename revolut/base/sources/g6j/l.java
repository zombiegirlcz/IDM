package g6j;

import aw0.k7;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.wealth.resources.R$string;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DecimalFormat f140971a;

    public l() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00'%'");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        this.f140971a = decimalFormat;
    }

    public final CompositeClause a(j startPoint, j endPoint, boolean z, qta.f selectedChartPeriod) {
        j iVar;
        h hVar;
        dj0.d dVar;
        ImageClause imageClause;
        int i;
        Intrinsics.checkNotNullParameter(startPoint, "startPoint");
        Intrinsics.checkNotNullParameter(endPoint, "endPoint");
        Intrinsics.checkNotNullParameter(selectedChartPeriod, "selectedChartPeriod");
        if ((endPoint instanceof h) && (startPoint instanceof h)) {
            h hVar2 = (h) startPoint;
            iVar = new h(((h) endPoint).f140966a - hVar2.f140966a, hVar2.f140967b);
        } else {
            if (!(endPoint instanceof i) || !(startPoint instanceof i)) {
                throw new UnsupportedOperationException("");
            }
            i iVar2 = (i) startPoint;
            iVar = new i(((i) endPoint).f140968a - iVar2.f140968a, iVar2.f140969b);
        }
        boolean z3 = iVar instanceof h;
        if (z3 && (startPoint instanceof h)) {
            h hVar3 = (h) startPoint;
            hVar = new h((((double) 100) * ((h) iVar).f140966a) / hVar3.f140966a, hVar3.f140967b);
        } else {
            if (!(iVar instanceof i) || !(startPoint instanceof i)) {
                throw new UnsupportedOperationException("");
            }
            hVar = new h((((double) 100) * ((i) iVar).f140968a) / r0.f140968a, ((i) startPoint).f140969b);
        }
        if (z3) {
            h hVar4 = (h) iVar;
            dVar = mif.a.Q(new ej0.b(new BigDecimal(String.valueOf(hVar4.f140966a)), hVar4.f140967b));
        } else {
            if (!(iVar instanceof i)) {
                throw new NoWhenBranchMatchedException();
            }
            i iVar3 = (i) iVar;
            dVar = new dj0.d(iVar3.f140968a, iVar3.f140969b);
        }
        MoneyClause moneyClause = new MoneyClause(dVar, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), o9.NON_SENSITIVE);
        DecimalFormat decimalFormat = this.f140971a;
        double d = hVar.f140966a;
        String str = decimalFormat.format(Math.abs(d));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        byte b4 = a0.H(str, "0.00", false) ? (byte) 0 : d > 0.0d ? (byte) 1 : (byte) -1;
        int i2 = b4 == 0 ? R$attr.uikit_colorPerformanceStatic : b4 > 0 ? R$attr.uikit_colorPerformancePositive : R$attr.uikit_colorPerformanceNegative;
        TextClause textClause = new TextClause(str, (Style) null, Integer.valueOf(i2), false, (o9) null, (List) null, 122);
        if (b4 != 0) {
            imageClause = new ImageClause(b4 > 0 ? R$drawable.uikit_icn_10_stocks_arrow_up : R$drawable.uikit_icn_10_stocks_arrow_down, Integer.valueOf(i2), (Float) null, (Float) null, 28);
        } else {
            imageClause = null;
        }
        Clause[] elements = {imageClause, b4 != 0 ? new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, textClause};
        Intrinsics.checkNotNullParameter(elements, "elements");
        CompositeClause compositeClause = new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14);
        TextClause textClause2 = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClause3 = new TextClause(" · ", (Style) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), false, (o9) null, (List) null, 122);
        if (z) {
            textClause3 = null;
        }
        switch (k.f140970a[selectedChartPeriod.ordinal()]) {
            case 1:
                i = R$string.wealth_history_range_1d;
                break;
            case 2:
                i = R$string.wealth_history_range_1w;
                break;
            case 3:
                i = R$string.wealth_history_range_1m;
                break;
            case 4:
                i = R$string.wealth_history_range_6m;
                break;
            case 5:
                i = R$string.wealth_history_range_1y;
                break;
            case 6:
                i = R$string.wealth_history_range_5y;
                break;
            case 7:
                i = R$string.wealth_history_range_all;
                break;
            default:
                throw new UnsupportedOperationException("please add support for " + selectedChartPeriod);
        }
        Object[] elements2 = {moneyClause, textClause2, compositeClause, textClause3, z ? null : new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10)};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements2), null, null, null, 14);
    }
}

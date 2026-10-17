package ioc;

import aw0.o9;
import aw0.wa;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.retail.wealth.resources.R$string;
import hoc.f;
import hw0.x;
import hw0.z;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import ms0.v;
import org.jetbrains.annotations.NotNull;
import yoc.o;
import yoc.p;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f163217a;

    public b(goc.b selectedPointTimeClauseProvider, p timeSpanClauseProvider) {
        Intrinsics.checkNotNullParameter(selectedPointTimeClauseProvider, "selectedPointTimeClauseProvider");
        Intrinsics.checkNotNullParameter(timeSpanClauseProvider, "timeSpanClauseProvider");
        this.f163217a = timeSpanClauseProvider;
    }

    public static x b(hoc.b chart) {
        Intrinsics.checkNotNullParameter(chart, "chart");
        float fFloatValue = ((f) d0.b0(chart.a())).f154274a.f235229c.floatValue();
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        return new x(fFloatValue, BitmapDescriptorFactory.HUE_RED, new PercentageClause(ZERO, (PercentageClause.Format) null, (Style) null, 6), null, null, null, false, false, null, 2042);
    }

    public static CompositeClause c(f dataPoint) {
        Intrinsics.checkNotNullParameter(dataPoint, "dataPoint");
        TextClause textClause = new TextClause("+", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        if (dataPoint.f154274a.f235229c.signum() != 1) {
            textClause = null;
        }
        BigDecimal bigDecimal = dataPoint.f154274a.f235229c;
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(100);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(bigDecimalValueOf);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        Object[] elements = {textClause, new NumberClause(bigDecimalMultiply, new NumberClause.Format.FixedDigitsAfterDot(2, 10, null, wa.SHOW_ALL_ZEROES, null), null, null, 12), new TextClause("%", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14);
    }

    public static z d(hoc.b chart) {
        Intrinsics.checkNotNullParameter(chart, "chart");
        Iterator it8 = chart.a().iterator();
        if (!it8.hasNext()) {
            throw new NoSuchElementException();
        }
        BigDecimal bigDecimal = ((f) it8.next()).f154274a.f235229c;
        while (it8.hasNext()) {
            BigDecimal bigDecimal2 = ((f) it8.next()).f154274a.f235229c;
            if (bigDecimal.compareTo(bigDecimal2) < 0) {
                bigDecimal = bigDecimal2;
            }
        }
        Iterator it9 = chart.a().iterator();
        if (!it9.hasNext()) {
            throw new NoSuchElementException();
        }
        BigDecimal bigDecimal3 = ((f) it9.next()).f154274a.f235229c;
        while (it9.hasNext()) {
            BigDecimal bigDecimal4 = ((f) it9.next()).f154274a.f235229c;
            if (bigDecimal3.compareTo(bigDecimal4) > 0) {
                bigDecimal3 = bigDecimal4;
            }
        }
        BigDecimal bigDecimalMultiply = bigDecimal3.multiply(new BigDecimal(100));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        hw0.a aVar = new hw0.a(bigDecimal3.floatValue(), new PercentageClause(bigDecimalMultiply, (PercentageClause.Format) null, (Style) null, 6));
        BigDecimal bigDecimalMultiply2 = bigDecimal.multiply(new BigDecimal(100));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply2, "multiply(...)");
        return new z(v.WhiteTransparentBackground, false, true, zhm.v.k(aVar, new hw0.a(bigDecimal.floatValue(), new PercentageClause(bigDecimalMultiply2, (PercentageClause.Format) null, (Style) null, 6))));
    }

    public final Clause a(hoc.b chart, pdh.c timeSpan, f fVar) {
        int i;
        Intrinsics.checkNotNullParameter(chart, "chart");
        Intrinsics.checkNotNullParameter(timeSpan, "selectedTimeSpan");
        if (fVar != null) {
            return goc.b.a(timeSpan, fVar.b());
        }
        int i2 = R$string.wealth_robo_porfolio_performance_info_format;
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        switch (o.f315653a[timeSpan.ordinal()]) {
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
                throw new IllegalStateException("Can't convert " + this.f163217a + " to String Res");
        }
        return new TextLocalisedClause(i2, zhm.v.k(new TextLocalisedClause(i, null, null, 14), new TimeClause(chart.f154267a.f235232c.getMillis(), new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12)), null, 12);
    }
}

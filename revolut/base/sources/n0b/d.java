package n0b;

import cli.k;
import cli.n;
import cli.o;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.retail.advanced_charts.api.navigation.ChartStyleSelectorBottomSheetControllerProvider$InputData;
import com.revolut.feature.retail.advanced_charts.impl.R$string;
import d1b.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements n {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChartStyleSelectorBottomSheetControllerProvider$InputData f210976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f210977b;

    public d(ChartStyleSelectorBottomSheetControllerProvider$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f210976a = inputData;
        this.f210977b = j.b(new n08.b(5));
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        int i;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.trading_advanced_chart_style_title, null, null, 14), null, null, null, false, 30);
        List<e> list = (List) this.f210977b.getValue();
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (e eVar : list) {
            String str = "CHART_STYLE_ITEM_ID_" + eVar;
            Intrinsics.checkNotNullParameter(eVar, "<this>");
            switch (a1b.c.f581a[eVar.ordinal()]) {
                case 1:
                    i = R$string.trading_advanced_chart_style_content_bars;
                    break;
                case 2:
                    i = R$string.trading_advanced_chart_style_content_candles;
                    break;
                case 3:
                    i = R$string.trading_advanced_chart_style_content_line;
                    break;
                case 4:
                    i = R$string.trading_advanced_chart_style_content_area;
                    break;
                case 5:
                    i = R$string.trading_advanced_chart_style_content_renko;
                    break;
                case 6:
                    i = R$string.trading_advanced_chart_style_content_kagi;
                    break;
                case 7:
                    i = R$string.trading_advanced_chart_style_content_point_and_figure;
                    break;
                case 8:
                    i = R$string.trading_advanced_chart_style_content_line_break;
                    break;
                case 9:
                    i = R$string.trading_advanced_chart_style_content_heikin_ashi;
                    break;
                case 10:
                    i = R$string.trading_advanced_chart_style_content_hollow_candles;
                    break;
                case 11:
                    i = R$string.trading_advanced_chart_style_content_baseline;
                    break;
                case 12:
                    i = R$string.trading_advanced_chart_style_content_hi_lo;
                    break;
                case 13:
                    i = R$string.trading_advanced_chart_style_content_column;
                    break;
                case 14:
                    i = R$string.trading_advanced_chart_style_content_line_with_markers;
                    break;
                case 15:
                    i = R$string.trading_advanced_chart_style_content_stepline;
                    break;
                case 16:
                    i = R$string.trading_advanced_chart_style_content_hlc_area;
                    break;
                case 17:
                    i = R$string.trading_advanced_chart_style_content_vol_candle;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(new SingleChoiceDelegate.Model(str, new TextLocalisedClause(i, null, null, 14), eVar == this.f210976a.f82068a, null, eVar, YearClass.CLASS_2008));
        }
        yp0.b.k(arrayList, 0, R$attr.uikit_dp24, 0, 0, 29);
        return new cii.b(null, arrayList, aVar);
    }
}

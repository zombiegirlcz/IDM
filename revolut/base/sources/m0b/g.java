package m0b;

import c1b.h;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.retail.advanced_charts.api.navigation.ChartIntervalSelectorBottomSheetControllerProvider$InputData;
import com.revolut.feature.retail.advanced_charts.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements n {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChartIntervalSelectorBottomSheetControllerProvider$InputData f201135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f201136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f201137c;

    public g(ChartIntervalSelectorBottomSheetControllerProvider$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f201135a = inputData;
        this.f201136b = w.y0(new m05.d(6));
        this.f201137c = w.y0(new m05.d(7));
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.n
    public final o c(j jVar) {
        List list;
        int i;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.trading_advanced_chart_interval, null, null, 14), null, null, null, false, 30);
        ChartIntervalSelectorBottomSheetControllerProvider$InputData chartIntervalSelectorBottomSheetControllerProvider$InputData = this.f201135a;
        int i2 = f.f201134a[chartIntervalSelectorBottomSheetControllerProvider$InputData.f82067b.ordinal()];
        if (i2 == 1) {
            list = (List) this.f201136b.getValue();
        } else {
            if (i2 != 2 && i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            list = (List) this.f201137c.getValue();
        }
        List<h> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (h hVar : list2) {
            String str = "CHART_INTERVAL_SELECTABLE_ITEM_ID_" + hVar;
            Intrinsics.checkNotNullParameter(hVar, "<this>");
            switch (a1b.b.f580a[hVar.ordinal()]) {
                case 1:
                    i = R$string.trading_advanced_chart_interval_full_one_minute;
                    break;
                case 2:
                    i = R$string.trading_advanced_chart_interval_full_two_minutes;
                    break;
                case 3:
                    i = R$string.trading_advanced_chart_interval_full_five_minutes;
                    break;
                case 4:
                    i = R$string.trading_advanced_chart_interval_full_ten_minutes;
                    break;
                case 5:
                    i = R$string.trading_advanced_chart_interval_full_fifteen_minutes;
                    break;
                case 6:
                    i = R$string.trading_advanced_chart_interval_full_thirty_minutes;
                    break;
                case 7:
                    i = R$string.trading_advanced_chart_interval_full_one_hour;
                    break;
                case 8:
                    i = R$string.trading_advanced_chart_interval_full_four_hours;
                    break;
                case 9:
                    i = R$string.trading_advanced_chart_interval_full_twelve_hours;
                    break;
                case 10:
                    i = R$string.trading_advanced_chart_interval_full_one_day;
                    break;
                case 11:
                    i = R$string.trading_advanced_chart_interval_full_two_days;
                    break;
                case 12:
                    i = R$string.trading_advanced_chart_interval_full_four_days;
                    break;
                case 13:
                    i = R$string.trading_advanced_chart_interval_full_one_week;
                    break;
                case 14:
                    i = R$string.trading_advanced_chart_interval_full_five_weeks;
                    break;
                case 15:
                    i = R$string.trading_advanced_chart_interval_full_one_month;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(new SingleChoiceDelegate.Model(str, new TextLocalisedClause(i, null, null, 14), hVar == chartIntervalSelectorBottomSheetControllerProvider$InputData.f82066a, null, hVar, YearClass.CLASS_2008));
        }
        yp0.b.k(arrayList, 0, R$attr.uikit_dp24, 0, 0, 29);
        return new cii.b(null, arrayList, aVar);
    }
}

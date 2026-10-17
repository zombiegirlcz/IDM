package t87;

import aw0.bb;
import aw0.cb;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.jm0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e3h.f f268860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f268861b;

    public o(e3h.f chartMapper) {
        Intrinsics.checkNotNullParameter(chartMapper, "chartMapper");
        this.f268860a = chartMapper;
        this.f268861b = R$attr.uikit_dp0;
    }

    public final List a(eel.c selectedPeriod, List availableChartPeriods) {
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        Intrinsics.checkNotNullParameter(availableChartPeriods, "availableChartPeriods");
        cb.Companion.getClass();
        jm0 jm0Var = new jm0("TREND_VIEW_ID", bb.b(), null, false, null, null, 0, true, 230, null, false, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, -456);
        int i = R$attr.uikit_dp8;
        int i2 = this.f268861b;
        yp0.b.p(jm0Var, i, i, i2, i2);
        FixedTabsDelegate.Model modelB = ((i4h.d) this.f268860a).b(selectedPeriod, availableChartPeriods, Integer.valueOf(availableChartPeriods.indexOf(selectedPeriod)));
        int i3 = R$attr.uikit_dp0;
        yp0.b.r(modelB, i3, 0, i3, i3, 2);
        return v.k(jm0Var, modelB);
    }
}

package s0b;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.retail.advanced_charts.api.AdvancedChartsApi$Toggles;
import com.revolut.feature.retail.advanced_charts.api.navigation.AdvancedChartsConfig$Destination;
import com.revolut.feature.retail.advanced_charts.impl.bottom_sheet.add.ChartAddBottomSheetController;
import com.revolut.feature.retail.advanced_charts.impl.bottom_sheet.drawing_selector.ChartDrawingSelectorBottomSheetController;
import com.revolut.feature.retail.advanced_charts.impl.screen.advanced_charts.AdvancedChartsScreen;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a, nte.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof h0b.a) {
            return ((h0b.a) descriptor).a(new ChartAddBottomSheetController());
        }
        if (descriptor instanceof h0b.e) {
            return ((h0b.e) descriptor).a(new ChartDrawingSelectorBottomSheetController());
        }
        return null;
    }

    @Override // nte.a
    public final List e() {
        return AdvancedChartsApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof AdvancedChartsConfig$Destination.AdvancedCharts)) {
            return null;
        }
        AdvancedChartsConfig$Destination.AdvancedCharts advancedCharts = (AdvancedChartsConfig$Destination.AdvancedCharts) destination;
        return new AdvancedChartsScreen(new y0b.g(advancedCharts.getF82063a(), advancedCharts.getF82064b(), advancedCharts.getF82065c(), advancedCharts.getD(), advancedCharts.getE()));
    }
}

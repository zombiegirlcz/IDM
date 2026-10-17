package lnc;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.robo.impl.ui.screen.risk_metrics.RiskMetricsScreen;
import com.revolut.feature.robo.impl.ui.screen.risk_metrics_details.RiskMetricsDetailsScreen;
import com.revolut.feature.robo.impl.ui.screen.risk_metrics_details.RiskMetricsDetailsScreenContract$InputData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) obj2;
        d dVar = (d) this.receiver;
        KProperty[] kPropertyArr = RiskMetricsScreen.f85193a0;
        f fVar = (f) dVar;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj4 = model.f52715m;
        if (obj4 instanceof onc.a) {
            onc.c cVar = fVar.f197145r;
            onc.a parcel = (onc.a) obj4;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            knm.b.j(cVar.f226936a, new com.revolut.kompot.common.d(new RiskMetricsDetailsScreen(RiskMetricsDetailsScreenContract$InputData.Performance.f85197c), 6));
        } else if (obj4 instanceof pnc.a) {
            pnc.c cVar2 = fVar.f197146s;
            pnc.a parcel2 = (pnc.a) obj4;
            cVar2.getClass();
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            knm.b.j(cVar2.f237689a, new com.revolut.kompot.common.d(new RiskMetricsDetailsScreen(RiskMetricsDetailsScreenContract$InputData.Risk.f85198c), 6));
        }
        return Unit.f186387a;
    }
}

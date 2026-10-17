package wnc;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.robo.impl.ui.screen.risk_metrics.RiskMetricsScreen;
import com.revolut.feature.robo.impl.ui.screen.risk_metrics.RiskMetricsScreenContract$InputData;
import com.revolut.feature.robo.impl.ui.screen.templates.TemplatesScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) obj2;
        n nVar = (n) this.receiver;
        KProperty[] kPropertyArr = TemplatesScreen.g0;
        g0 g0Var = (g0) nVar;
        g0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj4 = model.f52715m;
        if (obj4 instanceof poc.c) {
            yji.l.g2(g0Var, new RiskMetricsScreen(new RiskMetricsScreenContract$InputData(((poc.c) obj4).f237959a)), null, null, 3);
        }
        return Unit.f186387a;
    }
}

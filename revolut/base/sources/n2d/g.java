package n2d;

import com.revolut.feature.separate_favourites.api.alerts.AddAlertFeatureConfig;
import com.revolut.feature.separate_favourites.api.alerts.AlertDetailsFeatureConfig;
import com.revolut.feature.separate_favourites.api.alerts.AlertsFeatureConfig;
import com.revolut.feature.separate_favourites.api.alerts.widget.AlertsWidgetContext;
import com.revolut.feature.shared_separate_favourites.api.alerts.navigation.AddSharedAlertsConfiguration;
import com.revolut.feature.shared_separate_favourites.api.alerts.navigation.SharedAlertsConfiguration;
import com.revolut.feature.shared_separate_favourites.domain.AssetIdWithSymbol;
import com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mll.c0;
import r2d.p;
import r2d.s;
import rp0.g1;
import vkm.v1;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends m1d.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p f211524l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final xoj.a f211525m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final s f211526n;
    public final efd.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g1 f211527p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f211528q;

    public g(p presentationModel, xoj.a featuresInteractor, s mapper, efd.a alertsInteractor, g1 shotDialogDisplayer, i removeAlertShotDialogConfigProvider) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(alertsInteractor, "alertsInteractor");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(removeAlertShotDialogConfigProvider, "removeAlertShotDialogConfigProvider");
        this.f211524l = presentationModel;
        this.f211525m = featuresInteractor;
        this.f211526n = mapper;
        this.o = alertsInteractor;
        this.f211527p = shotDialogDisplayer;
        this.f211528q = removeAlertShotDialogConfigProvider;
    }

    @Override // m1d.a
    public final v1 Z2(AlertsWidgetContext widgetContext) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        return new v1(new c0(this, widgetContext, (Continuation) null, 17));
    }

    @Override // m1d.a
    public final void b3(AlertsWidgetContext widgetContext) {
        xi0.b bVarA;
        FeatureConfig addAlertScreen;
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Set set = widgetContext.f86005a;
        AssetIdWithSymbol assetIdWithSymbol = widgetContext.d;
        if (set.size() > 1) {
            addAlertScreen = new AlertsFeatureConfig.AlertsScreen(new SharedAlertsConfiguration(widgetContext.f86005a, (Set) null, mgd.d.ACTIVE, new SharedAlertsConfiguration.Action.CreateAlert(assetIdWithSymbol), false, 50));
        } else {
            List listD1 = d0.d1(widgetContext.f86005a);
            String str = widgetContext.f86009h;
            if (str != null) {
                xi0.b.Companion.getClass();
                bVarA = xi0.a.a(str);
            } else {
                bVarA = null;
            }
            addAlertScreen = new AddAlertFeatureConfig.AddAlertScreen(new AddSharedAlertsConfiguration(listD1, bVarA, assetIdWithSymbol, false));
        }
        A2(new BridgeDestination(new FeatureCommand(addAlertScreen)));
    }

    @Override // m1d.a
    public final void c3(AlertItem alertItem) {
        Intrinsics.checkNotNullParameter(alertItem, "alertItem");
        A2(new BridgeDestination(new FeatureCommand(new AlertDetailsFeatureConfig.AlertDetailsScreen(alertItem))));
    }

    @Override // m1d.a
    public final void d3(AlertsWidgetContext widgetContext) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        V2(new mpd.p(this, widgetContext, null, 26), new yi5.b(29));
    }

    @Override // m1d.a
    public final void e3(AlertItem alertItem) {
        Intrinsics.checkNotNullParameter(alertItem, "alertItem");
        V2(new c0(this, alertItem, (Continuation) null, 18), new yi5.b(29));
    }

    @Override // m1d.a
    public final void f3(AlertsWidgetContext widgetContext) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        A2(new BridgeDestination(new FeatureCommand(new AlertsFeatureConfig.AlertsScreen(new SharedAlertsConfiguration(widgetContext.f86005a, widgetContext.f86006b, mgd.d.ACTIVE, (SharedAlertsConfiguration.Action.CreateAlert) null, widgetContext.f86007c, 40)))));
    }
}

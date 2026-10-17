package r2d;

import com.revolut.feature.separate_favourites.api.alerts.AddAlertFeatureConfig;
import com.revolut.feature.separate_favourites.api.alerts.AlertsFeatureConfig;
import com.revolut.feature.separate_favourites.api.alerts.widget.AlertsWidgetContext;
import com.revolut.feature.shared_separate_favourites.api.alerts.navigation.AddSharedAlertsConfiguration;
import com.revolut.feature.shared_separate_favourites.api.alerts.navigation.SharedAlertsConfiguration;
import com.revolut.feature.shared_separate_favourites.domain.AssetIdWithSymbol;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f251117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f251118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AlertsWidgetContext f251119c;

    public /* synthetic */ q(r rVar, AlertsWidgetContext alertsWidgetContext, int i) {
        this.f251117a = i;
        this.f251118b = rVar;
        this.f251119c = alertsWidgetContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        xi0.b bVarA;
        FeatureConfig addAlertScreen;
        Boolean enabled = (Boolean) obj2;
        switch (this.f251117a) {
            case 0:
                Intrinsics.checkNotNullParameter(enabled, "enabled");
                if (enabled.booleanValue()) {
                    u uVar = this.f251118b.f251120h;
                    AlertsWidgetContext alertsWidgetContext = this.f251119c;
                    Set shownAssets = alertsWidgetContext.f86005a;
                    boolean z = alertsWidgetContext.f86007c;
                    uVar.getClass();
                    Intrinsics.checkNotNullParameter(shownAssets, "shownAssets");
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(enabled, "enabled");
                if (enabled.booleanValue()) {
                    u uVar2 = this.f251118b.f251120h;
                    AlertsWidgetContext alertsWidgetContext2 = this.f251119c;
                    Set shownAssets2 = alertsWidgetContext2.f86005a;
                    AssetIdWithSymbol assetIdWithSymbol = alertsWidgetContext2.d;
                    String str = alertsWidgetContext2.f86009h;
                    uVar2.getClass();
                    Intrinsics.checkNotNullParameter(shownAssets2, "shownAssets");
                    if (shownAssets2.size() > 1) {
                        addAlertScreen = new AlertsFeatureConfig.AlertsScreen(new SharedAlertsConfiguration(shownAssets2, (Set) null, mgd.d.ACTIVE, new SharedAlertsConfiguration.Action.CreateAlert(assetIdWithSymbol), false, 50));
                    } else {
                        List listD1 = d0.d1(shownAssets2);
                        if (str != null) {
                            xi0.b.Companion.getClass();
                            bVarA = xi0.a.a(str);
                        } else {
                            bVarA = null;
                        }
                        addAlertScreen = new AddAlertFeatureConfig.AddAlertScreen(new AddSharedAlertsConfiguration(listD1, bVarA, assetIdWithSymbol, false));
                    }
                }
                break;
        }
        return pfm.m.f235744a;
    }
}

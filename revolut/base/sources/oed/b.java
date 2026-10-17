package oed;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.SharedAddAlertFlow;
import com.revolut.feature.shared_separate_favourites.alerts.ui.flow.add_alert.SharedAddAlertFlowContract$InputData;
import com.revolut.feature.shared_separate_favourites.alerts.ui.flow.alert_details.SharedAlertDetailsFlow;
import com.revolut.feature.shared_separate_favourites.alerts.ui.flow.alert_details.SharedAlertDetailsFlowContract$InputData;
import com.revolut.feature.shared_separate_favourites.api.alerts.navigation.AddSharedAlertsDestination;
import com.revolut.feature.shared_separate_favourites.api.alerts.navigation.SharedAlertDetailsDestination;
import com.revolut.feature.shared_separate_favourites.api.alerts.navigation.SharedAlertsConfiguration;
import com.revolut.feature.shared_separate_favourites.api.alerts.navigation.SharedAlertsDestination;
import com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem;
import kotlin.jvm.internal.Intrinsics;
import mgd.d;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f224580a;

    public b(a sharedAlertsControllerProvider) {
        Intrinsics.checkNotNullParameter(sharedAlertsControllerProvider, "sharedAlertsControllerProvider");
        this.f224580a = sharedAlertsControllerProvider;
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof SharedAlertsDestination) {
            SharedAlertsConfiguration f86772b = ((SharedAlertsDestination) destination).getF86772b();
            this.f224580a.getClass();
            return a.a(f86772b);
        }
        if (destination instanceof AddSharedAlertsDestination) {
            return new SharedAddAlertFlow(new SharedAddAlertFlowContract$InputData.Create(((AddSharedAlertsDestination) destination).getF86763b()));
        }
        if (!(destination instanceof SharedAlertDetailsDestination)) {
            return null;
        }
        SharedAlertDetailsDestination sharedAlertDetailsDestination = (SharedAlertDetailsDestination) destination;
        AlertItem f86765b = sharedAlertDetailsDestination.getF86765b();
        if (f86765b.getF86880h() == d.ACTIVE) {
            xi0.a aVar = xi0.b.Companion;
            String f86863a = f86765b.getF86877b().getF86863a();
            aVar.getClass();
            if (cp5.d.z(xi0.a.a(f86863a))) {
                return new SharedAddAlertFlow(new SharedAddAlertFlowContract$InputData.Edit(sharedAlertDetailsDestination.getF86765b()));
            }
        }
        return new SharedAlertDetailsFlow(new SharedAlertDetailsFlowContract$InputData(sharedAlertDetailsDestination.getF86765b()));
    }
}

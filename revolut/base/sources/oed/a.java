package oed;

import com.revolut.feature.shared_separate_favourites.alerts.ui.flow.alerts.SharedAlertsFlow;
import com.revolut.feature.shared_separate_favourites.alerts.ui.flow.alerts.SharedAlertsFlowContract$InputData;
import com.revolut.feature.shared_separate_favourites.api.alerts.navigation.SharedAlertsConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public static SharedAlertsFlow a(SharedAlertsConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new SharedAlertsFlow(new SharedAlertsFlowContract$InputData(configuration));
    }
}

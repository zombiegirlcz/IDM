package d79;

import aii.u;
import com.revolut.feature.notification_centre.api.NotificationCentreApi$Toggles;
import com.revolut.feature.notification_centre.api.navigation.LegacyInboxDestination;
import com.revolut.feature.notification_centre.api.navigation.RevolutFeedDestination;
import com.revolut.feature.notification_centre.impl.ui.inbox.LegacyInboxScreen;
import com.revolut.feature.notification_centre.impl.ui.revolut_feed.RevolutFeedFlow;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return NotificationCentreApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof RevolutFeedDestination) {
            return new RevolutFeedFlow();
        }
        if (destination instanceof LegacyInboxDestination) {
            return new LegacyInboxScreen();
        }
        return null;
    }
}

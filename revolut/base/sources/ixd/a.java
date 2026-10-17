package ixd;

import com.revolut.feature.standingordertopup.api.deeplink.AutoTopUpSupportedDeeplink;
import com.revolut.feature.standingordertopup.api.navigation.destination.AutoTopUpFlowDestination;
import com.revolut.kompot.common.ParcelableDestination;
import io3.l;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import xii.b;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements b {
    @Override // xii.b
    public final Set a() {
        AutoTopUpSupportedDeeplink.INSTANCE.getClass();
        return AutoTopUpSupportedDeeplink.templates;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return new AutoTopUpFlowDestination(null, l.CURRENT, null);
    }
}

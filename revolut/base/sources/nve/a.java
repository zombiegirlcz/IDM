package nve;

import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import lg0.g;
import rte.d;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements xii.b {
    @Override // xii.b
    public final Set a() {
        d.Companion.getClass();
        return d.templates;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String strA = g.a("storedMethodId", deeplink.f195041c);
        if (strA != null) {
            return new InitTopUpDestination(TopUpConfig.Companion.c(TopUpConfig.INSTANCE, null, new TopUpConfig.PreselectedTopUpMethod.McyStoredMethod(strA), null, null, 29));
        }
        return null;
    }
}

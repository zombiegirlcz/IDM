package jti;

import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.feature.airport.security_fast_track.api.navigation.AsftFeatureConfig;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import xii.b;
import zhm.y0;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements b {
    @Override // xii.b
    public final Set a() {
        return y0.b("asft");
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ytb.b bVar = new ytb.b(deeplink);
        if (Intrinsics.f(bVar.c(0), "asft")) {
            return ytb.b.f(bVar, new AsftFeatureConfig.HomeDestination(bVar.a()));
        }
        return null;
    }
}

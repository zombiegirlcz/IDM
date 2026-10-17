package jma;

import com.revolut.feature.profile.api.navigation.KompotProfileFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements xii.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f176508a = y0.b("experiments");

    @Override // xii.b
    public final Set a() {
        return this.f176508a;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return KompotProfileFeatureConfig.ExperimentsDestination.f81332a;
    }
}

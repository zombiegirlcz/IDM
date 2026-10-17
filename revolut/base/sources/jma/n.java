package jma;

import com.revolut.feature.backgroundpicker.api.ThemeCustomisationDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements xii.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f176510a = y0.b("appearance/themes-gallery");

    @Override // xii.b
    public final Set a() {
        return this.f176510a;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return new ThemeCustomisationDestination(null, 15);
    }
}

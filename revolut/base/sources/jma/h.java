package jma;

import com.revolut.feature.profile.api.navigation.KompotProfileFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements xii.b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f176504a = y0.b("notification-settings");

    public static final class a {
        private a() {
        }
    }

    @Override // xii.b
    public final Set a() {
        return this.f176504a;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return KompotProfileFeatureConfig.NotificationSettingsDestination.f81334a;
    }
}

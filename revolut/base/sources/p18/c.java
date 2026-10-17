package p18;

import com.revolut.feature.invest.smart_notifications.api.InvestSmartNotificationsApi$Toggles$InvestSmartNotifications;
import com.revolut.feature.invest.smart_notifications.api.InvestSmartNotificationsApi$Toggles$InvestSmartNotificationsSettings;
import com.revolut.feature.invest.smart_notifications.api.domain.WealthSmartFeedDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements xii.b {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f231880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f231881b;

    public c(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f231880a = featureToggleInteractor;
        this.f231881b = y0.b("trading/feed");
    }

    @Override // xii.b
    public final Set a() {
        return this.f231881b;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (!ifk.b.n(this.f231880a, InvestSmartNotificationsApi$Toggles$InvestSmartNotifications.f76416c, InvestSmartNotificationsApi$Toggles$InvestSmartNotificationsSettings.f76418c)) {
            return null;
        }
        tdh.a[] elements = {tdh.a.PORTFOLIO, tdh.a.WATCHLIST};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new WealthSmartFeedDestination(d.y0(elements));
    }
}

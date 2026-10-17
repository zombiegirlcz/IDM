package ple;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.invest.smart_notifications.api.InvestSmartNotificationsApi$Toggles$InvestSmartNotificationsSettings;
import com.revolut.feature.profile.api.navigation.KompotProfileFeatureConfig;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import od0.i;
import pj9.n;
import rd0.e;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gte.a f237366l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final toa.a f237367m;

    public c(gte.a featureToggleInteractor, toa.a notificationSettingsInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(notificationSettingsInteractor, "notificationSettingsInteractor");
        this.f237366l = featureToggleInteractor;
        this.f237367m = notificationSettingsInteractor;
    }

    @Override // ple.a
    public final Flow Z2() {
        if (((jte.d) this.f237366l).c(InvestSmartNotificationsApi$Toggles$InvestSmartNotificationsSettings.f76418c)) {
            return nim.a.v(e.b(this.f237367m.b()), new n(18));
        }
        i.Companion.getClass();
        return zi0.c.i(i.f224256b);
    }

    @Override // ple.a
    public final void b3(RowDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.u;
        if (obj2 instanceof b) {
            A2(new KompotProfileFeatureConfig.NotificationSettingDetailsDestination(((b) obj2).f237365a));
        }
    }
}

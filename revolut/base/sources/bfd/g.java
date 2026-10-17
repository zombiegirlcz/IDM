package bfd;

import cli.n;
import cli.y;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.select_type.SelectAlertTypeControllerContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends oki.h implements dli.b {
    public final efd.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f14966p;

    public g(n stateMapper, SelectAlertTypeControllerContract$InputData inputData, efd.a alertsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(alertsInteractor, "alertsInteractor");
        this.o = alertsInteractor;
        this.f14966p = mra.d.b(this, new d(inputData.f86754b, inputData.f86753a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f14966p;
    }
}

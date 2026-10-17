package ned;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.completed_alerts.SharedCompletedAlertsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedCompletedAlertsScreenContract$InputData f214469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f214470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f214471c;
    public final e4m.e d;

    public j(e eVar, g gVar, SharedCompletedAlertsScreenContract$InputData sharedCompletedAlertsScreenContract$InputData) {
        this.f214469a = sharedCompletedAlertsScreenContract$InputData;
        this.f214470b = e4m.b.b(new h(eVar, gVar, this, 1, 1));
        int i = 1;
        this.f214471c = e4m.b.b(new h(eVar, gVar, this, 2, i));
        this.d = e4m.b.b(new h(eVar, gVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}

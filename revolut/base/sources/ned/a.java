package ned;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.alert_details.SharedAlertDetailsScreenContract$InputData;
import java.util.Set;
import ld1.q;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedAlertDetailsScreenContract$InputData f214431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f214432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f214433c;
    public final e4m.e d;

    public a(e eVar, d dVar, SharedAlertDetailsScreenContract$InputData sharedAlertDetailsScreenContract$InputData) {
        this.f214431a = sharedAlertDetailsScreenContract$InputData;
        this.f214432b = e4m.b.b(new q(eVar, dVar, this, 1, 29));
        int i = 29;
        this.f214433c = e4m.b.b(new q(eVar, dVar, this, 2, i));
        this.d = e4m.b.b(new q(eVar, dVar, this, 0, i));
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

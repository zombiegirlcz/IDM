package ned;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.select_type.SelectAlertTypeControllerContract$InputData;
import java.util.Set;
import ms1.s;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectAlertTypeControllerContract$InputData f214434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f214435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f214436c;

    public b(e eVar, SelectAlertTypeControllerContract$InputData selectAlertTypeControllerContract$InputData) {
        this.f214434a = selectAlertTypeControllerContract$InputData;
        int i = 17;
        this.f214435b = e4m.b.b(new s(eVar, this, 1, i));
        this.f214436c = e4m.b.b(new s(eVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}

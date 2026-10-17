package ppd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.country_picker.TripsCountryPickerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class z0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TripsCountryPickerContract$InputData f238585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f238586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f238587c;
    public final e4m.e d;

    public z0(n nVar, c1 c1Var, TripsCountryPickerContract$InputData tripsCountryPickerContract$InputData) {
        this.f238586b = nVar;
        this.f238585a = tripsCountryPickerContract$InputData;
        this.f238587c = e4m.b.b(new i0(nVar, this, 1, 4));
        this.d = e4m.b.b(new i0(nVar, this, 0, 4));
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

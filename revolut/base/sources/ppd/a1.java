package ppd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.date_picker.TripsDatePickerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class a1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TripsDatePickerContract$InputData f238373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f238374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f238375c;

    public a1(n nVar, c1 c1Var, TripsDatePickerContract$InputData tripsDatePickerContract$InputData) {
        this.f238373a = tripsDatePickerContract$InputData;
        this.f238374b = e4m.b.b(new i0(nVar, this, 1, 5));
        this.f238375c = e4m.b.b(new i0(nVar, this, 0, 5));
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

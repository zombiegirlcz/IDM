package ppd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.share.TripsShareContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class f1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TripsShareContract$InputData f238410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f238411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f238412c;
    public final e4m.e d;

    public f1(n nVar, c1 c1Var, TripsShareContract$InputData tripsShareContract$InputData) {
        this.f238411b = nVar;
        this.f238410a = tripsShareContract$InputData;
        int i = 6;
        this.f238412c = e4m.b.b(new i0(nVar, this, 1, i));
        this.d = e4m.b.b(new i0(nVar, this, 0, i));
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

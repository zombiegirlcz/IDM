package ppd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.TripsFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class c1 implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TripsFlowContract$InputData f238385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f238386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f238387c = this;
    public final e4m.e d = e4m.b.b(new pl1.h(this, 1, 13));
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f238388g;

    public c1(n nVar, ViewController viewController, TripsFlowContract$InputData tripsFlowContract$InputData) {
        this.f238386b = nVar;
        this.f238385a = tripsFlowContract$InputData;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 13;
        this.f = e4m.b.b(new pl1.h(this, 2, i));
        this.f238388g = e4m.b.b(new pl1.h(this, 0, i));
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

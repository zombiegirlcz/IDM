package ppd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.list.TripsListContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class d1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TripsListContract$InputData f238392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f238393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f238394c;
    public final e4m.e d;
    public final e4m.e e;

    public d1(n nVar, c1 c1Var, TripsListContract$InputData tripsListContract$InputData) {
        this.f238393b = nVar;
        this.f238392a = tripsListContract$InputData;
        this.f238394c = e4m.b.b(new j(nVar, c1Var, this, 1, 4));
        int i = 4;
        this.d = e4m.b.b(new j(nVar, c1Var, this, 2, i));
        this.e = e4m.b.b(new j(nVar, c1Var, this, 0, i));
    }

    public final rod.g b() {
        n nVar = this.f238393b;
        l80.e eVarH = nVar.d.h();
        vc.s.j(eVarH);
        n8b.a aVarA = nVar.o.a();
        vc.s.j(aVarA);
        return new rod.g(eVarH, aVarA);
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

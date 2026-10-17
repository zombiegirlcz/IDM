package z0g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.experiences.impl.ui.flow.tabs.TravelExperiencesTabsFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class q implements xki.c, k2g.a, p3g.a, q1g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperiencesTabsFlowContract$InputData f318440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f318441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f318442c = this;
    public final e4m.e d;

    public q(b bVar, TravelExperiencesTabsFlowContract$InputData travelExperiencesTabsFlowContract$InputData) {
        this.f318441b = bVar;
        this.f318440a = travelExperiencesTabsFlowContract$InputData;
        this.d = e4m.b.b(new yf3.d(bVar, this, 4));
    }

    @Override // k2g.a
    public final d0 A() {
        return new d0(this.f318441b, this.f318442c, 0);
    }

    @Override // q1g.a
    public final w c() {
        return new w(this.f318441b, this.f318442c, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // p3g.a
    public final m0 s() {
        return new m0(this.f318441b, this.f318442c, 0);
    }
}

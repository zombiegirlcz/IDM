package ufg;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.miles.impl.ui.flow.search_dashboard.TravelMilesFlightSearchDashboardPagerFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements xki.c, fig.a, fhg.a, zgg.a, big.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesFlightSearchDashboardPagerFlowContract$InputData f279747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f279748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f279749c = this;
    public final e4m.e d;

    public j(g gVar, TravelMilesFlightSearchDashboardPagerFlowContract$InputData travelMilesFlightSearchDashboardPagerFlowContract$InputData) {
        this.f279748b = gVar;
        this.f279747a = travelMilesFlightSearchDashboardPagerFlowContract$InputData;
        this.d = e4m.b.b(new u7i.g(gVar, this, 8));
    }

    @Override // big.a
    public final d0 b() {
        return new d0(this.f279748b, this.f279749c, 1);
    }

    @Override // zgg.a
    public final z c() {
        return new z(this.f279748b, this.f279749c, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // fig.a
    public final f0 j() {
        return new f0(this.f279748b, this.f279749c, 1);
    }

    @Override // fhg.a
    public final b0 q() {
        return new b0(this.f279748b, this.f279749c, 1);
    }
}

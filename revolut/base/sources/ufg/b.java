package ufg;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.miles.impl.ui.flow.airline_details.TravelMilesAirlineDetailsFlowContract$InputData;
import java.util.Set;
import u45.w0;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements xki.c, rgg.a, sig.a, rig.a, zgg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesAirlineDetailsFlowContract$InputData f279667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f279668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f279669c = this;
    public final e4m.e d;
    public final e4m.e e;

    public b(g gVar, TravelMilesAirlineDetailsFlowContract$InputData travelMilesAirlineDetailsFlowContract$InputData) {
        this.f279668b = gVar;
        this.f279667a = travelMilesAirlineDetailsFlowContract$InputData;
        int i = 15;
        this.d = e4m.b.b(new w0(gVar, this, 1, i));
        this.e = e4m.b.b(new w0(gVar, this, 0, i));
    }

    @Override // rgg.a
    public final x b() {
        return new x(this.f279668b, this.f279669c, 1);
    }

    @Override // zgg.a
    public final z c() {
        return new z(this.f279668b, this.f279669c, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // sig.a
    public final j0 j() {
        return new j0(this.f279668b, this.f279669c, 1);
    }

    @Override // rig.a
    public final h0 q() {
        return new h0(this.f279668b, this.f279669c, 1);
    }
}

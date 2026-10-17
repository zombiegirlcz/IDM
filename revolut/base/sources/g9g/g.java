package g9g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.hotels.impl.ui_kompot.flow.amendment.TravelHotelsBookingAmendmentFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements xki.c, acg.a, ybg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsBookingAmendmentFlowContract$InputData f141670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f141671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f141672c = this;
    public final e4m.e d = e4m.b.b(new g2j.m(this, 9));

    public g(d dVar, TravelHotelsBookingAmendmentFlowContract$InputData travelHotelsBookingAmendmentFlowContract$InputData) {
        this.f141671b = dVar;
        this.f141670a = travelHotelsBookingAmendmentFlowContract$InputData;
    }

    @Override // acg.a
    public final u0 B() {
        return new u0(this.f141671b, this.f141672c, 0);
    }

    @Override // ybg.a
    public final s0 c() {
        return new s0(this.f141671b, this.f141672c, 0);
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

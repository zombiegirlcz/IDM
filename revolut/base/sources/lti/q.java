package lti;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.AsftTimeSlotBookingScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class q implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsftTimeSlotBookingScreenContract$InputData f199944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f199945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f199946c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f199947g;

    public q(g gVar, k kVar, ViewController viewController, AsftTimeSlotBookingScreenContract$InputData asftTimeSlotBookingScreenContract$InputData) {
        this.f199945b = gVar;
        this.f199944a = asftTimeSlotBookingScreenContract$InputData;
        this.f199946c = e4m.b.b(e4m.c.a(viewController));
        int i = 4;
        this.d = e4m.b.b(new l(gVar, this, 0, i));
        this.e = e4m.b.b(new l(gVar, this, 1, i));
        this.f = e4m.b.b(new l(gVar, this, 3, i));
        this.f199947g = e4m.b.b(new l(gVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}

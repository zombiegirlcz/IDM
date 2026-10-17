package g9g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsBookingDetailsParams;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fub.k f141679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelHotelsBookingDetailsParams f141680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.feature.rev_points.api.navigation.a f141681c;
    public final d d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f141682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f141683h;
    public final e4m.e i;

    public h(d dVar, t tVar, ViewController viewController, TravelHotelsBookingDetailsParams travelHotelsBookingDetailsParams, fub.k kVar, com.revolut.feature.rev_points.api.navigation.a aVar) {
        this.d = dVar;
        this.f141679a = kVar;
        this.f141680b = travelHotelsBookingDetailsParams;
        this.f141681c = aVar;
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i = 18;
        this.f = e4m.b.b(new fta.e(dVar, this, 2, i));
        this.f141682g = e4m.b.b(new fta.e(dVar, this, 1, i));
        this.f141683h = e4m.b.b(new fta.e(dVar, this, 0, i));
        this.i = e4m.b.b(new fta.e(dVar, this, 3, i));
    }

    public final hag.c b() {
        l70.e eVar = this.d.e;
        z80.b bVarS = eVar.s();
        vc.s.j(bVarS);
        l80.e eVarH = eVar.h();
        vc.s.j(eVarH);
        return new hag.c(eVarH, bVarS);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f141683h.get());
    }
}

package g9g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.details.TravelHotelsPropertyDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class y implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsPropertyDetailsScreenContract$InputData f141848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f141849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f141850c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f141851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f141852h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f141853j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f141854l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f141855m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f141856n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f141857p;

    public y(d dVar, z zVar, ViewController viewController, TravelHotelsPropertyDetailsScreenContract$InputData travelHotelsPropertyDetailsScreenContract$InputData) {
        this.f141849b = dVar;
        this.f141848a = travelHotelsPropertyDetailsScreenContract$InputData;
        this.f141850c = e4m.b.b(e4m.c.a(viewController));
        int i = 28;
        this.d = e4m.b.b(new fta.e(dVar, this, 2, i));
        this.e = e4m.b.b(new fta.e(dVar, this, 1, i));
        this.f = e4m.b.b(new fta.e(dVar, this, 0, i));
        this.f141851g = e4m.b.b(new fta.e(dVar, this, 4, i));
        this.f141852h = e4m.b.b(new fta.e(dVar, this, 3, i));
        this.i = e4m.b.b(new fta.e(dVar, this, 7, i));
        this.f141853j = e4m.b.b(new fta.e(dVar, this, 9, i));
        this.k = e4m.b.b(new fta.e(dVar, this, 8, i));
        this.f141854l = e4m.b.b(new fta.e(dVar, this, 10, i));
        this.f141855m = e4m.b.b(new fta.e(dVar, this, 11, i));
        this.f141856n = e4m.b.b(new fta.e(dVar, this, 6, i));
        this.o = e4m.b.b(new fta.e(dVar, this, 12, i));
        this.f141857p = e4m.b.b(new fta.e(dVar, this, 5, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f141852h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}

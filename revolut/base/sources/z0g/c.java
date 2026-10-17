package z0g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.experiences.impl.ui.screen.booking_details.TravelExperiencesBookingDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperiencesBookingDetailsScreenContract$InputData f318327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f318328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f318329c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f318330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f318331h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f318332j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f318333l;

    public c(b bVar, j jVar, BaseScreen baseScreen, TravelExperiencesBookingDetailsScreenContract$InputData travelExperiencesBookingDetailsScreenContract$InputData) {
        this.f318328b = bVar;
        this.f318327a = travelExperiencesBookingDetailsScreenContract$InputData;
        this.f318329c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 8;
        this.d = e4m.b.b(new yre.a(bVar, this, 2, i));
        this.e = e4m.b.b(new yre.a(bVar, this, 1, i));
        this.f = e4m.b.b(new yre.a(bVar, this, 0, i));
        this.f318330g = e4m.b.b(new yre.a(bVar, this, 3, i));
        this.f318331h = e4m.b.b(new yre.a(bVar, this, 6, i));
        this.i = e4m.b.b(new yre.a(bVar, this, 5, i));
        this.f318332j = e4m.b.b(new yre.a(bVar, this, 7, i));
        this.k = e4m.b.b(new yre.a(bVar, this, 8, i));
        this.f318333l = e4m.b.b(new yre.a(bVar, this, 4, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f318330g.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}

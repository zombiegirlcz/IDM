package f4g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.flights.impl.ui.screen.checkout.TravelFlightsCheckoutScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelFlightsCheckoutScreenContract$InputData f132140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f132141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f132142c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f132143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f132144h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f132145j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f132146l;

    public l(b bVar, p pVar, TravelFlightsCheckoutScreenContract$InputData travelFlightsCheckoutScreenContract$InputData) {
        this.f132141b = bVar;
        this.f132140a = travelFlightsCheckoutScreenContract$InputData;
        int i = 14;
        this.f132142c = e4m.b.b(new eyd.j(bVar, this, 1, i));
        this.d = e4m.b.b(new eyd.j(bVar, this, 0, i));
        this.e = e4m.b.b(new eyd.j(bVar, this, 3, i));
        this.f = e4m.b.b(new eyd.j(bVar, this, 2, i));
        this.f132143g = e4m.b.b(new eyd.j(bVar, this, 5, i));
        this.f132144h = e4m.b.b(new eyd.j(bVar, this, 4, i));
        this.i = e4m.b.b(new eyd.j(bVar, this, 7, i));
        this.f132145j = e4m.b.b(new eyd.j(bVar, this, 8, i));
        this.k = e4m.b.b(new eyd.j(bVar, this, 9, i));
        this.f132146l = e4m.b.b(new eyd.j(bVar, this, 6, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get(), (yji.n) this.f.get(), (yji.n) this.f132144h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}

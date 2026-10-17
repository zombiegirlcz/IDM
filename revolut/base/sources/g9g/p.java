package g9g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites_grid.TravelHotelsFavoritesGridScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsFavoritesGridScreenContract$InputData f141771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f141772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f141773c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f141774g;

    public p(d dVar, t tVar, ViewController viewController, TravelHotelsFavoritesGridScreenContract$InputData travelHotelsFavoritesGridScreenContract$InputData) {
        this.f141772b = dVar;
        this.f141771a = travelHotelsFavoritesGridScreenContract$InputData;
        int i = 24;
        this.f141773c = e4m.b.b(new fta.e(dVar, this, 1, i));
        this.d = e4m.b.b(new fta.e(dVar, this, 0, i));
        this.e = e4m.b.b(e4m.c.a(viewController));
        int i2 = 24;
        this.f = e4m.b.b(new fta.e(dVar, this, 3, i2));
        this.f141774g = e4m.b.b(new fta.e(dVar, this, 2, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}

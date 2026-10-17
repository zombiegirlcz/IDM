package g9g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.property.guests_reviews.TravelHotelsPropertyGuestsReviewsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsPropertyGuestsReviewsScreenContract$InputData f141589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f141590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f141591c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public a0(d dVar, z zVar, ViewController viewController, TravelHotelsPropertyGuestsReviewsScreenContract$InputData travelHotelsPropertyGuestsReviewsScreenContract$InputData) {
        this.f141590b = dVar;
        this.f141589a = travelHotelsPropertyGuestsReviewsScreenContract$InputData;
        this.f141591c = e4m.b.b(e4m.c.a(viewController));
        int i = 29;
        this.d = e4m.b.b(new fta.e(dVar, this, 1, i));
        this.e = e4m.b.b(new fta.e(dVar, this, 2, i));
        this.f = e4m.b.b(new fta.e(dVar, this, 0, i));
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

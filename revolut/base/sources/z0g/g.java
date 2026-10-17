package z0g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.experiences.impl.ui.screen.checkout.TravelExperiencesCheckoutScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperiencesCheckoutScreenContract$InputData f318364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f318365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f318366c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f318367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f318368h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f318369j;
    public final e4m.e k;

    public g(b bVar, f fVar, ViewController viewController, TravelExperiencesCheckoutScreenContract$InputData travelExperiencesCheckoutScreenContract$InputData) {
        this.f318365b = bVar;
        this.f318364a = travelExperiencesCheckoutScreenContract$InputData;
        this.f318366c = e4m.b.b(e4m.c.a(viewController));
        int i = 23;
        this.d = e4m.b.b(new wpg.g(bVar, fVar, this, 2, i));
        this.e = e4m.b.b(new wpg.g(bVar, fVar, this, 1, i));
        this.f = e4m.b.b(new wpg.g(bVar, fVar, this, 0, i));
        this.f318367g = e4m.b.b(new wpg.g(bVar, fVar, this, 4, i));
        this.f318368h = e4m.b.b(new wpg.g(bVar, fVar, this, 3, i));
        this.i = e4m.b.b(new wpg.g(bVar, fVar, this, 7, i));
        this.f318369j = e4m.b.b(new wpg.g(bVar, fVar, this, 6, i));
        this.k = e4m.b.b(new wpg.g(bVar, fVar, this, 5, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f318368h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}

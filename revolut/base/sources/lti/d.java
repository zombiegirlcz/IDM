package lti;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.AsftCheckoutScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsftCheckoutScreenContract$InputData f199888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f199889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f199890c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f199891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f199892h;
    public final e4m.e i;

    public d(g gVar, k kVar, ViewController viewController, AsftCheckoutScreenContract$InputData asftCheckoutScreenContract$InputData) {
        this.f199889b = gVar;
        this.f199888a = asftCheckoutScreenContract$InputData;
        this.f199890c = e4m.b.b(e4m.c.a(viewController));
        int i = 25;
        this.d = e4m.b.b(new ljl.u(gVar, this, 0, i));
        this.e = e4m.b.b(new ljl.u(gVar, this, 2, i));
        this.f = e4m.b.b(new ljl.u(gVar, this, 1, i));
        this.f199891g = e4m.b.b(new ljl.u(gVar, this, 3, i));
        this.f199892h = e4m.b.b(new ljl.u(gVar, this, 5, i));
        this.i = e4m.b.b(new ljl.u(gVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get(), (yji.n) this.f199891g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}

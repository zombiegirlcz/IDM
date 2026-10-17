package lti;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.AsftPassDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsftPassDetailsScreenContract$InputData f199933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f199934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f199935c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f199936g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f199937h;

    public n(g gVar, ViewController viewController, AsftPassDetailsScreenContract$InputData asftPassDetailsScreenContract$InputData) {
        this.f199935c = gVar;
        this.f199933a = asftPassDetailsScreenContract$InputData;
        this.f199934b = viewController;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 1;
        this.e = e4m.b.b(new l(gVar, this, 0, i));
        this.f = e4m.b.b(new l(gVar, this, 1, i));
        this.f199936g = e4m.b.b(new l(gVar, this, 3, i));
        this.f199937h = e4m.b.b(new l(gVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get(), (yji.d) this.f.get());
    }
}

package lti;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.modal.available_soon.AsftPassAvailableSoonScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsftPassAvailableSoonScreenContract$InputData f199919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f199920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f199921c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public j(g gVar, ViewController viewController, AsftPassAvailableSoonScreenContract$InputData asftPassAvailableSoonScreenContract$InputData) {
        this.f199920b = gVar;
        this.f199919a = asftPassAvailableSoonScreenContract$InputData;
        this.f199921c = e4m.b.b(e4m.c.a(viewController));
        this.d = e4m.b.b(new ljl.u(gVar, this, 0, 29));
        this.e = e4m.b.b(new ljl.u(gVar, this, 2, 29));
        this.f = e4m.b.b(new ljl.u(gVar, this, 1, 29));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}

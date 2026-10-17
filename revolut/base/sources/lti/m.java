package lti;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.AsftPassDetailsLegacyScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f199928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AsftPassDetailsLegacyScreenContract$InputData f199929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f199930c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f199931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f199932h;

    public m(g gVar, ViewController viewController, AsftPassDetailsLegacyScreenContract$InputData asftPassDetailsLegacyScreenContract$InputData) {
        this.f199930c = gVar;
        this.f199928a = viewController;
        this.f199929b = asftPassDetailsLegacyScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 0;
        this.e = e4m.b.b(new l(gVar, this, 0, i));
        this.f = e4m.b.b(new l(gVar, this, 3, i));
        this.f199931g = e4m.b.b(new l(gVar, this, 2, i));
        this.f199932h = e4m.b.b(new l(gVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}

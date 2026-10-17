package lti;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.traveller_details.AsftTravellerDetailsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class s implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AsftTravellerDetailsScreenContract$InputData f199951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f199952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f199953c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f199954g;

    public s(g gVar, k kVar, ViewController viewController, AsftTravellerDetailsScreenContract$InputData asftTravellerDetailsScreenContract$InputData) {
        this.f199952b = gVar;
        this.f199951a = asftTravellerDetailsScreenContract$InputData;
        this.f199953c = e4m.b.b(e4m.c.a(viewController));
        int i = 6;
        this.d = e4m.b.b(new l(gVar, this, 0, i));
        this.e = e4m.b.b(new l(gVar, this, 1, i));
        this.f = e4m.b.b(new l(gVar, this, 3, i));
        this.f199954g = e4m.b.b(new l(gVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}

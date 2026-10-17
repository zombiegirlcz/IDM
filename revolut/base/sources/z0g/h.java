package z0g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.experiences.impl.ui.screen.discovery.TravelExperiencesDestinationDiscoveryScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperiencesDestinationDiscoveryScreenContract$InputData f318373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f318374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f318375c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public h(b bVar, f fVar, TravelExperiencesDestinationDiscoveryScreenContract$InputData travelExperiencesDestinationDiscoveryScreenContract$InputData) {
        this.f318374b = bVar;
        this.f318373a = travelExperiencesDestinationDiscoveryScreenContract$InputData;
        int i = 11;
        this.f318375c = e4m.b.b(new yre.a(bVar, this, 1, i));
        this.d = e4m.b.b(new yre.a(bVar, this, 0, i));
        this.e = e4m.b.b(new yre.a(bVar, this, 3, i));
        this.f = e4m.b.b(new yre.a(bVar, this, 2, i));
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

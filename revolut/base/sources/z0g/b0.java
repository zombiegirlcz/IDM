package z0g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.experiences.impl.ui.screen.details.TravelExperiencesDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class b0 implements b2g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseScreen f318322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TravelExperiencesDetailsScreenContract$InputData f318323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f318324c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f318325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f318326h;

    public b0(b bVar, f fVar, BaseScreen baseScreen, TravelExperiencesDetailsScreenContract$InputData travelExperiencesDetailsScreenContract$InputData) {
        this.f318322a = baseScreen;
        this.f318323b = travelExperiencesDetailsScreenContract$InputData;
        int i = 22;
        this.f318324c = e4m.b.b(new yre.a(bVar, this, 2, i));
        this.d = e4m.b.b(new yre.a(bVar, this, 3, i));
        this.e = e4m.b.b(new yre.a(bVar, this, 4, i));
        this.f = e4m.b.b(new yre.a(bVar, this, 5, i));
        this.f318325g = e4m.b.b(new yre.a(bVar, this, 1, i));
        this.f318326h = e4m.b.b(new yre.a(bVar, this, 0, i));
    }

    @Override // b2g.a
    public final a2g.k a() {
        return (a2g.k) this.f318326h.get();
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}

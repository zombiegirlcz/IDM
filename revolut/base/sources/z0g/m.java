package z0g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.experiences.impl.ui.screen.pickup_details.TravelExperiencesPickupDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperiencesPickupDetailsScreenContract$InputData f318406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f318407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f318408c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f318409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f318410h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f318411j;

    public m(b bVar, f fVar, BaseScreen baseScreen, TravelExperiencesPickupDetailsScreenContract$InputData travelExperiencesPickupDetailsScreenContract$InputData) {
        this.f318407b = bVar;
        this.f318406a = travelExperiencesPickupDetailsScreenContract$InputData;
        this.f318408c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 25;
        this.d = e4m.b.b(new wpg.g(bVar, fVar, this, 2, i));
        this.e = e4m.b.b(new wpg.g(bVar, fVar, this, 1, i));
        this.f = e4m.b.b(new wpg.g(bVar, fVar, this, 0, i));
        this.f318409g = e4m.b.b(new wpg.g(bVar, fVar, this, 5, i));
        this.f318410h = e4m.b.b(new wpg.g(bVar, fVar, this, 4, i));
        this.i = e4m.b.b(new wpg.g(bVar, fVar, this, 6, i));
        this.f318411j = e4m.b.b(new wpg.g(bVar, fVar, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}

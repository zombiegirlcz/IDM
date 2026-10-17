package z0g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.experiences.impl.ui.screen.options_v2.TravelExperiencesOptionsV2ScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperiencesOptionsV2ScreenContract$InputData f318391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f318392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f318393c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f318394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f318395h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f318396j;

    public k(b bVar, f fVar, BaseScreen baseScreen, TravelExperiencesOptionsV2ScreenContract$InputData travelExperiencesOptionsV2ScreenContract$InputData) {
        this.f318391a = travelExperiencesOptionsV2ScreenContract$InputData;
        this.f318392b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 24;
        this.f318393c = e4m.b.b(new wpg.g(bVar, fVar, this, 2, i));
        this.d = e4m.b.b(new wpg.g(bVar, fVar, this, 1, i));
        this.e = e4m.b.b(new wpg.g(bVar, fVar, this, 0, i));
        this.f = e4m.b.b(new wpg.g(bVar, fVar, this, 5, i));
        this.f318394g = e4m.b.b(new wpg.g(bVar, fVar, this, 4, i));
        this.f318395h = e4m.b.b(new wpg.g(bVar, fVar, this, 6, i));
        this.i = e4m.b.b(new wpg.g(bVar, fVar, this, 7, i));
        this.f318396j = e4m.b.b(new wpg.g(bVar, fVar, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}

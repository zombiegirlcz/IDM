package z0g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.experiences.impl.ui.screen.filter.TravelExperiencesFilterScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperiencesFilterScreenContract$InputData f318379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f318380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f318381c;
    public final e4m.e d;

    public i(b bVar, f fVar, TravelExperiencesFilterScreenContract$InputData travelExperiencesFilterScreenContract$InputData) {
        this.f318379a = travelExperiencesFilterScreenContract$InputData;
        int i = 12;
        this.f318380b = e4m.b.b(new yre.a(bVar, this, 2, i));
        this.f318381c = e4m.b.b(new yre.a(bVar, this, 1, i));
        this.d = e4m.b.b(new yre.a(bVar, this, 0, i));
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

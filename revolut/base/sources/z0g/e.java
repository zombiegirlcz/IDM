package z0g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.experiences.impl.ui.screen.categories_filters.TravelExperiencesCategoriesFiltersScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperiencesCategoriesFiltersScreenContract$InputData f318345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f318346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f318347c;

    public e(b bVar, f fVar, TravelExperiencesCategoriesFiltersScreenContract$InputData travelExperiencesCategoriesFiltersScreenContract$InputData) {
        this.f318345a = travelExperiencesCategoriesFiltersScreenContract$InputData;
        int i = 9;
        this.f318346b = e4m.b.b(new yre.a(bVar, this, 1, i));
        this.f318347c = e4m.b.b(new yre.a(bVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}

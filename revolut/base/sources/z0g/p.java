package z0g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.experiences.impl.ui.screen.search_results.TravelExperiencesSearchResultsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperiencesSearchResultsScreenContract$InputData f318436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f318437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f318438c;
    public final e4m.e d;
    public final e4m.e e;

    public p(b bVar, f fVar, TravelExperiencesSearchResultsScreenContract$InputData travelExperiencesSearchResultsScreenContract$InputData) {
        this.f318436a = travelExperiencesSearchResultsScreenContract$InputData;
        int i = 14;
        this.f318437b = e4m.b.b(new yre.a(bVar, this, 2, i));
        this.f318438c = e4m.b.b(new yre.a(bVar, this, 1, i));
        this.d = e4m.b.b(new yre.a(bVar, this, 3, i));
        this.e = e4m.b.b(new yre.a(bVar, this, 0, i));
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

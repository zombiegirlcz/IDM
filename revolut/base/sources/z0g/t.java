package z0g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.experiences.impl.ui.screen.selection.visitors.TravelExperiencesVisitorsSelectionScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class t implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperiencesVisitorsSelectionScreenContract$InputData f318454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f318455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f318456c;

    public t(b bVar, f fVar, TravelExperiencesVisitorsSelectionScreenContract$InputData travelExperiencesVisitorsSelectionScreenContract$InputData) {
        this.f318454a = travelExperiencesVisitorsSelectionScreenContract$InputData;
        int i = 15;
        this.f318455b = e4m.b.b(new yre.a(fVar, this, 1, i));
        this.f318456c = e4m.b.b(new yre.a(fVar, this, 0, i));
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

package z0g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.experiences.impl.ui.screen.visitor_information.TravelExperiencesVisitorInformationScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class r implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperiencesVisitorInformationScreenContract$InputData f318446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f318447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f318448c;
    public final e4m.e d;
    public final e4m.e e;

    public r(b bVar, f fVar, TravelExperiencesVisitorInformationScreenContract$InputData travelExperiencesVisitorInformationScreenContract$InputData) {
        this.f318446a = travelExperiencesVisitorInformationScreenContract$InputData;
        this.f318447b = e4m.b.b(new wpg.g(bVar, fVar, this, 2, 27));
        int i = 27;
        this.f318448c = e4m.b.b(new wpg.g(bVar, fVar, this, 1, i));
        this.d = e4m.b.b(new wpg.g(bVar, fVar, this, 3, i));
        this.e = e4m.b.b(new wpg.g(bVar, fVar, this, 0, i));
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

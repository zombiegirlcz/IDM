package z0g;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.travel.experiences.impl.ui.screen.questions.TravelExperiencesQuestionsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class s implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperiencesQuestionsScreenContract$InputData f318449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f318450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f318451c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f318452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f318453h;

    public s(b bVar, f fVar, BaseScreen baseScreen, TravelExperiencesQuestionsScreenContract$InputData travelExperiencesQuestionsScreenContract$InputData) {
        this.f318450b = bVar;
        this.f318449a = travelExperiencesQuestionsScreenContract$InputData;
        this.f318451c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 28;
        this.d = e4m.b.b(new wpg.g(bVar, fVar, this, 2, i));
        this.e = e4m.b.b(new wpg.g(bVar, fVar, this, 1, i));
        this.f = e4m.b.b(new wpg.g(bVar, fVar, this, 0, i));
        this.f318452g = e4m.b.b(new wpg.g(bVar, fVar, this, 4, i));
        this.f318453h = e4m.b.b(new wpg.g(bVar, fVar, this, 3, i));
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

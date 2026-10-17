package f09;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.learn.shared.impl.ui.lesson.LessonScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import eyd.j;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LessonScreenContract$InputData f131061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f131062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f131063c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f131064g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f131065h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f131066j;

    public f(e eVar, BaseScreen baseScreen, LessonScreenContract$InputData lessonScreenContract$InputData) {
        this.f131062b = eVar;
        this.f131061a = lessonScreenContract$InputData;
        this.f131063c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 11;
        this.d = e4m.b.b(new j(eVar, this, 2, i));
        this.e = e4m.b.b(new j(eVar, this, 1, i));
        this.f = e4m.b.b(new j(eVar, this, 0, i));
        this.f131064g = e4m.b.b(new j(eVar, this, 3, i));
        this.f131065h = e4m.b.b(new j(eVar, this, 4, i));
        this.i = e4m.b.b(new j(eVar, this, 6, i));
        this.f131066j = e4m.b.b(new j(eVar, this, 5, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((n) this.f131064g.get(), (n) this.f131065h.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}

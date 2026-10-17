package f09;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.learn.shared.impl.ui.course.overview.CourseOverviewScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import eyd.j;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CourseOverviewScreenContract$InputData f131046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f131047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f131048c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f131049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f131050h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f131051j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f131052l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f131053m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f131054n;

    public c(e eVar, BaseScreen baseScreen, CourseOverviewScreenContract$InputData courseOverviewScreenContract$InputData) {
        this.f131047b = eVar;
        this.f131046a = courseOverviewScreenContract$InputData;
        this.f131048c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 9;
        this.d = e4m.b.b(new j(eVar, this, 2, i));
        this.e = e4m.b.b(new j(eVar, this, 1, i));
        this.f = e4m.b.b(new j(eVar, this, 0, i));
        this.f131049g = e4m.b.b(new j(eVar, this, 5, i));
        this.f131050h = e4m.b.b(new j(eVar, this, 4, i));
        this.i = e4m.b.b(new j(eVar, this, 3, i));
        this.f131051j = e4m.b.b(new j(eVar, this, 6, i));
        this.k = e4m.b.b(new j(eVar, this, 7, i));
        this.f131052l = e4m.b.b(new j(eVar, this, 9, i));
        this.f131053m = e4m.b.b(new j(eVar, this, 10, i));
        this.f131054n = e4m.b.b(new j(eVar, this, 8, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((n) this.f131051j.get(), (n) this.k.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.i.get());
    }
}

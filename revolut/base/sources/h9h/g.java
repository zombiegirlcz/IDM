package h9h;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.impl.ui.screens.composite_add_money.schedule.ScheduleScreenContract$Input;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseScreen f150302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduleScreenContract$Input f150303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f150304c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f150305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f150306h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f150307j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f150308l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f150309m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f150310n;
    public final e4m.e o;

    public g(a aVar, BaseScreen baseScreen, ScheduleScreenContract$Input scheduleScreenContract$Input) {
        this.f150302a = baseScreen;
        this.f150303b = scheduleScreenContract$Input;
        this.f150304c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 13;
        this.d = e4m.b.b(new gff.a(this, 4, i));
        this.e = e4m.b.b(new gff.a(this, 3, i));
        this.f = e4m.b.b(new gff.a(this, 5, i));
        this.f150305g = e4m.b.b(new gff.a(this, 2, i));
        this.f150306h = e4m.b.b(new gff.a(this, 1, i));
        this.i = e4m.b.b(new gff.a(this, 0, i));
        this.f150307j = e4m.b.b(new gff.a(this, 6, i));
        this.k = e4m.b.b(new gff.a(this, 7, i));
        this.f150308l = e4m.b.b(new gff.a(this, 9, i));
        this.f150309m = e4m.b.b(new gff.a(this, 10, i));
        this.f150310n = e4m.b.b(new gff.a(this, 11, i));
        this.o = e4m.b.b(new gff.a(this, 8, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((n) this.k.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.i.get(), (yji.d) this.f150307j.get());
    }
}

package dmc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.robo.impl.ui.screen.settings.SettingsScreenContract$Input;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class s implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseScreen f116044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SettingsScreenContract$Input f116045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f116046c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f116047g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f116048h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f116049j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f116050l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f116051m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f116052n;
    public final e4m.e o;

    public s(r rVar, BaseScreen baseScreen, SettingsScreenContract$Input settingsScreenContract$Input) {
        this.f116046c = rVar;
        this.f116044a = baseScreen;
        this.f116045b = settingsScreenContract$Input;
        this.d = e4m.b.b(e4m.c.a(baseScreen));
        int i = 23;
        this.e = e4m.b.b(new db1.f(rVar, this, 3, i));
        this.f = e4m.b.b(new db1.f(rVar, this, 2, i));
        this.f116047g = e4m.b.b(new db1.f(rVar, this, 5, i));
        this.f116048h = e4m.b.b(new db1.f(rVar, this, 4, i));
        this.i = e4m.b.b(new db1.f(rVar, this, 1, i));
        this.f116049j = e4m.b.b(new db1.f(rVar, this, 0, i));
        this.k = e4m.b.b(new db1.f(rVar, this, 6, i));
        this.f116050l = e4m.b.b(new db1.f(rVar, this, 7, i));
        this.f116051m = e4m.b.b(new db1.f(rVar, this, 9, i));
        this.f116052n = e4m.b.b(new db1.f(rVar, this, 10, i));
        this.o = e4m.b.b(new db1.f(rVar, this, 8, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f116050l.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f116049j.get(), (yji.d) this.k.get());
    }
}

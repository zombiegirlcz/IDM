package q7k;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;
import prk.k0;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseScreen f242925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f242926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f242927c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f242928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f242929h;
    public final e4m.e i;

    public l(j jVar, BaseScreen baseScreen) {
        this.f242925a = baseScreen;
        this.f242926b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 10;
        this.f242927c = e4m.b.b(new k0(jVar, this, 1, i));
        this.d = e4m.b.b(new k0(jVar, this, 0, i));
        this.e = e4m.b.b(new k0(jVar, this, 3, i));
        this.f = e4m.b.b(new k0(jVar, this, 2, i));
        this.f242928g = e4m.b.b(new k0(jVar, this, 5, i));
        this.f242929h = e4m.b.b(new k0(jVar, this, 6, i));
        this.i = e4m.b.b(new k0(jVar, this, 4, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get(), (yji.d) this.f.get());
    }
}

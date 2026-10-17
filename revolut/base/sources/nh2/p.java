package nh2;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f215330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f215331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f215332c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f215333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f215334h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f215335j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f215336l;

    public p(o oVar, v vVar, ViewController viewController) {
        this.f215330a = oVar;
        this.f215331b = vVar;
        this.f215332c = e4m.b.b(e4m.c.a(viewController));
        int i = 23;
        this.d = e4m.b.b(new ms1.s(oVar, this, 1, i));
        this.e = e4m.b.b(new ms1.s(oVar, this, 0, i));
        this.f = e4m.b.b(new ms1.s(oVar, this, 3, i));
        this.f215333g = e4m.b.b(new ms1.s(oVar, this, 2, i));
        this.f215334h = e4m.b.b(new ms1.s(oVar, this, 5, i));
        this.i = e4m.b.b(new ms1.s(oVar, this, 6, i));
        this.f215335j = e4m.b.b(new ms1.s(oVar, this, 8, i));
        this.k = e4m.b.b(new ms1.s(oVar, this, 7, i));
        this.f215336l = e4m.b.b(new ms1.s(oVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get(), (yji.d) this.f215333g.get());
    }
}

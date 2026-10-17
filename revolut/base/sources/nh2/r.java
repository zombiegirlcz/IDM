package nh2;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class r implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f215340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f215341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f215342c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f215343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f215344h;
    public final e4m.e i;

    public r(o oVar, s sVar, ViewController viewController) {
        this.f215341b = oVar;
        this.f215340a = viewController;
        int i = 24;
        this.f215342c = e4m.b.b(new ms1.s(oVar, this, 2, i));
        this.d = e4m.b.b(new ms1.s(oVar, this, 1, i));
        this.e = e4m.b.b(new ms1.s(oVar, this, 0, i));
        this.f = e4m.b.b(new ms1.s(oVar, this, 4, i));
        this.f215343g = e4m.b.b(new ms1.s(oVar, this, 3, i));
        this.f215344h = e4m.b.b(new ms1.s(oVar, this, 6, i));
        this.i = e4m.b.b(new ms1.s(oVar, this, 5, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f215343g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}

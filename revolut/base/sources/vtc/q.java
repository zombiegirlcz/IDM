package vtc;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f292040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f292041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f292042c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f292043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f292044h;

    public q(t tVar, u uVar, ViewController viewController) {
        this.f292040a = tVar;
        this.f292041b = e4m.b.b(e4m.c.a(viewController));
        int i = 14;
        this.f292042c = e4m.b.b(new vn2.l(tVar, this, 2, i));
        this.d = e4m.b.b(new vn2.l(tVar, this, 1, i));
        this.e = e4m.b.b(new vn2.l(tVar, this, 0, i));
        this.f = e4m.b.b(new vn2.l(tVar, this, 4, i));
        this.f292043g = e4m.b.b(new vn2.l(tVar, this, 3, i));
        this.f292044h = e4m.b.b(new vn2.l(tVar, this, 5, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f292043g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}

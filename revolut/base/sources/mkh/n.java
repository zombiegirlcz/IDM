package mkh;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f206351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f206352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f206353c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f206354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f206355h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f206356j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f206357l;

    public n(s sVar, m mVar, ViewController viewController) {
        this.f206351a = mVar;
        this.f206352b = e4m.b.b(e4m.c.a(viewController));
        this.f206353c = e4m.b.b(new ld1.q(sVar, mVar, this, 2, 21));
        this.d = e4m.b.b(new ld1.q(sVar, mVar, this, 4, 21));
        this.e = e4m.b.b(new ld1.q(sVar, mVar, this, 5, 21));
        this.f = e4m.b.b(new ld1.q(sVar, mVar, this, 3, 21));
        this.f206354g = e4m.b.b(new ld1.q(sVar, mVar, this, 1, 21));
        this.f206355h = e4m.b.b(new ld1.q(sVar, mVar, this, 0, 21));
        this.i = e4m.b.b(new ld1.q(sVar, mVar, this, 6, 21));
        this.f206356j = e4m.b.b(new ld1.q(sVar, mVar, this, 7, 21));
        this.k = e4m.b.b(new ld1.q(sVar, mVar, this, 9, 21));
        this.f206357l = e4m.b.b(new ld1.q(sVar, mVar, this, 8, 21));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f206356j.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f206355h.get(), (yji.d) this.i.get());
    }
}

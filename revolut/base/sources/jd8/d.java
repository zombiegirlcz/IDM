package jd8;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final md8.d f173019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f173020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f173021c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f173022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f173023h;

    public d(e eVar, ViewController viewController, md8.d dVar) {
        this.f173019a = dVar;
        this.f173020b = e4m.b.b(e4m.c.a(viewController));
        int i = 27;
        this.f173021c = e4m.b.b(new iwb.b(eVar, this, 2, i));
        this.d = e4m.b.b(new iwb.b(eVar, this, 1, i));
        this.e = e4m.b.b(new iwb.b(eVar, this, 0, i));
        this.f = e4m.b.b(new iwb.b(eVar, this, 4, i));
        this.f173022g = e4m.b.b(new iwb.b(eVar, this, 5, i));
        this.f173023h = e4m.b.b(new iwb.b(eVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}

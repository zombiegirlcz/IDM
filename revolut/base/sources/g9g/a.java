package g9g;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f141586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f141587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f141588c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public a(d dVar, v vVar, ViewController viewController) {
        this.f141586a = dVar;
        int i = 15;
        this.f141587b = e4m.b.b(new fta.e(dVar, this, 1, i));
        this.f141588c = e4m.b.b(new fta.e(dVar, this, 0, i));
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i2 = 15;
        this.e = e4m.b.b(new fta.e(dVar, this, 3, i2));
        this.f = e4m.b.b(new fta.e(dVar, this, 2, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f141588c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}

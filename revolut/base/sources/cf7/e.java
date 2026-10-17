package cf7;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f23606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f23607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f23608c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f23609g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f23610h;
    public final e4m.e i;

    public e(b bVar, f fVar, ViewController viewController) {
        this.f23606a = bVar;
        this.f23607b = fVar;
        this.f23608c = e4m.b.b(e4m.c.a(viewController));
        this.d = e4m.b.b(new afj.d(bVar, fVar, this, 2, 20));
        int i = 20;
        this.e = e4m.b.b(new afj.d(bVar, fVar, this, 1, i));
        this.f = e4m.b.b(new afj.d(bVar, fVar, this, 0, i));
        this.f23609g = e4m.b.b(new afj.d(bVar, fVar, this, 4, i));
        this.f23610h = e4m.b.b(new afj.d(bVar, fVar, this, 5, i));
        this.i = e4m.b.b(new afj.d(bVar, fVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}

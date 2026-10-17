package m2b;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class t implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jx0.a f201898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f201899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f201900c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f201901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f201902h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f201903j;

    public t(v vVar, ViewController viewController, jx0.a aVar) {
        this.f201898a = aVar;
        this.f201899b = e4m.b.b(e4m.c.a(viewController));
        this.f201900c = e4m.b.b(new lzk.b(vVar, this, 2, 10));
        this.d = e4m.b.b(new lzk.b(vVar, this, 1, 10));
        this.e = e4m.b.b(new lzk.b(vVar, this, 0, 10));
        this.f = e4m.b.b(new lzk.b(vVar, this, 3, 10));
        this.f201901g = e4m.b.b(new lzk.b(vVar, this, 4, 10));
        this.f201902h = e4m.b.b(new lzk.b(vVar, this, 7, 10));
        this.i = e4m.b.b(new lzk.b(vVar, this, 6, 10));
        this.f201903j = e4m.b.b(new lzk.b(vVar, this, 5, 10));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f201901g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get(), (yji.d) this.f.get());
    }
}

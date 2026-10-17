package m2b;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o3b.y f201837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f201838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f201839c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f201840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f201841h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f201842j;
    public final e4m.e k;

    public i(v vVar, ViewController viewController, o3b.y yVar) {
        this.f201837a = yVar;
        this.f201838b = e4m.b.b(e4m.c.a(viewController));
        int i = 5;
        this.f201839c = e4m.b.b(new lzk.b(vVar, this, 2, i));
        this.d = e4m.b.b(new lzk.b(vVar, this, 1, i));
        this.e = e4m.b.b(new lzk.b(vVar, this, 0, i));
        this.f = e4m.b.b(new lzk.b(vVar, this, 4, i));
        this.f201840g = e4m.b.b(new lzk.b(vVar, this, 3, i));
        this.f201841h = e4m.b.b(new lzk.b(vVar, this, 6, i));
        this.i = e4m.b.b(new lzk.b(vVar, this, 5, i));
        this.f201842j = e4m.b.b(new lzk.b(vVar, this, 8, i));
        this.k = e4m.b.b(new lzk.b(vVar, this, 7, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get(), (yji.d) this.f201840g.get(), (yji.d) this.i.get());
    }
}

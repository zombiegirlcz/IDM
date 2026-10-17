package ld1;

import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f193969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f193970b = this;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f193971c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f193972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f193973h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f193974j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f193975l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f193976m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f193977n;

    public m(l lVar, ViewController viewController) {
        this.f193969a = lVar;
        this.f193971c = e4m.b.b(e4m.c.a(viewController));
        int i = 11;
        this.d = e4m.b.b(new l9f.z(lVar, this, 1, i));
        this.e = e4m.b.b(new l9f.z(lVar, this, 0, i));
        this.f = e4m.b.b(new l9f.z(lVar, this, 3, i));
        this.f193972g = e4m.b.b(new l9f.z(lVar, this, 5, i));
        this.f193973h = e4m.b.b(new l9f.z(lVar, this, 4, i));
        this.i = e4m.b.b(new l9f.z(lVar, this, 6, i));
        this.f193974j = e4m.b.b(new l9f.z(lVar, this, 2, i));
        this.k = e4m.b.b(new l9f.z(lVar, this, 7, i));
        this.f193975l = e4m.b.b(new l9f.z(lVar, this, 10, i));
        this.f193976m = e4m.b.b(new l9f.z(lVar, this, 9, i));
        this.f193977n = e4m.b.b(new l9f.z(lVar, this, 8, i));
    }

    @Override // xki.e
    public final Set f() {
        return Collections.singleton((yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}

package r7d;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f252091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f252092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f252093c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f252094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f252095h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f252096j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f252097l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f252098m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f252099n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f252100p;

    public b(l lVar, t tVar, BaseScreen baseScreen) {
        this.f252091a = lVar;
        this.f252092b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 26;
        this.f252093c = e4m.b.b(new qy7.f(lVar, this, 2, i));
        this.d = e4m.b.b(new qy7.f(lVar, this, 1, i));
        this.e = e4m.b.b(new qy7.f(lVar, this, 0, i));
        this.f = e4m.b.b(new qy7.f(lVar, this, 4, i));
        this.f252094g = e4m.b.b(new qy7.f(lVar, this, 3, i));
        this.f252095h = e4m.b.b(new qy7.f(lVar, this, 6, i));
        this.i = e4m.b.b(new qy7.f(lVar, this, 5, i));
        this.f252096j = e4m.b.b(new qy7.f(lVar, this, 8, i));
        this.k = e4m.b.b(new qy7.f(lVar, this, 7, i));
        this.f252097l = e4m.b.b(new qy7.f(lVar, this, 11, i));
        this.f252098m = e4m.b.b(new qy7.f(lVar, this, 10, i));
        this.f252099n = e4m.b.b(new qy7.f(lVar, this, 9, i));
        this.o = e4m.b.b(new qy7.f(lVar, this, 13, i));
        this.f252100p = e4m.b.b(new qy7.f(lVar, this, 12, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.k.get(), (yji.n) this.f252099n.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get(), (yji.d) this.f252094g.get(), (yji.d) this.i.get());
    }
}

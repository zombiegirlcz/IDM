package qve;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements mye.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kye.n f249570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f249571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f249572c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f249573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f249574h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f249575j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f249576l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f249577m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f249578n;
    public final e4m.e o;

    public b(k kVar, n nVar, ViewController viewController, kye.n nVar2) {
        this.f249571b = kVar;
        this.f249572c = nVar;
        this.f249570a = nVar2;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 14;
        this.e = e4m.b.b(new ppd.j(kVar, nVar, this, 2, i));
        this.f = e4m.b.b(new ppd.j(kVar, nVar, this, 1, i));
        this.f249573g = e4m.b.b(new ppd.j(kVar, nVar, this, 0, i));
        this.f249574h = e4m.b.b(new ppd.j(kVar, nVar, this, 5, i));
        this.i = e4m.b.b(new ppd.j(kVar, nVar, this, 4, i));
        this.f249575j = e4m.b.b(new ppd.j(kVar, nVar, this, 6, i));
        this.k = e4m.b.b(new ppd.j(kVar, nVar, this, 7, i));
        this.f249576l = e4m.b.b(new ppd.j(kVar, nVar, this, 8, i));
        this.f249577m = e4m.b.b(new ppd.j(kVar, nVar, this, 9, i));
        this.f249578n = e4m.b.b(new ppd.j(kVar, nVar, this, 10, i));
        this.o = e4m.b.b(new ppd.j(kVar, nVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(2);
        n nVar = this.f249572c;
        builderBuilderWithExpectedSize.addAll((Iterable) nVar.f249640s.get());
        return j6.a.g(nVar.f249639r, builderBuilderWithExpectedSize);
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f249573g.get());
    }
}

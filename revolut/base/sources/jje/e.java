package jje;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements fke.e {
    public final e4m.e A;
    public final e4m.e B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f174860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d16.a f174861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zje.a f174862c;
    public final c d;
    public final e e = this;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f174863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f174864h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f174865j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f174866l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f174867m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f174868n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f174869p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f174870q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f174871r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f174872s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final jdi.i f174873t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f174874w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f174875x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final jdi.i f174876y;
    public final e4m.e z;

    public e(c cVar, d16.a aVar, ViewController viewController, zje.a aVar2) {
        this.d = cVar;
        this.f174860a = viewController;
        this.f174861b = aVar;
        this.f174862c = aVar2;
        this.f = e4m.b.b(e4m.c.a(viewController));
        int i = 10;
        this.f174863g = e4m.b.b(new jdi.i(cVar, this, 2, i));
        this.f174864h = e4m.b.b(new jdi.i(cVar, this, 1, i));
        this.i = e4m.b.b(new jdi.i(cVar, this, 0, i));
        this.f174865j = e4m.b.b(new jdi.i(cVar, this, 7, i));
        this.k = e4m.b.b(new jdi.i(cVar, this, 6, i));
        this.f174866l = e4m.b.b(new jdi.i(cVar, this, 8, i));
        this.f174867m = e4m.b.b(new jdi.i(cVar, this, 9, i));
        this.f174868n = e4m.b.b(new jdi.i(cVar, this, 10, i));
        this.o = e4m.b.b(new jdi.i(cVar, this, 5, i));
        this.f174869p = e4m.b.b(new jdi.i(cVar, this, 4, i));
        this.f174870q = e4m.b.b(new jdi.i(cVar, this, 3, i));
        this.f174871r = e4m.b.b(new jdi.i(cVar, this, 12, i));
        this.f174872s = e4m.b.b(new jdi.i(cVar, this, 11, i));
        this.f174873t = new jdi.i(cVar, this, 14, i);
        this.u = e4m.b.b(new jdi.i(cVar, this, 13, i));
        this.v = e4m.b.b(new jdi.i(cVar, this, 16, i));
        this.f174874w = e4m.b.b(new jdi.i(cVar, this, 15, i));
        this.f174875x = e4m.b.b(new jdi.i(cVar, this, 18, i));
        jdi.i iVar = new jdi.i(cVar, this, 17, i);
        this.f174876y = iVar;
        this.z = e4m.b.b(iVar);
        this.A = e4m.b.b(this.f174876y);
        this.B = e4m.b.b(new jdi.i(cVar, this, 19, i));
    }

    @Override // oje.b
    public final g b() {
        return new g(this.d, this.e, 0);
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(2);
        builderBuilderWithExpectedSize.add(this.f174870q.get());
        builderBuilderWithExpectedSize.addAll((Iterable) this.f174872s.get());
        return builderBuilderWithExpectedSize.build();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.i.get());
    }
}

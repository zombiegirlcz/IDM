package py5;

import com.google.common.collect.ImmutableSet;
import hn.h;
import iri.j;
import java.util.Collection;
import l70.e;
import mp.r;
import mw5.l;
import prk.u;
import t70.g;
import um.c;
import vc.s;
import zu8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements hri.a, fri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hri.b f240685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f240686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vv5.e f240687c;
    public final yj3.a d;
    public final l e;
    public final c0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f240688g = this;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f240689h = e4m.b.b(new u(this, 0, 2));
    public final e4m.e i = e4m.b.b(new u(this, 1, 2));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f240690j = e4m.b.b(new u(this, 2, 2));
    public final e4m.e k = e4m.b.b(new u(this, 3, 2));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f240691l = e4m.b.b(new u(this, 4, 2));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f240692m = e4m.b.b(new u(this, 5, 2));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f240693n = e4m.b.b(new u(this, 6, 2));
    public final e4m.e o = e4m.b.b(new u(this, 7, 2));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f240694p = e4m.b.b(new u(this, 8, 2));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f240695q = e4m.b.b(new u(this, 9, 2));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u f240696r = new u(this, 10, 2);

    public b(hri.b bVar, e eVar, c0 c0Var, vv5.e eVar2, yj3.a aVar, l lVar) {
        this.f240685a = bVar;
        this.f240686b = eVar;
        this.f240687c = eVar2;
        this.d = aVar;
        this.e = lVar;
        this.f = c0Var;
    }

    public final qm.e a() {
        return new qm.e((c) this.k.get());
    }

    public final jn.e d() {
        ln.a aVar = (ln.a) this.f240692m.get();
        h hVar = (h) this.f240691l.get();
        g gVarO = this.f240686b.o();
        s.j(gVarO);
        return new jn.e(aVar, hVar, new r(gVarO), ImmutableSet.copyOf((Collection) jn.c.a()));
    }

    @Override // hri.a
    public final j e() {
        return (j) this.i.get();
    }

    @Override // hri.a
    public final ifm.b f() {
        return (ifm.b) this.f240689h.get();
    }
}

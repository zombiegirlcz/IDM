package ap3;

import com.google.common.collect.ImmutableMap;
import ib7.j;
import iel.a0;
import iel.o;
import iel.q;
import iel.r;
import iel.v;
import iel.x;
import iel.y;
import k8b.i;
import k8b.k;
import k8b.l;
import k8b.m;
import kl.t1;
import vc.s;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cri.a f8087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ite.a f8088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final whl.e f8089c;
    public final zdl.c d;
    public final l70.e e;
    public final zdl.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u8h.c f8090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f8091h = this;
    public final e4m.e i = e4m.b.b(new a96.b(6));

    public h(l70.e eVar, whl.e eVar2, ite.a aVar, cri.a aVar2, zdl.f fVar, zdl.c cVar, u8h.c cVar2) {
        this.f8087a = aVar2;
        this.f8088b = aVar;
        this.f8089c = eVar2;
        this.d = cVar;
        this.e = eVar;
        this.f = fVar;
        this.f8090g = cVar2;
    }

    public final j a() {
        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(14);
        builderBuilderWithExpectedSize.put(iel.d.class, new k8b.d());
        builderBuilderWithExpectedSize.put(x.class, new k8b.j());
        builderBuilderWithExpectedSize.put(y.class, new k());
        builderBuilderWithExpectedSize.put(v.class, new i());
        builderBuilderWithExpectedSize.put(a0.class, new m());
        builderBuilderWithExpectedSize.put(iel.b.class, new k8b.b());
        builderBuilderWithExpectedSize.put(o.class, new k8b.g());
        qd0.b bVarN = this.e.n();
        s.j(bVarN);
        builderBuilderWithExpectedSize.put(iel.h.class, new k8b.e(bVarN));
        builderBuilderWithExpectedSize.put(iel.c.class, new k8b.c());
        builderBuilderWithExpectedSize.put(iel.m.class, new l());
        builderBuilderWithExpectedSize.put(iel.g.class, new l());
        builderBuilderWithExpectedSize.put(q.class, new l());
        builderBuilderWithExpectedSize.put(r.class, new k8b.h());
        builderBuilderWithExpectedSize.put(iel.k.class, new k8b.f());
        return new j(builderBuilderWithExpectedSize.build(), 1);
    }

    public final h8b.c b() {
        j8b.a aVar = new j8b.a();
        jx0.a aVar2 = new jx0.a(new t1(a()), new m8b.r(a()), new m8b.q());
        ybl.d dVarH = this.d.h();
        s.j(dVarH);
        ybl.k kVarD = this.f.d();
        s.j(kVarD);
        l80.e eVarH = this.e.h();
        s.j(eVarH);
        return new h8b.c(aVar, aVar2, dVarH, kVarD, eVarH);
    }
}

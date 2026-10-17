package mkh;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements qnh.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i7d.i f206328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pnh.k f206329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f206330c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public h(s sVar, pnh.k kVar, i7d.i iVar) {
        this.f206330c = sVar;
        this.f206328a = iVar;
        this.f206329b = kVar;
        this.d = e4m.b.b(new mjl.b(sVar, this, 1, 5));
        this.e = e4m.b.b(new mjl.b(sVar, this, 0, 5));
        this.f = e4m.b.b(new mjl.b(sVar, this, 2, 5));
    }

    public final ib7.j b() {
        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(14);
        builderBuilderWithExpectedSize.put(iel.d.class, new k8b.d());
        builderBuilderWithExpectedSize.put(iel.x.class, new k8b.j());
        builderBuilderWithExpectedSize.put(iel.y.class, new k8b.k());
        builderBuilderWithExpectedSize.put(iel.v.class, new k8b.i());
        builderBuilderWithExpectedSize.put(iel.a0.class, new k8b.m());
        builderBuilderWithExpectedSize.put(iel.b.class, new k8b.b());
        builderBuilderWithExpectedSize.put(iel.o.class, new k8b.g());
        qd0.b bVarN = this.f206330c.I.n();
        vc.s.j(bVarN);
        builderBuilderWithExpectedSize.put(iel.h.class, new k8b.e(bVarN));
        builderBuilderWithExpectedSize.put(iel.c.class, new k8b.c());
        builderBuilderWithExpectedSize.put(iel.m.class, new k8b.l());
        builderBuilderWithExpectedSize.put(iel.g.class, new k8b.l());
        builderBuilderWithExpectedSize.put(iel.q.class, new k8b.l());
        builderBuilderWithExpectedSize.put(iel.r.class, new k8b.h());
        builderBuilderWithExpectedSize.put(iel.k.class, new k8b.f());
        return new ib7.j(builderBuilderWithExpectedSize.build(), 1);
    }

    @Override // xki.e
    public final Set f() {
        i7d.o oVar = (i7d.o) this.d.get();
        h7d.e.a(oVar);
        return ImmutableSet.of(oVar);
    }

    @Override // xki.e
    public final Set g() {
        i7d.n nVar = (i7d.n) this.e.get();
        h7d.c.a(nVar);
        return ImmutableSet.of(nVar);
    }
}

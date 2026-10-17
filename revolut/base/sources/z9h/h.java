package z9h;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.impl.ui.screens.popularassets.PopularAssetsControllerContract$InputData;
import java.util.Set;
import vc.s;
import z0g.k0;
import z0h.s1;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements sch.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o5d.b f320430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s1 f320431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PopularAssetsControllerContract$InputData f320432c;
    public final d d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f320433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f320434h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f320435j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f320436l;

    public h(d dVar, PopularAssetsControllerContract$InputData popularAssetsControllerContract$InputData, o5d.b bVar, s1 s1Var) {
        this.d = dVar;
        this.f320430a = bVar;
        this.f320431b = s1Var;
        this.f320432c = popularAssetsControllerContract$InputData;
        this.e = e4m.b.b(new k0(dVar, this, 1, 16));
        this.f = e4m.b.b(new k0(dVar, this, 0, 16));
        this.f320433g = e4m.b.b(new k0(dVar, this, 2, 16));
        this.f320434h = e4m.b.b(new k0(dVar, this, 3, 16));
        this.i = e4m.b.b(new k0(dVar, this, 4, 16));
        this.f320435j = e4m.b.b(new k0(dVar, this, 6, 16));
        this.k = e4m.b.b(new k0(dVar, this, 7, 16));
        this.f320436l = e4m.b.b(new k0(dVar, this, 5, 16));
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(3);
        builderBuilderWithExpectedSize.add(this.f320434h.get());
        builderBuilderWithExpectedSize.addAll((Iterable) this.i.get());
        aah.h hVar = (aah.h) this.f320433g.get();
        a0k.b.n(hVar);
        builderBuilderWithExpectedSize.add(hVar);
        return builderBuilderWithExpectedSize.build();
    }

    @Override // xki.e
    public final Set g() {
        yji.d dVar = (yji.d) this.f.get();
        aah.i iVarD = ((u8h.b) this.d.f320409t).d();
        s.j(iVarD);
        return ImmutableSet.of((aah.g) dVar, a0k.b.l(iVarD, this.f320431b, (aah.h) this.f320433g.get()));
    }
}

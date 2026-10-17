package z52;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.iris.api.navigation.IrisNavigation$InputData;
import java.util.Set;
import z0g.k0;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IrisNavigation$InputData f319453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f319454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f319455c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f319456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f319457h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f319458j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f319459l;

    public m(j jVar, IrisNavigation$InputData irisNavigation$InputData) {
        this.f319454b = jVar;
        this.f319453a = irisNavigation$InputData;
        int i = 7;
        this.d = e4m.b.b(new k0(jVar, this, 1, i));
        this.e = e4m.b.b(new k0(jVar, this, 0, i));
        this.f = e4m.b.b(new k0(jVar, this, 3, i));
        this.f319456g = e4m.b.b(new k0(jVar, this, 4, i));
        this.f319457h = e4m.b.b(new k0(jVar, this, 5, i));
        this.i = e4m.b.b(new k0(jVar, this, 2, i));
        this.f319458j = e4m.b.b(new k0(jVar, this, 6, i));
        this.k = e4m.b.b(new k0(jVar, this, 8, i));
        this.f319459l = e4m.b.b(new k0(jVar, this, 7, i));
    }

    public final a62.d b() {
        j jVar = this.f319454b;
        sf0.h hVarB = jVar.f.b();
        vc.s.j(hVarB);
        v60.e eVarA = jVar.f319436g.a();
        vc.s.j(eVarA);
        return new a62.d(hVarB, eVarA);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}

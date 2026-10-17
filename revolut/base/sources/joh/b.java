package joh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth_discovery.impl.collection.most_traded.MostTradedAssetsScreenContract$InputData;
import java.util.Set;
import jm4.z3;
import z0h.s1;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f176970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MostTradedAssetsScreenContract$InputData f176971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f176972c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public b(a aVar, MostTradedAssetsScreenContract$InputData mostTradedAssetsScreenContract$InputData, s1 s1Var) {
        this.f176972c = aVar;
        this.f176970a = s1Var;
        this.f176971b = mostTradedAssetsScreenContract$InputData;
        this.d = e4m.b.b(new z3(aVar, this, 0, 14));
        this.e = e4m.b.b(new z3(aVar, this, 2, 14));
        this.f = e4m.b.b(new z3(aVar, this, 1, 14));
    }

    @Override // xki.e
    public final Set f() {
        aah.h hVar = (aah.h) this.d.get();
        a0k.b.n(hVar);
        return ImmutableSet.of(hVar);
    }

    @Override // xki.e
    public final Set g() {
        aah.i iVarD = ((u8h.b) this.f176972c.f176955a).d();
        vc.s.j(iVarD);
        return ImmutableSet.of(a0k.b.l(iVarD, this.f176970a, (aah.h) this.d.get()));
    }
}

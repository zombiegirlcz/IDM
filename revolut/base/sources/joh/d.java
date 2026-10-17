package joh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth_discovery.impl.collection.top_movers.TopMoversScreenContract$InputData;
import java.util.Set;
import jm4.z3;
import z0h.s1;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f176976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TopMoversScreenContract$InputData f176977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f176978c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public d(a aVar, TopMoversScreenContract$InputData topMoversScreenContract$InputData, s1 s1Var) {
        this.f176978c = aVar;
        this.f176976a = s1Var;
        this.f176977b = topMoversScreenContract$InputData;
        this.d = e4m.b.b(new z3(aVar, this, 0, 16));
        this.e = e4m.b.b(new z3(aVar, this, 2, 16));
        this.f = e4m.b.b(new z3(aVar, this, 1, 16));
    }

    @Override // xki.e
    public final Set f() {
        aah.h hVar = (aah.h) this.d.get();
        a0k.b.n(hVar);
        return ImmutableSet.of(hVar);
    }

    @Override // xki.e
    public final Set g() {
        aah.i iVarD = ((u8h.b) this.f176978c.f176955a).d();
        vc.s.j(iVarD);
        return ImmutableSet.of(a0k.b.l(iVarD, this.f176976a, (aah.h) this.d.get()));
    }
}

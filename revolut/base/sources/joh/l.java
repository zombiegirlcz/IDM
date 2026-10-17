package joh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_collections_redesign.page.ScreenerCollectionsPageContract$InputData;
import java.util.Set;
import jm4.z3;
import z0h.s1;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f177024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScreenerCollectionsPageContract$InputData f177025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f177026c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public l(w wVar, ScreenerCollectionsPageContract$InputData screenerCollectionsPageContract$InputData, s1 s1Var) {
        this.f177026c = wVar;
        this.f177024a = s1Var;
        this.f177025b = screenerCollectionsPageContract$InputData;
        int i = 20;
        this.d = e4m.b.b(new z3(wVar, this, 0, i));
        this.e = e4m.b.b(new z3(wVar, this, 2, i));
        this.f = e4m.b.b(new z3(wVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        aah.h hVar = (aah.h) this.d.get();
        a0k.b.n(hVar);
        return ImmutableSet.of(hVar);
    }

    @Override // xki.e
    public final Set g() {
        aah.i iVarD = ((u8h.b) this.f177026c.f177071h).d();
        vc.s.j(iVarD);
        return ImmutableSet.of(a0k.b.l(iVarD, this.f177024a, (aah.h) this.d.get()));
    }
}

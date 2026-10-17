package y77;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.global_markets.impl.ui.redesign.screen.collection_details.GlobalMarketsCollectionScreenContract$InputData;
import java.util.Set;
import vc.s;
import xsl.q;
import z0h.s1;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f311358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GlobalMarketsCollectionScreenContract$InputData f311359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f311360c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public b(c cVar, GlobalMarketsCollectionScreenContract$InputData globalMarketsCollectionScreenContract$InputData, s1 s1Var) {
        this.f311360c = cVar;
        this.f311358a = s1Var;
        this.f311359b = globalMarketsCollectionScreenContract$InputData;
        int i = 10;
        this.d = e4m.b.b(new q(cVar, this, 0, i));
        this.e = e4m.b.b(new q(cVar, this, 2, i));
        this.f = e4m.b.b(new q(cVar, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        aah.h hVar = (aah.h) this.d.get();
        a0k.b.n(hVar);
        return ImmutableSet.of(hVar);
    }

    @Override // xki.e
    public final Set g() {
        aah.i iVarD = ((u8h.b) this.f311360c.f311366j).d();
        s.j(iVarD);
        return ImmutableSet.of(a0k.b.l(iVarD, this.f311358a, (aah.h) this.d.get()));
    }
}

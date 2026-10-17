package iab;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.junior.pricing_plans.impl.data.service.JuniorPricingPlansService;
import ffk.t;
import hy1.g;
import ne0.j;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f159980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f159981b;

    public a(b bVar, int i) {
        this.f159980a = bVar;
        this.f159981b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f159980a;
        nj0.a aVar = bVar.f159982a;
        ee0.a aVar2 = bVar.f159983b;
        int i = this.f159981b;
        if (i == 0) {
            gab.c cVar = new gab.c((JuniorPricingPlansService) bVar.e.get(), (ue0.c) bVar.f.get(), (j) bVar.f159985g.get());
            t tVarF = bVar.d.f();
            s.j(tVarF);
            return new jab.a(cVar, tVarF);
        }
        if (i == 1) {
            ik0.b bVarM = ((nj0.d) aVar).m();
            s.j(bVarM);
            return f.a(((nj0.d) aVar).d(), bVarM);
        }
        if (i != 2) {
            if (i == 3) {
                return e.a();
            }
            if (i == 4) {
                return new if0.a(ImmutableSet.of((od0.e) bVar.f.get()));
            }
            throw new AssertionError(i);
        }
        je0.d dVarD = aVar2.d();
        s.j(dVarD);
        yk0.a aVarB = bVar.f159984c.b();
        s.j(aVarB);
        xe0.f fVarF = aVar2.f();
        s.j(fVarF);
        return g.n(dVarD, fVarF, aVarB);
    }
}

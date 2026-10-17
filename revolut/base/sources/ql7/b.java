package ql7;

import com.revolut.feature.insurance_car.impl.data.network.InsuranceCarService;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f247235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f247236b;

    public b(c cVar, int i) {
        this.f247235a = cVar;
        this.f247236b = i;
    }

    @Override // phm.a
    public final Object get() {
        c cVar = this.f247235a;
        a aVar = cVar.f247249b;
        nj0.a aVar2 = cVar.f247248a;
        int i = this.f247236b;
        switch (i) {
            case 0:
                ll7.a aVar3 = (ll7.a) cVar.f247251g.get();
                ll7.v vVar = (ll7.v) cVar.k.get();
                kw7.c cVar2 = (kw7.c) cVar.d.k.get();
                vc.s.j(cVar2);
                return new rl7.e(aVar3, vVar, cVar2);
            case 1:
                InsuranceCarService insuranceCarService = (InsuranceCarService) cVar.e.get();
                ne0.j jVar = (ne0.j) cVar.f.get();
                ue0.c cVarA = aVar.a();
                vc.s.j(cVarA);
                return new ll7.h(insuranceCarService, jVar, cVarA);
            case 2:
                ik0.b bVarM = ((nj0.d) aVar2).m();
                vc.s.j(bVarM);
                return l2.a(((nj0.d) aVar2).d(), bVarM);
            case 3:
                return new ne0.d();
            case 4:
                InsuranceCarService insuranceCarService2 = (InsuranceCarService) cVar.e.get();
                ne0.j jVar2 = (ne0.j) cVar.f.get();
                ue0.c cVarA2 = aVar.a();
                vc.s.j(cVarA2);
                return new ll7.e0(insuranceCarService2, jVar2, cVarA2, (ll7.l) cVar.i.get(), (String) cVar.f247253j.get());
            case 5:
                return new ll7.l((CoroutineScope) cVar.f247252h.get(), qgh.c.i(cVar.f247250c));
            case 6:
                return k2.a();
            case 7:
                return qgh.c.n(((nj0.d) aVar2).f());
            default:
                throw new AssertionError(i);
        }
    }
}

package exk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.trading_hours.impl.data.network.TradingHoursService;
import e4m.e;
import ne0.j;
import nj0.d;
import vc.s;
import xe0.f;
import ybl.k;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f130455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f130456b;

    public b(c cVar, int i) {
        this.f130455a = cVar;
        this.f130456b = i;
    }

    @Override // phm.a
    public final Object get() {
        c cVar = this.f130455a;
        int i = this.f130456b;
        switch (i) {
            case 0:
                return new fxk.a((zwk.a) cVar.f130462j.get());
            case 1:
                return new zwk.a((TradingHoursService) cVar.f130460g.get(), (ue0.c) cVar.f130461h.get(), (j) cVar.i.get());
            case 2:
                ik0.b bVarM = ((d) cVar.f130457a).m();
                s.j(bVarM);
                return axk.c.a(((d) cVar.f130457a).d(), bVarM);
            case 3:
                je0.d dVarD = cVar.f130458b.d();
                s.j(dVarD);
                yk0.a aVarB = cVar.f130459c.b();
                s.j(aVarB);
                f fVarF = cVar.f130458b.f();
                s.j(fVarF);
                return agk.b.z(dVarD, fVarF, aVarB);
            case 4:
                return new ne0.d();
            case 5:
                return new ixk.b();
            case 6:
                return new jxk.c();
            case 7:
                return new ywk.b();
            case 8:
                return new if0.a(ImmutableSet.of((od0.e) cVar.f130461h.get()));
            case 9:
                ybl.b bVarB = cVar.d.b();
                s.j(bVarB);
                k kVarD = cVar.e.d();
                s.j(kVarD);
                return new hxk.b(bVarB, kVarD, (fxk.a) cVar.k.get());
            default:
                throw new AssertionError(i);
        }
    }
}

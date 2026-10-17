package qh8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.junior_onboarding.impl.service.JuniorWorkflowService;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f246507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f246508b;

    public c(d dVar, int i) {
        this.f246507a = dVar;
        this.f246508b = i;
    }

    @Override // phm.a
    public final Object get() {
        d dVar = this.f246507a;
        ee0.a aVar = dVar.f246509a;
        nj0.a aVar2 = dVar.f246513h;
        int i = this.f246508b;
        if (i == 0) {
            return new if0.a(ImmutableSet.of((od0.e) dVar.f246514j.get()));
        }
        if (i == 1) {
            je0.d dVarD = aVar.d();
            vc.s.j(dVarD);
            yk0.a aVarB = dVar.f246510b.b();
            vc.s.j(aVarB);
            xe0.f fVarF = aVar.f();
            vc.s.j(fVarF);
            return qgh.c.p(dVarD, fVarF, aVarB);
        }
        if (i == 2) {
            wsg.n nVarB = dVar.f246511c.b();
            hj8.a aVarA = dVar.d.a();
            vc.s.j(aVarA);
            return new rh8.a(nVarB, aVarA, dVar.e.f());
        }
        if (i == 3) {
            return new wh8.j((JuniorWorkflowService) dVar.f246516m.get(), (ne0.j) dVar.f246517n.get(), (ue0.c) dVar.f246514j.get());
        }
        if (i != 4) {
            if (i == 5) {
                return new ne0.d();
            }
            throw new AssertionError(i);
        }
        ik0.b bVarM = ((nj0.d) aVar2).m();
        vc.s.j(bVarM);
        return y.a(((nj0.d) aVar2).d(), bVarM);
    }
}

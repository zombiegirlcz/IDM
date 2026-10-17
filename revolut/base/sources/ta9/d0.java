package ta9;

import com.revolut.feature.onboarding.impl.onboarding.service.OnboardingCountriesService;

/* JADX INFO: loaded from: classes13.dex */
public final class d0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f269195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f269196b;

    public d0(e0 e0Var, int i) {
        this.f269195a = e0Var;
        this.f269196b = i;
    }

    @Override // phm.a
    public final Object get() {
        e0 e0Var = this.f269195a;
        nj0.a aVar = e0Var.f269198a;
        ee0.a aVar2 = e0Var.f269199b;
        int i = this.f269196b;
        if (i == 0) {
            return new qb9.b((OnboardingCountriesService) e0Var.e.get(), (ne0.j) e0Var.f.get(), (ue0.c) e0Var.f269201g.get());
        }
        if (i == 1) {
            ik0.b bVarM = ((nj0.d) aVar).m();
            vc.s.j(bVarM);
            return s0.a(((nj0.d) aVar).d(), bVarM);
        }
        if (i == 2) {
            return new ne0.d();
        }
        if (i != 3) {
            if (i == 4) {
                return new qb9.d(e0Var.d.a());
            }
            throw new AssertionError(i);
        }
        xe0.f fVarF = aVar2.f();
        vc.s.j(fVarF);
        je0.d dVarD = aVar2.d();
        vc.s.j(dVarD);
        yk0.a aVarB = e0Var.f269200c.b();
        vc.s.j(aVarB);
        return t2d.c.y(dVarD, fVarF, aVarB);
    }
}

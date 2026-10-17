package ljl;

import com.revolut.sso.api.app_consent.RevolutSsoAppConsentDestination;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f195872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f195873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f195874c;

    public a(q0 q0Var, b bVar, int i) {
        this.f195872a = q0Var;
        this.f195873b = bVar;
        this.f195874c = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f195873b;
        int i = this.f195874c;
        if (i != 0) {
            if (i == 1) {
                return cdj.b.z(bVar.f195879b);
            }
            throw new AssertionError(i);
        }
        RevolutSsoAppConsentDestination.InputData inputData = bVar.f195878a;
        q0 q0Var = this.f195872a;
        return new com.revolut.sso.impl.ui.consent.app.b(inputData, (vil.f) q0Var.f196070n0.get(), (xjl.d) q0Var.m0.get(), new iql.a(), (bjl.p0) q0Var.H.get(), (xjl.i) q0Var.Z.get(), (rp0.g1) bVar.e.get());
    }
}

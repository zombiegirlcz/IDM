package fma;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class q implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f136216b;

    public /* synthetic */ q(c0 c0Var, int i) {
        this.f136215a = i;
        this.f136216b = c0Var;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f136215a) {
            case 0:
                c0 c0Var = this.f136216b;
                ji5.m mVarE = c0Var.H.e();
                vc.s.j(mVarE);
                j jVar = c0Var.f136067p;
                Set setG = jVar.g();
                am2.a aVarI = jVar.f136165a.i();
                oqk.b bVar = (oqk.b) c0Var.I.A.get();
                vc.s.j(bVar);
                ekg.g gVarB = c0Var.f136050a.b();
                uke.a aVar = (uke.a) ((ske.c) c0Var.J).f0.get();
                vc.s.j(aVar);
                x8h.k kVarD = c0Var.o.d();
                xv5.c cVarA = c0Var.K.a();
                vc.s.j(cVarA);
                hwl.c cVar = (hwl.c) c0Var.L.f156292b.get();
                vc.s.j(cVar);
                return new qna.s(mVarE, setG, aVarI, bVar, gVarB, aVar, kVarD, cVarA, cVar, new qna.t());
            default:
                return new com.revolut.feature.profile.impl.ui.profile.screens.auto_earn_rewards.a(new una.g(), this.f136216b.u0.c(), new iq6.a(), new hq6.a());
        }
    }
}

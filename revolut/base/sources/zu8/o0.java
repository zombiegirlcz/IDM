package zu8;

import com.revolut.feature.kyc.impl.introduction.IntroductionScreenContract$InputData;
import com.revolut.feature.rev_points.impl.ui.points_expiry.details.RevPointsExpiryDetailsScreenContract$InputData;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f325330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f325331b;

    public /* synthetic */ o0(Object obj2, int i) {
        this.f325330a = i;
        this.f325331b = obj2;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f325330a) {
            case 0:
                IntroductionScreenContract$InputData introductionScreenContract$InputData = ((p0) this.f325331b).f325336b;
                return new pw8.l(new com.revolut.feature.kyc.impl.introduction.a(introductionScreenContract$InputData), introductionScreenContract$InputData);
            case 1:
                IntroductionScreenContract$InputData introductionScreenContract$InputData2 = ((p0) this.f325331b).f325336b;
                return new pw8.l(new com.revolut.feature.kyc.impl.introduction.a(introductionScreenContract$InputData2), introductionScreenContract$InputData2);
            case 2:
                zwh.d dVar = (zwh.d) this.f325331b;
                return new gx.a(dVar.f325963a, dVar.f325964b, dVar.f325965c, dVar.d, 2);
            case 3:
                return new tyb.b(new tyb.c(((zxb.b) this.f325331b).f326102a));
            case 4:
                RevPointsExpiryDetailsScreenContract$InputData revPointsExpiryDetailsScreenContract$InputData = ((zxb.k) this.f325331b).f326186a;
                return new uzb.b(new uzb.c(revPointsExpiryDetailsScreenContract$InputData), revPointsExpiryDetailsScreenContract$InputData);
            case 5:
                zxb.e eVar = (zxb.e) this.f325331b;
                ajk.f fVarH = eVar.S.h();
                q06.l lVarA = eVar.f326132r.a();
                vc.s.j(lVarA);
                return new com.revolut.feature.rev_points.impl.ui.trophy_room.flow.a(fVarH, lVarA);
            case 6:
                zxb.j0 j0Var = (zxb.j0) this.f325331b;
                gte.a aVarB = j0Var.f326183a.b();
                vc.s.j(aVarB);
                xoj.a aVarA = j0Var.f326184b.a();
                vc.s.j(aVarA);
                jla.h hVarA = j0Var.f326185c.a();
                vgc.a aVarA2 = j0Var.d.a();
                vc.s.j(aVarA2);
                return new nyb.b(aVarB, aVarA, hVarA, aVarA2);
            case 7:
                szb.k kVar = new szb.k();
                zxb.k0 k0Var = (zxb.k0) this.f325331b;
                eub.k kVar2 = (eub.k) k0Var.Q.get();
                y21.c cVarC = ((c21.b) k0Var.f326195g).c();
                mre.c cVarB = k0Var.f326205p.b();
                vc.s.j(cVarB);
                return new szb.j(kVar, kVar2, cVarC, cVarB);
            case 8:
                eub.j jVar = (eub.j) ((zxb.n0) this.f325331b).f326228a.f326204o0.get();
                vc.s.j(jVar);
                return new hyb.c(jVar);
            default:
                zza.e eVar2 = (zza.e) this.f325331b;
                return new a0b.g(eVar2.f326642a, eVar2.f326643b, eVar2.f326644c, eVar2.d, eVar2.e, eVar2.f, eVar2.f326645g, 0);
        }
    }
}

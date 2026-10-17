package yg6;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jmrtd.lds.LDSFile;
import vkm.v1;
import xec.c0;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements pfe.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f313568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oe6.a f313569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f313570c;
    public final y91.b d;
    public final usc.a e;

    public x(wsg.n walletInteractor, oe6.a externalInstitutionsInteractor, h linkedAccountDataMapper, y91.b accountsProductFeatureChecker, usc.a accountSwitchInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(linkedAccountDataMapper, "linkedAccountDataMapper");
        Intrinsics.checkNotNullParameter(accountsProductFeatureChecker, "accountsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(accountSwitchInteractor, "accountSwitchInteractor");
        this.f313568a = walletInteractor;
        this.f313569b = externalInstitutionsInteractor;
        this.f313570c = linkedAccountDataMapper;
        this.d = accountsProductFeatureChecker;
        this.e = accountSwitchInteractor;
    }

    @Override // pfe.g
    public final Flow a() {
        return new v1(new v(this, null, 0));
    }

    @Override // pfe.g
    public final Flow d(sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        io3.i iVar = io3.i.EXTERNAL;
        akg.n nVarV = nim.a.v(nim.a.v(rd0.e.b(osg.b.g(this.f313568a, c8g.c.C(dataLoadingMode), null, null, iVar, null, null, null, LDSFile.EF_DG4_TAG)), new ye1.m(18)), new ye1.m(19));
        w4l.k kVarC = c8g.c.C(dataLoadingMode);
        xg6.j jVar = (xg6.j) this.f313569b;
        vkm.d dVarB = rd0.e.b(jVar.i(kVarC, oe6.b.f224551a));
        vkm.d dVarB2 = rd0.e.b(jVar.j(c8g.c.C(dataLoadingMode)));
        return rd0.e.e(nim.a.u(new y83.d((Continuation) null, this, 24), u0.m(u0.i(nVarV, dVarB, dVarB2), new v1(new c0(this.e, null, 3)))), h0.f322473a, new w(3, null));
    }
}

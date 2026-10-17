package lz1;

import com.revolut.feature.apm.core.impl.data.network.alias.AliasService;
import com.revolut.feature.apm.core.impl.data.network.consent.ApmConsentsService;
import com.revolut.feature.apm.core.impl.data.network.disputes.ApmDisputesService;
import com.revolut.feature.apm.core.impl.data.network.onboarding.ApmOnboardingService;
import com.revolut.feature.apm.core.impl.data.network.payment_authorisations.ApmPaymentAuthorisationsAmendmentService;
import com.revolut.feature.apm.core.impl.data.network.payment_authorisations.ApmPaymentAuthorisationsService;
import com.revolut.feature.apm.core.impl.data.network.settings.ApmRecipientSettingsService;
import com.revolut.feature.apm.core.impl.data.network.settings.ApmSettingsService;
import com.revolut.feature.apm.core.impl.data.network.transfer.ApmTransferService;
import iz1.q;
import kg.o;
import kotlinx.coroutines.CoroutineScope;
import lu7.m0;
import retrofit2.Retrofit;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class l implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f200871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f200872b;

    public l(m mVar, int i) {
        this.f200871a = mVar;
        this.f200872b = i;
    }

    @Override // phm.a
    public final Object get() {
        m mVar = this.f200871a;
        int i = this.f200872b;
        switch (i) {
            case 0:
                return c.a();
            case 1:
                return new ne0.d();
            case 2:
                je0.d dVarB = mVar.f200873a.b();
                s.j(dVarB);
                yk0.a aVarB = mVar.f200875b.b();
                s.j(aVarB);
                xe0.f fVarF = mVar.f200873a.f();
                s.j(fVarF);
                return m0.l(dVarB, fVarF, aVarB);
            case 3:
                xoj.a aVarA = mVar.f200877c.a();
                s.j(aVarA);
                gte.a aVarB2 = mVar.d.b();
                s.j(aVarB2);
                return new ty1.b(aVarA, aVarB2, mVar.e.a());
            case 4:
                return new ty1.e((uw1.c) mVar.u.get(), mVar.f.e());
            case 5:
                ApmOnboardingService apmOnboardingService = (ApmOnboardingService) mVar.f200893w.get();
                CoroutineScope coroutineScopeA = mVar.i.a();
                s.j(coroutineScopeA);
                return new iz1.h(apmOnboardingService, coroutineScopeA);
            case 6:
                return m0.i(mVar.f200880g, ((nj0.d) mVar.f200881h).f());
            case 7:
                return new oz1.c((iz1.b) mVar.z.get());
            case 8:
                return new iz1.b((ApmConsentsService) mVar.f200895y.get());
            case 9:
                return m0.g(mVar.f200880g, ((nj0.d) mVar.f200881h).f());
            case 10:
                return new vz1.a((ApmDisputesService) mVar.B.get());
            case 11:
                return m0.h(mVar.f200880g, ((nj0.d) mVar.f200881h).f());
            case 12:
                ay9.b bVar = (ay9.b) mVar.f200883j.i.get();
                s.j(bVar);
                return new oz1.l(bVar);
            case 13:
                ApmTransferService apmTransferService = (ApmTransferService) mVar.E.get();
                CoroutineScope coroutineScopeA2 = mVar.i.a();
                s.j(coroutineScopeA2);
                return new q(apmTransferService, coroutineScopeA2, mVar.k.b());
            case 14:
                return m0.o(mVar.f200880g, ((nj0.d) mVar.f200881h).f());
            case 15:
                return new iz1.n((ApmTransferService) mVar.E.get());
            case 16:
                return new vz1.j((ue0.c) mVar.f200892t.get());
            case 17:
                return new iz1.l((ApmRecipientSettingsService) mVar.I.get());
            case 18:
                return m0.m(mVar.f200880g, ((nj0.d) mVar.f200881h).f());
            case 19:
                return new iz1.m((ApmSettingsService) mVar.M.get());
            case 20:
                return m0.n(mVar.f200880g, (Retrofit) mVar.L.get());
            case 21:
                g gVar = mVar.f200880g;
                ik0.b bVarM = ((nj0.d) mVar.f200881h).m();
                s.j(bVarM);
                return h.a(gVar, bVarM, i.a(mVar.f200880g, (o) mVar.K.get()));
            case 22:
                g gVar2 = mVar.f200880g;
                o oVarH = ((c21.b) mVar.f200885l).h();
                s.j(oVarH);
                return m0.r(gVar2, oVarH);
            case 23:
                qz1.c cVar = (qz1.c) mVar.O.get();
                vv9.c cVarC = ((s6k.b) mVar.f200886m).c();
                s.j(cVarC);
                return new pz1.c(cVar, cVarC);
            case 24:
                return new qz1.c(sg8.j.f(((nj0.d) mVar.f200881h).f()), mVar.f.e());
            case 25:
                e4m.e eVar = mVar.Q;
                ee0.a aVar = mVar.f200873a;
                AliasService aliasService = (AliasService) eVar.get();
                ne0.j jVar = (ne0.j) mVar.f200891s.get();
                yk0.a aVarB3 = mVar.f200875b.b();
                s.j(aVarB3);
                xe0.f fVarF2 = aVar.f();
                s.j(fVarF2);
                je0.d dVarD = aVar.d();
                s.j(dVarD);
                return new uy1.b(aliasService, jVar, aVarB3, fVarF2, dVarD);
            case 26:
                return m0.f(mVar.f200880g, ((nj0.d) mVar.f200881h).f());
            case 27:
                return new com.revolut.feature.apm.core.impl.crypto.h(mVar.f.e(), mVar.f200887n.c(), fe0.c.a());
            case 28:
                return new uy1.m(mVar.a());
            case 29:
                return m0.c((uy1.b) mVar.R.get());
            case 30:
                return m0.d((uy1.b) mVar.R.get());
            case 31:
                return m0.e((uy1.b) mVar.R.get());
            case 32:
                return m0.w(mVar.a(), (vw1.b) mVar.U.get());
            case 33:
                return m0.x(mVar.a(), (vw1.b) mVar.V.get());
            case 34:
                return m0.C(mVar.a(), (vw1.b) mVar.W.get());
            case 35:
                return new kz1.b((sri.m) mVar.Z.get());
            case 36:
                return m0.v(mVar.o);
            case 37:
                return new kz1.h((sri.m) mVar.Z.get());
            case 38:
                return new kz1.c((sri.m) mVar.Z.get());
            case 39:
                return new kz1.e((sri.m) mVar.Z.get());
            case 40:
                return new kz1.i((sri.m) mVar.Z.get(), (oz1.a) mVar.f200879e0.get());
            case 41:
                return new oz1.a();
            case 42:
                return new kz1.g((ax1.a) mVar.P.get(), (sri.m) mVar.Z.get(), (uw1.c) mVar.u.get());
            case 43:
                return new vz1.g((ApmPaymentAuthorisationsService) mVar.f200882h0.get(), (ne0.j) mVar.i0.get());
            case 44:
                return m0.k(mVar.f200880g, ((nj0.d) mVar.f200881h).f());
            case 45:
                return new iz1.j((ApmPaymentAuthorisationsAmendmentService) mVar.f200884k0.get());
            case 46:
                return m0.j(mVar.f200880g, ((nj0.d) mVar.f200881h).f());
            case 47:
                zja.a aVarA2 = ((ika.b) mVar.f200888p).a();
                s.j(aVarA2);
                return new uz1.b(aVarA2, (uw1.c) mVar.u.get());
            default:
                throw new AssertionError(i);
        }
    }
}

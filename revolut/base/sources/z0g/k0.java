package z0g;

import android.content.Context;
import bq5.k1;
import bq5.n1;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.core.models.transfers.ApmPaymentProfile;
import com.revolut.feature.apm.iris.api.navigation.IrisNavigation$InputData;
import com.revolut.feature.apm.iris.impl.data.IrisPayService;
import com.revolut.feature.apm.iris.impl.ui.pay.IrisPayFlowContract$InputData;
import com.revolut.feature.card_screen.impl.kompot.cards_list.screen.CardsListScreenContract$InputData;
import com.revolut.feature.card_screen.impl.kompot.reactivate.chargeback.TerminatedCardChargebackScreenContract$InputData;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoAddBeneficiaryInput;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoBeneficiaryDetailsScreenContract$InputData;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoSendInput;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.CryptoCreateBeneficiaryScreenContract$InputData;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.CryptoSendWalletsListControllerContract$InputData;
import com.revolut.feature.junior.account_activation.impl.ui.flow.activation.AccountActivationFlowContract$InputData;
import com.revolut.feature.junior_coparent.impl.ui.invitation.CoparentInvitationFlowContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.search.TravelExperiencesSearchScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.TravelExperiencesDatesSelectionScreenContract$InputData;
import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$InputData;
import com.revolut.feature.wealth.assetdetails.ui.impl.investments.screen.InvestmentsControllerContract$InputData;
import com.revolut.feature.wealth.assetdetails.ui.impl.ratings.details.RatingsDetailsScreenContract$InputData;
import com.revolut.feature.wealth.impl.ui.flows.add_money.composite.CompositeAddMoneyFlowContract$Input;
import com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.RecurringDepositDetailsViewControllerContract$Input;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rp0.z1;
import z0h.q1;

/* JADX INFO: loaded from: classes9.dex */
public final class k0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f318397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f318398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f318399c;
    public final Object d;

    public /* synthetic */ k0(Object obj2, Object obj3, int i, int i2) {
        this.f318397a = i2;
        this.f318398b = obj2;
        this.d = obj3;
        this.f318399c = i;
    }

    private final Object a() {
        z9h.d dVar = (z9h.d) this.f318398b;
        z9h.i iVar = (z9h.i) this.d;
        int i = this.f318399c;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) iVar.f320441h.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) iVar.f.get(), (rp0.m) iVar.f320440g.get());
            case 2:
                return new rp0.m();
            case 3:
                v1h.b extensions = (v1h.b) iVar.f320442j.get();
                Intrinsics.checkNotNullParameter(extensions, "extensions");
                return extensions.f285316a;
            case 4:
                h9h.a aVar = dVar.f320396a;
                return vtc.p0.m(new bdh.d(), iVar.f320437a);
            case 5:
                hbh.j jVarA = dVar.f320397b.a();
                vc.s.j(jVarA);
                return hy1.g.k(jVarA, iVar.f320438b, (h1h.b) iVar.f320443l.get());
            case 6:
                hbh.j jVarA2 = dVar.f320397b.a();
                vc.s.j(jVarA2);
                return hy1.g.l(jVarA2);
            case 7:
                f1h.c cVarA = dVar.f320398c.a();
                vc.s.j(cVarA);
                return fp8.c.s(cVarA, (f1h.f) iVar.f320445n.get(), (f1h.b) iVar.o.get());
            case 8:
                f1h.c cVarA2 = dVar.f320398c.a();
                vc.s.j(cVarA2);
                return fp8.c.t(cVarA2);
            case 9:
                v1h.b extensions2 = (v1h.b) iVar.f320442j.get();
                Intrinsics.checkNotNullParameter(extensions2, "extensions");
                return extensions2.f285317b;
            case 10:
                tch.q qVar = (tch.q) iVar.f320448r.get();
                tch.s sVar = (tch.s) iVar.f320450t.get();
                hpc.c cVar = (hpc.c) iVar.u.get();
                j60.a aVar2 = (j60.a) iVar.f320441h.get();
                t1j.b bVarG = dVar.f320396a.G();
                h1h.b bVar = (h1h.b) iVar.f320443l.get();
                RecurringDepositDetailsViewControllerContract$Input recurringDepositDetailsViewControllerContract$Input = iVar.d;
                z9h.d dVar2 = iVar.e;
                usg.a aVar3 = dVar2.d;
                h9h.a aVar4 = dVar2.f320396a;
                wsg.b bVarA = aVar3.a();
                wsg.n nVarB = aVar3.b();
                ppg.b bVarB = ((wpg.l) dVar2.e).b();
                vc.s.j(bVarB);
                djb.n nVarA = dVar2.f.a();
                vc.s.j(nVarA);
                g48.r0 r0VarC = dVar2.f320399g.c();
                gr6.m mVarB = dVar2.f320400h.b();
                vc.s.j(mVarB);
                al4.n nVarS = dVar2.i.s();
                vc.s.j(nVarS);
                gte.a aVarB = dVar2.f320401j.b();
                vc.s.j(aVarB);
                wzg.a aVarE = aVar4.e();
                vc.s.j(aVarE);
                ybl.l lVarF = aVar4.f();
                cm4.a aVarI = dVar2.k.i();
                sbh.a aVar5 = new sbh.a(dVar2.a());
                r10.q qVarD = dVar2.f320402l.d();
                ybl.k kVarD = dVar2.f320403m.d();
                vc.s.j(kVarD);
                return new com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.a(qVar, sVar, cVar, aVar2, bVarG, bVar, recurringDepositDetailsViewControllerContract$Input, new rbh.r(bVarA, nVarB, bVarB, nVarA, r0VarC, mVarB, nVarS, aVarB, aVarE, lVarF, aVarI, aVar5, qVarD, kVarD, aVar4.J(), new rbh.s()), new tch.b());
            case 11:
                uch.b.Companion.getClass();
                return new tch.q(null, null, null, null);
            case 12:
                tch.i iVar2 = new tch.i(new adh.h(), (s1h.a) iVar.f320449s.get());
                h9h.a aVar6 = dVar.f320396a;
                return new tch.j(iVar2, new bdh.e(), new tch.g((s1h.a) iVar.f320449s.get(), new tch.d()));
            case 13:
                gpc.a recurringDepositDependenciesApi = iVar.f320439c;
                uch.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(recurringDepositDependenciesApi, "recurringDepositDependenciesApi");
                nmc.d dVarD = recurringDepositDependenciesApi.f145430b.d();
                gte.a aVarB2 = recurringDepositDependenciesApi.f145431c.b();
                vc.s.j(aVarB2);
                return new hpc.b(dVarD, aVarB2);
            case 14:
                gpc.a recurringDepositDependenciesApi2 = iVar.f320439c;
                uch.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(recurringDepositDependenciesApi2, "recurringDepositDependenciesApi");
                return new hpc.c(recurringDepositDependenciesApi2.f145429a.a());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        zma.b bVar = (zma.b) this.f318398b;
        zma.a aVar = (zma.a) this.d;
        int i = this.f318399c;
        switch (i) {
            case 0:
                return new hqi.f(aVar.f323401b, bq.i.b(aVar.f323400a));
            case 1:
                ypi.h hVar = aVar.f323402c;
                fsi.g gVar = aVar.f323400a;
                return new ypi.e(hVar, bq.i.b(gVar), bq.i.o(gVar), bq.i.g(gVar));
            case 2:
                return new xpi.c(aVar.d, bq.i.b(aVar.f323400a));
            case 3:
                aVar.getClass();
                return new cn.d(ImmutableSet.copyOf((Collection) dn.b.a()), (cn.e) bVar.k.get(), bVar.d());
            case 4:
                um.c cVar = (um.c) bVar.f323423l.get();
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(5);
                zma.b bVar2 = aVar.e;
                hn.h hVar2 = (hn.h) bVar2.f323424m.get();
                t70.g gVarO = bVar2.f323418b.o();
                vc.s.j(gVarO);
                builderBuilderWithExpectedSize.add(new jn.a(hVar2, gVarO));
                builderBuilderWithExpectedSize.add(new vm.b(com.google.android.gms.internal.mlkit_vision_face.a.f()));
                builderBuilderWithExpectedSize.add(bVar2.h());
                builderBuilderWithExpectedSize.addAll((Iterable) in.g.a());
                builderBuilderWithExpectedSize.add(new jn.d(e4m.b.a(aVar.f323405j)));
                return new in.e(cVar, builderBuilderWithExpectedSize.build(), bVar.d());
            case 5:
                return bq.i.t(aVar.f323400a);
            case 6:
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize2 = ImmutableSet.builderWithExpectedSize(3);
                builderBuilderWithExpectedSize2.addAll((Iterable) kn.g.a());
                builderBuilderWithExpectedSize2.add(aVar.f323406l.get());
                builderBuilderWithExpectedSize2.add(new kn.h(e4m.b.a(aVar.f323408n)));
                return new kn.e(builderBuilderWithExpectedSize2.build(), (ym.d) bVar.o.get(), bVar.d());
            case 7:
                return new zm.a();
            case 8:
                return new tpi.i((rpi.c) aVar.f323407m.get(), gsi.c.a(aVar.f323400a));
            case 9:
                return new rpi.b(bq.i.b(aVar.f323400a));
            case 10:
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize3 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize3.addAll((Iterable) hn.g.a());
                builderBuilderWithExpectedSize3.add(aVar.e.h());
                return new hn.d(builderBuilderWithExpectedSize3.build(), (hn.h) bVar.f323424m.get(), (npi.f) aVar.f323409p.get());
            case 11:
                Context contextI = bq.i.i(aVar.f323400a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(aVar.f323400a);
                t70.g gVarO2 = bVar.f323418b.o();
                vc.s.j(gVarO2);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO2);
            case 12:
                return new en.c(ImmutableSet.of((ln.d) aVar.e.f323425n.get()), bq.i.l(aVar.f323400a));
            case 13:
                return new gn.c((lpi.e) aVar.f323412s.get(), (sm.e) bVar.f323427q.get(), ImmutableSet.copyOf((Collection) gn.e.a()), bVar.d());
            case 14:
                return new lpi.b(bq.i.i(aVar.f323400a), bq.i.j(aVar.f323400a));
            case 15:
                aVar.getClass();
                return new in.e(ImmutableSet.copyOf((Collection) pm.b.a()), (om.c) bVar.f323428r.get(), bVar.d());
            case 16:
                aVar.getClass();
                ImmutableSet.Builder builderBuilderWithExpectedSize4 = ImmutableSet.builderWithExpectedSize(2);
                builderBuilderWithExpectedSize4.addAll((Iterable) g3l.f.a());
                return new g3l.c(j6.a.g(aVar.e.f323433y, builderBuilderWithExpectedSize4), (g3l.g) bVar.f323432x.get(), (k3l.b) aVar.v.get(), bVar.d());
            case 17:
                return new k3l.d(bq.i.b(aVar.f323400a));
            case 18:
                return new rpi.h(bq.i.b(aVar.f323400a));
            case 19:
                return new iri.g((iri.j) bVar.f323422j.get(), (iri.m) bVar.f323430t.get(), bq.i.f(aVar.f323400a), bq.i.l(aVar.f323400a));
            case 20:
                return new iri.l((iri.m) bVar.f323430t.get(), bq.i.f(aVar.f323400a), (iri.d) aVar.z.get());
            case 21:
                return new iri.d(bq.i.f(aVar.f323400a));
            case 22:
                ana.g gVar2 = new ana.g((ypi.i) aVar.f323403g.get(), (xpi.g) aVar.f323404h.get(), (yma.p) bVar.v.get(), (rpi.c) aVar.f323407m.get(), (tpi.j) aVar.f323408n.get());
                kli.a.p(gVar2, bq.i.d(aVar.f323400a));
                return gVar2;
            case 23:
                o3l.d presentationModel = (o3l.d) bVar.u.get();
                hqi.l toolbarView = (hqi.l) aVar.f.get();
                p3l.a buttonPresenterDelegate = (p3l.a) aVar.C.get();
                o3l.e router = (o3l.e) bVar.f323431w.get();
                zpi.c overlayAnimationView = (zpi.c) aVar.D.get();
                r70.c hapticEngine = bVar.f323418b.A();
                vc.s.j(hapticEngine);
                Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
                Intrinsics.checkNotNullParameter(toolbarView, "toolbarView");
                Intrinsics.checkNotNullParameter(buttonPresenterDelegate, "buttonPresenterDelegate");
                Intrinsics.checkNotNullParameter(router, "router");
                Intrinsics.checkNotNullParameter(overlayAnimationView, "overlayAnimationView");
                Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
                return new yma.i(toolbarView, buttonPresenterDelegate, presentationModel, router, overlayAnimationView, hapticEngine);
            case 24:
                return new p3l.a((ypi.i) aVar.f323403g.get(), (o3l.d) bVar.u.get());
            case 25:
                return new zpi.b(bq.i.b(aVar.f323400a));
            case 26:
                yma.a0 a0Var = new yma.a0(bq.i.l(aVar.f323400a), (yma.b) bVar.f323433y.get(), (yma.p) bVar.v.get(), (xpi.g) aVar.f323404h.get(), (ypi.i) aVar.f323403g.get(), (f9b.f) aVar.f323405j.get(), (msb.a) aVar.F.get(), (tpi.j) aVar.f323408n.get());
                kli.a.p(a0Var, bq.i.d(aVar.f323400a));
                return a0Var;
            case 27:
                return ms1.g.D(aVar.f323400a);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        zo5.d dVar = (zo5.d) this.f318398b;
        zo5.f fVar = (zo5.f) this.d;
        zo5.d dVar2 = fVar.f323906b;
        int i = this.f318399c;
        if (i != 0) {
            if (i == 1) {
                return new eq5.i0();
            }
            if (i == 2) {
                return new zp5.d();
            }
            throw new AssertionError(i);
        }
        CryptoSendInput cryptoSendInput = fVar.f323905a;
        lo5.p pVarB = ((yo5.w) dVar.f323886b).b();
        vc.s.j(pVarB);
        eq5.i0 i0Var = (eq5.i0) fVar.d.get();
        gte.a aVarB = dVar.f323888g.b();
        vc.s.j(aVarB);
        zp5.h hVar = new zp5.h(dVar2.k.a());
        agf.b bVarA = ((dgf.a) dVar.f323891l).a();
        vc.s.j(bVarA);
        zq5.c cVar = new zq5.c(dVar2.d.a(), dVar2.e.a());
        go5.e cryptoWithdrawDependenciesConfig = dVar2.k.a();
        Intrinsics.checkNotNullParameter(cryptoWithdrawDependenciesConfig, "cryptoWithdrawDependenciesConfig");
        return new com.revolut.feature.crypto.withdraw.impl.ui_v3.a(cryptoSendInput, pVarB, i0Var, aVarB, hVar, bVarA, cVar, new zp5.a(), dVar.f323892m.g());
    }

    private final Object d() {
        zo5.d dVar = (zo5.d) this.f318398b;
        go5.c cVar = dVar.f323886b;
        zo5.j jVar = (zo5.j) this.d;
        CryptoSendWalletsListControllerContract$InputData cryptoSendWalletsListControllerContract$InputData = jVar.f323914a;
        zo5.d dVar2 = jVar.f323915b;
        int i = this.f318399c;
        switch (i) {
            case 0:
                Object model = (kq5.b) jVar.f323916c.get();
                lq5.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                yji.n nVar = (yji.n) model;
                vc.s.k(nVar);
                return nVar;
            case 1:
                kq5.c cVar2 = new kq5.c();
                ap5.b bVarE = ((yo5.w) cVar).e();
                vc.s.j(bVarE);
                return new kq5.e(cVar2, bVarE);
            case 2:
                cr5.a model2 = (cr5.a) jVar.e.get();
                dr5.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                vc.s.k(model2);
                return model2;
            case 3:
                return new cr5.e(cryptoSendWalletsListControllerContract$InputData, ((b3j.p) dVar.B).e(), new zq5.c(dVar2.d.a(), dVar2.e.a()));
            case 4:
                er5.e model3 = (er5.e) jVar.f323917g.get();
                fr5.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(model3, "model");
                vc.s.k(model3);
                return model3;
            case 5:
                CryptoSendWalletsListControllerContract$InputData cryptoSendWalletsListControllerContract$InputData2 = jVar.f323914a;
                c70.a aVarZ = dVar.f323893n.z();
                vc.s.j(aVarZ);
                ap5.b bVarE2 = ((yo5.w) cVar).e();
                vc.s.j(bVarE2);
                kq5.b bVar = (kq5.b) jVar.f323916c.get();
                po5.a aVarD = ((yo5.w) cVar).d();
                vc.s.j(aVarD);
                pn5.a aVar = (pn5.a) ((on5.a) dVar.f323889h).f226911a.get();
                vc.s.j(aVar);
                return new er5.d(cryptoSendWalletsListControllerContract$InputData2, aVarZ, bVarE2, bVar, aVarD, aVar, ((ak5.i) dVar.f).a());
            case 6:
                gr5.c cVar3 = new gr5.c(cryptoSendWalletsListControllerContract$InputData);
                gr5.b bVar2 = new gr5.b();
                gr5.a aVarB = jVar.b();
                sj5.b bVar3 = (sj5.b) ((ak5.i) dVar2.f).f5693h.get();
                vc.s.j(bVar3);
                zq5.d0 d0Var = new zq5.d0(cryptoSendWalletsListControllerContract$InputData, cVar3, bVar2, new ir5.c(aVarB, bVar3), new hr5.a(((b3j.p) dVar2.B).g(), jVar.b()));
                CryptoSendWalletsListControllerContract$InputData cryptoSendWalletsListControllerContract$InputData3 = jVar.f323914a;
                xx9.p pVarB = dVar.D.b();
                vc.s.j(pVarB);
                k4a.v vVar = (k4a.v) ((s3a.k) dVar.C).l0.get();
                vc.s.j(vVar);
                go5.e eVarA = dVar.k.a();
                ir5.a aVar2 = new ir5.a();
                hr5.b bVar4 = new hr5.b();
                cr5.a aVar3 = (cr5.a) jVar.e.get();
                er5.e eVar = (er5.e) jVar.f323917g.get();
                zq5.j0 j0Var = new zq5.j0();
                CryptoSendWalletsListControllerContract$InputData cryptoSendWalletsListControllerContract$InputData4 = jVar.f323914a;
                po5.a aVarD2 = ((yo5.w) dVar2.f323886b).d();
                vc.s.j(aVarD2);
                pn5.a aVar4 = (pn5.a) ((on5.a) dVar2.f323889h).f226911a.get();
                vc.s.j(aVar4);
                return new com.revolut.feature.crypto.withdraw.impl.ui_v3.walletslist.a(d0Var, cryptoSendWalletsListControllerContract$InputData3, pVarB, vVar, eVarA, aVar2, bVar4, aVar3, eVar, j0Var, new zq5.l(cryptoSendWalletsListControllerContract$InputData4, aVarD2, aVar4, ((ak5.i) dVar2.f).a(), new zq5.j0()), new zq5.m());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        zo5.l lVar = (zo5.l) this.d;
        zo5.d dVar = lVar.f323924c;
        zo5.d dVar2 = (zo5.d) this.f318398b;
        in5.a aVar = dVar2.f323889h;
        go5.c cVar = dVar2.f323886b;
        int i = this.f318399c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            CryptoCreateBeneficiaryScreenContract$InputData cryptoCreateBeneficiaryScreenContract$InputData = lVar.f323923b;
            gte.a aVarB = dVar2.f323888g.b();
            vc.s.j(aVarB);
            return new n1(cryptoCreateBeneficiaryScreenContract$InputData, aVarB);
        }
        jp5.a aVar2 = new jp5.a();
        ak5.a aVar3 = dVar.f;
        ik5.d dVarC = ((ak5.i) aVar3).c();
        vc.s.j(dVarC);
        uj5.a aVarB2 = ((ak5.i) aVar3).b();
        vc.s.j(aVarB2);
        mo5.a aVarC = ((yo5.w) dVar.f323886b).c();
        vc.s.j(aVarC);
        ac4.g gVar = new ac4.g(new bq5.g(aVar2, dVarC, aVarB2, aVarC), lVar.b(), new jp5.b(), (k1) lVar.d.get());
        CryptoCreateBeneficiaryScreenContract$InputData cryptoCreateBeneficiaryScreenContract$InputData2 = lVar.f323923b;
        po5.a aVarD = ((yo5.w) cVar).d();
        vc.s.j(aVarD);
        bk5.a aVarA = ((ak5.i) dVar2.f).a();
        pn5.a aVar4 = (pn5.a) ((on5.a) aVar).f226911a.get();
        vc.s.j(aVar4);
        ap5.b bVarE = ((yo5.w) cVar).e();
        vc.s.j(bVarE);
        jid.z zVar = new jid.z(new lp5.c(), ImmutableMap.of("RIPPLE", (lp5.b) new lp5.d(), "STELLAR", new lp5.b()));
        mo5.a aVarC2 = ((yo5.w) dVar.f323886b).c();
        vc.s.j(aVarC2);
        bq5.a aVar5 = new bq5.a(aVarC2, lVar.b());
        qn5.b bVar = (qn5.b) ((on5.a) aVar).f226912b.get();
        vc.s.j(bVar);
        return new com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a(gVar, cryptoCreateBeneficiaryScreenContract$InputData2, aVarD, aVarA, aVar4, bVarE, zVar, aVar5, bVar, new l7l.b(), new i4b.f(new l7l.b()), dVar2.f323890j.e(), lVar.b(), new se5.a(), (k1) lVar.d.get());
    }

    private final Object f() {
        zo5.l lVar = (zo5.l) this.d;
        zo5.d dVar = lVar.f323924c;
        zo5.d dVar2 = (zo5.d) this.f318398b;
        int i = this.f318399c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            CryptoCreateBeneficiaryScreenContract$InputData cryptoCreateBeneficiaryScreenContract$InputData = lVar.f323923b;
            gte.a aVarB = dVar2.f323888g.b();
            vc.s.j(aVarB);
            return new n1(cryptoCreateBeneficiaryScreenContract$InputData, aVarB);
        }
        jp5.a aVar = new jp5.a();
        ik5.d dVarC = ((ak5.i) dVar.f).c();
        vc.s.j(dVarC);
        uj5.a aVarB2 = ((ak5.i) dVar.f).b();
        vc.s.j(aVarB2);
        mo5.a aVarC = ((yo5.w) dVar.f323886b).c();
        vc.s.j(aVarC);
        ac4.g gVar = new ac4.g(new bq5.g(aVar, dVarC, aVarB2, aVarC), lVar.b(), new jp5.b(), (k1) lVar.d.get());
        CryptoCreateBeneficiaryScreenContract$InputData cryptoCreateBeneficiaryScreenContract$InputData2 = lVar.f323923b;
        go5.c cVar = dVar2.f323886b;
        in5.a aVar2 = dVar2.f323889h;
        po5.a aVarD = ((yo5.w) cVar).d();
        vc.s.j(aVarD);
        bk5.a aVarA = ((ak5.i) dVar2.f).a();
        pn5.a aVar3 = (pn5.a) ((on5.a) aVar2).f226911a.get();
        vc.s.j(aVar3);
        ap5.b bVarE = ((yo5.w) dVar2.f323886b).e();
        vc.s.j(bVarE);
        jid.z zVar = new jid.z(new lp5.c(), ImmutableMap.of("RIPPLE", (lp5.b) new lp5.d(), "STELLAR", new lp5.b()));
        mo5.a aVarC2 = ((yo5.w) dVar.f323886b).c();
        vc.s.j(aVarC2);
        bq5.a aVar4 = new bq5.a(aVarC2, lVar.b());
        qn5.b bVar = (qn5.b) ((on5.a) aVar2).f226912b.get();
        vc.s.j(bVar);
        l7l.b bVar2 = new l7l.b();
        k7l.b bVar3 = dVar.i;
        return new com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a(gVar, cryptoCreateBeneficiaryScreenContract$InputData2, aVarD, aVarA, aVar3, bVarE, zVar, aVar4, bVar, bVar2, new i4b.f(new l7l.b()), dVar2.f323890j.e(), lVar.b(), new se5.a(), (k1) lVar.d.get());
    }

    private final Object g() {
        zo5.d dVar = (zo5.d) this.f318398b;
        go5.c cVar = dVar.f323886b;
        zo5.o oVar = (zo5.o) this.d;
        zo5.d dVar2 = oVar.f323933c;
        int i = this.f318399c;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) oVar.f.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) oVar.d.get(), (rp0.m) oVar.e.get());
            case 2:
                return new rp0.m();
            case 3:
                d2a.a model = (d2a.a) oVar.f323935h.get();
                hq5.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                vc.s.k(model);
                return model;
            case 4:
                p2a.a factory = dVar.f323885a.a();
                vc.s.j(factory);
                hq5.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a();
            case 5:
                Object model2 = (kq5.b) oVar.f323936j.get();
                lq5.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                yji.n nVar = (yji.n) model2;
                vc.s.k(nVar);
                return nVar;
            case 6:
                kq5.c cVar2 = new kq5.c();
                ap5.b bVarE = ((yo5.w) cVar).e();
                vc.s.j(bVarE);
                return new kq5.e(cVar2, bVarE);
            case 7:
                CryptoBeneficiaryDetailsScreenContract$InputData cryptoBeneficiaryDetailsScreenContract$InputData = oVar.f323932b;
                ap5.b bVarE2 = ((yo5.w) cVar).e();
                vc.s.j(bVarE2);
                whf.b bVarA = dVar.f323887c.a();
                vc.s.j(bVarA);
                r10.a aVar = new r10.a(new b6k.f(dVar2.d.b(), dVar2.e.a(), new j9l.a()), new b6k.d());
                gq5.o oVar2 = new gq5.o();
                jo5.a aVar2 = (jo5.a) ((yo5.w) cVar).J.get();
                vc.s.j(aVar2);
                j60.a aVar3 = (j60.a) oVar.f.get();
                se5.a aVar4 = new se5.a();
                kq5.b bVar = (kq5.b) oVar.f323936j.get();
                d2a.a aVar5 = (d2a.a) oVar.f323935h.get();
                CryptoBeneficiaryDetailsScreenContract$InputData cryptoBeneficiaryDetailsScreenContract$InputData2 = oVar.f323932b;
                ik5.d dVarC = ((ak5.i) dVar2.f).c();
                vc.s.j(dVarC);
                whf.n nVarB = dVar2.f323887c.b();
                vc.s.j(nVarB);
                op5.e eVarF = ((yo5.w) dVar2.f323886b).f();
                vc.s.j(eVarF);
                return new com.revolut.feature.crypto.withdraw.impl.ui_v3.beneficiarydetails.a(cryptoBeneficiaryDetailsScreenContract$InputData, bVarE2, bVarA, aVar, oVar2, aVar2, aVar3, aVar4, bVar, aVar5, new gq5.n(cryptoBeneficiaryDetailsScreenContract$InputData2, new iq5.c(dVarC, nVarB, eVarF, new b6k.c(), new r2a.b())));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object h() {
        zo5.d dVar = (zo5.d) this.f318398b;
        zo5.o oVar = (zo5.o) this.d;
        zo5.d dVar2 = oVar.f323933c;
        int i = this.f318399c;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) oVar.f.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) oVar.d.get(), (rp0.m) oVar.e.get());
            case 2:
                return new rp0.m();
            case 3:
                d2a.a model = (d2a.a) oVar.f323935h.get();
                hq5.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                vc.s.k(model);
                return model;
            case 4:
                p2a.a factory = dVar.f323885a.a();
                vc.s.j(factory);
                hq5.d.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a();
            case 5:
                Object model2 = (kq5.b) oVar.f323936j.get();
                lq5.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                yji.n nVar = (yji.n) model2;
                vc.s.k(nVar);
                return nVar;
            case 6:
                kq5.c cVar = new kq5.c();
                ap5.b bVarE = ((yo5.w) dVar.f323886b).e();
                vc.s.j(bVarE);
                return new kq5.e(cVar, bVarE);
            case 7:
                CryptoBeneficiaryDetailsScreenContract$InputData cryptoBeneficiaryDetailsScreenContract$InputData = oVar.f323932b;
                ap5.b bVarE2 = ((yo5.w) dVar.f323886b).e();
                vc.s.j(bVarE2);
                whf.b bVarA = dVar.f323887c.a();
                vc.s.j(bVarA);
                r10.a aVar = new r10.a(new b6k.f(dVar2.d.b(), dVar2.e.a(), new j9l.a()), new b6k.d());
                gq5.o oVar2 = new gq5.o();
                jo5.a aVar2 = (jo5.a) ((yo5.w) dVar.f323886b).J.get();
                vc.s.j(aVar2);
                j60.a aVar3 = (j60.a) oVar.f.get();
                se5.a aVar4 = new se5.a();
                kq5.b bVar = (kq5.b) oVar.f323936j.get();
                d2a.a aVar5 = (d2a.a) oVar.f323935h.get();
                CryptoBeneficiaryDetailsScreenContract$InputData cryptoBeneficiaryDetailsScreenContract$InputData2 = oVar.f323932b;
                ik5.d dVarC = ((ak5.i) dVar2.f).c();
                vc.s.j(dVarC);
                whf.n nVarB = dVar2.f323887c.b();
                vc.s.j(nVarB);
                op5.e eVarF = ((yo5.w) dVar2.f323886b).f();
                vc.s.j(eVarF);
                return new com.revolut.feature.crypto.withdraw.impl.ui_v3.beneficiarydetails.a(cryptoBeneficiaryDetailsScreenContract$InputData, bVarE2, bVarA, aVar, oVar2, aVar2, aVar3, aVar4, bVar, aVar5, new gq5.n(cryptoBeneficiaryDetailsScreenContract$InputData2, new iq5.c(dVarC, nVarB, eVarF, new b6k.c(), new r2a.b())));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        zpc.k kVar = (zpc.k) this.f318398b;
        zpc.a aVar = (zpc.a) this.d;
        int i = this.f318399c;
        switch (i) {
            case 0:
                irc.a extension = (irc.a) aVar.f324229a.get();
                hrc.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 1:
                ni0.f paymentCardRecognitionResultExtractor = new ni0.f();
                hrc.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(paymentCardRecognitionResultExtractor, "paymentCardRecognitionResultExtractor");
                return new irc.a(paymentCardRecognitionResultExtractor);
            case 2:
                return kxa.j.j((j60.a) aVar.e.get());
            case 3:
                return v1.c.r((com.revolut.kompot.navigable.a) aVar.f324231c.get(), (rp0.m) aVar.d.get());
            case 4:
                return new rp0.m();
            case 5:
                cli.n nVar = (cli.n) aVar.f324232g.get();
                wig.a aVar2 = new wig.a();
                j60.a aVar3 = (j60.a) aVar.f324233h.get();
                jrc.g gVar = new jrc.g(new jrc.a());
                aqc.k kVar2 = (aqc.k) kVar.G.get();
                u53.b bVar = (u53.b) kVar.f324261p.f21600c.get();
                vc.s.j(bVar);
                sf0.h hVarB = kVar.f324262q.b();
                vc.s.j(hVarB);
                v60.e eVarA = kVar.f324263r.a();
                vc.s.j(eVarA);
                return new grc.k(nVar, aVar2, aVar3, gVar, kVar2, bVar, hVarB, eVarA, (irc.a) aVar.f324229a.get(), kVar.f324257j.b());
            case 6:
                return new grc.l();
            case 7:
                j60.a extension2 = (j60.a) aVar.e.get();
                hrc.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                vc.s.k(extension2);
                return extension2;
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        Object aVar;
        Object eVar;
        zz1.h hVar;
        switch (this.f318397a) {
            case 0:
                l0 l0Var = (l0) this.d;
                b bVar = (b) this.f318398b;
                int i = this.f318399c;
                if (i != 0) {
                    if (i != 1) {
                        throw new AssertionError(i);
                    }
                    n8b.a aVarA = bVar.f318299a.a();
                    vc.s.j(aVarA);
                    return new k3g.p(aVarA);
                }
                jki.p pVar = (jki.p) l0Var.f318405c.get();
                hyf.d dVar = (hyf.d) bVar.I.get();
                TravelExperiencesSearchScreenContract$InputData travelExperiencesSearchScreenContract$InputData = l0Var.f318404b;
                hyf.b bVarC = bVar.f318307h.c();
                vc.s.j(bVarC);
                exf.c cVar = (exf.c) bVar.f318313n.f326328r.get();
                vc.s.j(cVar);
                return new k3g.o(pVar, dVar, travelExperiencesSearchScreenContract$InputData, bVarC, cVar);
            case 1:
                l0 l0Var2 = (l0) this.d;
                b bVar2 = (b) this.f318398b;
                int i2 = this.f318399c;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new AssertionError(i2);
                    }
                    n8b.a aVarA2 = bVar2.f318299a.a();
                    vc.s.j(aVarA2);
                    return new k3g.p(aVarA2);
                }
                jki.p pVar2 = (jki.p) l0Var2.f318405c.get();
                hyf.d dVar2 = (hyf.d) bVar2.I.get();
                TravelExperiencesSearchScreenContract$InputData travelExperiencesSearchScreenContract$InputData2 = l0Var2.f318404b;
                hyf.b bVarC2 = bVar2.f318307h.c();
                vc.s.j(bVarC2);
                exf.c cVar2 = (exf.c) bVar2.f318313n.f326328r.get();
                vc.s.j(cVar2);
                return new k3g.o(pVar2, dVar2, travelExperiencesSearchScreenContract$InputData2, bVarC2, cVar2);
            case 2:
                n0 n0Var = (n0) this.d;
                int i3 = this.f318399c;
                if (i3 != 0) {
                    if (i3 == 1) {
                        return new o3g.l();
                    }
                    throw new AssertionError(i3);
                }
                jki.p pVar3 = (jki.p) n0Var.f318420c.get();
                TravelExperiencesDatesSelectionScreenContract$InputData travelExperiencesDatesSelectionScreenContract$InputData = n0Var.f318419b;
                l80.e eVarH = ((b) this.f318398b).f318306g.h();
                vc.s.j(eVarH);
                return new com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.a(pVar3, travelExperiencesDatesSelectionScreenContract$InputData, eVarH);
            case 3:
                n0 n0Var2 = (n0) this.d;
                int i5 = this.f318399c;
                if (i5 != 0) {
                    if (i5 == 1) {
                        return new o3g.l();
                    }
                    throw new AssertionError(i5);
                }
                jki.p pVar4 = (jki.p) n0Var2.f318420c.get();
                TravelExperiencesDatesSelectionScreenContract$InputData travelExperiencesDatesSelectionScreenContract$InputData2 = n0Var2.f318419b;
                l80.e eVarH2 = ((b) this.f318398b).f318306g.h();
                vc.s.j(eVarH2);
                return new com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.a(pVar4, travelExperiencesDatesSelectionScreenContract$InputData2, eVarH2);
            case 4:
                n0 n0Var3 = (n0) this.d;
                int i6 = this.f318399c;
                if (i6 != 0) {
                    if (i6 == 1) {
                        return new o3g.l();
                    }
                    throw new AssertionError(i6);
                }
                jki.p pVar5 = (jki.p) n0Var3.f318420c.get();
                TravelExperiencesDatesSelectionScreenContract$InputData travelExperiencesDatesSelectionScreenContract$InputData3 = n0Var3.f318419b;
                l80.e eVarH3 = ((b) this.f318398b).f318306g.h();
                vc.s.j(eVarH3);
                return new com.revolut.feature.travel.experiences.impl.ui.screen.selection.dates.a(pVar5, travelExperiencesDatesSelectionScreenContract$InputData3, eVarH3);
            case 5:
                z3h.e eVar2 = (z3h.e) this.d;
                z3h.g gVar = (z3h.g) this.f318398b;
                int i21 = this.f318399c;
                if (i21 == 0) {
                    return oyj.c.f(gVar.a(), eVar2.f319271a, (n2h.a) eVar2.f.get());
                }
                if (i21 == 1) {
                    return oyj.c.h(gVar.a(), eVar2.f319272b, new kye.e((gdh.a) eVar2.e.get()));
                }
                if (i21 == 2) {
                    kbb.c factory = gVar.f319285l.a();
                    Intrinsics.checkNotNullParameter(factory, "factory");
                    return factory.s();
                }
                if (i21 != 3) {
                    throw new AssertionError(i21);
                }
                InvestmentsControllerContract$InputData investmentsControllerContract$InputData = eVar2.f319273c;
                n2h.a aVar2 = (n2h.a) eVar2.f.get();
                c4h.b bVarK = gVar.k();
                ybl.l lVarF = gVar.f319284j.f();
                z3h.g gVar2 = eVar2.d;
                return new com.revolut.feature.wealth.assetdetails.ui.impl.investments.screen.a(investmentsControllerContract$InputData, aVar2, bVarK, lVarF, new o4h.n(oyj.c.m(gVar2.a()), new kpj.f(gVar2.f319284j.H()), new ufl.b(new tfl.a())));
            case 6:
                z3h.f fVar = (z3h.f) this.d;
                int i22 = this.f318399c;
                if (i22 != 0) {
                    if (i22 == 1) {
                        return new y4h.i(new u4h.a(), new u4h.b());
                    }
                    throw new AssertionError(i22);
                }
                RatingsDetailsScreenContract$InputData ratingsDetailsScreenContract$InputData = fVar.f319276a;
                ael.d0 d0VarK = ((z3h.g) this.f318398b).f319280b.k();
                vc.s.j(d0VarK);
                return new y4h.g(ratingsDetailsScreenContract$InputData, d0VarK, (jki.p) fVar.f319277b.get());
            case 7:
                z52.j jVar = (z52.j) this.f318398b;
                z52.m mVar = (z52.m) this.d;
                z52.j jVar2 = mVar.f319454b;
                IrisNavigation$InputData inputData = mVar.f319453a;
                int i32 = this.f318399c;
                switch (i32) {
                    case 0:
                        Object extension = (a62.a) mVar.d.get();
                        b62.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension, "extension");
                        yji.n nVar = (yji.n) extension;
                        vc.s.k(nVar);
                        return nVar;
                    case 1:
                        return new a62.b(mVar.b());
                    case 2:
                        IrisNavigation$InputData irisNavigation$InputData = mVar.f319453a;
                        f62.f fVar2 = new f62.f((c12.f) mVar.f.get());
                        f62.o oVar = new f62.o((c12.z) mVar.f319456g.get(), 0);
                        til.m mVarA = jVar.d.a();
                        vc.s.j(mVarA);
                        aVar = new com.revolut.feature.apm.iris.impl.ui.a(irisNavigation$InputData, fVar2, oVar, mVarA, (a62.a) mVar.d.get(), (d12.b) mVar.f319457h.get());
                        return aVar;
                    case 3:
                        r52.a apmNavigationProvider = (r52.a) jVar2.f319437h.e.get();
                        vc.s.j(apmNavigationProvider);
                        Intrinsics.checkNotNullParameter(apmNavigationProvider, "apmNavigationProvider");
                        dcl.q factory2 = new dcl.q();
                        i62.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(inputData, "inputData");
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        ApmPaymentProfile paymentProfile = inputData.f62484b;
                        Intrinsics.checkNotNullParameter(paymentProfile, "paymentProfile");
                        eVar = new f62.e(paymentProfile, apmNavigationProvider);
                        return eVar;
                    case 4:
                        hy1.v irisContactsProvider = (hy1.v) ((ey1.e) jVar2.k).K.get();
                        vc.s.j(irisContactsProvider);
                        r52.a apmNavigationProvider2 = (r52.a) jVar2.f319437h.e.get();
                        vc.s.j(apmNavigationProvider2);
                        f62.f newContactNavigationProvider = new f62.f((c12.f) mVar.f.get());
                        Intrinsics.checkNotNullParameter(irisContactsProvider, "irisContactsProvider");
                        Intrinsics.checkNotNullParameter(apmNavigationProvider2, "apmNavigationProvider");
                        Intrinsics.checkNotNullParameter(newContactNavigationProvider, "newContactNavigationProvider");
                        he2.b factory3 = new he2.b(11);
                        i62.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(inputData, "inputData");
                        Intrinsics.checkNotNullParameter(factory3, "factory");
                        ApmPaymentProfile paymentProfile2 = inputData.f62484b;
                        Intrinsics.checkNotNullParameter(paymentProfile2, "paymentProfile");
                        return new f62.n(paymentProfile2, irisContactsProvider, apmNavigationProvider2, newContactNavigationProvider);
                    case 5:
                        c62.e irisInteractor = (c62.e) jVar2.f319434b.f319430b.get();
                        vc.s.j(irisInteractor);
                        a62.d errorProvider = mVar.b();
                        Intrinsics.checkNotNullParameter(irisInteractor, "irisInteractor");
                        Intrinsics.checkNotNullParameter(errorProvider, "errorProvider");
                        by5.a factory4 = new by5.a(11);
                        i62.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(inputData, "inputData");
                        Intrinsics.checkNotNullParameter(factory4, "factory");
                        ApmPaymentProfile profile = inputData.f62484b;
                        Intrinsics.checkNotNullParameter(profile, "profile");
                        aVar = new f62.c(profile, irisInteractor, errorProvider);
                        return aVar;
                    case 6:
                        h12.h apmAreaProvider = jVar2.f319439l.f();
                        vc.s.j(apmAreaProvider);
                        Intrinsics.checkNotNullParameter(apmAreaProvider, "apmAreaProvider");
                        p96.a factory5 = new p96.a(11);
                        i62.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(inputData, "inputData");
                        Intrinsics.checkNotNullParameter(factory5, "factory");
                        ApmPaymentProfile profile2 = inputData.f62484b;
                        Intrinsics.checkNotNullParameter(profile2, "profile");
                        eVar = new f62.p(profile2, apmAreaProvider);
                        return eVar;
                    case 7:
                        vw1.b bVar3 = (vw1.b) mVar.k.get();
                        wj0.a aVarI = ((nj0.d) jVar.f319433a).i();
                        vc.s.j(aVarI);
                        eVar = new c62.d(bVar3, aVarI);
                        return eVar;
                    case 8:
                        uy1.b factory6 = ((lz1.m) jVar.f319438j).b();
                        vc.s.j(factory6);
                        i62.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(inputData, "inputData");
                        Intrinsics.checkNotNullParameter(factory6, "factory");
                        int i33 = i62.a.f158854a[inputData.f62484b.ordinal()];
                        if (i33 == 1) {
                            zz1.h.Companion.getClass();
                            hVar = zz1.h.f326486g;
                        } else {
                            if (i33 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            zz1.h.Companion.getClass();
                            hVar = zz1.h.f326487h;
                        }
                        return factory6.a(hVar);
                    default:
                        throw new AssertionError(i32);
                }
            case 8:
                z52.j jVar3 = (z52.j) this.f318398b;
                z52.n nVar2 = (z52.n) this.d;
                z52.j jVar4 = nVar2.f319461b;
                int i43 = this.f318399c;
                if (i43 == 0) {
                    Object extension2 = (a62.a) nVar2.f319462c.get();
                    b62.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension2, "extension");
                    yji.n nVar3 = (yji.n) extension2;
                    vc.s.k(nVar3);
                    return nVar3;
                }
                if (i43 == 1) {
                    sf0.h hVarB = jVar4.f.b();
                    vc.s.j(hVarB);
                    v60.e eVarA = jVar4.f319436g.a();
                    vc.s.j(eVarA);
                    return new a62.b(new a62.d(hVarB, eVarA));
                }
                if (i43 != 2) {
                    throw new AssertionError(i43);
                }
                IrisPayFlowContract$InputData irisPayFlowContract$InputData = nVar2.f319460a;
                s52.a aVar3 = (s52.a) jVar3.f319437h.f.get();
                vc.s.j(aVar3);
                tnb.g0 g0Var = new tnb.g0((IrisPayService) jVar4.f319443q.get());
                vz1.g gVarH = ((lz1.m) jVar4.f319438j).h();
                vc.s.j(gVarH);
                return new com.revolut.feature.apm.iris.impl.ui.pay.b(irisPayFlowContract$InputData, aVar3, new k62.b(g0Var, gVarH), (tak.d) jVar3.f319444r.get(), (a62.a) nVar2.f319462c.get());
            case 9:
                z58.f fVar3 = (z58.f) this.d;
                z58.j jVar5 = (z58.j) this.f318398b;
                se8.a aVar4 = jVar5.f;
                qh8.b bVar4 = jVar5.f319575c;
                int i59 = this.f318399c;
                if (i59 != 0) {
                    if (i59 == 1) {
                        return new b68.a(aVar4.c());
                    }
                    if (i59 != 2) {
                        throw new AssertionError(i59);
                    }
                    wsg.n nVarB = jVar5.i.b();
                    z13.a aVar5 = jVar5.f319578j;
                    te8.c0 c0Var = (te8.c0) aVar5.d.z.get();
                    vc.s.j(c0Var);
                    return new i68.i(nVarB, new b23.l(c0Var, ((oq8.a) aVar5.e).c()), jVar5.k.a());
                }
                AccountActivationFlowContract$InputData accountActivationFlowContract$InputData = fVar3.f319559a;
                q58.a aVar6 = (q58.a) jVar5.e.f319539q.get();
                vc.s.j(aVar6);
                te8.e eVarA2 = aVar4.a();
                vc.s.j(eVarA2);
                b68.a aVar7 = (b68.a) fVar3.f319560b.get();
                b68.b bVar5 = new b68.b();
                lh8.b bVar6 = (lh8.b) bVar4.f246499l.get();
                vc.s.j(bVar6);
                ic8.b bVarA = jVar5.f319576g.a();
                vc.s.j(bVarA);
                til.m mVarA2 = jVar5.f319577h.a();
                vc.s.j(mVarA2);
                lh8.d dVar3 = (lh8.d) bVar4.f246504r.get();
                vc.s.j(dVar3);
                i68.e eVar3 = (i68.e) fVar3.f319561c.get();
                rh8.d0 d0Var = (rh8.d0) bVar4.f246503q.get();
                vc.s.j(d0Var);
                gte.a aVarB = jVar5.f319573a.b();
                vc.s.j(aVarB);
                hj8.a aVarA3 = jVar5.f319579l.a();
                vc.s.j(aVarA3);
                ang.f fVarE = jVar5.d.e();
                wj0.a aVarI2 = ((nj0.d) jVar5.f319580m).i();
                vc.s.j(aVarI2);
                return new com.revolut.feature.junior.account_activation.impl.ui.flow.activation.f(accountActivationFlowContract$InputData, aVar6, eVarA2, aVar7, bVar5, bVar6, bVarA, mVarA2, dVar3, eVar3, d0Var, aVarB, aVarA3, fVarE, aVarI2);
            case 10:
                z58.j jVar6 = (z58.j) this.f318398b;
                qh8.b bVar7 = jVar6.f319575c;
                z58.g gVar3 = (z58.g) this.d;
                int i66 = this.f318399c;
                if (i66 == 0) {
                    return kxa.j.k((j60.a) gVar3.d.get());
                }
                if (i66 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) gVar3.f319563b.get(), (rp0.m) gVar3.f319564c.get());
                }
                if (i66 == 2) {
                    return new rp0.m();
                }
                if (i66 == 3) {
                    n68.o oVar2 = gVar3.f319562a;
                    j60.a aVar8 = (j60.a) gVar3.d.get();
                    i68.b bVar8 = (i68.b) gVar3.f.get();
                    rh8.o0 o0Var = (rh8.o0) bVar7.f246500m.get();
                    vc.s.j(o0Var);
                    return new com.revolut.feature.junior.account_activation.impl.ui.screen.request.c(oVar2, aVar8, bVar8, o0Var, new vh8.c(bVar7.d.e()), jVar6.d.e(), (cli.n) gVar3.f319565g.get());
                }
                if (i66 == 4) {
                    return new i68.d();
                }
                if (i66 != 5) {
                    throw new AssertionError(i66);
                }
                lh8.f termsFactory = (lh8.f) bVar7.f246500m.get();
                vc.s.j(termsFactory);
                Intrinsics.checkNotNullParameter(termsFactory, "termsFactory");
                return new com.revolut.feature.junior.account_activation.impl.ui.screen.request.d();
            case 11:
                z58.j jVar7 = (z58.j) this.f318398b;
                se8.a aVar9 = jVar7.f;
                int i74 = this.f318399c;
                if (i74 == 0) {
                    z58.h hVar2 = (z58.h) this.d;
                    return new j68.i(hVar2.f319567a, (cli.n) hVar2.f319568b.get(), aVar9.f(), jVar7.d.e());
                }
                if (i74 != 1) {
                    throw new AssertionError(i74);
                }
                l80.e eVarH4 = jVar7.f319574b.h();
                vc.s.j(eVarH4);
                qe8.f fVar4 = (qe8.f) aVar9.C.get();
                vc.s.j(fVar4);
                return new j68.k(eVarH4, fVar4);
            case 12:
                z73.d dVar4 = (z73.d) this.d;
                z73.b bVar9 = (z73.b) this.f318398b;
                int i92 = this.f318399c;
                switch (i92) {
                    case 0:
                        return kxa.j.k((j60.a) dVar4.d.get());
                    case 1:
                        return ehe.n.s((com.revolut.kompot.navigable.a) dVar4.f319879b.get(), (rp0.m) dVar4.f319880c.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        return xb1.a.C((j60.a) dVar4.f.get());
                    case 4:
                        return xb1.a.e((com.revolut.kompot.navigable.a) dVar4.f319879b.get(), new j60.e());
                    case 5:
                        fd6.a aVar10 = (fd6.a) dVar4.i.get();
                        va.g.t(aVar10);
                        return aVar10;
                    case 6:
                        return va.g.s(((zc6.a) bVar9.f).d(), (xc6.a) dVar4.f319882h.get());
                    case 7:
                        return r6.b.k((zc6.a) bVar9.f, "factory");
                    case 8:
                        Object extension3 = (di9.c) dVar4.k.get();
                        Intrinsics.checkNotNullParameter(extension3, "extension");
                        yji.n nVar4 = (yji.n) extension3;
                        vc.s.k(nVar4);
                        return nVar4;
                    case 9:
                        ij9.a provider = bVar9.f319861g.k();
                        vc.s.j(provider);
                        Intrinsics.checkNotNullParameter(provider, "provider");
                        return provider.a();
                    case 10:
                        Object extension4 = (di9.d) dVar4.f319885m.get();
                        Intrinsics.checkNotNullParameter(extension4, "extension");
                        yji.n nVar5 = (yji.n) extension4;
                        vc.s.k(nVar5);
                        return nVar5;
                    case 11:
                        ij9.a provider2 = bVar9.f319861g.k();
                        vc.s.j(provider2);
                        j60.a bottomDialogExtension = (j60.a) dVar4.d.get();
                        di9.c payLaterModeActivationExtension = (di9.c) dVar4.k.get();
                        Intrinsics.checkNotNullParameter(provider2, "provider");
                        Intrinsics.checkNotNullParameter(bottomDialogExtension, "dialogControllerExtension");
                        Intrinsics.checkNotNullParameter(payLaterModeActivationExtension, "payLaterModeActivationExtension");
                        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
                        Intrinsics.checkNotNullParameter(payLaterModeActivationExtension, "payLaterModeActivationExtension");
                        return new ij9.i(bottomDialogExtension, provider2.f161734a, provider2.f161735b, provider2.f161736c, provider2.e, payLaterModeActivationExtension);
                    case 12:
                        return xb1.a.D((sb7.b) dVar4.o.get());
                    case 13:
                        xb7.b bVarA2 = bVar9.f319862h.a();
                        vc.s.j(bVarA2);
                        return xb1.a.i(bVarA2, (j60.a) dVar4.f.get());
                    case 14:
                        cc7.l extension5 = new cc7.l((j60.a) dVar4.f.get(), (sb7.b) dVar4.o.get());
                        Intrinsics.checkNotNullParameter(extension5, "extension");
                        return extension5;
                    case 15:
                        return va.g.u((xc6.a) dVar4.f319882h.get());
                    case 16:
                        cli.n nVar6 = (cli.n) dVar4.f319890s.get();
                        CardsListScreenContract$InputData cardsListScreenContract$InputData = dVar4.f319878a;
                        da3.j jVar8 = bVar9.f319860c;
                        cf7.l lVar = bVar9.f319863j;
                        jm4.r rVar = bVar9.f319870s;
                        oi9.f fVar5 = bVar9.f319861g;
                        c73.j jVar9 = bVar9.k;
                        l93.f fVarJ = jVar8.j();
                        vc.s.j(fVarJ);
                        d73.u uVarA = jVar9.a();
                        mt8.d dVarB = bVar9.f319864l.b();
                        vc.s.j(dVarB);
                        sh3.a aVarA4 = bVar9.f319865m.a();
                        vc.s.j(aVarA4);
                        g48.r0 r0VarC = bVar9.f319866n.c();
                        xh9.a aVarE = fVar5.e();
                        vc.s.j(aVarE);
                        ti9.h hVarB2 = fVar5.b();
                        a83.n nVar7 = new a83.n();
                        di9.d dVar5 = (di9.d) dVar4.f319885m.get();
                        sb7.b bVar10 = (sb7.b) dVar4.o.get();
                        wsg.n nVarB2 = bVar9.o.b();
                        zf8.k kVarA = bVar9.f319867p.a();
                        vc.s.j(kVarA);
                        te8.e eVarA3 = bVar9.f319868q.a();
                        vc.s.j(eVarA3);
                        ha3.k kVar = (ha3.k) bVar9.f319860c.H.get();
                        vc.s.j(kVar);
                        z1 z1Var = (z1) dVar4.f319891t.get();
                        n6e.b bVarA3 = bVar9.f319869r.a();
                        bm4.a aVarE2 = rVar.e();
                        l63.a aVar11 = (l63.a) jVar9.u.get();
                        vc.s.j(aVar11);
                        r10.q qVarE = bVar9.f319871t.e();
                        eub.i iVarE = bVar9.u.e();
                        vc.s.j(iVarE);
                        i4b.f fVarB = ((zc6.a) bVar9.f).b();
                        yj2.d dVar6 = (yj2.d) bVar9.d.i.get();
                        vc.s.j(dVar6);
                        al4.b bVarN = rVar.n();
                        vc.s.j(bVarN);
                        gte.a aVarB2 = bVar9.e.b();
                        vc.s.j(aVarB2);
                        a83.a1 a1Var = (a83.a1) bVar9.f319874y.get();
                        qe7.a aVarA5 = ((te7.b) bVar9.v).a();
                        vc.s.j(aVarA5);
                        lg3.a aVarA6 = ((og3.e) ((cf7.b) lVar).i).a();
                        vc.s.j(aVarA6);
                        pf7.b bVar11 = new pf7.b(aVarA6);
                        lg3.a aVarA7 = ((og3.e) ((cf7.b) lVar).i).a();
                        vc.s.j(aVarA7);
                        return new com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a(nVar6, cardsListScreenContract$InputData, fVarJ, uVarA, dVarB, aVarA4, r0VarC, aVarE, hVarB2, nVar7, dVar5, bVar10, nVarB2, kVarA, eVarA3, kVar, z1Var, bVarA3, aVarE2, aVar11, qVarE, iVarE, fVarB, dVar6, bVarN, aVarB2, a1Var, aVarA5, bVar11, new pf7.a(aVarA7));
                    case 17:
                        oi9.f fVar6 = bVar9.f319861g;
                        cf7.l lVar2 = bVar9.f319863j;
                        vi9.n nVarN = fVar6.n();
                        m93.d dVarF = bVar9.f319860c.f();
                        vc.s.j(dVarF);
                        jla.h hVarA = bVar9.i.a();
                        gte.a aVarB3 = bVar9.e.b();
                        vc.s.j(aVarB3);
                        zjh.j jVarC = ((zc6.a) bVar9.f).c();
                        cf7.b bVar12 = (cf7.b) lVar2;
                        m93.d dVarF2 = bVar12.f23575g.f();
                        vc.s.j(dVarF2);
                        zjh.c cVar3 = new zjh.c(dVarF2);
                        l80.e eVarH5 = bVar12.f23576h.h();
                        vc.s.j(eVarH5);
                        ef7.d dVar7 = new ef7.d(cVar3, eVarH5);
                        m93.d dVarF3 = ((cf7.b) lVar2).f23575g.f();
                        vc.s.j(dVarF3);
                        return new a83.z0(nVarN, dVarF, hVarA, aVarB3, jVarC, dVar7, new ef7.b(new zjh.c(dVarF3)));
                    case 18:
                        com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) dVar4.f319879b.get();
                        c83.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        return new z1(controller.m2());
                    default:
                        throw new AssertionError(i92);
                }
            case 13:
                z73.h hVar3 = (z73.h) this.d;
                z73.b bVar13 = (z73.b) this.f318398b;
                djf.c cVar4 = bVar13.f319872w;
                int i96 = this.f318399c;
                if (i96 != 0) {
                    if (i96 != 1) {
                        throw new AssertionError(i96);
                    }
                    thf.g gVarE = cVar4.e();
                    vc.s.j(gVarE);
                    return new j83.o(gVarE);
                }
                jki.p pVar6 = (jki.p) hVar3.f319902b.get();
                TerminatedCardChargebackScreenContract$InputData terminatedCardChargebackScreenContract$InputData = hVar3.f319901a;
                l93.f fVarJ2 = bVar13.f319860c.j();
                vc.s.j(fVarJ2);
                whf.b bVarA4 = cVar4.a();
                vc.s.j(bVarA4);
                return new j83.m(pVar6, terminatedCardChargebackScreenContract$InputData, fVarJ2, bVarA4);
            case 14:
                z9h.d dVar8 = (z9h.d) this.f318398b;
                z9h.b bVar14 = (z9h.b) this.d;
                ozg.a dependenciesApi = bVar14.f320389b;
                int i99 = this.f318399c;
                if (i99 == 0) {
                    i90.b bVar15 = new i90.b();
                    CompositeAddMoneyFlowContract$Input compositeAddMoneyFlowContract$Input = bVar14.f320388a;
                    m1h.a aVar12 = (m1h.a) bVar14.e.get();
                    tzg.k kVar2 = (tzg.k) dVar8.f320396a.f150285x0.get();
                    vc.s.j(kVar2);
                    return new com.revolut.feature.wealth.impl.ui.flows.add_money.composite.a(bVar15, compositeAddMoneyFlowContract$Input, aVar12, kVar2, (ozg.b) bVar14.f.get(), new fah.c());
                }
                if (i99 == 1) {
                    jah.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(dependenciesApi, "dependenciesApi");
                    return dependenciesApi.c();
                }
                if (i99 == 2) {
                    jah.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(dependenciesApi, "dependenciesApi");
                    ozg.b bVarB = dependenciesApi.b();
                    return bVarB == null ? dch.a.f112988a : bVarB;
                }
                if (i99 == 3) {
                    jah.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(dependenciesApi, "dependenciesApi");
                    return dependenciesApi.d();
                }
                if (i99 != 4) {
                    throw new AssertionError(i99);
                }
                jah.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(dependenciesApi, "dependenciesApi");
                ozg.c cVarE = dependenciesApi.e();
                return cVarE == null ? bch.a.f14446a : cVarE;
            case 15:
                z9h.f fVar7 = (z9h.f) this.d;
                z9h.d dVar9 = (z9h.d) this.f318398b;
                int i100 = this.f318399c;
                switch (i100) {
                    case 0:
                        return a10.b.f((u8h.b) dVar9.f320409t, "factory");
                    case 1:
                        return kxa.j.k((j60.a) fVar7.f320418j.get());
                    case 2:
                        return ehe.n.s((com.revolut.kompot.navigable.a) fVar7.f320417h.get(), (rp0.m) fVar7.i.get());
                    case 3:
                        return new rp0.m();
                    case 4:
                        return trl.f.j((t60.b) fVar7.f320419l.get());
                    case 5:
                        return trl.f.s(fVar7.f320414b);
                    case 6:
                        return kii.e.j((u8h.b) dVar9.f320409t, "factory");
                    case 7:
                        f1h.c cVarA = dVar9.f320398c.a();
                        vc.s.j(cVarA);
                        return fp8.c.s(cVarA, fVar7.d, (f1h.b) fVar7.o.get());
                    case 8:
                        f1h.c cVarA2 = dVar9.f320398c.a();
                        vc.s.j(cVarA2);
                        return fp8.c.t(cVarA2);
                    case 9:
                        InvestTransactionsListContract$InputData investTransactionsListContract$InputData = fVar7.e;
                        x8h.q qVarA = dVar9.f320396a.A();
                        l80.e eVarH6 = dVar9.f320404n.h();
                        vc.s.j(eVarH6);
                        je0.d dVarD = fVar7.f.u.d();
                        vc.s.j(dVarD);
                        fkg.a aVar13 = new fkg.a(new g2e.t(dVarD));
                        gte.a aVarB4 = dVar9.f320401j.b();
                        vc.s.j(aVarB4);
                        return new cbh.n0(investTransactionsListContract$InputData, qVarA, eVarH6, aVar13, aVarB4);
                    case 10:
                        InvestTransactionsListContract$InputData investTransactionsListContract$InputData2 = fVar7.e;
                        z9h.d dVar10 = fVar7.f;
                        ebh.b bVar16 = new ebh.b();
                        f1h.e eVar4 = (f1h.e) dVar10.f320398c.f312023c.get();
                        vc.s.j(eVar4);
                        ebh.c cVar5 = new ebh.c(eVar4, (cbh.z) fVar7.f320424r.get());
                        q1 q1Var = (q1) fVar7.f320425s.get();
                        d1h.h hVar4 = (d1h.h) fVar7.f320426t.get();
                        gte.a aVarB5 = dVar10.f320401j.b();
                        vc.s.j(aVarB5);
                        ac4.g gVar4 = new ac4.g(bVar16, cVar5, new ebh.a(q1Var, hVar4, aVarB5));
                        h9h.a aVar14 = dVar9.f320396a;
                        h9h.a aVar15 = dVar9.f320396a;
                        ybl.l lVarF2 = aVar14.f();
                        tzg.m mVarT = aVar15.t();
                        vc.s.j(mVarT);
                        aah.h hVar5 = (aah.h) fVar7.f320416g.get();
                        cbh.k kVar3 = (cbh.k) fVar7.f320423q.get();
                        ybl.b bVarB2 = dVar9.f320406q.b();
                        vc.s.j(bVarB2);
                        d1h.e eVar5 = (d1h.e) fVar7.f320421n.get();
                        gte.a aVarB6 = dVar9.f320401j.b();
                        vc.s.j(aVarB6);
                        tzg.m mVarT2 = dVar10.f320396a.t();
                        vc.s.j(mVarT2);
                        fbh.a aVar16 = new fbh.a(mVarT2);
                        y2f.a aVarB7 = aVar15.f150282w.b();
                        vc.s.j(aVarB7);
                        rul.e eVar6 = new rul.e(aVarB7, aVar15.A());
                        cbh.z zVar = (cbh.z) fVar7.f320424r.get();
                        y2f.a aVarB8 = dVar9.v.b();
                        vc.s.j(aVarB8);
                        return new cbh.y(investTransactionsListContract$InputData2, gVar4, lVarF2, mVarT, hVar5, kVar3, bVarB2, eVar5, aVarB6, aVar16, eVar6, zVar, aVarB8);
                    case 11:
                        return new cbh.z();
                    case 12:
                        return a10.b.g((u8h.b) dVar9.f320409t, "factory");
                    case 13:
                        return kii.e.k((u8h.b) dVar9.f320409t);
                    default:
                        throw new AssertionError(i100);
                }
            case 16:
                z9h.d dVar11 = (z9h.d) this.f318398b;
                h9h.a aVar17 = dVar11.f320396a;
                u8h.c cVar6 = dVar11.f320409t;
                z9h.h hVar6 = (z9h.h) this.d;
                z9h.d dVar12 = hVar6.d;
                int i101 = this.f318399c;
                switch (i101) {
                    case 0:
                        return n57.a.t((o5d.c) hVar6.e.get());
                    case 1:
                        return n57.a.w(dVar11.f320408s.a(), hVar6.f320430a);
                    case 2:
                        return a10.b.f((u8h.b) cVar6, "factory");
                    case 3:
                        return n57.a.v((o5d.c) hVar6.e.get());
                    case 4:
                        return n57.a.g((o5d.c) hVar6.e.get());
                    case 5:
                        return new com.revolut.feature.wealth.impl.ui.screens.popularassets.a(new kxk.o(new rch.q(new rch.u(dVar12.f320396a.C(), h9h.a.x(), new jbh.c()), new adh.o()), new rch.w(new rch.u(dVar12.f320396a.C(), h9h.a.x(), new jbh.c()), new t5d.d(), (q1) hVar6.f320435j.get())), hVar6.f320432c, aVar17.l(), aVar17.f(), (aah.h) hVar6.f320433g.get(), new rch.s(), new g9h.c(), (o5d.a) hVar6.k.get());
                    case 6:
                        return a10.b.g((u8h.b) cVar6, "factory");
                    case 7:
                        return n57.a.u((o5d.c) hVar6.e.get());
                    default:
                        throw new AssertionError(i101);
                }
            case 17:
                return a();
            case 18:
                zd8.e eVar7 = (zd8.e) this.d;
                zd8.f fVar8 = eVar7.f321338b;
                int i102 = this.f318399c;
                if (i102 != 0) {
                    if (i102 != 1) {
                        throw new AssertionError(i102);
                    }
                    com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) eVar7.f321339c.get();
                    me8.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller2, "controller");
                    return new f01.c(controller2.m2());
                }
                CoparentInvitationFlowContract$InputData coparentInvitationFlowContract$InputData = eVar7.f321337a;
                a5h.g gVarB = ((zd8.f) this.f318398b).f321340a.b();
                ao.h hVarA2 = fVar8.f321340a.a();
                hj8.a aVarA8 = fVar8.f321341b.a();
                vc.s.j(aVarA8);
                ee8.e eVar8 = new ee8.e(hVarA2, aVarA8, fVar8.f321342c.e());
                jx0.a aVarA9 = fVar8.d.a();
                s70.a aVarM = fVar8.e.m();
                vc.s.j(aVarM);
                return new com.revolut.feature.junior_coparent.impl.ui.invitation.b(coparentInvitationFlowContract$InputData, gVarB, eVar8, new r10.v(aVarA9, aVarM, (f01.a) eVar7.d.get()));
            case 19:
                zm8.b bVar17 = (zm8.b) this.f318398b;
                int i103 = this.f318399c;
                if (i103 != 0) {
                    if (i103 == 1) {
                        return new en8.p(new dcd.b());
                    }
                    throw new AssertionError(i103);
                }
                zm8.c cVar7 = (zm8.c) this.d;
                en8.f fVar9 = cVar7.f323397a;
                cli.n nVar8 = (cli.n) cVar7.f323398b.get();
                djb.n nVarA = bVar17.f323393h.a();
                vc.s.j(nVarA);
                hj8.a aVarA10 = bVar17.f323389a.a();
                vc.s.j(aVarA10);
                return new en8.n(fVar9, nVar8, nVarA, aVarA10, bVar17.i.c(), (an8.b) bVar17.f323395l.get());
            case 20:
                return b();
            case 21:
                zo5.a aVar18 = (zo5.a) this.d;
                zo5.d dVar13 = (zo5.d) this.f318398b;
                int i104 = this.f318399c;
                if (i104 != 0) {
                    if (i104 != 1) {
                        throw new AssertionError(i104);
                    }
                    x7a.d dVar14 = (x7a.d) ((yh1.e) dVar13.f323901y).f313710g.get();
                    vc.s.j(dVar14);
                    fk3.a aVarA11 = dVar13.z.a();
                    vc.s.j(aVarA11);
                    n8b.a aVarA12 = dVar13.A.a();
                    vc.s.j(aVarA12);
                    return new aq5.i(dVar14, aVarA11, aVarA12);
                }
                ap5.b bVarE = ((yo5.w) dVar13.f323886b).e();
                vc.s.j(bVarE);
                uj5.b bVarE2 = ((ak5.i) dVar13.f).e();
                vc.s.j(bVarE2);
                CryptoAddBeneficiaryInput cryptoAddBeneficiaryInput = aVar18.f323874a;
                mo5.a aVarC = ((yo5.w) aVar18.f323875b.f323886b).c();
                vc.s.j(aVarC);
                bq5.c cVar8 = new bq5.c(aVarC);
                x7a.d dVar15 = (x7a.d) aVar18.f323876c.get();
                gte.a aVarB9 = dVar13.f323888g.b();
                vc.s.j(aVarB9);
                return new com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.b(bVarE, bVarE2, cryptoAddBeneficiaryInput, cVar8, dVar15, aVarB9);
            case 22:
                return c();
            case 23:
                return d();
            case 24:
                return e();
            case 25:
                return f();
            case 26:
                return g();
            case 27:
                return h();
            case 28:
                return i();
            default:
                zpc.e eVar9 = (zpc.e) this.d;
                int i105 = this.f318399c;
                if (i105 == 0) {
                    return new com.revolut.feature.salary_switch.impl.ui.mexico.screen.review_account_details.b((cli.n) eVar9.f324241b.get(), eVar9.f324240a, (aqc.k) ((zpc.k) this.f318398b).G.get());
                }
                if (i105 == 1) {
                    return new krc.n();
                }
                throw new AssertionError(i105);
        }
    }
}

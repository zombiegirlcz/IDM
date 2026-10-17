package k51;

import al4.m;
import com.google.common.collect.ImmutableMap;
import com.revolut.cache.AutoCacheCleanWorker;
import com.revolut.feature.apm.wero.impl.interactor.WeroKeySyncWorker;
import com.revolut.feature.in_app_calls.workers.TwilioCallsDynamicFeaturesWorker;
import com.revolut.feature.junior_progression.impl.push.JuniorProgressionRefreshWorker;
import com.revolut.feature.payments.messaging.data.impl.encryption.PeerToPeerChatPublicKeyPropagationWorker;
import com.revolut.feature.wealth.gia.margin_trading.impl.pushes.WealthGiaMarginCallRefreshWorker;
import com.revolut.feature.wealth.impl.domain.workers.TradingTransactionsCleanUpWorker;
import com.revolut.feature_move_money.impl.interactor.MoveMoneyBalanceSyncWorker;
import com.revolut.utils.job.workers.AnalyticsToggleRefreshWorker;
import com.revolut.utils.job.workers.ApmMultibancoDynamicFeaturesWorker;
import com.revolut.utils.job.workers.CardSceneDynamicFeaturesWorker;
import com.revolut.utils.job.workers.CreditApplicationReloadWorker;
import com.revolut.utils.job.workers.CreditApplicationStopDataMonitoringWorker;
import com.revolut.utils.job.workers.CreditCardDebitToCreditInstalmentPlansWorker;
import com.revolut.utils.job.workers.CreditCardProductsWorker;
import com.revolut.utils.job.workers.CreditDynamicFeaturesWorker;
import com.revolut.utils.job.workers.FetchAndSaveTransactionWorker;
import com.revolut.utils.job.workers.IncrementBeneficiaryTransactionsWorker;
import com.revolut.utils.job.workers.OnboardingDynamicFeaturesWorker;
import com.revolut.utils.job.workers.PersonalisationSettingsRefreshWorker;
import com.revolut.utils.job.workers.PrefetchStoriesWorker;
import com.revolut.utils.job.workers.ProductAccountMigrationWorker;
import com.revolut.utils.job.workers.ProfileLocationWorker;
import com.revolut.utils.job.workers.TransactionLocationWorker;
import com.revolut.utils.job.workers.TransactionsReloadWorker;
import com.revolut.utils.job.workers.WalletsReloadWorker;
import dw3.c1;
import kk8.o;
import ldi.f;
import mk0.p;
import pv9.l;
import pzl.n;
import pzl.q;
import pzl.v;
import pzl.w;
import r10.r;
import te8.y;
import vc.s;
import ybl.k;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f181314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f181315b;

    public a(b bVar, int i) {
        this.f181314a = bVar;
        this.f181315b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f181314a;
        int i = this.f181315b;
        switch (i) {
            case 0:
                bVar.getClass();
                ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(26);
                b bVar2 = bVar.C;
                builderBuilderWithExpectedSize.put(ProfileLocationWorker.class, bVar2.F);
                builderBuilderWithExpectedSize.put(TransactionLocationWorker.class, bVar2.G);
                builderBuilderWithExpectedSize.put(AnalyticsToggleRefreshWorker.class, bVar2.H);
                builderBuilderWithExpectedSize.put(CreditCardProductsWorker.class, bVar2.I);
                builderBuilderWithExpectedSize.put(CreditCardDebitToCreditInstalmentPlansWorker.class, bVar2.J);
                builderBuilderWithExpectedSize.put(CreditApplicationReloadWorker.class, bVar2.K);
                builderBuilderWithExpectedSize.put(CreditApplicationStopDataMonitoringWorker.class, bVar2.L);
                builderBuilderWithExpectedSize.put(CreditDynamicFeaturesWorker.class, bVar2.M);
                builderBuilderWithExpectedSize.put(OnboardingDynamicFeaturesWorker.class, bVar2.N);
                builderBuilderWithExpectedSize.put(ApmMultibancoDynamicFeaturesWorker.class, bVar2.O);
                builderBuilderWithExpectedSize.put(PrefetchStoriesWorker.class, bVar2.P);
                builderBuilderWithExpectedSize.put(AutoCacheCleanWorker.class, bVar2.Q);
                builderBuilderWithExpectedSize.put(PersonalisationSettingsRefreshWorker.class, bVar2.S);
                builderBuilderWithExpectedSize.put(PeerToPeerChatPublicKeyPropagationWorker.class, bVar2.T);
                builderBuilderWithExpectedSize.put(IncrementBeneficiaryTransactionsWorker.class, bVar2.U);
                builderBuilderWithExpectedSize.put(TransactionsReloadWorker.class, bVar2.V);
                builderBuilderWithExpectedSize.put(TradingTransactionsCleanUpWorker.class, bVar2.W);
                builderBuilderWithExpectedSize.put(WalletsReloadWorker.class, bVar2.Y);
                builderBuilderWithExpectedSize.put(FetchAndSaveTransactionWorker.class, bVar2.Z);
                builderBuilderWithExpectedSize.put(WeroKeySyncWorker.class, bVar2.f181317a0);
                builderBuilderWithExpectedSize.put(MoveMoneyBalanceSyncWorker.class, bVar2.f181325h0);
                builderBuilderWithExpectedSize.put(JuniorProgressionRefreshWorker.class, bVar2.i0);
                builderBuilderWithExpectedSize.put(TwilioCallsDynamicFeaturesWorker.class, bVar2.j0);
                builderBuilderWithExpectedSize.put(WealthGiaMarginCallRefreshWorker.class, bVar2.f181327k0);
                builderBuilderWithExpectedSize.put(CardSceneDynamicFeaturesWorker.class, bVar2.l0);
                builderBuilderWithExpectedSize.put(ProductAccountMigrationWorker.class, bVar2.f181336r0);
                return builderBuilderWithExpectedSize.build();
            case 1:
                return new v(bVar.D, bVar.E);
            case 2:
                w39.b bVarA = bVar.f181316a.a();
                s.j(bVarA);
                return bVarA;
            case 3:
                return bVar.f181318b.e();
            case 4:
                return new w(bVar.D, 0);
            case 5:
                loi.a aVar = (loi.a) bVar.f181320c.f238037t0.get();
                s.j(aVar);
                return new l(aVar);
            case 6:
                return new br.b(bVar.d.a());
            case 7:
                m mVarR = bVar.d.r();
                s.j(mVarR);
                al4.e eVarP = bVar.d.p();
                s.j(eVarP);
                return new pzl.a(mVarR, eVarP);
            case 8:
                wt3.b bVar3 = (wt3.b) ((c1) bVar.e).f118475t0.get();
                s.j(bVar3);
                return new br.b(bVar3);
            case 9:
                sp3.a aVarM = bVar.f.m();
                s.j(aVarM);
                return new br.b(aVarM);
            case 10:
                up3.b bVarI = bVar.f.i();
                s.j(bVarI);
                xg0.a aVarA = bVar.f181323g.a();
                s.j(aVarA);
                return new pzl.a(bVarI, aVarA);
            case 11:
                xg0.a aVarA2 = bVar.f181323g.a();
                s.j(aVarA2);
                return new oe7.a(aVarA2, 2);
            case 12:
                uw1.c cVarD = ((lz1.m) bVar.f181324h).d();
                s.j(cVarD);
                xg0.a aVarA3 = bVar.f181323g.a();
                s.j(aVarA3);
                return new pzl.a(cVarD, aVarA3);
            case 13:
                return new PrefetchStoriesWorker.b();
            case 14:
                ih0.b bVarF = bVar.f181323g.f();
                s.j(bVarF);
                com.revolut.analytics.tracking.v3.d dVarF = bVar.f181320c.f();
                s.j(dVarF);
                return new pzl.a(bVarF, dVarF);
            case 15:
                return new l(bVar.R);
            case 16:
                p pVarB = bVar.i.b();
                s.j(pVarB);
                return pVarB;
            case 17:
                cv9.a aVar2 = (cv9.a) bVar.f181326j.f229995p.get();
                s.j(aVar2);
                return new l(aVar2);
            case 18:
                return new br.b(((c21.b) bVar.k).a());
            case 19:
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) bVar.f181328l).c();
                s.j(aVarC);
                return new n(aVarC, 1);
            case 20:
                k kVarD = bVar.f181329m.d();
                s.j(kVarD);
                y2f.a aVarB = bVar.f181330n.b();
                s.j(aVarB);
                xoj.a aVarA4 = bVar.o.a();
                s.j(aVarA4);
                return new f9h.a(kVarD, aVarB, aVarA4);
            case 21:
                return new w(bVar.X, 1);
            case 22:
                return bVar.f181333p.b();
            case 23:
                com.revolut.domain.interactors.transactions.a aVarC2 = ((bjf.a) bVar.f181328l).c();
                s.j(aVarC2);
                return new n(aVarC2, 0);
            case 24:
                eh2.a aVar3 = (eh2.a) bVar.f181334q.f.get();
                s.j(aVar3);
                return new br.b(aVar3);
            case 25:
                return new c8i.d(bVar.X, bVar.f181319b0, bVar.c0, bVar.f181321d0, bVar.f181322e0, bVar.f0, bVar.g0);
            case 26:
                return bVar.f181335r.c();
            case 27:
                ppg.b bVarB = ((wpg.l) bVar.f181337s).b();
                s.j(bVarB);
                return bVarB;
            case 28:
                rnb.w wVarB = bVar.f181339t.b();
                s.j(wVarB);
                return wVarB;
            case 29:
                al4.n nVarS = bVar.d.s();
                s.j(nVarS);
                return nVarS;
            case 30:
                f fVarA = bVar.u.a();
                s.j(fVarA);
                return fVarA;
            case 31:
                ybl.d dVarH = bVar.v.h();
                s.j(dVarH);
                return dVarH;
            case 32:
                jk8.a aVar4 = (jk8.a) bVar.f181340w;
                kk8.k kVarA = aVar4.a();
                y yVar = new y();
                zm0.b bVarI2 = aVar4.f175124b.i();
                s.j(bVarI2);
                return new br.b(new o(kVarA, yVar, bVarI2));
            case 33:
                xg0.a aVarA5 = bVar.f181323g.a();
                s.j(aVarA5);
                return new oe7.a(aVarA5, 0);
            case 34:
                r rVarL = bVar.f181341x.L();
                k kVarD2 = bVar.f181329m.d();
                s.j(kVarD2);
                return new f9h.a(rVarL, kVarD2, (ybl.d) bVar.g0.get());
            case 35:
                xg0.a aVarA6 = bVar.f181323g.a();
                s.j(aVarA6);
                return new oe7.a(aVarA6, 1);
            case 36:
                return new q(bVar.m0, bVar.f181331n0, bVar.f181332o0, bVar.p0, bVar.q0);
            case 37:
                hj8.a aVarA7 = bVar.f181342y.a();
                s.j(aVarA7);
                return aVarA7;
            case 38:
                return bVar.f181333p.a();
            case 39:
                return bVar.z.i();
            case 40:
                qfe.d dVar = (qfe.d) ((jge.m) bVar.A.e).u.get();
                s.j(dVar);
                return dVar;
            case 41:
                return bVar.B.d();
            default:
                throw new AssertionError(i);
        }
    }
}

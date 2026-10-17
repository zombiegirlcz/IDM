package us6;

import android.app.Activity;
import android.content.Context;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import com.feature.user.details.impl.ui.details.UserDetailsControllerContract$InputData;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.bank_account_switching.impl.ui.form.BankAccountSwitchingFormScreenContract$InputData;
import com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen.ShowCardPinScreenContract$InputData;
import com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.ChecklistCollectionScreenContract$InputData;
import com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_step_details.ChecklistStepDetailsScreenContract$InputData;
import com.revolut.feature.contacts.api.navigation.AddContactInputData;
import com.revolut.feature.contacts.impl.ui.contact.screen.details.ContactDetailsScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.email_message.InvoiceEmailMessageScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_methods.InvoicePaymentMethodsScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.reminders.InvoiceRemindersScreenContract$InputData;
import com.revolut.feature.retail.restaurants.impl.ui.customerdetails.CustomerDetailsScreenContract$InputData;
import com.revolut.feature.retail.savings.impl.challenge.presentation.manage_challenge.ManageChallengeScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlist_assets.WatchlistAssetsScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist.WatchlistHomeScreenContract$InputData;
import com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.SignInMethodsScreenContract$InputData;
import com.revolut.feature.tab.lifestyle.impl.ui.screen.TabLifestyleScreenContract$InputData;
import com.revolut.feature_exchange.api.models.TakeProfitStopLossParams;
import com.revolut.feature_exchange.impl.ui.takeprofit_stoploss.amount_picker.TPSLAmountControllerContract$InputData;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.feature.payments.core.fees.mapper.RateExplanationDialogMapper;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerReviewScreenInputData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData;
import com.revolut.retail.feature.plan_gifting.impl.network.PlanGiftingEligibilityService;
import ip0.v7;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import t80.e;

/* JADX INFO: loaded from: classes3.dex */
public final class r2 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f282737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f282738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f282739c;
    public final Object d;

    public /* synthetic */ r2(Object obj2, Object obj3, int i, int i2) {
        this.f282737a = i2;
        this.f282738b = obj2;
        this.d = obj3;
        this.f282739c = i;
    }

    private final Object a() {
        vee.c cVar = (vee.c) this.f282738b;
        vee.b bVar = (vee.b) this.d;
        int i = this.f282739c;
        switch (i) {
            case 0:
                return kpi.f.a();
            case 1:
                Context contextI = bq.i.i(bVar.f288293a);
                BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(bVar.f288293a);
                t70.g gVarO = cVar.f288309b.o();
                vc.s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 2:
                return new tpi.i((rpi.c) bVar.f288296g.get(), gsi.c.a(bVar.f288293a));
            case 3:
                return new rpi.b(bq.i.b(bVar.f288293a));
            case 4:
                return new rpi.h(bq.i.b(bVar.f288293a));
            case 5:
                return new iri.g((iri.j) cVar.f288313j.get(), new iri.b(), bq.i.f(bVar.f288293a), bq.i.l(bVar.f288293a));
            case 6:
                return new iri.l(new iri.b(), bq.i.f(bVar.f288293a), (iri.d) bVar.k.get());
            case 7:
                return new iri.d(bq.i.f(bVar.f288293a));
            case 8:
                return new opi.b(bq.i.f(bVar.f288293a));
            case 9:
                return new xpi.c(bVar.f288294b, bq.i.b(bVar.f288293a));
            case 10:
                u3l.e eVar = (u3l.e) cVar.k.get();
                bVar.getClass();
                u3l.d.Companion.getClass();
                zhm.h0 h0Var = zhm.h0.f322473a;
                vc.s.k(h0Var);
                return new com.revolut.retail.retail_snackbar.mediator.a(eVar, ImmutableSet.copyOf((Collection) h0Var), (t3l.d) bVar.o.get(), new qm.e((um.c) cVar.f288314l.get()));
            case 11:
                return new t3l.h(bq.i.b(bVar.f288293a), bq.i.g(bVar.f288293a));
            case 12:
                bVar.getClass();
                return new g3l.c(ImmutableSet.copyOf((Collection) g3l.f.a()), (g3l.g) cVar.f288315m.get(), (k3l.b) bVar.f288303q.get(), new qm.e((um.c) cVar.f288314l.get()));
            case 13:
                return new k3l.d(bq.i.b(bVar.f288293a));
            case 14:
                return new nee.j((nee.c) cVar.f288316n.get(), bq.i.l(bVar.f288293a), bq.i.e(bVar.f288293a), (xpi.g) bVar.f288301n.get(), bVar.f288295c);
            case 15:
                opi.d dVar = (opi.d) bVar.f288300m.get();
                nee.c cVar2 = (nee.c) cVar.f288316n.get();
                oee.m mVar = (oee.m) bVar.u.get();
                oee.h hVar = new oee.h();
                vee.c cVar3 = bVar.d;
                l80.e eVarH = cVar3.f288309b.h();
                vc.s.j(eVarH);
                gte.a aVarB = cVar3.f288312h.b();
                vc.s.j(aVarB);
                oee.c cVar4 = new oee.c(aVarB, eVarH);
                l80.e eVarH2 = cVar3.f288309b.h();
                vc.s.j(eVarH2);
                ha3.o oVar = (ha3.o) cVar3.f288310c.G.get();
                vc.s.j(oVar);
                nee.g gVar = new nee.g(cVar4, new oee.g(eVarH2, oVar));
                l80.e eVarH3 = cVar.f288309b.h();
                vc.s.j(eVarH3);
                f9b.f fVar = (f9b.f) bVar.v.get();
                tpi.j jVar = (tpi.j) bVar.f288297h.get();
                k3l.b bVar2 = (k3l.b) bVar.f288303q.get();
                uce.c cVar5 = bVar.f288295c;
                az2.b bVarA = cVar.e.a();
                vc.s.j(bVarA);
                return new oee.v(dVar, cVar2, mVar, hVar, gVar, eVarH3, fVar, jVar, bVar2, cVar5, bVarA);
            case 16:
                nee.d dVar2 = (nee.d) bVar.f288306t.get();
                l93.f fVarJ = cVar.f288310c.j();
                vc.s.j(fVarJ);
                fk3.a aVarA = cVar.d.a();
                vc.s.j(aVarA);
                uz2.b bVar3 = (uz2.b) cVar.e.f275756j.get();
                vc.s.j(bVar3);
                l93.e eVar2 = (l93.e) cVar.f288310c.I.get();
                vc.s.j(eVar2);
                return new oee.m(dVar2, fVarJ, aVarA, bVar3, eVar2, cVar.f.e(), cVar.f288311g.a());
            case 17:
                pee.b.Companion.getClass();
                return new nee.d();
            case 18:
                return bq.i.t(bVar.f288293a);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        vfd.a aVar = (vfd.a) this.f282738b;
        vfd.c cVar = (vfd.c) this.d;
        int i = this.f282739c;
        switch (i) {
            case 0:
                lal.a factory = cVar.d();
                rfd.d view = cVar.f288577a;
                rfd.a controllerModelExtension = (rfd.a) cVar.f288581h.get();
                nhd.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
                return new mhd.d0(view, controllerModelExtension);
            case 1:
                return new phd.a();
            case 2:
                WatchlistHomeScreenContract$InputData inputData = cVar.f288578b;
                lal.a factory2 = cVar.d();
                nhd.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Intrinsics.checkNotNullParameter(factory2, "factory");
                CombinedWatchlistContext combinedWatchlistContext = inputData.f86973a;
                Intrinsics.checkNotNullParameter(combinedWatchlistContext, "combinedWatchlistContext");
                return new mhd.q0(combinedWatchlistContext, (l3d.h0) factory2.f193426b, (m3d.j) factory2.f193427c, (m3d.k) factory2.d, (phd.a) factory2.e);
            case 3:
                return trl.f.i((t60.b) cVar.f288582j.get());
            case 4:
                return trl.f.r(cVar.f288579c);
            case 5:
                o5d.c extensions = (o5d.c) cVar.f288583l.get();
                Intrinsics.checkNotNullParameter(extensions, "extensions");
                return extensions.f222422a;
            case 6:
                k18.c factory3 = aVar.f288571c.a();
                o5d.b delegates = cVar.d;
                Intrinsics.checkNotNullParameter(factory3, "factory");
                Intrinsics.checkNotNullParameter(delegates, "delegates");
                Intrinsics.checkNotNullParameter(delegates, "delegates");
                t5d.c cVarM = factory3.m();
                return new o5d.c(new aah.g(delegates, cVarM), cVarM);
            case 7:
                o5d.c extensions2 = (o5d.c) cVar.f288583l.get();
                Intrinsics.checkNotNullParameter(extensions2, "extensions");
                return extensions2.f222423b;
            case 8:
                o5d.c extensions3 = (o5d.c) cVar.f288583l.get();
                Intrinsics.checkNotNullParameter(extensions3, "extensions");
                Set setC3 = extensions3.f222423b.c3();
                vc.s.k(setC3);
                return setC3;
            case 9:
                dte.c cVar2 = cVar.e;
                dte.b bVar = (dte.b) cVar.f288586p.get();
                hfd.a aVar2 = aVar.e;
                return new ohd.a(cVar2, bVar, new w2d.a());
            case 10:
                ete.a factory4 = (ete.a) aVar.d.f324910h.get();
                vc.s.j(factory4);
                nhd.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory4, "factory");
                return factory4.a();
            case 11:
                mhd.p pVar = (mhd.p) cVar.f288588r.get();
                WatchlistHomeScreenContract$InputData watchlistHomeScreenContract$InputData = cVar.f288578b;
                rfd.a aVar3 = (rfd.a) cVar.f288581h.get();
                n3d.c cVarA = aVar.f288572g.a();
                vc.s.j(cVarA);
                ohd.a aVar4 = (ohd.a) cVar.f288587q.get();
                o5d.a aVar5 = (o5d.a) cVar.f288589s.get();
                ifd.h hVarB = aVar.f.b();
                vc.s.j(hVarB);
                return new mhd.j0(pVar, watchlistHomeScreenContract$InputData, aVar3, cVarA, aVar4, aVar5, hVarB);
            case 12:
                WatchlistHomeScreenContract$InputData watchlistHomeScreenContract$InputData2 = cVar.f288578b;
                ifd.h hVarB2 = aVar.f.b();
                vc.s.j(hVarB2);
                n3d.c cVarA2 = aVar.f288572g.a();
                vc.s.j(cVarA2);
                t70.b bVarG = aVar.f288573h.g();
                vc.s.j(bVarG);
                return new mhd.f0(watchlistHomeScreenContract$InputData2, hVarB2, cVarA2, bVarG, new t5d.d());
            case 13:
                o5d.c extensions4 = (o5d.c) cVar.f288583l.get();
                Intrinsics.checkNotNullParameter(extensions4, "extensions");
                return extensions4.f222423b;
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        vg3.g gVar = (vg3.g) this.f282738b;
        vg3.h hVar = (vg3.h) this.d;
        ChecklistCollectionScreenContract$InputData inputData = hVar.f288740a;
        vg3.g gVar2 = hVar.f288741b;
        int i = this.f282739c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            g80.c cVarY = gVar2.f288728h.y();
            vc.s.j(cVarY);
            return new ac4.g(new fh3.e(cVarY), new fh3.a(new kb8.a(gVar2.e.g(), 1)), new fh3.f(), new fh3.c(), new fh3.b(), new kh3.a());
        }
        cli.n nVar = (cli.n) hVar.f288742c.get();
        wg3.a aVar = (wg3.a) gVar.f288739x.get();
        wli.x xVarD = ((s41.a) gVar.f288727g).d();
        hy2.f fVarA = gVar2.i.a();
        ffk.t tVarF = gVar2.f288729j.f();
        vc.s.j(tVarF);
        eh3.b bVar = new eh3.b(fVarA, tVarF, new yqb.b());
        sri.m navigator = (sri.m) gVar2.f288734q.get();
        lg3.a aVarA = ((og3.e) gVar2.k).a();
        vc.s.j(aVarA);
        r10.t checklistCollectionChallengeProvider = new r10.t(aVarA, inputData);
        lg3.a checklistChallengesInteractor = ((og3.e) gVar2.k).a();
        vc.s.j(checklistChallengesInteractor);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(checklistCollectionChallengeProvider, "checklistCollectionChallengeProvider");
        Intrinsics.checkNotNullParameter(checklistChallengesInteractor, "checklistChallengesInteractor");
        twg.c cVar = new twg.c();
        cVar.f275017a = inputData;
        cVar.f275018b = navigator;
        cVar.f275019c = checklistCollectionChallengeProvider;
        cVar.d = checklistChallengesInteractor;
        lg3.a aVarA2 = ((og3.e) gVar2.k).a();
        vc.s.j(aVarA2);
        return new com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a(nVar, inputData, aVar, xVarD, bVar, cVar, new r10.t(aVarA2, inputData), new eh3.d());
    }

    private final Object d() {
        vg3.i iVar = (vg3.i) this.d;
        vg3.g gVar = (vg3.g) this.f282738b;
        djf.c cVar = gVar.d;
        int i = this.f282739c;
        if (i == 0) {
            cli.n nVar = (cli.n) iVar.e.get();
            ChecklistStepDetailsScreenContract$InputData checklistStepDetailsScreenContract$InputData = iVar.f288743a;
            wg3.a aVar = (wg3.a) gVar.f288739x.get();
            bil.a aVar2 = new bil.a(ImmutableMap.of(zg3.r.class, (hh3.f) iVar.f.get(), zg3.k.class, (hh3.f) iVar.f288746g.get()), 1);
            wli.x xVarD = ((s41.a) gVar.f288727g).d();
            f80.a aVarX = gVar.f288728h.x();
            vc.s.j(aVarX);
            return new gh3.l(nVar, checklistStepDetailsScreenContract$InputData, aVar, aVar2, xVarD, aVarX);
        }
        if (i == 1) {
            return new gh3.n(new hh3.c(ImmutableMap.of(jh3.b.class, (hh3.e) iVar.f288745c.get(), ih3.a.class, (hh3.e) iVar.d.get())), new kh3.a());
        }
        if (i == 2) {
            hh3.b bVar = new hh3.b();
            thf.g gVarE = cVar.e();
            vc.s.j(gVarE);
            return new jh3.d(bVar, gVarE);
        }
        if (i == 3) {
            return new ih3.c(new hh3.b(), new kb8.a(iVar.f288744b.e.g(), 1));
        }
        if (i != 4) {
            if (i == 5) {
                return new ih3.d();
            }
            throw new AssertionError(i);
        }
        whf.b bVarA = cVar.a();
        vc.s.j(bVarA);
        return new jh3.f(bVarA);
    }

    private final Object e() {
        vgd.b bVar = (vgd.b) this.f282738b;
        k3d.b bVar2 = bVar.f288841a;
        vgd.f fVar = (vgd.f) this.d;
        int i = this.f282739c;
        switch (i) {
            case 0:
                return trl.f.j((t60.b) fVar.e.get());
            case 1:
                return trl.f.s(fVar.f288851a);
            case 2:
                return n57.a.t((o5d.c) fVar.f288854g.get());
            case 3:
                return n57.a.w(bVar.f288842b.a(), fVar.f288852b);
            case 4:
                return n57.a.v((o5d.c) fVar.f288854g.get());
            case 5:
                return n57.a.g((o5d.c) fVar.f288854g.get());
            case 6:
                WatchlistAssetsScreenContract$InputData watchlistAssetsScreenContract$InputData = fVar.f288853c;
                l3d.r rVarA = bVar2.a();
                vc.s.j(rVarA);
                ahd.d dVar = (ahd.d) fVar.k.get();
                l3d.h0 h0VarB = bVar2.b();
                vc.s.j(h0VarB);
                m3d.j jVarA = bVar.f288843c.a();
                vc.s.j(jVarA);
                o5d.a aVar = (o5d.a) fVar.f288857l.get();
                ifd.h hVarB = bVar.d.b();
                vc.s.j(hVarB);
                ifd.h hVarB2 = fVar.d.d.b();
                vc.s.j(hVarB2);
                return new ahd.c0(watchlistAssetsScreenContract$InputData, rVarA, dVar, h0VarB, jVarA, aVar, hVarB, new ahd.s(hVarB2, new t5d.d()));
            case 7:
                l3d.r rVarA2 = bVar2.a();
                vc.s.j(rVarA2);
                return new ahd.d(rVarA2);
            case 8:
                return n57.a.u((o5d.c) fVar.f288854g.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        int i = this.f282739c;
        if (i == 0) {
            vjb.e eVar = (vjb.e) this.d;
            return new fkb.f(eVar.f289688a, (cli.n) eVar.f289689b.get(), ((vjb.b) ((vjb.g) this.f282738b).f289693a).b());
        }
        if (i == 1) {
            return new fkb.g();
        }
        throw new AssertionError(i);
    }

    private final Object g() {
        vjd.b bVar = (vjd.b) this.f282738b;
        ljl.q1 q1Var = bVar.f289707a;
        an0.c cVar = bVar.f289708b;
        vjd.c cVar2 = (vjd.c) this.d;
        int i = this.f282739c;
        switch (i) {
            case 0:
                Object extension = (hjl.b) cVar2.f289712c.get();
                xjd.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.d dVar = (yji.d) extension;
                vc.s.k(dVar);
                return dVar;
            case 1:
                hjl.e modelExtension = (hjl.e) cVar2.f289711b.get();
                xjl.j interactor = (xjl.j) ((ljl.q0) q1Var).f196058b0.get();
                vc.s.j(interactor);
                xjd.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
                Intrinsics.checkNotNullParameter(interactor, "interactor");
                Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
                return new eql.k(modelExtension);
            case 2:
                xjl.j interactor2 = (xjl.j) ((ljl.q0) q1Var).f196058b0.get();
                vc.s.j(interactor2);
                xjd.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(interactor2, "interactor");
                jol.b bVar2 = interactor2.f306562a;
                mp.p pVar = interactor2.f306563b;
                akl.k kVar = interactor2.f306564c;
                akl.l lVar = interactor2.d;
                fkg.a aVar = interactor2.e;
                ph0.f fVar = interactor2.f;
                gql.a aVar2 = interactor2.f306565g;
                bjl.p0 p0Var = interactor2.f306566h;
                xjl.i iVar = interactor2.i;
                return new eql.c0(kVar, lVar, interactor2.k, interactor2.f306567j, p0Var, aVar, aVar2, interactor2.f306568l, bVar2, pVar, fVar, iVar);
            case 3:
                Object extension2 = (hjl.e) cVar2.f289711b.get();
                xjd.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                yji.n nVar = (yji.n) extension2;
                vc.s.k(nVar);
                return nVar;
            case 4:
                cli.n nVar2 = (cli.n) cVar2.f.get();
                SignInMethodsScreenContract$InputData signInMethodsScreenContract$InputData = cVar2.f289710a;
                wl0.c cVarA = cVar.a();
                cn0.e eVarE = cVar.e();
                vc.s.j(eVarE);
                return new com.revolut.feature.sign_in_methods.impl.ui.sign_in_methods.a(nVar2, signInMethodsScreenContract$InputData, cVarA, eVarE, (hjl.e) cVar2.f289711b.get(), (wjd.d) cVar2.f289713g.get());
            case 5:
                tjd.a signInMethodsConfiguration = new tjd.a();
                Intrinsics.checkNotNullParameter(signInMethodsConfiguration, "signInMethodsConfiguration");
                return new wjd.u();
            case 6:
                return new wjd.d(cVar.a());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object h() {
        vk6.c cVar = (vk6.c) this.d;
        int i = this.f282739c;
        if (i == 0) {
            return new com.revolut.feature.external_accounts.impl.ui.colombia.pse.a(cVar.f289867a, (tak.d) cVar.d.get());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        vk6.b bVar = cVar.f289868b;
        uw1.b bVar2 = bVar.f289864b;
        p12.l lVar = bVar.f289865c;
        oz1.j jVarG = ((lz1.m) bVar2).g();
        x02.b bVarI = lVar.i();
        vc.s.j(bVarI);
        x02.a aVarH = lVar.h();
        vc.s.j(aVarH);
        tk6.d dVar = new tk6.d(jVarG, bVarI, aVarH, bVar.d.b());
        tk6.e eVar = new tk6.e();
        x02.d dVarK = ((vk6.b) this.f282738b).f289865c.k();
        vc.s.j(dVarK);
        return new tk6.k(dVar, eVar, dVarK);
    }

    private final Object i() {
        vl3.k kVar = (vl3.k) this.f282738b;
        l70.e eVar = kVar.f290205g;
        vl3.g gVar = (vl3.g) this.d;
        vl3.k kVar2 = gVar.f290187b;
        int i = this.f282739c;
        if (i != 0) {
            if (i == 1) {
                return new i3g.k(new nd.m(new sm3.b(), new sm3.a()), new nd.n(new sm3.b(), new sm3.a()), gVar.b());
            }
            if (i == 2) {
                mm3.b.Companion.getClass();
                return new zzl.c();
            }
            if (i != 3) {
                throw new AssertionError(i);
            }
            n8b.b bVarB = kVar.f290217x.b();
            vc.s.j(bVarB);
            fk3.a aVarA = kVar.f290218y.a();
            vc.s.j(aVarA);
            z80.b bVarS = eVar.s();
            vc.s.j(bVarS);
            return new qm3.b(bVarB, aVarA, bVarS);
        }
        cli.n nVar = (cli.n) gVar.d.get();
        pm3.a aVar = new pm3.a();
        AddContactInputData addContactInputData = gVar.f290186a;
        z80.b bVarS2 = kVar2.f290205g.s();
        vc.s.j(bVarS2);
        pm3.b bVar = new pm3.b(bVarS2);
        ang.f fVarE = kVar2.f290216w.e();
        z80.b bVarS3 = kVar2.f290205g.s();
        vc.s.j(bVarS3);
        kgm.i iVar = new kgm.i(fVarE, bVarS3);
        jpc.e eVarB = gVar.b();
        r2 r2Var = gVar.e;
        um3.a aVar2 = new um3.a();
        rm3.a aVar3 = new rm3.a();
        y80.a aVarR = eVar.r();
        vc.s.j(aVarR);
        s70.a aVarM = eVar.m();
        vc.s.j(aVarM);
        return new com.revolut.feature.contacts.impl.ui_kompot.add_contact.a(nVar, aVar, addContactInputData, bVar, iVar, eVarB, r2Var, aVar2, aVar3, aVarR, aVarM);
    }

    private final Object j() {
        vl3.j jVar = (vl3.j) this.d;
        vl3.k kVar = jVar.f290196b;
        vl3.k kVar2 = (vl3.k) this.f282738b;
        vl3.n nVar = kVar2.f290210n;
        l70.e eVar = kVar2.f290205g;
        int i = this.f282739c;
        switch (i) {
            case 0:
                Object extension = (hm3.f) jVar.f290197c.get();
                gm3.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.n nVar2 = (yji.n) extension;
                vc.s.k(nVar2);
                return nVar2;
            case 1:
                zja.a aVarA = ((ika.b) kVar2.f290203b).a();
                vc.s.j(aVarA);
                qbk.b bVar = (qbk.b) kVar2.f290204c.C.get();
                vc.s.j(bVar);
                return new hm3.j(aVarA, bVar);
            case 2:
                d2a.a model = (d2a.a) jVar.e.get();
                gm3.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                vc.s.k(model);
                return model;
            case 3:
                p2a.a factory = kVar2.d.a();
                vc.s.j(factory);
                gm3.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a();
            case 4:
                cli.n nVar3 = (cli.n) jVar.f290200j.get();
                ContactDetailsScreenContract$InputData contactDetailsScreenContract$InputData = jVar.f290195a;
                whf.b bVarA = kVar2.f290207j.a();
                vc.s.j(bVarA);
                wif.a aVarA2 = kVar2.k.a();
                r10.a aVar = new r10.a(new b6k.f(kVar.f290208l.b(), kVar.f290209m.a(), new j9l.a()), new b6k.d());
                wl3.u uVarF = nVar.f();
                hm3.d dVar = new hm3.d();
                hm3.a aVar2 = (hm3.a) jVar.k.get();
                r10.t tVar = new r10.t(kVar.f290210n.f(), kVar.f290212q.a());
                sf0.h hVarB = kVar2.f290213r.b();
                vc.s.j(hVarB);
                im3.d dVar2 = new im3.d();
                c70.a aVarZ = eVar.z();
                vc.s.j(aVarZ);
                hj8.a aVarA3 = kVar.f290214s.a();
                vc.s.j(aVarA3);
                z1l.d dVar3 = new z1l.d(aVarA3);
                obk.a aVar3 = kVar.f290204c;
                t1j.b planGiftingEligibilityInteractor = new t1j.b(new wbk.b((PlanGiftingEligibilityService) aVar3.f223985w.get(), obk.g.a()));
                tbk.b planGiftingAvailabilityInteractor = (tbk.b) aVar3.v.get();
                vc.s.j(planGiftingAvailabilityInteractor);
                Intrinsics.checkNotNullParameter(planGiftingEligibilityInteractor, "planGiftingEligibilityInteractor");
                Intrinsics.checkNotNullParameter(planGiftingAvailabilityInteractor, "planGiftingAvailabilityInteractor");
                r10.w wVar = new r10.w();
                wVar.f250865a = planGiftingEligibilityInteractor;
                wVar.f250866b = planGiftingAvailabilityInteractor;
                hm3.f fVar = (hm3.f) jVar.f290197c.get();
                dl3.f fVarC = nVar.c();
                vc.s.j(fVarC);
                qz0.b bVar2 = kVar2.f290215t;
                d2a.a aVar4 = (d2a.a) jVar.e.get();
                im3.c cVar = new im3.c();
                nhf.a aVarA4 = kVar2.u.a();
                vc.s.j(aVarA4);
                return new com.revolut.feature.contacts.impl.ui.contact.screen.details.a(nVar3, contactDetailsScreenContract$InputData, bVarA, aVarA2, aVar, uVarF, dVar, aVar2, tVar, hVarB, dVar2, aVarZ, dVar3, wVar, fVar, fVarC, bVar2, aVar4, cVar, aVarA4);
            case 5:
                f01.c cVarG = kVar2.e.g();
                a9e.h hVar = (a9e.h) jVar.i.get();
                nq9.b bVarB = kVar.f290206h.b();
                vc.s.j(bVarB);
                b6k.c cVar2 = new b6k.c();
                yof.a aVarA5 = kVar.i.a();
                vc.s.j(aVarA5);
                im3.h hVar2 = new im3.h(hVar, bVarB, cVar2, aVarA5);
                whf.n nVarB = kVar.f290207j.b();
                vc.s.j(nVarB);
                r2a.b bVar3 = new r2a.b();
                gte.a aVarB = kVar.f290202a.b();
                vc.s.j(aVarB);
                return new dm3.d0(cVarG, new dm3.n(hVar2, nVarB, bVar3, new im3.b(aVarB)));
            case 6:
                mae.p factory2 = kVar2.f.e();
                vc.s.j(factory2);
                f01.a uikitResources = (f01.a) jVar.f290199h.get();
                t70.b currenciesLocalization = eVar.g();
                vc.s.j(currenciesLocalization);
                gm3.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(uikitResources, "uikitResources");
                Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
                return factory2.d(uikitResources, currenciesLocalization);
            case 7:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) jVar.f290198g.get();
                gm3.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return new f01.c(controller.m2());
            case 8:
                xua.a aVarA6 = kVar2.o.a();
                vc.s.j(aVarA6);
                mq9.f fVarC2 = kVar2.f290211p.c();
                vc.s.j(fVarC2);
                return new hm3.c(aVarA6, fVarC2);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object k() {
        vle.b bVar = (vle.b) this.f282738b;
        int i = this.f282739c;
        if (i != 0) {
            if (i == 1) {
                return new ame.g();
            }
            throw new AssertionError(i);
        }
        cli.n nVar = (cli.n) ((vle.a) this.d).f290374a.get();
        u19.a aVar = (u19.a) ((t29.c) bVar.e).A.get();
        vc.s.j(aVar);
        mre.c cVarB = bVar.f.b();
        vc.s.j(cVarB);
        return new ame.f(nVar, aVar, cVarB);
    }

    private final Object l() {
        vle.c cVar = (vle.c) this.d;
        vle.b bVar = (vle.b) this.f282738b;
        int i = this.f282739c;
        switch (i) {
            case 0:
                g39.c cVar2 = cVar.f290393a;
                g39.b modelExtensionHolder = (g39.b) cVar.f290396g.get();
                Intrinsics.checkNotNullParameter(modelExtensionHolder, "modelExtensionHolder");
                Set set = modelExtensionHolder.f140242b;
                vc.s.k(set);
                return set;
            case 1:
                g39.c cVar3 = cVar.f290393a;
                ash.j widgetsView = cVar.f290394b;
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) cVar.f.get();
                i39.a lifestyleFeedWidgetApi = ((i39.a) bVar.f290379g).v;
                dcl.q factory = new dcl.q();
                he2.b dialogHostFinder = ehe.n.r();
                hsh.h widgetsExpandableDialogExtensionFactory = new hsh.h();
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
                Intrinsics.checkNotNullParameter(widgetsExpandableDialogExtensionFactory, "widgetsExpandableDialogExtensionFactory");
                he2.b factory2 = new he2.b(dialogHostFinder, widgetsExpandableDialogExtensionFactory, factory);
                Intrinsics.checkNotNullParameter(widgetsView, "widgetsView");
                Intrinsics.checkNotNullParameter(controller, "controller");
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(widgetsView, "widgetsView");
                Intrinsics.checkNotNullParameter(controller, "controller");
                k39.b bVar2 = new k39.b(sri.o.c(controller.m2(), null, null, 14), 0);
                j60.c bottomDialogExtension = new j60.c(controller, new rp0.m(), dialogHostFinder);
                Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
                nsh.p pVar = new nsh.p(bottomDialogExtension);
                i39.b bVar3 = new i39.b(lifestyleFeedWidgetApi, new i39.f(), bVar2);
                hsh.b widgetsApi = lifestyleFeedWidgetApi.f158112a;
                ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(9);
                builderBuilderWithExpectedSize.put("GiftCardsMedium", lifestyleFeedWidgetApi.Q);
                builderBuilderWithExpectedSize.put("AirportFastTrackPassMedium", lifestyleFeedWidgetApi.R);
                builderBuilderWithExpectedSize.put("AirportLoungesMedium", lifestyleFeedWidgetApi.S);
                builderBuilderWithExpectedSize.put("NearbyRewardsMedium", bVar3.f158130b);
                builderBuilderWithExpectedSize.put("EsimHomeSmall", bVar3.f158131c);
                builderBuilderWithExpectedSize.put("EsimHomeMedium", bVar3.d);
                builderBuilderWithExpectedSize.put("RevPointsRimMedium", bVar3.e);
                builderBuilderWithExpectedSize.put("TripItineraryMedium", bVar3.f);
                builderBuilderWithExpectedSize.put("LoyaltyTransactionsDynamic", bVar3.f158132g);
                ImmutableMap eventHandlers = builderBuilderWithExpectedSize.build();
                Intrinsics.checkNotNullParameter(widgetsApi, "widgetsApi");
                Intrinsics.checkNotNullParameter(lifestyleFeedWidgetApi, "lifestyleFeedWidgetApi");
                Intrinsics.checkNotNullParameter(eventHandlers, "eventHandlers");
                Intrinsics.checkNotNullParameter(widgetsView, "widgetsView");
                nsh.o oVarJ = widgetsApi.a().J(widgetsView, lifestyleFeedWidgetApi, eventHandlers, (ash.i) lifestyleFeedWidgetApi.N.get());
                Set setB = zhm.y0.b(bottomDialogExtension);
                yji.n[] elements = {oVarJ, pVar};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return new g39.b(oVarJ, setB, kotlin.collections.d.y0(elements));
            case 2:
                fd6.a aVar = (fd6.a) cVar.f290398j.get();
                va.g.t(aVar);
                return aVar;
            case 3:
                return va.g.s(((zc6.a) bVar.f290380h).d(), (xc6.a) cVar.i.get());
            case 4:
                return r6.b.k((zc6.a) bVar.f290380h, "factory");
            case 5:
                Object extension = (aub.a) cVar.f290399l.get();
                ome.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.n nVar = (yji.n) extension;
                vc.s.k(nVar);
                return nVar;
            case 6:
                z58.c cVar4 = bVar.i.f326197h0;
                he2.b provider = new he2.b(cVar4, (byte) 0);
                ome.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider, "provider");
                Object obj2 = cVar4.get();
                Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
                aub.a aVar2 = (aub.a) obj2;
                vc.s.k(aVar2);
                return aVar2;
            case 7:
                Object extension2 = (o1c.a) cVar.f290401n.get();
                ome.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                yji.n nVar2 = (yji.n) extension2;
                vc.s.k(nVar2);
                return nVar2;
            case 8:
                vy9.a aVar3 = bVar.f290381j.k;
                ugc.a provider2 = new ugc.a(aVar3);
                ome.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider2, "provider");
                Object obj3 = aVar3.get();
                Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                o1c.a aVar4 = (o1c.a) obj3;
                vc.s.k(aVar4);
                return aVar4;
            case 9:
                dyb.a extension3 = (dyb.a) cVar.f290402p.get();
                ome.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension3, "extension");
                vc.s.k(extension3);
                return extension3;
            case 10:
                o7.b provider3 = bVar.i.d();
                ome.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider3, "provider");
                dyb.a aVarE = provider3.e();
                vc.s.k(aVarE);
                return aVarE;
            case 11:
                Object extension4 = (pme.a) cVar.f290404r.get();
                ome.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension4, "extension");
                yji.n nVar3 = (yji.n) extension4;
                vc.s.k(nVar3);
                return nVar3;
            case 12:
                vle.b bVar4 = cVar.e;
                mre.c cVarB = bVar4.f.b();
                vc.s.j(cVarB);
                f80.a aVarX = bVar4.k.x();
                vc.s.j(aVarX);
                pme.b tabLifestyleRouter = new pme.b(cVarB, aVarX, bVar4.f290382l.h());
                ome.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(tabLifestyleRouter, "tabLifestyleRouter");
                return tabLifestyleRouter;
            case 13:
                Object extension5 = (ztb.a) cVar.f290406t.get();
                ome.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension5, "extension");
                yji.n nVar4 = (yji.n) extension5;
                vc.s.k(nVar4);
                return nVar4;
            case 14:
                z58.c cVar5 = bVar.i.j0;
                qy5.a provider4 = new qy5.a(cVar5);
                ome.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider4, "provider");
                Object obj4 = cVar5.get();
                Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                ztb.a aVar5 = (ztb.a) obj4;
                vc.s.k(aVar5);
                return aVar5;
            case 15:
                jyb.c extension6 = (jyb.c) cVar.v.get();
                ome.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension6, "extension");
                vc.s.k(extension6);
                return extension6;
            case 16:
                z58.c extension7 = bVar.i.f326212t0;
                Intrinsics.checkNotNullParameter(extension7, "extension");
                r39.a provider5 = new r39.a();
                ome.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider5, "provider");
                Object obj5 = extension7.get();
                Intrinsics.checkNotNullExpressionValue(obj5, "get(...)");
                return (jyb.c) obj5;
            case 17:
                wn.a extension8 = (wn.a) cVar.f290408x.get();
                Intrinsics.checkNotNullParameter(extension8, "extension");
                vc.s.k(extension8);
                return extension8;
            case 18:
                return v7.z(bVar.f290383m, "provider");
            case 19:
                wle.a extension9 = (wle.a) cVar.A.get();
                ome.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension9, "extension");
                vc.s.k(extension9);
                return extension9;
            case 20:
                return new wle.a((dub.a) cVar.z.get());
            case 21:
                z58.c revPointsTabActionExtension = bVar.i.i0;
                Intrinsics.checkNotNullParameter(revPointsTabActionExtension, "revPointsTabActionExtension");
                dcl.q provider6 = new dcl.q();
                ome.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider6, "provider");
                Object obj6 = revPointsTabActionExtension.get();
                Intrinsics.checkNotNullExpressionValue(obj6, "get(...)");
                return (dub.a) obj6;
            case 22:
                Object extension10 = (dub.a) cVar.z.get();
                ome.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension10, "extension");
                yji.n nVar5 = (yji.n) extension10;
                vc.s.k(nVar5);
                return nVar5;
            case 23:
                g39.c cVar6 = cVar.f290393a;
                g39.b modelExtensionHolder2 = (g39.b) cVar.f290396g.get();
                Intrinsics.checkNotNullParameter(modelExtensionHolder2, "modelExtensionHolder");
                Set set2 = modelExtensionHolder2.f140243c;
                vc.s.k(set2);
                return set2;
            case 24:
                return va.g.u((xc6.a) cVar.i.get());
            case 25:
                c0c.t view = cVar.f290395c;
                rkd.m factory3 = bVar.f290384n.a();
                vc.s.j(factory3);
                ome.g.Companion.getClass();
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(factory3, "factory");
                return factory3.a(view);
            case 26:
                return j40.h.a(((h30.n) bVar.f290378c).s());
            case 27:
                e4m.e eVar = cVar.J;
                vle.b bVar5 = cVar.e;
                nme.c1 c1Var = new nme.c1((jme.d) eVar.get(), (dme.a) cVar.P.get(), (kme.e) cVar.R.get(), (ime.a) cVar.S.get(), (lme.b) cVar.T.get(), ((zc6.a) bVar5.f290380h).c());
                TabLifestyleScreenContract$InputData tabLifestyleScreenContract$InputData = cVar.d;
                s19.a aVar6 = bVar.e;
                zc6.b bVar6 = bVar.f290380h;
                xmg.a aVar7 = bVar.B;
                s19.a aVar8 = bVar.e;
                zxb.k0 k0Var = bVar.i;
                u29.m mVar = (u29.m) ((t29.c) aVar6).f267477x.get();
                vc.s.j(mVar);
                p19.a aVarA = ((o19.b) bVar.f290387r).a();
                vc.s.j(aVarA);
                kbb.c cVarA = bVar.o.a();
                q06.l lVarA = bVar.u.a();
                vc.s.j(lVarA);
                wle.a aVar9 = (wle.a) cVar.A.get();
                o1c.a aVar10 = (o1c.a) cVar.f290401n.get();
                mkd.d dVar = (mkd.d) cVar.F.get();
                gte.a aVarB = bVar.d.b();
                vc.s.j(aVarB);
                bd3.a aVarA2 = bVar.v.a();
                vc.s.j(aVarA2);
                u29.p pVar2 = (u29.p) ((t29.c) aVar8).f267478y.get();
                vc.s.j(pVar2);
                wn.a aVar11 = (wn.a) cVar.f290408x.get();
                eub.a aVarA3 = k0Var.a();
                vc.s.j(aVarA3);
                rul.e eVarA = bVar.f290381j.a();
                nyb.i0 i0VarF = k0Var.f();
                vc.s.j(i0VarF);
                u29.g gVarA = ((t29.c) aVar8).f267466h.a();
                vc.s.j(gVarA);
                eub.i iVarE = k0Var.e();
                vc.s.j(iVarE);
                aub.a aVar12 = (aub.a) cVar.f290399l.get();
                wsg.n nVarB = bVar.f290390w.b();
                ffk.t tVarF = bVar.f290391x.f();
                vc.s.j(tVarF);
                bn2.p pVarC = bVar.f290392y.c();
                dyb.a aVar13 = (dyb.a) cVar.f290402p.get();
                xn.c cVar7 = new xn.c();
                nyb.j jVarB = k0Var.b();
                vc.s.j(jVarB);
                pme.a aVar14 = (pme.a) cVar.f290404r.get();
                ztb.a aVar15 = (ztb.a) cVar.f290406t.get();
                utk.f fVarJ = bVar.z.f136167c.j();
                jul.o oVar = new jul.o(bVar5.A.b());
                j40.a aVar16 = (j40.a) cVar.G.get();
                ash.e eVar2 = (ash.e) cVar.U.get();
                k39.a aVar17 = (k39.a) ((i39.a) bVar.f290379g).P.get();
                vc.s.j(aVar17);
                r10.q qVarD = aVar7.d();
                i4b.f fVarB = ((zc6.a) bVar6).b();
                r10.d dVarE = ((zc6.a) bVar6).e();
                l61.a aVarB2 = aVar7.b();
                vc.s.j(aVarB2);
                yle.a aVar18 = new yle.a();
                u29.b bVar7 = (u29.b) ((t29.f) ((t29.c) aVar8).i).f267489j.get();
                vc.s.j(bVar7);
                jyb.c cVar8 = (jyb.c) cVar.v.get();
                web.b bVar8 = (web.b) bVar.C.i.get();
                vc.s.j(bVar8);
                ash.j jVar = cVar.f290394b;
                mk0.a aVarA4 = bVar.f290389t.a();
                vc.s.j(aVarA4);
                return new com.revolut.feature.tab.lifestyle.impl.ui.screen.f(c1Var, tabLifestyleScreenContract$InputData, mVar, aVarA, cVarA, lVarA, aVar9, aVar10, dVar, aVarB, aVarA2, pVar2, aVar11, aVarA3, eVarA, i0VarF, gVarA, iVarE, aVar12, nVarB, tVarF, pVarC, aVar13, cVar7, jVarB, aVar14, aVar15, fVarJ, oVar, aVar16, eVar2, aVar17, qVarD, fVarB, dVarE, aVarB2, aVar18, bVar7, cVar8, bVar8, jVar, aVarA4);
            case 28:
                itb.c cVarB2 = bVar.o.b();
                vc.s.j(cVarB2);
                fme.f fVar = (fme.f) cVar.I.get();
                hme.a aVar19 = new hme.a((fme.b) cVar.H.get());
                m19.c cVar9 = (m19.c) ((o19.b) bVar.f290387r).f221362n.get();
                vc.s.j(cVar9);
                gte.a aVarB3 = bVar.d.b();
                vc.s.j(aVarB3);
                return new jme.i(cVarB2, fVar, aVar19, cVar9, aVarB3);
            case 29:
                return new fme.i((fme.b) cVar.H.get(), ((qgk.k3) bVar.f290385p).b(), bVar.f290386q.a());
            case 30:
                gte.a aVarB4 = bVar.d.b();
                vc.s.j(aVarB4);
                l80.e eVarH = bVar.k.h();
                vc.s.j(eVarH);
                return new fme.d(aVarB4, eVarH);
            case 31:
                return new dme.d((eme.c) cVar.L.get(), (cme.e) cVar.M.get(), (gme.b) cVar.N.get(), (bme.c) cVar.O.get());
            case 32:
                return new eme.e((eme.b) cVar.K.get());
            case 33:
                return new eme.b();
            case 34:
                return new cme.h(new cme.c(cVar.e.f290388s.g()));
            case 35:
                return new gme.c();
            case 36:
                mk0.a aVarA5 = bVar.f290389t.a();
                vc.s.j(aVarA5);
                return new bme.e(aVarA5);
            case 37:
                return new kme.g((kme.b) cVar.Q.get());
            case 38:
                return new kme.c();
            case 39:
                return new ime.b();
            case 40:
                eub.a aVarA6 = bVar.i.a();
                vc.s.j(aVarA6);
                m19.g gVar = (m19.g) ((o19.b) bVar.f290387r).f221361m.get();
                vc.s.j(gVar);
                return new lme.d(aVarA6, gVar);
            case 41:
                g39.c cVar10 = cVar.f290393a;
                g39.b modelExtensionHolder3 = (g39.b) cVar.f290396g.get();
                Intrinsics.checkNotNullParameter(modelExtensionHolder3, "modelExtensionHolder");
                return modelExtensionHolder3.f140241a;
            case 42:
                com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) cVar.f.get();
                ome.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller2, "controller");
                return new rp0.l0(controller2.m2());
            case 43:
                os2.g factory4 = bVar.f290383m.c();
                Intrinsics.checkNotNullParameter(factory4, "factory");
                return (sn.a) factory4.f229224b;
            default:
                throw new AssertionError(i);
        }
    }

    private final Object m() {
        vn2.g gVar = (vn2.g) this.d;
        int i = this.f282739c;
        if (i == 0) {
            return new wp2.f((cli.n) gVar.f290674b.get(), gVar.f290673a);
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        l80.e eVarH = ((vn2.h) this.f282738b).d.h();
        vc.s.j(eVarH);
        return new wp2.i(eVarH);
    }

    private final Object n() {
        vn2.i iVar = (vn2.i) this.d;
        int i = this.f282739c;
        if (i != 0) {
            if (i == 1) {
                return new do2.r();
            }
            throw new AssertionError(i);
        }
        cli.n nVar = (cli.n) iVar.f290687c.get();
        BankAccountSwitchingFormScreenContract$InputData bankAccountSwitchingFormScreenContract$InputData = iVar.f290685a;
        fo2.j jVar = new fo2.j((pn2.d) iVar.f290686b.o.get());
        l80.e eVarH = ((vn2.h) this.f282738b).d.h();
        vc.s.j(eVarH);
        return new do2.q(nVar, bankAccountSwitchingFormScreenContract$InputData, jVar, eVarH, new fo2.g());
    }

    @Override // phm.a
    public final Object get() {
        Object dVar;
        Object j0Var;
        switch (this.f282737a) {
            case 0:
                s2 s2Var = (s2) this.d;
                InvoiceRemindersScreenContract$InputData inputData = s2Var.f282747a;
                int i = this.f282739c;
                if (i == 0) {
                    Object extension = (ly6.f) s2Var.f282748b.get();
                    ky6.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension, "extension");
                    yji.n nVar = (yji.n) extension;
                    vc.s.k(nVar);
                    return nVar;
                }
                if (i != 1) {
                    if (i == 2) {
                        return new jy6.m((ly6.f) s2Var.f282748b.get(), new jy6.p(inputData));
                    }
                    throw new AssertionError(i);
                }
                et6.p1 freelancerInvoiceInteractor = ((g2) this.f282738b).f282552a.o();
                vc.s.j(freelancerInvoiceInteractor);
                ky6.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(freelancerInvoiceInteractor, "freelancerInvoiceInteractor");
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                if (Intrinsics.f(inputData, InvoiceRemindersScreenContract$InputData.DefaultInvoiceReminders.f73921a)) {
                    return new ly6.c(freelancerInvoiceInteractor);
                }
                if (inputData instanceof InvoiceRemindersScreenContract$InputData.SingleInvoiceReminders) {
                    return new ly6.k(freelancerInvoiceInteractor, (InvoiceRemindersScreenContract$InputData.SingleInvoiceReminders) inputData);
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                b3 b3Var = (b3) this.d;
                InvoiceEmailMessageScreenContract$InputData invoiceEmailMessageScreenContract$InputData = b3Var.f282466b;
                int i2 = this.f282739c;
                if (i2 == 0) {
                    Object extension2 = (yx6.e) b3Var.f282467c.get();
                    xx6.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension2, "extension");
                    yji.n nVar2 = (yji.n) extension2;
                    vc.s.k(nVar2);
                    return nVar2;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        return new wx6.j((yx6.e) b3Var.f282467c.get(), new wx6.l(invoiceEmailMessageScreenContract$InputData));
                    }
                    throw new AssertionError(i2);
                }
                et6.p1 p1VarO = ((g2) this.f282738b).f282552a.o();
                vc.s.j(p1VarO);
                return xhi.f.g(p1VarO, invoiceEmailMessageScreenContract$InputData);
            case 2:
                b3 b3Var2 = (b3) this.d;
                InvoiceEmailMessageScreenContract$InputData invoiceEmailMessageScreenContract$InputData2 = b3Var2.f282466b;
                int i3 = this.f282739c;
                if (i3 == 0) {
                    Object extension3 = (yx6.e) b3Var2.f282467c.get();
                    xx6.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension3, "extension");
                    yji.n nVar3 = (yji.n) extension3;
                    vc.s.k(nVar3);
                    return nVar3;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        return new wx6.j((yx6.e) b3Var2.f282467c.get(), new wx6.l(invoiceEmailMessageScreenContract$InputData2));
                    }
                    throw new AssertionError(i3);
                }
                et6.p1 p1VarO2 = ((g2) this.f282738b).f282552a.o();
                vc.s.j(p1VarO2);
                return xhi.f.g(p1VarO2, invoiceEmailMessageScreenContract$InputData2);
            case 3:
                d3 d3Var = (d3) this.d;
                InvoicePaymentMethodsScreenContract$InputData invoicePaymentMethodsScreenContract$InputData = d3Var.f282496b;
                int i5 = this.f282739c;
                if (i5 == 0) {
                    Object extension4 = (dy6.e) d3Var.f282497c.get();
                    cy6.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension4, "extension");
                    yji.n nVar4 = (yji.n) extension4;
                    vc.s.k(nVar4);
                    return nVar4;
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        return new by6.k((dy6.e) d3Var.f282497c.get(), new by6.m(invoicePaymentMethodsScreenContract$InputData, new ey6.b()));
                    }
                    throw new AssertionError(i5);
                }
                et6.p1 p1VarO3 = ((g2) this.f282738b).f282552a.o();
                vc.s.j(p1VarO3);
                return cwi.u.n(p1VarO3, invoicePaymentMethodsScreenContract$InputData);
            case 4:
                d3 d3Var2 = (d3) this.d;
                InvoicePaymentMethodsScreenContract$InputData invoicePaymentMethodsScreenContract$InputData2 = d3Var2.f282496b;
                int i6 = this.f282739c;
                if (i6 == 0) {
                    Object extension5 = (dy6.e) d3Var2.f282497c.get();
                    cy6.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension5, "extension");
                    yji.n nVar5 = (yji.n) extension5;
                    vc.s.k(nVar5);
                    return nVar5;
                }
                if (i6 != 1) {
                    if (i6 == 2) {
                        return new by6.k((dy6.e) d3Var2.f282497c.get(), new by6.m(invoicePaymentMethodsScreenContract$InputData2, new ey6.b()));
                    }
                    throw new AssertionError(i6);
                }
                et6.p1 p1VarO4 = ((g2) this.f282738b).f282552a.o();
                vc.s.j(p1VarO4);
                return cwi.u.n(p1VarO4, invoicePaymentMethodsScreenContract$InputData2);
            case 5:
                uv2.a aVar = (uv2.a) this.f282738b;
                iwh.j jVar = (iwh.j) this.d;
                ShowCardPinScreenContract$InputData showCardPinScreenContract$InputData = jVar.f169109b;
                int i21 = this.f282739c;
                if (i21 != 0) {
                    if (i21 == 1) {
                        return new wv2.p(showCardPinScreenContract$InputData);
                    }
                    throw new AssertionError(i21);
                }
                cli.n nVar6 = (cli.n) jVar.f169110c.get();
                rv2.a aVar2 = (rv2.a) ((iwh.c) aVar.f283293a).f169092g.get();
                vc.s.j(aVar2);
                return new wv2.n(nVar6, showCardPinScreenContract$InputData, aVar2, (c90.c) aVar.d.get());
            case 6:
                v0i.b bVar = (v0i.b) this.f282738b;
                v0i.a aVar3 = (v0i.a) this.d;
                int i22 = this.f282739c;
                if (i22 == 0) {
                    return kxa.j.j((j60.a) aVar3.e.get());
                }
                if (i22 == 1) {
                    return v1.c.r((com.revolut.kompot.navigable.a) aVar3.f284854c.get(), (rp0.m) aVar3.d.get());
                }
                if (i22 == 2) {
                    return new rp0.m();
                }
                if (i22 != 3) {
                    if (i22 != 4) {
                        throw new AssertionError(i22);
                    }
                    j60.a bottomExpandableDialogEmbeddedControllerExtension = (j60.a) aVar3.e.get();
                    k3i.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(bottomExpandableDialogEmbeddedControllerExtension, "bottomExpandableDialogEmbeddedControllerExtension");
                    vc.s.k(bottomExpandableDialogEmbeddedControllerExtension);
                    return bottomExpandableDialogEmbeddedControllerExtension;
                }
                TakeProfitStopLossParams takeProfitStopLossParams = aVar3.f284852a;
                v0i.b bVar2 = aVar3.f284853b;
                nwh.b bVarA = bVar2.f284868r.a();
                l80.e eVarH = bVar2.i.h();
                vc.s.j(eVarH);
                j3i.t tVar = new j3i.t(bVarA, eVarH);
                jx0.a aVar4 = new jx0.a(((n51.a) bVar.f284862j).b(), bVar.k.a());
                u80.t tVarU = bVar.i.u();
                vc.s.j(tVarU);
                return new com.revolut.feature_exchange.impl.ui.takeprofit_stopsell.chart_limit.b(takeProfitStopLossParams, tVar, aVar4, tVarU, (j60.a) aVar3.e.get(), bVar.e.d());
            case 7:
                l70.e eVar = ((v0i.b) this.f282738b).i;
                v0i.d dVar2 = (v0i.d) this.d;
                int i32 = this.f282739c;
                switch (i32) {
                    case 0:
                        n60.a aVar5 = (n60.a) dVar2.d.get();
                        o5k.i.l(aVar5);
                        return aVar5;
                    case 1:
                        return o5k.i.q((com.revolut.kompot.navigable.a) dVar2.f284877c.get());
                    case 2:
                        return kxa.j.k((j60.a) dVar2.f284878g.get());
                    case 3:
                        return ehe.n.s((com.revolut.kompot.navigable.a) dVar2.f284877c.get(), (rp0.m) dVar2.f.get());
                    case 4:
                        return new rp0.m();
                    case 5:
                        TPSLAmountControllerContract$InputData tPSLAmountControllerContract$InputData = dVar2.f284875a;
                        u80.t tVarU2 = eVar.u();
                        vc.s.j(tVarU2);
                        qd0.b bVarN = eVar.n();
                        vc.s.j(bVarN);
                        j60.a aVar6 = (j60.a) dVar2.f284878g.get();
                        h3i.d dVar3 = (h3i.d) dVar2.i.get();
                        h3i.a aVar7 = (h3i.a) dVar2.f284880j.get();
                        n60.a aVar8 = (n60.a) dVar2.d.get();
                        u80.t tVarU3 = dVar2.f284876b.i.u();
                        vc.s.j(tVarU3);
                        return new e3i.s(tPSLAmountControllerContract$InputData, tVarU2, bVarN, aVar6, dVar3, aVar7, aVar8, new e3i.v(tVarU3, (f3i.a) dVar2.k.get()));
                    case 6:
                        return new h3i.e();
                    case 7:
                        return new h3i.c();
                    case 8:
                        return new f3i.b();
                    default:
                        throw new AssertionError(i32);
                }
            case 8:
                v8k.c cVar = (v8k.c) this.f282738b;
                v8k.f fVar = (v8k.f) this.d;
                int i33 = this.f282739c;
                switch (i33) {
                    case 0:
                        return kxa.j.j((j60.a) fVar.f.get());
                    case 1:
                        return v1.c.r((com.revolut.kompot.navigable.a) fVar.d.get(), (rp0.m) fVar.e.get());
                    case 2:
                        return new rp0.m();
                    case 3:
                        n60.b bVar3 = (n60.b) fVar.f286839h.get();
                        o5k.i.m(bVar3);
                        return bVar3;
                    case 4:
                        return o5k.i.r((com.revolut.kompot.navigable.a) fVar.d.get());
                    case 5:
                        n60.a aVar9 = (n60.a) fVar.f286840j.get();
                        o5k.i.l(aVar9);
                        return aVar9;
                    case 6:
                        return o5k.i.q((com.revolut.kompot.navigable.a) fVar.d.get());
                    case 7:
                        return nga.c.s(cVar.f286800c.c(), (mga.i0) fVar.f286841l.get(), (mga.f0) fVar.f286843n.get(), (on.a) fVar.o.get());
                    case 8:
                        yji.o controller = (com.revolut.kompot.navigable.a) fVar.d.get();
                        m9k.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller, "controller");
                        mga.i0 i0Var = (mga.i0) controller;
                        vc.s.k(i0Var);
                        return i0Var;
                    case 9:
                        return nga.c.u(cVar.f286800c.c(), fVar.f286835a, (wn.a) fVar.f286842m.get());
                    case 10:
                        return v7.z(cVar.u, "provider");
                    case 11:
                        os2.g factory = cVar.u.c();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        return (sn.a) factory.f229224b;
                    case 12:
                        i5k.a aVar10 = (i5k.a) fVar.f286845q.get();
                        j5k.b.a(aVar10);
                        return aVar10;
                    case 13:
                        l80.h hVarV = cVar.f286799b.v();
                        vc.s.j(hVarV);
                        dVar = new i5k.d(hVarV);
                        break;
                    case 14:
                        bsf.i extension6 = (bsf.i) fVar.f286847s.get();
                        m9k.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension6, "extension");
                        vc.s.k(extension6);
                        return extension6;
                    case 15:
                        b9.w2 factory2 = cVar.P.b();
                        m9k.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory2, "factory");
                        return factory2.m();
                    case 16:
                        return o5k.d.a((n5k.b) fVar.f286850x.get());
                    case 17:
                        j9k.z zVarJ = fVar.j();
                        v8k.c cVar2 = fVar.f286837c;
                        p9k.a aVar11 = (p9k.a) fVar.u.get();
                        t1j.b bVarE = cVar2.f286803j.e();
                        rga.c cVarB = cVar2.f286800c.b();
                        vc.s.j(cVarB);
                        e9k.g gVar = new e9k.g(zVarJ, aVar11, new j9k.c0(bVarE, cVarB));
                        p5k.d dVar4 = new p5k.d();
                        p5k.x xVarQ = fVar.q();
                        qga.a aVar12 = cVar2.f286814y;
                        p5k.k kVar = new p5k.k(dVar4, xVarQ, aVar12.b(), fVar.b(), new jt0.b(aVar12.b(), cVar2.B.a(), fVar.b()), fVar.c(), new RateExplanationDialogMapper());
                        ffk.t tVarF = cVar.C.f();
                        vc.s.j(tVarF);
                        ang.f fVarE = cVar.o.e();
                        wif.a aVarA = cVar.B.a();
                        gte.a aVarB = cVar.f286809r.b();
                        vc.s.j(aVarB);
                        j60.a aVar13 = (j60.a) fVar.f.get();
                        qpk.b bVar4 = new qpk.b();
                        v2k.c cVarA = cVar.f286813x.a();
                        mre.c cVarB2 = cVar.D.b();
                        vc.s.j(cVarB2);
                        z0h.a aVarB2 = ((u8h.b) cVar.z).b();
                        vc.s.j(aVarB2);
                        l80.e eVarH2 = cVar2.f286799b.h();
                        vc.s.j(eVarH2);
                        dVar = new n5k.p(gVar, kVar, tVarF, fVarE, aVarA, aVarB, aVar13, bVar4, cVarA, cVarB2, aVarB2, new p5k.a(eVarH2), cVar.E.b(), (n5k.q) fVar.f286849w.get());
                        break;
                    case 18:
                        p9k.e.Companion.getClass();
                        return new p9k.a();
                    case 19:
                        aah.i iVarD = ((u8h.b) cVar.z).d();
                        vc.s.j(iVarD);
                        return o5k.i.C(iVarD);
                    case 20:
                        return new n5k.r(new RateExplanationDialogMapper());
                    case 21:
                        return o5k.i.a((n5k.q) fVar.f286849w.get());
                    case 22:
                        wn.a aVar14 = (wn.a) fVar.f286842m.get();
                        n57.a.d(aVar14);
                        return aVar14;
                    case 23:
                        jm4.a3 a3Var = cVar.Q;
                        vt4.h mapper = new vt4.h();
                        Intrinsics.checkNotNullParameter(mapper, "mapper");
                        dVar = new zrf.m(mapper);
                        break;
                    case 24:
                        return wpg.v.C((zrf.m) fVar.B.get(), (yrf.a) fVar.C.get());
                    case 25:
                        return new yrf.a();
                    case 26:
                        PeerToPeerReviewScreenInputData peerToPeerReviewScreenInputData = fVar.f286836b;
                        v8k.c cVar3 = fVar.f286837c;
                        j9k.z zVarJ2 = fVar.j();
                        t1j.b bVarE2 = cVar3.f286803j.e();
                        rga.c cVarB3 = cVar3.f286800c.b();
                        vc.s.j(cVarB3);
                        jid.z zVar = new jid.z(zVarJ2, new j9k.c0(bVarE2, cVarB3));
                        p9k.a aVar15 = (p9k.a) fVar.u.get();
                        j60.a aVar16 = (j60.a) fVar.f.get();
                        zof.f fVarD = cVar.d.d();
                        vc.s.j(fVarD);
                        yof.a aVarA2 = cVar.d.a();
                        vc.s.j(aVarA2);
                        l80.e eVarH3 = cVar.f286799b.h();
                        vc.s.j(eVarH3);
                        tga.k kVarB = cVar.f286814y.b();
                        i5k.a aVar17 = (i5k.a) fVar.f286845q.get();
                        vrf.h hVar = (vrf.h) fVar.F.get();
                        bsf.i iVar = (bsf.i) fVar.f286847s.get();
                        PeerToPeerReviewScreenInputData peerToPeerReviewScreenInputData2 = fVar.f286836b;
                        yof.k kVarG = cVar3.d.g();
                        vc.s.j(kVarG);
                        p5k.x xVarQ2 = fVar.q();
                        l80.e eVarH4 = cVar3.f286799b.h();
                        vc.s.j(eVarH4);
                        p5k.a aVar18 = new p5k.a(eVarH4);
                        fsf.b bVar5 = (fsf.b) cVar3.R.f218861b.get();
                        vc.s.j(bVar5);
                        return new com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.review.a(peerToPeerReviewScreenInputData, zVar, aVar15, aVar16, fVarD, aVarA2, eVarH3, kVarB, aVar17, hVar, iVar, new l9k.n(peerToPeerReviewScreenInputData2, kVarG, new jpc.e(xVarQ2, aVar18, bVar5), (vrf.h) fVar.F.get()));
                    case 27:
                        List providers = wpg.v.D((zrf.g) fVar.D.get(), (zrf.m) fVar.B.get(), (zrf.n) fVar.E.get());
                        Intrinsics.checkNotNullParameter(providers, "providers");
                        dVar = new xrf.b(providers);
                        break;
                    case 28:
                        return new zrf.n();
                    default:
                        throw new AssertionError(i33);
                }
                return dVar;
            case 9:
                v8k.g gVar2 = (v8k.g) this.d;
                v8k.c cVar4 = (v8k.c) this.f282738b;
                int i43 = this.f282739c;
                switch (i43) {
                    case 0:
                        wj0.a idempotencyKeyHolder = ((nj0.d) cVar4.f286798a).i();
                        vc.s.j(idempotencyKeyHolder);
                        l80.e dateProvider = cVar4.f286799b.h();
                        vc.s.j(dateProvider);
                        g9k.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
                        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                        return new m60.b(idempotencyKeyHolder, dateProvider, "payments_peer_to_peer_transfer");
                    case 1:
                        wj0.a idempotencyKeyHolder2 = ((nj0.d) cVar4.f286798a).i();
                        vc.s.j(idempotencyKeyHolder2);
                        l80.e dateProvider2 = cVar4.f286799b.h();
                        vc.s.j(dateProvider2);
                        g9k.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(idempotencyKeyHolder2, "idempotencyKeyHolder");
                        Intrinsics.checkNotNullParameter(dateProvider2, "dateProvider");
                        return new m60.b(idempotencyKeyHolder2, dateProvider2, "payments_links_transfer");
                    case 2:
                        wj0.a idempotencyKeyHolder3 = ((nj0.d) cVar4.f286798a).i();
                        vc.s.j(idempotencyKeyHolder3);
                        l80.e dateProvider3 = cVar4.f286799b.h();
                        vc.s.j(dateProvider3);
                        g9k.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(idempotencyKeyHolder3, "idempotencyKeyHolder");
                        Intrinsics.checkNotNullParameter(dateProvider3, "dateProvider");
                        return new m60.b(idempotencyKeyHolder3, dateProvider3, "payments_recurring_transfer");
                    case 3:
                        pak.h priceQuoteTraceIdControllerExtensionFactory = cVar4.f286800c.a();
                        g9k.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(priceQuoteTraceIdControllerExtensionFactory, "priceQuoteTraceIdControllerExtensionFactory");
                        return priceQuoteTraceIdControllerExtensionFactory.a("payments_peer_to_peer_price_quote");
                    case 4:
                        Object extension7 = (o9k.v0) gVar2.f286856h.get();
                        g9k.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension7, "extension");
                        yji.n nVar7 = (yji.n) extension7;
                        vc.s.k(nVar7);
                        return nVar7;
                    case 5:
                        v8k.c cVar5 = gVar2.f286853b;
                        cpf.b bVarE3 = cVar5.d.e();
                        vc.s.j(bVarE3);
                        sw8.a aVar19 = new sw8.a();
                        wj5.a aVar20 = (wj5.a) ((ak5.i) cVar5.e).f5699q.get();
                        vc.s.j(aVar20);
                        sf0.h hVarB = cVar5.f.b();
                        vc.s.j(hVarB);
                        l80.e eVarH5 = cVar5.f286799b.h();
                        vc.s.j(eVarH5);
                        o9k.u0 u0Var = new o9k.u0(bVarE3, aVar19, aVar20, hVarB, new o9k.a(eVarH5));
                        v8k.c cVar6 = gVar2.f286853b;
                        c9e.c cVarB4 = cVar6.f286801g.b();
                        vc.s.j(cVarB4);
                        o9k.b bVar6 = new o9k.b(cVarB4, cVar6.f286802h.b());
                        cpf.c cVarF = cVar4.d.f();
                        vc.s.j(cVarF);
                        return new o9k.w0(u0Var, bVar6, cVarF);
                    case 6:
                        Object extension8 = cVar4.d.f();
                        vc.s.j(extension8);
                        g9k.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension8, "extension");
                        return (yji.n) extension8;
                    case 7:
                        o9k.j0 extension9 = (o9k.j0) gVar2.f286858l.get();
                        g9k.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension9, "extension");
                        vc.s.k(extension9);
                        return extension9;
                    case 8:
                        v8k.c cVar7 = gVar2.f286853b;
                        v8k.c cVar8 = gVar2.f286853b;
                        agf.b bVarA2 = ((dgf.a) cVar7.i).a();
                        vc.s.j(bVarA2);
                        ogm.i iVarC = cVar7.f286803j.c();
                        o9k.v0 v0Var = (o9k.v0) gVar2.f286856h.get();
                        b3a.a aVarA3 = cVar7.k.a();
                        vc.s.j(aVarA3);
                        o9k.y yVar = new o9k.y(bVarA2, iVarC, v0Var, new o9k.x0(aVarA3));
                        q8k.o oVar = (q8k.o) gVar2.k.get();
                        o9k.v0 v0Var2 = (o9k.v0) gVar2.f286856h.get();
                        ks0.n nVar8 = new ks0.n((o9k.v0) gVar2.f286856h.get());
                        aqf.b controller2 = cVar8.d.c();
                        vc.s.j(controller2);
                        g9k.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller2, "controller");
                        g9k.b bVar7 = new g9k.b(controller2, 0);
                        gte.a aVarB3 = cVar8.f286809r.b();
                        vc.s.j(aVarB3);
                        wsg.n nVarB = cVar8.f286807p.b();
                        hj8.a aVarA4 = cVar8.f286810s.a();
                        vc.s.j(aVarA4);
                        j0Var = new o9k.j0(yVar, oVar, v0Var2, nVar8, bVar7, new kbb.c(aVarB3, nVarB, aVarA4));
                        break;
                    case 9:
                        x8k.c cVarC = cVar4.f286802h.c();
                        cl3.a aVarD = cVar4.f286804l.d();
                        vc.s.j(aVarD);
                        vv9.c cVarC2 = ((s6k.b) cVar4.f286805m).c();
                        vc.s.j(cVarC2);
                        k61.a aVarE = cVar4.f286806n.e();
                        vc.s.j(aVarE);
                        bqf.d dVarA = cVar4.f286803j.a();
                        ang.f fVarE2 = cVar4.o.e();
                        wsg.n nVarB2 = cVar4.f286807p.b();
                        z80.b bVarS = cVar4.f286799b.s();
                        vc.s.j(bVarS);
                        return new o9k.t0(cVarC, aVarD, cVarC2, aVarE, dVarA, fVarE2, nVarB2, bVarS, cVar4.f286808q.a());
                    case 10:
                        r10.f factory3 = cVar4.f286811t.a();
                        g9k.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory3, "factory");
                        return factory3.d();
                    case 11:
                        PeerToPeerTransferInputData peerToPeerTransferInputData = gVar2.f286852a;
                        b3a.a aVarA5 = cVar4.k.a();
                        vc.s.j(aVarA5);
                        o9k.i iVar2 = new o9k.i(gVar2.f286852a);
                        o9k.j0 j0Var2 = (o9k.j0) gVar2.f286858l.get();
                        aqf.b bVarC = cVar4.d.c();
                        vc.s.j(bVarC);
                        j0Var = new com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.flow.c(peerToPeerTransferInputData, aVarA5, iVar2, j0Var2, bVarC);
                        break;
                    case 12:
                        com.revolut.kompot.navigable.a controller3 = (com.revolut.kompot.navigable.a) gVar2.f286861p.get();
                        g9k.c.Companion.getClass();
                        Intrinsics.checkNotNullParameter(controller3, "controller");
                        return rp0.x0.a(rp0.g1.Companion, controller3.C2().D2());
                    case 13:
                        xmg.a aVar21 = cVar4.o;
                        lpf.a aVar22 = cVar4.f286803j;
                        return new j9k.z(aVar21.e(), aVar22.a(), aVar22.f());
                    case 14:
                        t1j.b bVarE4 = cVar4.f286803j.e();
                        rga.c cVarB5 = cVar4.f286800c.b();
                        vc.s.j(cVarB5);
                        return new j9k.c0(bVarE4, cVarB5);
                    case 15:
                        fk3.a aVarA6 = cVar4.F.a();
                        vc.s.j(aVarA6);
                        v8k.c cVar9 = gVar2.f286853b;
                        jk3.c cVar10 = cVar9.F;
                        fk3.a aVarA7 = cVar10.a();
                        vc.s.j(aVarA7);
                        j9k.a0 a0Var = new j9k.a0(aVarA7);
                        fk3.a aVarA8 = cVar10.a();
                        vc.s.j(aVarA8);
                        k61.a aVarE2 = cVar9.f286806n.e();
                        vc.s.j(aVarE2);
                        r10.a aVar23 = new r10.a(a0Var, new j9k.c(aVarA8, aVarE2));
                        wsg.n nVarB3 = cVar4.f286807p.b();
                        n8b.a aVarA9 = cVar4.G.a();
                        vc.s.j(aVarA9);
                        fk3.a aVarA10 = gVar2.f286853b.F.a();
                        vc.s.j(aVarA10);
                        f61.a aVar24 = new f61.a(aVarA10);
                        l61.a aVarB4 = cVar4.o.b();
                        vc.s.j(aVarB4);
                        j0Var = new j9k.p(aVarA6, aVar23, nVarB3, aVarA9, aVar24, aVarB4);
                        break;
                    case 16:
                        e4m.e eVar2 = gVar2.f286865t;
                        v8k.c cVar11 = gVar2.f286853b;
                        j9k.d dVar5 = (j9k.d) eVar2.get();
                        fk3.a aVarA11 = cVar4.F.a();
                        vc.s.j(aVarA11);
                        k61.a aVarE3 = cVar4.f286806n.e();
                        vc.s.j(aVarE3);
                        u5k.c cVar12 = (u5k.c) cVar4.X.get();
                        wsg.n nVarB4 = cVar4.f286807p.b();
                        r9k.a aVar25 = new r9k.a();
                        t1j.b bVarE5 = cVar4.f286803j.e();
                        l1l.a aVar26 = new l1l.a();
                        l1l.d dVar6 = new l1l.d();
                        l1l.f fVar2 = new l1l.f();
                        l1l.j jVar2 = new l1l.j();
                        l1l.m mVar = new l1l.m();
                        gte.a aVarB5 = cVar11.f286809r.b();
                        vc.s.j(aVarB5);
                        l1l.s sVar = new l1l.s(aVarB5);
                        l1l.q qVar = new l1l.q();
                        l1l.k kVar2 = new l1l.k();
                        urf.f fVar3 = new urf.f();
                        l80.e eVarH6 = cVar11.f286799b.h();
                        vc.s.j(eVarH6);
                        e5k.b bVar8 = new e5k.b(eVarH6, 2);
                        t9k.b bVar9 = new t9k.b();
                        t9k.e eVar3 = new t9k.e();
                        wt9.e eVarC = ((ut9.a) cVar4.L).c();
                        vc.s.j(eVarC);
                        gte.a aVarB6 = cVar11.f286809r.b();
                        vc.s.j(aVarB6);
                        l1l.h hVar2 = new l1l.h(aVarB6, 0);
                        gte.a aVarB7 = cVar11.f286809r.b();
                        vc.s.j(aVarB7);
                        return new r9k.k(dVar5, aVarA11, aVarE3, cVar12, nVarB4, aVar25, bVarE5, aVar26, dVar6, fVar2, jVar2, mVar, sVar, qVar, kVar2, fVar3, bVar8, bVar9, eVar3, eVarC, hVar2, new l1l.h(aVarB7, 1));
                    default:
                        throw new AssertionError(i43);
                }
                return j0Var;
            case 10:
                va.b bVar10 = (va.b) this.d;
                va.a aVar27 = (va.a) this.f282738b;
                int i59 = this.f282739c;
                switch (i59) {
                    case 0:
                        return f0k.d.p((e60.a) bVar10.f287104l.get());
                    case 1:
                        com.revolut.kompot.navigable.a aVar28 = (com.revolut.kompot.navigable.a) bVar10.d.get();
                        g60.a aVarA12 = f60.v.a((com.revolut.kompot.navigable.a) bVar10.d.get());
                        Activity activityA = f60.t.a((com.revolut.kompot.navigable.a) bVar10.d.get());
                        t80.g gVar3 = (t80.g) bVar10.e.get();
                        com.revolut.kompot.navigable.a aVar29 = (com.revolut.kompot.navigable.a) bVar10.d.get();
                        f60.y.a(aVar29);
                        d4m.a aVarA13 = e4m.b.a(bVar10.f);
                        nli.a aVar30 = new nli.a((t80.c) bVar10.f287101g.get(), f60.t.a((com.revolut.kompot.navigable.a) bVar10.d.get()));
                        t80.g gVar4 = (t80.g) bVar10.e.get();
                        zk0.b bVarL = bVar10.f287099b.f287086j.l();
                        vc.s.j(bVarL);
                        return v1.c.q(aVar28, new t80.v(aVarA12, activityA, gVar3, aVar29, aVarA13, aVar30, new oli.c(gVar4, bVarL, new nli.a((t80.c) bVar10.f287101g.get(), f60.t.a((com.revolut.kompot.navigable.a) bVar10.d.get())), f60.v.a((com.revolut.kompot.navigable.a) bVar10.d.get()), bVar10.c()), new oli.g(f60.u.a(f60.t.a((com.revolut.kompot.navigable.a) bVar10.d.get())), v1.c.e((com.revolut.kompot.navigable.a) bVar10.d.get()), new ami.n(e4m.b.a(bVar10.f287102h), 1), e4m.b.a(bVar10.f), (t80.g) bVar10.e.get(), new nli.a((t80.c) bVar10.f287101g.get(), f60.t.a((com.revolut.kompot.navigable.a) bVar10.d.get())), new i90.b(), bVar10.b(), bVar10.c()), bVar10.c()), f60.x.a(), (rp0.m) bVar10.i.get(), (e60.t) bVar10.k.get());
                    case 2:
                        f80.a aVarX = aVar27.f287086j.x();
                        vc.s.j(aVarX);
                        return new t80.x(aVarX, new i90.b());
                    case 3:
                        com.revolut.kompot.navigable.a aVar31 = (com.revolut.kompot.navigable.a) bVar10.d.get();
                        f60.y.a(aVar31);
                        return pli.c.a(new ks0.n(aVar31));
                    case 4:
                        eb.b.Companion.getClass();
                        return new t80.c(new e.a("background_photo"), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
                    case 5:
                        return t96.a.a();
                    case 6:
                        return f60.z.a();
                    case 7:
                        aii.o oVar2 = (aii.o) bVar10.f287103j.get();
                        y80.a aVarR = aVar27.f287086j.r();
                        vc.s.j(aVarR);
                        return new e60.y(oVar2, aVarR, bVar10.b(), Optional.empty());
                    case 8:
                        e60.t tVar2 = (e60.t) bVar10.k.get();
                        f60.w.a(tVar2);
                        return tVar2;
                    case 9:
                        cli.n nVar9 = (cli.n) bVar10.o.get();
                        bb.b bVar11 = (bb.b) aVar27.f287097y.get();
                        ang.f fVarE3 = aVar27.i.e();
                        UserDetailsControllerContract$InputData userDetailsControllerContract$InputData = bVar10.f287098a;
                        e60.a aVar32 = (e60.a) bVar10.f287104l.get();
                        cpa.a aVar33 = (cpa.a) aVar27.k.f128128b.get();
                        vc.s.j(aVar33);
                        jvh.a aVarA14 = aVar27.f287081a.a();
                        vc.s.j(aVarA14);
                        tla.d dVarB = aVar27.f287087l.b();
                        vc.s.j(dVarB);
                        yn3.d dVarA2 = aVar27.f287088m.a();
                        yme.a aVarA15 = aVar27.f287089n.a();
                        vc.s.j(aVarA15);
                        xoj.a aVarA16 = aVar27.o.a();
                        vc.s.j(aVarA16);
                        bma.a aVar34 = (bma.a) ((zla.a) aVar27.f287090p).f323206g.get();
                        vc.s.j(aVar34);
                        db.u uVar = (db.u) bVar10.f287107p.get();
                        gte.a aVarB8 = aVar27.f287082b.b();
                        vc.s.j(aVarB8);
                        return new db.i0(nVar9, bVar11, fVarE3, userDetailsControllerContract$InputData, aVar32, aVar33, aVarA14, dVarB, dVarA2, aVarA15, aVarA16, aVar34, uVar, aVarB8);
                    case 10:
                        return new db.y();
                    case 11:
                        return new db.v();
                    default:
                        throw new AssertionError(i59);
                }
            case 11:
                va.c cVar13 = (va.c) this.d;
                va.a aVar35 = (va.a) this.f282738b;
                int i66 = this.f282739c;
                if (i66 == 0) {
                    til.m mVarA = aVar35.d.a();
                    vc.s.j(mVarA);
                    return new fb.f(mVarA, (bb.b) aVar35.f287097y.get(), ((ldb.a) aVar35.f287085h).a(), new by5.a(12), (rp0.g1) cVar13.e.get(), aVar35.i.e(), cVar13.f287109a);
                }
                if (i66 != 1) {
                    throw new AssertionError(i66);
                }
                com.revolut.kompot.navigable.a controller4 = (com.revolut.kompot.navigable.a) cVar13.d.get();
                gb.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller4, "controller");
                return rp0.x0.a(rp0.g1.Companion, controller4.D2());
            case 12:
                vdb.c cVar14 = (vdb.c) this.d;
                vdb.j jVar3 = (vdb.j) this.f282738b;
                int i74 = this.f282739c;
                if (i74 == 0) {
                    CustomerDetailsScreenContract$InputData customerDetailsScreenContract$InputData = cVar14.f287839a;
                    z80.b bVarS2 = cVar14.f287840b.e.s();
                    vc.s.j(bVarS2);
                    return new com.revolut.feature.retail.restaurants.impl.ui.customerdetails.a(customerDetailsScreenContract$InputData, new deb.b(bVarS2), (zzl.b) cVar14.f287841c.get(), cVar14.d, new deb.m());
                }
                if (i74 == 1) {
                    eeb.b.Companion.getClass();
                    return new zzl.c();
                }
                if (i74 != 2) {
                    throw new AssertionError(i74);
                }
                n8b.b bVarB = jVar3.f287857g.b();
                vc.s.j(bVarB);
                fk3.a aVarA17 = jVar3.f287858h.a();
                vc.s.j(aVarA17);
                z80.b bVarS3 = jVar3.e.s();
                vc.s.j(bVarS3);
                return new feb.b(bVarB, aVarA17, bVarS3);
            case 13:
                return a();
            case 14:
                return b();
            case 15:
                vfd.h hVar3 = (vfd.h) this.d;
                vfd.g gVar5 = (vfd.g) this.f282738b;
                int i92 = this.f282739c;
                if (i92 == 0) {
                    ihd.p pVar = (ihd.p) hVar3.f288604b.get();
                    l3d.h0 h0VarB = gVar5.f288602c.b();
                    vc.s.j(h0VarB);
                    return new ihd.v(pVar, h0VarB, hVar3.f288603a);
                }
                if (i92 != 1) {
                    throw new AssertionError(i92);
                }
                ifd.h hVarB2 = gVar5.f288601b.b();
                vc.s.j(hVarB2);
                return new ihd.b(hVarB2);
            case 16:
                return c();
            case 17:
                return d();
            case 18:
                return e();
            case 19:
                vjb.d dVar7 = (vjb.d) this.d;
                vjb.g gVar6 = (vjb.g) this.f282738b;
                int i96 = this.f282739c;
                if (i96 == 0) {
                    cli.n nVar10 = (cli.n) dVar7.f289686b.get();
                    ManageChallengeScreenContract$InputData manageChallengeScreenContract$InputData = dVar7.f289685a;
                    ugc.a aVarB9 = ((vjb.b) gVar6.f289693a).b();
                    rnb.w wVarB = gVar6.f289694b.b();
                    vc.s.j(wVarB);
                    return new com.revolut.feature.retail.savings.impl.challenge.presentation.manage_challenge.a(nVar10, manageChallengeScreenContract$InputData, aVarB9, wVarB, gVar6.f289695c.a());
                }
                if (i96 != 1) {
                    throw new AssertionError(i96);
                }
                ckb.b manageChallengeHeaderContentProvider = new ckb.b();
                ckb.a manageChallengeDetailsSectionMapper = new ckb.a();
                Intrinsics.checkNotNullParameter(manageChallengeHeaderContentProvider, "manageChallengeHeaderContentProvider");
                Intrinsics.checkNotNullParameter(manageChallengeDetailsSectionMapper, "manageChallengeDetailsSectionMapper");
                return new akb.u();
            case 20:
                return f();
            case 21:
                return g();
            case 22:
                return h();
            case 23:
                return i();
            case 24:
                return j();
            case 25:
                return k();
            case 26:
                return l();
            case 27:
                return m();
            case 28:
                return n();
            default:
                vn2.j jVar4 = (vn2.j) this.d;
                int i99 = this.f282739c;
                if (i99 == 0) {
                    return new mo2.f((cli.n) jVar4.f290689b.get(), jVar4.f290688a, ((s41.a) ((vn2.h) this.f282738b).f290680h).d());
                }
                if (i99 == 1) {
                    return new mo2.g();
                }
                throw new AssertionError(i99);
        }
    }
}

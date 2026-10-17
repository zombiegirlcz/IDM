package o41;

import ael.d0;
import afa.e0;
import android.app.Activity;
import android.content.Context;
import b9.w2;
import bq.i;
import cli.n;
import com.google.common.collect.ImmutableSet;
import com.revolut.controller_extensions.keyboardsuggestions.KeyboardSuggestionsControllerExtension;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.add_card_to_google_pay_shared.impl.card_security.screen.CardSecurityPromptScreenContract$InputData;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.GooglePayConfirmationControllerContract$InputData;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.GooglePayOtpLocationMismatchScreenContract$InputData;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.multiple.GooglePayMultipleOtpVerificationScreenContract$InputData;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.single.GooglePayOtpVerificationScreenContract$InputData;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.CardsCarouselFlowContract$InputData;
import com.revolut.feature.card_screen.impl.kompot.subscriptions_list.SubscriptionsListControllerContract$InputData;
import com.revolut.feature.credit.post_termination_plan.impl.ui.repay.PostTerminationPlanManualRepaymentControllerContract$InputData;
import com.revolut.feature.pockets.api.ui.add_new.AddNewPocketContract$InputData;
import com.revolut.feature.pockets.impl.details_v2.pocket_details.PocketDetailsScreenContract$InputData;
import com.revolut.feature.pockets.impl.ui.pockets_list.PocketsListContract$InputData;
import com.revolut.feature.structured_note.details.impl.ui.note_details.NoteDetailsFlowControllerContract$InputData;
import com.revolut.feature.structured_note.details.impl.ui.screens.overview.NoteDetailsOverviewControllerContract$InputData;
import com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.pages.terms.PerformanceTrackerTermsControllerContract$InputData;
import com.revolut.feature.subscriptions.impl.mark_recurring.MarkRecurringTransactionsContract$Configuration;
import com.revolut.feature.transaction.troubleshooter.impl.ui.flow.screen.detail.TroubleshooterDetailScreenContract$InputData;
import com.revolut.feature.transaction.troubleshooter.impl.ui.flow.screen.list.TroubleshooterListScreenContract$InputData;
import com.revolut.feature_retail_user_declarations.citizenship.collect_citizenship.CollectCitizenshipFlowContract$InputData;
import com.revolut.feature_retail_user_declarations.credit_consent.CreditConsentInputData;
import com.revolut.feature_retail_user_declarations.email.screen.EmailScreenContract$InputData;
import com.revolut.feature_retail_user_declarations.identity_declarations.IdentityDeclarationsFlowInputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.network.error.KycNotPassedErrorHandler;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import dqi.k;
import fmf.o0;
import g48.r0;
import hea.n0;
import i4h.p0;
import iri.g;
import iri.j;
import iri.l;
import iri.m;
import java.util.Optional;
import jki.p;
import kl.b0;
import kl.c0;
import kl.t1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import ljl.q0;
import ljl.q1;
import lp.l9;
import m8b.r;
import nae.q;
import nii.t0;
import no.d2;
import no.j2;
import oai.i0;
import oda.o;
import r10.v;
import rp0.g1;
import rp0.x0;
import te8.t;
import te8.z;
import v4e.f0;
import vc.s;
import wff.x;
import xpi.f;
import yai.u;
import ypi.h;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f221924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f221925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f221926c;
    public final Object d;

    public /* synthetic */ b(Object obj2, Object obj3, int i, int i2) {
        this.f221924a = i2;
        this.f221926c = obj2;
        this.d = obj3;
        this.f221925b = i;
    }

    private final Object a() {
        oae.b bVar = (oae.b) this.f221926c;
        oae.a aVar = (oae.a) this.d;
        int i = this.f221925b;
        switch (i) {
            case 0:
                aVar.getClass();
                return new xpi.c(f.d, i.b(aVar.f223596a));
            case 1:
                return new opi.b(i.f(aVar.f223596a));
            case 2:
                return new en.c(ImmutableSet.of((ln.d) aVar.d.i.get()), i.l(aVar.f223596a));
            case 3:
                return new g((j) bVar.f223614h.get(), (m) bVar.f223615j.get(), i.f(aVar.f223596a), i.l(aVar.f223596a));
            case 4:
                return new l((m) bVar.f223615j.get(), i.f(aVar.f223596a), (iri.d) aVar.i.get());
            case 5:
                return new iri.d(i.f(aVar.f223596a));
            case 6:
                return new k3l.d(i.b(aVar.f223596a));
            case 7:
                aVar.getClass();
                xoi.d dVar = aVar.f223596a;
                return new ypi.e(h.d, i.b(dVar), i.o(dVar), i.g(dVar));
            case 8:
                return new dqi.g(i.b(aVar.f223596a), aVar.f223597b);
            case 9:
                return new rpi.h(i.b(aVar.f223596a));
            case 10:
                return kpi.f.a();
            case 11:
                Context contextI = i.i(aVar.f223596a);
                BaseDelegatesActivity baseDelegatesActivityF = i.f(aVar.f223596a);
                t70.g gVarO = bVar.f223610a.o();
                s.j(gVarO);
                return new npi.c(contextI, baseDelegatesActivityF, gVarO);
            case 12:
                return new tpi.i((rpi.c) aVar.f223606q.get(), gsi.c.a(aVar.f223596a));
            case 13:
                return new rpi.b(i.b(aVar.f223596a));
            case 14:
                pae.a aVar2 = (pae.a) bVar.i.get();
                xpi.g gVar = (xpi.g) aVar.e.get();
                thf.i iVar = (thf.i) aVar.d.f223611b.O.get();
                s.j(iVar);
                qae.b bVar2 = new qae.b(iVar);
                f9b.f fVar = (f9b.f) aVar.f223608s.get();
                tpi.j jVar = (tpi.j) aVar.f223607r.get();
                pae.e eVar = (pae.e) bVar.k.get();
                opi.d dVar2 = (opi.d) aVar.f.get();
                ypi.i iVar2 = (ypi.i) aVar.f223602l.get();
                k kVar = (k) aVar.f223603m.get();
                rpi.c cVar = (rpi.c) aVar.f223606q.get();
                c90.c cVarH = gmf.b.h(aVar.f223596a);
                MarkRecurringTransactionsContract$Configuration markRecurringTransactionsContract$Configuration = aVar.f223598c;
                qae.a aVar3 = new qae.a();
                gte.a aVarB = bVar.e.b();
                s.j(aVarB);
                return new q(aVar2, gVar, bVar2, fVar, jVar, eVar, dVar2, iVar2, kVar, cVar, cVarH, markRecurringTransactionsContract$Configuration, aVar3, aVarB, (k3l.b) aVar.k.get());
            case 15:
                return i.t(aVar.f223596a);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        oai.d dVar = (oai.d) this.d;
        CollectCitizenshipFlowContract$InputData collectCitizenshipFlowContract$InputData = dVar.f223670a;
        i0 i0Var = (i0) this.f221926c;
        l70.e eVar = i0Var.f223703h;
        int i = this.f221925b;
        if (i == 0) {
            f80.a aVarX = eVar.x();
            s.j(aVarX);
            return new com.revolut.feature_retail_user_declarations.citizenship.collect_citizenship.b(collectCitizenshipFlowContract$InputData, aVarX, dVar.e);
        }
        if (i == 1) {
            tog.a userDeclarationsSharedProvider = (tog.a) i0Var.i.f217679l.get();
            s.j(userDeclarationsSharedProvider);
            kbl.a citizenshipPickerCountryInteractor = (kbl.a) dVar.d.get();
            hai.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(userDeclarationsSharedProvider, "userDeclarationsSharedProvider");
            Intrinsics.checkNotNullParameter(citizenshipPickerCountryInteractor, "citizenshipPickerCountryInteractor");
            Intrinsics.checkNotNullParameter(citizenshipPickerCountryInteractor, "citizenshipPickerCountryInteractor");
            return new sog.e(userDeclarationsSharedProvider.f273209a, citizenshipPickerCountryInteractor, userDeclarationsSharedProvider.f273210b);
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        fk3.a aVarA = i0Var.f223704j.a();
        s.j(aVarA);
        n8b.a aVarA2 = i0Var.k.a();
        s.j(aVarA2);
        z70.a aVarF = eVar.f();
        s.j(aVarF);
        return new gai.b(aVarA, aVarA2, aVarF, collectCitizenshipFlowContract$InputData);
    }

    private final Object c() {
        i0 i0Var = (i0) this.f221926c;
        oai.e eVar = (oai.e) this.d;
        int i = this.f221925b;
        if (i == 0) {
            ivh.c cVar = (ivh.c) eVar.f223676c.get();
            gvh.d.a(cVar);
            return cVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new AssertionError(i);
            }
            jai.b bVar = eVar.f223674a;
            jvh.a aVarA = i0Var.f.a();
            s.j(aVarA);
            return new com.revolut.feature_retail_user_declarations.contact_selection.b(bVar, aVarA, (ivh.c) eVar.f223676c.get());
        }
        i0 i0Var2 = eVar.f223675b;
        v60.e eVarA = i0Var2.f223707n.a();
        s.j(eVarA);
        sf0.h hVarB = i0Var2.o.b();
        s.j(hVarB);
        return gvh.c.a(new kvh.h(hVarB, eVarA), i0Var.f223708p.a());
    }

    private final Object d() {
        i0 i0Var = (i0) this.f221926c;
        oai.g gVar = (oai.g) this.d;
        int i = this.f221925b;
        if (i == 0) {
            ivh.c cVar = (ivh.c) gVar.f223687c.get();
            gvh.d.a(cVar);
            return cVar;
        }
        if (i == 1) {
            i0 i0Var2 = gVar.f223686b;
            v60.e eVarA = i0Var2.f223707n.a();
            s.j(eVarA);
            sf0.h hVarB = i0Var2.o.b();
            s.j(hVarB);
            return gvh.c.a(new kvh.h(hVarB, eVarA), i0Var.f223708p.a());
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        CreditConsentInputData creditConsentInputData = gVar.f223685a;
        jvh.a aVarA = i0Var.f.a();
        s.j(aVarA);
        ivh.c cVar2 = (ivh.c) gVar.f223687c.get();
        mre.c cVarB = i0Var.f223705l.b();
        s.j(cVarB);
        return new com.revolut.feature_retail_user_declarations.credit_consent.flow.a(creditConsentInputData, aVarA, cVar2, cVarB, new lai.f());
    }

    private final Object e() {
        nng.e eVar = (nng.e) this.d;
        l70.e eVar2 = ((i0) this.f221926c).f223703h;
        int i = this.f221925b;
        if (i == 0) {
            return new sng.i(eVar.f217642b, (n) eVar.d.get());
        }
        if (i == 1) {
            l80.e eVarH = eVar2.h();
            s.j(eVarH);
            return new sng.j(eVarH, (ung.b) eVar.f217643c.get());
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        l80.e eVarH2 = eVar2.h();
        s.j(eVarH2);
        return new ung.c(eVarH2);
    }

    private final Object f() {
        i0 i0Var = (i0) this.f221926c;
        oai.j jVar = (oai.j) this.d;
        int i = this.f221925b;
        if (i == 0) {
            KeyboardSuggestionsControllerExtension keyboardSuggestionsControllerExtension = (KeyboardSuggestionsControllerExtension) jVar.f223718c.get();
            pl1.d.n(keyboardSuggestionsControllerExtension);
            return keyboardSuggestionsControllerExtension;
        }
        if (i == 1) {
            return pl1.d.u((com.revolut.kompot.navigable.a) jVar.f223717b.get());
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    throw new AssertionError(i);
                }
                zai.b.Companion.getClass();
                return new zzl.c();
            }
            zzl.b regexMatcher = (zzl.b) jVar.e.get();
            zai.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
            return new qai.a(regexMatcher);
        }
        u uVar = new u(jVar.f223716a, (qai.a) jVar.f.get());
        EmailScreenContract$InputData emailScreenContract$InputData = jVar.f223716a;
        yva.a aVarA = i0Var.f223709q.a();
        s.j(aVarA);
        mre.c cVarB = i0Var.f223705l.b();
        s.j(cVarB);
        zzl.b bVar = (zzl.b) jVar.e.get();
        ang.f fVarE = i0Var.e.e();
        gte.a aVarB = i0Var.d.b();
        s.j(aVarB);
        return new com.revolut.feature_retail_user_declarations.email.screen.a(uVar, emailScreenContract$InputData, aVarA, cVarB, bVar, fVarE, aVarB, (qai.a) jVar.f.get());
    }

    private final Object g() {
        i0 i0Var = (i0) this.f221926c;
        oai.q qVar = (oai.q) this.d;
        i0 i0Var2 = qVar.f223759b;
        IdentityDeclarationsFlowInputData identityDeclarationsFlowInputData = qVar.f223758a;
        int i = this.f221925b;
        if (i == 0) {
            ivh.c cVar = (ivh.c) qVar.d.get();
            gvh.d.a(cVar);
            return cVar;
        }
        if (i == 1) {
            v60.e eVarA = i0Var2.f223707n.a();
            s.j(eVarA);
            sf0.h hVarB = i0Var2.o.b();
            s.j(hVarB);
            return gvh.c.a(new kvh.h(hVarB, eVarA), i0Var.f223708p.a());
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        jvh.a aVarA = i0Var.f.a();
        s.j(aVarA);
        kvh.a aVar = (kvh.a) i0Var2.f.f147170l.get();
        s.j(aVar);
        return new com.revolut.feature_retail_user_declarations.identity_declarations.a(identityDeclarationsFlowInputData, aVarA, new com.revolut.feature_retail_user_declarations.identity_declarations.b(aVar, identityDeclarationsFlowInputData), (ivh.c) qVar.d.get());
    }

    private final Object h() {
        oda.e eVar = (oda.e) this.d;
        o oVar = (o) this.f221926c;
        pqi.a aVar = oVar.i;
        int i = this.f221925b;
        if (i == 0) {
            return new pea.l(oVar.f224400h.d(), eVar.d(), aVar.e(), aVar.g(), eVar.f224352a, (p) eVar.d.get());
        }
        if (i != 1) {
            if (i != 2) {
                throw new AssertionError(i);
            }
            pea.d provider = eVar.d();
            Intrinsics.checkNotNullParameter(provider, "provider");
            return new pea.n();
        }
        Context context = oVar.f224401j;
        qea.c.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        yy0.f fVarQ = jh.d.f(context).Q();
        s.k(fVarQ);
        return fVarQ;
    }

    private final Object i() {
        oda.f fVar = (oda.f) this.d;
        o oVar = (o) this.f221926c;
        l89.b bVar = oVar.f224406q;
        oda.d dVar = oVar.f224405p;
        se8.a aVar = oVar.f224398c;
        int i = this.f221925b;
        if (i == 0) {
            w2 jointMcyErrorGuardianControllerExtensionProvider = oVar.f224404n.b();
            zea.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(jointMcyErrorGuardianControllerExtensionProvider, "jointMcyErrorGuardianControllerExtensionProvider");
            return jointMcyErrorGuardianControllerExtensionProvider.S();
        }
        if (i != 1) {
            if (i != 2) {
                throw new AssertionError(i);
            }
            AddNewPocketContract$InputData addNewPocketContract$InputData = fVar.f224355a;
            wsg.n nVarB = oVar.f224396a.b();
            fk3.a aVarA = oVar.f224397b.a();
            s.j(aVarA);
            return new yea.c(addNewPocketContract$InputData, nVarB, aVarA, aVar.f(), dVar.a(), oVar.i.g());
        }
        AddNewPocketContract$InputData addNewPocketContract$InputData2 = fVar.f224355a;
        rea.g gVarE = oVar.e();
        ang.f fVarE = oVar.f224411x.e();
        rea.m mVarF = dVar.f();
        s99.i iVarB = ((s99.a) bVar).b();
        t99.k kVarA = ((s99.a) bVar).a();
        s.j(kVarA);
        b bVar2 = fVar.d;
        o oVar2 = fVar.f224356b;
        n8b.a aVarA2 = oVar2.v.a();
        s.j(aVarA2);
        l93.f fVarJ = oVar2.f224410w.j();
        s.j(fVarJ);
        rea.p pVar = new rea.p(aVarA2, fVarJ);
        z zVarE = aVar.e();
        s.j(zVarE);
        return new com.revolut.feature.pockets.impl.ui.add_new.c(addNewPocketContract$InputData2, gVarE, fVarE, mVarF, iVarB, kVarA, bVar2, pVar, zVarE, new t(aVar.f()));
    }

    private final Object j() {
        o oVar = (o) this.f221926c;
        oda.k kVar = (oda.k) this.d;
        int i = this.f221925b;
        switch (i) {
            case 0:
                Object extension = (j60.a) kVar.f224371g.get();
                iea.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.d dVar = (yji.d) extension;
                s.k(dVar);
                return dVar;
            case 1:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) kVar.e.get();
                rp0.m dialogDisplayer = (rp0.m) kVar.f.get();
                he2.b dialogHostFinder = ehe.n.r();
                iea.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                Intrinsics.checkNotNullParameter(dialogDisplayer, "dialogDisplayer");
                Intrinsics.checkNotNullParameter(dialogHostFinder, "dialogHostFinder");
                return new j60.c(controller, dialogDisplayer, dialogHostFinder);
            case 2:
                iea.c.Companion.getClass();
                return new rp0.m();
            case 3:
                fd6.a aVar = (fd6.a) kVar.f224373j.get();
                va.g.t(aVar);
                return aVar;
            case 4:
                return va.g.s(((zc6.a) oVar.C).d(), (xc6.a) kVar.i.get());
            case 5:
                return r6.b.k((zc6.a) oVar.C, "factory");
            case 6:
                qh3.a extension2 = (qh3.a) kVar.f224375m.get();
                iea.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                s.k(extension2);
                return extension2;
            case 7:
                wh3.a provider = oVar.D.a();
                s.j(provider);
                zfk.c planSubscriberControllerModelExtension = (zfk.c) kVar.f224374l.get();
                iea.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(provider, "provider");
                Intrinsics.checkNotNullParameter(planSubscriberControllerModelExtension, "planSubscriberControllerModelExtension");
                Intrinsics.checkNotNullParameter(planSubscriberControllerModelExtension, "planSubscriberControllerModelExtension");
                return new wh3.i(provider.f297363c, provider.d, planSubscriberControllerModelExtension);
            case 8:
                agk.c cVar = kVar.f224368a;
                o oVar2 = kVar.d;
                mhk.a aVarC = oVar.E.c();
                s.j(aVarC);
                fhk.a factory = oVar2.E.b();
                s.j(factory);
                Intrinsics.checkNotNullParameter(factory, "factory");
                ehk.g gVarA = factory.a();
                ohk.a factory2 = oVar2.E.d();
                s.j(factory2);
                Intrinsics.checkNotNullParameter(factory2, "factory");
                ohk.g gVarA2 = factory2.a();
                dhk.a factory3 = oVar2.E.a();
                s.j(factory3);
                Intrinsics.checkNotNullParameter(factory3, "factory");
                return agk.b.w(cVar, aVarC, gVarA, gVarA2, new dhk.e(factory3.f114822a));
            case 9:
                Object extension3 = (kda.b) kVar.o.get();
                iea.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension3, "extension");
                yji.n nVar = (yji.n) extension3;
                s.k(nVar);
                return nVar;
            case 10:
                ct6.n freelancerExtensionFactory = (ct6.n) oVar.k.f282698p1.get();
                s.j(freelancerExtensionFactory);
                PocketDetailsScreenContract$InputData inputData = kVar.f224369b;
                j60.a bottomDialogExtension = (j60.a) kVar.f224371g.get();
                iea.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(freelancerExtensionFactory, "freelancerExtensionFactory");
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
                io3.d dVar2 = inputData.f80845a;
                return (dVar2.e == io3.l.MERCHANT && dVar2.f163149h == io3.i.INTERNAL) ? freelancerExtensionFactory.a(bottomDialogExtension) : new kea.d();
            case 11:
                Object extension4 = (kea.b) kVar.f224378q.get();
                iea.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(extension4, "extension");
                yji.n nVar2 = (yji.n) extension4;
                s.k(nVar2);
                return nVar2;
            case 12:
                PocketDetailsScreenContract$InputData pocketDetailsScreenContract$InputData = kVar.f224369b;
                o oVar3 = kVar.d;
                vte.b bVar = (vte.b) oVar3.F.l0.get();
                s.j(bVar);
                xye.d dVar3 = new xye.d();
                l61.a aVarB = oVar3.f224411x.b();
                s.j(aVarB);
                kea.c impl = new kea.c(pocketDetailsScreenContract$InputData, bVar, dVar3, aVarB);
                iea.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(impl, "impl");
                return impl;
            case 13:
                agk.c cVar2 = kVar.f224368a;
                o oVar4 = kVar.d;
                zfk.c cVar3 = (zfk.c) kVar.f224374l.get();
                fhk.a factory4 = oVar4.E.b();
                s.j(factory4);
                Intrinsics.checkNotNullParameter(factory4, "factory");
                ehk.g gVarA3 = factory4.a();
                ohk.a factory5 = oVar4.E.d();
                s.j(factory5);
                Intrinsics.checkNotNullParameter(factory5, "factory");
                ohk.g gVarA4 = factory5.a();
                dhk.a factory6 = oVar4.E.a();
                s.j(factory6);
                Intrinsics.checkNotNullParameter(factory6, "factory");
                return agk.b.D(cVar2, cVar3, gVarA3, gVarA4, new dhk.e(factory6.f114822a));
            case 14:
                return va.g.u((xc6.a) kVar.i.get());
            case 15:
                o0 view = kVar.f224370c;
                rkd.m factory7 = oVar.o.a();
                s.j(factory7);
                iea.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(factory7, "factory");
                return factory7.a(view);
            case 16:
                PocketDetailsScreenContract$InputData pocketDetailsScreenContract$InputData2 = kVar.f224369b;
                o oVar5 = kVar.d;
                gea.a aVar2 = new gea.a();
                oda.d dVar4 = oVar.f224405p;
                xmg.a aVar3 = oVar.f224411x;
                l70.e eVar = oVar.f224400h;
                rea.m mVarF = dVar4.f();
                uea.f fVar = (uea.f) oVar.T.get();
                zxd.c cVarA = ((eyd.b) oVar.G).a();
                s.j(cVarA);
                vyd.a aVar4 = new vyd.a();
                j60.a aVar5 = (j60.a) kVar.f224371g.get();
                wsg.n nVarB = oVar5.f224396a.b();
                n8b.a aVarA = oVar5.v.a();
                s.j(aVarA);
                r0 r0VarC = oVar5.f224404n.c();
                l61.a aVarB2 = oVar5.f224411x.b();
                s.j(aVarB2);
                gr6.a aVarA2 = oVar5.H.a();
                s.j(aVarA2);
                com.revolut.feature.pockets.impl.details_v2.pocket_actions.b bVar2 = new com.revolut.feature.pockets.impl.details_v2.pocket_actions.b(nVarB, aVarA, r0VarC, aVarB2, aVarA2);
                ij0.c cVar4 = (ij0.c) ((nj0.d) oVar.f224408s).f216306t.get();
                s.j(cVar4);
                n8b.a aVarA3 = oVar.v.a();
                s.j(aVarA3);
                c70.a aVarZ = eVar.z();
                s.j(aVarZ);
                r70.c cVarA2 = eVar.A();
                s.j(cVarA2);
                vda.c cVar5 = new vda.c();
                com.revolut.feature.pockets.impl.details_v2.pocket_actions.a aVar6 = new com.revolut.feature.pockets.impl.details_v2.pocket_actions.a((jr6.s) kVar.v.get(), oVar5.e.a());
                vda.d dVar5 = new vda.d();
                vda.a aVar7 = new vda.a();
                f01.a aVar8 = (f01.a) kVar.f224382w.get();
                wda.b bVarA = oVar5.a();
                zjh.j jVarC = ((zc6.a) oVar5.C).c();
                hea.a aVar9 = new hea.a();
                PocketDetailsScreenContract$InputData pocketDetailsScreenContract$InputData3 = kVar.f224369b;
                gte.a aVarB3 = oVar5.I.b();
                s.j(aVarB3);
                n0 n0Var = new n0(cVar5, aVar6, dVar5, aVar7, aVar8, bVarA, jVarC, aVar9, pocketDetailsScreenContract$InputData3, aVarB3);
                mkd.d dVar6 = (mkd.d) kVar.u.get();
                q06.l lVarA = oVar.J.a();
                s.j(lVarA);
                qh3.a aVar10 = (qh3.a) kVar.f224375m.get();
                l61.a aVarB4 = aVar3.b();
                s.j(aVarB4);
                q06.d dVarA = oVar.f224402l.a();
                s.j(dVarA);
                sda.e eVar2 = new sda.e(dVarA);
                kda.b bVar3 = (kda.b) kVar.o.get();
                s70.a aVarM = eVar.m();
                s.j(aVarM);
                ang.f fVarE = aVar3.e();
                wda.b bVarA2 = oVar.a();
                til.m mVarA = oVar.K.a();
                s.j(mVarA);
                i4b.f fVarB = ((zc6.a) oVar.C).b();
                y91.b bVarA3 = oVar.e.a();
                ekg.g gVarB = oVar.L.b();
                mre.c cVarB = oVar.M.b();
                s.j(cVarB);
                gte.a aVarB5 = oVar5.I.b();
                s.j(aVarB5);
                wsg.b bVarA4 = oVar5.f224396a.a();
                xqe.b bVarA5 = oVar5.N.a();
                s.j(bVarA5);
                v vVar = new v(aVarB5, bVarA4, bVarA5);
                on2.b bVarA6 = oVar.f224412y.a();
                s.j(bVarA6);
                return new com.revolut.feature.pockets.impl.details_v2.pocket_details.a(pocketDetailsScreenContract$InputData2, aVar2, mVarF, fVar, cVarA, aVar4, aVar5, bVar2, cVar4, aVarA3, aVarZ, cVarA2, n0Var, dVar6, lVarA, aVar10, aVarB4, eVar2, bVar3, aVarM, fVarE, bVarA2, mVarA, fVarB, bVarA3, gVarB, cVarB, vVar, bVarA6, (kea.b) kVar.f224378q.get(), oVar.f224405p.e());
            case 17:
                jr6.s actionSource = (jr6.s) oVar.k.q1.get();
                s.j(actionSource);
                iea.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(actionSource, "actionSource");
                return actionSource;
            case 18:
                com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) kVar.e.get();
                iea.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller2, "controller");
                return new f01.c(controller2.m2());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object k() {
        o oVar = (o) this.f221926c;
        l89.b bVar = oVar.f224406q;
        oda.m mVar = (oda.m) this.d;
        o oVar2 = mVar.f224389c;
        int i = this.f221925b;
        switch (i) {
            case 0:
                return kxa.j.k((j60.a) mVar.f.get());
            case 1:
                return ehe.n.s((com.revolut.kompot.navigable.a) mVar.d.get(), (rp0.m) mVar.e.get());
            case 2:
                return new rp0.m();
            case 3:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) mVar.d.get();
                bfa.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return new afa.f(controller);
            case 4:
                w2 jointMcyErrorGuardianControllerExtensionProvider = oVar.f224404n.b();
                bfa.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(jointMcyErrorGuardianControllerExtensionProvider, "jointMcyErrorGuardianControllerExtensionProvider");
                return jointMcyErrorGuardianControllerExtensionProvider.S();
            case 5:
                o0 view = mVar.f224387a;
                rkd.m factory = oVar.o.a();
                s.j(factory);
                bfa.c.Companion.getClass();
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(factory, "factory");
                return factory.a(view);
            case 6:
                PocketsListContract$InputData pocketsListContract$InputData = mVar.f224388b;
                wsg.n nVarB = oVar.f224396a.b();
                fk3.a aVarA = oVar.f224397b.a();
                s.j(aVarA);
                rea.m mVarF = oVar.f224405p.f();
                j60.a aVar = (j60.a) mVar.f.get();
                afa.j jVar = new afa.j();
                mkd.d dVar = (mkd.d) mVar.f224392j.get();
                t99.k kVarA = ((s99.a) bVar).a();
                s.j(kVarA);
                s99.i iVarB = ((s99.a) bVar).b();
                uea.f fVar = (uea.f) oVar.T.get();
                n8b.a aVarA2 = oVar2.v.a();
                s.j(aVarA2);
                l93.f fVarJ = oVar2.f224410w.j();
                s.j(fVarJ);
                rea.p pVar = new rea.p(aVarA2, fVarJ);
                ang.f fVarE = oVar.f224411x.e();
                afa.f fVar2 = (afa.f) mVar.f224391h.get();
                on2.b bVarA = oVar.f224412y.a();
                s.j(bVarA);
                rfb.b bVarB = ((wfb.i) oVar.z).b();
                s.j(bVarB);
                return new com.revolut.feature.pockets.impl.ui.pockets_list.c(pocketsListContract$InputData, nVarB, aVarA, mVarF, aVar, jVar, dVar, kVarA, iVarB, fVar, pVar, fVarE, fVar2, bVarA, bVarB, (n) mVar.k.get());
            case 7:
                f01.c cVarG = oVar.i.g();
                PocketsListContract$InputData pocketsListContract$InputData2 = mVar.f224388b;
                psi.a aVarA3 = oVar.A.a();
                s.j(aVarA3);
                return new e0(cVarG, pocketsListContract$InputData2, aVarA3, new afa.b(oVar2.i.g()));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object l() {
        oe5.d dVar = (oe5.d) this.d;
        oe5.c cVar = (oe5.c) this.f221926c;
        int i = this.f221925b;
        if (i == 0) {
            yok.f factory = cVar.f224539c.c();
            re5.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(factory, "factory");
            return new yok.e();
        }
        if (i != 1) {
            if (i != 2) {
                throw new AssertionError(i);
            }
            gte.a aVarB = cVar.d.b();
            s.j(aVarB);
            return new qe5.n(aVarB);
        }
        p pVar = (p) dVar.f224544b.get();
        mre.c cVarB = cVar.e.b();
        s.j(cVarB);
        sla.h hVarB = cVar.f.b();
        am2.a aVarI = cVar.f224540g.i();
        tla.f fVar = (tla.f) dVar.f224543a.get();
        f80.a aVarX = cVar.f224537a.x();
        s.j(aVarX);
        return new qe5.l(pVar, cVarB, hVarB, aVarI, fVar, aVarX);
    }

    private final Object m() {
        off.a aVar = (off.a) this.f221926c;
        r7d.l lVar = aVar.f;
        off.b bVar = (off.b) this.d;
        int i = this.f221925b;
        switch (i) {
            case 0:
                return kxa.j.l((j60.a) bVar.d.get());
            case 1:
                return h30.l.p((com.revolut.kompot.navigable.a) bVar.f224817b.get(), (rp0.m) bVar.f224818c.get());
            case 2:
                return new rp0.m();
            case 3:
                Object extension = (ep6.n) bVar.f224819g.get();
                Intrinsics.checkNotNullParameter(extension, "extension");
                yji.n nVar = (yji.n) extension;
                s.k(nVar);
                return nVar;
            case 4:
                return h7d.a.i(lVar.a(), (j60.a) bVar.d.get(), (g1) bVar.f.get());
            case 5:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) bVar.f224817b.get();
                xff.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return x0.a(g1.Companion, controller.D2());
            case 6:
                p pVar = (p) bVar.i.get();
                ie.a aVarA = aVar.f224809h.a();
                ep6.n nVar2 = (ep6.n) bVar.f224819g.get();
                TroubleshooterDetailScreenContract$InputData troubleshooterDetailScreenContract$InputData = bVar.f224816a;
                mde.e eVarE = lVar.e();
                bef.b bVar2 = (bef.b) aVar.d.f199665h.get();
                s.j(bVar2);
                f80.a aVarX = aVar.e.x();
                s.j(aVarX);
                return new x(pVar, aVarA, nVar2, troubleshooterDetailScreenContract$InputData, eVarE, bVar2, aVarX);
            case 7:
                return new wff.t(lVar.b(), lVar.f252129a.e());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object n() {
        off.a aVar = (off.a) this.f221926c;
        r7d.l lVar = aVar.f;
        off.d dVar = (off.d) this.d;
        int i = this.f221925b;
        if (i == 0) {
            return kxa.j.l((j60.a) dVar.d.get());
        }
        if (i == 1) {
            return h30.l.p((com.revolut.kompot.navigable.a) dVar.f224826b.get(), (rp0.m) dVar.f224827c.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i != 3) {
            if (i == 4) {
                return new yff.m();
            }
            throw new AssertionError(i);
        }
        p pVar = (p) dVar.f.get();
        TroubleshooterListScreenContract$InputData troubleshooterListScreenContract$InputData = dVar.f224825a;
        pff.a aVar2 = (pff.a) aVar.f224815q.get();
        bef.b bVar = (bef.b) aVar.d.f199665h.get();
        s.j(bVar);
        j60.a aVar3 = (j60.a) dVar.d.get();
        f80.a aVarX = aVar.e.x();
        s.j(aVarX);
        mde.e eVarE = lVar.e();
        lde.n nVarE = lVar.f252129a.e();
        uig.a aVar4 = (uig.a) aVar.f224808g.f289597b.get();
        s.j(aVar4);
        return new yff.u(pVar, troubleshooterListScreenContract$InputData, aVar2, bVar, aVar3, aVarX, eVarE, nVarE, aVar4, lVar.e());
    }

    private final Object o() {
        og1.c cVar = (og1.c) this.d;
        fw2.n nVar = ((og1.i) this.f221926c).f224979b;
        int i = this.f221925b;
        if (i == 0) {
            n nVar2 = (n) cVar.f224962c.get();
            CardSecurityPromptScreenContract$InputData cardSecurityPromptScreenContract$InputData = cVar.f224960a;
            k7i.i iVarB = nVar.b();
            ha3.f fVarD = nVar.f138567a.d();
            s.j(fVarD);
            return new qg1.k(nVar2, cardSecurityPromptScreenContract$InputData, iVarB, new b0(fVarD), (c90.c) cVar.d.get(), new mw2.g(), new lw2.b(), new mw2.f());
        }
        if (i == 1) {
            return new qg1.n(nVar.a());
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        ViewController controller = cVar.f224961b;
        rg1.a.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new c90.c(controller.m2());
    }

    private final Object p() {
        og1.d dVar = (og1.d) this.d;
        og1.i iVar = (og1.i) this.f221926c;
        fw2.n nVar = iVar.f224979b;
        int i = this.f221925b;
        if (i != 0) {
            if (i == 1) {
                return new ah1.s(nVar.a());
            }
            if (i != 2) {
                throw new AssertionError(i);
            }
            ViewController controller = dVar.f224964b;
            bh1.a.Companion.getClass();
            Intrinsics.checkNotNullParameter(controller, "controller");
            return new c90.c(controller.m2());
        }
        n nVar2 = (n) dVar.f224965c.get();
        GooglePayConfirmationControllerContract$InputData googlePayConfirmationControllerContract$InputData = dVar.f224963a;
        k7i.i iVarB = nVar.b();
        z6l.s sVarE = iVar.d.e();
        sg1.c cVar = (sg1.c) iVar.f224981g.get();
        ha3.f fVarD = nVar.f138567a.d();
        s.j(fVarD);
        return new com.revolut.feature.add_card_to_google_pay_shared.impl.verification.confirmation.b(nVar2, googlePayConfirmationControllerContract$InputData, iVarB, sVarE, cVar, new b0(fVarD), (c90.c) dVar.d.get());
    }

    private final Object q() {
        og1.f fVar = (og1.f) this.d;
        og1.i iVar = (og1.i) this.f221926c;
        l70.e eVar = iVar.f224980c;
        fw2.n nVar = iVar.f224979b;
        int i = this.f221925b;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            c0 c0Var = new c0(nVar.f138567a.b());
            m93.g gVarI = nVar.f138567a.i();
            s.j(gVarI);
            return new eh1.q(c0Var, new kpj.f(gVarI));
        }
        n nVar2 = (n) fVar.f224970b.get();
        GooglePayMultipleOtpVerificationScreenContract$InputData googlePayMultipleOtpVerificationScreenContract$InputData = fVar.f224969a;
        k7i.i iVarB = nVar.b();
        c70.a aVarZ = eVar.z();
        s.j(aVarZ);
        r70.c cVarA = eVar.A();
        s.j(cVarA);
        return new eh1.i(nVar2, googlePayMultipleOtpVerificationScreenContract$InputData, iVarB, aVarZ, cVarA);
    }

    private final Object r() {
        og1.g gVar = (og1.g) this.d;
        og1.i iVar = (og1.i) this.f221926c;
        int i = this.f221925b;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            lw2.b sharedCardNameMapper = new lw2.b();
            Intrinsics.checkNotNullParameter(sharedCardNameMapper, "sharedCardNameMapper");
            return new ch1.m();
        }
        n nVar = (n) gVar.f224973b.get();
        GooglePayOtpLocationMismatchScreenContract$InputData googlePayOtpLocationMismatchScreenContract$InputData = gVar.f224972a;
        k7i.i iVarB = iVar.f224979b.b();
        w39.b bVarA = iVar.e.a();
        s.j(bVarA);
        return new com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.b(nVar, googlePayOtpLocationMismatchScreenContract$InputData, iVarB, bVarA);
    }

    @Override // phm.a
    public final Object get() {
        Object oVar;
        Object dVar;
        Object lVar;
        Object mVar;
        Object juniorProvider;
        switch (this.f221924a) {
            case 0:
                c cVar = (c) this.d;
                a aVar = (a) this.f221926c;
                int i = this.f221925b;
                switch (i) {
                    case 0:
                        Activity activity = i.b(cVar.f221927a);
                        aoi.c performanceAnalyticsInteractor = aoi.f.a();
                        poi.b analyticsApi = aVar.f221907a;
                        d2 screenPerformanceTracker = (d2) analyticsApi.f238033r0.get();
                        s.j(screenPerformanceTracker);
                        tpi.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(activity, "activity");
                        Intrinsics.checkNotNullParameter(performanceAnalyticsInteractor, "performanceAnalyticsInteractor");
                        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
                        Intrinsics.checkNotNullParameter(screenPerformanceTracker, "screenPerformanceTracker");
                        oVar = new eoi.o(activity, performanceAnalyticsInteractor, analyticsApi, screenPerformanceTracker);
                        return oVar;
                    case 1:
                        return l9.b(i.b(cVar.f221927a), aVar.f221908b.b());
                    case 2:
                        Activity activityB = i.b(cVar.f221927a);
                        mli.e eVarB = ((j51.a) aVar.f221909c).b();
                        s.j(eVarB);
                        return l9.l(activityB, eVarB, (aqi.a) cVar.f221930g.get(), new c5l.b());
                    case 3:
                        dVar = new aqi.d(i.b(cVar.f221927a), new y80.b());
                        return dVar;
                    case 4:
                        e86.a aVar2 = aVar.d;
                        asi.b bVar = aVar.f221909c;
                        ao.h hVarA = aVar2.a();
                        sri.m mVarL = i.l(cVar.f221927a);
                        asi.d dVarC = ((j51.a) bVar).c();
                        s.j(dVarC);
                        mli.e eVarA = ((j51.a) bVar).a();
                        s.j(eVarA);
                        uil.a aVarA = aVar.e.a();
                        s.j(aVarA);
                        com.revolut.retail.feature.api.userauth.navigation.a aVarA2 = aVar.f.a();
                        s.j(aVarA2);
                        return l9.d(hVarA, mVarL, dVarC, eVarA, aVarA, aVarA2, (tpi.j) cVar.f221932j.get());
                    case 5:
                        dVar = new tpi.i((rpi.c) cVar.i.get(), gsi.c.a(cVar.f221927a));
                        return dVar;
                    case 6:
                        dVar = new rpi.b(i.b(cVar.f221927a));
                        return dVar;
                    case 7:
                        return xhi.f.o(i.b(cVar.f221927a), ((a0b.d) aVar.f221910g).b(), i.l(cVar.f221927a));
                    case 8:
                        Activity activityB2 = i.b(cVar.f221927a);
                        wli.x xVarD = ((s41.a) aVar.f221914m).d();
                        pwh.b bVar2 = (pwh.b) aVar.f221915n.f.get();
                        s.j(bVar2);
                        ifm.b bVarA = aVar.o.a();
                        s.j(bVarA);
                        oVar = new rwh.e(activityB2, xVarD, bVar2, bVarA);
                        return oVar;
                    case 9:
                        om0.b bVarC = aVar.f221916p.c();
                        s.j(bVarC);
                        return new lri.b(bVarC);
                    case 10:
                        nf0.a aVar3 = aVar.f221911h;
                        asi.b bVar3 = aVar.f221909c;
                        q1 q1Var = aVar.f221918r;
                        qf0.c cVarA = aVar3.a();
                        s.j(cVarA);
                        sri.m mVarD = aVar.o.d();
                        s.j(mVarD);
                        kz0.b bVarA2 = gsi.c.a(cVar.f221927a);
                        pak.h hVarA2 = aVar.f221917q.a();
                        fkl.h hVar = (fkl.h) ((q0) q1Var).G.get();
                        s.j(hVar);
                        sf0.h hVarB = aVar.f221911h.b();
                        s.j(hVarB);
                        yil.b bVar4 = ((q0) q1Var).f196063h.f248575j;
                        oad.a aVar4 = (oad.a) aVar.f221919s;
                        Optional optionalOf = Optional.of(new rad.a(e4m.b.a(aVar4.k), e4m.b.a(aVar4.f223583l)));
                        s.j(optionalOf);
                        mli.e eVarB2 = ((j51.a) bVar3).b();
                        s.j(eVarB2);
                        asi.d dVarC2 = ((j51.a) bVar3).c();
                        s.j(dVarC2);
                        zm0.c cVarJ = aVar.f221916p.j();
                        s.j(cVarJ);
                        return new com.revolut.feature.restricted_access.h(cVarA, mVarD, bVarA2, hVarA2, hVar, hVarB, bVar4, optionalOf, eVarB2, dVarC2, cVarJ);
                    case 11:
                        qf0.c cVarA2 = aVar.f221911h.a();
                        s.j(cVarA2);
                        sri.m mVarD2 = aVar.o.d();
                        s.j(mVarD2);
                        return new com.revolut.feature.restricted_access.j(cVarA2, mVarD2);
                    case 12:
                        qf0.c cVarA3 = aVar.f221911h.a();
                        s.j(cVarA3);
                        sri.m mVarD3 = aVar.o.d();
                        s.j(mVarD3);
                        return new com.revolut.feature.restricted_access.c(cVarA3, mVarD3, wza.b.a());
                    case 13:
                        BaseDelegatesActivity baseDelegatesActivityF = i.f(cVar.f221927a);
                        asi.b bVar5 = aVar.f221909c;
                        an0.c cVar2 = aVar.f221916p;
                        asi.d dVarC3 = ((j51.a) bVar5).c();
                        s.j(dVarC3);
                        sri.m mVarL2 = i.l(cVar.f221927a);
                        om0.b bVarC2 = cVar2.c();
                        s.j(bVarC2);
                        p1b.b bVar6 = (p1b.b) aVar.f221920t.f.get();
                        s.j(bVar6);
                        zm0.b bVarI = cVar2.i();
                        s.j(bVarI);
                        oVar = new xoi.l(baseDelegatesActivityF, dVarC3, mVarL2, bVarC2, bVar6, bVarI);
                        return oVar;
                    case 14:
                        yri.a aVarA3 = aVar.f221920t.a();
                        s.j(aVarA3);
                        return new xoi.c(aVarA3);
                    case 15:
                        Activity activityB3 = i.b(cVar.f221927a);
                        b80.c cVarP = aVar.u.p();
                        s.j(cVarP);
                        oVar = new mpi.d(activityB3, cVarP);
                        return oVar;
                    case 16:
                        BaseDelegatesActivity baseDelegatesActivityF2 = i.f(cVar.f221927a);
                        ppi.d dVar2 = (ppi.d) aVar.v.e.get();
                        s.j(dVar2);
                        oVar = new ppi.c(baseDelegatesActivityF2, dVar2);
                        return oVar;
                    case 17:
                        dVar = new rpi.h(i.b(cVar.f221927a));
                        return dVar;
                    case 18:
                        Activity activity2 = i.b(cVar.f221927a);
                        uwc.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(activity2, "activity");
                        dVar = new t0(activity2);
                        return dVar;
                    case 19:
                        CoroutineScope coroutineScopeA = aVar.f221921w.a();
                        s.j(coroutineScopeA);
                        a aVar5 = cVar.d;
                        zt2.c cVar3 = (zt2.c) aVar5.z.f316620m.get();
                        s.j(cVar3);
                        cu2.c cVar4 = (cu2.c) aVar5.z.f316623q.get();
                        s.j(cVar4);
                        oVar = new du2.b(coroutineScopeA, new v(cVar3, cVar4, (du2.j) cVar.f221942x.get()));
                        return oVar;
                    case 20:
                        Activity activity3 = i.b(cVar.f221927a);
                        sri.m mVarL3 = i.l(cVar.f221927a);
                        xt2.a aVar6 = cVar.d.A;
                        du2.d callStatusInfoClickHandler = new du2.d(mVarL3, new wt2.c());
                        du2.c callScreenOpener = (du2.c) aVar.z.f316624r.get();
                        s.j(callScreenOpener);
                        yt2.d.Companion.getClass();
                        Intrinsics.checkNotNullParameter(activity3, "activity");
                        Intrinsics.checkNotNullParameter(callStatusInfoClickHandler, "callStatusInfoClickHandler");
                        Intrinsics.checkNotNullParameter(callScreenOpener, "callScreenOpener");
                        dVar = new du2.j(activity3, callStatusInfoClickHandler, callScreenOpener);
                        return dVar;
                    case 21:
                        ww0.b sensitiveDataManager = aVar.v.c();
                        eqi.c sensitiveDataStorage = (eqi.c) cVar.z.get();
                        Activity activity4 = i.b(cVar.f221927a);
                        eqi.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(sensitiveDataManager, "sensitiveDataManager");
                        Intrinsics.checkNotNullParameter(sensitiveDataStorage, "sensitiveDataStorage");
                        Intrinsics.checkNotNullParameter(activity4, "activity");
                        oVar = new l5l.e(sensitiveDataManager, sensitiveDataStorage, activity4);
                        return oVar;
                    case 22:
                        fqi.b bVar7 = (fqi.b) aVar.v.f.get();
                        s.j(bVar7);
                        return new eqi.c(bVar7);
                    case 23:
                        gte.a aVarB = aVar.B.b();
                        s.j(aVarB);
                        d80.h hVar2 = (d80.h) aVar.u.F.get();
                        s.j(hVar2);
                        oVar = new p06.b(aVarB, hVar2, i.l(cVar.f221927a), (xoi.g) cVar.B.get());
                        return oVar;
                    case 24:
                        xoi.i.Companion.getClass();
                        return new xoi.g();
                    case 25:
                        j2 j2VarH = aVar.f221907a.h();
                        s.j(j2VarH);
                        return new mn.g(j2VarH);
                    case 26:
                        Activity activityB4 = i.b(cVar.f221927a);
                        j2 j2VarH2 = aVar.f221907a.h();
                        s.j(j2VarH2);
                        oVar = new mn.d(activityB4, j2VarH2);
                        return oVar;
                    case 27:
                        xoi.a aVar7 = cVar.f221928b;
                        sri.m navigator = (sri.m) cVar.F.get();
                        asi.b bVar8 = aVar.f221909c;
                        an0.c cVar5 = aVar.f221916p;
                        r1b.a aVar8 = aVar.f221920t;
                        asi.d userSessionInteractor = ((j51.a) bVar8).c();
                        s.j(userSessionInteractor);
                        yri.a screensInteractor = aVar8.a();
                        s.j(screensInteractor);
                        p1b.b naviCommandsProvider = (p1b.b) aVar8.f.get();
                        s.j(naviCommandsProvider);
                        om0.b inactivityTimer = cVar5.c();
                        s.j(inactivityTimer);
                        zm0.b sessionController = cVar5.i();
                        s.j(sessionController);
                        io.c appStartupTracker = aVar.f221907a.d();
                        s.j(appStartupTracker);
                        Intrinsics.checkNotNullParameter(navigator, "navigator");
                        Intrinsics.checkNotNullParameter(userSessionInteractor, "userSessionInteractor");
                        Intrinsics.checkNotNullParameter(screensInteractor, "screensInteractor");
                        Intrinsics.checkNotNullParameter(naviCommandsProvider, "naviCommandsProvider");
                        Intrinsics.checkNotNullParameter(inactivityTimer, "inactivityTimer");
                        Intrinsics.checkNotNullParameter(sessionController, "sessionController");
                        Intrinsics.checkNotNullParameter(appStartupTracker, "appStartupTracker");
                        oVar = new bsi.d(navigator, userSessionInteractor, screensInteractor, naviCommandsProvider, inactivityTimer, sessionController, appStartupTracker);
                        return oVar;
                    case 28:
                        xoi.a aVar9 = cVar.f221928b;
                        fsi.g coreActivityApi = cVar.f221927a;
                        Activity activity5 = i.b(coreActivityApi);
                        gsi.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(coreActivityApi, "coreActivityApi");
                        Integer containerId = coreActivityApi.getContainerId();
                        Intrinsics.checkNotNullParameter(activity5, "activity");
                        return sri.o.c(activity5, containerId, sri.k.CURRENT_ACTIVITY_OR_FALLBACK, 4);
                    case 29:
                        return l9.h(cVar.f221929c, (kwl.a) cVar.I.get());
                    case 30:
                        w49.a aVar10 = (w49.a) cVar.H.get();
                        wsg.n nVarB = aVar.E.b();
                        a aVar11 = cVar.d;
                        sri.m mVarD4 = aVar11.o.d();
                        s.j(mVarD4);
                        com.revolut.feature.kyc.impl.e eVar = new com.revolut.feature.kyc.impl.e();
                        v60.e eVarA2 = aVar11.f221912j.a();
                        s.j(eVarA2);
                        mt8.a aVarA4 = aVar11.F.a();
                        s.j(aVarA4);
                        oVar = new kwl.a(aVar10, nVarB, new KycNotPassedErrorHandler(mVarD4, eVar, eVarA2, aVarA4));
                        return oVar;
                    case 31:
                        BaseDelegatesActivity baseDelegatesActivityF3 = i.f(cVar.f221927a);
                        jxj.a aVar12 = aVar.f;
                        l70.e eVar2 = aVar.u;
                        w9k.a aVar13 = aVar.C;
                        com.revolut.retail.feature.api.userauth.navigation.a aVarA5 = aVar12.a();
                        s.j(aVarA5);
                        x9k.a aVarA6 = aVar13.a();
                        s.j(aVarA6);
                        aa5.a aVar14 = (aa5.a) aVar13.f295756n.get();
                        s.j(aVar14);
                        t70.g gVarO = eVar2.o();
                        s.j(gVarO);
                        v60.e eVarA3 = aVar.f221912j.a();
                        s.j(eVarA3);
                        rqi.c cVarB = aVar.v.b();
                        fwj.p pVarA = aVar.D.a();
                        s.j(pVarA);
                        qd0.b bVarN = eVar2.n();
                        s.j(bVarN);
                        pwl.d dVar3 = new pwl.d();
                        gte.a aVarB2 = aVar.B.b();
                        s.j(aVarB2);
                        dVar = new cwl.g(baseDelegatesActivityF3, aVarA5, aVarA6, aVar14, gVarO, eVarA3, cVarB, pVarA, bVarN, dVar3, aVarB2);
                        return dVar;
                    case 32:
                        return l9.e(cVar.f221929c, (kwl.a) cVar.I.get());
                    default:
                        throw new AssertionError(i);
                }
            case 1:
                m2h.b bVar9 = ((o4e.l) this.f221926c).f222260b;
                o4e.a aVar15 = (o4e.a) this.d;
                int i2 = this.f221925b;
                if (i2 == 0) {
                    return kxa.j.i(((z3h.g) bVar9).j(), aVar15.f222206a, (k3h.b) aVar15.d.get());
                }
                if (i2 == 1) {
                    return kxa.j.n(((z3h.g) bVar9).j(), aVar15.f222207b);
                }
                if (i2 != 2) {
                    throw new AssertionError(i2);
                }
                a5h.g factory = ((z3h.g) aVar15.f222208c.f222260b).j();
                l3h.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "factory");
                return new e5e.f(new a3e.u(new a5h.i((u4h.b) factory.f)), (k3h.b) aVar15.d.get());
            case 2:
                o4e.d dVar4 = (o4e.d) this.d;
                o4e.l lVar2 = (o4e.l) this.f221926c;
                jdh.b bVar10 = lVar2.f222259a;
                zdl.c cVar6 = lVar2.d;
                int i3 = this.f221925b;
                if (i3 == 0) {
                    gdh.a aVar16 = (gdh.a) dVar4.d.get();
                    f9f.b.e(aVar16);
                    return aVar16;
                }
                if (i3 == 1) {
                    kbb.c factory2 = bVar10.a();
                    Intrinsics.checkNotNullParameter(factory2, "factory");
                    return factory2.s();
                }
                if (i3 == 2) {
                    return f9f.b.j((gdh.a) dVar4.d.get());
                }
                if (i3 != 3) {
                    throw new AssertionError(i3);
                }
                o4e.l lVar3 = dVar4.f222214b;
                d4h.b bVar11 = new d4h.b();
                l80.e eVarH = lVar3.f222261c.h();
                s.j(eVarH);
                b5e.u uVar = new b5e.u(bVar11, eVarH);
                NoteDetailsFlowControllerContract$InputData noteDetailsFlowControllerContract$InputData = dVar4.f222213a;
                ybl.b bVarB = cVar6.b();
                s.j(bVarB);
                d0 d0VarK = cVar6.k();
                s.j(d0VarK);
                kdh.b bVarB2 = bVar10.b();
                gdh.a aVar17 = (gdh.a) dVar4.d.get();
                d4h.b bVar12 = new d4h.b();
                l80.e eVarH2 = lVar2.f222261c.h();
                s.j(eVarH2);
                return new com.revolut.feature.structured_note.details.impl.ui.note_details.a(uVar, noteDetailsFlowControllerContract$InputData, bVarB, d0VarK, bVarB2, aVar17, bVar12, eVarH2, new d5e.a());
            case 3:
                o4e.l lVar4 = (o4e.l) this.f221926c;
                o4e.e eVar3 = (o4e.e) this.d;
                int i5 = this.f221925b;
                switch (i5) {
                    case 0:
                        return efk.j.d((dtl.a) eVar3.C.get());
                    case 1:
                        return efk.j.q(lVar4.e.a(), eVar3.f222217a, (dtl.b) eVar3.B.get());
                    case 2:
                        return efk.j.r(lVar4.e.a());
                    case 3:
                        return f0k.d.g(eVar3.f222219b, ((z3h.g) lVar4.f222260b).h(), eVar3.f222221c, eVar3.d);
                    case 4:
                        return kxa.j.k((j60.a) eVar3.H.get());
                    case 5:
                        return ehe.n.s((com.revolut.kompot.navigable.a) eVar3.F.get(), (rp0.m) eVar3.G.get());
                    case 6:
                        return new rp0.m();
                    case 7:
                        return new a5e.i((a5e.b) eVar3.J.get(), eVar3.f);
                    case 8:
                        a5e.g gVar = eVar3.e;
                        d0 d0VarK2 = lVar4.d.k();
                        s.j(d0VarK2);
                        ybl.b bVarB3 = lVar4.d.b();
                        s.j(bVarB3);
                        lVar = new a5e.l(gVar, d0VarK2, bVarB3);
                        return lVar;
                    case 9:
                        return new s4e.h((s4e.b) eVar3.L.get(), eVar3.f222225h);
                    case 10:
                        s4e.e eVar4 = eVar3.f222224g;
                        d0 d0VarK3 = lVar4.d.k();
                        s.j(d0VarK3);
                        lVar = new s4e.i(eVar4, d0VarK3);
                        return lVar;
                    case 11:
                        return new t4e.h((t4e.b) eVar3.N.get(), eVar3.f222227j);
                    case 12:
                        t4e.e eVar5 = eVar3.i;
                        d0 d0VarK4 = lVar4.d.k();
                        s.j(d0VarK4);
                        ybl.b bVarB4 = lVar4.d.b();
                        s.j(bVarB4);
                        lVar = new t4e.j(eVar5, d0VarK4, bVarB4);
                        return lVar;
                    case 13:
                        return new y4e.h((y4e.b) eVar3.P.get(), eVar3.f222229l);
                    case 14:
                        y4e.e eVar6 = eVar3.k;
                        d0 d0VarK5 = lVar4.d.k();
                        s.j(d0VarK5);
                        lVar = new y4e.i(eVar6, d0VarK5);
                        return lVar;
                    case 15:
                        return new x4e.h((x4e.b) eVar3.R.get(), eVar3.f222231n);
                    case 16:
                        x4e.e eVar7 = eVar3.f222230m;
                        d0 d0VarK6 = lVar4.d.k();
                        s.j(d0VarK6);
                        ybl.b bVarB5 = lVar4.d.b();
                        s.j(bVarB5);
                        lVar = new x4e.k(eVar7, d0VarK6, bVarB5);
                        return lVar;
                    case 17:
                        return new z4e.h((z4e.b) eVar3.T.get(), eVar3.f222233p);
                    case 18:
                        z4e.e eVar8 = eVar3.o;
                        d0 d0VarK7 = lVar4.d.k();
                        s.j(d0VarK7);
                        lVar = new z4e.i(eVar8, d0VarK7);
                        return lVar;
                    case 19:
                        return new u4e.h((u4e.b) eVar3.V.get(), eVar3.f222235r);
                    case 20:
                        u4e.e eVar9 = eVar3.f222234q;
                        d0 d0VarK8 = lVar4.d.k();
                        s.j(d0VarK8);
                        ybl.b bVarB6 = lVar4.d.b();
                        s.j(bVarB6);
                        qrk.c cVarA4 = ((prk.a) lVar4.f).a();
                        s.j(cVarA4);
                        ybl.k kVarD = lVar4.f222262g.d();
                        s.j(kVarD);
                        gte.a aVarB3 = lVar4.f222263h.b();
                        s.j(aVarB3);
                        mVar = new u4e.m(eVar9, d0VarK8, bVarB6, cVarA4, kVarD, aVarB3, new p4e.a());
                        return mVar;
                    case 21:
                        hbh.j jVarA = lVar4.i.a();
                        s.j(jVarA);
                        return hy1.g.k(jVarA, eVar3.f222236s, (h1h.b) eVar3.X.get());
                    case 22:
                        hbh.j jVarA2 = lVar4.i.a();
                        s.j(jVarA2);
                        return hy1.g.l(jVarA2);
                    case 23:
                        f1h.c cVarA5 = lVar4.f222264j.a();
                        s.j(cVarA5);
                        return fp8.c.s(cVarA5, (f1h.f) eVar3.Z.get(), (f1h.b) eVar3.f222218a0.get());
                    case 24:
                        f1h.c cVarA6 = lVar4.f222264j.a();
                        s.j(cVarA6);
                        return fp8.c.t(cVarA6);
                    case 25:
                        fsl.t tVarA = lVar4.k.a();
                        s.j(tVarA);
                        return fp8.c.p(tVarA, eVar3.f222237t, (fsl.i) eVar3.c0.get());
                    case 26:
                        fsl.t tVarA2 = lVar4.k.a();
                        s.j(tVarA2);
                        return fp8.c.q(tVarA2, new o5e.a());
                    case 27:
                        return ige.d.m(lVar4.f222265l.b(), (htl.g) eVar3.f222223e0.get(), (htl.d) eVar3.f0.get());
                    case 28:
                        return ige.d.n(lVar4.f222265l.b());
                    case 29:
                        o4e.l lVar5 = eVar3.A;
                        o4e.l lVar6 = eVar3.A;
                        yhl.d dVarA = lVar5.f222266m.a();
                        s.j(dVarA);
                        ybl.b bVarB7 = lVar5.d.b();
                        s.j(bVarB7);
                        fkg.a aVar18 = new fkg.a(bVarB7);
                        l80.e eVarH3 = lVar5.f222261c.h();
                        s.j(eVarH3);
                        h8b.k kVar = new h8b.k(aVar18, eVarH3, dVarA);
                        j60.a aVar19 = (j60.a) eVar3.H.get();
                        j8b.a aVar20 = new j8b.a();
                        jx0.a aVar21 = new jx0.a(new t1(eVar3.b()), new r(eVar3.b()), new m8b.q());
                        ybl.d dVarH = lVar6.d.h();
                        s.j(dVarH);
                        ybl.k kVarD2 = lVar6.f222262g.d();
                        s.j(kVarD2);
                        l80.e eVarH4 = lVar6.f222261c.h();
                        s.j(eVarH4);
                        h8b.c cVar7 = new h8b.c(aVar20, aVar21, dVarH, kVarD2, eVarH4);
                        h8b.a aVar22 = new h8b.a();
                        f80.a aVarX = lVar4.f222261c.x();
                        s.j(aVarX);
                        l70.e eVar10 = lVar6.f222261c;
                        l80.e eVarH5 = eVar10.h();
                        s.j(eVarH5);
                        j8b.f fVar = new j8b.f();
                        l80.e eVarH6 = eVar10.h();
                        s.j(eVarH6);
                        mVar = new i8b.b(kVar, aVar19, cVar7, aVar22, aVarX, new j8b.h(eVarH5, fVar, new j8b.e(eVarH6), new j8b.d(), new j8b.c()));
                        return mVar;
                    case 30:
                        return hy1.g.c(((z3h.g) lVar4.f222260b).i(), eVar3.v, (h3h.b) eVar3.i0.get());
                    case 31:
                        return hy1.g.d(((z3h.g) lVar4.f222260b).i(), eVar3.f222238w);
                    case 32:
                        return efk.j.e((dtl.b) eVar3.B.get());
                    case 33:
                        w4e.c cVar8 = eVar3.f222239x;
                        ybl.b bVarB8 = lVar4.d.b();
                        s.j(bVarB8);
                        lVar = new w4e.e(cVar8, bVarB8);
                        return lVar;
                    case 34:
                        NoteDetailsOverviewControllerContract$InputData noteDetailsOverviewControllerContract$InputData = eVar3.f222240y;
                        a5e.m mVar2 = new a5e.m();
                        s4e.j jVar = new s4e.j();
                        t4e.l lVar7 = new t4e.l();
                        y4e.j jVar2 = new y4e.j();
                        x4e.l lVar8 = new x4e.l();
                        m2h.b bVar13 = eVar3.A.f222260b;
                        m5e.o oVar2 = new m5e.o(mVar2, jVar, lVar7, jVar2, lVar8, hy1.g.y(((z3h.g) bVar13).i()), f0k.d.n(eVar3.z, ((z3h.g) bVar13).h()), new z4e.k(), new u4e.n(), new w4e.g(), (fsl.k) eVar3.m0.get());
                        a5e.b bVar14 = (a5e.b) eVar3.J.get();
                        s4e.b bVar15 = (s4e.b) eVar3.L.get();
                        t4e.b bVar16 = (t4e.b) eVar3.N.get();
                        y4e.b bVar17 = (y4e.b) eVar3.P.get();
                        x4e.b bVar18 = (x4e.b) eVar3.R.get();
                        h3h.b bVar19 = (h3h.b) eVar3.i0.get();
                        e3h.a extensions = (e3h.a) eVar3.E.get();
                        Intrinsics.checkNotNullParameter(extensions, "extensions");
                        p0 p0Var = extensions.f122271b;
                        z4e.b bVar20 = (z4e.b) eVar3.T.get();
                        u4e.b bVar21 = (u4e.b) eVar3.V.get();
                        w4e.a aVar23 = (w4e.a) eVar3.l0.get();
                        h1h.b bVar22 = (h1h.b) eVar3.X.get();
                        h8b.h hVar3 = (h8b.h) eVar3.f222226h0.get();
                        fsl.m mVarB = lVar4.k.b();
                        s.j(mVarB);
                        ybl.b bVarB9 = lVar4.d.b();
                        s.j(bVarB9);
                        mVar = new m5e.m(noteDetailsOverviewControllerContract$InputData, oVar2, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19, p0Var, bVar20, bVar21, aVar23, bVar22, hVar3, mVarB, bVarB9);
                        return mVar;
                    case 35:
                        fsl.t tVarA3 = lVar4.k.a();
                        s.j(tVarA3);
                        return fp8.c.r(tVarA3, lVar4.f222265l.a());
                    default:
                        throw new AssertionError(i5);
                }
            case 4:
                zdl.c cVar9 = ((o4e.l) this.f221926c).d;
                o4e.j jVar3 = (o4e.j) this.d;
                int i6 = this.f221925b;
                if (i6 == 0) {
                    return new x4e.h((x4e.b) jVar3.d.get(), jVar3.f222251b);
                }
                if (i6 == 1) {
                    x4e.e eVar11 = jVar3.f222250a;
                    d0 d0VarK9 = cVar9.k();
                    s.j(d0VarK9);
                    ybl.b bVarB10 = cVar9.b();
                    s.j(bVarB10);
                    return new x4e.k(eVar11, d0VarK9, bVarB10);
                }
                if (i6 != 2) {
                    throw new AssertionError(i6);
                }
                PerformanceTrackerTermsControllerContract$InputData performanceTrackerTermsControllerContract$InputData = jVar3.f222252c;
                v5e.g gVar2 = new v5e.g(new x4e.l(), new r4e.c(new tfl.a()));
                x4e.b bVar23 = (x4e.b) jVar3.d.get();
                d0 d0VarK10 = cVar9.k();
                s.j(d0VarK10);
                return new com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.pages.terms.a(performanceTrackerTermsControllerContract$InputData, gVar2, bVar23, d0VarK10);
            case 5:
                o4e.l lVar9 = (o4e.l) this.f221926c;
                zdl.c cVar10 = lVar9.d;
                o4e.k kVar2 = (o4e.k) this.d;
                int i21 = this.f221925b;
                if (i21 == 0) {
                    return new a5e.i((a5e.b) kVar2.f.get(), kVar2.f222254b);
                }
                if (i21 == 1) {
                    a5e.g gVar3 = kVar2.f222253a;
                    d0 d0VarK11 = cVar10.k();
                    s.j(d0VarK11);
                    ybl.b bVarB11 = cVar10.b();
                    s.j(bVarB11);
                    return new a5e.l(gVar3, d0VarK11, bVarB11);
                }
                if (i21 == 2) {
                    return new v4e.u(kVar2.f222255c, (v4e.m) kVar2.f222257h.get());
                }
                if (i21 != 3) {
                    if (i21 != 4) {
                        throw new AssertionError(i21);
                    }
                    a5e.m mVar3 = new a5e.m();
                    l80.e dateProvider = kVar2.e.f222261c.h();
                    s.j(dateProvider);
                    Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
                    v4e.g chartBuilder = new v4e.g();
                    Intrinsics.checkNotNullParameter(chartBuilder, "chartBuilder");
                    return new x5e.f(new kxk.o(mVar3, new v4e.x()), (a5e.b) kVar2.f.get(), (v4e.m) kVar2.f222257h.get());
                }
                v4e.q qVar = kVar2.d;
                d0 d0VarK12 = cVar10.k();
                s.j(d0VarK12);
                ybl.b bVarB12 = cVar10.b();
                s.j(bVarB12);
                zhl.k kVarA = lVar9.f222267n.a();
                yhl.d dVarA2 = lVar9.f222266m.a();
                s.j(dVarA2);
                l80.e eVarH7 = lVar9.f222261c.h();
                s.j(eVarH7);
                return new f0(qVar, d0VarK12, bVarB12, kVarA, dVarA2, eVarH7);
            case 6:
                o73.f fVar2 = (o73.f) this.d;
                CardsCarouselFlowContract$InputData inputData = fVar2.f222670a;
                o73.e eVar12 = (o73.e) this.f221926c;
                int i22 = this.f221925b;
                if (i22 == 0) {
                    j63.a aVar24 = (j63.a) fVar2.e.get();
                    mt8.a aVarA7 = eVar12.f222654b.a();
                    s.j(aVarA7);
                    gte.a aVarB4 = eVar12.f222655c.b();
                    s.j(aVarB4);
                    return new com.revolut.feature.card_screen.impl.kompot.cards_carousel.a(inputData, aVar24, aVarA7, aVarB4);
                }
                if (i22 == 1) {
                    r63.b retailProvider = new r63.b();
                    h73.c juniorProvider2 = new h73.c();
                    o73.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(retailProvider, "retailProvider");
                    Intrinsics.checkNotNullParameter(juniorProvider2, "juniorProvider");
                    juniorProvider = new x73.a(retailProvider, juniorProvider2);
                } else {
                    if (i22 == 2) {
                        j63.a aVar25 = (j63.a) fVar2.e.get();
                        m93.a aVarA8 = eVar12.e.a();
                        s.j(aVarA8);
                        return new u63.c(aVar25, aVarA8);
                    }
                    if (i22 == 3) {
                        mae.p factory3 = eVar12.f222661n.e();
                        s.j(factory3);
                        f01.c uiKitResources = eVar12.o.g();
                        t70.b currenciesLocalization = eVar12.f222662p.g();
                        s.j(currenciesLocalization);
                        o73.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory3, "factory");
                        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
                        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
                        return factory3.a(uiKitResources, currenciesLocalization);
                    }
                    if (i22 != 4) {
                        throw new AssertionError(i22);
                    }
                    r63.a retailProvider2 = new r63.a();
                    juniorProvider = new h73.a();
                    o73.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(inputData, "inputData");
                    Intrinsics.checkNotNullParameter(retailProvider2, "retailProvider");
                    Intrinsics.checkNotNullParameter(juniorProvider, "juniorProvider");
                    int i32 = o73.b.f222650a[inputData.f65376b.ordinal()];
                    if (i32 != 1) {
                        if (i32 == 2) {
                            return retailProvider2;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return juniorProvider;
            case 7:
                o73.h hVar4 = (o73.h) this.d;
                int i33 = this.f221925b;
                if (i33 == 0) {
                    return new q83.e(hVar4.f222692a, ((o73.e) this.f221926c).f222657h.e(), (n) hVar4.f222693b.get());
                }
                if (i33 == 1) {
                    return new q83.f();
                }
                throw new AssertionError(i33);
            case 8:
                o73.l lVar10 = (o73.l) this.d;
                o73.e eVar13 = (o73.e) this.f221926c;
                x9e.a aVar26 = eVar13.f222661n;
                int i43 = this.f221925b;
                if (i43 == 0) {
                    xua.a aVarA9 = aVar26.f303678t.a();
                    s.j(aVarA9);
                    nd.l factory4 = new nd.l(aVarA9);
                    e9e.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory4, "factory");
                    return new wae.d(aVarA9);
                }
                if (i43 != 1) {
                    if (i43 == 2) {
                        a9e.h hVar5 = (a9e.h) lVar10.d.get();
                        gte.a aVarB5 = eVar13.f222655c.b();
                        s.j(aVarB5);
                        return new o83.o(hVar5, aVarB5);
                    }
                    if (i43 != 3) {
                        throw new AssertionError(i43);
                    }
                    mae.p factory5 = aVar26.e();
                    s.j(factory5);
                    f01.c uiKitResources2 = eVar13.o.g();
                    t70.b currenciesLocalization2 = eVar13.f222662p.g();
                    s.j(currenciesLocalization2);
                    p83.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory5, "factory");
                    Intrinsics.checkNotNullParameter(uiKitResources2, "uiKitResources");
                    Intrinsics.checkNotNullParameter(currenciesLocalization2, "currenciesLocalization");
                    return factory5.d(uiKitResources2, currenciesLocalization2);
                }
                n nVar = (n) lVar10.e.get();
                SubscriptionsListControllerContract$InputData subscriptionsListControllerContract$InputData = lVar10.f222701a;
                o73.e eVar14 = lVar10.f222702b;
                xua.a aVarA10 = eVar14.f222668x.a();
                s.j(aVarA10);
                gte.a aVarB6 = eVar14.f222655c.b();
                s.j(aVarB6);
                l80.e eVarH8 = eVar14.f222662p.h();
                s.j(eVarH8);
                ang.f fVarE = eVar14.f222657h.e();
                d9e.b bVar24 = (d9e.b) eVar14.f222661n.C.get();
                s.j(bVar24);
                t73.f fVar3 = new t73.f(aVarA10, aVarB6, eVarH8, fVarE, bVar24);
                d9e.a aVar27 = (d9e.a) lVar10.f222703c.get();
                z8e.a aVarD = aVar26.d();
                s.j(aVarD);
                r0 r0VarC = eVar13.z.c();
                nhf.a aVarA11 = eVar13.f222667w.a();
                s.j(aVarA11);
                return new o83.m(nVar, subscriptionsListControllerContract$InputData, fVar3, aVar27, aVarD, r0VarC, aVarA11);
            case 9:
                oa5.d dVar5 = (oa5.d) this.d;
                oa5.b bVar25 = (oa5.b) this.f221926c;
                l70.e eVar15 = bVar25.f;
                int i59 = this.f221925b;
                if (i59 != 0) {
                    if (i59 != 1) {
                        throw new AssertionError(i59);
                    }
                    w80.b bVarJ = eVar15.j();
                    s.j(bVarJ);
                    return new ya5.m(bVarJ);
                }
                n nVar2 = (n) dVar5.f223543c.get();
                PostTerminationPlanManualRepaymentControllerContract$InputData postTerminationPlanManualRepaymentControllerContract$InputData = dVar5.f223541a;
                ra5.b bVar26 = (ra5.b) bVar25.f223537p.get();
                w80.b bVarJ2 = eVar15.j();
                s.j(bVarJ2);
                za5.a aVar28 = new za5.a();
                oa5.b bVar27 = dVar5.f223542b;
                sf0.h hVarB2 = bVar27.f223531g.b();
                s.j(hVarB2);
                v60.e eVarA4 = bVar27.f223532h.a();
                s.j(eVarA4);
                return new ya5.l(nVar2, postTerminationPlanManualRepaymentControllerContract$InputData, bVar26, bVarJ2, aVar28, new ic2.c(hVarB2, eVarA4, 2));
            case 10:
                return a();
            case 11:
                return b();
            case 12:
                return c();
            case 13:
                return d();
            case 14:
                return e();
            case 15:
                return f();
            case 16:
                return g();
            case 17:
                return h();
            case 18:
                return i();
            case 19:
                return j();
            case 20:
                oda.l lVar11 = (oda.l) this.d;
                int i66 = this.f221925b;
                if (i66 == 0) {
                    return new com.revolut.feature.pockets.impl.details_v2.flow.b(lVar11.f224384a, ((o) this.f221926c).B.a());
                }
                if (i66 != 1) {
                    throw new AssertionError(i66);
                }
                AccountId accountId = lVar11.f224385b;
                bea.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                return vi0.a.a(accountId);
            case 21:
                return k();
            case 22:
                return l();
            case 23:
                return m();
            case 24:
                return n();
            case 25:
                return o();
            case 26:
                return p();
            case 27:
                return q();
            case 28:
                return r();
            default:
                og1.h hVar6 = (og1.h) this.d;
                og1.i iVar = (og1.i) this.f221926c;
                l70.e eVar16 = iVar.f224980c;
                fw2.n nVar3 = iVar.f224979b;
                int i74 = this.f221925b;
                if (i74 != 0) {
                    if (i74 == 1) {
                        return new gh1.o(nVar3.a());
                    }
                    if (i74 != 2) {
                        throw new AssertionError(i74);
                    }
                    ViewController controller = hVar6.f224976b;
                    hh1.a.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller, "controller");
                    return new c90.c(controller.m2());
                }
                n nVar4 = (n) hVar6.f224977c.get();
                GooglePayOtpVerificationScreenContract$InputData googlePayOtpVerificationScreenContract$InputData = hVar6.f224975a;
                k7i.i iVarB = nVar3.b();
                ha3.f fVarD = nVar3.f138567a.d();
                s.j(fVarD);
                b0 b0Var = new b0(fVarD);
                c90.c cVar11 = (c90.c) hVar6.d.get();
                c70.a aVarZ = eVar16.z();
                s.j(aVarZ);
                r70.c cVarA7 = eVar16.A();
                s.j(cVarA7);
                return new gh1.i(nVar4, googlePayOtpVerificationScreenContract$InputData, iVarB, b0Var, cVar11, aVarZ, cVarA7);
        }
    }
}

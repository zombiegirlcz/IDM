package nng;

import android.app.Activity;
import bai.q;
import bai.r;
import c12.z;
import com.revolut.feature.apm.breb.impl.ui.register.BrebRegisterScreenContract$InputData;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.auto_renewal_dialog.AutoRenewalDialogContract$InputData;
import com.revolut.feature.credit.post_termination_plan.impl.ui.plandetails.PostTerminationPlanDetailsFlowContract$InputData;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.gallery.TransferPersonalisationGallerySelectorContract$InputData;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.style.TransferPersonalisationStyleSelectorContract$InputData;
import com.revolut.feature.semi_independent_activation.impl.data.service.SemiIndependentActivationConfigService;
import com.revolut.feature.semi_independent_activation.impl.ui.activation.SemiIndependentActivationFlowContract$InputData;
import com.revolut.feature.semi_independent_activation.impl.ui.details.SemiIndependentActivationDetailsScreenContract$InputData;
import com.revolut.feature.shared.branding.impl.ui.preview_auto.PaymentLinkAutoPreviewScreenContract$InputData;
import com.revolut.feature.structured_note.details.impl.ui.screens.about_note.AboutNoteScreenContract$InputData;
import com.revolut.feature.structured_note.details.impl.ui.screens.about_note_glossary.AboutNoteGlossaryScreenContract$InputData;
import com.revolut.feature.structured_note.details.impl.ui.screens.note_insights.NoteInsightsScreenContract$InputData;
import com.revolut.feature.structured_note.details.impl.ui.screens.payout_calculator.PayoutCalculatorScreenContract$InputData;
import com.revolut.feature.structured_note.details.impl.ui.screens.payout_scenario.PayoutScenarioScreenContract$InputData;
import com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.PerformanceTrackerFlowContract$InputData;
import com.revolut.feature.teen_dashboard.impl.ui.dashboard.TeenDashboardScreenContract$InputData;
import com.revolut.feature.teen_dashboard.impl.ui.details.TeenDetailsScreenContract$InputData;
import com.revolut.feature.transfer_reasons.impl.ui.actions.TransferReasonsDeclarationActionsScreenContract$InputData;
import com.revolut.feature.transfer_reasons.impl.ui.transactions.TransferReasonsTransactionsScreenContract$InputData;
import com.revolut.feature.user_declarations.shared.flows.tracking.AnalyticsEventTrackingConsentControllerProvider;
import com.revolut.feature_retail_user_declarations.bank_terms.AcceptBankTermsScreenContract$InputData;
import com.revolut.feature_retail_user_declarations.citizenship.citizenship_prompt.NationalityPromptScreenContract$InputData;
import com.revolut.feature_retail_user_declarations.email.flow.EmailFlowInputData;
import com.revolut.feature_retail_user_declarations.email_verification.EmailVerificationFlowInputData;
import com.revolut.feature_retail_user_declarations.email_verification.otp_flow.EmailVerificationOtpFlowInputData;
import com.revolut.feature_retail_user_declarations.employer.EmployerInputData;
import com.revolut.feature_retail_user_declarations.transaction_countries.expected_amount.ExpectedAmountControllerContract$InputData;
import com.revolut.shared.feature.user_declarations.api.flows.tracking.TrackingConsentInputData;
import et6.t0;
import kl.t1;
import kotlin.jvm.internal.Intrinsics;
import oai.i0;
import om4.d0;
import oqe.t;
import oqe.u;
import rv1.v;
import us6.x1;
import vc.s;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f217668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f217669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xki.e f217670c;

    public /* synthetic */ n(Object obj2, xki.e eVar, int i) {
        this.f217668a = i;
        this.f217669b = obj2;
        this.f217670c = eVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f217668a) {
            case 0:
                TrackingConsentInputData trackingConsentInputData = ((o) this.f217670c).f217671a;
                jvh.a aVarA = ((p) this.f217669b).e.a();
                s.j(aVarA);
                return new com.revolut.feature.user_declarations.shared.flows.tracking.flow.a(trackingConsentInputData, aVarA, new AnalyticsEventTrackingConsentControllerProvider());
            case 1:
                u uVar = new u();
                TeenDashboardScreenContract$InputData teenDashboardScreenContract$InputData = ((nqe.a) this.f217670c).f218428a;
                nqe.b bVar = (nqe.b) this.f217669b;
                xqe.b bVarA = bVar.f218430a.a();
                s.j(bVarA);
                til.m mVarA = bVar.f218431b.a();
                s.j(mVarA);
                return new t(uVar, teenDashboardScreenContract$InputData, bVarA, mVarA);
            case 2:
                nqe.c cVar = (nqe.c) this.f217670c;
                z80.b bVarS = cVar.f218434b.f218432c.s();
                s.j(bVarS);
                qqe.l lVar = new qqe.l(bVarS);
                TeenDetailsScreenContract$InputData teenDetailsScreenContract$InputData = cVar.f218433a;
                xqe.b bVarA2 = ((nqe.b) this.f217669b).f218430a.a();
                s.j(bVarA2);
                return new qqe.j(lVar, teenDetailsScreenContract$InputData, bVarA2);
            case 3:
                vsf.l lVar2 = new vsf.l();
                TransferReasonsDeclarationActionsScreenContract$InputData transferReasonsDeclarationActionsScreenContract$InputData = ((nsf.c) this.f217670c).f218808a;
                nsf.b bVar2 = (nsf.b) this.f217669b;
                vxd.b bVar3 = bVar2.i;
                zxd.c cVarA = ((eyd.b) bVar3).a();
                s.j(cVarA);
                n0e.b bVarC = ((eyd.b) bVar3).c();
                vyd.a aVar = new vyd.a();
                sf0.h hVarB = bVar2.f218799j.b();
                s.j(hVarB);
                return new vsf.i(lVar2, transferReasonsDeclarationActionsScreenContract$InputData, cVarA, bVarC, aVar, hVarB);
            case 4:
                return new com.revolut.feature.transfer_reasons.impl.flow.refund.b(new qsf.o(), new isf.d(), ((nsf.f) this.f217670c).f218814a, new qsf.k(), (csf.b) ((nsf.b) this.f217669b).f218804q.get());
            case 5:
                nsf.h hVar = (nsf.h) this.f217670c;
                whf.n nVarB = hVar.f218821b.e.b();
                s.j(nVarB);
                ptf.n nVar = new ptf.n(nVarB);
                TransferReasonsTransactionsScreenContract$InputData transferReasonsTransactionsScreenContract$InputData = hVar.f218820a;
                nsf.b bVar4 = (nsf.b) this.f217669b;
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) bVar4.f218796c).c();
                s.j(aVarC);
                whf.b bVarA3 = bVar4.e.a();
                s.j(bVarA3);
                return new ptf.l(nVar, transferReasonsTransactionsScreenContract$InputData, aVarC, bVarA3);
            case 6:
                nv1.h hVar2 = (nv1.h) this.f217670c;
                ov1.e eVar = hVar2.f219413a;
                nv1.g gVar = (nv1.g) this.f217669b;
                gte.a aVarB = gVar.f219399g.b();
                s.j(aVarB);
                rv1.t tVar = (rv1.t) gVar.f219408s.get();
                wj0.a aVarI = ((nj0.d) gVar.f).i();
                s.j(aVarI);
                zu1.a aVar2 = (zu1.a) gVar.f219411x.get();
                sv1.d dVar = new sv1.d();
                nv1.g gVar2 = hVar2.f219414b;
                sf0.h hVarB2 = gVar2.f219400h.b();
                s.j(hVarB2);
                v60.e eVarA = gVar2.i.a();
                s.j(eVarA);
                return new com.revolut.feature.apm.breb.impl.flow.a(eVar, aVarB, tVar, aVarI, aVar2, dVar, new rs1.c(new ic2.c(hVarB2, eVarA, 1), (rv1.t) gVar2.f219408s.get()));
            case 7:
                nv1.g gVar3 = (nv1.g) this.f217669b;
                bv1.a aVar3 = (bv1.a) gVar3.f219409t.get();
                nv1.s sVar = (nv1.s) this.f217670c;
                ev1.b bVar5 = new ev1.b((z) sVar.f219446b.B.get());
                kz9.a aVarA2 = gVar3.f219406q.a();
                s.j(aVarA2);
                return new com.revolut.feature.apm.breb.impl.ui.transfer.a(aVar3, bVar5, aVarA2, new rv1.z((v) gVar3.z.get()), sVar.f219445a);
            case 8:
                nv1.u uVar2 = (nv1.u) this.f217670c;
                BrebRegisterScreenContract$InputData brebRegisterScreenContract$InputData = uVar2.f219452b;
                qw1.j jVar = new qw1.j();
                nv1.g gVar4 = (nv1.g) this.f217669b;
                vw1.b bVar6 = (vw1.b) gVar4.u.get();
                wj0.a aVarI2 = ((nj0.d) gVar4.f).i();
                s.j(aVarI2);
                z80.b bVarS2 = uVar2.f219453c.f219401j.s();
                s.j(bVarS2);
                return new qw1.g(brebRegisterScreenContract$InputData, jVar, bVar6, aVarI2, new qw1.i(new sv1.a(bVarS2)));
            case 9:
                nv1.u uVar3 = (nv1.u) this.f217670c;
                BrebRegisterScreenContract$InputData brebRegisterScreenContract$InputData2 = uVar3.f219452b;
                qw1.j jVar2 = new qw1.j();
                nv1.g gVar5 = (nv1.g) this.f217669b;
                vw1.b bVar7 = (vw1.b) gVar5.u.get();
                wj0.a aVarI3 = ((nj0.d) gVar5.f).i();
                s.j(aVarI3);
                z80.b bVarS3 = uVar3.f219453c.f219401j.s();
                s.j(bVarS3);
                return new qw1.g(brebRegisterScreenContract$InputData2, jVar2, bVar7, aVarI3, new qw1.i(new sv1.a(bVarS3)));
            case 10:
                o0d.a aVar4 = (o0d.a) this.f217670c;
                o0d.c cVar2 = aVar4.f221197b;
                hf8.b bVarC2 = cVar2.f221201a.c();
                z80.b bVarS4 = cVar2.f221202b.s();
                s.j(bVarS4);
                u0d.b bVar8 = new u0d.b(bVarC2, new u0d.f(bVarS4), new u0d.e(cVar2.f221203c.g()), new u0d.c());
                SemiIndependentActivationDetailsScreenContract$InputData semiIndependentActivationDetailsScreenContract$InputData = aVar4.f221196a;
                n0d.b bVar9 = ((o0d.c) this.f217669b).d;
                n0d.a aVar5 = (n0d.a) bVar9;
                nj0.d dVar2 = (nj0.d) aVar5.f211011a;
                ik0.b retrofitFactory = dVar2.m();
                s.j(retrofitFactory);
                ek.a converterFactory = dVar2.d();
                n0d.c cVar3 = n0d.d.Companion;
                cVar3.getClass();
                Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
                Intrinsics.checkNotNullParameter(converterFactory, "converterFactory");
                Object objCreate = ik0.b.a(retrofitFactory, null, null, converterFactory, null, 27).create(SemiIndependentActivationConfigService.class);
                Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                SemiIndependentActivationConfigService semiIndependentActivationConfigService = (SemiIndependentActivationConfigService) objCreate;
                s.k(semiIndependentActivationConfigService);
                cVar3.getClass();
                return new s0d.m(bVar8, semiIndependentActivationDetailsScreenContract$InputData, new t1(new k0d.b(semiIndependentActivationConfigService, new ne0.d(), aVar5.b())), ((n0d.a) bVar9).a());
            case 11:
                SemiIndependentActivationFlowContract$InputData semiIndependentActivationFlowContract$InputData = ((o0d.b) this.f217670c).f221199a;
                o0d.c cVar4 = (o0d.c) this.f217669b;
                p0d.e eVarA2 = ((n0d.a) cVar4.d).a();
                til.m mVarA2 = cVar4.e.a();
                s.j(mVarA2);
                return new com.revolut.feature.semi_independent_activation.impl.ui.activation.b(semiIndependentActivationFlowContract$InputData, eVarA2, mVarA2);
            case 12:
                o2a.d dVar3 = (o2a.d) this.f217670c;
                TransferPersonalisationGallerySelectorContract$InputData transferPersonalisationGallerySelectorContract$InputData = dVar3.f221603a;
                d0 d0VarC = ((n2a.a) ((o2a.b) this.f217669b).f221598a).c();
                Activity context = dVar3.f221604b;
                v2a.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                qz0.n nVar2 = new qz0.n(context, null, null);
                o2a.b bVar10 = dVar3.f221605c;
                r2a.a aVarA3 = ((n2a.a) bVar10.f221598a).a();
                f80.a aVarX = bVar10.f221600c.x();
                s.j(aVarX);
                return new u2a.g(transferPersonalisationGallerySelectorContract$InputData, d0VarC, nVar2, new qee.s(new u2a.a(transferPersonalisationGallerySelectorContract$InputData, aVarA3, aVarX)));
            case 13:
                o2a.f fVar = (o2a.f) this.f217670c;
                TransferPersonalisationStyleSelectorContract$InputData transferPersonalisationStyleSelectorContract$InputData = fVar.f221609a;
                d0 d0VarC2 = ((n2a.a) ((o2a.b) this.f217669b).f221598a).c();
                o2a.b bVar11 = fVar.f221610b;
                r2a.a aVarA4 = ((n2a.a) bVar11.f221598a).a();
                f80.a aVarX2 = bVar11.f221600c.x();
                s.j(aVarX2);
                return new z2a.k(transferPersonalisationStyleSelectorContract$InputData, d0VarC2, new yq5.d(new z2a.d(transferPersonalisationStyleSelectorContract$InputData, aVarA4, aVarX2)));
            case 14:
                AboutNoteGlossaryScreenContract$InputData aboutNoteGlossaryScreenContract$InputData = ((o4e.b) this.f217670c).f222209a;
                i5e.f fVar2 = new i5e.f();
                zdl.c cVar5 = ((o4e.l) this.f217669b).d;
                ybl.b bVarB = cVar5.b();
                s.j(bVarB);
                ael.d0 d0VarK = cVar5.k();
                s.j(d0VarK);
                return new i5e.h(aboutNoteGlossaryScreenContract$InputData, fVar2, bVarB, d0VarK);
            case 15:
                AboutNoteScreenContract$InputData aboutNoteScreenContract$InputData = ((o4e.c) this.f217670c).f222211a;
                g5e.h hVar3 = new g5e.h();
                zdl.c cVar6 = ((o4e.l) this.f217669b).d;
                ael.d0 d0VarK2 = cVar6.k();
                s.j(d0VarK2);
                ybl.b bVarB2 = cVar6.b();
                s.j(bVarB2);
                return new com.revolut.feature.structured_note.details.impl.ui.screens.about_note.a(aboutNoteScreenContract$InputData, hVar3, d0VarK2, bVarB2);
            case 16:
                NoteInsightsScreenContract$InputData noteInsightsScreenContract$InputData = ((o4e.f) this.f217670c).f222241a;
                o4e.l lVar3 = (o4e.l) this.f217669b;
                zdl.c cVar7 = lVar3.d;
                ael.d0 d0VarK3 = cVar7.k();
                s.j(d0VarK3);
                ybl.b bVarB3 = cVar7.b();
                s.j(bVarB3);
                qrk.c cVarA2 = ((prk.a) lVar3.f).a();
                s.j(cVarA2);
                ybl.k kVarD = lVar3.f222262g.d();
                s.j(kVarD);
                gte.a aVarB2 = lVar3.f222263h.b();
                s.j(aVarB2);
                return new k5e.m(noteInsightsScreenContract$InputData, d0VarK3, bVarB3, cVarA2, kVarD, aVarB2, new p4e.a(), new k5e.i());
            case 17:
                PayoutCalculatorScreenContract$InputData payoutCalculatorScreenContract$InputData = ((o4e.g) this.f217670c).f222243a;
                p5e.g gVar6 = new p5e.g();
                ybl.b bVarB4 = ((o4e.l) this.f217669b).d.b();
                s.j(bVarB4);
                return new p5e.i(payoutCalculatorScreenContract$InputData, gVar6, bVarB4);
            case 18:
                PayoutScenarioScreenContract$InputData payoutScenarioScreenContract$InputData = ((o4e.h) this.f217670c).f222245a;
                r5e.j jVar3 = new r5e.j(new r4e.c(new tfl.a()));
                ael.d0 d0VarK4 = ((o4e.l) this.f217669b).d.k();
                s.j(d0VarK4);
                return new com.revolut.feature.structured_note.details.impl.ui.screens.payout_scenario.a(payoutScenarioScreenContract$InputData, jVar3, d0VarK4);
            case 19:
                PerformanceTrackerFlowContract$InputData performanceTrackerFlowContract$InputData = ((o4e.i) this.f217670c).f222247a;
                t5e.l lVar4 = new t5e.l();
                ybl.b bVarB5 = ((o4e.l) this.f217669b).d.b();
                s.j(bVarB5);
                return new t5e.o(performanceTrackerFlowContract$InputData, lVar4, bVarB5);
            case 20:
                o6d.f fVar3 = (o6d.f) this.f217669b;
                l6d.a aVar6 = (l6d.a) fVar3.e.get();
                t0 t0Var = (t0) ((x1) fVar3.f222562c).f282802c.get();
                s.j(t0Var);
                o6d.g gVar7 = (o6d.g) this.f217670c;
                PaymentLinkAutoPreviewScreenContract$InputData paymentLinkAutoPreviewScreenContract$InputData = gVar7.f222563a;
                x80.a aVarQ = gVar7.f222564b.f222560a.q();
                s.j(aVarQ);
                return new r6d.g(aVar6, t0Var, paymentLinkAutoPreviewScreenContract$InputData, new r6d.k(aVarQ));
            case 21:
                AutoRenewalDialogContract$InputData autoRenewalDialogContract$InputData = ((o73.d) this.f217670c).f222651a;
                return new m73.e(new m73.g(autoRenewalDialogContract$InputData), autoRenewalDialogContract$InputData, ((o73.e) this.f217669b).K.e(), new i90.b());
            case 22:
                oa5.c cVar8 = (oa5.c) this.f217670c;
                PostTerminationPlanDetailsFlowContract$InputData postTerminationPlanDetailsFlowContract$InputData = cVar8.f223538a;
                ra5.b bVar12 = (ra5.b) ((oa5.b) this.f217669b).f223537p.get();
                qa5.b bVar13 = new qa5.b(new sa5.c());
                oa5.b bVar14 = cVar8.f223539b;
                sf0.h hVarB3 = bVar14.f223531g.b();
                s.j(hVarB3);
                v60.e eVarA3 = bVar14.f223532h.a();
                s.j(eVarA3);
                return new com.revolut.feature.credit.post_termination_plan.impl.ui.plandetails.a(postTerminationPlanDetailsFlowContract$InputData, bVar12, bVar13, new ic2.c(hVarB3, eVarA3, 2));
            case 23:
                oai.c cVar9 = (oai.c) this.f217670c;
                AcceptBankTermsScreenContract$InputData acceptBankTermsScreenContract$InputData = cVar9.f223666b;
                q qVar = new q(acceptBankTermsScreenContract$InputData, new dai.a());
                AcceptBankTermsScreenContract$InputData acceptBankTermsScreenContract$InputData2 = cVar9.f223666b;
                ore.b bVar15 = ((i0) this.f217669b).f223705l;
                pre.c cVarA3 = bVar15.a();
                s.j(cVarA3);
                mre.c cVarB = bVar15.b();
                s.j(cVarB);
                n8b.b bVarB6 = ((i0) cVar9.d).k.b();
                s.j(bVarB6);
                return new com.revolut.feature_retail_user_declarations.bank_terms.a(qVar, acceptBankTermsScreenContract$InputData2, cVarA3, cVarB, new r(acceptBankTermsScreenContract$InputData, bVarB6));
            case 24:
                EmailFlowInputData emailFlowInputData = ((oai.i) this.f217670c).f223696a;
                i0 i0Var = (i0) this.f217669b;
                vai.c cVar10 = (vai.c) i0Var.A.get();
                pai.a aVar7 = (pai.a) i0Var.B.get();
                yva.a aVarA5 = i0Var.f223709q.a();
                s.j(aVarA5);
                gte.a aVarB3 = i0Var.d.b();
                s.j(aVarB3);
                return new com.revolut.feature_retail_user_declarations.email.flow.d(emailFlowInputData, cVar10, aVar7, aVarA5, aVarB3);
            case 25:
                EmailVerificationFlowInputData emailVerificationFlowInputData = ((oai.k) this.f217670c).f223723a;
                i0 i0Var2 = (i0) this.f217669b;
                return new com.revolut.feature_retail_user_declarations.email_verification.b(emailVerificationFlowInputData, i0Var2.e.e(), (pai.a) i0Var2.B.get(), (vai.c) i0Var2.A.get());
            case 26:
                EmailVerificationOtpFlowInputData emailVerificationOtpFlowInputData = ((oai.l) this.f217670c).f223729a;
                i0 i0Var3 = (i0) this.f217669b;
                return new com.revolut.feature_retail_user_declarations.email_verification.otp_flow.b(emailVerificationOtpFlowInputData, i0Var3.e.e(), (pai.a) i0Var3.B.get(), new pai.f(), (vai.c) i0Var3.A.get());
            case 27:
                EmployerInputData employerInputData = ((oai.n) this.f217670c).f223741a;
                jvh.a aVarA6 = ((i0) this.f217669b).f.a();
                s.j(aVarA6);
                return new com.revolut.feature_retail_user_declarations.employer.flow.a(employerInputData, aVarA6);
            case 28:
                ExpectedAmountControllerContract$InputData expectedAmountControllerContract$InputData = ((oai.o) this.f217670c).f223747a;
                sci.k kVar = new sci.k(expectedAmountControllerContract$InputData, new xci.b());
                w80.b bVarJ = ((i0) this.f217669b).f223703h.j();
                s.j(bVarJ);
                return new com.revolut.feature_retail_user_declarations.transaction_countries.expected_amount.a(kVar, expectedAmountControllerContract$InputData, bVarJ);
            default:
                oai.t tVar2 = (oai.t) this.f217670c;
                NationalityPromptScreenContract$InputData nationalityPromptScreenContract$InputData = tVar2.f223771a;
                n8b.a aVarA7 = tVar2.f223772b.k.a();
                s.j(aVarA7);
                eai.m mVar = new eai.m(nationalityPromptScreenContract$InputData, aVarA7);
                fk3.a aVarA8 = ((i0) this.f217669b).f223704j.a();
                s.j(aVarA8);
                return new eai.k(mVar, nationalityPromptScreenContract$InputData, aVarA8);
        }
    }
}

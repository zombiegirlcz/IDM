package qbj;

import afj.s3;
import com.revolut.feature.apm.spin.impl.ui.transfer.SpinTransferFlowContract$InputData;
import com.revolut.feature.junior_onboarding.impl.ui.onboarding.JuniorOnboardingFlowContract$InputData;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.details_confirmation.JuniorDetailsConfirmationScreenContract$InputData;
import com.revolut.feature.subaccount.impl.ui.create.flow.group.ContactsPickerFlowContract$InputData;
import com.revolut.feature.subaccount.impl.ui.edit.invite.flow.InviteMembersFlowContract$InputData;
import com.revolut.feature.subaccount.impl.ui.edit_name.SubAccountEditNameContract$InputData;
import com.revolut.feature.topup_screen.api.descriptor.BrazilStoredMethodDetailsDescriptor$InputData;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.ideal.IdealTopUpFlowContract$InputData;
import com.revolut.feature.topup_screen.impl.mcy.account_verification.McyTopupAccountVerificationScreenContract$InputData;
import com.revolut.feature.workflow.engine.doc_selection.workflow_document_selection_flow.alternative_documents.AlternativeDocumentsControllerContract$InputData;
import com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.summary.ReturnCryptoDepositSummaryScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.network.EsimInstructionsService;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.graduate_student.GraduateStudentFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_durable_terms.PlanDurableTermsFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.StudentFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_contextual_selection.PlanContextualSelectionScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_bottom_sheet.PlanOfferBottomSheetScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_referrals_invite_video.PlanReferralsInviteVideoScreenContract$InputData;
import dfj.k0;
import dfj.n0;
import eik.y;
import kotlin.jvm.internal.Intrinsics;
import nfj.e0;
import qgk.b0;
import qgk.b1;
import qgk.c1;
import qgk.g0;
import qgk.i0;
import qgk.i3;
import qgk.j1;
import qgk.r0;
import qgk.u1;
import qgk.w1;
import qgk.y1;
import ql7.k1;
import rh8.o0;

/* JADX INFO: loaded from: classes11.dex */
public final class w implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f244365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f244366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qji.b f244367c;

    public /* synthetic */ w(Object obj2, qji.b bVar, int i) {
        this.f244365a = i;
        this.f244366b = obj2;
        this.f244367c = bVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f244365a) {
            case 0:
                x xVar = (x) this.f244367c;
                q qVar = xVar.f244369b;
                uj5.a aVarB = ((ak5.i) qVar.f244330b).b();
                vc.s.j(aVarB);
                jcj.p pVar = new jcj.p(aVarB);
                ap5.b bVarE = ((yo5.w) qVar.f244339q).e();
                vc.s.j(bVarE);
                mp.p pVar2 = new mp.p(bVarE, qVar.f244340r.b(), qVar.f244341s.a());
                jcj.a aVar = new jcj.a();
                ReturnCryptoDepositSummaryScreenContract$InputData returnCryptoDepositSummaryScreenContract$InputData = xVar.f244368a;
                fbj.a aVarA = ((m) ((q) this.f244366b).f244329a).a();
                vc.s.j(aVarA);
                return new com.revolut.retail.feature.crypto_deposits.impl.ui.return_deposit.summary.a(pVar, pVar2, aVar, returnCryptoDepositSummaryScreenContract$InputData, aVarA);
            case 1:
                qd2.j jVar = (qd2.j) this.f244367c;
                SpinTransferFlowContract$InputData spinTransferFlowContract$InputData = jVar.f244853a;
                qd2.f fVar = jVar.f244854b;
                return new com.revolut.feature.apm.spin.impl.ui.transfer.b(spinTransferFlowContract$InputData, new rd2.c((uy1.o) fVar.f244843p.get(), ((c21.b) fVar.i).a()), new x2k.a(), ((qd2.f) this.f244366b).f244839j.b());
            case 2:
                qd6.a aVar2 = (qd6.a) this.f244366b;
                c70.a aVarZ = aVar2.f244871a.z();
                vc.s.j(aVarZ);
                ud6.i iVar = new ud6.i();
                s3 s3Var = aVar2.f244872b;
                EsimInstructionsService esimInstructionsService = (EsimInstructionsService) s3Var.f.get();
                ne0.j jVar2 = (ne0.j) s3Var.f4443g.get();
                ue0.c cVar = (ue0.c) s3Var.f4444h.get();
                gte.a aVarB2 = s3Var.d.b();
                vc.s.j(aVarB2);
                e0 e0Var = new e0(esimInstructionsService, jVar2, cVar, aVarB2);
                n80.b bVar = new n80.b();
                k0 k0Var = (k0) s3Var.e.Y.get();
                vc.s.j(k0Var);
                return new ud6.h(aVarZ, iVar, new n0(e0Var, bVar, k0Var), ((qd6.c) this.f244367c).f244876a, new vd6.a());
            case 3:
                qgk.i iVar2 = (qgk.i) this.f244367c;
                wgk.c cVar2 = iVar2.f246005a;
                i0 i0Var = (i0) this.f244366b;
                ln3.b bVar2 = new ln3.b();
                ffk.t tVarF = i0Var.f246013h.f();
                vc.s.j(tVarF);
                i0 i0Var2 = iVar2.f246006b;
                efk.a aVar3 = i0Var2.f246013h;
                ffk.t tVarF2 = aVar3.f();
                vc.s.j(tVarF2);
                cha.b bVarC = aVar3.c();
                vc.s.j(bVarC);
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.contact_selection.f fVar2 = new com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.contact_selection.f(tVarF2, bVarC);
                cha.b bVarC2 = i0Var2.f246013h.c();
                vc.s.j(bVarC2);
                return new com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.contact_selection.d(cVar2, bVar2, tVarF, fVar2, new xgk.d(bVarC2, new xgk.e()));
            case 4:
                GraduateStudentFlowContract$InputData graduateStudentFlowContract$InputData = ((qgk.p) this.f244367c).f246185a;
                i0 i0Var3 = (i0) this.f244366b;
                cha.c cVarJ = i0Var3.f246013h.j();
                vc.s.j(cVarJ);
                zja.a aVarA2 = ((ika.b) i0Var3.Q).a();
                vc.s.j(aVarA2);
                return new com.revolut.retail.feature.pricing_plans.ui.impl.flows.graduate_student.b(graduateStudentFlowContract$InputData, cVarJ, aVarA2);
            case 5:
                b0 b0Var = (b0) this.f244367c;
                tjk.d hyperTextClauseBuilder = new tjk.d();
                Intrinsics.checkNotNullParameter(hyperTextClauseBuilder, "hyperTextClauseBuilder");
                tjk.b bVar3 = new tjk.b();
                pqi.a aVar4 = b0Var.f245888b.e;
                vlk.f fVar3 = new vlk.f(aVar4.g());
                yik.b bVar4 = new yik.b();
                vlk.v vVar = new vlk.v();
                PlanContextualSelectionScreenContract$InputData planContextualSelectionScreenContract$InputData = b0Var.f245887a;
                return new vlk.s(new vlk.t(bVar3, fVar3, bVar4, vVar, new mgk.a(planContextualSelectionScreenContract$InputData), b0Var.f245887a, aVar4.g()), planContextualSelectionScreenContract$InputData, ((i0) this.f244366b).f246024x.a());
            case 6:
                ffk.t tVarF3 = ((i0) this.f244366b).f246013h.f();
                vc.s.j(tVarF3);
                g0 g0Var = (g0) this.f244367c;
                PlanDurableTermsFlowContract$InputData planDurableTermsFlowContract$InputData = g0Var.f245963a;
                i0 i0Var4 = g0Var.f245964b;
                l80.h hVarV = i0Var4.E.v();
                vc.s.j(hVarV);
                sh3.a aVarA3 = i0Var4.v.a();
                vc.s.j(aVarA3);
                return new com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_durable_terms.c(tVarF3, planDurableTermsFlowContract$InputData, new ehk.j(hVarV, aVarA3));
            case 7:
                r0 r0Var = (r0) this.f244367c;
                tmk.k buttonMapper = new tmk.k();
                tjk.d hyperTextClauseBuilder2 = new tjk.d();
                Intrinsics.checkNotNullParameter(buttonMapper, "buttonMapper");
                Intrinsics.checkNotNullParameter(hyperTextClauseBuilder2, "hyperTextClauseBuilder");
                nd.o oVar = new nd.o();
                tjk.d dVar = new tjk.d();
                PlanOfferBottomSheetScreenContract$InputData planOfferBottomSheetScreenContract$InputData = r0Var.f246212a;
                return new tmk.i(new tmk.l(oVar, dVar, planOfferBottomSheetScreenContract$InputData), planOfferBottomSheetScreenContract$InputData, ((i0) this.f244366b).f246024x.a());
            case 8:
                PlanReferralsInviteVideoScreenContract$InputData planReferralsInviteVideoScreenContract$InputData = ((b1) this.f244367c).f245890a;
                f80.a aVarX = ((i0) this.f244366b).E.x();
                vc.s.j(aVarX);
                return new ink.f(planReferralsInviteVideoScreenContract$InputData, aVarX);
            case 9:
                i0 i0Var5 = (i0) this.f244366b;
                kge.d dVarB = i0Var5.f246008a.b();
                ffk.t tVarF4 = i0Var5.f246013h.f();
                vc.s.j(tVarF4);
                c1 c1Var = (c1) this.f244367c;
                i0 i0Var6 = c1Var.f245903b;
                f4h.a aVar5 = new f4h.a(((c21.b) i0Var6.O).c());
                ln3.b contactsChooserNavigationScreenProvider = new ln3.b();
                Intrinsics.checkNotNullParameter(contactsChooserNavigationScreenProvider, "contactsChooserNavigationScreenProvider");
                iik.a aVar6 = new iik.a();
                ay9.a aVarA4 = i0Var6.P.a();
                vc.s.j(aVarA4);
                iik.c cVar3 = new iik.c(aVarA4);
                fik.d dVar2 = new fik.d();
                ffk.t tVarF5 = i0Var6.f246013h.f();
                vc.s.j(tVarF5);
                zja.a aVarA5 = ((ika.b) i0Var6.Q).a();
                vc.s.j(aVarA5);
                return new com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g(dVarB, tVarF4, aVar5, aVar6, cVar3, dVar2, new y(tVarF5, aVarA5, new fik.b(i0Var6.e.g())), new eik.c(), kqi.b.a(i0Var6.C), c1Var.f245902a);
            case 10:
                i0 i0Var7 = (i0) this.f244366b;
                ffk.t tVarF6 = i0Var7.f246013h.f();
                vc.s.j(tVarF6);
                i3 i3Var = ((j1) this.f244367c).f246068a.f246010b;
                ijk.c cVar4 = (ijk.c) i3Var.U.get();
                vc.s.j(cVar4);
                jgk.x xVar2 = (jgk.x) i3Var.S.get();
                vc.s.j(xVar2);
                pik.h hVar = new pik.h(cVar4, xVar2);
                jgk.v vVarD = i0Var7.f246010b.d();
                vc.s.j(vVarD);
                return new com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_switch_entry.a(tVarF6, hVar, vVarD);
            case 11:
                qnk.h hVar2 = new qnk.h();
                tik.c cVar5 = (tik.c) ((y1) this.f244367c).d.get();
                ffk.e0 e0Var2 = (ffk.e0) ((i0) this.f244366b).f246013h.N.get();
                vc.s.j(e0Var2);
                return new qnk.g(hVar2, cVar5, e0Var2);
            case 12:
                StudentFlowContract$InputData studentFlowContract$InputData = ((u1) this.f244367c).f246272a;
                cha.c cVarJ2 = ((i0) this.f244366b).f246013h.j();
                vc.s.j(cVarJ2);
                return new com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.a(studentFlowContract$InputData, cVarJ2);
            case 13:
                ffk.e0 e0Var3 = (ffk.e0) ((i0) this.f244366b).f246013h.N.get();
                vc.s.j(e0Var3);
                return new wnk.k(e0Var3, ((w1) this.f244367c).f246306a);
            case 14:
                qh8.h hVar3 = (qh8.h) this.f244367c;
                JuniorDetailsConfirmationScreenContract$InputData juniorDetailsConfirmationScreenContract$InputData = hVar3.f246523a;
                hi8.c cVar6 = new hi8.c();
                lh8.f fVar4 = (lh8.f) hVar3.f246524b.f.f246500m.get();
                vc.s.j(fVar4);
                com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.details_confirmation.mapper.a aVar7 = new com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.details_confirmation.mapper.a(juniorDetailsConfirmationScreenContract$InputData, cVar6, fVar4);
                qh8.k kVar = (qh8.k) this.f244366b;
                ang.f fVarE = kVar.f246537l.e();
                qh8.b bVar5 = kVar.f;
                o0 o0Var = (o0) bVar5.f246500m.get();
                vc.s.j(o0Var);
                return new fi8.k(juniorDetailsConfirmationScreenContract$InputData, aVar7, fVarE, o0Var, bVar5.a());
            case 15:
                JuniorOnboardingFlowContract$InputData juniorOnboardingFlowContract$InputData = ((qh8.j) this.f244367c).f246529a;
                qh8.k kVar2 = (qh8.k) this.f244366b;
                cu8.r0 r0VarA = kVar2.f246531a.a();
                rh8.a aVar8 = (rh8.a) kVar2.f246532b.f246515l.get();
                vc.s.j(aVar8);
                uxj.a aVarA6 = kVar2.f246533c.a();
                kbb.c cVarF = kVar2.d.f();
                zja.a aVarA7 = ((ika.b) kVar2.e).a();
                vc.s.j(aVarA7);
                lh8.c cVar7 = (lh8.c) kVar2.f.f246505s.get();
                vc.s.j(cVar7);
                return new com.revolut.feature.junior_onboarding.impl.ui.onboarding.b(juniorOnboardingFlowContract$InputData, r0VarA, aVar8, aVarA6, cVarF, aVarA7, cVar7);
            case 16:
                qh8.k kVar3 = (qh8.k) this.f244366b;
                kbb.c cVarF2 = kVar3.d.f();
                ang.f fVarE2 = kVar3.f246537l.e();
                qh8.k kVar4 = ((qh8.m) this.f244367c).f246543a;
                l80.e eVarH = kVar4.i.h();
                vc.s.j(eVarH);
                ei8.i iVar3 = new ei8.i(eVarH);
                hj8.a aVarA8 = kVar3.k.a();
                vc.s.j(aVarA8);
                qh8.b bVar6 = kVar3.f;
                vh8.c cVar8 = new vh8.c(bVar6.d.e());
                rh8.l lVar = (rh8.l) bVar6.f246501n.get();
                vc.s.j(lVar);
                l80.e eVarH2 = kVar4.i.h();
                vc.s.j(eVarH2);
                ei8.i dataInputValidator = new ei8.i(eVarH2);
                Intrinsics.checkNotNullParameter(dataInputValidator, "dataInputValidator");
                return new com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.c(cVarF2, fVarE2, iVar3, aVarA8, cVar8, lVar, new ni8.c());
            case 17:
                return new com.revolut.feature.insurance_car.impl.ui.flow.upload_documents.b(((k1) this.f244367c).f247368a, (ll7.v) ((ql7.k0) this.f244366b).f247365w.get());
            case 18:
                qth.a aVar9 = (qth.a) this.f244367c;
                kth.a aVar10 = new kth.a();
                AlternativeDocumentsControllerContract$InputData alternativeDocumentsControllerContract$InputData = aVar9.f249117a;
                ith.l lVar2 = new ith.l(aVar10, alternativeDocumentsControllerContract$InputData);
                f80.a aVarX2 = ((qth.g) this.f244366b).f249136h.x();
                vc.s.j(aVarX2);
                return new ith.j(lVar2, alternativeDocumentsControllerContract$InputData, aVarX2);
            case 19:
                qth.e eVar = (qth.e) this.f244367c;
                yxc.l iconUiMapper = eVar.f249127b.f249140n.a();
                vc.s.j(iconUiMapper);
                Intrinsics.checkNotNullParameter(iconUiMapper, "iconUiMapper");
                wth.m mVar = new wth.m();
                jvh.a aVarA9 = ((qth.g) this.f244366b).f249134c.a();
                vc.s.j(aVarA9);
                return new com.revolut.feature.workflow.engine.product_closures.screen.a(mVar, aVarA9, eVar.f249126a);
            case 20:
                BrazilStoredMethodDetailsDescriptor$InputData brazilStoredMethodDetailsDescriptor$InputData = ((qve.c) this.f244367c).f249579a;
                qve.k kVar5 = (qve.k) this.f244366b;
                sve.a aVar11 = (sve.a) kVar5.c0.get();
                uxe.a aVar12 = new uxe.a();
                u51.a aVarA10 = kVar5.e.a();
                vc.s.j(aVarA10);
                return new com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil.a(brazilStoredMethodDetailsDescriptor$InputData, aVar11, aVar12, aVarA10);
            case 21:
                qve.d dVar3 = (qve.d) this.f244367c;
                je6.g gVar = dVar3.f249583b.f;
                ne6.b bVar7 = (ne6.b) ((xf6.t) gVar).D0.get();
                vc.s.j(bVar7);
                je6.h hVarC = ((xf6.t) gVar).c();
                vc.s.j(hVarC);
                return new com.revolut.feature.topup_screen.impl.flows.stored_method.screen.brazil.b(new uxe.q(bVar7, hVarC), dVar3.f249582a, (sve.a) ((qve.k) this.f244366b).c0.get());
            case 22:
                IdealTopUpFlowContract$InputData idealTopUpFlowContract$InputData = ((qve.g) this.f244367c).f249591a;
                y51.a aVarA11 = ((qve.k) this.f244366b).f249604b.a();
                vc.s.j(aVarA11);
                return new com.revolut.feature.topup_screen.impl.flows.topup_flows.ideal.c(idealTopUpFlowContract$InputData, aVarA11);
            case 23:
                McyTopupAccountVerificationScreenContract$InputData mcyTopupAccountVerificationScreenContract$InputData = ((qve.l) this.f244367c).f249623a;
                qve.k kVar6 = (qve.k) this.f244366b;
                d3j.b bVarE2 = ((b3j.p) kVar6.f249619t).e();
                ove.t tVar = kVar6.f249604b;
                vte.a aVarC = tVar.c();
                vc.s.j(aVarC);
                return new com.revolut.feature.topup_screen.impl.mcy.account_verification.c(mcyTopupAccountVerificationScreenContract$InputData, bVarE2, aVarC, new j0f.a(), new j0f.b(), tVar.b(), new h0f.o());
            case 24:
                sxe.c cVar9 = ((qve.q) this.f244367c).f249648a;
                wxe.i0 i0Var8 = new wxe.i0();
                wxe.a aVar13 = new wxe.a();
                qve.k kVar7 = (qve.k) this.f244366b;
                u51.a aVarA12 = kVar7.e.a();
                vc.s.j(aVarA12);
                je6.g gVar2 = kVar7.f;
                xg6.l lVarD = ((xf6.t) gVar2).d();
                vc.s.j(lVarD);
                com.revolut.feature.external_accounts.api.navigation.a aVarB3 = ((xf6.t) gVar2).b();
                vc.s.j(aVarB3);
                gte.a aVarB4 = kVar7.k.b();
                vc.s.j(aVarB4);
                return new com.revolut.feature.topup_screen.impl.flows.stored_method.flow.b(cVar9, i0Var8, aVar13, aVarA12, lVarD, aVarB3, aVarB4);
            case 25:
                qve.r rVar = (qve.r) this.f244367c;
                dze.d dVar4 = rVar.f249650a;
                qve.k kVar8 = rVar.f249651b;
                y51.a aVarA13 = kVar8.f249604b.a();
                vc.s.j(aVarA13);
                sf0.h hVarB = kVar8.f249615p.b();
                vc.s.j(hVarB);
                c0f.d dVar5 = new c0f.d(aVarA13, hVarB);
                wwh.a aVarB5 = ((qve.k) this.f244366b).f249616q.b();
                vc.s.j(aVarB5);
                return new com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c(dVar4, dVar5, aVarB5);
            case 26:
                u36.l lVar3 = new u36.l(((r36.a) this.f244367c).f251152a.o.g());
                r36.e eVar2 = (r36.e) this.f244366b;
                o36.b bVar8 = (o36.b) eVar2.B.get();
                xv5.c cVarA = eVar2.f251168g.a();
                vc.s.j(cVarA);
                return new com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.asset_picker.a(lVar3, new rul.e(bVar8, cVarA), new u36.a());
            case 27:
                ContactsPickerFlowContract$InputData contactsPickerFlowContract$InputData = ((r6e.e) this.f244367c).f251725a;
                r6e.o oVar2 = (r6e.o) this.f244366b;
                ln3.b bVar9 = new ln3.b();
                xmg.a aVar14 = oVar2.f;
                ang.f fVarE3 = aVar14.e();
                mre.c cVarB = oVar2.f251776j.b();
                vc.s.j(cVarB);
                l61.a aVarB6 = aVar14.b();
                vc.s.j(aVarB6);
                return new com.revolut.feature.subaccount.impl.ui.create.flow.group.c(contactsPickerFlowContract$InputData, bVar9, fVarE3, cVarB, aVarB6);
            case 28:
                InviteMembersFlowContract$InputData inviteMembersFlowContract$InputData = ((r6e.h) this.f244367c).f251737a;
                g6e.d dVarB2 = ((r6e.o) this.f244366b).f251773c.b();
                vc.s.j(dVarB2);
                return new com.revolut.feature.subaccount.impl.ui.edit.invite.flow.a(inviteMembersFlowContract$InputData, dVarB2);
            default:
                i8e.e eVar3 = new i8e.e();
                SubAccountEditNameContract$InputData subAccountEditNameContract$InputData = ((r6e.l) this.f244367c).f251763a;
                ppg.b bVarB = ((wpg.l) ((r6e.o) this.f244366b).i).b();
                vc.s.j(bVarB);
                return new i8e.k(eVar3, subAccountEditNameContract$InputData, bVarB);
        }
    }
}

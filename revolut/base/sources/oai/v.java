package oai;

import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.GooglePayConfirmationFlowContract$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferWrapperNavigation$InputData;
import com.revolut.feature.junior_transfer.impl.ui.add_money.JuniorAddMoneyFlowContract$InputData;
import com.revolut.feature.pay_later.impl.ui.right_to_cancel.flow.RightToCancelFlowContract$InputData;
import com.revolut.feature.pockets.impl.details_v2.mcy.PocketDetailsMcyFlowContract$InputData;
import com.revolut.feature.topup_screen.api.descriptor.FacadeCardTopupFlowDescriptor$InputData;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.cash_deposit.CashDepositTopupFlowContract$InputData;
import com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.StoredMethodTopUpFlowContract$InputData;
import com.revolut.feature.workflow.sso.impl.ui.flow.WorkflowSsoFlowContract$InputData;
import com.revolut.feature_retail_user_declarations.citizenship.SubmitCitizenshipFlowInputData;
import com.revolut.feature_retail_user_declarations.email.otp_screen.EmailVerificationOtpScreenContract$InputData;
import com.revolut.feature_retail_user_declarations.email.verification_screen.EmailVerificationPromptContract$InputData;
import com.revolut.feature_retail_user_declarations.occupation.screen.OccupationChooserScreenContract$InputData;
import com.revolut.feature_retail_user_declarations.purpose.PurposeOfAccountFlowInputData;
import com.revolut.feature_retail_user_declarations.purpose.screen.PurposeOfAccountScreenContract$InputData;
import com.revolut.feature_retail_user_declarations.risk_assessment.flow.RiskAssessmentFlowInputData;
import com.revolut.feature_retail_user_declarations.terms_review.TermsReviewInputData;
import com.revolut.feature_retail_user_declarations.terms_review.screen.ReadTermsControllerContract$InputData;
import com.revolut.feature_retail_user_declarations.transaction_countries.TransactionCountriesInputData;
import fci.y0;
import kl.t1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class v implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f223779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qji.b f223780c;

    public /* synthetic */ v(Object obj2, qji.b bVar, int i) {
        this.f223778a = i;
        this.f223779b = obj2;
        this.f223780c = bVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f223778a) {
            case 0:
                w wVar = (w) this.f223780c;
                ubi.i iVar = new ubi.i();
                OccupationChooserScreenContract$InputData occupationChooserScreenContract$InputData = wVar.f223781a;
                return new ubi.l(new qee.s(iVar, occupationChooserScreenContract$InputData), occupationChooserScreenContract$InputData, ((i0) this.f223779b).e.e());
            case 1:
                PurposeOfAccountFlowInputData purposeOfAccountFlowInputData = ((y) this.f223780c).f223786a;
                i0 i0Var = (i0) this.f223779b;
                gte.a aVarB = i0Var.d.b();
                vc.s.j(aVarB);
                return new com.revolut.feature_retail_user_declarations.purpose.flow.a(purposeOfAccountFlowInputData, aVarB, (bci.d) i0Var.v.get());
            case 2:
                z zVar = (z) this.f223780c;
                PurposeOfAccountScreenContract$InputData purposeOfAccountScreenContract$InputData = zVar.f223789a;
                fci.b bVar = new fci.b(purposeOfAccountScreenContract$InputData, (dci.b) zVar.f223790b.f223714x.get());
                PurposeOfAccountScreenContract$InputData purposeOfAccountScreenContract$InputData2 = zVar.f223789a;
                i0 i0Var2 = (i0) this.f223779b;
                return new fci.o(bVar, purposeOfAccountScreenContract$InputData2, (aci.a) i0Var2.u.get(), i0Var2.e.e(), new zjh.j(purposeOfAccountScreenContract$InputData));
            case 3:
                a0 a0Var = (a0) this.f223780c;
                return new y0(new fci.g0((f01.a) a0Var.f223658b.z.get()), a0Var.f223657a, (eci.b) ((i0) this.f223779b).f223712t.get());
            case 4:
                ReadTermsControllerContract$InputData readTermsControllerContract$InputData = ((b0) this.f223780c).f223663a;
                nci.s sVar = new nci.s();
                i0 i0Var3 = (i0) this.f223779b;
                pre.c cVarA = i0Var3.f223705l.a();
                vc.s.j(cVarA);
                return new nci.r(readTermsControllerContract$InputData, sVar, cVarA, ((nj0.d) i0Var3.f223706m).j());
            case 5:
                RiskAssessmentFlowInputData riskAssessmentFlowInputData = ((c0) this.f223780c).f223668a;
                jvh.a aVarA = ((i0) this.f223779b).f.a();
                vc.s.j(aVarA);
                return new com.revolut.feature_retail_user_declarations.risk_assessment.flow.a(riskAssessmentFlowInputData, aVarA);
            case 6:
                SubmitCitizenshipFlowInputData submitCitizenshipFlowInputData = ((e0) this.f223780c).f223677a;
                i0 i0Var4 = (i0) this.f223779b;
                jvh.a aVarA2 = i0Var4.f.a();
                vc.s.j(aVarA2);
                ot8.a aVar = (ot8.a) i0Var4.f223702g.f218990q.get();
                vc.s.j(aVar);
                return new com.revolut.feature_retail_user_declarations.citizenship.submit_citizenship.a(submitCitizenshipFlowInputData, aVarA2, aVar);
            case 7:
                TermsReviewInputData termsReviewInputData = ((f0) this.f223780c).f223682a;
                jvh.a aVarA3 = ((i0) this.f223779b).f.a();
                vc.s.j(aVarA3);
                return new com.revolut.feature_retail_user_declarations.terms_review.flow.a(termsReviewInputData, aVarA3);
            case 8:
                TransactionCountriesInputData transactionCountriesInputData = ((g0) this.f223780c).f223688a;
                jvh.a aVarA4 = ((i0) this.f223779b).f.a();
                vc.s.j(aVarA4);
                return new com.revolut.feature_retail_user_declarations.transaction_countries.flow.a(transactionCountriesInputData, aVarA4);
            case 9:
                EmailVerificationOtpScreenContract$InputData emailVerificationOtpScreenContract$InputData = ((m0) this.f223780c).f223739b;
                i0 i0Var5 = (i0) this.f223779b;
                return new sai.k(emailVerificationOtpScreenContract$InputData, (pai.a) i0Var5.B.get(), new pai.f(), (vai.c) i0Var5.A.get(), new rai.a(), (xai.a) i0Var5.f223715y.get(), new sai.l());
            case 10:
                EmailVerificationOtpScreenContract$InputData emailVerificationOtpScreenContract$InputData2 = ((m0) this.f223780c).f223739b;
                i0 i0Var6 = (i0) this.f223779b;
                return new sai.k(emailVerificationOtpScreenContract$InputData2, (pai.a) i0Var6.B.get(), new pai.f(), (vai.c) i0Var6.A.get(), new rai.a(), (xai.a) i0Var6.f223715y.get(), new sai.l());
            case 11:
                q0 q0Var = (q0) this.f223780c;
                EmailVerificationPromptContract$InputData emailVerificationPromptContract$InputData = q0Var.f223762b;
                rai.a aVar2 = new rai.a();
                i0 i0Var7 = (i0) this.f223779b;
                return new com.revolut.feature_retail_user_declarations.email.verification_screen.a(emailVerificationPromptContract$InputData, aVar2, (vai.c) i0Var7.A.get(), (pai.a) i0Var7.B.get(), (xai.a) i0Var7.f223715y.get(), new pai.f(), new abi.q(q0Var.f223762b));
            case 12:
                q0 q0Var2 = (q0) this.f223780c;
                EmailVerificationPromptContract$InputData emailVerificationPromptContract$InputData2 = q0Var2.f223762b;
                rai.a aVar3 = new rai.a();
                i0 i0Var8 = (i0) this.f223779b;
                return new com.revolut.feature_retail_user_declarations.email.verification_screen.a(emailVerificationPromptContract$InputData2, aVar3, (vai.c) i0Var8.A.get(), (pai.a) i0Var8.B.get(), (xai.a) i0Var8.f223715y.get(), new pai.f(), new abi.q(q0Var2.f223762b));
            case 13:
                return new com.revolut.feature.pockets.impl.details_v2.pocket_details.multi_iban.a(((oda.h) this.f223780c).f224361a, (uea.f) ((oda.o) this.f223779b).T.get());
            case 14:
                PocketDetailsMcyFlowContract$InputData pocketDetailsMcyFlowContract$InputData = ((oda.j) this.f223780c).f224366a;
                oda.o oVar = (oda.o) this.f223779b;
                return new com.revolut.feature.pockets.impl.details_v2.mcy.b(pocketDetailsMcyFlowContract$InputData, (uea.f) oVar.T.get(), ((s99.a) oVar.f224406q).b());
            case 15:
                GooglePayConfirmationFlowContract$InputData googlePayConfirmationFlowContract$InputData = ((og1.e) this.f223780c).f224966a;
                ih1.a googlePayIntentProvider = new ih1.a();
                ih1.e samsungWalletIntentProvider = new ih1.e();
                Intrinsics.checkNotNullParameter(googlePayIntentProvider, "googlePayIntentProvider");
                Intrinsics.checkNotNullParameter(samsungWalletIntentProvider, "samsungWalletIntentProvider");
                return new com.revolut.feature.add_card_to_google_pay_shared.impl.verification.a(googlePayConfirmationFlowContract$InputData, new ih1.d(), new mw2.g(), (ug1.a) ((og1.i) this.f223779b).f224982h.get());
            case 16:
                rgi.n nVar = new rgi.n();
                ogi.b bVar2 = (ogi.b) this.f223780c;
                return new rgi.m(nVar, new rgi.b(e4m.b.a(bVar2.f225157b.d)), ((s41.a) ((ogi.a) this.f223779b).f225154b).d(), bVar2.f225156a);
            case 17:
                return new com.revolut.feature.pay_later.impl.ui.paymentoptions.options.a(((oi9.r) this.f223780c).f225559a, new zj9.j(), (xh9.a) ((oi9.f) this.f223779b).E.get());
            case 18:
                RightToCancelFlowContract$InputData rightToCancelFlowContract$InputData = ((oi9.w) this.f223780c).f225578a;
                wj0.a aVarI = ((nj0.d) ((oi9.f) this.f223779b).e).i();
                vc.s.j(aVarI);
                return new com.revolut.feature.pay_later.impl.ui.right_to_cancel.flow.a(rightToCancelFlowContract$InputData, aVarI);
            case 19:
                JuniorAddMoneyFlowContract$InputData juniorAddMoneyFlowContract$InputData = ((oq8.b) this.f223780c).f227766a;
                oq8.f fVar = (oq8.f) this.f223779b;
                usg.a aVar4 = fVar.f;
                wsg.b bVarA = aVar4.a();
                wsg.n nVarB = aVar4.b();
                hj8.a aVarA5 = fVar.f227787g.a();
                vc.s.j(aVarA5);
                return new com.revolut.feature.junior_transfer.impl.ui.add_money.c(juniorAddMoneyFlowContract$InputData, bVarA, nVarB, aVarA5, new zq8.a());
            case 20:
                ar8.c cVar = ((oq8.c) this.f223780c).f227768a;
                jq8.a aVar5 = ((oq8.f) this.f223779b).e;
                ogm.i iVar2 = new ogm.i((wq8.c) ((oq8.a) aVar5).o.get());
                ou5.b bVarB = ((oq8.a) aVar5).b();
                pq8.a aVar6 = (pq8.a) ((oq8.a) aVar5).f227765p.get();
                vc.s.j(aVar6);
                return new com.revolut.feature.junior_transfer.impl.ui.flow.block_transfer.a(cVar, iVar2, bVarB, aVar6);
            case 21:
                CashDepositTopupFlowContract$InputData cashDepositTopupFlowContract$InputData = ((ove.k) this.f223780c).f230088a;
                ove.t tVar = (ove.t) this.f223779b;
                t1 t1VarB = tVar.f230141x.b();
                w39.b bVarA2 = tVar.f230142y.a();
                vc.s.j(bVarA2);
                return new kze.i(cashDepositTopupFlowContract$InputData, t1VarB, bVarA2, new nb3.c());
            case 22:
                FacadeCardTopupFlowDescriptor$InputData facadeCardTopupFlowDescriptor$InputData = ((ove.m) this.f223780c).f230094a;
                ove.t tVar2 = (ove.t) this.f223779b;
                xoj.a aVarA6 = tVar2.f230139t.a();
                vc.s.j(aVarA6);
                return new jze.b(facadeCardTopupFlowDescriptor$InputData, aVarA6, (y51.a) tVar2.U.get());
            case 23:
                ove.o oVar2 = (ove.o) this.f223780c;
                gwe.c cVar2 = oVar2.f230103a;
                ove.t tVar3 = oVar2.f230104b;
                vte.a aVar7 = (vte.a) tVar3.X.get();
                wsg.n nVarB2 = tVar3.f230125g.b();
                xoj.a aVarA7 = tVar3.f230139t.a();
                vc.s.j(aVarA7);
                fk3.a aVarA8 = tVar3.f230136q.a();
                vc.s.j(aVarA8);
                n8b.a aVarA9 = tVar3.E.a();
                vc.s.j(aVarA9);
                return new com.revolut.feature.topup_screen.impl.flow.init_top_up.a(cVar2, new e0f.t0(aVar7, nVarB2, aVarA7, aVarA8, aVarA9), new owe.b(), new owe.e(), ((ove.t) this.f223779b).F.a());
            case 24:
                rxe.c cVar3 = ((ove.q) this.f223780c).f230112a;
                ove.t tVar4 = (ove.t) this.f223779b;
                fve.a aVar8 = (fve.a) tVar4.q0.get();
                wj0.a aVarI2 = ((nj0.d) tVar4.f230132n).i();
                vc.s.j(aVarI2);
                return new rxe.f(cVar3, aVar8, aVarI2);
            case 25:
                StoredMethodTopUpFlowContract$InputData storedMethodTopUpFlowContract$InputData = ((ove.r) this.f223780c).f230114a;
                ove.t tVar5 = (ove.t) this.f223779b;
                f80.a aVarX = tVar5.o.x();
                vc.s.j(aVarX);
                fk3.a aVarA10 = tVar5.f230136q.a();
                vc.s.j(aVarA10);
                oe6.a aVarA11 = tVar5.u.a();
                vc.s.j(aVarA11);
                rve.i iVar3 = (rve.i) tVar5.f230121b0.get();
                gte.a aVarB2 = tVar5.f230131m.b();
                vc.s.j(aVarB2);
                return new com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a(storedMethodTopUpFlowContract$InputData, aVarX, aVarA10, aVarA11, iVar3, aVarB2, tVar5.f230125g.b(), tVar5.F.a());
            case 26:
                WorkflowSsoFlowContract$InputData workflowSsoFlowContract$InputData = ((ovh.b) this.f223780c).f230227a;
                jvh.a aVarA12 = ((ovh.a) this.f223779b).f230225a.a();
                vc.s.j(aVarA12);
                return new qvh.g(workflowSsoFlowContract$InputData, aVarA12, new qvh.h());
            case 27:
                return new com.revolut.feature.payments.profile.impl.ui_kompot.lazy_flow.b(((ow9.g) this.f223780c).f230375a, ((ow9.e) this.f223779b).f230343c.e());
            case 28:
                return new k22.f(((p12.w) this.f223780c).f231808a, ((p12.v) this.f223779b).f231778b.a());
            default:
                ApmTransferWrapperNavigation$InputData apmTransferWrapperNavigation$InputData = ((p12.m0) this.f223780c).f231727a;
                p12.v vVar = (p12.v) this.f223779b;
                lx1.d dVarB = ((ey1.e) vVar.f).b();
                vc.s.j(dVarB);
                gte.a aVarB3 = vVar.f231777a.b();
                vc.s.j(aVarB3);
                wj0.a aVarI3 = ((nj0.d) vVar.f231784m).i();
                vc.s.j(aVarI3);
                return new k52.e(apmTransferWrapperNavigation$InputData, dVarB, aVarB3, aVarI3);
        }
    }
}

package dw3;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.confirmation_code.ui.otp.ESignOtpScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_insurance_offer.CreditInsuranceOfferFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.DirectDebitContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.failed.DirectDebitFailedContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_remediation.DocumentsRemediationFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_upload_plugin.DocumentsUploadPluginFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.flow.DownPaymentSourceFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.email_verification.EmailVerificationFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.emergency_payment.flow.EmergencyPaymentFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.esign.ESignatureFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.flow.ExpiredApplicationLazyFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.flow.ExpiredApplicationRootFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.failure.flow.FailureRootFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.flow.FamilyCreditCardSettingsFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.FinancialEvidenceFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.invitation.popup.DeclineInvitationPopupScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.CreditLinkedAccountsV2FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.CreditLinkedAccountsV3FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.plan_selection.CreditPlanSelectionFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.workflow.CreditWorkflowContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f118852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f118853c;
    public final Object d;

    public /* synthetic */ h1(Object obj2, Object obj3, int i, int i2) {
        this.f118851a = i2;
        this.f118852b = obj2;
        this.d = obj3;
        this.f118853c = i;
    }

    private final Object a() {
        c1 c1Var = (c1) this.f118852b;
        g2 g2Var = (g2) this.d;
        int i = this.f118853c;
        switch (i) {
            case 0:
                return ige.d.h(g2Var.f118791a, (j60.a) g2Var.f118794g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(g2Var.f118791a, (com.revolut.kompot.navigable.a) g2Var.e.get(), (rp0.m) g2Var.f.get());
            case 2:
                iq3.a aVar = g2Var.f118791a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) g2Var.f118801q.get());
            case 4:
                return new c84.z((c84.g) g2Var.f118800p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) g2Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) g2Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) g2Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) g2Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) g2Var.i.get();
                c1 c1Var2 = g2Var.f118793c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) g2Var.f118796j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) g2Var.f118796j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) g2Var.f118799n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) g2Var.f118797l.get(), li4.e.class, (li4.b) g2Var.f118798m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) g2Var.f118801q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) g2Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                DirectDebitFailedContract$InputData directDebitFailedContract$InputData = g2Var.f118792b;
                hw3.c cVar3 = (hw3.c) c1Var.f118472s0.get();
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) g2Var.i.get();
                c84.g gVar = (c84.g) g2Var.f118800p.get();
                xa4.a aVar3 = (xa4.a) g2Var.k.get();
                c1 c1Var3 = g2Var.f118793c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new s94.b(directDebitFailedContract$InputData, cVar3, e5f.b.w(pluginFlowContract$Input4, gVar, aVar3, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        c1 c1Var = (c1) this.f118852b;
        h2 h2Var = (h2) this.d;
        int i = this.f118853c;
        switch (i) {
            case 0:
                return ige.d.h(h2Var.f118854a, (j60.a) h2Var.f118857g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(h2Var.f118854a, (com.revolut.kompot.navigable.a) h2Var.e.get(), (rp0.m) h2Var.f.get());
            case 2:
                iq3.a aVar = h2Var.f118854a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) h2Var.f118864q.get());
            case 4:
                return new c84.z((c84.g) h2Var.f118863p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) h2Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) h2Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) h2Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) h2Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) h2Var.i.get();
                c1 c1Var2 = h2Var.f118856c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) h2Var.f118859j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) h2Var.f118859j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) h2Var.f118862n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) h2Var.f118860l.get(), li4.e.class, (li4.b) h2Var.f118861m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) h2Var.f118864q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) h2Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                DirectDebitContract$InputData directDebitContract$InputData = h2Var.f118855b;
                hw3.c cVar3 = (hw3.c) c1Var.f118472s0.get();
                xy4.b bVar4 = new xy4.b();
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) h2Var.i.get();
                c84.g gVar = (c84.g) h2Var.f118863p.get();
                xa4.a aVar3 = (xa4.a) h2Var.k.get();
                c1 c1Var3 = h2Var.f118856c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.a(directDebitContract$InputData, cVar3, bVar4, e5f.b.w(pluginFlowContract$Input4, gVar, aVar3, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            case 15:
                return new t94.a();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        i2 i2Var = (i2) this.d;
        int i = this.f118853c;
        if (i == 0) {
            return e5f.b.d((com.revolut.kompot.navigable.a) i2Var.f118946b.get(), (c84.b) i2Var.d.get(), (PluginFlowContract$Input) ((b4) this.f118852b).i.get());
        }
        if (i == 1) {
            return new c84.b();
        }
        if (i == 2) {
            return new td4.k(new zd4.b(), (jki.p) i2Var.f118948g.get(), i2Var.f118945a);
        }
        if (i == 3) {
            return new td4.m();
        }
        throw new AssertionError(i);
    }

    private final Object d() {
        c1 c1Var = (c1) this.f118852b;
        k2 k2Var = (k2) this.d;
        int i = this.f118853c;
        switch (i) {
            case 0:
                return ige.d.h(k2Var.f119082a, (j60.a) k2Var.f119085g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(k2Var.f119082a, (com.revolut.kompot.navigable.a) k2Var.e.get(), (rp0.m) k2Var.f.get());
            case 2:
                iq3.a aVar = k2Var.f119082a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) k2Var.f119092q.get());
            case 4:
                return new c84.z((c84.g) k2Var.f119091p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) k2Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) k2Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) k2Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) k2Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) k2Var.i.get();
                c1 c1Var2 = k2Var.f119084c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) k2Var.f119087j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) k2Var.f119087j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) k2Var.f119090n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) k2Var.f119088l.get(), li4.e.class, (li4.b) k2Var.f119089m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) k2Var.f119092q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) k2Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                hw3.x xVar = (hw3.x) c1Var.f118492z2.get();
                ang.f fVarE = c1Var.k.e();
                DocumentsRemediationFlowContract$InputData documentsRemediationFlowContract$InputData = k2Var.f119083b;
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) k2Var.i.get();
                c84.g gVar = (c84.g) k2Var.f119091p.get();
                xa4.a aVar3 = (xa4.a) k2Var.k.get();
                c1 c1Var3 = k2Var.f119084c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.documents_remediation.a(xVar, fVarE, documentsRemediationFlowContract$InputData, e5f.b.w(pluginFlowContract$Input4, gVar, aVar3, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        c1 c1Var = (c1) this.f118852b;
        l2 l2Var = (l2) this.d;
        int i = this.f118853c;
        switch (i) {
            case 0:
                return ige.d.h(l2Var.f119172a, (j60.a) l2Var.f119175g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(l2Var.f119172a, (com.revolut.kompot.navigable.a) l2Var.e.get(), (rp0.m) l2Var.f.get());
            case 2:
                iq3.a aVar = l2Var.f119172a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) l2Var.f119182q.get());
            case 4:
                return new c84.z((c84.g) l2Var.f119181p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) l2Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) l2Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) l2Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) l2Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) l2Var.i.get();
                c1 c1Var2 = l2Var.f119174c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) l2Var.f119177j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) l2Var.f119177j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) l2Var.f119180n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) l2Var.f119178l.get(), li4.e.class, (li4.b) l2Var.f119179m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) l2Var.f119182q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) l2Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                return new com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.flow.a(l2Var.f119173b, (c84.g) l2Var.f119181p.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        c1 c1Var = (c1) this.f118852b;
        m2 m2Var = (m2) this.d;
        int i = this.f118853c;
        switch (i) {
            case 0:
                return ige.d.h(m2Var.f119247a, (j60.a) m2Var.f119250g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(m2Var.f119247a, (com.revolut.kompot.navigable.a) m2Var.e.get(), (rp0.m) m2Var.f.get());
            case 2:
                iq3.a aVar = m2Var.f119247a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) m2Var.f119257q.get());
            case 4:
                return new c84.z((c84.g) m2Var.f119256p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) m2Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) m2Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) m2Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) m2Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) m2Var.i.get();
                c1 c1Var2 = m2Var.f119249c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) m2Var.f119252j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) m2Var.f119252j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) m2Var.f119255n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) m2Var.f119253l.get(), li4.e.class, (li4.b) m2Var.f119254m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) m2Var.f119257q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) m2Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                jw3.a aVar3 = (jw3.a) c1Var.T2.get();
                ax3.a aVar4 = (ax3.a) c1Var.V2.get();
                DocumentsUploadPluginFlowContract$InputData documentsUploadPluginFlowContract$InputData = m2Var.f119248b;
                da4.g gVar = new da4.g();
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) m2Var.i.get();
                c84.g gVar2 = (c84.g) m2Var.f119256p.get();
                xa4.a aVar5 = (xa4.a) m2Var.k.get();
                c1 c1Var3 = m2Var.f119249c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.documents_upload_plugin.b(aVar3, aVar4, documentsUploadPluginFlowContract$InputData, gVar, e5f.b.w(pluginFlowContract$Input4, gVar2, aVar5, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object g() {
        c1 c1Var = (c1) this.f118852b;
        o2 o2Var = (o2) this.d;
        int i = this.f118853c;
        switch (i) {
            case 0:
                return ige.d.h(o2Var.f119409a, (j60.a) o2Var.f119412g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(o2Var.f119409a, (com.revolut.kompot.navigable.a) o2Var.e.get(), (rp0.m) o2Var.f.get());
            case 2:
                iq3.a aVar = o2Var.f119409a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) o2Var.f119419q.get());
            case 4:
                return new c84.z((c84.g) o2Var.f119418p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) o2Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) o2Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) o2Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) o2Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) o2Var.i.get();
                c1 c1Var2 = o2Var.f119411c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) o2Var.f119414j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) o2Var.f119414j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) o2Var.f119417n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) o2Var.f119415l.get(), li4.e.class, (li4.b) o2Var.f119416m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) o2Var.f119419q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) o2Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                DownPaymentSourceFlowContract$InputData downPaymentSourceFlowContract$InputData = o2Var.f119410b;
                o7.b bVarF = c1Var.f();
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) o2Var.i.get();
                c84.g gVar = (c84.g) o2Var.f119418p.get();
                xa4.a aVar3 = (xa4.a) o2Var.k.get();
                c1 c1Var3 = o2Var.f119411c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.flow.a(downPaymentSourceFlowContract$InputData, bVarF, e5f.b.w(pluginFlowContract$Input4, gVar, aVar3, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object h() {
        dd9.b bVar = (dd9.b) this.d;
        c1 c1Var = (c1) bVar.d;
        c1 c1Var2 = (c1) this.f118852b;
        ite.a aVar = c1Var2.f118423b;
        int i = this.f118853c;
        if (i != 0) {
            if (i == 1) {
                rpa.b bVarA = c1Var2.D.a();
                vc.s.j(bVarA);
                return new tk3.e(bVarA, new tk3.c());
            }
            if (i != 2) {
                throw new AssertionError(i);
            }
            ji0.a aVarG = c1Var2.E.g();
            vc.s.j(aVarG);
            tk3.c cVar = new tk3.c();
            gte.a aVarB = aVar.b();
            vc.s.j(aVarB);
            return new tk3.k(aVarG, cVar, aVarB);
        }
        ESignOtpScreenContract$InputData eSignOtpScreenContract$InputData = bVar.f113122b;
        pk3.a aVar2 = (pk3.a) c1Var2.f118429c1.get();
        ImmutableMap immutableMapOf = ImmutableMap.of(nk3.a.PUSH, (h1) bVar.e, nk3.a.SMS, (h1) bVar.f);
        nf0.a aVar3 = c1Var.f118440g;
        sf0.h hVarB = aVar3.b();
        vc.s.j(hVarB);
        qk3.c cVar2 = new qk3.c(hVarB);
        sf0.h hVarB2 = aVar3.b();
        vc.s.j(hVarB2);
        qk3.e eVar = new qk3.e(hVarB2);
        sf0.h hVarB3 = aVar3.b();
        vc.s.j(hVarB3);
        ImmutableSet immutableSetOf = ImmutableSet.of((qk3.g) cVar2, (qk3.g) eVar, new qk3.g(hVarB3));
        ESignOtpScreenContract$InputData eSignOtpScreenContract$InputData2 = bVar.f113122b;
        z80.b bVarS = c1Var.f118443h.s();
        vc.s.j(bVarS);
        rk3.p pVar = new rk3.p(eSignOtpScreenContract$InputData2, bVarS);
        gte.a aVarB2 = aVar.b();
        vc.s.j(aVarB2);
        return new com.revolut.feature.confirmation_code.ui.otp.a(eSignOtpScreenContract$InputData, aVar2, immutableMapOf, immutableSetOf, pVar, aVarB2);
    }

    private final Object i() {
        c1 c1Var = (c1) this.f118852b;
        s2 s2Var = (s2) this.d;
        int i = this.f118853c;
        switch (i) {
            case 0:
                return ige.d.h(s2Var.f119731a, (j60.a) s2Var.f119734g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(s2Var.f119731a, (com.revolut.kompot.navigable.a) s2Var.e.get(), (rp0.m) s2Var.f.get());
            case 2:
                iq3.a aVar = s2Var.f119731a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) s2Var.f119741q.get());
            case 4:
                return new c84.z((c84.g) s2Var.f119740p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) s2Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) s2Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) s2Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) s2Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) s2Var.i.get();
                c1 c1Var2 = s2Var.f119733c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) s2Var.f119736j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) s2Var.f119736j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) s2Var.f119739n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) s2Var.f119737l.get(), li4.e.class, (li4.b) s2Var.f119738m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) s2Var.f119741q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) s2Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                ESignatureFlowContract$InputData eSignatureFlowContract$InputData = s2Var.f119732b;
                ex3.a aVar3 = (ex3.a) c1Var.f118429c1.get();
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) s2Var.i.get();
                c84.g gVar = (c84.g) s2Var.f119740p.get();
                xa4.a aVar4 = (xa4.a) s2Var.k.get();
                c1 c1Var3 = s2Var.f119733c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.esign.a(eSignatureFlowContract$InputData, aVar3, e5f.b.w(pluginFlowContract$Input4, gVar, aVar4, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object j() {
        u2 u2Var = (u2) this.d;
        c1 c1Var = (c1) this.f118852b;
        int i = this.f118853c;
        switch (i) {
            case 0:
                return ige.d.h(u2Var.f119887a, (j60.a) u2Var.f119890g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(u2Var.f119887a, (com.revolut.kompot.navigable.a) u2Var.e.get(), (rp0.m) u2Var.f.get());
            case 2:
                iq3.a aVar = u2Var.f119887a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) u2Var.f119897q.get());
            case 4:
                return new c84.z((c84.g) u2Var.f119896p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) u2Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) u2Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) u2Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) u2Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) u2Var.i.get();
                c1 c1Var2 = u2Var.f119889c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) u2Var.f119892j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) u2Var.f119892j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) u2Var.f119895n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) u2Var.f119893l.get(), li4.e.class, (li4.b) u2Var.f119894m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) u2Var.f119897q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) u2Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                EmailVerificationFlowContract$InputData emailVerificationFlowContract$InputData = u2Var.f119888b;
                l70.e eVar2 = c1Var.f118443h;
                uq3.b bVar4 = c1Var.f118428c;
                l80.h hVarV = eVar2.v();
                vc.s.j(hVarV);
                ang.f fVarE = c1Var.k.e();
                hw3.k kVar = (hw3.k) c1Var.t2.get();
                xq3.k kVar2 = (xq3.k) bVar4.P.get();
                vc.s.j(kVar2);
                py3.e eVarI = c1Var.i();
                sp3.a aVarM2 = bVar4.m();
                vc.s.j(aVarM2);
                sf0.h hVarB = c1Var.f118440g.b();
                vc.s.j(hVarB);
                v60.e eVarA = c1Var.X.a();
                vc.s.j(eVarA);
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) u2Var.i.get();
                c84.g gVar = (c84.g) u2Var.f119896p.get();
                xa4.a aVar3 = (xa4.a) u2Var.k.get();
                c1 c1Var3 = u2Var.f119889c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.email_verification.c(emailVerificationFlowContract$InputData, hVarV, fVarE, kVar, kVar2, eVarI, aVarM2, hVarB, eVarA, e5f.b.w(pluginFlowContract$Input4, gVar, aVar3, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object k() {
        c1 c1Var = (c1) this.f118852b;
        v2 v2Var = (v2) this.d;
        int i = this.f118853c;
        switch (i) {
            case 0:
                return ige.d.h(v2Var.f119968a, (j60.a) v2Var.f119971g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(v2Var.f119968a, (com.revolut.kompot.navigable.a) v2Var.e.get(), (rp0.m) v2Var.f.get());
            case 2:
                iq3.a aVar = v2Var.f119968a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) v2Var.f119978q.get());
            case 4:
                return new c84.z((c84.g) v2Var.f119977p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) v2Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) v2Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) v2Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) v2Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) v2Var.i.get();
                c1 c1Var2 = v2Var.f119970c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) v2Var.f119973j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) v2Var.f119973j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) v2Var.f119976n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) v2Var.f119974l.get(), li4.e.class, (li4.b) v2Var.f119975m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) v2Var.f119978q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) v2Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                EmergencyPaymentFlowContract$InputData emergencyPaymentFlowContract$InputData = v2Var.f119969b;
                hw3.c cVar3 = (hw3.c) c1Var.f118472s0.get();
                dx3.a aVar3 = (dx3.a) v2Var.f119982w.get();
                zwc.a aVar4 = (zwc.a) c1Var.N.f.get();
                vc.s.j(aVar4);
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) v2Var.i.get();
                c84.g gVar = (c84.g) v2Var.f119977p.get();
                xa4.a aVar5 = (xa4.a) v2Var.k.get();
                c1 c1Var3 = v2Var.f119970c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new wa4.e(emergencyPaymentFlowContract$InputData, cVar3, aVar3, aVar4, e5f.b.w(pluginFlowContract$Input4, gVar, aVar5, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            case 15:
                EmergencyPaymentFlowContract$InputData inputData = v2Var.f119969b;
                ImmutableMap linkCardMap = ImmutableMap.of(ft3.j1.FIXED_TERM_CREDIT, (dx3.a) v2Var.u.get(), ft3.j1.CREDIT_CARD, (dx3.a) v2Var.v.get());
                va4.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Intrinsics.checkNotNullParameter(linkCardMap, "linkCardMap");
                dx3.a aVar6 = (dx3.a) zhm.r0.h(inputData.f67643c.d, linkCardMap);
                vc.s.k(aVar6);
                return aVar6;
            case 16:
                l35.b bVarN = c1Var.f118456n.n();
                vc.s.j(bVarN);
                return new dx3.a(bVarN);
            case 17:
                al4.n nVarS = c1Var.f118447j.s();
                vc.s.j(nVarS);
                return new dx3.a(nVarS);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object l() {
        w2 w2Var = (w2) this.d;
        int i = this.f118853c;
        if (i == 0) {
            return e5f.b.e((com.revolut.kompot.navigable.a) w2Var.f120054b.get(), (c84.b) w2Var.d.get(), (PluginFlowContract$Input) ((q) this.f118852b).f119544j.get());
        }
        if (i == 1) {
            return new c84.b();
        }
        if (i == 2) {
            return new kb4.f(new kb4.g(w2Var.f120053a));
        }
        throw new AssertionError(i);
    }

    private final Object m() {
        c1 c1Var = (c1) this.f118852b;
        x2 x2Var = (x2) this.d;
        int i = this.f118853c;
        switch (i) {
            case 0:
                return ige.d.h(x2Var.f120128a, (j60.a) x2Var.f120131g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(x2Var.f120128a, (com.revolut.kompot.navigable.a) x2Var.e.get(), (rp0.m) x2Var.f.get());
            case 2:
                iq3.a aVar = x2Var.f120128a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) x2Var.f120138q.get());
            case 4:
                return new c84.z((c84.g) x2Var.f120137p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) x2Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) x2Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) x2Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) x2Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) x2Var.i.get();
                c1 c1Var2 = x2Var.f120130c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) x2Var.f120133j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) x2Var.f120133j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) x2Var.f120136n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) x2Var.f120134l.get(), li4.e.class, (li4.b) x2Var.f120135m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) x2Var.f120138q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) x2Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                sb4.c cVar3 = (sb4.c) x2Var.u.get();
                FinancialEvidenceFlowContract$InputData financialEvidenceFlowContract$InputData = x2Var.f120129b;
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) x2Var.i.get();
                c84.g gVar = (c84.g) x2Var.f120137p.get();
                xa4.a aVar3 = (xa4.a) x2Var.k.get();
                c1 c1Var3 = x2Var.f120130c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.e(cVar3, financialEvidenceFlowContract$InputData, e5f.b.w(pluginFlowContract$Input4, gVar, aVar3, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            case 15:
                return new sb4.c((hx3.a) c1Var.J2.get(), (PluginFlowContract$Input) x2Var.i.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object n() {
        y2 y2Var = (y2) this.d;
        int i = this.f118853c;
        if (i == 0) {
            return e5f.b.e((com.revolut.kompot.navigable.a) y2Var.f120200b.get(), (c84.b) y2Var.d.get(), (PluginFlowContract$Input) ((x2) this.f118852b).i.get());
        }
        if (i == 1) {
            return new c84.b();
        }
        if (i == 2) {
            return new qb4.h(new qb4.i(y2Var.f120199a));
        }
        throw new AssertionError(i);
    }

    private final Object o() {
        c1 c1Var = (c1) this.f118852b;
        a3 a3Var = (a3) this.d;
        int i = this.f118853c;
        switch (i) {
            case 0:
                return ige.d.h(a3Var.f118249a, (j60.a) a3Var.f118252g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(a3Var.f118249a, (com.revolut.kompot.navigable.a) a3Var.e.get(), (rp0.m) a3Var.f.get());
            case 2:
                iq3.a aVar = a3Var.f118249a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) a3Var.f118259q.get());
            case 4:
                return new c84.z((c84.g) a3Var.f118258p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) a3Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) a3Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) a3Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) a3Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) a3Var.i.get();
                c1 c1Var2 = a3Var.f118251c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) a3Var.f118254j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) a3Var.f118254j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) a3Var.f118257n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) a3Var.f118255l.get(), li4.e.class, (li4.b) a3Var.f118256m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) a3Var.f118259q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) a3Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                ExpiredApplicationLazyFlowContract$InputData expiredApplicationLazyFlowContract$InputData = a3Var.f118250b;
                mri.w wVarA2 = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA2);
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) a3Var.i.get();
                c84.g gVar = (c84.g) a3Var.f118258p.get();
                xa4.a aVar3 = (xa4.a) a3Var.k.get();
                c1 c1Var3 = a3Var.f118251c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA3 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA3);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.flow.a(expiredApplicationLazyFlowContract$InputData, wVarA2, e5f.b.w(pluginFlowContract$Input4, gVar, aVar3, aVarB, cVarB, jVarD, wVarA3, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object p() {
        c1 c1Var = (c1) this.f118852b;
        b3 b3Var = (b3) this.d;
        int i = this.f118853c;
        switch (i) {
            case 0:
                return ige.d.h(b3Var.f118329a, (j60.a) b3Var.f118332g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(b3Var.f118329a, (com.revolut.kompot.navigable.a) b3Var.e.get(), (rp0.m) b3Var.f.get());
            case 2:
                iq3.a aVar = b3Var.f118329a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) b3Var.f118339q.get());
            case 4:
                return new c84.z((c84.g) b3Var.f118338p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) b3Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) b3Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) b3Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) b3Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) b3Var.i.get();
                c1 c1Var2 = b3Var.f118331c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) b3Var.f118334j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) b3Var.f118334j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) b3Var.f118337n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) b3Var.f118335l.get(), li4.e.class, (li4.b) b3Var.f118336m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) b3Var.f118339q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) b3Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                ExpiredApplicationRootFlowContract$InputData expiredApplicationRootFlowContract$InputData = b3Var.f118330b;
                mri.w wVarA2 = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA2);
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) b3Var.i.get();
                c84.g gVar = (c84.g) b3Var.f118338p.get();
                xa4.a aVar3 = (xa4.a) b3Var.k.get();
                c1 c1Var3 = b3Var.f118331c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA3 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA3);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.expired.popup.flow.b(expiredApplicationRootFlowContract$InputData, wVarA2, e5f.b.w(pluginFlowContract$Input4, gVar, aVar3, aVarB, cVarB, jVarD, wVarA3, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object q() {
        c1 c1Var = (c1) this.f118852b;
        d3 d3Var = (d3) this.d;
        int i = this.f118853c;
        switch (i) {
            case 0:
                return ige.d.h(d3Var.f118551a, (j60.a) d3Var.f118554g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(d3Var.f118551a, (com.revolut.kompot.navigable.a) d3Var.e.get(), (rp0.m) d3Var.f.get());
            case 2:
                iq3.a aVar = d3Var.f118551a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) d3Var.f118561q.get());
            case 4:
                return new c84.z((c84.g) d3Var.f118560p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) d3Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) d3Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) d3Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) d3Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) d3Var.i.get();
                c1 c1Var2 = d3Var.f118553c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) d3Var.f118556j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) d3Var.f118556j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) d3Var.f118559n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) d3Var.f118557l.get(), li4.e.class, (li4.b) d3Var.f118558m.get()));
            case 10:
                xq3.j jVarH3 = c1Var.f118428c.h();
                vc.s.j(jVarH3);
                return new li4.c(jVarH3);
            case 11:
                uq3.b bVar2 = c1Var.f118428c;
                uq3.b bVar3 = c1Var.f118428c;
                xq3.j jVarH4 = bVar2.h();
                vc.s.j(jVarH4);
                xq3.c cVarF = bVar3.f();
                vc.s.j(cVarF);
                sp3.a aVarM = bVar3.m();
                vc.s.j(aVarM);
                return new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
            case 12:
                c84.z zVar = (c84.z) d3Var.f118561q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) d3Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                FailureRootFlowContract$InputData failureRootFlowContract$InputData = d3Var.f118552b;
                hw3.c cVar3 = (hw3.c) c1Var.f118472s0.get();
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) d3Var.i.get();
                c84.g gVar = (c84.g) d3Var.f118560p.get();
                xa4.a aVar3 = (xa4.a) d3Var.k.get();
                c1 c1Var3 = d3Var.f118553c;
                gte.a aVarB = c1Var3.f118423b.b();
                vc.s.j(aVarB);
                hz3.c cVarB = c1Var3.b();
                xq3.j jVarD = c1Var3.f118428c.d();
                vc.s.j(jVarD);
                mri.w wVarA2 = ((ozl.a) c1Var3.u).a();
                vc.s.j(wVarA2);
                hy3.j jVar = (hy3.j) c1Var3.Q1.get();
                vie.i iVarB = c1Var3.z.b();
                vc.s.j(iVarB);
                return new com.revolut.feature.credit.application.plugins.impl.ui.failure.flow.a(failureRootFlowContract$InputData, cVar3, e5f.b.w(pluginFlowContract$Input4, gVar, aVar3, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    @Override // phm.a
    public final Object get() {
        Object zVar;
        Object iVar;
        Object bVar;
        Object zVar2;
        Object iVar2;
        Object bVar2;
        Object zVar3;
        Object fVar;
        switch (this.f118851a) {
            case 0:
                i1 i1Var = (i1) this.d;
                c1 c1Var = (c1) this.f118852b;
                int i = this.f118853c;
                if (i == 0) {
                    return com.revolut.data.database.models.openbanking.d.u(c1Var.f118443h, (com.revolut.kompot.navigable.a) i1Var.f118944c.get());
                }
                if (i == 1) {
                    lx4.a aVarE = c1Var.f118489y.e();
                    return new kx4.a(aVarE, com.revolut.data.database.models.openbanking.d.v(aVarE), ((s41.a) c1Var.f118485x).d());
                }
                if (i != 2) {
                    throw new AssertionError(i);
                }
                return new j84.j(new ac4.g(i1Var.f118942a, i1Var.f118943b.f118489y.c()), (cx4.a) i1Var.e.get());
            case 1:
                c1 c1Var2 = (c1) this.f118852b;
                k1 k1Var = (k1) this.d;
                int i2 = this.f118853c;
                switch (i2) {
                    case 0:
                        return ige.d.h(k1Var.f119068a, (j60.a) k1Var.f119071g.get());
                    case 1:
                        return com.revolut.data.database.models.openbanking.d.q(k1Var.f119068a, (com.revolut.kompot.navigable.a) k1Var.e.get(), (rp0.m) k1Var.f.get());
                    case 2:
                        iq3.a aVar = k1Var.f119068a;
                        return new rp0.m();
                    case 3:
                        return e5f.b.x((c84.z) k1Var.f119078q.get());
                    case 4:
                        return new c84.z((c84.g) k1Var.f119077p.get(), (rz3.c) c1Var2.f118470r1.get(), (PluginFlowContract$Input) k1Var.i.get());
                    case 5:
                        PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) k1Var.i.get();
                        e4m.e eVar = c1Var2.f118470r1;
                        uq3.b bVar3 = c1Var2.f118428c;
                        rz3.c cVar = (rz3.c) eVar.get();
                        xa4.a aVar2 = (xa4.a) k1Var.k.get();
                        xq3.j jVarH = bVar3.h();
                        vc.s.j(jVarH);
                        mri.w wVarA = ((ozl.a) c1Var2.u).a();
                        vc.s.j(wVarA);
                        ii4.o oVar = (ii4.o) k1Var.o.get();
                        aq3.a aVarE2 = bVar3.e();
                        vc.s.j(aVarE2);
                        return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE2);
                    case 6:
                        PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) k1Var.i.get();
                        c1 c1Var3 = k1Var.f119070c;
                        return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var3.i(), (ya4.f) k1Var.f119073j.get()), (ya4.g) new ya4.c(c1Var3.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) k1Var.f119073j.get()), new ya4.g(new py3.f())));
                    case 7:
                        rz3.c cVar2 = (rz3.c) c1Var2.f118470r1.get();
                        xq3.j jVarH2 = c1Var2.f118428c.h();
                        vc.s.j(jVarH2);
                        return new ya4.f(cVar2, jVarH2);
                    case 8:
                        return new ii4.z((li4.a) k1Var.f119076n.get());
                    case 9:
                        return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) k1Var.f119074l.get(), li4.e.class, (li4.b) k1Var.f119075m.get()));
                    case 10:
                        xq3.j jVarH3 = c1Var2.f118428c.h();
                        vc.s.j(jVarH3);
                        return new li4.c(jVarH3);
                    case 11:
                        uq3.b bVar4 = c1Var2.f118428c;
                        uq3.b bVar5 = c1Var2.f118428c;
                        xq3.j jVarH4 = bVar4.h();
                        vc.s.j(jVarH4);
                        xq3.c cVarF = bVar5.f();
                        vc.s.j(cVarF);
                        sp3.a aVarM = bVar5.m();
                        vc.s.j(aVarM);
                        return new ji4.b(jVarH4, cVarF, aVarM, c1Var2.i());
                    case 12:
                        c84.z zVar4 = (c84.z) k1Var.f119078q.get();
                        e5f.b.a(zVar4);
                        return zVar4;
                    case 13:
                        PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) k1Var.i.get();
                        xr3.y yVarK = c1Var2.f118428c.k();
                        vc.s.j(yVarK);
                        return new c84.c(pluginFlowContract$Input3, yVarK);
                    case 14:
                        CreditInsuranceOfferFlowContract$InputData creditInsuranceOfferFlowContract$InputData = k1Var.f119069b;
                        m84.d dVar = (m84.d) k1Var.u.get();
                        PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) k1Var.i.get();
                        c84.g gVar = (c84.g) k1Var.f119077p.get();
                        xa4.a aVar3 = (xa4.a) k1Var.k.get();
                        c1 c1Var4 = k1Var.f119070c;
                        gte.a aVarB = c1Var4.f118423b.b();
                        vc.s.j(aVarB);
                        hz3.c cVarB = c1Var4.b();
                        xq3.j jVarD = c1Var4.f118428c.d();
                        vc.s.j(jVarD);
                        mri.w wVarA2 = ((ozl.a) c1Var4.u).a();
                        vc.s.j(wVarA2);
                        hy3.j jVar = (hy3.j) c1Var4.Q1.get();
                        vie.i iVarB = c1Var4.z.b();
                        vc.s.j(iVarB);
                        return new com.revolut.feature.credit.application.plugins.impl.ui.credit_insurance_offer.a(creditInsuranceOfferFlowContract$InputData, dVar, e5f.b.w(pluginFlowContract$Input4, gVar, aVar3, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
                    case 15:
                        return new m84.d((b34.b) c1Var2.D2.get(), k1Var.f119069b);
                    default:
                        throw new AssertionError(i2);
                }
            case 2:
                c1 c1Var5 = (c1) this.f118852b;
                l1 l1Var = (l1) this.d;
                int i3 = this.f118853c;
                switch (i3) {
                    case 0:
                        return ige.d.h(l1Var.f119158a, (j60.a) l1Var.f119161g.get());
                    case 1:
                        return com.revolut.data.database.models.openbanking.d.q(l1Var.f119158a, (com.revolut.kompot.navigable.a) l1Var.e.get(), (rp0.m) l1Var.f.get());
                    case 2:
                        iq3.a aVar4 = l1Var.f119158a;
                        return new rp0.m();
                    case 3:
                        return e5f.b.x((c84.z) l1Var.f119168q.get());
                    case 4:
                        zVar = new c84.z((c84.g) l1Var.f119167p.get(), (rz3.c) c1Var5.f118470r1.get(), (PluginFlowContract$Input) l1Var.i.get());
                        return zVar;
                    case 5:
                        PluginFlowContract$Input pluginFlowContract$Input5 = (PluginFlowContract$Input) l1Var.i.get();
                        e4m.e eVar2 = c1Var5.f118470r1;
                        uq3.b bVar6 = c1Var5.f118428c;
                        rz3.c cVar3 = (rz3.c) eVar2.get();
                        xa4.a aVar5 = (xa4.a) l1Var.k.get();
                        xq3.j jVarH5 = bVar6.h();
                        vc.s.j(jVarH5);
                        mri.w wVarA3 = ((ozl.a) c1Var5.u).a();
                        vc.s.j(wVarA3);
                        ii4.o oVar2 = (ii4.o) l1Var.o.get();
                        aq3.a aVarE3 = bVar6.e();
                        vc.s.j(aVarE3);
                        iVar = new c84.i(pluginFlowContract$Input5, cVar3, aVar5, jVarH5, wVarA3, oVar2, aVarE3);
                        return iVar;
                    case 6:
                        PluginFlowContract$Input pluginFlowContract$Input6 = (PluginFlowContract$Input) l1Var.i.get();
                        c1 c1Var6 = l1Var.f119160c;
                        bVar = new xa4.b(pluginFlowContract$Input6, ImmutableSet.of((ya4.g) new ya4.c(c1Var6.i(), (ya4.f) l1Var.f119163j.get()), (ya4.g) new ya4.c(c1Var6.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) l1Var.f119163j.get()), new ya4.g(new py3.f())));
                        return bVar;
                    case 7:
                        rz3.c cVar4 = (rz3.c) c1Var5.f118470r1.get();
                        xq3.j jVarH6 = c1Var5.f118428c.h();
                        vc.s.j(jVarH6);
                        return new ya4.f(cVar4, jVarH6);
                    case 8:
                        bVar = new ii4.z((li4.a) l1Var.f119166n.get());
                        return bVar;
                    case 9:
                        bVar = new li4.a(ImmutableMap.of(li4.d.class, (li4.b) l1Var.f119164l.get(), li4.e.class, (li4.b) l1Var.f119165m.get()));
                        return bVar;
                    case 10:
                        xq3.j jVarH7 = c1Var5.f118428c.h();
                        vc.s.j(jVarH7);
                        return new li4.c(jVarH7);
                    case 11:
                        uq3.b bVar7 = c1Var5.f118428c;
                        uq3.b bVar8 = c1Var5.f118428c;
                        xq3.j jVarH8 = bVar7.h();
                        vc.s.j(jVarH8);
                        xq3.c cVarF2 = bVar8.f();
                        vc.s.j(cVarF2);
                        sp3.a aVarM2 = bVar8.m();
                        vc.s.j(aVarM2);
                        return new ji4.b(jVarH8, cVarF2, aVarM2, c1Var5.i());
                    case 12:
                        c84.z zVar5 = (c84.z) l1Var.f119168q.get();
                        e5f.b.a(zVar5);
                        return zVar5;
                    case 13:
                        PluginFlowContract$Input pluginFlowContract$Input7 = (PluginFlowContract$Input) l1Var.i.get();
                        xr3.y yVarK2 = c1Var5.f118428c.k();
                        vc.s.j(yVarK2);
                        zVar = new c84.c(pluginFlowContract$Input7, yVarK2);
                        return zVar;
                    case 14:
                        CreditLinkedAccountsV2FlowContract$InputData creditLinkedAccountsV2FlowContract$InputData = l1Var.f119159b;
                        c1 c1Var7 = l1Var.f119160c;
                        lx3.b bVar9 = (lx3.b) c1Var5.A1.get();
                        lx3.a aVar6 = (lx3.a) l1Var.u.get();
                        bd4.b bVar10 = new bd4.b(c1Var7.f118482w.g(), (lx3.b) c1Var7.A1.get());
                        id4.a aVar7 = new id4.a();
                        ow3.e eVar3 = (ow3.e) c1Var5.Y0.get();
                        PluginFlowContract$Input pluginFlowContract$Input8 = (PluginFlowContract$Input) l1Var.i.get();
                        c84.g gVar2 = (c84.g) l1Var.f119167p.get();
                        xa4.a aVar8 = (xa4.a) l1Var.k.get();
                        gte.a aVarB2 = c1Var7.f118423b.b();
                        vc.s.j(aVarB2);
                        hz3.c cVarB2 = c1Var7.b();
                        xq3.j jVarD2 = c1Var7.f118428c.d();
                        vc.s.j(jVarD2);
                        mri.w wVarA4 = ((ozl.a) c1Var7.u).a();
                        vc.s.j(wVarA4);
                        hy3.j jVar2 = (hy3.j) c1Var7.Q1.get();
                        vie.i iVarB2 = c1Var7.z.b();
                        vc.s.j(iVarB2);
                        iVar = new com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.d(creditLinkedAccountsV2FlowContract$InputData, bVar9, aVar6, bVar10, aVar7, eVar3, e5f.b.w(pluginFlowContract$Input8, gVar2, aVar8, aVarB2, cVarB2, jVarD2, wVarA4, jVar2, iVarB2));
                        return iVar;
                    case 15:
                        wsg.n nVarB = c1Var5.f118452l.b();
                        oe6.a aVarA = c1Var5.S.a();
                        vc.s.j(aVarA);
                        return new lx3.a(aVarA, nVarB);
                    default:
                        throw new AssertionError(i3);
                }
            case 3:
                c1 c1Var8 = (c1) this.f118852b;
                m1 m1Var = (m1) this.d;
                int i5 = this.f118853c;
                switch (i5) {
                    case 0:
                        return ige.d.h(m1Var.f119233a, (j60.a) m1Var.f119236g.get());
                    case 1:
                        return com.revolut.data.database.models.openbanking.d.q(m1Var.f119233a, (com.revolut.kompot.navigable.a) m1Var.e.get(), (rp0.m) m1Var.f.get());
                    case 2:
                        iq3.a aVar9 = m1Var.f119233a;
                        return new rp0.m();
                    case 3:
                        return e5f.b.x((c84.z) m1Var.f119243q.get());
                    case 4:
                        zVar2 = new c84.z((c84.g) m1Var.f119242p.get(), (rz3.c) c1Var8.f118470r1.get(), (PluginFlowContract$Input) m1Var.i.get());
                        return zVar2;
                    case 5:
                        PluginFlowContract$Input pluginFlowContract$Input9 = (PluginFlowContract$Input) m1Var.i.get();
                        e4m.e eVar4 = c1Var8.f118470r1;
                        uq3.b bVar11 = c1Var8.f118428c;
                        rz3.c cVar5 = (rz3.c) eVar4.get();
                        xa4.a aVar10 = (xa4.a) m1Var.k.get();
                        xq3.j jVarH9 = bVar11.h();
                        vc.s.j(jVarH9);
                        mri.w wVarA5 = ((ozl.a) c1Var8.u).a();
                        vc.s.j(wVarA5);
                        ii4.o oVar3 = (ii4.o) m1Var.o.get();
                        aq3.a aVarE4 = bVar11.e();
                        vc.s.j(aVarE4);
                        iVar2 = new c84.i(pluginFlowContract$Input9, cVar5, aVar10, jVarH9, wVarA5, oVar3, aVarE4);
                        return iVar2;
                    case 6:
                        PluginFlowContract$Input pluginFlowContract$Input10 = (PluginFlowContract$Input) m1Var.i.get();
                        c1 c1Var9 = m1Var.f119235c;
                        bVar2 = new xa4.b(pluginFlowContract$Input10, ImmutableSet.of((ya4.g) new ya4.c(c1Var9.i(), (ya4.f) m1Var.f119238j.get()), (ya4.g) new ya4.c(c1Var9.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) m1Var.f119238j.get()), new ya4.g(new py3.f())));
                        return bVar2;
                    case 7:
                        rz3.c cVar6 = (rz3.c) c1Var8.f118470r1.get();
                        xq3.j jVarH10 = c1Var8.f118428c.h();
                        vc.s.j(jVarH10);
                        return new ya4.f(cVar6, jVarH10);
                    case 8:
                        bVar2 = new ii4.z((li4.a) m1Var.f119241n.get());
                        return bVar2;
                    case 9:
                        bVar2 = new li4.a(ImmutableMap.of(li4.d.class, (li4.b) m1Var.f119239l.get(), li4.e.class, (li4.b) m1Var.f119240m.get()));
                        return bVar2;
                    case 10:
                        xq3.j jVarH11 = c1Var8.f118428c.h();
                        vc.s.j(jVarH11);
                        return new li4.c(jVarH11);
                    case 11:
                        uq3.b bVar12 = c1Var8.f118428c;
                        uq3.b bVar13 = c1Var8.f118428c;
                        xq3.j jVarH12 = bVar12.h();
                        vc.s.j(jVarH12);
                        xq3.c cVarF3 = bVar13.f();
                        vc.s.j(cVarF3);
                        sp3.a aVarM3 = bVar13.m();
                        vc.s.j(aVarM3);
                        return new ji4.b(jVarH12, cVarF3, aVarM3, c1Var8.i());
                    case 12:
                        c84.z zVar6 = (c84.z) m1Var.f119243q.get();
                        e5f.b.a(zVar6);
                        return zVar6;
                    case 13:
                        PluginFlowContract$Input pluginFlowContract$Input11 = (PluginFlowContract$Input) m1Var.i.get();
                        xr3.y yVarK3 = c1Var8.f118428c.k();
                        vc.s.j(yVarK3);
                        zVar2 = new c84.c(pluginFlowContract$Input11, yVarK3);
                        return zVar2;
                    case 14:
                        CreditLinkedAccountsV3FlowContract$InputData creditLinkedAccountsV3FlowContract$InputData = m1Var.f119234b;
                        c1 c1Var10 = m1Var.f119235c;
                        lx3.b bVar14 = (lx3.b) c1Var8.C1.get();
                        lx3.a aVar11 = (lx3.a) m1Var.u.get();
                        id4.a aVar12 = new id4.a();
                        gd4.c cVar7 = new gd4.c(c1Var10.f118482w.g(), (lx3.b) c1Var10.C1.get());
                        ow3.e eVar5 = (ow3.e) c1Var8.Y0.get();
                        PluginFlowContract$Input pluginFlowContract$Input12 = (PluginFlowContract$Input) m1Var.i.get();
                        c84.g gVar3 = (c84.g) m1Var.f119242p.get();
                        xa4.a aVar13 = (xa4.a) m1Var.k.get();
                        gte.a aVarB3 = c1Var10.f118423b.b();
                        vc.s.j(aVarB3);
                        hz3.c cVarB3 = c1Var10.b();
                        xq3.j jVarD3 = c1Var10.f118428c.d();
                        vc.s.j(jVarD3);
                        mri.w wVarA6 = ((ozl.a) c1Var10.u).a();
                        vc.s.j(wVarA6);
                        hy3.j jVar3 = (hy3.j) c1Var10.Q1.get();
                        vie.i iVarB3 = c1Var10.z.b();
                        vc.s.j(iVarB3);
                        iVar2 = new com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3.c(creditLinkedAccountsV3FlowContract$InputData, bVar14, aVar11, aVar12, cVar7, eVar5, e5f.b.w(pluginFlowContract$Input12, gVar3, aVar13, aVarB3, cVarB3, jVarD3, wVarA6, jVar3, iVarB3));
                        return iVar2;
                    case 15:
                        wsg.n nVarB2 = c1Var8.f118452l.b();
                        oe6.a aVarA2 = c1Var8.S.a();
                        vc.s.j(aVarA2);
                        return new lx3.a(aVarA2, nVarB2);
                    default:
                        throw new AssertionError(i5);
                }
            case 4:
                q4 q4Var = (q4) this.f118852b;
                n1 n1Var = (n1) this.d;
                int i6 = this.f118853c;
                if (i6 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) n1Var.f119323b.get(), (c84.b) n1Var.d.get(), (PluginFlowContract$Input) q4Var.i.get());
                }
                if (i6 == 1) {
                    return new c84.b();
                }
                if (i6 == 2) {
                    return new wf4.h((mf4.e) q4Var.f119582y.get(), (cli.n) n1Var.f119325g.get());
                }
                if (i6 == 3) {
                    return new wf4.i(n1Var.f119322a);
                }
                throw new AssertionError(i6);
            case 5:
                c1 c1Var11 = (c1) this.f118852b;
                o1 o1Var = (o1) this.d;
                int i21 = this.f118853c;
                switch (i21) {
                    case 0:
                        return ige.d.h(o1Var.f119395a, (j60.a) o1Var.f119398g.get());
                    case 1:
                        return com.revolut.data.database.models.openbanking.d.q(o1Var.f119395a, (com.revolut.kompot.navigable.a) o1Var.e.get(), (rp0.m) o1Var.f.get());
                    case 2:
                        iq3.a aVar14 = o1Var.f119395a;
                        return new rp0.m();
                    case 3:
                        return e5f.b.x((c84.z) o1Var.f119405q.get());
                    case 4:
                        return new c84.z((c84.g) o1Var.f119404p.get(), (rz3.c) c1Var11.f118470r1.get(), (PluginFlowContract$Input) o1Var.i.get());
                    case 5:
                        PluginFlowContract$Input pluginFlowContract$Input13 = (PluginFlowContract$Input) o1Var.i.get();
                        e4m.e eVar6 = c1Var11.f118470r1;
                        uq3.b bVar15 = c1Var11.f118428c;
                        rz3.c cVar8 = (rz3.c) eVar6.get();
                        xa4.a aVar15 = (xa4.a) o1Var.k.get();
                        xq3.j jVarH13 = bVar15.h();
                        vc.s.j(jVarH13);
                        mri.w wVarA7 = ((ozl.a) c1Var11.u).a();
                        vc.s.j(wVarA7);
                        ii4.o oVar4 = (ii4.o) o1Var.o.get();
                        aq3.a aVarE5 = bVar15.e();
                        vc.s.j(aVarE5);
                        return new c84.i(pluginFlowContract$Input13, cVar8, aVar15, jVarH13, wVarA7, oVar4, aVarE5);
                    case 6:
                        PluginFlowContract$Input pluginFlowContract$Input14 = (PluginFlowContract$Input) o1Var.i.get();
                        c1 c1Var12 = o1Var.f119397c;
                        return new xa4.b(pluginFlowContract$Input14, ImmutableSet.of((ya4.g) new ya4.c(c1Var12.i(), (ya4.f) o1Var.f119400j.get()), (ya4.g) new ya4.c(c1Var12.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) o1Var.f119400j.get()), new ya4.g(new py3.f())));
                    case 7:
                        rz3.c cVar9 = (rz3.c) c1Var11.f118470r1.get();
                        xq3.j jVarH14 = c1Var11.f118428c.h();
                        vc.s.j(jVarH14);
                        return new ya4.f(cVar9, jVarH14);
                    case 8:
                        return new ii4.z((li4.a) o1Var.f119403n.get());
                    case 9:
                        return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) o1Var.f119401l.get(), li4.e.class, (li4.b) o1Var.f119402m.get()));
                    case 10:
                        xq3.j jVarH15 = c1Var11.f118428c.h();
                        vc.s.j(jVarH15);
                        return new li4.c(jVarH15);
                    case 11:
                        uq3.b bVar16 = c1Var11.f118428c;
                        uq3.b bVar17 = c1Var11.f118428c;
                        xq3.j jVarH16 = bVar16.h();
                        vc.s.j(jVarH16);
                        xq3.c cVarF4 = bVar17.f();
                        vc.s.j(cVarF4);
                        sp3.a aVarM4 = bVar17.m();
                        vc.s.j(aVarM4);
                        return new ji4.b(jVarH16, cVarF4, aVarM4, c1Var11.i());
                    case 12:
                        c84.z zVar7 = (c84.z) o1Var.f119405q.get();
                        e5f.b.a(zVar7);
                        return zVar7;
                    case 13:
                        PluginFlowContract$Input pluginFlowContract$Input15 = (PluginFlowContract$Input) o1Var.i.get();
                        xr3.y yVarK4 = c1Var11.f118428c.k();
                        vc.s.j(yVarK4);
                        return new c84.c(pluginFlowContract$Input15, yVarK4);
                    case 14:
                        CreditPlanSelectionFlowContract$InputData creditPlanSelectionFlowContract$InputData = o1Var.f119396b;
                        xx3.a aVar16 = (xx3.a) c1Var11.m3.get();
                        dha.c cVarI = c1Var11.G.i();
                        vc.s.j(cVarI);
                        sg4.a aVar17 = new sg4.a();
                        PluginFlowContract$Input pluginFlowContract$Input16 = (PluginFlowContract$Input) o1Var.i.get();
                        c84.g gVar4 = (c84.g) o1Var.f119404p.get();
                        xa4.a aVar18 = (xa4.a) o1Var.k.get();
                        c1 c1Var13 = o1Var.f119397c;
                        gte.a aVarB4 = c1Var13.f118423b.b();
                        vc.s.j(aVarB4);
                        hz3.c cVarB4 = c1Var13.b();
                        xq3.j jVarD4 = c1Var13.f118428c.d();
                        vc.s.j(jVarD4);
                        mri.w wVarA8 = ((ozl.a) c1Var13.u).a();
                        vc.s.j(wVarA8);
                        hy3.j jVar4 = (hy3.j) c1Var13.Q1.get();
                        vie.i iVarB4 = c1Var13.z.b();
                        vc.s.j(iVarB4);
                        return new com.revolut.feature.credit.application.plugins.impl.ui.plan_selection.a(creditPlanSelectionFlowContract$InputData, aVar16, cVarI, aVar17, e5f.b.w(pluginFlowContract$Input16, gVar4, aVar18, aVarB4, cVarB4, jVarD4, wVarA8, jVar4, iVarB4));
                    default:
                        throw new AssertionError(i21);
                }
            case 6:
                c1 c1Var14 = (c1) this.f118852b;
                r1 r1Var = (r1) this.d;
                int i22 = this.f118853c;
                switch (i22) {
                    case 0:
                        return ige.d.h(r1Var.f119626a, (j60.a) r1Var.f119629g.get());
                    case 1:
                        return com.revolut.data.database.models.openbanking.d.q(r1Var.f119626a, (com.revolut.kompot.navigable.a) r1Var.e.get(), (rp0.m) r1Var.f.get());
                    case 2:
                        iq3.a aVar19 = r1Var.f119626a;
                        return new rp0.m();
                    case 3:
                        return e5f.b.x((c84.z) r1Var.f119636q.get());
                    case 4:
                        return new c84.z((c84.g) r1Var.f119635p.get(), (rz3.c) c1Var14.f118470r1.get(), (PluginFlowContract$Input) r1Var.i.get());
                    case 5:
                        PluginFlowContract$Input pluginFlowContract$Input17 = (PluginFlowContract$Input) r1Var.i.get();
                        e4m.e eVar7 = c1Var14.f118470r1;
                        uq3.b bVar18 = c1Var14.f118428c;
                        rz3.c cVar10 = (rz3.c) eVar7.get();
                        xa4.a aVar20 = (xa4.a) r1Var.k.get();
                        xq3.j jVarH17 = bVar18.h();
                        vc.s.j(jVarH17);
                        mri.w wVarA9 = ((ozl.a) c1Var14.u).a();
                        vc.s.j(wVarA9);
                        ii4.o oVar5 = (ii4.o) r1Var.o.get();
                        aq3.a aVarE6 = bVar18.e();
                        vc.s.j(aVarE6);
                        return new c84.i(pluginFlowContract$Input17, cVar10, aVar20, jVarH17, wVarA9, oVar5, aVarE6);
                    case 6:
                        PluginFlowContract$Input pluginFlowContract$Input18 = (PluginFlowContract$Input) r1Var.i.get();
                        c1 c1Var15 = r1Var.f119628c;
                        return new xa4.b(pluginFlowContract$Input18, ImmutableSet.of((ya4.g) new ya4.c(c1Var15.i(), (ya4.f) r1Var.f119631j.get()), (ya4.g) new ya4.c(c1Var15.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) r1Var.f119631j.get()), new ya4.g(new py3.f())));
                    case 7:
                        rz3.c cVar11 = (rz3.c) c1Var14.f118470r1.get();
                        xq3.j jVarH18 = c1Var14.f118428c.h();
                        vc.s.j(jVarH18);
                        return new ya4.f(cVar11, jVarH18);
                    case 8:
                        return new ii4.z((li4.a) r1Var.f119634n.get());
                    case 9:
                        return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) r1Var.f119632l.get(), li4.e.class, (li4.b) r1Var.f119633m.get()));
                    case 10:
                        xq3.j jVarH19 = c1Var14.f118428c.h();
                        vc.s.j(jVarH19);
                        return new li4.c(jVarH19);
                    case 11:
                        uq3.b bVar19 = c1Var14.f118428c;
                        uq3.b bVar20 = c1Var14.f118428c;
                        xq3.j jVarH20 = bVar19.h();
                        vc.s.j(jVarH20);
                        xq3.c cVarF5 = bVar20.f();
                        vc.s.j(cVarF5);
                        sp3.a aVarM5 = bVar20.m();
                        vc.s.j(aVarM5);
                        return new ji4.b(jVarH20, cVarF5, aVarM5, c1Var14.i());
                    case 12:
                        c84.z zVar8 = (c84.z) r1Var.f119636q.get();
                        e5f.b.a(zVar8);
                        return zVar8;
                    case 13:
                        PluginFlowContract$Input pluginFlowContract$Input19 = (PluginFlowContract$Input) r1Var.i.get();
                        xr3.y yVarK5 = c1Var14.f118428c.k();
                        vc.s.j(yVarK5);
                        return new c84.c(pluginFlowContract$Input19, yVarK5);
                    case 14:
                        CreditWorkflowContract$InputData creditWorkflowContract$InputData = r1Var.f119627b;
                        til.m mVarA = c1Var14.f118420a0.a();
                        vc.s.j(mVarA);
                        PluginFlowContract$Input pluginFlowContract$Input20 = (PluginFlowContract$Input) r1Var.i.get();
                        c84.g gVar5 = (c84.g) r1Var.f119635p.get();
                        xa4.a aVar21 = (xa4.a) r1Var.k.get();
                        c1 c1Var16 = r1Var.f119628c;
                        gte.a aVarB5 = c1Var16.f118423b.b();
                        vc.s.j(aVarB5);
                        hz3.c cVarB5 = c1Var16.b();
                        xq3.j jVarD5 = c1Var16.f118428c.d();
                        vc.s.j(jVarD5);
                        mri.w wVarA10 = ((ozl.a) c1Var16.u).a();
                        vc.s.j(wVarA10);
                        hy3.j jVar5 = (hy3.j) c1Var16.Q1.get();
                        vie.i iVarB5 = c1Var16.z.b();
                        vc.s.j(iVarB5);
                        return new com.revolut.feature.credit.application.plugins.impl.ui.workflow.a(creditWorkflowContract$InputData, mVarA, e5f.b.w(pluginFlowContract$Input20, gVar5, aVar21, aVarB5, cVarB5, jVarD5, wVarA10, jVar5, iVarB5));
                    default:
                        throw new AssertionError(i22);
                }
            case 7:
                t1 t1Var = (t1) this.d;
                int i32 = this.f118853c;
                if (i32 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) t1Var.f119821a.get(), (c84.b) t1Var.f119823c.get(), (PluginFlowContract$Input) ((z4) this.f118852b).i.get());
                }
                if (i32 == 1) {
                    return new c84.b();
                }
                if (i32 == 2) {
                    return new fg4.e((cli.n) t1Var.f.get());
                }
                if (i32 == 3) {
                    return new fg4.f();
                }
                throw new AssertionError(i32);
            case 8:
                v1 v1Var = (v1) this.d;
                c1 c1Var17 = (c1) this.f118852b;
                int i33 = this.f118853c;
                if (i33 == 0) {
                    return new com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details.a(v1Var.f119965a, (w80.b) v1Var.f119967c.get(), (yw3.a) c1Var17.w3.get(), new i94.b(), new l94.b(), new i3g.k(v1Var.f119965a, new l94.a()));
                }
                if (i33 != 1) {
                    throw new AssertionError(i33);
                }
                w80.b amountFormatter = c1Var17.f118443h.j();
                vc.s.j(amountFormatter);
                k94.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
                return amountFormatter;
            case 9:
                c1 c1Var18 = (c1) this.f118852b;
                b2 b2Var = (b2) this.d;
                int i43 = this.f118853c;
                if (i43 == 0) {
                    return kxa.j.k((j60.a) b2Var.d.get());
                }
                if (i43 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) b2Var.f118327b.get(), (rp0.m) b2Var.f118328c.get());
                }
                if (i43 == 2) {
                    return new rp0.m();
                }
                if (i43 != 3) {
                    throw new AssertionError(i43);
                }
                qc4.k kVar = new qc4.k();
                DeclineInvitationPopupScreenContract$InputData declineInvitationPopupScreenContract$InputData = b2Var.f118326a;
                xq3.d dVar2 = (xq3.d) c1Var18.f118428c.M.get();
                vc.s.j(dVar2);
                return new qc4.j(kVar, declineInvitationPopupScreenContract$InputData, dVar2, c1Var18.Z.c(), (j60.a) b2Var.d.get());
            case 10:
                c1 c1Var19 = (c1) this.f118852b;
                int i59 = this.f118853c;
                if (i59 != 0) {
                    if (i59 == 1) {
                        return new ny4.l();
                    }
                    throw new AssertionError(i59);
                }
                ang.f fVarE = c1Var19.k.e();
                wli.x xVarD = ((s41.a) c1Var19.f118485x).d();
                d2 d2Var = (d2) this.d;
                return new ny4.k(fVarE, xVarD, d2Var.f118549b, (jki.p) d2Var.f118550c.get());
            case 11:
                l70.e eVar8 = ((c1) this.f118852b).f118443h;
                f2 f2Var = (f2) this.d;
                int i66 = this.f118853c;
                if (i66 != 0) {
                    if (i66 == 1) {
                        return new py4.h((c90.c) f2Var.d.get());
                    }
                    if (i66 == 2) {
                        return qw7.u.y(f2Var.f118708c);
                    }
                    throw new AssertionError(i66);
                }
                c70.a aVarZ = eVar8.z();
                vc.s.j(aVarZ);
                r70.c cVarA = eVar8.A();
                vc.s.j(cVarA);
                return new py4.f(aVarZ, cVarA, f2Var.f118707b, (jki.p) f2Var.e.get());
            case 12:
                return a();
            case 13:
                return b();
            case 14:
                return c();
            case 15:
                return d();
            case 16:
                return e();
            case 17:
                return f();
            case 18:
                return g();
            case 19:
                return h();
            case 20:
                return i();
            case 21:
                return j();
            case 22:
                return k();
            case 23:
                return l();
            case 24:
                return m();
            case 25:
                return n();
            case 26:
                return o();
            case 27:
                return p();
            case 28:
                return q();
            default:
                c1 c1Var20 = (c1) this.f118852b;
                e3 e3Var = (e3) this.d;
                int i74 = this.f118853c;
                switch (i74) {
                    case 0:
                        return ige.d.h(e3Var.f118627a, (j60.a) e3Var.f118630g.get());
                    case 1:
                        return com.revolut.data.database.models.openbanking.d.q(e3Var.f118627a, (com.revolut.kompot.navigable.a) e3Var.e.get(), (rp0.m) e3Var.f.get());
                    case 2:
                        iq3.a aVar22 = e3Var.f118627a;
                        return new rp0.m();
                    case 3:
                        return e5f.b.x((c84.z) e3Var.f118637q.get());
                    case 4:
                        zVar3 = new c84.z((c84.g) e3Var.f118636p.get(), (rz3.c) c1Var20.f118470r1.get(), (PluginFlowContract$Input) e3Var.i.get());
                        return zVar3;
                    case 5:
                        PluginFlowContract$Input pluginFlowContract$Input21 = (PluginFlowContract$Input) e3Var.i.get();
                        e4m.e eVar9 = c1Var20.f118470r1;
                        uq3.b bVar21 = c1Var20.f118428c;
                        rz3.c cVar12 = (rz3.c) eVar9.get();
                        xa4.a aVar23 = (xa4.a) e3Var.k.get();
                        xq3.j jVarH21 = bVar21.h();
                        vc.s.j(jVarH21);
                        mri.w wVarA11 = ((ozl.a) c1Var20.u).a();
                        vc.s.j(wVarA11);
                        ii4.o oVar6 = (ii4.o) e3Var.o.get();
                        aq3.a aVarE7 = bVar21.e();
                        vc.s.j(aVarE7);
                        return new c84.i(pluginFlowContract$Input21, cVar12, aVar23, jVarH21, wVarA11, oVar6, aVarE7);
                    case 6:
                        PluginFlowContract$Input pluginFlowContract$Input22 = (PluginFlowContract$Input) e3Var.i.get();
                        c1 c1Var21 = e3Var.f118629c;
                        return new xa4.b(pluginFlowContract$Input22, ImmutableSet.of((ya4.g) new ya4.c(c1Var21.i(), (ya4.f) e3Var.f118632j.get()), (ya4.g) new ya4.c(c1Var21.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) e3Var.f118632j.get()), new ya4.g(new py3.f())));
                    case 7:
                        rz3.c cVar13 = (rz3.c) c1Var20.f118470r1.get();
                        xq3.j jVarH22 = c1Var20.f118428c.h();
                        vc.s.j(jVarH22);
                        fVar = new ya4.f(cVar13, jVarH22);
                        return fVar;
                    case 8:
                        return new ii4.z((li4.a) e3Var.f118635n.get());
                    case 9:
                        return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) e3Var.f118633l.get(), li4.e.class, (li4.b) e3Var.f118634m.get()));
                    case 10:
                        xq3.j jVarH23 = c1Var20.f118428c.h();
                        vc.s.j(jVarH23);
                        fVar = new li4.c(jVarH23);
                        return fVar;
                    case 11:
                        uq3.b bVar22 = c1Var20.f118428c;
                        uq3.b bVar23 = c1Var20.f118428c;
                        xq3.j jVarH24 = bVar22.h();
                        vc.s.j(jVarH24);
                        xq3.c cVarF6 = bVar23.f();
                        vc.s.j(cVarF6);
                        sp3.a aVarM6 = bVar23.m();
                        vc.s.j(aVarM6);
                        fVar = new ji4.b(jVarH24, cVarF6, aVarM6, c1Var20.i());
                        return fVar;
                    case 12:
                        c84.z zVar9 = (c84.z) e3Var.f118637q.get();
                        e5f.b.a(zVar9);
                        return zVar9;
                    case 13:
                        PluginFlowContract$Input pluginFlowContract$Input23 = (PluginFlowContract$Input) e3Var.i.get();
                        xr3.y yVarK6 = c1Var20.f118428c.k();
                        vc.s.j(yVarK6);
                        zVar3 = new c84.c(pluginFlowContract$Input23, yVarK6);
                        return zVar3;
                    case 14:
                        FamilyCreditCardSettingsFlowContract$InputData familyCreditCardSettingsFlowContract$InputData = e3Var.f118628b;
                        PluginFlowContract$Input pluginFlowContract$Input24 = (PluginFlowContract$Input) e3Var.i.get();
                        c84.g gVar6 = (c84.g) e3Var.f118636p.get();
                        xa4.a aVar24 = (xa4.a) e3Var.k.get();
                        c1 c1Var22 = e3Var.f118629c;
                        gte.a aVarB6 = c1Var22.f118423b.b();
                        vc.s.j(aVarB6);
                        hz3.c cVarB6 = c1Var22.b();
                        xq3.j jVarD6 = c1Var22.f118428c.d();
                        vc.s.j(jVarD6);
                        mri.w wVarA12 = ((ozl.a) c1Var22.u).a();
                        vc.s.j(wVarA12);
                        hy3.j jVar6 = (hy3.j) c1Var22.Q1.get();
                        vie.i iVarB6 = c1Var22.z.b();
                        vc.s.j(iVarB6);
                        return new com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.flow.a(familyCreditCardSettingsFlowContract$InputData, e5f.b.w(pluginFlowContract$Input24, gVar6, aVar24, aVarB6, cVarB6, jVarD6, wVarA12, jVar6, iVarB6));
                    default:
                        throw new AssertionError(i74);
                }
        }
    }
}

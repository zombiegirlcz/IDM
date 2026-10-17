package dw3;

import android.app.Activity;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.common.viewer.CreditApplicationDocumentViewerScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import com.revolut.feature.credit.application.plugins.impl.ui.questionnaire_kompot.QuestionnaireFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.RefinancingAccountDetailsFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.documents.RefinancingAccountDocumentsScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.RefinancingAccountDetailsInputFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.RefinancingOfferFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.RejectedLazyFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.RejectedRootFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.rollee.RolleeFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.security_deposit.SecurityDepositFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.flow.SepaDirectDebitFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.SolicitorSelectionFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.spinner.SpinnerFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.spinner.SpinnerLazyFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.SpousalConsentInitiatorFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.popup.SpousalConsentInitiatorPopupScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow.SpousalConsentPartnerFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.status_dialog.StatusDialogFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.user_selection.flow.UserSelectionFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.valuators.details.ValuatorDetailsScreenContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.visible_prequalification.VisiblePrequalificationFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.waiting.WaitingPopupScreenContract$InputData;
import java.util.Optional;
import t80.e;

/* JADX INFO: loaded from: classes22.dex */
public final class g5 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f118823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f118824c;
    public final Object d;

    public /* synthetic */ g5(Object obj2, Object obj3, int i, int i2) {
        this.f118822a = i2;
        this.f118823b = obj2;
        this.d = obj3;
        this.f118824c = i;
    }

    private final Object a() {
        c1 c1Var = (c1) this.f118823b;
        s5 s5Var = (s5) this.d;
        int i = this.f118824c;
        switch (i) {
            case 0:
                return e5f.b.e((com.revolut.kompot.navigable.a) s5Var.f119766b.get(), (c84.b) s5Var.d.get(), (PluginFlowContract$Input) s5Var.e.get());
            case 1:
                return new c84.b();
            case 2:
                return kxa.j.k((j60.a) s5Var.f119769h.get());
            case 3:
                return ehe.n.s((com.revolut.kompot.navigable.a) s5Var.f119766b.get(), (rp0.m) s5Var.f119768g.get());
            case 4:
                return new rp0.m();
            case 5:
                xq3.j jVarD = c1Var.f118428c.d();
                vc.s.j(jVarD);
                hw3.c cVar = (hw3.c) c1Var.f118472s0.get();
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                return new oh4.l(jVarD, cVar, wVarA, s5Var.f119765a, c1Var.b(), (j60.a) s5Var.f119769h.get(), (oh4.a) s5Var.k.get(), (c84.b) s5Var.d.get(), ((s41.a) c1Var.f118485x).d(), (cli.n) s5Var.f119771l.get());
            case 6:
                return new oh4.b();
            case 7:
                return new oh4.m();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        c1 c1Var = (c1) this.f118823b;
        v5 v5Var = (v5) this.d;
        int i = this.f118824c;
        switch (i) {
            case 0:
                return ige.d.h(v5Var.f120001a, (j60.a) v5Var.f120004g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(v5Var.f120001a, (com.revolut.kompot.navigable.a) v5Var.e.get(), (rp0.m) v5Var.f.get());
            case 2:
                iq3.a aVar = v5Var.f120001a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) v5Var.f120011q.get());
            case 4:
                return new c84.z((c84.g) v5Var.f120010p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) v5Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) v5Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) v5Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) v5Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) v5Var.i.get();
                c1 c1Var2 = v5Var.f120003c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) v5Var.f120006j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) v5Var.f120006j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) v5Var.f120009n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) v5Var.f120007l.get(), li4.e.class, (li4.b) v5Var.f120008m.get()));
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
                c84.z zVar = (c84.z) v5Var.f120011q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) v5Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                RolleeFlowContract$InputData rolleeFlowContract$InputData = v5Var.f120002b;
                cy3.a aVar3 = (cy3.a) c1Var.f118422a3.get();
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) v5Var.i.get();
                c84.g gVar = (c84.g) v5Var.f120010p.get();
                xa4.a aVar4 = (xa4.a) v5Var.k.get();
                c1 c1Var3 = v5Var.f120003c;
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
                return new com.revolut.feature.credit.application.plugins.impl.ui.rollee.c(rolleeFlowContract$InputData, aVar3, e5f.b.w(pluginFlowContract$Input4, gVar, aVar4, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        c1 c1Var = (c1) this.f118823b;
        y5 y5Var = (y5) this.d;
        int i = this.f118824c;
        switch (i) {
            case 0:
                return ige.d.h(y5Var.f120220a, (j60.a) y5Var.f120223g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(y5Var.f120220a, (com.revolut.kompot.navigable.a) y5Var.e.get(), (rp0.m) y5Var.f.get());
            case 2:
                iq3.a aVar = y5Var.f120220a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) y5Var.f120230q.get());
            case 4:
                return new c84.z((c84.g) y5Var.f120229p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) y5Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) y5Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) y5Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) y5Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) y5Var.i.get();
                c1 c1Var2 = y5Var.f120222c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) y5Var.f120225j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) y5Var.f120225j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) y5Var.f120228n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) y5Var.f120226l.get(), li4.e.class, (li4.b) y5Var.f120227m.get()));
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
                c84.z zVar = (c84.z) y5Var.f120230q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) y5Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                SecurityDepositFlowContract$InputData securityDepositFlowContract$InputData = y5Var.f120221b;
                dy3.a aVar3 = (dy3.a) c1Var.i3.get();
                ffk.t tVarF = c1Var.G.f();
                vc.s.j(tVarF);
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) y5Var.i.get();
                c84.g gVar = (c84.g) y5Var.f120229p.get();
                xa4.a aVar4 = (xa4.a) y5Var.k.get();
                c1 c1Var3 = y5Var.f120222c;
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
                return new com.revolut.feature.credit.application.plugins.impl.ui.security_deposit.a(securityDepositFlowContract$InputData, aVar3, tVarF, e5f.b.w(pluginFlowContract$Input4, gVar, aVar4, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        e6 e6Var = (e6) this.d;
        c1 c1Var = (c1) this.f118823b;
        int i = this.f118824c;
        switch (i) {
            case 0:
                return ige.d.h(e6Var.f118649a, (j60.a) e6Var.f.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(e6Var.f118649a, (com.revolut.kompot.navigable.a) e6Var.d.get(), (rp0.m) e6Var.e.get());
            case 2:
                iq3.a aVar = e6Var.f118649a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) e6Var.f118658p.get());
            case 4:
                return new c84.z((c84.g) e6Var.o.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) e6Var.f118653h.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) e6Var.f118653h.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) e6Var.f118654j.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) e6Var.f118657n.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) e6Var.f118653h.get();
                c1 c1Var2 = e6Var.f118650b;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) e6Var.i.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) e6Var.i.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) e6Var.f118656m.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) e6Var.k.get(), li4.e.class, (li4.b) e6Var.f118655l.get()));
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
                ow3.e eVar2 = (ow3.e) c1Var.Y0.get();
                wli.x xVarD = ((s41.a) c1Var.f118485x).d();
                hw3.c cVar3 = (hw3.c) c1Var.f118472s0.get();
                ow3.g gVar = (ow3.g) c1Var.U1.get();
                dq3.a aVar3 = (dq3.a) c1Var.W1.get();
                j54.v vVar = (j54.v) e6Var.f118660r.get();
                aq3.a aVarE2 = c1Var.f118428c.e();
                vc.s.j(aVarE2);
                return new com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.c(eVar2, xVarD, cVar3, gVar, aVar3, vVar, aVarE2);
            case 13:
                mri.w wVarA2 = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA2);
                xq3.j jVarD = c1Var.f118428c.d();
                vc.s.j(jVarD);
                hy3.j jVar = (hy3.j) c1Var.Q1.get();
                vie.i iVarB = c1Var.z.b();
                vc.s.j(iVarB);
                gte.a aVarB = c1Var.f118423b.b();
                vc.s.j(aVarB);
                return new j54.y(wVarA2, jVarD, jVar, iVarB, aVarB);
            case 14:
                c84.z zVar = (c84.z) e6Var.f118658p.get();
                e5f.b.a(zVar);
                return zVar;
            case 15:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) e6Var.f118653h.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 16:
                c84.g gVar2 = (c84.g) e6Var.o.get();
                rz3.c cVar4 = (rz3.c) c1Var.f118470r1.get();
                sp3.a aVarM2 = c1Var.f118428c.m();
                vc.s.j(aVarM2);
                return new com.revolut.feature.credit.application.plugins.impl.ui.sso.flow.a(gVar2, cVar4, aVarM2, (j54.f) e6Var.f118661s.get());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        c1 c1Var = (c1) this.f118823b;
        h6 h6Var = (h6) this.d;
        int i = this.f118824c;
        switch (i) {
            case 0:
                return ige.d.h(h6Var.f118901a, (j60.a) h6Var.f118904g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(h6Var.f118901a, (com.revolut.kompot.navigable.a) h6Var.e.get(), (rp0.m) h6Var.f.get());
            case 2:
                iq3.a aVar = h6Var.f118901a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) h6Var.f118910p.get());
            case 4:
                return new c84.z((c84.g) h6Var.o.get(), (rz3.c) c1Var.f118470r1.get(), h6Var.f118902b);
            case 5:
                SepaDirectDebitFlowContract$InputData sepaDirectDebitFlowContract$InputData = h6Var.f118902b;
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) h6Var.f118906j.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) h6Var.f118909n.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(sepaDirectDebitFlowContract$InputData, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                SepaDirectDebitFlowContract$InputData sepaDirectDebitFlowContract$InputData2 = h6Var.f118902b;
                c1 c1Var2 = h6Var.f118903c;
                return new xa4.b(sepaDirectDebitFlowContract$InputData2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) h6Var.i.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) h6Var.i.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) h6Var.f118908m.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) h6Var.k.get(), li4.e.class, (li4.b) h6Var.f118907l.get()));
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
                c84.z zVar = (c84.z) h6Var.f118910p.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                SepaDirectDebitFlowContract$InputData sepaDirectDebitFlowContract$InputData3 = h6Var.f118902b;
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(sepaDirectDebitFlowContract$InputData3, yVarK);
            case 14:
                SepaDirectDebitFlowContract$InputData sepaDirectDebitFlowContract$InputData4 = h6Var.f118902b;
                ey3.a aVar3 = (ey3.a) c1Var.s3.get();
                uh4.a aVar4 = new uh4.a();
                sf0.h hVarB = c1Var.f118449k0.f319169g.b();
                vc.s.j(hVarB);
                c45.d dVar = new c45.d(hVarB);
                SepaDirectDebitFlowContract$InputData sepaDirectDebitFlowContract$InputData5 = h6Var.f118902b;
                c84.g gVar = (c84.g) h6Var.o.get();
                xa4.a aVar5 = (xa4.a) h6Var.f118906j.get();
                c1 c1Var3 = h6Var.f118903c;
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
                return new com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.flow.a(sepaDirectDebitFlowContract$InputData4, aVar3, aVar4, dVar, e5f.b.w(sepaDirectDebitFlowContract$InputData5, gVar, aVar5, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        l6 l6Var = (l6) this.d;
        int i = this.f118824c;
        if (i == 0) {
            return kxa.j.l((j60.a) l6Var.e.get());
        }
        if (i == 1) {
            return h30.l.p((com.revolut.kompot.navigable.a) l6Var.f119211c.get(), (rp0.m) l6Var.d.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i == 3) {
            return new wk4.m(new yk4.a(), (j60.a) l6Var.e.get(), l6Var.f119210b, (jki.p) l6Var.f119212g.get());
        }
        if (i != 4) {
            throw new AssertionError(i);
        }
        om4.j4 j4Var = (om4.j4) ((c1) this.f118823b).f118447j.H.get();
        vc.s.j(j4Var);
        return new wk4.o(j4Var);
    }

    private final Object g() {
        p6 p6Var = (p6) this.d;
        int i = this.f118824c;
        if (i == 0) {
            return e5f.b.e((com.revolut.kompot.navigable.a) p6Var.f119529b.get(), (c84.b) p6Var.d.get(), (PluginFlowContract$Input) ((g4) this.f118823b).i.get());
        }
        if (i == 1) {
            return new c84.b();
        }
        if (i == 2) {
            return new oe4.q(new oe4.a(), (cli.n) p6Var.f119531g.get());
        }
        if (i == 3) {
            return new oe4.r(p6Var.f119528a, new q74.b());
        }
        throw new AssertionError(i);
    }

    private final Object h() {
        c1 c1Var = (c1) this.f118823b;
        r6 r6Var = (r6) this.d;
        int i = this.f118824c;
        switch (i) {
            case 0:
                return ige.d.h(r6Var.f119678a, (j60.a) r6Var.f119681g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(r6Var.f119678a, (com.revolut.kompot.navigable.a) r6Var.e.get(), (rp0.m) r6Var.f.get());
            case 2:
                iq3.a aVar = r6Var.f119678a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) r6Var.f119688q.get());
            case 4:
                return new c84.z((c84.g) r6Var.f119687p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) r6Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) r6Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) r6Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) r6Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) r6Var.i.get();
                c1 c1Var2 = r6Var.f119680c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) r6Var.f119683j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) r6Var.f119683j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) r6Var.f119686n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) r6Var.f119684l.get(), li4.e.class, (li4.b) r6Var.f119685m.get()));
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
                c84.z zVar = (c84.z) r6Var.f119688q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) r6Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                SolicitorSelectionFlowContract$InputData solicitorSelectionFlowContract$InputData = r6Var.f119679b;
                fy3.a aVar3 = (fy3.a) c1Var.k3.get();
                ang.f fVarE = c1Var.k.e();
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) r6Var.i.get();
                c84.g gVar = (c84.g) r6Var.f119687p.get();
                xa4.a aVar4 = (xa4.a) r6Var.k.get();
                c1 c1Var3 = r6Var.f119680c;
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
                return new com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.h(solicitorSelectionFlowContract$InputData, aVar3, fVarE, e5f.b.w(pluginFlowContract$Input4, gVar, aVar4, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        c1 c1Var = (c1) this.f118823b;
        s6 s6Var = (s6) this.d;
        int i = this.f118824c;
        switch (i) {
            case 0:
                return ige.d.h(s6Var.f119773a, (j60.a) s6Var.f119776g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(s6Var.f119773a, (com.revolut.kompot.navigable.a) s6Var.e.get(), (rp0.m) s6Var.f.get());
            case 2:
                iq3.a aVar = s6Var.f119773a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) s6Var.f119783q.get());
            case 4:
                return new c84.z((c84.g) s6Var.f119782p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) s6Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) s6Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) s6Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) s6Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) s6Var.i.get();
                c1 c1Var2 = s6Var.f119775c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) s6Var.f119778j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) s6Var.f119778j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) s6Var.f119781n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) s6Var.f119779l.get(), li4.e.class, (li4.b) s6Var.f119780m.get()));
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
                c84.z zVar = (c84.z) s6Var.f119783q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) s6Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                SpinnerFlowContract$InputData spinnerFlowContract$InputData = s6Var.f119774b;
                c1 c1Var3 = s6Var.f119775c;
                mri.w wVarA2 = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA2);
                ii4.o oVar2 = (ii4.o) s6Var.o.get();
                wr3.f fVar = (wr3.f) c1Var3.f118428c.f0.get();
                vc.s.j(fVar);
                s70.a aVarM2 = c1Var3.f118443h.m();
                vc.s.j(aVarM2);
                be4.d dVar = new be4.d(fVar, aVarM2);
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) s6Var.i.get();
                c84.g gVar = (c84.g) s6Var.f119782p.get();
                xa4.a aVar3 = (xa4.a) s6Var.k.get();
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
                return new com.revolut.feature.credit.application.plugins.impl.ui.spinner.a(spinnerFlowContract$InputData, wVarA2, oVar2, dVar, e5f.b.w(pluginFlowContract$Input4, gVar, aVar3, aVarB, cVarB, jVarD, wVarA3, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object j() {
        c1 c1Var = (c1) this.f118823b;
        t6 t6Var = (t6) this.d;
        int i = this.f118824c;
        switch (i) {
            case 0:
                return ige.d.h(t6Var.f119850a, (j60.a) t6Var.f119853g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(t6Var.f119850a, (com.revolut.kompot.navigable.a) t6Var.e.get(), (rp0.m) t6Var.f.get());
            case 2:
                iq3.a aVar = t6Var.f119850a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) t6Var.f119860q.get());
            case 4:
                return new c84.z((c84.g) t6Var.f119859p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) t6Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) t6Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) t6Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) t6Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) t6Var.i.get();
                c1 c1Var2 = t6Var.f119852c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) t6Var.f119855j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) t6Var.f119855j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) t6Var.f119858n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) t6Var.f119856l.get(), li4.e.class, (li4.b) t6Var.f119857m.get()));
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
                c84.z zVar = (c84.z) t6Var.f119860q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) t6Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                SpinnerLazyFlowContract$InputData spinnerLazyFlowContract$InputData = t6Var.f119851b;
                c1 c1Var3 = t6Var.f119852c;
                ii4.o oVar2 = (ii4.o) t6Var.o.get();
                wr3.f fVar = (wr3.f) c1Var3.f118428c.f0.get();
                vc.s.j(fVar);
                s70.a aVarM2 = c1Var3.f118443h.m();
                vc.s.j(aVarM2);
                be4.d dVar = new be4.d(fVar, aVarM2);
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) t6Var.i.get();
                c84.g gVar = (c84.g) t6Var.f119859p.get();
                xa4.a aVar3 = (xa4.a) t6Var.k.get();
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
                return new com.revolut.feature.credit.application.plugins.impl.ui.spinner.b(spinnerLazyFlowContract$InputData, oVar2, dVar, e5f.b.w(pluginFlowContract$Input4, gVar, aVar3, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object k() {
        c1 c1Var = (c1) this.f118823b;
        u6 u6Var = (u6) this.d;
        int i = this.f118824c;
        switch (i) {
            case 0:
                return ige.d.h(u6Var.f119923a, (j60.a) u6Var.f119926g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(u6Var.f119923a, (com.revolut.kompot.navigable.a) u6Var.e.get(), (rp0.m) u6Var.f.get());
            case 2:
                iq3.a aVar = u6Var.f119923a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) u6Var.f119933q.get());
            case 4:
                return new c84.z((c84.g) u6Var.f119932p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) u6Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) u6Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) u6Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) u6Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) u6Var.i.get();
                c1 c1Var2 = u6Var.f119925c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) u6Var.f119928j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) u6Var.f119928j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) u6Var.f119931n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) u6Var.f119929l.get(), li4.e.class, (li4.b) u6Var.f119930m.get()));
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
                c84.z zVar = (c84.z) u6Var.f119933q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) u6Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                hw3.c cVar3 = (hw3.c) c1Var.f118472s0.get();
                SpousalConsentInitiatorFlowContract$InputData spousalConsentInitiatorFlowContract$InputData = u6Var.f119924b;
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) u6Var.i.get();
                c84.g gVar = (c84.g) u6Var.f119932p.get();
                xa4.a aVar3 = (xa4.a) u6Var.k.get();
                c1 c1Var3 = u6Var.f119925c;
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
                return new com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.flow.b(cVar3, spousalConsentInitiatorFlowContract$InputData, e5f.b.w(pluginFlowContract$Input4, gVar, aVar3, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object l() {
        c1 c1Var = (c1) this.f118823b;
        v6 v6Var = (v6) this.d;
        int i = this.f118824c;
        switch (i) {
            case 0:
                return kxa.j.l((j60.a) v6Var.d.get());
            case 1:
                return h30.l.p((com.revolut.kompot.navigable.a) v6Var.f120016b.get(), (rp0.m) v6Var.f120017c.get());
            case 2:
                return new rp0.m();
            case 3:
                return e5f.b.d((com.revolut.kompot.navigable.a) v6Var.f120016b.get(), (c84.b) v6Var.f120018g.get(), (PluginFlowContract$Input) v6Var.f120019h.get());
            case 4:
                return new c84.b();
            case 5:
                hw3.c cVar = (hw3.c) c1Var.f118472s0.get();
                SpousalConsentInitiatorPopupScreenContract$InputData spousalConsentInitiatorPopupScreenContract$InputData = v6Var.f120015a;
                j60.a aVar = (j60.a) v6Var.d.get();
                ow3.e eVar = (ow3.e) c1Var.Y0.get();
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                return new ni4.n(cVar, spousalConsentInitiatorPopupScreenContract$InputData, aVar, eVar, wVarA, (jki.p) v6Var.k.get());
            case 6:
                return new ni4.o();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object m() {
        c1 c1Var = (c1) this.f118823b;
        w6 w6Var = (w6) this.d;
        int i = this.f118824c;
        switch (i) {
            case 0:
                return ige.d.h(w6Var.f120074a, (j60.a) w6Var.f120077g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(w6Var.f120074a, (com.revolut.kompot.navigable.a) w6Var.e.get(), (rp0.m) w6Var.f.get());
            case 2:
                iq3.a aVar = w6Var.f120074a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) w6Var.f120084q.get());
            case 4:
                return new c84.z((c84.g) w6Var.f120083p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) w6Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) w6Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) w6Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) w6Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) w6Var.i.get();
                c1 c1Var2 = w6Var.f120076c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) w6Var.f120079j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) w6Var.f120079j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) w6Var.f120082n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) w6Var.f120080l.get(), li4.e.class, (li4.b) w6Var.f120081m.get()));
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
                c84.z zVar = (c84.z) w6Var.f120084q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) w6Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                SpousalConsentPartnerFlowContract$InputData spousalConsentPartnerFlowContract$InputData = w6Var.f120075b;
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) w6Var.i.get();
                c84.g gVar = (c84.g) w6Var.f120083p.get();
                xa4.a aVar3 = (xa4.a) w6Var.k.get();
                c1 c1Var3 = w6Var.f120076c;
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
                return new com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_partner.flow.a(spousalConsentPartnerFlowContract$InputData, e5f.b.w(pluginFlowContract$Input4, gVar, aVar3, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object n() {
        c1 c1Var = (c1) this.f118823b;
        x6 x6Var = (x6) this.d;
        int i = this.f118824c;
        switch (i) {
            case 0:
                return ige.d.h(x6Var.f120151a, (j60.a) x6Var.f120154g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(x6Var.f120151a, (com.revolut.kompot.navigable.a) x6Var.e.get(), (rp0.m) x6Var.f.get());
            case 2:
                iq3.a aVar = x6Var.f120151a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) x6Var.f120161q.get());
            case 4:
                return new c84.z((c84.g) x6Var.f120160p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) x6Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) x6Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) x6Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) x6Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) x6Var.i.get();
                c1 c1Var2 = x6Var.f120153c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) x6Var.f120156j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) x6Var.f120156j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) x6Var.f120159n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) x6Var.f120157l.get(), li4.e.class, (li4.b) x6Var.f120158m.get()));
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
                c84.z zVar = (c84.z) x6Var.f120161q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) x6Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                StatusDialogFlowContract$InputData statusDialogFlowContract$InputData = x6Var.f120152b;
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) x6Var.i.get();
                c84.g gVar = (c84.g) x6Var.f120160p.get();
                xa4.a aVar3 = (xa4.a) x6Var.k.get();
                c1 c1Var3 = x6Var.f120153c;
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
                return new xi4.a(statusDialogFlowContract$InputData, e5f.b.w(pluginFlowContract$Input4, gVar, aVar3, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object o() {
        c1 c1Var = (c1) this.f118823b;
        b7 b7Var = (b7) this.d;
        int i = this.f118824c;
        switch (i) {
            case 0:
                return ige.d.h(b7Var.f118379a, (j60.a) b7Var.f118382g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(b7Var.f118379a, (com.revolut.kompot.navigable.a) b7Var.e.get(), (rp0.m) b7Var.f.get());
            case 2:
                iq3.a aVar = b7Var.f118379a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) b7Var.f118389q.get());
            case 4:
                return new c84.z((c84.g) b7Var.f118388p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) b7Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) b7Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) b7Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) b7Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) b7Var.i.get();
                c1 c1Var2 = b7Var.f118381c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) b7Var.f118384j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) b7Var.f118384j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) b7Var.f118387n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) b7Var.f118385l.get(), li4.e.class, (li4.b) b7Var.f118386m.get()));
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
                c84.z zVar = (c84.z) b7Var.f118389q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) b7Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                UserSelectionFlowContract$InputData userSelectionFlowContract$InputData = b7Var.f118380b;
                gy3.a aVar3 = (gy3.a) c1Var.s2.get();
                ln3.b bVar4 = new ln3.b();
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) b7Var.i.get();
                c84.g gVar = (c84.g) b7Var.f118388p.get();
                xa4.a aVar4 = (xa4.a) b7Var.k.get();
                c1 c1Var3 = b7Var.f118381c;
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
                return new com.revolut.feature.credit.application.plugins.impl.ui.user_selection.flow.b(userSelectionFlowContract$InputData, aVar3, bVar4, e5f.b.w(pluginFlowContract$Input4, gVar, aVar4, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object p() {
        c7 c7Var = (c7) this.d;
        int i = this.f118824c;
        if (i == 0) {
            return new com.revolut.feature.credit.application.plugins.impl.ui.valuators.details.a(new fj4.a(), (cli.n) c7Var.f118520b.get());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        ValuatorDetailsScreenContract$InputData valuatorDetailsScreenContract$InputData = c7Var.f118519a;
        z80.b bVarS = ((c1) this.f118823b).f118443h.s();
        vc.s.j(bVarS);
        return new com.revolut.feature.credit.application.plugins.impl.ui.valuators.details.b(valuatorDetailsScreenContract$InputData, bVarS);
    }

    private final Object q() {
        d7 d7Var = (d7) this.d;
        int i = this.f118824c;
        if (i == 0) {
            return trl.f.j((t60.b) d7Var.f118592b.get());
        }
        if (i == 1) {
            return trl.f.s(d7Var.f118591a);
        }
        if (i == 2) {
            return new ij4.j((hw3.h0) ((c1) this.f118823b).L2.get(), (cli.n) d7Var.d.get());
        }
        if (i == 3) {
            return new ij4.k();
        }
        throw new AssertionError(i);
    }

    private final Object r() {
        c1 c1Var = (c1) this.f118823b;
        f7 f7Var = (f7) this.d;
        int i = this.f118824c;
        switch (i) {
            case 0:
                return ige.d.h(f7Var.f118747a, (j60.a) f7Var.f118750g.get());
            case 1:
                return com.revolut.data.database.models.openbanking.d.q(f7Var.f118747a, (com.revolut.kompot.navigable.a) f7Var.e.get(), (rp0.m) f7Var.f.get());
            case 2:
                iq3.a aVar = f7Var.f118747a;
                return new rp0.m();
            case 3:
                return e5f.b.x((c84.z) f7Var.f118757q.get());
            case 4:
                return new c84.z((c84.g) f7Var.f118756p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) f7Var.i.get());
            case 5:
                PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) f7Var.i.get();
                e4m.e eVar = c1Var.f118470r1;
                uq3.b bVar = c1Var.f118428c;
                rz3.c cVar = (rz3.c) eVar.get();
                xa4.a aVar2 = (xa4.a) f7Var.k.get();
                xq3.j jVarH = bVar.h();
                vc.s.j(jVarH);
                mri.w wVarA = ((ozl.a) c1Var.u).a();
                vc.s.j(wVarA);
                ii4.o oVar = (ii4.o) f7Var.o.get();
                aq3.a aVarE = bVar.e();
                vc.s.j(aVarE);
                return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
            case 6:
                PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) f7Var.i.get();
                c1 c1Var2 = f7Var.f118749c;
                return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) f7Var.f118752j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) f7Var.f118752j.get()), new ya4.g(new py3.f())));
            case 7:
                rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                xq3.j jVarH2 = c1Var.f118428c.h();
                vc.s.j(jVarH2);
                return new ya4.f(cVar2, jVarH2);
            case 8:
                return new ii4.z((li4.a) f7Var.f118755n.get());
            case 9:
                return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) f7Var.f118753l.get(), li4.e.class, (li4.b) f7Var.f118754m.get()));
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
                c84.z zVar = (c84.z) f7Var.f118757q.get();
                e5f.b.a(zVar);
                return zVar;
            case 13:
                PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) f7Var.i.get();
                xr3.y yVarK = c1Var.f118428c.k();
                vc.s.j(yVarK);
                return new c84.c(pluginFlowContract$Input3, yVarK);
            case 14:
                VisiblePrequalificationFlowContract$InputData visiblePrequalificationFlowContract$InputData = f7Var.f118748b;
                xq3.j jVarH5 = c1Var.f118428c.h();
                vc.s.j(jVarH5);
                PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) f7Var.i.get();
                c84.g gVar = (c84.g) f7Var.f118756p.get();
                xa4.a aVar3 = (xa4.a) f7Var.k.get();
                c1 c1Var3 = f7Var.f118749c;
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
                return new com.revolut.feature.credit.application.plugins.impl.ui.visible_prequalification.a(visiblePrequalificationFlowContract$InputData, jVarH5, e5f.b.w(pluginFlowContract$Input4, gVar, aVar3, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object s() {
        uq3.b bVar = ((c1) this.f118823b).f118428c;
        j7 j7Var = (j7) this.d;
        int i = this.f118824c;
        if (i == 0) {
            return kxa.j.l((j60.a) j7Var.d.get());
        }
        if (i == 1) {
            return h30.l.p((com.revolut.kompot.navigable.a) j7Var.f119051b.get(), (rp0.m) j7Var.f119052c.get());
        }
        if (i == 2) {
            return new rp0.m();
        }
        if (i != 3) {
            if (i == 4) {
                return new mj4.e();
            }
            throw new AssertionError(i);
        }
        WaitingPopupScreenContract$InputData waitingPopupScreenContract$InputData = j7Var.f119050a;
        j60.a aVar = (j60.a) j7Var.d.get();
        wr3.f fVar = (wr3.f) bVar.f0.get();
        vc.s.j(fVar);
        wr3.e eVar = (wr3.e) bVar.g0.get();
        vc.s.j(eVar);
        return new mj4.d(waitingPopupScreenContract$InputData, aVar, fVar, eVar, (jki.p) j7Var.f.get());
    }

    private final Object t() {
        u7 u7Var = (u7) this.d;
        c1 c1Var = (c1) this.f118823b;
        l70.e eVar = c1Var.f118443h;
        nj0.a aVar = c1Var.d;
        int i = this.f118824c;
        if (i == 0) {
            return new a84.e((a84.b) u7Var.d.get());
        }
        if (i == 1) {
            return agk.b.l(u7Var.f119938b);
        }
        if (i == 2) {
            hk0.a aVarJ = ((nj0.d) aVar).j();
            zk0.b bVarL = eVar.l();
            vc.s.j(bVarL);
            n80.d dVarA = eVar.a();
            vc.s.j(dVarA);
            return new y74.d(aVarJ, bVarL, dVarA, c1Var.f118482w.e());
        }
        if (i != 3) {
            if (i == 4) {
                return new v44.q(new mx4.r());
            }
            throw new AssertionError(i);
        }
        cli.n nVar = (cli.n) u7Var.f119940g.get();
        CreditApplicationDocumentViewerScreenContract$InputData creditApplicationDocumentViewerScreenContract$InputData = u7Var.f119939c;
        y74.a aVar2 = (y74.a) u7Var.f.get();
        hz3.c cVarB = c1Var.b();
        bk0.e eVarH = ((nj0.d) aVar).h();
        gte.a aVarB = c1Var.f118423b.b();
        vc.s.j(aVarB);
        return new v44.n(nVar, creditApplicationDocumentViewerScreenContract$InputData, aVar2, cVarB, eVarH, aVarB);
    }

    @Override // phm.a
    public final Object get() {
        Object zVar;
        Object fVar;
        Object zVar2;
        Object fVar2;
        Object yVar;
        Object zVar3;
        Object fVar3;
        switch (this.f118822a) {
            case 0:
                c1 c1Var = (c1) this.f118823b;
                h5 h5Var = (h5) this.d;
                int i = this.f118824c;
                switch (i) {
                    case 0:
                        return ige.d.h(h5Var.f118887a, (j60.a) h5Var.f118890g.get());
                    case 1:
                        return com.revolut.data.database.models.openbanking.d.q(h5Var.f118887a, (com.revolut.kompot.navigable.a) h5Var.e.get(), (rp0.m) h5Var.f.get());
                    case 2:
                        iq3.a aVar = h5Var.f118887a;
                        return new rp0.m();
                    case 3:
                        return e5f.b.x((c84.z) h5Var.f118897q.get());
                    case 4:
                        zVar = new c84.z((c84.g) h5Var.f118896p.get(), (rz3.c) c1Var.f118470r1.get(), (PluginFlowContract$Input) h5Var.i.get());
                        return zVar;
                    case 5:
                        PluginFlowContract$Input pluginFlowContract$Input = (PluginFlowContract$Input) h5Var.i.get();
                        e4m.e eVar = c1Var.f118470r1;
                        uq3.b bVar = c1Var.f118428c;
                        rz3.c cVar = (rz3.c) eVar.get();
                        xa4.a aVar2 = (xa4.a) h5Var.k.get();
                        xq3.j jVarH = bVar.h();
                        vc.s.j(jVarH);
                        mri.w wVarA = ((ozl.a) c1Var.u).a();
                        vc.s.j(wVarA);
                        ii4.o oVar = (ii4.o) h5Var.o.get();
                        aq3.a aVarE = bVar.e();
                        vc.s.j(aVarE);
                        return new c84.i(pluginFlowContract$Input, cVar, aVar2, jVarH, wVarA, oVar, aVarE);
                    case 6:
                        PluginFlowContract$Input pluginFlowContract$Input2 = (PluginFlowContract$Input) h5Var.i.get();
                        c1 c1Var2 = h5Var.f118889c;
                        return new xa4.b(pluginFlowContract$Input2, ImmutableSet.of((ya4.g) new ya4.c(c1Var2.i(), (ya4.f) h5Var.f118892j.get()), (ya4.g) new ya4.c(c1Var2.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) h5Var.f118892j.get()), new ya4.g(new py3.f())));
                    case 7:
                        rz3.c cVar2 = (rz3.c) c1Var.f118470r1.get();
                        xq3.j jVarH2 = c1Var.f118428c.h();
                        vc.s.j(jVarH2);
                        fVar = new ya4.f(cVar2, jVarH2);
                        return fVar;
                    case 8:
                        return new ii4.z((li4.a) h5Var.f118895n.get());
                    case 9:
                        return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) h5Var.f118893l.get(), li4.e.class, (li4.b) h5Var.f118894m.get()));
                    case 10:
                        xq3.j jVarH3 = c1Var.f118428c.h();
                        vc.s.j(jVarH3);
                        fVar = new li4.c(jVarH3);
                        return fVar;
                    case 11:
                        uq3.b bVar2 = c1Var.f118428c;
                        uq3.b bVar3 = c1Var.f118428c;
                        xq3.j jVarH4 = bVar2.h();
                        vc.s.j(jVarH4);
                        xq3.c cVarF = bVar3.f();
                        vc.s.j(cVarF);
                        sp3.a aVarM = bVar3.m();
                        vc.s.j(aVarM);
                        fVar = new ji4.b(jVarH4, cVarF, aVarM, c1Var.i());
                        return fVar;
                    case 12:
                        c84.z zVar4 = (c84.z) h5Var.f118897q.get();
                        e5f.b.a(zVar4);
                        return zVar4;
                    case 13:
                        PluginFlowContract$Input pluginFlowContract$Input3 = (PluginFlowContract$Input) h5Var.i.get();
                        xr3.y yVarK = c1Var.f118428c.k();
                        vc.s.j(yVarK);
                        zVar = new c84.c(pluginFlowContract$Input3, yVarK);
                        return zVar;
                    case 14:
                        QuestionnaireFlowContract$InputData questionnaireFlowContract$InputData = h5Var.f118888b;
                        PluginFlowContract$Input pluginFlowContract$Input4 = (PluginFlowContract$Input) h5Var.i.get();
                        c84.g gVar = (c84.g) h5Var.f118896p.get();
                        xa4.a aVar3 = (xa4.a) h5Var.k.get();
                        c1 c1Var3 = h5Var.f118889c;
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
                        return new vg4.d(questionnaireFlowContract$InputData, e5f.b.w(pluginFlowContract$Input4, gVar, aVar3, aVarB, cVarB, jVarD, wVarA2, jVar, iVarB));
                    default:
                        throw new AssertionError(i);
                }
            case 1:
                c1 c1Var4 = (c1) this.f118823b;
                k5 k5Var = (k5) this.d;
                int i2 = this.f118824c;
                switch (i2) {
                    case 0:
                        return ige.d.h(k5Var.f119116a, (j60.a) k5Var.f119119g.get());
                    case 1:
                        return com.revolut.data.database.models.openbanking.d.q(k5Var.f119116a, (com.revolut.kompot.navigable.a) k5Var.e.get(), (rp0.m) k5Var.f.get());
                    case 2:
                        iq3.a aVar4 = k5Var.f119116a;
                        return new rp0.m();
                    case 3:
                        return e5f.b.x((c84.z) k5Var.f119126q.get());
                    case 4:
                        zVar2 = new c84.z((c84.g) k5Var.f119125p.get(), (rz3.c) c1Var4.f118470r1.get(), (PluginFlowContract$Input) k5Var.i.get());
                        return zVar2;
                    case 5:
                        PluginFlowContract$Input pluginFlowContract$Input5 = (PluginFlowContract$Input) k5Var.i.get();
                        e4m.e eVar2 = c1Var4.f118470r1;
                        uq3.b bVar4 = c1Var4.f118428c;
                        rz3.c cVar3 = (rz3.c) eVar2.get();
                        xa4.a aVar5 = (xa4.a) k5Var.k.get();
                        xq3.j jVarH5 = bVar4.h();
                        vc.s.j(jVarH5);
                        mri.w wVarA3 = ((ozl.a) c1Var4.u).a();
                        vc.s.j(wVarA3);
                        ii4.o oVar2 = (ii4.o) k5Var.o.get();
                        aq3.a aVarE2 = bVar4.e();
                        vc.s.j(aVarE2);
                        return new c84.i(pluginFlowContract$Input5, cVar3, aVar5, jVarH5, wVarA3, oVar2, aVarE2);
                    case 6:
                        PluginFlowContract$Input pluginFlowContract$Input6 = (PluginFlowContract$Input) k5Var.i.get();
                        c1 c1Var5 = k5Var.f119118c;
                        return new xa4.b(pluginFlowContract$Input6, ImmutableSet.of((ya4.g) new ya4.c(c1Var5.i(), (ya4.f) k5Var.f119121j.get()), (ya4.g) new ya4.c(c1Var5.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) k5Var.f119121j.get()), new ya4.g(new py3.f())));
                    case 7:
                        rz3.c cVar4 = (rz3.c) c1Var4.f118470r1.get();
                        xq3.j jVarH6 = c1Var4.f118428c.h();
                        vc.s.j(jVarH6);
                        fVar2 = new ya4.f(cVar4, jVarH6);
                        return fVar2;
                    case 8:
                        return new ii4.z((li4.a) k5Var.f119124n.get());
                    case 9:
                        return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) k5Var.f119122l.get(), li4.e.class, (li4.b) k5Var.f119123m.get()));
                    case 10:
                        xq3.j jVarH7 = c1Var4.f118428c.h();
                        vc.s.j(jVarH7);
                        fVar2 = new li4.c(jVarH7);
                        return fVar2;
                    case 11:
                        uq3.b bVar5 = c1Var4.f118428c;
                        uq3.b bVar6 = c1Var4.f118428c;
                        xq3.j jVarH8 = bVar5.h();
                        vc.s.j(jVarH8);
                        xq3.c cVarF2 = bVar6.f();
                        vc.s.j(cVarF2);
                        sp3.a aVarM2 = bVar6.m();
                        vc.s.j(aVarM2);
                        fVar2 = new ji4.b(jVarH8, cVarF2, aVarM2, c1Var4.i());
                        return fVar2;
                    case 12:
                        c84.z zVar5 = (c84.z) k5Var.f119126q.get();
                        e5f.b.a(zVar5);
                        return zVar5;
                    case 13:
                        PluginFlowContract$Input pluginFlowContract$Input7 = (PluginFlowContract$Input) k5Var.i.get();
                        xr3.y yVarK2 = c1Var4.f118428c.k();
                        vc.s.j(yVarK2);
                        zVar2 = new c84.c(pluginFlowContract$Input7, yVarK2);
                        return zVar2;
                    case 14:
                        RefinancingAccountDetailsFlowContract$InputData refinancingAccountDetailsFlowContract$InputData = k5Var.f119117b;
                        c1 c1Var6 = k5Var.f119118c;
                        sf0.h hVarB = c1Var6.f118440g.b();
                        vc.s.j(hVarB);
                        ch4.b bVar7 = new ch4.b(hVarB);
                        PluginFlowContract$Input pluginFlowContract$Input8 = (PluginFlowContract$Input) k5Var.i.get();
                        c84.g gVar2 = (c84.g) k5Var.f119125p.get();
                        xa4.a aVar6 = (xa4.a) k5Var.k.get();
                        gte.a aVarB2 = c1Var6.f118423b.b();
                        vc.s.j(aVarB2);
                        hz3.c cVarB2 = c1Var6.b();
                        xq3.j jVarD2 = c1Var6.f118428c.d();
                        vc.s.j(jVarD2);
                        mri.w wVarA4 = ((ozl.a) c1Var6.u).a();
                        vc.s.j(wVarA4);
                        hy3.j jVar2 = (hy3.j) c1Var6.Q1.get();
                        vie.i iVarB2 = c1Var6.z.b();
                        vc.s.j(iVarB2);
                        return new com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.a(refinancingAccountDetailsFlowContract$InputData, bVar7, e5f.b.w(pluginFlowContract$Input8, gVar2, aVar6, aVarB2, cVarB2, jVarD2, wVarA4, jVar2, iVarB2));
                    default:
                        throw new AssertionError(i2);
                }
            case 2:
                c1 c1Var7 = (c1) this.f118823b;
                m5 m5Var = (m5) this.d;
                int i3 = this.f118824c;
                switch (i3) {
                    case 0:
                        return ige.d.h(m5Var.f119278a, (j60.a) m5Var.f119281g.get());
                    case 1:
                        return com.revolut.data.database.models.openbanking.d.q(m5Var.f119278a, (com.revolut.kompot.navigable.a) m5Var.e.get(), (rp0.m) m5Var.f.get());
                    case 2:
                        iq3.a aVar7 = m5Var.f119278a;
                        return new rp0.m();
                    case 3:
                        return e5f.b.x((c84.z) m5Var.f119288q.get());
                    case 4:
                        return new c84.z((c84.g) m5Var.f119287p.get(), (rz3.c) c1Var7.f118470r1.get(), (PluginFlowContract$Input) m5Var.i.get());
                    case 5:
                        PluginFlowContract$Input pluginFlowContract$Input9 = (PluginFlowContract$Input) m5Var.i.get();
                        e4m.e eVar3 = c1Var7.f118470r1;
                        uq3.b bVar8 = c1Var7.f118428c;
                        rz3.c cVar5 = (rz3.c) eVar3.get();
                        xa4.a aVar8 = (xa4.a) m5Var.k.get();
                        xq3.j jVarH9 = bVar8.h();
                        vc.s.j(jVarH9);
                        mri.w wVarA5 = ((ozl.a) c1Var7.u).a();
                        vc.s.j(wVarA5);
                        ii4.o oVar3 = (ii4.o) m5Var.o.get();
                        aq3.a aVarE3 = bVar8.e();
                        vc.s.j(aVarE3);
                        return new c84.i(pluginFlowContract$Input9, cVar5, aVar8, jVarH9, wVarA5, oVar3, aVarE3);
                    case 6:
                        PluginFlowContract$Input pluginFlowContract$Input10 = (PluginFlowContract$Input) m5Var.i.get();
                        c1 c1Var8 = m5Var.f119280c;
                        return new xa4.b(pluginFlowContract$Input10, ImmutableSet.of((ya4.g) new ya4.c(c1Var8.i(), (ya4.f) m5Var.f119283j.get()), (ya4.g) new ya4.c(c1Var8.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) m5Var.f119283j.get()), new ya4.g(new py3.f())));
                    case 7:
                        rz3.c cVar6 = (rz3.c) c1Var7.f118470r1.get();
                        xq3.j jVarH10 = c1Var7.f118428c.h();
                        vc.s.j(jVarH10);
                        return new ya4.f(cVar6, jVarH10);
                    case 8:
                        return new ii4.z((li4.a) m5Var.f119286n.get());
                    case 9:
                        return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) m5Var.f119284l.get(), li4.e.class, (li4.b) m5Var.f119285m.get()));
                    case 10:
                        xq3.j jVarH11 = c1Var7.f118428c.h();
                        vc.s.j(jVarH11);
                        return new li4.c(jVarH11);
                    case 11:
                        uq3.b bVar9 = c1Var7.f118428c;
                        uq3.b bVar10 = c1Var7.f118428c;
                        xq3.j jVarH12 = bVar9.h();
                        vc.s.j(jVarH12);
                        xq3.c cVarF3 = bVar10.f();
                        vc.s.j(cVarF3);
                        sp3.a aVarM3 = bVar10.m();
                        vc.s.j(aVarM3);
                        return new ji4.b(jVarH12, cVarF3, aVarM3, c1Var7.i());
                    case 12:
                        c84.z zVar6 = (c84.z) m5Var.f119288q.get();
                        e5f.b.a(zVar6);
                        return zVar6;
                    case 13:
                        PluginFlowContract$Input pluginFlowContract$Input11 = (PluginFlowContract$Input) m5Var.i.get();
                        xr3.y yVarK3 = c1Var7.f118428c.k();
                        vc.s.j(yVarK3);
                        return new c84.c(pluginFlowContract$Input11, yVarK3);
                    case 14:
                        RefinancingAccountDetailsInputFlowContract$InputData refinancingAccountDetailsInputFlowContract$InputData = m5Var.f119279b;
                        sf0.h hVarB2 = m5Var.f119280c.f118440g.b();
                        vc.s.j(hVarB2);
                        return new com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.input.b(refinancingAccountDetailsInputFlowContract$InputData, new ch4.b(hVarB2), (ay3.a) c1Var7.f118442g2.get(), (c84.g) m5Var.f119287p.get());
                    default:
                        throw new AssertionError(i3);
                }
            case 3:
                c1 c1Var9 = (c1) this.f118823b;
                o5 o5Var = (o5) this.d;
                int i5 = this.f118824c;
                switch (i5) {
                    case 0:
                        return f0k.d.p((e60.a) o5Var.f119452l.get());
                    case 1:
                        com.revolut.kompot.navigable.a aVar9 = (com.revolut.kompot.navigable.a) o5Var.d.get();
                        g60.a aVarA = f60.v.a((com.revolut.kompot.navigable.a) o5Var.d.get());
                        Activity activityA = f60.t.a((com.revolut.kompot.navigable.a) o5Var.d.get());
                        t80.g gVar3 = (t80.g) o5Var.e.get();
                        com.revolut.kompot.navigable.a aVar10 = (com.revolut.kompot.navigable.a) o5Var.d.get();
                        f60.y.a(aVar10);
                        d4m.a aVarA2 = e4m.b.a(o5Var.f);
                        nli.a aVar11 = new nli.a((t80.c) o5Var.f119449g.get(), f60.t.a((com.revolut.kompot.navigable.a) o5Var.d.get()));
                        t80.g gVar4 = (t80.g) o5Var.e.get();
                        zk0.b bVarL = o5Var.f119447b.f118443h.l();
                        vc.s.j(bVarL);
                        return v1.c.q(aVar9, new t80.v(aVarA, activityA, gVar3, aVar10, aVarA2, aVar11, new oli.c(gVar4, bVarL, new nli.a((t80.c) o5Var.f119449g.get(), f60.t.a((com.revolut.kompot.navigable.a) o5Var.d.get())), f60.v.a((com.revolut.kompot.navigable.a) o5Var.d.get()), o5Var.j()), new oli.g(f60.u.a(f60.t.a((com.revolut.kompot.navigable.a) o5Var.d.get())), v1.c.e((com.revolut.kompot.navigable.a) o5Var.d.get()), new ami.n(e4m.b.a(o5Var.f119450h), 1), e4m.b.a(o5Var.f), (t80.g) o5Var.e.get(), new nli.a((t80.c) o5Var.f119449g.get(), f60.t.a((com.revolut.kompot.navigable.a) o5Var.d.get())), new i90.b(), o5Var.b(), o5Var.j()), o5Var.j()), f60.x.a(), (rp0.m) o5Var.i.get(), (e60.t) o5Var.k.get());
                    case 2:
                        l70.e eVar4 = c1Var9.f118443h;
                        l70.e eVar5 = c1Var9.f118443h;
                        f80.a aVarX = eVar4.x();
                        vc.s.j(aVarX);
                        l80.e eVarH = eVar5.h();
                        vc.s.j(eVarH);
                        zk0.b bVarL2 = eVar5.l();
                        vc.s.j(bVarL2);
                        return new t80.b(aVarX, eVarH, bVarL2);
                    case 3:
                        com.revolut.kompot.navigable.a aVar12 = (com.revolut.kompot.navigable.a) o5Var.d.get();
                        f60.y.a(aVar12);
                        return pli.c.a(new ks0.n(aVar12));
                    case 4:
                        bh4.b.Companion.getClass();
                        return new t80.c(new e.a("RefinancingAccountDetails"), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
                    case 5:
                        return t96.a.a();
                    case 6:
                        return f60.z.a();
                    case 7:
                        aii.o oVar4 = (aii.o) o5Var.f119451j.get();
                        y80.a aVarR = c1Var9.f118443h.r();
                        vc.s.j(aVarR);
                        yVar = new e60.y(oVar4, aVarR, o5Var.b(), Optional.empty());
                        break;
                    case 8:
                        return com.revolut.data.database.models.openbanking.d.u(c1Var9.f118443h, (com.revolut.kompot.navigable.a) o5Var.d.get());
                    case 9:
                        e60.t tVar = (e60.t) o5Var.k.get();
                        f60.w.a(tVar);
                        return tVar;
                    case 10:
                        lx4.a aVarE4 = c1Var9.f118489y.e();
                        return new kx4.a(aVarE4, com.revolut.data.database.models.openbanking.d.v(aVarE4), ((s41.a) c1Var9.f118485x).d());
                    case 11:
                        RefinancingAccountDocumentsScreenContract$InputData refinancingAccountDocumentsScreenContract$InputData = o5Var.f119446a;
                        e60.a aVar13 = (e60.a) o5Var.f119452l.get();
                        cx4.a aVar14 = (cx4.a) o5Var.f119455p.get();
                        ay3.a aVar15 = (ay3.a) c1Var9.f118442g2.get();
                        asi.d dVarC = ((j51.a) c1Var9.K).c();
                        vc.s.j(dVarC);
                        yVar = new ah4.h(refinancingAccountDocumentsScreenContract$InputData, aVar13, aVar14, aVar15, dVarC, c1Var9.c(), (cli.n) o5Var.f119456q.get());
                        break;
                    case 12:
                        return new ah4.o(c1Var9.f118489y.b());
                    default:
                        throw new AssertionError(i5);
                }
                return yVar;
            case 4:
                c1 c1Var10 = (c1) this.f118823b;
                p5 p5Var = (p5) this.d;
                int i6 = this.f118824c;
                switch (i6) {
                    case 0:
                        return ige.d.h(p5Var.f119511a, (j60.a) p5Var.f119514g.get());
                    case 1:
                        return com.revolut.data.database.models.openbanking.d.q(p5Var.f119511a, (com.revolut.kompot.navigable.a) p5Var.e.get(), (rp0.m) p5Var.f.get());
                    case 2:
                        iq3.a aVar16 = p5Var.f119511a;
                        return new rp0.m();
                    case 3:
                        return e5f.b.x((c84.z) p5Var.f119521q.get());
                    case 4:
                        zVar3 = new c84.z((c84.g) p5Var.f119520p.get(), (rz3.c) c1Var10.f118470r1.get(), (PluginFlowContract$Input) p5Var.i.get());
                        return zVar3;
                    case 5:
                        PluginFlowContract$Input pluginFlowContract$Input12 = (PluginFlowContract$Input) p5Var.i.get();
                        e4m.e eVar6 = c1Var10.f118470r1;
                        uq3.b bVar11 = c1Var10.f118428c;
                        rz3.c cVar7 = (rz3.c) eVar6.get();
                        xa4.a aVar17 = (xa4.a) p5Var.k.get();
                        xq3.j jVarH13 = bVar11.h();
                        vc.s.j(jVarH13);
                        mri.w wVarA6 = ((ozl.a) c1Var10.u).a();
                        vc.s.j(wVarA6);
                        ii4.o oVar5 = (ii4.o) p5Var.o.get();
                        aq3.a aVarE5 = bVar11.e();
                        vc.s.j(aVarE5);
                        return new c84.i(pluginFlowContract$Input12, cVar7, aVar17, jVarH13, wVarA6, oVar5, aVarE5);
                    case 6:
                        PluginFlowContract$Input pluginFlowContract$Input13 = (PluginFlowContract$Input) p5Var.i.get();
                        c1 c1Var11 = p5Var.f119513c;
                        return new xa4.b(pluginFlowContract$Input13, ImmutableSet.of((ya4.g) new ya4.c(c1Var11.i(), (ya4.f) p5Var.f119516j.get()), (ya4.g) new ya4.c(c1Var11.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) p5Var.f119516j.get()), new ya4.g(new py3.f())));
                    case 7:
                        rz3.c cVar8 = (rz3.c) c1Var10.f118470r1.get();
                        xq3.j jVarH14 = c1Var10.f118428c.h();
                        vc.s.j(jVarH14);
                        fVar3 = new ya4.f(cVar8, jVarH14);
                        return fVar3;
                    case 8:
                        return new ii4.z((li4.a) p5Var.f119519n.get());
                    case 9:
                        return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) p5Var.f119517l.get(), li4.e.class, (li4.b) p5Var.f119518m.get()));
                    case 10:
                        xq3.j jVarH15 = c1Var10.f118428c.h();
                        vc.s.j(jVarH15);
                        fVar3 = new li4.c(jVarH15);
                        return fVar3;
                    case 11:
                        uq3.b bVar12 = c1Var10.f118428c;
                        uq3.b bVar13 = c1Var10.f118428c;
                        xq3.j jVarH16 = bVar12.h();
                        vc.s.j(jVarH16);
                        xq3.c cVarF4 = bVar13.f();
                        vc.s.j(cVarF4);
                        sp3.a aVarM4 = bVar13.m();
                        vc.s.j(aVarM4);
                        fVar3 = new ji4.b(jVarH16, cVarF4, aVarM4, c1Var10.i());
                        return fVar3;
                    case 12:
                        c84.z zVar7 = (c84.z) p5Var.f119521q.get();
                        e5f.b.a(zVar7);
                        return zVar7;
                    case 13:
                        PluginFlowContract$Input pluginFlowContract$Input14 = (PluginFlowContract$Input) p5Var.i.get();
                        xr3.y yVarK4 = c1Var10.f118428c.k();
                        vc.s.j(yVarK4);
                        zVar3 = new c84.c(pluginFlowContract$Input14, yVarK4);
                        return zVar3;
                    case 14:
                        RefinancingOfferFlowContract$InputData refinancingOfferFlowContract$InputData = p5Var.f119512b;
                        kh4.g gVar5 = (kh4.g) p5Var.f119525w.get();
                        ff4.t tVar2 = (ff4.t) p5Var.f119526x.get();
                        PluginFlowContract$Input pluginFlowContract$Input15 = (PluginFlowContract$Input) p5Var.i.get();
                        c84.g gVar6 = (c84.g) p5Var.f119520p.get();
                        xa4.a aVar18 = (xa4.a) p5Var.k.get();
                        c1 c1Var12 = p5Var.f119513c;
                        gte.a aVarB3 = c1Var12.f118423b.b();
                        vc.s.j(aVarB3);
                        hz3.c cVarB3 = c1Var12.b();
                        xq3.j jVarD3 = c1Var12.f118428c.d();
                        vc.s.j(jVarD3);
                        mri.w wVarA7 = ((ozl.a) c1Var12.u).a();
                        vc.s.j(wVarA7);
                        hy3.j jVar3 = (hy3.j) c1Var12.Q1.get();
                        vie.i iVarB3 = c1Var12.z.b();
                        vc.s.j(iVarB3);
                        return new com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.b(refinancingOfferFlowContract$InputData, gVar5, tVar2, e5f.b.w(pluginFlowContract$Input15, gVar6, aVar18, aVarB3, cVarB3, jVarD3, wVarA7, jVar3, iVarB3));
                    case 15:
                        by3.a aVar19 = (by3.a) c1Var10.e2.get();
                        ha3.f fVarD = c1Var10.f118474t.d();
                        vc.s.j(fVarD);
                        zVar3 = new kh4.g(aVar19, fVarD, (ne0.j) p5Var.u.get());
                        return zVar3;
                    case 16:
                        lh4.b.Companion.getClass();
                        return new ne0.d();
                    default:
                        throw new AssertionError(i6);
                }
            case 5:
                c1 c1Var13 = (c1) this.f118823b;
                q5 q5Var = (q5) this.d;
                int i21 = this.f118824c;
                switch (i21) {
                    case 0:
                        return ige.d.h(q5Var.f119583a, (j60.a) q5Var.f119586g.get());
                    case 1:
                        return com.revolut.data.database.models.openbanking.d.q(q5Var.f119583a, (com.revolut.kompot.navigable.a) q5Var.e.get(), (rp0.m) q5Var.f.get());
                    case 2:
                        iq3.a aVar20 = q5Var.f119583a;
                        return new rp0.m();
                    case 3:
                        return e5f.b.x((c84.z) q5Var.f119593q.get());
                    case 4:
                        return new c84.z((c84.g) q5Var.f119592p.get(), (rz3.c) c1Var13.f118470r1.get(), (PluginFlowContract$Input) q5Var.i.get());
                    case 5:
                        PluginFlowContract$Input pluginFlowContract$Input16 = (PluginFlowContract$Input) q5Var.i.get();
                        e4m.e eVar7 = c1Var13.f118470r1;
                        uq3.b bVar14 = c1Var13.f118428c;
                        rz3.c cVar9 = (rz3.c) eVar7.get();
                        xa4.a aVar21 = (xa4.a) q5Var.k.get();
                        xq3.j jVarH17 = bVar14.h();
                        vc.s.j(jVarH17);
                        mri.w wVarA8 = ((ozl.a) c1Var13.u).a();
                        vc.s.j(wVarA8);
                        ii4.o oVar6 = (ii4.o) q5Var.o.get();
                        aq3.a aVarE6 = bVar14.e();
                        vc.s.j(aVarE6);
                        return new c84.i(pluginFlowContract$Input16, cVar9, aVar21, jVarH17, wVarA8, oVar6, aVarE6);
                    case 6:
                        PluginFlowContract$Input pluginFlowContract$Input17 = (PluginFlowContract$Input) q5Var.i.get();
                        c1 c1Var14 = q5Var.f119585c;
                        return new xa4.b(pluginFlowContract$Input17, ImmutableSet.of((ya4.g) new ya4.c(c1Var14.i(), (ya4.f) q5Var.f119588j.get()), (ya4.g) new ya4.c(c1Var14.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) q5Var.f119588j.get()), new ya4.g(new py3.f())));
                    case 7:
                        rz3.c cVar10 = (rz3.c) c1Var13.f118470r1.get();
                        xq3.j jVarH18 = c1Var13.f118428c.h();
                        vc.s.j(jVarH18);
                        return new ya4.f(cVar10, jVarH18);
                    case 8:
                        return new ii4.z((li4.a) q5Var.f119591n.get());
                    case 9:
                        return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) q5Var.f119589l.get(), li4.e.class, (li4.b) q5Var.f119590m.get()));
                    case 10:
                        xq3.j jVarH19 = c1Var13.f118428c.h();
                        vc.s.j(jVarH19);
                        return new li4.c(jVarH19);
                    case 11:
                        uq3.b bVar15 = c1Var13.f118428c;
                        uq3.b bVar16 = c1Var13.f118428c;
                        xq3.j jVarH20 = bVar15.h();
                        vc.s.j(jVarH20);
                        xq3.c cVarF5 = bVar16.f();
                        vc.s.j(cVarF5);
                        sp3.a aVarM5 = bVar16.m();
                        vc.s.j(aVarM5);
                        return new ji4.b(jVarH20, cVarF5, aVarM5, c1Var13.i());
                    case 12:
                        c84.z zVar8 = (c84.z) q5Var.f119593q.get();
                        e5f.b.a(zVar8);
                        return zVar8;
                    case 13:
                        PluginFlowContract$Input pluginFlowContract$Input18 = (PluginFlowContract$Input) q5Var.i.get();
                        xr3.y yVarK5 = c1Var13.f118428c.k();
                        vc.s.j(yVarK5);
                        return new c84.c(pluginFlowContract$Input18, yVarK5);
                    case 14:
                        RejectedLazyFlowContract$InputData rejectedLazyFlowContract$InputData = q5Var.f119584b;
                        xq3.j jVarD4 = c1Var13.f118428c.d();
                        vc.s.j(jVarD4);
                        hw3.c cVar11 = (hw3.c) c1Var13.f118472s0.get();
                        hz3.c cVarB4 = c1Var13.b();
                        wli.x xVarD = ((s41.a) c1Var13.f118485x).d();
                        sp3.a aVarM6 = c1Var13.f118428c.m();
                        vc.s.j(aVarM6);
                        mri.w wVarA9 = ((ozl.a) c1Var13.u).a();
                        vc.s.j(wVarA9);
                        PluginFlowContract$Input pluginFlowContract$Input19 = (PluginFlowContract$Input) q5Var.i.get();
                        c84.g gVar7 = (c84.g) q5Var.f119592p.get();
                        xa4.a aVar22 = (xa4.a) q5Var.k.get();
                        c1 c1Var15 = q5Var.f119585c;
                        gte.a aVarB4 = c1Var15.f118423b.b();
                        vc.s.j(aVarB4);
                        hz3.c cVarB5 = c1Var15.b();
                        xq3.j jVarD5 = c1Var15.f118428c.d();
                        vc.s.j(jVarD5);
                        mri.w wVarA10 = ((ozl.a) c1Var15.u).a();
                        vc.s.j(wVarA10);
                        hy3.j jVar4 = (hy3.j) c1Var15.Q1.get();
                        vie.i iVarB4 = c1Var15.z.b();
                        vc.s.j(iVarB4);
                        return new com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.d(rejectedLazyFlowContract$InputData, jVarD4, cVar11, cVarB4, xVarD, aVarM6, wVarA9, e5f.b.w(pluginFlowContract$Input19, gVar7, aVar22, aVarB4, cVarB5, jVarD5, wVarA10, jVar4, iVarB4));
                    default:
                        throw new AssertionError(i21);
                }
            case 6:
                c1 c1Var16 = (c1) this.f118823b;
                r5 r5Var = (r5) this.d;
                int i22 = this.f118824c;
                switch (i22) {
                    case 0:
                        return ige.d.h(r5Var.f119664a, (j60.a) r5Var.f119667g.get());
                    case 1:
                        return com.revolut.data.database.models.openbanking.d.q(r5Var.f119664a, (com.revolut.kompot.navigable.a) r5Var.e.get(), (rp0.m) r5Var.f.get());
                    case 2:
                        iq3.a aVar23 = r5Var.f119664a;
                        return new rp0.m();
                    case 3:
                        return e5f.b.x((c84.z) r5Var.f119674q.get());
                    case 4:
                        return new c84.z((c84.g) r5Var.f119673p.get(), (rz3.c) c1Var16.f118470r1.get(), (PluginFlowContract$Input) r5Var.i.get());
                    case 5:
                        PluginFlowContract$Input pluginFlowContract$Input20 = (PluginFlowContract$Input) r5Var.i.get();
                        e4m.e eVar8 = c1Var16.f118470r1;
                        uq3.b bVar17 = c1Var16.f118428c;
                        rz3.c cVar12 = (rz3.c) eVar8.get();
                        xa4.a aVar24 = (xa4.a) r5Var.k.get();
                        xq3.j jVarH21 = bVar17.h();
                        vc.s.j(jVarH21);
                        mri.w wVarA11 = ((ozl.a) c1Var16.u).a();
                        vc.s.j(wVarA11);
                        ii4.o oVar7 = (ii4.o) r5Var.o.get();
                        aq3.a aVarE7 = bVar17.e();
                        vc.s.j(aVarE7);
                        return new c84.i(pluginFlowContract$Input20, cVar12, aVar24, jVarH21, wVarA11, oVar7, aVarE7);
                    case 6:
                        PluginFlowContract$Input pluginFlowContract$Input21 = (PluginFlowContract$Input) r5Var.i.get();
                        c1 c1Var17 = r5Var.f119666c;
                        return new xa4.b(pluginFlowContract$Input21, ImmutableSet.of((ya4.g) new ya4.c(c1Var17.i(), (ya4.f) r5Var.f119669j.get()), (ya4.g) new ya4.c(c1Var17.b(), new py3.g()), (ya4.g) new ya4.c(new py3.c(), (ya4.f) r5Var.f119669j.get()), new ya4.g(new py3.f())));
                    case 7:
                        rz3.c cVar13 = (rz3.c) c1Var16.f118470r1.get();
                        xq3.j jVarH22 = c1Var16.f118428c.h();
                        vc.s.j(jVarH22);
                        return new ya4.f(cVar13, jVarH22);
                    case 8:
                        return new ii4.z((li4.a) r5Var.f119672n.get());
                    case 9:
                        return new li4.a(ImmutableMap.of(li4.d.class, (li4.b) r5Var.f119670l.get(), li4.e.class, (li4.b) r5Var.f119671m.get()));
                    case 10:
                        xq3.j jVarH23 = c1Var16.f118428c.h();
                        vc.s.j(jVarH23);
                        return new li4.c(jVarH23);
                    case 11:
                        uq3.b bVar18 = c1Var16.f118428c;
                        uq3.b bVar19 = c1Var16.f118428c;
                        xq3.j jVarH24 = bVar18.h();
                        vc.s.j(jVarH24);
                        xq3.c cVarF6 = bVar19.f();
                        vc.s.j(cVarF6);
                        sp3.a aVarM7 = bVar19.m();
                        vc.s.j(aVarM7);
                        return new ji4.b(jVarH24, cVarF6, aVarM7, c1Var16.i());
                    case 12:
                        c84.z zVar9 = (c84.z) r5Var.f119674q.get();
                        e5f.b.a(zVar9);
                        return zVar9;
                    case 13:
                        PluginFlowContract$Input pluginFlowContract$Input22 = (PluginFlowContract$Input) r5Var.i.get();
                        xr3.y yVarK6 = c1Var16.f118428c.k();
                        vc.s.j(yVarK6);
                        return new c84.c(pluginFlowContract$Input22, yVarK6);
                    case 14:
                        RejectedRootFlowContract$InputData rejectedRootFlowContract$InputData = r5Var.f119665b;
                        wli.x xVarD2 = ((s41.a) c1Var16.f118485x).d();
                        sp3.a aVarM8 = c1Var16.f118428c.m();
                        vc.s.j(aVarM8);
                        mri.w wVarA12 = ((ozl.a) c1Var16.u).a();
                        vc.s.j(wVarA12);
                        PluginFlowContract$Input pluginFlowContract$Input23 = (PluginFlowContract$Input) r5Var.i.get();
                        c84.g gVar8 = (c84.g) r5Var.f119673p.get();
                        xa4.a aVar25 = (xa4.a) r5Var.k.get();
                        c1 c1Var18 = r5Var.f119666c;
                        gte.a aVarB5 = c1Var18.f118423b.b();
                        vc.s.j(aVarB5);
                        hz3.c cVarB6 = c1Var18.b();
                        xq3.j jVarD6 = c1Var18.f118428c.d();
                        vc.s.j(jVarD6);
                        mri.w wVarA13 = ((ozl.a) c1Var18.u).a();
                        vc.s.j(wVarA13);
                        hy3.j jVar5 = (hy3.j) c1Var18.Q1.get();
                        vie.i iVarB5 = c1Var18.z.b();
                        vc.s.j(iVarB5);
                        return new com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.e(rejectedRootFlowContract$InputData, xVarD2, aVarM8, wVarA12, e5f.b.w(pluginFlowContract$Input23, gVar8, aVar25, aVarB5, cVarB6, jVarD6, wVarA13, jVar5, iVarB5));
                    default:
                        throw new AssertionError(i22);
                }
            case 7:
                return a();
            case 8:
                return b();
            case 9:
                return c();
            case 10:
                int i32 = this.f118824c;
                if (i32 == 0) {
                    return new sk4.e(((c1) this.f118823b).f118452l.b(), (jki.p) ((b6) this.d).f118377a.get());
                }
                if (i32 == 1) {
                    return new sk4.j();
                }
                throw new AssertionError(i32);
            case 11:
                return d();
            case 12:
                return e();
            case 13:
                return f();
            case 14:
                m6 m6Var = (m6) this.d;
                int i33 = this.f118824c;
                if (i33 == 0) {
                    return e5f.b.e((com.revolut.kompot.navigable.a) m6Var.f119294c.get(), (c84.b) m6Var.e.get(), (PluginFlowContract$Input) ((h4) this.f118823b).i.get());
                }
                if (i33 == 1) {
                    return new c84.b();
                }
                if (i33 != 2) {
                    throw new AssertionError(i33);
                }
                return new com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signing_methods_info.a(new xe4.k(new gi0.a(), m6Var.f119293b.f118482w.b()), new xe4.h(m6Var.f119292a));
            case 15:
                return g();
            case 16:
                return h();
            case 17:
                return i();
            case 18:
                return j();
            case 19:
                return k();
            case 20:
                return l();
            case 21:
                return m();
            case 22:
                return n();
            case 23:
                return o();
            case 24:
                return p();
            case 25:
                return q();
            case 26:
                return r();
            case 27:
                return s();
            case 28:
                return t();
            default:
                u7 u7Var = (u7) this.d;
                c1 c1Var19 = (c1) this.f118823b;
                l70.e eVar9 = c1Var19.f118443h;
                nj0.a aVar26 = c1Var19.d;
                int i43 = this.f118824c;
                if (i43 == 0) {
                    return new a84.e((a84.b) u7Var.d.get());
                }
                if (i43 == 1) {
                    return agk.b.l(u7Var.f119938b);
                }
                if (i43 == 2) {
                    hk0.a aVarJ = ((nj0.d) aVar26).j();
                    zk0.b bVarL3 = eVar9.l();
                    vc.s.j(bVarL3);
                    n80.d dVarA = eVar9.a();
                    vc.s.j(dVarA);
                    return new y74.d(aVarJ, bVarL3, dVarA, c1Var19.f118482w.e());
                }
                if (i43 != 3) {
                    if (i43 == 4) {
                        return new v44.q(new mx4.r());
                    }
                    throw new AssertionError(i43);
                }
                cli.n nVar = (cli.n) u7Var.f119940g.get();
                CreditApplicationDocumentViewerScreenContract$InputData creditApplicationDocumentViewerScreenContract$InputData = u7Var.f119939c;
                y74.a aVar27 = (y74.a) u7Var.f.get();
                hz3.c cVarB7 = c1Var19.b();
                bk0.e eVarH2 = ((nj0.d) aVar26).h();
                gte.a aVarB6 = c1Var19.f118423b.b();
                vc.s.j(aVarB6);
                return new v44.n(nVar, creditApplicationDocumentViewerScreenContract$InputData, aVar27, cVarB7, eVarH2, aVarB6);
        }
    }
}

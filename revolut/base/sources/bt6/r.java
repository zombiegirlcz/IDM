package bt6;

import android.content.Context;
import com.revolut.feature.apm.blik.impl.ui.terms_acceptance.BlikTermsAcceptanceFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.credit_health.flow.CreditHealthFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.drop_out_form.DropOutFormFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.post_retail_onboarding.CreditCardPostRetailOnboardingFlowContract$InputData;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.TaxHubCreateProfileScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.tax_reminder.TaxHubReminderScreenContract$InputData;
import com.revolut.feature.insurance_credit.impl.ui.flow.InsuranceCreditFlowContract$InputData;
import com.revolut.feature.onboarding.impl.missinginfo.MissingInfoFlowContract$InputData;
import com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.flow.unlock_benefits.UnlockBenefitsFlowContract$InputData;
import com.revolut.feature.select.payment.impl.ui.flow.SelectPaymentFlowContract$InputData;
import com.revolut.feature.shared.invoices.impl.ui.invoice_preview.InvoicePreviewScreenContract$InputData;
import com.revolut.feature.shops.impl.flow.checkout.ModalCheckoutFlowContract$InputData;
import com.revolut.feature.shops.impl.flow.session.ShopsSessionFlowContract$InputData;
import com.revolut.feature.shops.impl.service.ShopsService;
import com.revolut.feature.shops.impl.ui.bid_flow.ShopsBidFlowContract$InputData;
import com.revolut.feature.shops.impl.ui.details.ShopsCampaignCheckoutScreenContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.AirportLoungePassDetailsFlowContract$InputData;
import cu8.r0;
import dw3.c1;
import dw3.g1;
import dw3.j1;
import dw3.q2;
import dw3.v3;
import et6.h1;
import et6.p1;
import et6.t0;
import kotlin.jvm.internal.Intrinsics;
import p7c.s0;
import qgk.k3;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qji.b f18378c;

    public /* synthetic */ r(Object obj2, qji.b bVar, int i) {
        this.f18376a = i;
        this.f18377b = obj2;
        this.f18378c = bVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f18376a) {
            case 0:
                b bVar = (b) this.f18377b;
                r10.f fVarD = bVar.d();
                ang.f fVarE = bVar.f18301m.e();
                TaxHubReminderScreenContract$InputData taxHubReminderScreenContract$InputData = ((s) this.f18378c).f18379a;
                t07.b taxTypeClauseFactory = new t07.b();
                Intrinsics.checkNotNullParameter(taxTypeClauseFactory, "taxTypeClauseFactory");
                return new b47.h(fVarD, fVarE, taxHubReminderScreenContract$InputData, new b47.j());
            case 1:
                i37.c cVar = new i37.c();
                b bVar2 = (b) this.f18377b;
                gr6.e eVarA = bVar2.f18294a.a();
                vc.s.j(eVarA);
                t tVar = (t) this.f18378c;
                hr6.l lVar = tVar.f18381a;
                r10.d dVarC = bVar2.c();
                a61.a aVarA = bVar2.a();
                zjh.i iVarE = bVar2.e();
                b bVar3 = tVar.f18382b;
                Context context = bVar3.f18298h;
                h37.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                phm.a aVar = (phm.a) ue0.e.j(context).a().get(djf.c.class);
                b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                if (aVar2 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", djf.c.class, " is not found"));
                }
                whf.b bVarA = ((djf.c) aVar2.b()).a();
                vc.s.k(bVarA);
                ang.f fVarE2 = bVar2.f18301m.e();
                j37.a aVar3 = new j37.a();
                x47.a aVar4 = new x47.a();
                i37.b bVar4 = new i37.b();
                x47.a aVar5 = new x47.a();
                i37.b bVar5 = new i37.b();
                l80.e eVarH = bVar3.i.h();
                vc.s.j(eVarH);
                j37.e eVar = new j37.e(aVar4, bVar4, new ft6.w(aVar5, bVar5, eVarH));
                gr6.e eVarA2 = bVar3.f18294a.a();
                vc.s.j(eVarA2);
                Context context2 = bVar3.f18298h;
                phm.a aVar6 = (phm.a) kii.e.l(context2, "context", context2, djf.c.class);
                b60.a aVar7 = aVar6 != null ? (b60.a) aVar6.get() : null;
                if (aVar7 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", djf.c.class, " is not found"));
                }
                thf.g gVarE = ((djf.c) aVar7.b()).e();
                vc.s.k(gVarE);
                return new com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.e(cVar, eVarA, lVar, dVarC, aVarA, iVarE, bVarA, fVarE2, new com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.f(aVar3, eVar, eVarA2, new j37.h(gVarE)));
            case 2:
                x xVar = (x) this.f18378c;
                return new com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.filter.a(xVar.f18393a, (gr6.q) ((y) this.f18377b).e.get(), new i47.r(new w47.b(xVar.f18394b)));
            case 3:
                b bVar6 = (b) this.f18377b;
                l80.e eVarH2 = bVar6.i.h();
                vc.s.j(eVarH2);
                q47.c cVar2 = new q47.c();
                gr6.m mVarB = bVar6.f18302n.b();
                vc.s.j(mVarB);
                l80.e eVarH3 = ((z) this.f18378c).f18399a.i.h();
                vc.s.j(eVarH3);
                o47.b bVar7 = new o47.b(eVarH3);
                zxd.c cVarA = ((eyd.b) bVar6.f18303p).a();
                vc.s.j(cVarA);
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) bVar6.f18305r).c();
                vc.s.j(aVarC);
                r47.a itemMapper = new r47.a();
                Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
                return new com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.f(eVarH2, cVar2, mVarB, bVar7, cVarA, aVarC, new n47.t());
            case 4:
                b bVar8 = (b) this.f18377b;
                a61.a aVarA2 = bVar8.a();
                r10.f fVarD2 = bVar8.d();
                zjh.f fVarB = bVar8.b();
                ang.f fVarE3 = bVar8.f18301m.e();
                w37.b bVar9 = new w37.b();
                e0 e0Var = (e0) this.f18378c;
                TaxHubCreateProfileScreenContract$InputData taxHubCreateProfileScreenContract$InputData = e0Var.f18329b;
                w37.b bVar10 = new w37.b();
                b bVar11 = e0Var.f18330c;
                l80.e eVarH4 = bVar11.i.h();
                vc.s.j(eVarH4);
                u37.v vVar = new u37.v(taxHubCreateProfileScreenContract$InputData, bVar10, eVarH4);
                l80.e eVarH5 = bVar8.i.h();
                vc.s.j(eVarH5);
                TaxHubCreateProfileScreenContract$InputData taxHubCreateProfileScreenContract$InputData2 = e0Var.f18329b;
                w37.b bVar12 = new w37.b();
                l80.e eVarH6 = bVar11.i.h();
                vc.s.j(eVarH6);
                return new com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.a(aVarA2, fVarD2, fVarB, fVarE3, bVar9, vVar, eVarH5, taxHubCreateProfileScreenContract$InputData2, new kxk.o(new u37.v(taxHubCreateProfileScreenContract$InputData2, bVar12, eVarH6), taxHubCreateProfileScreenContract$InputData));
            case 5:
                b bVar13 = (b) this.f18377b;
                a61.a aVarA3 = bVar13.a();
                r10.f fVarD3 = bVar13.d();
                zjh.f fVarB2 = bVar13.b();
                ang.f fVarE4 = bVar13.f18301m.e();
                w37.b bVar14 = new w37.b();
                e0 e0Var2 = (e0) this.f18378c;
                TaxHubCreateProfileScreenContract$InputData taxHubCreateProfileScreenContract$InputData3 = e0Var2.f18329b;
                w37.b bVar15 = new w37.b();
                b bVar16 = e0Var2.f18330c;
                l80.e eVarH7 = bVar16.i.h();
                vc.s.j(eVarH7);
                u37.v vVar2 = new u37.v(taxHubCreateProfileScreenContract$InputData3, bVar15, eVarH7);
                l80.e eVarH8 = bVar13.i.h();
                vc.s.j(eVarH8);
                TaxHubCreateProfileScreenContract$InputData taxHubCreateProfileScreenContract$InputData4 = e0Var2.f18329b;
                w37.b bVar17 = new w37.b();
                l80.e eVarH9 = bVar16.i.h();
                vc.s.j(eVarH9);
                return new com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.a(aVarA3, fVarD3, fVarB2, fVarE4, bVar14, vVar2, eVarH8, taxHubCreateProfileScreenContract$InputData4, new kxk.o(new u37.v(taxHubCreateProfileScreenContract$InputData4, bVar17, eVarH9), taxHubCreateProfileScreenContract$InputData3));
            case 6:
                InsuranceCreditFlowContract$InputData insuranceCreditFlowContract$InputData = ((bt7.j) this.f18378c).f18441a;
                bt7.i iVar = (bt7.i) this.f18377b;
                return new com.revolut.feature.insurance_credit.impl.ui.flow.a(insuranceCreditFlowContract$InputData, (js7.b) iVar.f18440y.get(), iVar.d.a(), iVar.f18427g.i());
            case 7:
                SelectPaymentFlowContract$InputData selectPaymentFlowContract$InputData = ((bxc.b) this.f18378c).f19662a;
                bxc.a aVar8 = (bxc.a) this.f18377b;
                y51.a aVarA4 = aVar8.f19659a.a();
                vc.s.j(aVarA4);
                return new com.revolut.feature.select.payment.impl.ui.flow.a(selectPaymentFlowContract$InputData, aVarA4, (cxc.a) aVar8.e.get());
            case 8:
                c43.q qVar = (c43.q) this.f18378c;
                l43.d dVar = qVar.f21074b;
                vtc.t tVar2 = ((c43.h) this.f18377b).f21022n;
                ptc.a aVar9 = (ptc.a) tVar2.Z.get();
                vc.s.j(aVar9);
                rul.e eVarC = tVar2.c();
                gte.a aVarB = qVar.f21075c.o.b();
                vc.s.j(aVarB);
                return new l43.m(dVar, aVar9, eVarC, new l43.l(aVarB));
            case 9:
                c43.q qVar2 = (c43.q) this.f18378c;
                l43.d dVar2 = qVar2.f21074b;
                vtc.t tVar3 = ((c43.h) this.f18377b).f21022n;
                ptc.a aVar10 = (ptc.a) tVar3.Z.get();
                vc.s.j(aVar10);
                rul.e eVarC2 = tVar3.c();
                gte.a aVarB2 = qVar2.f21075c.o.b();
                vc.s.j(aVarB2);
                return new l43.m(dVar2, aVar10, eVarC2, new l43.l(aVarB2));
            case 10:
                ca9.b bVar18 = (ca9.b) this.f18378c;
                MissingInfoFlowContract$InputData missingInfoFlowContract$InputData = bVar18.f22539a;
                y99.h hVar = bVar18.f22540b;
                ca9.a aVar11 = (ca9.a) this.f18377b;
                oai.i0 i0Var = aVar11.f22536a;
                aci.a aVar12 = (aci.a) i0Var.u.get();
                vc.s.j(aVar12);
                bci.d dVar3 = (bci.d) i0Var.v.get();
                vc.s.j(dVar3);
                return new com.revolut.feature.onboarding.impl.missinginfo.d(missingInfoFlowContract$InputData, hVar, aVar12, dVar3, aVar11.f22537b.e());
            case 11:
                cad.b bVar19 = (cad.b) this.f18378c;
                InvoicePreviewScreenContract$InputData invoicePreviewScreenContract$InputData = bVar19.f22601a;
                ys6.a aVar13 = ((cad.d) this.f18377b).f22606a;
                us6.q qVar3 = aVar13.f316414b;
                gr6.g gVar = (gr6.g) qVar3.f282713w0.get();
                vc.s.j(gVar);
                h1 h1VarN = qVar3.n();
                vc.s.j(h1VarN);
                gr6.i iVarA = aVar13.f316415c.a();
                vc.s.j(iVarA);
                t0 t0Var = new t0(gVar, h1VarN, iVarA);
                l6d.a aVar14 = (l6d.a) ((o6d.f) aVar13.d).e.get();
                vc.s.j(aVar14);
                p1 p1VarO = qVar3.o();
                vc.s.j(p1VarO);
                v60.g gVar2 = new v60.g(t0Var, aVar14, p1VarO);
                x80.a aVarQ = bVar19.f22602b.f22607b.q();
                vc.s.j(aVarQ);
                return new ead.o(invoicePreviewScreenContract$InputData, gVar2, new ead.q(aVarQ, new zt6.d()));
            case 12:
                return new iad.g(((cad.c) this.f18378c).f22604a, ((cad.d) this.f18377b).a(), new iad.h());
            case 13:
                cf7.i iVar2 = (cf7.i) this.f18378c;
                qg7.y yVar = new qg7.y(new tg7.c(), new tg7.b(iVar2.f23621b.f23577j.g()));
                cf7.b bVar20 = (cf7.b) this.f18377b;
                return new qg7.u(yVar, bVar20.a(), bVar20.o.b(), ((s41.a) bVar20.f23581p).d(), iVar2.f23620a, new sg7.a());
            case 14:
                cf7.j jVar = (cf7.j) this.f18378c;
                return new vg7.i(new vg7.k(jVar.f23624b.f23577j.g()), jVar.f23623a, ((cf7.b) this.f18377b).f23582q.a());
            case 15:
                cf7.b bVar21 = (cf7.b) this.f18377b;
                zxb.k0 k0Var = bVar21.f23580n;
                eub.i iVarE2 = k0Var.e();
                vc.s.j(iVarE2);
                nyb.k kVarC = k0Var.c();
                vc.s.j(kVarC);
                return new com.revolut.feature.incentive_reward.impl.ui.redeem_reward.flow.b(iVarE2, kVarC, bVar21.a(), ((cf7.k) this.f18378c).f23626a);
            case 16:
                UnlockBenefitsFlowContract$InputData unlockBenefitsFlowContract$InputData = ((cga.b) this.f18378c).f23892a;
                til.m mVarA = ((cga.a) this.f18377b).f23888b.a();
                vc.s.j(mVarA);
                return new com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.flow.unlock_benefits.a(unlockBenefitsFlowContract$InputData, mVarA);
            case 17:
                BlikTermsAcceptanceFlowContract$InputData blikTermsAcceptanceFlowContract$InputData = ((cu1.q) this.f18378c).f108774a;
                cu1.k kVar = (cu1.k) this.f18377b;
                eu1.a aVar15 = (eu1.a) kVar.z.get();
                wj0.a aVarI = ((nj0.d) kVar.e).i();
                vc.s.j(aVarI);
                return new com.revolut.feature.apm.blik.impl.ui.terms_acceptance.c(blikTermsAcceptanceFlowContract$InputData, aVar15, aVarI);
            case 18:
                cwi.b0 b0Var = (cwi.b0) this.f18378c;
                AirportLoungePassDetailsFlowContract$InputData airportLoungePassDetailsFlowContract$InputData = b0Var.f109637a;
                cwi.h0 h0Var = (cwi.h0) this.f18377b;
                cwi.x xVar2 = h0Var.f109695a;
                dwi.s sVarA = xVar2.a();
                vc.s.j(sVarA);
                dwi.a aVar16 = (dwi.a) xVar2.v.get();
                vc.s.j(aVar16);
                r0 r0VarA = h0Var.f109705q.a();
                mwi.a aVar17 = new mwi.a();
                qvi.c cVar3 = (qvi.c) xVar2.X.get();
                vc.s.j(cVar3);
                dwi.a0 a0VarB = xVar2.b();
                vc.s.j(a0VarB);
                ffk.t tVarF = h0Var.f109700j.f();
                vc.s.j(tVarF);
                cwi.h0 h0Var2 = b0Var.f109638b;
                l80.e eVarH10 = h0Var2.f.h();
                vc.s.j(eVarH10);
                eyi.b bVar22 = new eyi.b(eVarH10, ((k3) h0Var2.f109710x).b());
                qvi.d dVarD = xVar2.d();
                vc.s.j(dVarD);
                return new com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.e(airportLoungePassDetailsFlowContract$InputData, sVarA, aVar16, r0VarA, aVar17, cVar3, a0VarB, tVarF, bVar22, dVarD, ((s41.a) h0Var.d).d());
            case 19:
                dfb.b bVar23 = (dfb.b) this.f18377b;
                web.b bVar24 = (web.b) bVar23.f113835j.i.get();
                vc.s.j(bVar24);
                eub.i iVarE3 = bVar23.o.e();
                vc.s.j(iVarE3);
                return new com.revolut.feature.retail.reverywhere.impl.onboarding.a(bVar24, iVarE3, new hfb.l(), ((dfb.c) this.f18378c).f113844a);
            case 20:
                ModalCheckoutFlowContract$InputData modalCheckoutFlowContract$InputData = ((did.b) this.f18378c).f114985a;
                eub.e eVar2 = (eub.e) ((did.d) this.f18377b).f114997j.V.get();
                vc.s.j(eVar2);
                return new com.revolut.feature.shops.impl.flow.checkout.b(modalCheckoutFlowContract$InputData, eVar2);
            case 21:
                ShopsBidFlowContract$InputData shopsBidFlowContract$InputData = ((did.e) this.f18378c).f115009a;
                zja.a aVarA5 = ((ika.b) ((did.d) this.f18377b).k).a();
                vc.s.j(aVarA5);
                return new com.revolut.feature.shops.impl.ui.bid_flow.c(shopsBidFlowContract$InputData, aVarA5);
            case 22:
                did.f fVar = (did.f) this.f18378c;
                djd.h shopsCampaignInstructionsMapper = new djd.h();
                zid.b descriptionMapper = new zid.b();
                Intrinsics.checkNotNullParameter(descriptionMapper, "descriptionMapper");
                nd.l shopsCheckoutScreenTextsMapper = new nd.l();
                Intrinsics.checkNotNullParameter(shopsCheckoutScreenTextsMapper, "shopsCheckoutScreenTextsMapper");
                djd.a shopsCampaignCheckoutButtonMapper = new djd.a();
                hjd.z shopsTagViewDataMapper = new hjd.z();
                djd.f countriesRowMapper = new djd.f();
                Intrinsics.checkNotNullParameter(shopsTagViewDataMapper, "shopsTagViewDataMapper");
                Intrinsics.checkNotNullParameter(countriesRowMapper, "countriesRowMapper");
                djd.c shopsCampaignCheckoutDescriptionMapper = new djd.c();
                djd.g shopsCampaignInstalmentInfoMapper = new djd.g();
                pjd.b termsAndConditionsProvider = new pjd.b();
                Intrinsics.checkNotNullParameter(shopsCampaignInstructionsMapper, "shopsCampaignInstructionsMapper");
                Intrinsics.checkNotNullParameter(shopsCampaignCheckoutButtonMapper, "shopsCampaignCheckoutButtonMapper");
                Intrinsics.checkNotNullParameter(shopsCampaignCheckoutDescriptionMapper, "shopsCampaignCheckoutDescriptionMapper");
                Intrinsics.checkNotNullParameter(shopsCampaignInstalmentInfoMapper, "shopsCampaignInstalmentInfoMapper");
                Intrinsics.checkNotNullParameter(termsAndConditionsProvider, "termsAndConditionsProvider");
                djd.d shopsCampaignContentMapper = new djd.d();
                Intrinsics.checkNotNullParameter(shopsCampaignContentMapper, "shopsCampaignContentMapper");
                cjd.s sVar = new cjd.s();
                ShopsCampaignCheckoutScreenContract$InputData shopsCampaignCheckoutScreenContract$InputData = fVar.f115011a;
                did.d dVar4 = fVar.f115012b;
                oid.a0 a0Var = new oid.a0((ShopsService) dVar4.J.get(), (ne0.j) dVar4.C.get(), (ue0.c) dVar4.D.get());
                djd.e eVar3 = new djd.e();
                did.d dVar5 = (did.d) this.f18377b;
                s0 s0Var = dVar5.f115005t;
                b6c.c cVarB = s0Var.b();
                vc.s.j(cVarB);
                fmc.z zVarB = dVar5.b();
                eub.i iVarE4 = dVar5.f114997j.e();
                vc.s.j(iVarE4);
                fn2.c cVarA2 = dVar5.a();
                c70.a aVarZ = dVar5.f114995g.z();
                vc.s.j(aVarZ);
                a7c.a aVar18 = (a7c.a) s0Var.f.get();
                vc.s.j(aVar18);
                h4g.g gVarB = dVar5.f114992a.b();
                ore.b bVar25 = dVar5.f115001p;
                pre.c cVarA3 = bVar25.a();
                vc.s.j(cVarA3);
                ffk.t tVarF2 = dVar5.f115002q.f();
                vc.s.j(tVarF2);
                jgk.v vVarD = dVar5.f115003r.d();
                vc.s.j(vVarD);
                mre.c cVarB2 = bVar25.b();
                vc.s.j(cVarB2);
                sf0.h hVarB = dVar5.u.b();
                vc.s.j(hVarB);
                v60.e eVarA3 = dVar5.v.a();
                vc.s.j(eVarA3);
                return new com.revolut.feature.shops.impl.ui.details.a(sVar, shopsCampaignCheckoutScreenContract$InputData, a0Var, eVar3, cVarB, zVarB, iVarE4, cVarA2, aVarZ, aVar18, gVarB, cVarA3, tVarF2, vVarD, cVarB2, hVarB, eVarA3, new k0c.a());
            case 23:
                return new jjd.b(((did.g) this.f18378c).f115014a, new jjd.e(), ((did.d) this.f18377b).f114993b.g());
            case 24:
                ShopsSessionFlowContract$InputData shopsSessionFlowContract$InputData = ((did.p) this.f18378c).f115048a;
                did.d dVar6 = (did.d) this.f18377b;
                zja.a aVarA6 = ((ika.b) dVar6.k).a();
                vc.s.j(aVarA6);
                eub.e eVar4 = (eub.e) dVar6.f114997j.V.get();
                vc.s.j(eVar4);
                return new com.revolut.feature.shops.impl.flow.session.c(shopsSessionFlowContract$InputData, aVarA6, eVar4, dVar6.f114993b.d());
            case 25:
                dmc.h hVar2 = (dmc.h) this.f18378c;
                mmc.b bVar26 = hVar2.f115951a;
                dmc.r rVar = (dmc.r) this.f18377b;
                xvh.c cVarA4 = ((a6d.e) rVar.f116032j).a();
                vc.s.j(cVarA4);
                qmc.h hVarA = rVar.f116029c.a();
                dmc.r rVar2 = hVar2.f115952b;
                nmc.d dVarD2 = rVar2.e.d();
                gte.a aVarB3 = rVar2.d.b();
                vc.s.j(aVarB3);
                return new mmc.d(bVar26, cVarA4, hVarA, new mmc.c(dVarD2, aVarB3));
            case 26:
                g1 g1Var = (g1) this.f18378c;
                CreditCardPostRetailOnboardingFlowContract$InputData creditCardPostRetailOnboardingFlowContract$InputData = g1Var.f118788a;
                xq3.j jVarH = ((c1) this.f18377b).f118428c.h();
                vc.s.j(jVarH);
                return new com.revolut.feature.credit.application.plugins.impl.ui.post_retail_onboarding.a(creditCardPostRetailOnboardingFlowContract$InputData, jVarH, new qg4.g(g1Var.f118789b.f118454m), new qg4.h());
            case 27:
                CreditHealthFlowContract$InputData creditHealthFlowContract$InputData = ((j1) this.f18378c).f119013a;
                xq3.r rVar3 = (xq3.r) ((c1) this.f18377b).f118428c.f282083a0.get();
                vc.s.j(rVar3);
                return new com.revolut.feature.credit.application.plugins.impl.ui.credit_health.flow.b(creditHealthFlowContract$InputData, rVar3);
            case 28:
                DropOutFormFlowContract$InputData dropOutFormFlowContract$InputData = ((q2) this.f18378c).f119562a;
                c1 c1Var = (c1) this.f18377b;
                ow3.e eVar5 = (ow3.e) c1Var.Y0.get();
                ra0.h hVarA2 = c1Var.A.a();
                vc.s.j(hVarA2);
                return new oa4.e(dropOutFormFlowContract$InputData, eVar5, hVarA2);
            default:
                return new com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.a(((v3) this.f18378c).f119984a, (rw3.a) ((c1) this.f18377b).N2.get());
        }
    }
}

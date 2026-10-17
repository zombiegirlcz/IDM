package ld1;

import akl.f1;
import akl.y1;
import bjl.o0;
import bjl.p0;
import com.revolut.feature.acquiring.lite_pos.api.navigation.SelectTaxRateScreenProvider$InputData;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.LitePosRootFlowContract$InputData;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.EditCustomProductScreenContract$InputData;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.ProductDetailsScreenContract$InputData;
import com.revolut.feature.insurance_embedded.impl.ui.flow.embedded.InsuranceDetailsFlowContract$InputData;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.settings_info.InsightSettingsInfoBottomSheetContract$InputData;
import com.revolut.feature.pay_bills_taxes.api.navigation.PayBillsAndTaxesNavigation$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.flow.BillsCatalogueFlowContract$InputData;
import com.revolut.feature.retail.trading.advanced.charts.impl.screen.closeinvestments.cfd.CfdClosePositionsSelectorContract$InputData;
import com.revolut.feature.retail.trading.advanced.charts.impl.screen.closeinvestments.stock.StockSellAllControllerContract$InputData;
import com.revolut.sso.api.passcode.change.ChangePasscodeInputData;
import com.revolut.sso.impl.ui.auth_rejected.AuthenticationRejectedFlowContract$InputData;
import com.revolut.sso.impl.ui.consent.common.consent_screen.ConsentScreenContract$InputData;
import com.revolut.sso.impl.ui.consent.common.select_identity.SelectIdentityScreenContract$InputData;
import com.revolut.sso.impl.ui.passkeys_management.passkeys_list.bottom_dialog.DeletePasskeyConfirmationBottomSheetContract$InputData;
import com.revolut.sso.impl.ui.password_flow.PasswordFlowContract$InputData;
import com.revolut.sso.impl.ui.reauthentication_wrapper.wrapper_flow.ReauthenticationWrapperFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import ljl.e1;
import ljl.h0;
import ljl.n0;
import ljl.q0;
import ljl.r0;
import ljl.v0;
import vrl.y0;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f193941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qji.b f193942c;

    public /* synthetic */ g(Object obj2, qji.b bVar, int i) {
        this.f193940a = i;
        this.f193941b = obj2;
        this.f193942c = bVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f193940a) {
            case 0:
                h hVar = (h) this.f193942c;
                return new com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_catalogue_product_entry.a(new me1.h((rd1.b) hVar.f193945c.d.get()), hVar.f193943a, (nd1.n) ((l) this.f193941b).f193964p.get(), new rd1.a((pd1.a) hVar.f193944b.f193968t.get()));
            case 1:
                i iVar = (i) this.f193942c;
                l lVar = iVar.f193947b;
                qd0.b bVarN = lVar.e.n();
                vc.s.j(bVarN);
                kxk.o oVar = new kxk.o(new oe1.a(bVarN, (hf1.g) lVar.u.get()), (rd1.b) iVar.f193948c.d.get());
                EditCustomProductScreenContract$InputData editCustomProductScreenContract$InputData = iVar.f193946a;
                l lVar2 = (l) this.f193941b;
                w80.b bVarJ = lVar2.e.j();
                vc.s.j(bVarJ);
                return new com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.a(oVar, editCustomProductScreenContract$InputData, bVarJ, (nd1.n) lVar2.f193964p.get(), new rd1.a((pd1.a) lVar.f193968t.get()));
            case 2:
                j jVar = (j) this.f193942c;
                rd1.b bVar = (rd1.b) jVar.f193951c.d.get();
                l lVar3 = jVar.f193950b;
                u80.t tVarU = lVar3.e.u();
                vc.s.j(tVarU);
                kxk.o oVar2 = new kxk.o(bVar, tVarU);
                l lVar4 = (l) this.f193941b;
                return new com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_tax_rate.a(oVar2, (hf1.g) lVar4.u.get(), jVar.f193949a, (nd1.c) lVar4.f193960j.get(), new rd1.a((pd1.a) lVar3.f193968t.get()));
            case 3:
                LitePosRootFlowContract$InputData litePosRootFlowContract$InputData = ((n) this.f193942c).f193978a;
                l lVar5 = (l) this.f193941b;
                return new com.revolut.feature.acquiring.lite_pos.impl.ui.flow.root.b(litePosRootFlowContract$InputData, (nd1.n) lVar5.f193964p.get(), (nd1.i) lVar5.f193966r.get());
            case 4:
                s sVar = (s) this.f193942c;
                ProductDetailsScreenContract$InputData productDetailsScreenContract$InputData = sVar.f193993a;
                l lVar6 = sVar.f193994b;
                pd1.a aVar = (pd1.a) lVar6.f193968t.get();
                qd0.b bVarN2 = lVar6.e.n();
                vc.s.j(bVarN2);
                ye1.q qVar = new ye1.q(productDetailsScreenContract$InputData, aVar, bVarN2, (hf1.g) lVar6.u.get(), (rd1.b) sVar.f193995c.e.get());
                ProductDetailsScreenContract$InputData productDetailsScreenContract$InputData2 = sVar.f193993a;
                l lVar7 = (l) this.f193941b;
                w80.b bVarJ2 = lVar7.e.j();
                vc.s.j(bVarJ2);
                nd1.c cVar = (nd1.c) lVar7.f193960j.get();
                ad1.a aVar2 = (ad1.a) lVar7.f193955a.i.get();
                vc.s.j(aVar2);
                return new com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.a(qVar, productDetailsScreenContract$InputData2, bVarJ2, cVar, aVar2, new rd1.a((pd1.a) lVar6.f193968t.get()), (pd1.a) lVar7.f193968t.get());
            case 5:
                v vVar = (v) this.f193942c;
                cf1.a aVar3 = new cf1.a((hf1.g) vVar.f194004b.u.get());
                SelectTaxRateScreenProvider$InputData selectTaxRateScreenProvider$InputData = vVar.f194003a;
                return new cf1.g(new cf1.j(aVar3, selectTaxRateScreenProvider$InputData), selectTaxRateScreenProvider$InputData, (nd1.c) ((l) this.f193941b).f193960j.get());
            case 6:
                l lVar8 = (l) this.f193941b;
                nd1.c cVar2 = (nd1.c) lVar8.f193960j.get();
                nd1.n nVar = (nd1.n) lVar8.f193964p.get();
                sfc.f fVar = (sfc.f) lVar8.f193955a.f.get();
                vc.s.j(fVar);
                z zVar = (z) this.f193942c;
                return new com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.b(cVar2, nVar, fVar, zVar.f194014a, new ge1.l(new ge1.j((pd1.a) zVar.f194015b.f193968t.get())));
            case 7:
                BillsCatalogueFlowContract$InputData billsCatalogueFlowContract$InputData = ((lf9.b) this.f193942c).f194683a;
                lf9.m mVar = (lf9.m) this.f193941b;
                gte.a aVarB = mVar.k.b();
                vc.s.j(aVarB);
                up1.c cVar3 = mVar.f194736g;
                ep1.b bVar2 = (ep1.b) ((up1.e) cVar3).f281813n.get();
                vc.s.j(bVar2);
                wo1.b bVarB = ((up1.e) cVar3).b();
                vc.s.j(bVarB);
                im1.a aVar4 = (im1.a) mVar.f194738j.f.get();
                vc.s.j(aVar4);
                return new com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.flow.b(billsCatalogueFlowContract$InputData, aVarB, bVar2, bVarB, aVar4);
            case 8:
                PayBillsAndTaxesNavigation$InputData payBillsAndTaxesNavigation$InputData = ((lf9.c) this.f193942c).f194686a;
                lf9.m mVar2 = (lf9.m) this.f193941b;
                vo1.c cVarA = ((up1.e) mVar2.f194736g).a();
                vc.s.j(cVarA);
                return new com.revolut.feature.pay_bills_taxes.impl.ui_routing.flow.b(payBillsAndTaxesNavigation$InputData, cVarA, mVar2.e.e());
            case 9:
                AuthenticationRejectedFlowContract$InputData authenticationRejectedFlowContract$InputData = ((ljl.d) this.f193942c).f195914a;
                l80.e eVarH = ((q0) this.f193941b).f196062g.h();
                vc.s.j(eVarH);
                return new com.revolut.sso.impl.ui.auth_rejected.a(authenticationRejectedFlowContract$InputData, eVarH);
            case 10:
                ChangePasscodeInputData changePasscodeInputData = ((ljl.g) this.f193942c).f195945a;
                q0 q0Var = (q0) this.f193941b;
                akl.l lVar9 = (akl.l) q0Var.U.get();
                o0 o0Var = (o0) q0Var.f196077s0.get();
                p0 p0Var = (p0) q0Var.H.get();
                f1 f1Var = (f1) q0Var.P.get();
                rql.a aVarB2 = q0Var.o.b();
                vc.s.j(aVarB2);
                return new com.revolut.sso.impl.ui.passcode.change_flow.a(changePasscodeInputData, lVar9, o0Var, p0Var, f1Var, aVarB2, (ynl.c) q0Var.B0.get(), (akl.o0) q0Var.R.get());
            case 11:
                q0 q0Var2 = (q0) this.f193941b;
                uil.a aVarA = q0Var2.f196057b.a();
                vc.s.j(aVarA);
                y1 y1Var = (y1) q0Var2.Q.get();
                q0 q0Var3 = ((ljl.m) this.f193942c).f196025a;
                uil.a aVarA2 = q0Var3.f196057b.a();
                vc.s.j(aVarA2);
                return new com.revolut.sso.impl.ui.consolidation.b(aVarA, y1Var, new kol.b(aVarA2, (p0) q0Var3.H.get()));
            case 12:
                DeletePasskeyConfirmationBottomSheetContract$InputData deletePasskeyConfirmationBottomSheetContract$InputData = ((ljl.s) this.f193942c).f196092a;
                q0 q0Var4 = (q0) this.f193941b;
                return new fol.d(deletePasskeyConfirmationBottomSheetContract$InputData, (akl.l) q0Var4.U.get(), (p0) q0Var4.H.get(), new fol.e());
            case 13:
                h0 h0Var = (h0) this.f193942c;
                PasswordFlowContract$InputData passwordFlowContract$InputData = h0Var.f195966a;
                q0 q0Var5 = (q0) this.f193941b;
                p0 p0Var2 = (p0) q0Var5.H.get();
                wl0.c cVarA2 = q0Var5.f.a();
                he9.e eVar = q0Var5.B;
                me9.a aVar5 = (me9.a) eVar.f151613j.get();
                vc.s.j(aVar5);
                oe9.a aVar6 = (oe9.a) eVar.i.get();
                vc.s.j(aVar6);
                return new com.revolut.sso.impl.ui.password_flow.c(passwordFlowContract$InputData, p0Var2, cVarA2, aVar5, aVar6, (tll.n) q0Var5.y0.get(), (jol.b) q0Var5.I.get(), h0Var.f195967b);
            case 14:
                q0 q0Var6 = (q0) this.f193941b;
                tll.n nVar2 = (tll.n) q0Var6.y0.get();
                l70.e eVar2 = q0Var6.f196062g;
                fkg.a aVarD = eVar2.d();
                c70.a aVarZ = eVar2.z();
                vc.s.j(aVarZ);
                return new wol.t(nVar2, aVarD, aVarZ, ((s41.a) q0Var6.A).d(), ((n0) this.f193942c).f196038a, (p0) q0Var6.H.get(), new wol.u());
            case 15:
                ReauthenticationWrapperFlowContract$InputData reauthenticationWrapperFlowContract$InputData = ((ljl.o0) this.f193942c).f196045a;
                q0 q0Var7 = (q0) this.f193941b;
                rql.a aVarB3 = q0Var7.o.b();
                vc.s.j(aVarB3);
                return new com.revolut.sso.impl.ui.reauthentication_wrapper.wrapper_flow.a(reauthenticationWrapperFlowContract$InputData, aVarB3, (p0) q0Var7.H.get(), (xjl.i) q0Var7.Z.get(), q0Var7.i());
            case 16:
                r0 r0Var = (r0) this.f193942c;
                SelectIdentityScreenContract$InputData selectIdentityScreenContract$InputData = r0Var.f196089a;
                l80.e eVarH2 = ((q0) this.f193941b).f196062g.h();
                vc.s.j(eVarH2);
                q0 q0Var8 = r0Var.f196090b;
                vil.g gVar = (vil.g) q0Var8.l0.get();
                l80.e eVarH3 = q0Var8.f196062g.h();
                vc.s.j(eVarH3);
                return new com.revolut.sso.impl.ui.consent.common.select_identity.a(selectIdentityScreenContract$InputData, eVarH2, new com.revolut.sso.impl.ui.consent.common.select_identity.b(gVar, eVarH3));
            case 17:
                return new hql.e(((v0) this.f193942c).f196120a, ((q0) this.f193941b).i());
            case 18:
                e1 e1Var = (e1) this.f193942c;
                ConsentScreenContract$InputData consentScreenContract$InputData = e1Var.f195929b;
                l80.e eVarH4 = ((q0) this.f193941b).f196062g.h();
                vc.s.j(eVarH4);
                q0 q0Var9 = e1Var.f195930c;
                vil.g gVar2 = (vil.g) q0Var9.l0.get();
                l80.e eVarH5 = q0Var9.f196062g.h();
                vc.s.j(eVarH5);
                return new aml.j(consentScreenContract$InputData, eVarH4, new aml.o(consentScreenContract$InputData, gVar2, eVarH5));
            case 19:
                e1 e1Var2 = (e1) this.f193942c;
                ConsentScreenContract$InputData consentScreenContract$InputData2 = e1Var2.f195929b;
                l80.e eVarH6 = ((q0) this.f193941b).f196062g.h();
                vc.s.j(eVarH6);
                q0 q0Var10 = e1Var2.f195930c;
                vil.g gVar3 = (vil.g) q0Var10.l0.get();
                l80.e eVarH7 = q0Var10.f196062g.h();
                vc.s.j(eVarH7);
                return new aml.j(consentScreenContract$InputData2, eVarH6, new aml.o(consentScreenContract$InputData2, gVar3, eVarH7));
            case 20:
                return new eqf.a(((lpf.b) this.f193942c).f199008a, (fqf.a) ((lpf.i) this.f193941b).f199047t.get());
            case 21:
                return new uqf.a(((lpf.f) this.f193942c).f199022a, (vqf.a) ((lpf.i) this.f193941b).u.get());
            case 22:
                CfdClosePositionsSelectorContract$InputData cfdClosePositionsSelectorContract$InputData = ((lrb.a) this.f193942c).f199480a;
                lrb.c cVar4 = (lrb.c) this.f193941b;
                lal.a aVarA3 = cVar4.a();
                y0 y0VarJ = cVar4.f.j();
                vc.s.j(y0VarJ);
                ybl.b bVarB2 = cVar4.f199484a.b();
                vc.s.j(bVarB2);
                prb.c cVar5 = new prb.c();
                wj0.a aVarI = ((nj0.d) cVar4.f199489j).i();
                vc.s.j(aVarI);
                p2b.c cVarE = cVar4.f199487g.e();
                vc.s.j(cVarE);
                return new vrb.l(cfdClosePositionsSelectorContract$InputData, aVarA3, y0VarJ, bVarB2, cVar5, aVarI, cVarE, new vrb.n());
            case 23:
                StockSellAllControllerContract$InputData stockSellAllControllerContract$InputData = ((lrb.b) this.f193942c).f199482a;
                lrb.c cVar6 = (lrb.c) this.f193941b;
                lal.a aVarA4 = cVar6.a();
                prb.c cVar7 = new prb.c();
                y0 y0VarJ2 = cVar6.f.j();
                vc.s.j(y0VarJ2);
                wj0.a aVarI2 = ((nj0.d) cVar6.f199489j).i();
                vc.s.j(aVarI2);
                return new wrb.h(stockSellAllControllerContract$InputData, aVarA4, cVar7, y0VarJ2, aVarI2, new wrb.i());
            case 24:
                lti.g gVar4 = (lti.g) this.f193941b;
                gte.a aVarB4 = gVar4.f199904a.b();
                vc.s.j(aVarB4);
                rui.a aVar7 = new rui.a();
                kti.g gVar5 = gVar4.f199905b;
                jvi.c cVar8 = (jvi.c) gVar5.E.get();
                vc.s.j(cVar8);
                zsi.e eVarA = gVar5.a();
                vc.s.j(eVarA);
                gte.a featureToggleInteractor = ((lti.h) this.f193942c).f199914a.f199904a.b();
                vc.s.j(featureToggleInteractor);
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                r39.a aVar8 = new r39.a();
                pti.k kVar = (pti.k) gVar5.u.get();
                vc.s.j(kVar);
                return new com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.main.b(aVarB4, aVar7, cVar8, eVarA, aVar8, kVar);
            case 25:
                InsuranceDetailsFlowContract$InputData insuranceDetailsFlowContract$InputData = ((lu7.m) this.f193942c).f200137a;
                si7.a aVarA5 = ((lu7.s) this.f193941b).k.a();
                vc.s.j(aVarA5);
                return new com.revolut.feature.insurance_embedded.impl.ui.flow.embedded.a(insuranceDetailsFlowContract$InputData, aVarA5);
            case 26:
                return new com.revolut.feature.insurance_embedded.impl.ui.flow.comparison.b(((lu7.u) this.f193942c).f200178a, (mu7.e) ((lu7.s) this.f193941b).A.get());
            case 27:
                InsightSettingsInfoBottomSheetContract$InputData insightSettingsInfoBottomSheetContract$InputData = ((m18.c) this.f193942c).f201258a;
                b28.d dVar = new b28.d();
                m18.e eVar3 = (m18.e) this.f193941b;
                gte.a aVarB5 = eVar3.f201261a.b();
                vc.s.j(aVarB5);
                u8h.c cVar9 = eVar3.i;
                z0h.d dVarC = ((u8h.b) cVar9).c();
                vc.s.j(dVarC);
                z0h.a aVarB6 = ((u8h.b) cVar9).b();
                vc.s.j(aVarB6);
                return new b28.b(insightSettingsInfoBottomSheetContract$InputData, dVar, aVarB5, dVarC, aVarB6);
            case 28:
                m2b.v vVar2 = (m2b.v) this.f193941b;
                l4i.a aVar9 = new l4i.a();
                m2b.j jVar2 = (m2b.j) this.f193942c;
                m2b.v vVar3 = jVar2.f201844b;
                ybl.d dVarH = vVar3.e.h();
                vc.s.j(dVarH);
                o7.b bVar3 = new o7.b(dVarH);
                kge.d dVarA = vVar2.f201923c.a();
                p3b.f fVar2 = jVar2.f201843a;
                ybl.b bVarB3 = vVar2.e.b();
                vc.s.j(bVarB3);
                vrl.s sVarD = vVar3.f201933s.d();
                vc.s.j(sVarD);
                return new p3b.l(aVar9, bVar3, dVarA, fVar2, bVarB3, new t2b.f(sVarD, (p2b.l) vVar3.G.get(), (u2b.a) vVar3.F.get()), new p3b.h());
            default:
                m2b.v vVar4 = (m2b.v) this.f193941b;
                ybl.l lVarF = vVar4.o.f();
                zja.a aVarA6 = ((ika.b) vVar4.B).a();
                vc.s.j(aVarA6);
                return new com.revolut.feature.retail.cfd.impl.flows.onboarding.b(lVarF, aVarA6, ((m2b.l) this.f193942c).f201849a);
        }
    }
}

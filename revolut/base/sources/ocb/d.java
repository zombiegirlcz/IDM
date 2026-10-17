package ocb;

import aw0.n6;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.articles_deeplinks_impl.screen.ArticleWebViewScreen;
import com.revolut.feature.card.verification.impl.screen.transaction_code_info.TransactionCodeInfoScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.single_selection.SingleSelectionController;
import com.revolut.feature.credit.card.impl.ui.documents_rates.CreditCardDocumentsRatesController;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingaddprovider.CryptoAddressHostingAddProviderController;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.list.FreelancerAcquiringOrderListScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.details.screen.InvoiceDetailsScreen;
import com.revolut.feature.insurance.impl.ui.cfac.documents.CFACInsuranceDocumentsScreen;
import com.revolut.feature.insurance_credit.impl.ui.screen.coverage_bottom_sheet.CoverageBottomSheetController;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.dropdown_searchable.DropdownSearchableSelectionScreen;
import com.revolut.feature.profile.impl.ui.profile.screens.about_us.AboutUsScreen;
import com.revolut.feature.retail.privacy.impl.ui.flow.screen.RetailPrivacyScreen;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.timepicker.ReservationTimePickerScreen;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.RevPointsExclusiveStoreProductCheckoutScreen;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.a;
import com.revolut.feature.standingordertopup.impl.ui.screen.auto_top_up_methods.AutoTopUpMethodsScreen;
import com.revolut.media.picker.MediaPickerException;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.impl.ui.screens.esim_setup_options.EsimSetupOptionsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.esim_setup_options.EsimSetupOptionsScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.PricingPlanBEDrivenScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.MoreForFamilyScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details.EtfDetailsFlowController;
import java.io.File;
import java.lang.reflect.Type;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import nii.n1;
import ot7.d;
import vkm.j2;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d((RetailPrivacyScreen) this.v, continuation, 0);
            case 1:
                return new d((SingleSelectionController) this.v, continuation, 1);
            case 2:
                return new d((ReservationTimePickerScreen) this.v, continuation, 2);
            case 3:
                return new d((og2.m) this.v, continuation, 3);
            case 4:
                return new d((DropdownSearchableSelectionScreen) this.v, continuation, 4);
            case 5:
                return new d((oh4.l) this.v, continuation, 5);
            case 6:
                return new d((EsimSetupOptionsScreen) this.v, continuation, 6);
            case 7:
                return new d((ArticleWebViewScreen) this.v, continuation, 7);
            case 8:
                return new d((oj3.b) this.v, continuation, 8);
            case 9:
                return new d((com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.c) this.v, continuation, 9);
            case 10:
                return new d((Exception) this.v, continuation, 10);
            case 11:
                return new d((PricingPlanBEDrivenScreen) this.v, continuation, 11);
            case 12:
                return new d((CFACInsuranceDocumentsScreen) this.v, continuation, 12);
            case 13:
                return new d((MoreForFamilyScreen) this.v, continuation, 13);
            case 14:
                return new d((oli.c) this.v, continuation, 14);
            case 15:
                return new d((AboutUsScreen) this.v, continuation, 15);
            case 16:
                return new d((CryptoAddressHostingAddProviderController) this.v, continuation, 16);
            case 17:
                return new d((com.revolut.feature.salary_switch.impl.ui.brazil.flow.b) this.v, continuation, 17);
            case 18:
                return new d((CreditCardDocumentsRatesController) this.v, continuation, 18);
            case 19:
                return new d((os9.u) this.v, continuation, 19);
            case 20:
                return new d((CoverageBottomSheetController) this.v, continuation, 20);
            case 21:
                return new d((EtfDetailsFlowController) this.v, continuation, 21);
            case 22:
                return new d((FreelancerAcquiringOrderListScreen) this.v, continuation, 22);
            case 23:
                return new d((ouj.d) this.v, continuation, 23);
            case 24:
                return new d((com.revolut.feature.apm.breb.impl.flow.a) this.v, continuation, 24);
            case 25:
                return new d((TransactionCodeInfoScreen) this.v, continuation, 25);
            case 26:
                return new d((RevPointsExclusiveStoreProductCheckoutScreen) this.v, continuation, 26);
            case 27:
                return new d((InvoiceDetailsScreen) this.v, continuation, 27);
            case 28:
                return new d((com.revolut.feature.kyc.impl.web_id.flow.a) this.v, continuation, 28);
            default:
                return new d((AutoTopUpMethodsScreen) this.v, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) throws Exception {
        switch (this.u) {
            case 0:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((d) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((d) create((rp0.p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((d) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((d) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((d) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                ((d) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                throw null;
            case 11:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((d) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((d) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((d) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((d) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((d) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v39, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v53, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v60, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v89, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Exception {
        int i = this.u;
        int i2 = 0;
        Object obj3 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((x) ((k) ((RetailPrivacyScreen) obj3).f82782d0.getValue())).u2();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((oe4.q) ((SingleSelectionController) obj3).d()).I2(oe4.j.f224527a);
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oeb.f fVar = (oeb.f) ((ReservationTimePickerScreen) obj3).Q.getValue();
                fVar.C2(new oeb.b(((oeb.a) ((j2) fVar.f224575p.f22677a).getValue()).f224568a));
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((og2.m) obj3).C2(og2.g.f225001a);
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((og9.j) ((og9.g) ((DropdownSearchableSelectionScreen) obj3).R.getValue())).B2();
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oh4.l lVar = (oh4.l) obj3;
                lVar.n2(new oh4.j(lVar, file, i2), new whi.b(6));
                return Unit.f186387a;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ohj.h hVar = (ohj.h) ((EsimSetupOptionsScreen) obj3).V.getValue();
                EsimProfile esimProfile = ((ohj.c) ((j2) hVar.f225380p.f22677a).getValue()).f225375b;
                if (esimProfile != null) {
                    EsimSetupOptionsScreenContract$InputData esimSetupOptionsScreenContract$InputData = hVar.o;
                    if (esimSetupOptionsScreenContract$InputData instanceof EsimSetupOptionsScreenContract$InputData.Install) {
                        hVar.C2(new ohj.d(esimProfile));
                    } else {
                        if (!(esimSetupOptionsScreenContract$InputData instanceof EsimSetupOptionsScreenContract$InputData.Transfer)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        hVar.C2(new ohj.e(esimProfile));
                    }
                } else {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "EsimSetupOptionsScreenModel", "Selected esim profile is null", null, h0Var);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((oj2.i) ((ArticleWebViewScreen) obj3).R2()).B2();
                return Unit.f186387a;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((oj3.b) obj3).C2(aii.q.f5292a);
                return Unit.f186387a;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.D2(((com.revolut.feature.credit.application.plugins.impl.ui.waiting_list_v3.c) obj3).f68529r);
                return Unit.f186387a;
            case 10:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                throw ((Exception) obj3);
            case 11:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((PricingPlanBEDrivenScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 12:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((CFACInsuranceDocumentsScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 13:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((okk.l) ((MoreForFamilyScreen) obj3).Q.getValue()).B2();
                return Unit.f186387a;
            case 14:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String str = ((oli.c) obj3).i;
                file = str != null ? new File(str) : 0;
                if (file == 0 || !file.exists() || file.length() <= 0) {
                    throw new MediaPickerException(com.google.android.gms.internal.mlkit_vision_face.a.r("Unable to get the picture returned from camera.  File exists = ", file != 0 ? file.exists() : false), 0);
                }
                return file;
            case 15:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((AboutUsScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 16:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((CryptoAddressHostingAddProviderController) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 17:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.D2(((com.revolut.feature.salary_switch.impl.ui.brazil.flow.b) obj3).f85276r);
                return Unit.f186387a;
            case 18:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.credit.card.impl.ui.documents_rates.a) ((or4.f) ((CreditCardDocumentsRatesController) obj3).R.getValue())).B2();
                return Unit.f186387a;
            case 19:
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((os9.u) obj3).v2(os9.l.f229273a);
                return Unit.f186387a;
            case 20:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((ot7.f) ((ot7.c) ((CoverageBottomSheetController) obj3).Q.getValue())).C2(d.a.f229564a);
                return Unit.f186387a;
            case 21:
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details.a) ((EtfDetailsFlowController) obj3).e3()).B2();
                return Unit.f186387a;
            case 22:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                FreelancerAcquiringOrderListScreen freelancerAcquiringOrderListScreen = (FreelancerAcquiringOrderListScreen) obj3;
                com.revolut.feature.freelancer.impl.ui.acquiring_order.list.a aVar24 = (com.revolut.feature.freelancer.impl.ui.acquiring_order.list.a) freelancerAcquiringOrderListScreen.e3();
                cli.y yVar = aVar24.f73703x;
                if (((ou6.h) ((j2) yVar.f22677a).getValue()).f229830g) {
                    aVar24.H2(yVar, new os9.f(26));
                } else {
                    aVar24.C2(ou6.i.f229831a);
                }
                NavBarWithToolbar navBarWithToolbar = freelancerAcquiringOrderListScreen.d3().f174539b;
                Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
                kli.c.c(navBarWithToolbar, true);
                return Unit.f186387a;
            case 23:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar = ((ouj.d) obj3).f229884c;
                Type type = ouj.d.e;
                Intrinsics.checkNotNullExpressionValue(type, "access$getTravelDestinationDtoType$cp(...)");
                nuj.i iVar = (nuj.i) cVar.T2("travel_storage", type);
                g0j.a aVarO = iVar != null ? u0.O(iVar) : null;
                od0.i.Companion.getClass();
                return od0.h.a(aVarO);
            case 24:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.D2(((com.revolut.feature.apm.breb.impl.flow.a) obj3).v);
                return Unit.f186387a;
            case 25:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((TransactionCodeInfoScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 26:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d) ((RevPointsExclusiveStoreProductCheckoutScreen) obj3).R2()).C2(a.b.f83599a);
                return Unit.f186387a;
            case 27:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((InvoiceDetailsScreen) obj3).m2().onBackPressed();
                return Unit.f186387a;
            case 28:
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.kyc.impl.web_id.flow.a) obj3).C2(ks8.g.f189311a);
                return Unit.f186387a;
            default:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((oxd.o) ((oxd.k) ((AutoTopUpMethodsScreen) obj3).N.getValue())).B2();
                return Unit.f186387a;
        }
    }
}

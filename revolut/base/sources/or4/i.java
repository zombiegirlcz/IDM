package or4;

import androidx.compose.foundation.text.contextmenu.data.TextContextMenuItem;
import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import androidx.glance.BackgroundKt;
import androidx.glance.CompositionLocalsKt;
import androidx.glance.GlanceModifier;
import androidx.glance.ImageKt;
import androidx.glance.ImageProvider;
import androidx.glance.action.ActionKt;
import androidx.glance.appwidget.AppWidgetBackgroundKt;
import androidx.glance.appwidget.CornerRadiusKt;
import androidx.glance.layout.Alignment;
import androidx.glance.layout.ColumnKt;
import androidx.glance.layout.ColumnScope;
import androidx.glance.layout.ContentScale;
import androidx.glance.layout.PaddingKt;
import androidx.glance.layout.SizeModifiersKt;
import androidx.glance.layout.SpacerKt;
import aw0.x8;
import ch.qos.logback.core.net.SyslogConstants;
import cli.y;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.xc;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_remote.R$dimen;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$InputData;
import com.revolut.feature.apm.breb.impl.flow.BrebFlowContract$Step;
import com.revolut.feature.apm.breb.impl.flow.area.BrebAreaFlow;
import com.revolut.feature.apm.breb.impl.ui.register.BrebRegisterScreen;
import com.revolut.feature.apm.breb.impl.ui.register.BrebRegisterScreenContract$InputData;
import com.revolut.feature.apm.breb.impl.ui.transfer.BrebTransferFlow;
import com.revolut.feature.apm.core.api.product.ApmBreb;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardDialogModel;
import com.revolut.feature.credit.card.impl.ui.documents_rates.CreditCardDocumentsRatesScreenContract$ModalStep;
import com.revolut.feature.cryptocommodity_invest.api.navigation.CryptoSortingPickerInputData;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.CryptoSortingPickerScreen;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.CryptoTradeContract$ModalStep;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.FreelancerAcquiringOrderFiltersScreen;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.FreelancerAcquiringOrderFiltersScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.list.FreelancerAcquiringOrderListScreenContract$ModalStep;
import com.revolut.feature.freelancer.impl.ui.dialog.single_choice.FreelancerSingleChoiceScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.details.screen.InvoiceDetailsScreenContract$ModalStep;
import com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.InvoiceRecurringSettingsScreenContract$ModalStep;
import com.revolut.feature.full_screen_prompt.FullScreenPromptScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.joint.impl.ui.close.losebenefits.JointCloseLoseBenefitScreen;
import com.revolut.feature.joint.impl.ui.close_flow.JointCloseFlowContract$Step;
import com.revolut.feature.joint.impl.ui.close_flow.close_prompt.JointClosePromptScreen;
import com.revolut.feature.joint.impl.ui.close_flow.close_prompt.JointClosePromptScreenContract$InputData;
import com.revolut.feature.kyc.impl.flow.input_document_id.InputDocumentIdFlowContract$InputData;
import com.revolut.feature.kyc.impl.flow.input_document_id.InputDocumentIdFlowContract$Step;
import com.revolut.feature.kyc.impl.screens.documentid_input.KYCDocumentIdInputScreen;
import com.revolut.feature.kyc.impl.screens.documentid_input.KYCDocumentIdInputScreenContract$InputData;
import com.revolut.feature.kyc.impl.web_id.flow.WebIdFlowContract$Step;
import com.revolut.feature.kyc.impl.web_id.web_id_portal.WebIdPortalScreen;
import com.revolut.feature.kyc.impl.web_id.web_id_portal.WebIdPortalScreenContract$InputData;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.rev_points.api.navigation.descriptor.LifestyleRevPointsOptInController$InputData;
import com.revolut.feature.rev_points.exclusive_store.api.R$string;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.RevPointsExclusiveStoreProductCheckoutScreenContract$Step;
import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeBreakdownControllerApi$InputData;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.breakdown.RevPointsSpareChangeBreakdownController;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.spare_change.RevPointsSpareChangeControllerContract$ModalStep;
import com.revolut.feature.statements.api.StatementsMode;
import com.revolut.feature.statements.impl.ui.consolidated.StatementsModeConfig;
import com.revolut.feature.statements.impl.ui.consolidated.bank_id.BankIDAnnualStatementsScreen;
import com.revolut.feature.statements.impl.ui.consolidated.flow.ConsolidatedStatementFlowContract$Step;
import com.revolut.feature.statements.impl.ui.consolidated.screen.ConsolidatedStatementScreen;
import com.revolut.feature.statements.impl.ui.consolidated.screen.ConsolidatedStatementScreenContract$InputData;
import com.revolut.feature.store.impl.ui.brand_detail.flow.StoreBrandDetailFlow;
import com.revolut.feature.store.impl.ui.brand_detail.flow.StoreBrandDetailFlowContract$InputData;
import com.revolut.feature.store.impl.ui.home.StoreHomeFlow;
import com.revolut.feature.store.impl.ui.home.StoreHomeFlowContract$InputData;
import com.revolut.feature.store.impl.ui.home.a;
import com.revolut.feature.store.impl.ui.orders.see_all.StoreOrdersSeeAllContract$InputData;
import com.revolut.feature.store.impl.ui.orders.see_all.StoreOrdersSeeAllScreen;
import com.revolut.feature.store.impl.ui.root.StoreFlowContract$Step;
import com.revolut.feature.store.impl.ui.search.StoreSearchScreen;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.home.LoungePassHomeFlowContract$Step;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.lounge_search.AirportLoungeSearchFlow;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.lounge_search.AirportLoungeSearchFlowContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.AirportLoungePassDetailsFlow;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.AirportLoungePassDetailsFlowContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_details.AirportDetailsScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.airport_details.AirportDetailsScreenContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.amenities.AirportLoungesAmenitiesScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.amenities.AirportLoungesAmenitiesScreenContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.AirportLoungesHomeScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.AirportLoungesHomeScreenContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.lounge_details.AirportLoungeDetailsScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.lounge_details.AirportLoungeDetailsScreenContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity.AirportLoungesPassActivityScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund.AirportLoungesPassRefundContract$ModalStep;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.AirportLoungePassDetailsRefundScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.saved_lounges.AirportSavedLoungesScreen;
import com.revolut.trading.orders.ui.invest.placement.target_price.TargetPriceScreen;
import com.revolut.trading.orders.ui.invest.placement.target_price.TargetPriceScreenContract$ModalStep;
import com.revolut.trading.orders.ui.invest.placement.tutorial.TutorialScreen;
import com.revolut.trading.orders.ui.invest.placement.tutorial.TutorialScreenContract$InputData;
import d67.q;
import d67.r;
import d67.s;
import d67.u;
import ehe.n;
import fy6.v;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import jid.z;
import jr6.m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ks8.e;
import ks8.f;
import m1c.e0;
import my8.o;
import oki.h;
import om4.l0;
import os9.t;
import ou6.p;
import ou6.x;
import oul.a0;
import oul.k;
import ox5.c0;
import qx8.g;
import qx8.i;
import qx8.j;
import rd0.d;
import vkm.j2;
import yki.l;
import zhm.d0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f228062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f228063b;

    public /* synthetic */ i(Object obj2, int i) {
        this.f228062a = i;
        this.f228063b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v128 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Set setI1;
        Object brebTransferFlow;
        StatementsModeConfig statementsModeConfig;
        int i = this.f228062a;
        int i2 = 14;
        int i3 = 3;
        String str = null;
        final int i5 = 1;
        Object obj4 = this.f228063b;
        switch (i) {
            case 0:
                com.revolut.feature.credit.card.impl.ui.documents_rates.a aVar = (com.revolut.feature.credit.card.impl.ui.documents_rates.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CreditCardDocumentsRatesScreenContract$ModalStep step = (CreditCardDocumentsRatesScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!(step instanceof CreditCardDocumentsRatesScreenContract$ModalStep.Dialog)) {
                    throw new NoWhenBranchMatchedException();
                }
                lt4.d dVar = aVar.f69290r;
                CreditCardDialogModel creditCardDialogModel = ((CreditCardDocumentsRatesScreenContract$ModalStep.Dialog) step).f69287a;
                dVar.getClass();
                return lt4.d.a(creditCardDialogModel);
            case 1:
                String policyId = (String) obj2;
                List policyDocuments = (List) obj3;
                Intrinsics.checkNotNullParameter(policyId, "policyId");
                Intrinsics.checkNotNullParameter(policyDocuments, "policyDocuments");
                n.z("POLICY_DOCUMENTS_PREFIX_", policyId, ((or7.c) obj4).f228076b, policyDocuments);
                return Unit.f186387a;
            case 2:
                ot8.b params = (ot8.b) obj2;
                o kycDocs = (o) obj3;
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(kycDocs, "kycDocs");
                ((ot8.c) obj4).f229575b.f(ot8.c.b(params), kycDocs);
                return Unit.f186387a;
            case 3:
                com.revolut.feature.freelancer.impl.ui.acquiring_order.list.a aVar2 = (com.revolut.feature.freelancer.impl.ui.acquiring_order.list.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                FreelancerAcquiringOrderListScreenContract$ModalStep step2 = (FreelancerAcquiringOrderListScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (!Intrinsics.f(step2, FreelancerAcquiringOrderListScreenContract$ModalStep.NewSalePicker.f73695a)) {
                    if (!(step2 instanceof FreelancerAcquiringOrderListScreenContract$ModalStep.SalesFilters)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    FreelancerAcquiringOrderFiltersScreen freelancerAcquiringOrderFiltersScreen = new FreelancerAcquiringOrderFiltersScreen(new FreelancerAcquiringOrderFiltersScreenContract$InputData(((FreelancerAcquiringOrderListScreenContract$ModalStep.SalesFilters) step2).f73696a));
                    oqk.c block = new oqk.c(aVar2, 16);
                    Intrinsics.checkNotNullParameter(block, "block");
                    freelancerAcquiringOrderFiltersScreen.H = block;
                    return freelancerAcquiringOrderFiltersScreen;
                }
                m mVar = aVar2.u;
                int i6 = p.f229839a[((ou6.h) ((j2) aVar2.f73703x.f22677a).getValue()).f229827a.ordinal()];
                if (i6 == 1) {
                    setI1 = d0.i1(cs6.c.b());
                } else if (i6 == 2) {
                    cs6.c.Companion.getClass();
                    setI1 = cs6.c.inPersonSaleTypes;
                } else {
                    if (i6 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    setI1 = h0.f322473a;
                }
                return m.a(mVar, null, setI1, 1);
            case 4:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new ou6.n(new ou6.m(((x) obj4).f229846a.d(), null, f0.f322471a, false), (List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null)));
            case 5:
                od0.i travel = (od0.i) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(travel, "travel");
                ((ouj.d) obj4).f229883b.f("travel_cache", travel);
                return Unit.f186387a;
            case 6:
                TargetPriceScreen targetPriceScreen = (TargetPriceScreen) obj4;
                CenteredAmountDelegate.Model model = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr = TargetPriceScreen.W;
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(field, "field");
                Object obj5 = model.f51981p;
                oul.i iVar = obj5 instanceof oul.i ? (oul.i) obj5 : null;
                if (iVar == null) {
                    return null;
                }
                com.revolut.trading.orders.ui.invest.placement.target_price.b bVar = (com.revolut.trading.orders.ui.invest.placement.target_price.b) targetPriceScreen.d();
                if (((k) ((j2) bVar.getState().f22677a).getValue()).d) {
                    bVar.H2(bVar.getState(), new ou6.o(5));
                    bVar.n2(new a0(bVar, lVar, i3), new whi.b(6));
                }
                return new zp0.d(field.getEditText(), iVar.f229903a, (u80.d) targetPriceScreen.Q.getValue(), null, new z(targetPriceScreen, iVar, 21), false, false, 0, false, null, 1928);
            case 7:
                com.revolut.trading.orders.ui.invest.placement.target_price.b bVar2 = (com.revolut.trading.orders.ui.invest.placement.target_price.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TargetPriceScreenContract$ModalStep step3 = (TargetPriceScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (!(step3 instanceof TargetPriceScreenContract$ModalStep.Tutorial)) {
                    throw new NoWhenBranchMatchedException();
                }
                TargetPriceScreenContract$ModalStep.Tutorial tutorial = (TargetPriceScreenContract$ModalStep.Tutorial) step3;
                bVar2.getClass();
                return new TutorialScreen(new TutorialScreenContract$InputData(tutorial.f106999a, tutorial.f107000b, tutorial.f107001c));
            case 8:
                com.revolut.feature.apm.breb.impl.flow.a aVar3 = (com.revolut.feature.apm.breb.impl.flow.a) obj4;
                l FlowCoordinator = (l) obj2;
                BrebFlowContract$Step step4 = (BrebFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (step4 instanceof BrebFlowContract$Step.Intro) {
                    ViewController viewControllerE1 = aVar3.e1(new d12.a(new d12.c(ApmBreb.f61810c.e()), aVar3.u));
                    ov1.f block2 = new ov1.f(aVar3, FlowCoordinator, 0);
                    Intrinsics.checkNotNullParameter(block2, "block");
                    viewControllerE1.H = block2;
                    return viewControllerE1;
                }
                if (step4 instanceof BrebFlowContract$Step.Area) {
                    brebTransferFlow = new BrebAreaFlow(((BrebFlowContract$Step.Area) step4).f61714a);
                } else {
                    if (!(step4 instanceof BrebFlowContract$Step.Transfer)) {
                        if (step4 instanceof BrebFlowContract$Step.Onboarding) {
                            ViewController viewControllerE12 = aVar3.e1(new ProductArticleDescriptor(xv1.a.ONBOARDING.a(), SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 56));
                            l0 block3 = new l0(aVar3, 15, step4, FlowCoordinator);
                            Intrinsics.checkNotNullParameter(block3, "block");
                            viewControllerE12.H = block3;
                            return viewControllerE12;
                        }
                        if (!(step4 instanceof BrebFlowContract$Step.Register)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        BrebRegisterScreen brebRegisterScreen = new BrebRegisterScreen(new BrebRegisterScreenContract$InputData(((BrebFlowContract$Step.Register) step4).f61717a));
                        ov1.f block4 = new ov1.f(aVar3, FlowCoordinator, i5);
                        Intrinsics.checkNotNullParameter(block4, "block");
                        brebRegisterScreen.H = block4;
                        return brebRegisterScreen;
                    }
                    brebTransferFlow = new BrebTransferFlow(((BrebFlowContract$Step.Transfer) step4).f61718a);
                }
                return brebTransferFlow;
            case 9:
                com.revolut.feature.kyc.impl.flow.input_document_id.a aVar4 = (com.revolut.feature.kyc.impl.flow.input_document_id.a) obj4;
                InputDocumentIdFlowContract$Step step5 = (InputDocumentIdFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (!(step5 instanceof InputDocumentIdFlowContract$Step.KYCDocumentId)) {
                    throw new NoWhenBranchMatchedException();
                }
                InputDocumentIdFlowContract$InputData inputDocumentIdFlowContract$InputData = aVar4.o;
                KYCDocumentIdInputScreen kYCDocumentIdInputScreen = new KYCDocumentIdInputScreen(new KYCDocumentIdInputScreenContract$InputData(inputDocumentIdFlowContract$InputData.f77689a, inputDocumentIdFlowContract$InputData.f77690b));
                t block5 = new t(aVar4, kYCDocumentIdInputScreen, 5);
                Intrinsics.checkNotNullParameter(block5, "block");
                kYCDocumentIdInputScreen.H = block5;
                return kYCDocumentIdInputScreen;
            case 10:
                com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d dVar2 = (com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d) obj4;
                RevPointsExclusiveStoreProductCheckoutScreenContract$Step step6 = (RevPointsExclusiveStoreProductCheckoutScreenContract$Step) obj3;
                Intrinsics.checkNotNullParameter((l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (!(step6 instanceof RevPointsExclusiveStoreProductCheckoutScreenContract$Step.AddressUpdate)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE13 = dVar2.e1(new th1.a(new AddressFlowContract$InputData(((ovb.e) ((j2) dVar2.f83612y.f22677a).getValue()).f, new TextLocalisedClause(R$string.exclusive_store_product_checkout_item_delivery_address_title, null, null, 14), null, false, null, null, null, null, false, null, 1572860), null, dVar2.v, 2));
                ovb.j block6 = new ovb.j(dVar2, i5);
                Intrinsics.checkNotNullParameter(block6, "block");
                viewControllerE13.H = block6;
                return viewControllerE13;
            case 11:
                com.revolut.retail.feature.airportlounges.impl.ui.flows.home.b bVar3 = (com.revolut.retail.feature.airportlounges.impl.ui.flows.home.b) obj4;
                LoungePassHomeFlowContract$Step step7 = (LoungePassHomeFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.b) obj2, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (step7 instanceof LoungePassHomeFlowContract$Step.Home) {
                    AirportLoungesHomeScreen airportLoungesHomeScreen = new AirportLoungesHomeScreen(new AirportLoungesHomeScreenContract$InputData(((LoungePassHomeFlowContract$Step.Home) step7).f98963a));
                    owi.c block7 = new owi.c(bVar3, 2);
                    Intrinsics.checkNotNullParameter(block7, "block");
                    airportLoungesHomeScreen.H = block7;
                    return airportLoungesHomeScreen;
                }
                if (step7 instanceof LoungePassHomeFlowContract$Step.PurchasePass) {
                    return new AirportLoungePassDetailsFlow(AirportLoungePassDetailsFlowContract$InputData.Checkout.f98984a);
                }
                if (step7 instanceof LoungePassHomeFlowContract$Step.LoungeSearch) {
                    return new AirportLoungeSearchFlow(new AirportLoungeSearchFlowContract$InputData(true));
                }
                if (step7 instanceof LoungePassHomeFlowContract$Step.PassDetails) {
                    return new AirportLoungePassDetailsFlow(new AirportLoungePassDetailsFlowContract$InputData.PassDetails(((LoungePassHomeFlowContract$Step.PassDetails) step7).f98969a));
                }
                if (step7 instanceof LoungePassHomeFlowContract$Step.SavedLounges) {
                    AirportSavedLoungesScreen airportSavedLoungesScreen = new AirportSavedLoungesScreen();
                    owi.c cVar = new owi.c(bVar3, 4);
                    Intrinsics.checkNotNullParameter(cVar, "<set-?>");
                    airportSavedLoungesScreen.H = cVar;
                    return airportSavedLoungesScreen;
                }
                if (step7 instanceof LoungePassHomeFlowContract$Step.PassActivity) {
                    return new AirportLoungesPassActivityScreen();
                }
                if (step7 instanceof LoungePassHomeFlowContract$Step.LoungeDetails) {
                    LoungePassHomeFlowContract$Step.LoungeDetails loungeDetails = (LoungePassHomeFlowContract$Step.LoungeDetails) step7;
                    AirportLoungeDetailsScreen airportLoungeDetailsScreen = new AirportLoungeDetailsScreen(new AirportLoungeDetailsScreenContract$InputData(loungeDetails.f98965a, loungeDetails.f98966b, true));
                    owi.c cVar2 = new owi.c(bVar3, i3);
                    Intrinsics.checkNotNullParameter(cVar2, "<set-?>");
                    airportLoungeDetailsScreen.H = cVar2;
                    return airportLoungeDetailsScreen;
                }
                if (step7 instanceof LoungePassHomeFlowContract$Step.LoungeAmenities) {
                    return new AirportLoungesAmenitiesScreen(new AirportLoungesAmenitiesScreenContract$InputData(((LoungePassHomeFlowContract$Step.LoungeAmenities) step7).f98964a));
                }
                if (!(step7 instanceof LoungePassHomeFlowContract$Step.AirportDetails)) {
                    if (step7 instanceof LoungePassHomeFlowContract$Step.Refund) {
                        return new AirportLoungePassDetailsRefundScreen();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                AirportDetailsScreen airportDetailsScreen = new AirportDetailsScreen(new AirportDetailsScreenContract$InputData(((LoungePassHomeFlowContract$Step.AirportDetails) step7).f98962a, true));
                owi.c cVar3 = new owi.c(bVar3, i5);
                Intrinsics.checkNotNullParameter(cVar3, "<set-?>");
                airportDetailsScreen.H = cVar3;
                return airportDetailsScreen;
            case 12:
                com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b bVar4 = (com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                CryptoTradeContract$ModalStep step8 = (CryptoTradeContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (!(step8 instanceof CryptoTradeContract$ModalStep.SelectSorting)) {
                    throw new NoWhenBranchMatchedException();
                }
                CryptoSortingPickerScreen cryptoSortingPickerScreen = new CryptoSortingPickerScreen(new CryptoSortingPickerInputData(((CryptoTradeContract$ModalStep.SelectSorting) step8).f71561a));
                c0 block8 = new c0(bVar4, i5);
                Intrinsics.checkNotNullParameter(block8, "block");
                cryptoSortingPickerScreen.H = block8;
                return cryptoSortingPickerScreen;
            case 13:
                com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a aVar5 = (com.revolut.feature.freelancer.impl.ui.invoice.details.screen.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator5 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                InvoiceDetailsScreenContract$ModalStep step9 = (InvoiceDetailsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator5, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (step9 instanceof InvoiceDetailsScreenContract$ModalStep.InvoicePreview) {
                    return aVar5.e1(new t9d.b(((InvoiceDetailsScreenContract$ModalStep.InvoicePreview) step9).f73865a));
                }
                throw new NoWhenBranchMatchedException();
            case 14:
                final com.revolut.feature.kyc.impl.web_id.flow.a aVar6 = (com.revolut.feature.kyc.impl.web_id.flow.a) obj4;
                nx8.a aVar7 = aVar6.f77891r;
                WebIdFlowContract$Step step10 = (WebIdFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step10, "step");
                if (Intrinsics.f(step10, WebIdFlowContract$Step.WebId.f77888a)) {
                    WebIdPortalScreen webIdPortalScreen = new WebIdPortalScreen(new WebIdPortalScreenContract$InputData(aVar6.o.f77885a));
                    final int i21 = 2;
                    Function1 block9 = new Function1() { // from class: ox8.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            int i22 = i21;
                            com.revolut.feature.kyc.impl.web_id.flow.a aVar8 = aVar6;
                            f fVar = f.f189310a;
                            switch (i22) {
                                case 0:
                                    u result = (u) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if ((result instanceof s) || (result instanceof q)) {
                                        aVar8.C2(fVar);
                                    } else {
                                        if (!(result instanceof r) && !(result instanceof d67.p) && !(result instanceof d67.t)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        IllegalStateException illegalStateException = new IllegalStateException("No agents available full screen prompt output " + result + " cannot be handled in WebId flow");
                                        h0 h0Var = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                                        d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    u result2 = (u) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof q) {
                                        aVar8.C2(fVar);
                                    } else if (result2 instanceof s) {
                                        aVar8.C1(new ExternalDestination.ByIntent(((s70.b) aVar8.f77890q).b(), null));
                                    } else {
                                        if (!(result2 instanceof r) && !(result2 instanceof d67.t) && !(result2 instanceof d67.p)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        IllegalStateException illegalStateException2 = new IllegalStateException("Permission rationale Full screen prompt output " + result2 + " cannot be handled in WebId flow");
                                        h0 h0Var2 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList2 = d.f253311a;
                                        d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                                    }
                                    return Unit.f186387a;
                                default:
                                    qx8.l screenResult = (qx8.l) obj6;
                                    Intrinsics.checkNotNullParameter(screenResult, "screenResult");
                                    boolean zF = Intrinsics.f(screenResult, j.f250039a);
                                    com.revolut.feature.kyc.impl.web_id.flow.a aVar9 = aVar6;
                                    if (zF) {
                                        aVar9.C2(fVar);
                                    } else if (Intrinsics.f(screenResult, qx8.k.f250040a)) {
                                        aVar9.f77891r.getClass();
                                        yji.l.b1(aVar9, aVar9.X1(nx8.a.c()), null, new ocb.d(aVar9, null, 28), 3);
                                    } else if (Intrinsics.f(screenResult, g.f250036a)) {
                                        h.t2(aVar9, aVar9.f77892s, WebIdFlowContract$Step.NoAgentsAvailable.f77886a, false, null, false, 12);
                                    } else if (Intrinsics.f(screenResult, qx8.h.f250037a)) {
                                        h.t2(aVar9, aVar9.f77892s, WebIdFlowContract$Step.PermissionDenied.f77887a, false, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(screenResult, i.f250038a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar9.C2(e.f189309a);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block9, "block");
                    webIdPortalScreen.H = block9;
                    return webIdPortalScreen;
                }
                if (!Intrinsics.f(step10, WebIdFlowContract$Step.PermissionDenied.f77887a)) {
                    if (!Intrinsics.f(step10, WebIdFlowContract$Step.NoAgentsAvailable.f77886a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar7.getClass();
                    PromptMarketingScreen promptMarketingScreen = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.video_conference_out_of_hours_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.video_conference_out_of_hours_de_subtitle, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D362", null, null, null, 30), null, null, new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, new PromptMarketingContentDelegate.Model.Button((Clause) new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.video_conference_out_of_hours_action_continue, null, null, 14), (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, 65368));
                    final int i22 = 0;
                    Function1 block10 = new Function1() { // from class: ox8.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            int i222 = i22;
                            com.revolut.feature.kyc.impl.web_id.flow.a aVar8 = aVar6;
                            f fVar = f.f189310a;
                            switch (i222) {
                                case 0:
                                    u result = (u) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if ((result instanceof s) || (result instanceof q)) {
                                        aVar8.C2(fVar);
                                    } else {
                                        if (!(result instanceof r) && !(result instanceof d67.p) && !(result instanceof d67.t)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        IllegalStateException illegalStateException = new IllegalStateException("No agents available full screen prompt output " + result + " cannot be handled in WebId flow");
                                        h0 h0Var = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                                        d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    u result2 = (u) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof q) {
                                        aVar8.C2(fVar);
                                    } else if (result2 instanceof s) {
                                        aVar8.C1(new ExternalDestination.ByIntent(((s70.b) aVar8.f77890q).b(), null));
                                    } else {
                                        if (!(result2 instanceof r) && !(result2 instanceof d67.t) && !(result2 instanceof d67.p)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        IllegalStateException illegalStateException2 = new IllegalStateException("Permission rationale Full screen prompt output " + result2 + " cannot be handled in WebId flow");
                                        h0 h0Var2 = h0.f322473a;
                                        CopyOnWriteArrayList copyOnWriteArrayList2 = d.f253311a;
                                        d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                                    }
                                    return Unit.f186387a;
                                default:
                                    qx8.l screenResult = (qx8.l) obj6;
                                    Intrinsics.checkNotNullParameter(screenResult, "screenResult");
                                    boolean zF = Intrinsics.f(screenResult, j.f250039a);
                                    com.revolut.feature.kyc.impl.web_id.flow.a aVar9 = aVar6;
                                    if (zF) {
                                        aVar9.C2(fVar);
                                    } else if (Intrinsics.f(screenResult, qx8.k.f250040a)) {
                                        aVar9.f77891r.getClass();
                                        yji.l.b1(aVar9, aVar9.X1(nx8.a.c()), null, new ocb.d(aVar9, null, 28), 3);
                                    } else if (Intrinsics.f(screenResult, g.f250036a)) {
                                        h.t2(aVar9, aVar9.f77892s, WebIdFlowContract$Step.NoAgentsAvailable.f77886a, false, null, false, 12);
                                    } else if (Intrinsics.f(screenResult, qx8.h.f250037a)) {
                                        h.t2(aVar9, aVar9.f77892s, WebIdFlowContract$Step.PermissionDenied.f77887a, false, null, false, 12);
                                    } else {
                                        if (!Intrinsics.f(screenResult, i.f250038a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar9.C2(e.f189309a);
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block10, "block");
                    promptMarketingScreen.H = block10;
                    return promptMarketingScreen;
                }
                aVar7.getClass();
                TextLocalisedClause title = new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.video_conference_permissions_not_granted_title, null, null, 14);
                TextLocalisedClause subtitle = new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.video_conference_permissions_not_granted_subtitle, null, null, 14);
                TextLocalisedClause buttonTitle = new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.video_conference_permissions_not_granted_button_title, null, null, 14);
                CdnImage image = com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D019", null, null, null, 30);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
                Intrinsics.checkNotNullParameter(image, "image");
                PromptMarketingScreen promptMarketingScreen2 = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(title, subtitle, image, null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, new PromptMarketingContentDelegate.Model.Button((Clause) buttonTitle, (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, 65368));
                Function1 block11 = new Function1() { // from class: ox8.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        int i222 = i5;
                        com.revolut.feature.kyc.impl.web_id.flow.a aVar8 = aVar6;
                        f fVar = f.f189310a;
                        switch (i222) {
                            case 0:
                                u result = (u) obj6;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if ((result instanceof s) || (result instanceof q)) {
                                    aVar8.C2(fVar);
                                } else {
                                    if (!(result instanceof r) && !(result instanceof d67.p) && !(result instanceof d67.t)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    IllegalStateException illegalStateException = new IllegalStateException("No agents available full screen prompt output " + result + " cannot be handled in WebId flow");
                                    h0 h0Var = h0.f322473a;
                                    CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                                    d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                                }
                                return Unit.f186387a;
                            case 1:
                                u result2 = (u) obj6;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (result2 instanceof q) {
                                    aVar8.C2(fVar);
                                } else if (result2 instanceof s) {
                                    aVar8.C1(new ExternalDestination.ByIntent(((s70.b) aVar8.f77890q).b(), null));
                                } else {
                                    if (!(result2 instanceof r) && !(result2 instanceof d67.t) && !(result2 instanceof d67.p)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    IllegalStateException illegalStateException2 = new IllegalStateException("Permission rationale Full screen prompt output " + result2 + " cannot be handled in WebId flow");
                                    h0 h0Var2 = h0.f322473a;
                                    CopyOnWriteArrayList copyOnWriteArrayList2 = d.f253311a;
                                    d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                                }
                                return Unit.f186387a;
                            default:
                                qx8.l screenResult = (qx8.l) obj6;
                                Intrinsics.checkNotNullParameter(screenResult, "screenResult");
                                boolean zF = Intrinsics.f(screenResult, j.f250039a);
                                com.revolut.feature.kyc.impl.web_id.flow.a aVar9 = aVar6;
                                if (zF) {
                                    aVar9.C2(fVar);
                                } else if (Intrinsics.f(screenResult, qx8.k.f250040a)) {
                                    aVar9.f77891r.getClass();
                                    yji.l.b1(aVar9, aVar9.X1(nx8.a.c()), null, new ocb.d(aVar9, null, 28), 3);
                                } else if (Intrinsics.f(screenResult, g.f250036a)) {
                                    h.t2(aVar9, aVar9.f77892s, WebIdFlowContract$Step.NoAgentsAvailable.f77886a, false, null, false, 12);
                                } else if (Intrinsics.f(screenResult, qx8.h.f250037a)) {
                                    h.t2(aVar9, aVar9.f77892s, WebIdFlowContract$Step.PermissionDenied.f77887a, false, null, false, 12);
                                } else {
                                    if (!Intrinsics.f(screenResult, i.f250038a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar9.C2(e.f189309a);
                                }
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block11, "block");
                promptMarketingScreen2.H = block11;
                return promptMarketingScreen2;
            case 15:
                final com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.a aVar8 = (com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.a) obj4;
                y yVar = aVar8.f73936r;
                qy6.d dVar3 = aVar8.o;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator6 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                InvoiceRecurringSettingsScreenContract$ModalStep step11 = (InvoiceRecurringSettingsScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator6, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step11, "step");
                if (!Intrinsics.f(step11, InvoiceRecurringSettingsScreenContract$ModalStep.Limit.f73932a)) {
                    if (!Intrinsics.f(step11, InvoiceRecurringSettingsScreenContract$ModalStep.Period.f73933a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oy6.j jVar = ((oy6.f) ((j2) yVar.f22677a).getValue()).f230894c;
                    FreelancerSingleChoiceScreen freelancerSingleChoiceScreenB = dVar3.b(jVar != null ? jVar.f230897a : 0);
                    final int i32 = 0;
                    Function1 block12 = new Function1() { // from class: oy6.o
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            sr6.l lVar;
                            Object gVar;
                            switch (i32) {
                                case 0:
                                    mw6.e result = (mw6.e) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    if (result instanceof mw6.c) {
                                        String str2 = ((mw6.c) result).f209401a;
                                        sr6.l[] lVarArrValues = sr6.l.values();
                                        int length = lVarArrValues.length;
                                        int i33 = 0;
                                        while (true) {
                                            if (i33 < length) {
                                                lVar = lVarArrValues[i33];
                                                if (!kotlin.text.a0.z(lVar.name(), str2, true)) {
                                                    i33++;
                                                }
                                            } else {
                                                lVar = null;
                                            }
                                        }
                                        if (lVar != null) {
                                            com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.a aVar9 = aVar8;
                                            aVar9.H2(aVar9.f73936r, new v(lVar, 1));
                                        }
                                    }
                                    break;
                                default:
                                    com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.a aVar10 = aVar8;
                                    y yVar2 = aVar10.f73936r;
                                    mw6.e result2 = (mw6.e) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof mw6.c) {
                                        String str3 = ((mw6.c) result2).f209401a;
                                        if (Intrinsics.f(str3, "ID_SINGLE_CHOICE_LIMIT_AFTER")) {
                                            i iVar2 = ((f) ((j2) yVar2.f22677a).getValue()).f230893b;
                                            gVar = new g(iVar2 != null ? iVar2.w() : null);
                                        } else if (Intrinsics.f(str3, "ID_SINGLE_CHOICE_LIMIT_NEVER")) {
                                            gVar = h.f230896a;
                                        }
                                        aVar10.H2(yVar2, new oxd.m(gVar, 3));
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block12, "block");
                    freelancerSingleChoiceScreenB.H = block12;
                    return freelancerSingleChoiceScreenB;
                }
                oy6.i iVar2 = ((oy6.f) ((j2) yVar.f22677a).getValue()).f230893b;
                if (iVar2 instanceof oy6.g) {
                    str = "ID_SINGLE_CHOICE_LIMIT_AFTER";
                } else if (iVar2 instanceof oy6.h) {
                    str = "ID_SINGLE_CHOICE_LIMIT_NEVER";
                } else if (iVar2 != null) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar3.getClass();
                FreelancerSingleChoiceScreen freelancerSingleChoiceScreenA = qy6.d.a(str, false);
                Function1 block13 = new Function1() { // from class: oy6.o
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        sr6.l lVar;
                        Object gVar;
                        switch (i5) {
                            case 0:
                                mw6.e result = (mw6.e) obj6;
                                Intrinsics.checkNotNullParameter(result, "result");
                                if (result instanceof mw6.c) {
                                    String str2 = ((mw6.c) result).f209401a;
                                    sr6.l[] lVarArrValues = sr6.l.values();
                                    int length = lVarArrValues.length;
                                    int i33 = 0;
                                    while (true) {
                                        if (i33 < length) {
                                            lVar = lVarArrValues[i33];
                                            if (!kotlin.text.a0.z(lVar.name(), str2, true)) {
                                                i33++;
                                            }
                                        } else {
                                            lVar = null;
                                        }
                                    }
                                    if (lVar != null) {
                                        com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.a aVar9 = aVar8;
                                        aVar9.H2(aVar9.f73936r, new v(lVar, 1));
                                    }
                                }
                                break;
                            default:
                                com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.a aVar10 = aVar8;
                                y yVar2 = aVar10.f73936r;
                                mw6.e result2 = (mw6.e) obj6;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (result2 instanceof mw6.c) {
                                    String str3 = ((mw6.c) result2).f209401a;
                                    if (Intrinsics.f(str3, "ID_SINGLE_CHOICE_LIMIT_AFTER")) {
                                        i iVar22 = ((f) ((j2) yVar2.f22677a).getValue()).f230893b;
                                        gVar = new g(iVar22 != null ? iVar22.w() : null);
                                    } else if (Intrinsics.f(str3, "ID_SINGLE_CHOICE_LIMIT_NEVER")) {
                                        gVar = h.f230896a;
                                    }
                                    aVar10.H2(yVar2, new oxd.m(gVar, 3));
                                }
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block13, "block");
                freelancerSingleChoiceScreenA.H = block13;
                return freelancerSingleChoiceScreenA;
            case 16:
                com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund.c cVar4 = (com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_refund.c) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator7 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                AirportLoungesPassRefundContract$ModalStep step12 = (AirportLoungesPassRefundContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator7, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step12, "step");
                if (Intrinsics.f(step12, AirportLoungesPassRefundContract$ModalStep.RevPointsBottomSheet.f99137a)) {
                    return cVar4.e1(new hub.c(e0.LOUNGES));
                }
                throw new NoWhenBranchMatchedException();
            case 17:
                com.revolut.feature.statements.impl.ui.consolidated.flow.a aVar9 = (com.revolut.feature.statements.impl.ui.consolidated.flow.a) obj4;
                ConsolidatedStatementFlowContract$Step step13 = (ConsolidatedStatementFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step13, "step");
                if (!(step13 instanceof ConsolidatedStatementFlowContract$Step.ConsolidatedStatementScreen)) {
                    if (Intrinsics.f(step13, ConsolidatedStatementFlowContract$Step.BankIDAnnualStatementsScreen.f88310a)) {
                        return new BankIDAnnualStatementsScreen();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                StatementsMode statementsMode = aVar9.o.f88309a;
                if (statementsMode instanceof StatementsMode.Consolidated) {
                    StatementsMode.Consolidated consolidated = (StatementsMode.Consolidated) statementsMode;
                    wi0.b bVar5 = consolidated.f88213a;
                    wi0.b.Companion.getClass();
                    statementsModeConfig = new StatementsModeConfig(consolidated, Intrinsics.f(bVar5, wi0.b.O) ? new TextLocalisedClause(com.revolut.feature.statements.R$string.statements_group_consolidated_statement_co_title, null, null, 14) : new TextLocalisedClause(com.revolut.feature.statements.R$string.statements_group_consolidated_screen_title, null, null, 14), null, null);
                } else if (statementsMode instanceof StatementsMode.TaxCertificate) {
                    statementsModeConfig = new StatementsModeConfig((StatementsMode.TaxCertificate) statementsMode, new TextLocalisedClause(com.revolut.feature.statements.R$string.statements_group_tax_certificate_title, null, null, 14), null, null);
                } else {
                    if (!(statementsMode instanceof StatementsMode.TaxFiling)) {
                        throw new IllegalArgumentException(statementsMode + " not support by ConsolidatedStatementScreen");
                    }
                    StatementsMode.TaxFiling taxFiling = (StatementsMode.TaxFiling) statementsMode;
                    statementsModeConfig = new StatementsModeConfig(taxFiling, new TextLocalisedClause(com.revolut.feature.statements.R$string.statements_group_tax_filing_screen_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.statements.R$string.statements_group_tax_filing_screen_subtitle, zhm.u.c(new CountryClause(taxFiling.f88215a, null)), null, 12), new StatementsModeConfig.Warning(new TextLocalisedClause(com.revolut.feature.statements.R$string.statements_group_tax_filing_screen_warning_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.statements.R$string.statements_group_tax_filing_screen_warning_subtitle, zhm.u.c(new TextLocalisedClause(com.revolut.feature.statements.R$string.statements_group_tax_filing_screen_warning_subtitle_param, null, new Click(30, (Integer) null, (Object) null, "CLICK_CLAUSE_ID", false), 10)), null, 12), taxFiling.f88216b, "CLICK_CLAUSE_ID"));
                }
                return new ConsolidatedStatementScreen(new ConsolidatedStatementScreenContract$InputData(statementsModeConfig));
            case 18:
                final p01.b bVar6 = (p01.b) obj4;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(936957250, iIntValue, -1, "com.revolut.core.ui_kit_remote.widget.models.ActionTileWidget.<anonymous> (ActionTileWidget.kt:75)");
                    }
                    long packedValue = ((DpSize) composer.consume(CompositionLocalsKt.getLocalSize())).getPackedValue();
                    float fM3321getHeightD9Ej5fM = DpSize.m3321getHeightD9Ej5fM(packedValue);
                    float fM3322getWidthD9Ej5fM = DpSize.m3322getWidthD9Ej5fM(packedValue);
                    final boolean z = Dp.m3296compareTo0680j_4(fM3321getHeightD9Ej5fM, Dp.m3297constructorimpl((float) 150)) >= 0;
                    float f = 60;
                    float fM3297constructorimpl = (Dp.m3296compareTo0680j_4(fM3321getHeightD9Ej5fM, Dp.m3297constructorimpl(f)) <= 0 || Dp.m3296compareTo0680j_4(fM3322getWidthD9Ej5fM, Dp.m3297constructorimpl((float) 80)) <= 0) ? Dp.m3297constructorimpl(8) : Dp.m3297constructorimpl(16);
                    float f4 = (4 + fM3297constructorimpl) * 2;
                    final float f5 = fM3322getWidthD9Ej5fM - f4;
                    final float f6 = fM3321getHeightD9Ej5fM - f4;
                    GlanceModifier glanceModifierFillMaxSize = SizeModifiersKt.fillMaxSize(GlanceModifier.INSTANCE);
                    GlanceModifier glanceModifierCornerRadius = CornerRadiusKt.cornerRadius(AppWidgetBackgroundKt.appWidgetBackground((Dp.m3296compareTo0680j_4(fM3321getHeightD9Ej5fM, Dp.m3297constructorimpl(f)) <= 0 || !z) ? PaddingKt.m3565paddingqDBjuR0$default(glanceModifierFillMaxSize, fM3297constructorimpl, BitmapDescriptorFactory.HUE_RED, fM3297constructorimpl, BitmapDescriptorFactory.HUE_RED, 10, null) : PaddingKt.m3563padding3ABfNKs(glanceModifierFillMaxSize, fM3297constructorimpl)), R$dimen.widgetBackgroundRadius);
                    Pair pair = bVar6.f231411b;
                    ImageProvider imageProvider = pair != null ? (ImageProvider) pair.f186385a : null;
                    GlanceModifier glanceModifierClickable = ActionKt.clickable(imageProvider != null ? BackgroundKt.m3479backgroundl7F5y5Q(glanceModifierCornerRadius, imageProvider, ContentScale.INSTANCE.m3547getCropAe3V0ko()) : BackgroundKt.m3480backgroundl7F5y5Q$default(glanceModifierCornerRadius, ImageKt.ImageProvider(com.revolut.core.ui_kit_remote.R$drawable.widget_background_default), 0, 2, null), md6.s.B(bVar6.e));
                    Alignment.Companion companion = Alignment.INSTANCE;
                    final int i33 = 0;
                    ColumnKt.m3537ColumnK4GKKTE(glanceModifierClickable, z ? companion.m3516getTopmnfRV0w() : companion.m3514getCenterVerticallymnfRV0w(), Alignment.INSTANCE.m3515getStartPGIyAqw(), ComposableLambdaKt.rememberComposableLambda(407710348, true, new Function3() { // from class: p01.e
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            switch (i33) {
                                case 0:
                                    b bVar7 = (b) bVar6;
                                    ColumnScope Column = (ColumnScope) obj6;
                                    Composer composer2 = (Composer) obj7;
                                    int iIntValue2 = ((Integer) obj8).intValue();
                                    Intrinsics.checkNotNullParameter(Column, "$this$Column");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(407710348, iIntValue2, -1, "com.revolut.core.ui_kit_remote.widget.models.ActionTileWidget.<anonymous>.<anonymous> (ActionTileWidget.kt:112)");
                                    }
                                    s sVar = bVar7.f231410a;
                                    Pair pair2 = bVar7.f231411b;
                                    x8 x8Var = pair2 != null ? (x8) pair2.f186386b : null;
                                    float f32 = f5;
                                    float f35 = f6;
                                    d0.a(sVar, x8Var, f32, f35, composer2, 0, 0);
                                    if (!z || f35 - 60 <= 48.0f) {
                                        composer2.startReplaceGroup(-73182346);
                                    } else {
                                        composer2.startReplaceGroup(-68215681);
                                        SpacerKt.Spacer(Column.defaultWeight(GlanceModifier.INSTANCE), composer2, 0, 0);
                                        o.b(bVar7.f231412c, bVar7.d, pair2 != null ? (x8) pair2.f186386b : null, f32, composer2, 0);
                                    }
                                    composer2.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    break;
                                default:
                                    h hVar = (h) bVar6;
                                    ColumnScope Column2 = (ColumnScope) obj6;
                                    Composer composer3 = (Composer) obj7;
                                    int iIntValue3 = ((Integer) obj8).intValue();
                                    Intrinsics.checkNotNullParameter(Column2, "$this$Column");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1887260292, iIntValue3, -1, "com.revolut.core.ui_kit_remote.widget.models.BalanceTileWidget.<anonymous>.<anonymous> (BalanceTileWidget.kt:90)");
                                    }
                                    d0.a(hVar.f231431a, null, f5, f6, composer3, 0, 2);
                                    if (hVar.f231432b != null) {
                                        composer3.startReplaceGroup(-2045307804);
                                        if (z) {
                                            composer3.startReplaceGroup(-2045282105);
                                            SpacerKt.Spacer(Column2.defaultWeight(GlanceModifier.INSTANCE), composer3, 0, 0);
                                        } else {
                                            composer3.startReplaceGroup(-2049241890);
                                        }
                                        composer3.endReplaceGroup();
                                        n01.d.a(hVar.f231432b, null, 0, n01.a.GREY_TONE_50, new n01.f(Dp.m3297constructorimpl(14)), 0, false, null, composer3, 27648, 230);
                                        composer3 = composer3;
                                    } else {
                                        composer3.startReplaceGroup(-2049241890);
                                    }
                                    composer3.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    }, composer, 54), composer, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.f186387a;
            case 19:
                final p01.h hVar = (p01.h) obj4;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-607575110, iIntValue2, -1, "com.revolut.core.ui_kit_remote.widget.models.BalanceTileWidget.<anonymous> (BalanceTileWidget.kt:59)");
                    }
                    long packedValue2 = ((DpSize) composer2.consume(CompositionLocalsKt.getLocalSize())).getPackedValue();
                    float fM3322getWidthD9Ej5fM2 = DpSize.m3322getWidthD9Ej5fM(packedValue2);
                    float fM3321getHeightD9Ej5fM2 = DpSize.m3321getHeightD9Ej5fM(packedValue2);
                    final boolean z3 = Dp.m3296compareTo0680j_4(fM3321getHeightD9Ej5fM2, Dp.m3297constructorimpl((float) SyslogConstants.LOG_CLOCK)) >= 0;
                    float f32 = 60;
                    float fM3297constructorimpl2 = (Dp.m3296compareTo0680j_4(fM3321getHeightD9Ej5fM2, Dp.m3297constructorimpl(f32)) <= 0 || Dp.m3296compareTo0680j_4(fM3322getWidthD9Ej5fM2, Dp.m3297constructorimpl((float) 80)) <= 0) ? Dp.m3297constructorimpl(8) : Dp.m3297constructorimpl(16);
                    float f35 = (4 + fM3297constructorimpl2) * 2;
                    final float f36 = fM3322getWidthD9Ej5fM2 - f35;
                    final float f37 = fM3321getHeightD9Ej5fM2 - f35;
                    GlanceModifier glanceModifierFillMaxSize2 = SizeModifiersKt.fillMaxSize(GlanceModifier.INSTANCE);
                    GlanceModifier glanceModifierClickable2 = ActionKt.clickable(BackgroundKt.m3480backgroundl7F5y5Q$default(CornerRadiusKt.cornerRadius(AppWidgetBackgroundKt.appWidgetBackground((Dp.m3296compareTo0680j_4(DpSize.m3321getHeightD9Ej5fM(packedValue2), Dp.m3297constructorimpl(f32)) <= 0 || !z3) ? PaddingKt.m3565paddingqDBjuR0$default(glanceModifierFillMaxSize2, fM3297constructorimpl2, BitmapDescriptorFactory.HUE_RED, fM3297constructorimpl2, BitmapDescriptorFactory.HUE_RED, 10, null) : PaddingKt.m3563padding3ABfNKs(glanceModifierFillMaxSize2, fM3297constructorimpl2)), R$dimen.widgetBackgroundRadius), ImageKt.ImageProvider(com.revolut.core.ui_kit_remote.R$drawable.widget_background_default), 0, 2, null), md6.s.B(hVar.f231433c));
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    final int i43 = 1;
                    ColumnKt.m3537ColumnK4GKKTE(glanceModifierClickable2, z3 ? companion2.m3516getTopmnfRV0w() : companion2.m3514getCenterVerticallymnfRV0w(), Alignment.INSTANCE.m3515getStartPGIyAqw(), ComposableLambdaKt.rememberComposableLambda(1887260292, true, new Function3() { // from class: p01.e
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            switch (i43) {
                                case 0:
                                    b bVar7 = (b) hVar;
                                    ColumnScope Column = (ColumnScope) obj6;
                                    Composer composer22 = (Composer) obj7;
                                    int iIntValue22 = ((Integer) obj8).intValue();
                                    Intrinsics.checkNotNullParameter(Column, "$this$Column");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(407710348, iIntValue22, -1, "com.revolut.core.ui_kit_remote.widget.models.ActionTileWidget.<anonymous>.<anonymous> (ActionTileWidget.kt:112)");
                                    }
                                    s sVar = bVar7.f231410a;
                                    Pair pair2 = bVar7.f231411b;
                                    x8 x8Var = pair2 != null ? (x8) pair2.f186386b : null;
                                    float f322 = f36;
                                    float f352 = f37;
                                    d0.a(sVar, x8Var, f322, f352, composer22, 0, 0);
                                    if (!z3 || f352 - 60 <= 48.0f) {
                                        composer22.startReplaceGroup(-73182346);
                                    } else {
                                        composer22.startReplaceGroup(-68215681);
                                        SpacerKt.Spacer(Column.defaultWeight(GlanceModifier.INSTANCE), composer22, 0, 0);
                                        o.b(bVar7.f231412c, bVar7.d, pair2 != null ? (x8) pair2.f186386b : null, f322, composer22, 0);
                                    }
                                    composer22.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    break;
                                default:
                                    h hVar2 = (h) hVar;
                                    ColumnScope Column2 = (ColumnScope) obj6;
                                    Composer composer3 = (Composer) obj7;
                                    int iIntValue3 = ((Integer) obj8).intValue();
                                    Intrinsics.checkNotNullParameter(Column2, "$this$Column");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1887260292, iIntValue3, -1, "com.revolut.core.ui_kit_remote.widget.models.BalanceTileWidget.<anonymous>.<anonymous> (BalanceTileWidget.kt:90)");
                                    }
                                    d0.a(hVar2.f231431a, null, f36, f37, composer3, 0, 2);
                                    if (hVar2.f231432b != null) {
                                        composer3.startReplaceGroup(-2045307804);
                                        if (z3) {
                                            composer3.startReplaceGroup(-2045282105);
                                            SpacerKt.Spacer(Column2.defaultWeight(GlanceModifier.INSTANCE), composer3, 0, 0);
                                        } else {
                                            composer3.startReplaceGroup(-2049241890);
                                        }
                                        composer3.endReplaceGroup();
                                        n01.d.a(hVar2.f231432b, null, 0, n01.a.GREY_TONE_50, new n01.f(Dp.m3297constructorimpl(14)), 0, false, null, composer3, 27648, 230);
                                        composer3 = composer3;
                                    } else {
                                        composer3.startReplaceGroup(-2049241890);
                                    }
                                    composer3.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    }, composer2, 54), composer2, 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return Unit.f186387a;
            case 20:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return ((p09.e) obj4).d;
            case 21:
                return DefaultTextContextMenuDropdownProvider_androidKt.DefaultTextContextMenuDropdown$lambda$0$0$0$0((TextContextMenuItem) obj4, (Composer) obj2, ((Integer) obj3).intValue());
            case 22:
                Map configuration = (Map) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                ((p15.b) obj4).f231874b.f("credit_help_country_config_key", configuration);
                return Unit.f186387a;
            case 23:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return ((r1g.c) obj4).a();
            case 24:
                ou3.g dashboard = (ou3.g) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(dashboard, "dashboard");
                ((p24.r) obj4).f232060b.f("credit-application-dashboard-key", dashboard);
                return Unit.f186387a;
            case 25:
                com.revolut.feature.rev_points.spare_change.impl.ui.screen.spare_change.a aVar10 = (com.revolut.feature.rev_points.spare_change.impl.ui.screen.spare_change.a) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator8 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                RevPointsSpareChangeControllerContract$ModalStep modalStep = (RevPointsSpareChangeControllerContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator8, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(modalStep, "modalStep");
                if (modalStep instanceof RevPointsSpareChangeControllerContract$ModalStep.Breakdown) {
                    return new RevPointsSpareChangeBreakdownController(new RevPointsSpareChangeBreakdownControllerApi$InputData(((RevPointsSpareChangeControllerContract$ModalStep.Breakdown) modalStep).f84181a, ((p2c.i) ((j2) aVar10.v.f22677a).getValue()).f232212b.a(), aVar10.I2(), 24));
                }
                throw new NoWhenBranchMatchedException();
            case 26:
                final com.revolut.feature.store.impl.ui.root.b bVar7 = (com.revolut.feature.store.impl.ui.root.b) obj4;
                final yki.b LazyFlowCoordinator = (yki.b) obj2;
                StoreFlowContract$Step step14 = (StoreFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step14, "step");
                if (step14 instanceof StoreFlowContract$Step.OptIn) {
                    ViewController viewControllerE14 = bVar7.e1(new hub.a(new LifestyleRevPointsOptInController$InputData((RevPointsOptInSource) RevPointsOptInSource.Shops.f84003a, false, 6)));
                    oxd.m block14 = new oxd.m(bVar7, i2);
                    Intrinsics.checkNotNullParameter(block14, "block");
                    viewControllerE14.H = block14;
                    return viewControllerE14;
                }
                if (step14 instanceof StoreFlowContract$Step.OpenHome) {
                    StoreFlowContract$Step.OpenHome openHome = (StoreFlowContract$Step.OpenHome) step14;
                    StoreHomeFlow storeHomeFlow = new StoreHomeFlow(new StoreHomeFlowContract$InputData(openHome.f88726a, openHome.f88727b));
                    final int i59 = 0;
                    Function1 block15 = new Function1() { // from class: p3e.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i59) {
                                case 0:
                                    com.revolut.feature.store.impl.ui.home.a result = (com.revolut.feature.store.impl.ui.home.a) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z4 = result instanceof i3e.h;
                                    com.revolut.feature.store.impl.ui.root.b bVar8 = bVar7;
                                    yki.b bVar9 = LazyFlowCoordinator;
                                    if (z4) {
                                        i3e.h hVar2 = (i3e.h) result;
                                        h.t2(bVar8, bVar9, new StoreFlowContract$Step.OpenBrandDetail(hVar2.f158188a, hVar2.f158189b, hVar2.f158190c, null), true, null, false, 12);
                                    } else if (result instanceof a.c) {
                                        h.t2(bVar8, bVar9, new StoreFlowContract$Step.OpenOrdersSeeAll(StoreOrdersSeeAllContract$InputData.Orders.f88715a), true, null, false, 12);
                                    } else if (result instanceof a.b) {
                                        h.t2(bVar8, bVar9, new StoreFlowContract$Step.OpenOrdersSeeAll(new StoreOrdersSeeAllContract$InputData.GiftCards(null)), true, null, false, 12);
                                    } else {
                                        if (!(result instanceof a.C0552a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(bVar8, bVar9, StoreFlowContract$Step.OpenSearch.f88729a, true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    q2e.j result2 = (q2e.j) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (!(result2 instanceof q2e.i)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(bVar7, LazyFlowCoordinator, new StoreFlowContract$Step.OpenOrdersSeeAll(new StoreOrdersSeeAllContract$InputData.GiftCards(((q2e.i) result2).f241592a)), true, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    r3e.j result3 = (r3e.j) obj6;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!(result3 instanceof r3e.i)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    r3e.i iVar3 = (r3e.i) result3;
                                    h.t2(bVar7, LazyFlowCoordinator, new StoreFlowContract$Step.OpenBrandDetail(iVar3.f251284a, iVar3.f251285b, iVar3.f251286c, null), true, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block15, "block");
                    storeHomeFlow.H = block15;
                    return storeHomeFlow;
                }
                if (step14 instanceof StoreFlowContract$Step.OpenBrandDetail) {
                    StoreFlowContract$Step.OpenBrandDetail openBrandDetail = (StoreFlowContract$Step.OpenBrandDetail) step14;
                    StoreBrandDetailFlow storeBrandDetailFlow = new StoreBrandDetailFlow(new StoreBrandDetailFlowContract$InputData(openBrandDetail.f88723a, openBrandDetail.f88724b, openBrandDetail.f88725c, openBrandDetail.d));
                    Function1 block16 = new Function1() { // from class: p3e.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i5) {
                                case 0:
                                    com.revolut.feature.store.impl.ui.home.a result = (com.revolut.feature.store.impl.ui.home.a) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z4 = result instanceof i3e.h;
                                    com.revolut.feature.store.impl.ui.root.b bVar8 = bVar7;
                                    yki.b bVar9 = LazyFlowCoordinator;
                                    if (z4) {
                                        i3e.h hVar2 = (i3e.h) result;
                                        h.t2(bVar8, bVar9, new StoreFlowContract$Step.OpenBrandDetail(hVar2.f158188a, hVar2.f158189b, hVar2.f158190c, null), true, null, false, 12);
                                    } else if (result instanceof a.c) {
                                        h.t2(bVar8, bVar9, new StoreFlowContract$Step.OpenOrdersSeeAll(StoreOrdersSeeAllContract$InputData.Orders.f88715a), true, null, false, 12);
                                    } else if (result instanceof a.b) {
                                        h.t2(bVar8, bVar9, new StoreFlowContract$Step.OpenOrdersSeeAll(new StoreOrdersSeeAllContract$InputData.GiftCards(null)), true, null, false, 12);
                                    } else {
                                        if (!(result instanceof a.C0552a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.t2(bVar8, bVar9, StoreFlowContract$Step.OpenSearch.f88729a, true, null, false, 12);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    q2e.j result2 = (q2e.j) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (!(result2 instanceof q2e.i)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(bVar7, LazyFlowCoordinator, new StoreFlowContract$Step.OpenOrdersSeeAll(new StoreOrdersSeeAllContract$InputData.GiftCards(((q2e.i) result2).f241592a)), true, null, false, 12);
                                    return Unit.f186387a;
                                default:
                                    r3e.j result3 = (r3e.j) obj6;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!(result3 instanceof r3e.i)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    r3e.i iVar3 = (r3e.i) result3;
                                    h.t2(bVar7, LazyFlowCoordinator, new StoreFlowContract$Step.OpenBrandDetail(iVar3.f251284a, iVar3.f251285b, iVar3.f251286c, null), true, null, false, 12);
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block16, "block");
                    storeBrandDetailFlow.H = block16;
                    return storeBrandDetailFlow;
                }
                if (step14 instanceof StoreFlowContract$Step.OpenOrdersSeeAll) {
                    return new StoreOrdersSeeAllScreen(((StoreFlowContract$Step.OpenOrdersSeeAll) step14).f88728a);
                }
                if (!(step14 instanceof StoreFlowContract$Step.OpenSearch)) {
                    throw new NoWhenBranchMatchedException();
                }
                StoreSearchScreen storeSearchScreen = new StoreSearchScreen();
                final int i66 = 2;
                Function1 block17 = new Function1() { // from class: p3e.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        switch (i66) {
                            case 0:
                                com.revolut.feature.store.impl.ui.home.a result = (com.revolut.feature.store.impl.ui.home.a) obj6;
                                Intrinsics.checkNotNullParameter(result, "result");
                                boolean z4 = result instanceof i3e.h;
                                com.revolut.feature.store.impl.ui.root.b bVar8 = bVar7;
                                yki.b bVar9 = LazyFlowCoordinator;
                                if (z4) {
                                    i3e.h hVar2 = (i3e.h) result;
                                    h.t2(bVar8, bVar9, new StoreFlowContract$Step.OpenBrandDetail(hVar2.f158188a, hVar2.f158189b, hVar2.f158190c, null), true, null, false, 12);
                                } else if (result instanceof a.c) {
                                    h.t2(bVar8, bVar9, new StoreFlowContract$Step.OpenOrdersSeeAll(StoreOrdersSeeAllContract$InputData.Orders.f88715a), true, null, false, 12);
                                } else if (result instanceof a.b) {
                                    h.t2(bVar8, bVar9, new StoreFlowContract$Step.OpenOrdersSeeAll(new StoreOrdersSeeAllContract$InputData.GiftCards(null)), true, null, false, 12);
                                } else {
                                    if (!(result instanceof a.C0552a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    h.t2(bVar8, bVar9, StoreFlowContract$Step.OpenSearch.f88729a, true, null, false, 12);
                                }
                                return Unit.f186387a;
                            case 1:
                                q2e.j result2 = (q2e.j) obj6;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (!(result2 instanceof q2e.i)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                h.t2(bVar7, LazyFlowCoordinator, new StoreFlowContract$Step.OpenOrdersSeeAll(new StoreOrdersSeeAllContract$InputData.GiftCards(((q2e.i) result2).f241592a)), true, null, false, 12);
                                return Unit.f186387a;
                            default:
                                r3e.j result3 = (r3e.j) obj6;
                                Intrinsics.checkNotNullParameter(result3, "result");
                                if (!(result3 instanceof r3e.i)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                r3e.i iVar3 = (r3e.i) result3;
                                h.t2(bVar7, LazyFlowCoordinator, new StoreFlowContract$Step.OpenBrandDetail(iVar3.f251284a, iVar3.f251285b, iVar3.f251286c, null), true, null, false, 12);
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block17, "block");
                storeSearchScreen.H = block17;
                return storeSearchScreen;
            case 27:
                com.revolut.feature.joint.impl.ui.close_flow.a aVar11 = (com.revolut.feature.joint.impl.ui.close_flow.a) obj4;
                JointCloseFlowContract$Step step15 = (JointCloseFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step15, "step");
                if (Intrinsics.f(step15, JointCloseFlowContract$Step.Confirmation.f76514a)) {
                    JointClosePromptScreen jointClosePromptScreen = new JointClosePromptScreen(new JointClosePromptScreenContract$InputData(aVar11.o.f76513b));
                    p48.c block18 = new p48.c(aVar11, i3);
                    Intrinsics.checkNotNullParameter(block18, "block");
                    jointClosePromptScreen.H = block18;
                    return jointClosePromptScreen;
                }
                if (Intrinsics.f(step15, JointCloseFlowContract$Step.LoseBenefit.f76515a)) {
                    JointCloseLoseBenefitScreen jointCloseLoseBenefitScreen = new JointCloseLoseBenefitScreen();
                    p48.c cVar5 = new p48.c(aVar11, i5);
                    Intrinsics.checkNotNullParameter(cVar5, "<set-?>");
                    jointCloseLoseBenefitScreen.H = cVar5;
                    return jointCloseLoseBenefitScreen;
                }
                if (!Intrinsics.f(step15, JointCloseFlowContract$Step.Statement.f76516a)) {
                    throw new NoWhenBranchMatchedException();
                }
                FullScreenPromptScreen fullScreenPromptScreen = new FullScreenPromptScreen(d67.e.a(d67.g.Companion, new TextLocalisedClause(com.revolut.feature.joint.impl.R$string.joint_offboarding_closing_statement_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.joint.impl.R$string.joint_offboarding_closing_statement_subtitle, null, null, 14), null, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D001", null, null, null, 30), new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), xc.VERTICAL, null, null, null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14), null, false, null, null, null, false, 16759692));
                p48.c block19 = new p48.c(aVar11, 2);
                Intrinsics.checkNotNullParameter(block19, "block");
                fullScreenPromptScreen.H = block19;
                return fullScreenPromptScreen;
            case 28:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new p4c.t(false, p4c.a0.a((p4c.k) obj4), null, (List) getDefaultErrorItems2.invoke(new iii.d(8, null, true, true, "ERROR_PRODUCTS_LIST_ID")), 94);
            default:
                String investorUpdateId = (String) obj2;
                z5f.h investorUpdateDetails = (z5f.h) obj3;
                Intrinsics.checkNotNullParameter(investorUpdateId, "params");
                Intrinsics.checkNotNullParameter(investorUpdateDetails, "investorUpdateDetails");
                Intrinsics.checkNotNullParameter(investorUpdateId, "investorUpdateId");
                Intrinsics.checkNotNullParameter(investorUpdateDetails, "investorUpdateDetails");
                ((p5f.b) obj4).f233114c.f(investorUpdateId, investorUpdateDetails);
                return Unit.f186387a;
        }
    }

    public /* synthetic */ i(p4c.a0 a0Var, p4c.k kVar) {
        this.f228062a = 28;
        this.f228063b = kVar;
    }
}

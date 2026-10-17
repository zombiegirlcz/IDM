package fb;

import androidx.collection.ArrayMap;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasurePolicy;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import aw0.c7;
import aw0.ka;
import aw0.o9;
import aw0.v9;
import b4g.h0;
import com.feature.navigation.hub.impl.ui.flow.NavigationHubFlowContract$InputData;
import com.feature.navigation.hub.impl.ui.flow.NavigationHubFlowContract$Step;
import com.feature.navigation.hub.impl.ui.hub.NavigationHubController;
import com.feature.navigation.hub.impl.ui.hub.NavigationHubControllerContract$InputData;
import com.feature.user.details.impl.ui.details.UserDetailsController;
import com.feature.user.details.impl.ui.details.UserDetailsControllerContract$InputData;
import com.feature.user.details.impl.ui.flow.UserDetailsFlowContract$InputData;
import com.feature.user.details.impl.ui.flow.UserDetailsFlowContract$Step;
import com.google.protobuf.b4;
import com.google.protobuf.c4;
import com.google.protobuf.d4;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import com.revolut.core.backend_flow.impl.flow.permission.FormPermissionFlowContract$InputData;
import com.revolut.core.backend_flow.impl.flow.permission.FormPermissionFlowContract$Step;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RangeSliderTitleDelegate;
import com.revolut.core.ui_kit.delegates.SmartTileSendMoneyDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatAttachmentGridBubbleDelegate;
import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.t;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.bills.boleto.impl.flow.BoletoTransferFlowContract$Step;
import com.revolut.feature.apm.bills.boleto.impl.screen.amount.BoletoAmountScreen;
import com.revolut.feature.apm.bills.boleto.impl.screen.fee_breakdown.BoletoFeeBreakdownScreen;
import com.revolut.feature.apm.bills.boleto.impl.screen.fee_breakdown.BoletoFeeBreakdownScreenContract$InputData;
import com.revolut.feature.apm.bills.boleto.impl.screen.review.BoletoTransferReviewScreen;
import com.revolut.feature.apm.bills.core.api.model.BillTransferDarfDetails;
import com.revolut.feature.apm.bills.core.api.model.BillTransferType;
import com.revolut.feature.apm.bills.core.api.model.search.boleto.BillBoletoAliasType;
import com.revolut.feature.apm.bills.core.api.model.search.boleto.BillBoletoFees;
import com.revolut.feature.apm.bills.core.api.model.search.boleto.BillSearchBoletoResult;
import com.revolut.feature.backend_flow.domain.models.PermissionInputItem;
import com.revolut.feature.credit.application.plugins.impl.ui.application.CreditApplicationFlowContract$Step;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreen;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.kyc.impl.idnow.video_ident.flow.IdnowVideoIdentFlowContract$InputData;
import com.revolut.feature.kyc.impl.idnow.video_ident.flow.IdnowVideoIdentFlowContract$Step;
import com.revolut.feature.kyc.impl.idnow.video_ident.screen.IdnowVideoIdentScreen;
import com.revolut.feature.kyc.impl.idnow.video_ident.screen.IdnowVideoIdentScreenContract$InputData;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.amount.FormAmountScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.amount.FormAmountScreenContract$InputData;
import com.revolut.feature.permissions.flow.PermissionsController;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Explanation;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$InputData;
import com.revolut.feature.permissions.flow.PermissionsControllerContract$Permission;
import com.revolut.feature.picker.legacy.PickerScreen;
import com.revolut.feature.picker.legacy.PickerScreenContract$InputData;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.support.impl.transfer_tracker.ui.input_form.TransferTrackerInputFormScreenContract$ModalStep;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.ManagedPortfolioDetailsControllerContract$ModalStep;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsDestination;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsInputData;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature.wealth_discovery.api.declaration.collection.TopMoversDestination;
import com.revolut.feature.wealth_discovery.impl.collection.top_movers.TopMoversScreenContract$InputData;
import com.revolut.feature.wealth_discovery.impl.collection.top_movers.TopMoversScreenContract$ModalStep;
import com.revolut.feature.workflow.engine.onboarding.impl.workflow.WorkflowFlow;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.time.date_picker.DatePickerBottomSheetController;
import com.revolut.kompot.common.flow.permissions.PermissionsFlow;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Explanation;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Permission;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination;
import com.revolut.retail.feature.balance.picker.impl.new_picker.CurrencyChooserFlow;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.PaymentLinksAmountScreen;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.PaymentLinksAmountScreenContract$InputData;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.limits_explanation.LimitsExplanationScreen;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.limits_explanation.LimitsExplanationScreenContract$InputData;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.qr.PaymentLinkQrScreenContract$InputData;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.qr.PaymentLinkQrScreenContract$ModalStep;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.PlanOfferFlow;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer.PlanOfferFlowContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.dialog.PricingPlanBottomSheetBEDrivenScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.dialog.PricingPlanBottomSheetBEDrivenScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.PlanHubV2ScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.PlanHubV2ScreenContract$ModalStep;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.workflow.engine.api.workflow.WorkflowFlowType;
import com.revolut.trading.orders.ui.invest.placement.models.InvestInputValue;
import com.revolut.trading.orders.ui.invest.placement.models.InvestOutputValue;
import cul.v;
import d9.e1;
import efm.r;
import f0d.l;
import fci.g;
import fg8.m;
import fjd.g0;
import fjd.w;
import fv4.p;
import fv4.q;
import fv4.u;
import g1i.i0;
import h1j.b;
import h87.s;
import hy1.b0;
import imk.p0;
import ip0.r70;
import j54.c0;
import j54.z;
import java.io.File;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.reflect.KProperty;
import kotlin.text.f0;
import kotlinx.serialization.json.JsonElement;
import mn1.i;
import mn1.j;
import mn1.n;
import mn1.o;
import rp0.k1;
import skm.a2;
import vkm.j2;
import vkm.q0;
import w4l.h;
import w4l.k;
import xl2.y;
import xzg.l0;
import xzg.n0;
import zh9.u0;
import zhm.d0;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f133416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f133417c;

    public /* synthetic */ c(Object obj2, Object obj3, int i) {
        this.f133415a = i;
        this.f133416b = obj2;
        this.f133417c = obj3;
    }

    /* JADX WARN: Type inference failed for: r2v106, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        List list;
        xi0.b bVarA;
        ViewController permissionsController;
        PermissionsFlowContract$Explanation promptScreen;
        String str;
        Object next;
        Object next2;
        String str2;
        String str3;
        int i = this.f133415a;
        k loadingStrategy = h.f294642c;
        final int i2 = 1;
        final int i3 = 0;
        Object obj4 = this.f133417c;
        Object obj5 = this.f133416b;
        switch (i) {
            case 0:
                UserDetailsFlowContract$InputData userDetailsFlowContract$InputData = (UserDetailsFlowContract$InputData) obj5;
                f fVar = (f) obj4;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                UserDetailsFlowContract$Step step = (UserDetailsFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!(step instanceof UserDetailsFlowContract$Step.UserDetailsStep)) {
                    throw new NoWhenBranchMatchedException();
                }
                UserDetailsController userDetailsController = new UserDetailsController(new UserDetailsControllerContract$InputData(userDetailsFlowContract$InputData.f26232b));
                l block = new l(fVar, userDetailsFlowContract$InputData, 18);
                Intrinsics.checkNotNullParameter(block, "block");
                userDetailsController.H = block;
                return userDetailsController;
            case 1:
                fci.b bVar = (fci.b) obj5;
                g gVar = (g) obj4;
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new fci.k(bVar.b(gVar.f133776c), bVar.d(gVar.f133776c), (List) getDefaultErrorItems.invoke(new iii.d(14, null, true, false, null)), false);
            case 2:
                m mVar = (m) obj5;
                String str4 = (String) obj4;
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                mVar.getClass();
                throw new IllegalArgumentException(j6.a.q("Cannot get Revolut <18 profile with id: ", f0.U0(4, str4)));
            case 3:
                final com.revolut.feature.apm.bills.boleto.impl.flow.a aVar = (com.revolut.feature.apm.bills.boleto.impl.flow.a) obj5;
                j2 j2Var = aVar.f61183p;
                fn1.c cVar = (fn1.c) obj4;
                final yki.l FlowCoordinator = (yki.l) obj2;
                BoletoTransferFlowContract$Step step2 = (BoletoTransferFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof BoletoTransferFlowContract$Step.Review) {
                    BoletoTransferFlowContract$Step.Review review = (BoletoTransferFlowContract$Step.Review) step2;
                    BoletoTransferReviewScreen boletoTransferReviewScreen = new BoletoTransferReviewScreen(new i(aVar.o, j2Var, review.f61180a, review.f61181b));
                    Function1 block2 = new Function1() { // from class: fn1.d
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            switch (i3) {
                                case 0:
                                    o result = (o) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    boolean z = result instanceof j;
                                    yki.l lVar = FlowCoordinator;
                                    ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                                    if (z) {
                                        oki.h.w2(lVar, BoletoTransferFlowContract$Step.Fees.f61179a, bottom_dialog);
                                        Unit unit = Unit.f186387a;
                                    } else if (result instanceof mn1.l) {
                                        oki.h.w2(lVar, new BoletoTransferFlowContract$Step.Schedule(((mn1.l) result).f207344a), bottom_dialog);
                                        Unit unit2 = Unit.f186387a;
                                    } else {
                                        boolean z3 = result instanceof mn1.k;
                                        com.revolut.feature.apm.bills.boleto.impl.flow.a aVar2 = aVar;
                                        Continuation continuation = null;
                                        if (z3) {
                                            aVar2.l2(new g0(aVar2, result, continuation, 7), new yi5.b(26));
                                        } else if (result instanceof n) {
                                            aVar2.C1(u0.b(com.revolut.retail.core.navigation.a.c(gc0.c.f(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267949a, null, null, 6))), new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(((n) result).f207346a), null, null, null, 126)))));
                                        } else {
                                            if (!(result instanceof mn1.m)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            aVar2.C1(u0.b(com.revolut.retail.core.navigation.a.c(gc0.c.f(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267949a, null, null, 6))), u0.f(new ScheduledPaymentsDestination((ScheduledPaymentsInputData) null, 3)))));
                                        }
                                    }
                                    return Unit.f186387a;
                                default:
                                    in1.i output = (in1.i) obj6;
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    com.revolut.feature.apm.bills.boleto.impl.flow.a aVar3 = aVar;
                                    j2 j2Var2 = aVar3.f61183p;
                                    while (true) {
                                        Object value = j2Var2.getValue();
                                        BillSearchBoletoResult billSearchBoletoResult = (BillSearchBoletoResult) value;
                                        dj0.d billAmount = output.f162595b;
                                        dj0.d finalAmount = output.f162594a;
                                        BillTransferType transferType = billSearchBoletoResult.f61428a;
                                        String str5 = billSearchBoletoResult.d;
                                        String str6 = billSearchBoletoResult.e;
                                        BillBoletoFees billBoletoFees = billSearchBoletoResult.f;
                                        String str7 = billSearchBoletoResult.f61431g;
                                        BillBoletoAliasType billBoletoAliasType = billSearchBoletoResult.f61432h;
                                        String str8 = billSearchBoletoResult.i;
                                        LocalDate localDate = billSearchBoletoResult.f61433j;
                                        com.revolut.feature.apm.bills.boleto.impl.flow.a aVar4 = aVar3;
                                        String str9 = billSearchBoletoResult.k;
                                        String str10 = billSearchBoletoResult.f61434l;
                                        String str11 = billSearchBoletoResult.f61435m;
                                        String str12 = billSearchBoletoResult.f61436n;
                                        String str13 = billSearchBoletoResult.o;
                                        BillTransferDarfDetails billTransferDarfDetails = billSearchBoletoResult.f61437p;
                                        dj0.d dVar = billSearchBoletoResult.f61438q;
                                        dj0.d dVar2 = billSearchBoletoResult.f61439r;
                                        boolean z4 = billSearchBoletoResult.f61440s;
                                        LocalDate localDate2 = billSearchBoletoResult.f61441t;
                                        boolean z6 = billSearchBoletoResult.u;
                                        String str14 = billSearchBoletoResult.v;
                                        Intrinsics.checkNotNullParameter(transferType, "transferType");
                                        Intrinsics.checkNotNullParameter(finalAmount, "finalAmount");
                                        Intrinsics.checkNotNullParameter(billAmount, "billAmount");
                                        if (j2Var2.h(value, new BillSearchBoletoResult(transferType, finalAmount, billAmount, str5, str6, billBoletoFees, str7, billBoletoAliasType, str8, localDate, str9, str10, str11, str12, str13, billTransferDarfDetails, dVar, dVar2, z4, localDate2, z6, str14))) {
                                            oki.h.t2(aVar4, FlowCoordinator, new BoletoTransferFlowContract$Step.Review(output.f162596c, output.d), true, null, false, 12);
                                            return Unit.f186387a;
                                        }
                                        aVar3 = aVar4;
                                    }
                                    break;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block2, "block");
                    boletoTransferReviewScreen.H = block2;
                    return boletoTransferReviewScreen;
                }
                if (step2 instanceof BoletoTransferFlowContract$Step.Fees) {
                    return new BoletoFeeBreakdownScreen(new BoletoFeeBreakdownScreenContract$InputData(cVar.f136508a.f));
                }
                if (step2 instanceof BoletoTransferFlowContract$Step.Schedule) {
                    TransferScheduleData transferScheduleData = ((BoletoTransferFlowContract$Step.Schedule) step2).f61182a;
                    LocalDate localDateNow = cVar.f136508a.f61441t;
                    if (localDateNow == null) {
                        localDateNow = LocalDate.now();
                    }
                    LocalDate localDate = localDateNow;
                    long j2 = transferScheduleData.f104285a;
                    LocalDate localDate2 = j2 != 0 ? Instant.ofEpochMilli(j2).atZone(ZoneId.systemDefault()).toLocalDate() : localDate;
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pay_bills_taxes_country_br_review_item_scheduled_on_title, null, null, 14);
                    Intrinsics.h(localDate2);
                    DatePickerBottomSheetController datePickerBottomSheetController = new DatePickerBottomSheetController(new DatePickerBottomSheetController.InputData(textLocalisedClause, localDate2, localDate, (LocalDate) null, 24));
                    w block3 = new w(aVar, 15);
                    Intrinsics.checkNotNullParameter(block3, "block");
                    datePickerBottomSheetController.H = block3;
                    return datePickerBottomSheetController;
                }
                if (!(step2 instanceof BoletoTransferFlowContract$Step.Amount)) {
                    throw new NoWhenBranchMatchedException();
                }
                dj0.d dVar = ((BillSearchBoletoResult) j2Var.getValue()).f61429b;
                BillBoletoFees billBoletoFees = ((BillSearchBoletoResult) j2Var.getValue()).f;
                dj0.d dVar2 = billBoletoFees != null ? billBoletoFees.d : null;
                BillSearchBoletoResult billSearchBoletoResult = cVar.f136508a;
                String str5 = billSearchBoletoResult.e;
                String str6 = billSearchBoletoResult.d;
                if (str6 == null) {
                    str6 = "";
                }
                BoletoAmountScreen boletoAmountScreen = new BoletoAmountScreen(new in1.h(dVar, dVar2, str6, str5, billSearchBoletoResult.f61438q, billSearchBoletoResult.f61439r, billSearchBoletoResult.f61441t, aVar.o));
                Function1 block4 = new Function1() { // from class: fn1.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        switch (i2) {
                            case 0:
                                o result = (o) obj6;
                                Intrinsics.checkNotNullParameter(result, "result");
                                boolean z = result instanceof j;
                                yki.l lVar = FlowCoordinator;
                                ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                                if (z) {
                                    oki.h.w2(lVar, BoletoTransferFlowContract$Step.Fees.f61179a, bottom_dialog);
                                    Unit unit = Unit.f186387a;
                                } else if (result instanceof mn1.l) {
                                    oki.h.w2(lVar, new BoletoTransferFlowContract$Step.Schedule(((mn1.l) result).f207344a), bottom_dialog);
                                    Unit unit2 = Unit.f186387a;
                                } else {
                                    boolean z3 = result instanceof mn1.k;
                                    com.revolut.feature.apm.bills.boleto.impl.flow.a aVar2 = aVar;
                                    Continuation continuation = null;
                                    if (z3) {
                                        aVar2.l2(new g0(aVar2, result, continuation, 7), new yi5.b(26));
                                    } else if (result instanceof n) {
                                        aVar2.C1(u0.b(com.revolut.retail.core.navigation.a.c(gc0.c.f(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267949a, null, null, 6))), new FeatureCommand(new TransactionsFeatureConfig.Details(new k71.c(((n) result).f207346a), null, null, null, 126)))));
                                    } else {
                                        if (!(result instanceof mn1.m)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        aVar2.C1(u0.b(com.revolut.retail.core.navigation.a.c(gc0.c.f(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267949a, null, null, 6))), u0.f(new ScheduledPaymentsDestination((ScheduledPaymentsInputData) null, 3)))));
                                    }
                                }
                                return Unit.f186387a;
                            default:
                                in1.i output = (in1.i) obj6;
                                Intrinsics.checkNotNullParameter(output, "output");
                                com.revolut.feature.apm.bills.boleto.impl.flow.a aVar3 = aVar;
                                j2 j2Var2 = aVar3.f61183p;
                                while (true) {
                                    Object value = j2Var2.getValue();
                                    BillSearchBoletoResult billSearchBoletoResult2 = (BillSearchBoletoResult) value;
                                    dj0.d billAmount = output.f162595b;
                                    dj0.d finalAmount = output.f162594a;
                                    BillTransferType transferType = billSearchBoletoResult2.f61428a;
                                    String str52 = billSearchBoletoResult2.d;
                                    String str62 = billSearchBoletoResult2.e;
                                    BillBoletoFees billBoletoFees2 = billSearchBoletoResult2.f;
                                    String str7 = billSearchBoletoResult2.f61431g;
                                    BillBoletoAliasType billBoletoAliasType = billSearchBoletoResult2.f61432h;
                                    String str8 = billSearchBoletoResult2.i;
                                    LocalDate localDate3 = billSearchBoletoResult2.f61433j;
                                    com.revolut.feature.apm.bills.boleto.impl.flow.a aVar4 = aVar3;
                                    String str9 = billSearchBoletoResult2.k;
                                    String str10 = billSearchBoletoResult2.f61434l;
                                    String str11 = billSearchBoletoResult2.f61435m;
                                    String str12 = billSearchBoletoResult2.f61436n;
                                    String str13 = billSearchBoletoResult2.o;
                                    BillTransferDarfDetails billTransferDarfDetails = billSearchBoletoResult2.f61437p;
                                    dj0.d dVar3 = billSearchBoletoResult2.f61438q;
                                    dj0.d dVar22 = billSearchBoletoResult2.f61439r;
                                    boolean z4 = billSearchBoletoResult2.f61440s;
                                    LocalDate localDate22 = billSearchBoletoResult2.f61441t;
                                    boolean z6 = billSearchBoletoResult2.u;
                                    String str14 = billSearchBoletoResult2.v;
                                    Intrinsics.checkNotNullParameter(transferType, "transferType");
                                    Intrinsics.checkNotNullParameter(finalAmount, "finalAmount");
                                    Intrinsics.checkNotNullParameter(billAmount, "billAmount");
                                    if (j2Var2.h(value, new BillSearchBoletoResult(transferType, finalAmount, billAmount, str52, str62, billBoletoFees2, str7, billBoletoAliasType, str8, localDate3, str9, str10, str11, str12, str13, billTransferDarfDetails, dVar3, dVar22, z4, localDate22, z6, str14))) {
                                        oki.h.t2(aVar4, FlowCoordinator, new BoletoTransferFlowContract$Step.Review(output.f162596c, output.d), true, null, false, 12);
                                        return Unit.f186387a;
                                    }
                                    aVar3 = aVar4;
                                }
                                break;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block4, "block");
                boletoAmountScreen.H = block4;
                return boletoAmountScreen;
            case 4:
                final com.revolut.feature.wealth_discovery.impl.collection.top_movers.a aVar2 = (com.revolut.feature.wealth_discovery.impl.collection.top_movers.a) obj5;
                foh.e eVar = aVar2.f96146t;
                TopMoversScreenContract$InputData topMoversScreenContract$InputData = (TopMoversScreenContract$InputData) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TopMoversScreenContract$ModalStep step3 = (TopMoversScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (step3 instanceof TopMoversScreenContract$ModalStep.SelectFilter) {
                    n0 selected = ((TopMoversScreenContract$ModalStep.SelectFilter) step3).f96140a;
                    TopMoversDestination destination = topMoversScreenContract$InputData.f96139a;
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(selected, "selected");
                    Intrinsics.checkNotNullParameter(destination, "destination");
                    RowActionsBottomSheetController rowActionsBottomSheetController = new RowActionsBottomSheetController(foh.e.a(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_topMovers_filters_moverType_title, null, null, 14), foh.e.f136963a, selected, foh.f.f, destination));
                    Function1 block5 = new Function1() { // from class: foh.s
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            eii.k output = (eii.k) obj6;
                            switch (i3) {
                                case 0:
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    Continuation continuation = null;
                                    eii.i iVar = output instanceof eii.i ? (eii.i) output : null;
                                    Object obj7 = iVar != null ? iVar.f126655a : null;
                                    if (!(obj7 instanceof n0)) {
                                        obj7 = null;
                                    }
                                    n0 n0Var = (n0) obj7;
                                    if (n0Var != null) {
                                        com.revolut.feature.wealth_discovery.impl.collection.top_movers.a aVar3 = aVar2;
                                        aVar3.o.d = null;
                                        j2 j2Var2 = aVar3.f96147w;
                                        j2Var2.g(null, t.a((t) j2Var2.getValue(), null, n0Var, 1));
                                        aVar3.l2(new g0(aVar3, n0Var, continuation, 12), new yi5.b(26));
                                    }
                                    break;
                                default:
                                    Intrinsics.checkNotNullParameter(output, "output");
                                    eii.i iVar2 = output instanceof eii.i ? (eii.i) output : null;
                                    Object obj8 = iVar2 != null ? iVar2.f126655a : null;
                                    if (!(obj8 instanceof l0)) {
                                        obj8 = null;
                                    }
                                    l0 l0Var = (l0) obj8;
                                    if (l0Var != null) {
                                        com.revolut.feature.wealth_discovery.impl.collection.top_movers.a aVar4 = aVar2;
                                        aVar4.o.d = null;
                                        j2 j2Var3 = aVar4.f96147w;
                                        j2Var3.g(null, t.a((t) j2Var3.getValue(), l0Var, null, 2));
                                    }
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    };
                    Intrinsics.checkNotNullParameter(block5, "block");
                    rowActionsBottomSheetController.H = block5;
                    return rowActionsBottomSheetController;
                }
                if (!(step3 instanceof TopMoversScreenContract$ModalStep.SelectTimeSpan)) {
                    throw new NoWhenBranchMatchedException();
                }
                TopMoversDestination destination2 = aVar2.u;
                l0 selected2 = ((TopMoversScreenContract$ModalStep.SelectTimeSpan) step3).f96141a;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(destination2, "destination");
                Intrinsics.checkNotNullParameter(selected2, "selected");
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_trading_topMovers_filters_timeSpan_title, null, null, 14);
                if (destination2 instanceof TopMoversDestination.Trading) {
                    list = foh.e.f136964b;
                } else {
                    if (!(destination2 instanceof TopMoversDestination.Crypto)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    list = foh.e.f136965c;
                }
                RowActionsBottomSheetController rowActionsBottomSheetController2 = new RowActionsBottomSheetController(foh.e.a(textLocalisedClause2, list, selected2, foh.g.f, destination2));
                Function1 block6 = new Function1() { // from class: foh.s
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        eii.k output = (eii.k) obj6;
                        switch (i2) {
                            case 0:
                                Intrinsics.checkNotNullParameter(output, "output");
                                Continuation continuation = null;
                                eii.i iVar = output instanceof eii.i ? (eii.i) output : null;
                                Object obj7 = iVar != null ? iVar.f126655a : null;
                                if (!(obj7 instanceof n0)) {
                                    obj7 = null;
                                }
                                n0 n0Var = (n0) obj7;
                                if (n0Var != null) {
                                    com.revolut.feature.wealth_discovery.impl.collection.top_movers.a aVar3 = aVar2;
                                    aVar3.o.d = null;
                                    j2 j2Var2 = aVar3.f96147w;
                                    j2Var2.g(null, t.a((t) j2Var2.getValue(), null, n0Var, 1));
                                    aVar3.l2(new g0(aVar3, n0Var, continuation, 12), new yi5.b(26));
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(output, "output");
                                eii.i iVar2 = output instanceof eii.i ? (eii.i) output : null;
                                Object obj8 = iVar2 != null ? iVar2.f126655a : null;
                                if (!(obj8 instanceof l0)) {
                                    obj8 = null;
                                }
                                l0 l0Var = (l0) obj8;
                                if (l0Var != null) {
                                    com.revolut.feature.wealth_discovery.impl.collection.top_movers.a aVar4 = aVar2;
                                    aVar4.o.d = null;
                                    j2 j2Var3 = aVar4.f96147w;
                                    j2Var3.g(null, t.a((t) j2Var3.getValue(), l0Var, null, 2));
                                }
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                Intrinsics.checkNotNullParameter(block6, "block");
                rowActionsBottomSheetController2.H = block6;
                return rowActionsBottomSheetController2;
            case 5:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                LocalDate localDate3 = LocalDate.parse(((fv4.f) obj4).f138326b);
                Intrinsics.checkNotNullExpressionValue(localDate3, "parse(...)");
                p pVarA = ((u) obj5).a(null);
                String string = localDate3.toString();
                String string2 = localDate3.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                com.revolut.core.ui_kit.models.j jVar = c7.Companion;
                LocalDateClause$DateFormat.DayAndMonth dayAndMonth = new LocalDateClause$DateFormat.DayAndMonth(ka.SHORT);
                jVar.getClass();
                return new q(pVarA, new fv4.o(string, zhm.u.c(new com.revolut.core.ui_kit.views.q(string2, new t(com.revolut.core.ui_kit.models.j.a(localDate3, dayAndMonth, null)), 58))));
            case 6:
                g3e.i iVar = (g3e.i) obj5;
                Set set = (Set) obj4;
                g3e.d params = (g3e.d) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(params, "params");
                iVar.getClass();
                if (set.isEmpty()) {
                    set = params.f140268c;
                }
                r map = rd0.e.c(iVar.f140274a.l(new t1e.o(2, Integer.valueOf(params.f140267b), Integer.valueOf(params.f140266a), null, d0.d1(set)), loadingStrategy), kotlin.coroutines.g.f186406a).map(new i0(12, new g1.b(params, 21)));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return map;
            case 7:
                gq9.f fVar2 = (gq9.f) obj5;
                File file = (File) obj4;
                oki.g showModalSticky = (oki.g) obj2;
                al9.g outputData = (al9.g) obj3;
                Intrinsics.checkNotNullParameter(showModalSticky, "$this$showModalSticky");
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                fVar2.f145611w = showModalSticky;
                if (outputData instanceof al9.d) {
                    fVar2.v = fVar2.T2(new gm6.j(fVar2, file, null, 5), new yi5.b(27));
                } else if (outputData instanceof al9.e) {
                    fVar2.e3();
                } else {
                    if (!(outputData instanceof al9.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yji.n.S2(fVar2, fVar2.o2(new com.revolut.feature.shared.help_centre.api.faq.a(new SharedFaqDestination.StartPoint.FaqExplicit("c3a0a37f-e699-4547-9df3-398705e4f980", 14))), null, 2);
                }
                return Unit.f186387a;
            case 8:
                rlm.t tVar = (rlm.t) obj5;
                String key = (String) obj2;
                JsonElement value = (JsonElement) obj3;
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                String str7 = (String) ((ArrayMap) obj4).get(key);
                if (str7 != null) {
                    key = str7;
                }
                tVar.b(value, key);
                return Unit.f186387a;
            case 9:
                cam.f fVar3 = (cam.f) obj4;
                ((Boolean) obj2).getClass();
                Object obj6 = ((r10.d) obj5).f250818a;
                InvestOutputValue outputValue = ((v) ((j2) fVar3.f22677a).getValue()).f109179h;
                InvestInputValue inputValue = ((v) ((j2) fVar3.f22677a).getValue()).e;
                Intrinsics.checkNotNullParameter(outputValue, "outputValue");
                Intrinsics.checkNotNullParameter(inputValue, "inputValue");
                if (!e1.I(inputValue.f106844a)) {
                    return outputValue;
                }
                InvestOutputValue.INSTANCE.getClass();
                return InvestOutputValue.f106855c;
            case 10:
                com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar3 = (com.revolut.feature.credit.application.plugins.impl.ui.application.d) obj5;
                oki.g withStickyModalResult = (oki.g) obj2;
                yja.b result = (yja.b) obj3;
                Intrinsics.checkNotNullParameter(withStickyModalResult, "$this$withStickyModalResult");
                Intrinsics.checkNotNullParameter(result, "result");
                z zVar = dVar3.I;
                CreditApplicationFlowContract$Step.ProductArticles.NextAction nextAction = ((CreditApplicationFlowContract$Step.ProductArticles) obj4).f67080b;
                com.revolut.feature.credit.application.plugins.impl.ui.application.b onNext = new com.revolut.feature.credit.application.plugins.impl.ui.application.b(dVar3, null);
                aik.g onDismiss = new aik.g(withStickyModalResult, 4);
                com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.d dVar4 = (com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.d) zVar;
                dVar4.getClass();
                Intrinsics.checkNotNullParameter(result, "result");
                Intrinsics.checkNotNullParameter(nextAction, "nextAction");
                Intrinsics.checkNotNullParameter(onNext, "onNext");
                Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
                if (result == yja.b.CLOSE_CLICK) {
                    Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
                    a2 a2Var = dVar4.f67117s;
                    Continuation continuation = null;
                    if (a2Var != null) {
                        a2Var.f(null);
                    }
                    dVar4.f67118t = null;
                    onDismiss.invoke();
                    dVar4.T2(new p0(dVar4, continuation, 17), new yi5.b(27));
                } else {
                    int i5 = 27;
                    if (dVar4.f67116r.compareAndSet(false, true)) {
                        dVar4.f67117s = dVar4.T2(new c0(result, nextAction, onNext, dVar4, onDismiss, null), new yi5.b(i5));
                    }
                }
                return Unit.f186387a;
            case 11:
                h87.i iVar2 = (h87.i) obj4;
                Function1 getError = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getError, "getError");
                aim.e eVarB = zhm.u.b();
                eVarB.add(((s) obj5).a(iVar2.f149955a, false));
                eVarB.addAll((Collection) getError.invoke(new iii.d(4, new h87.g(iVar2.f149955a), true, false, null)));
                return zhm.u.a(eVarB);
            case 12:
                com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b bVar2 = (com.revolut.feature.support.impl.transfer_tracker.ui.input_form.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator2 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TransferTrackerInputFormScreenContract$ModalStep step4 = (TransferTrackerInputFormScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator2, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                final hee.q updateState = new hee.q(bVar2, i3);
                h1g.a currentState = new h1g.a(bVar2, 12);
                hee.q datePickerProvider = new hee.q(bVar2, i2);
                com.revolut.feature.support.impl.transfer_tracker.ui.input_form.a aVar3 = (com.revolut.feature.support.impl.transfer_tracker.ui.input_form.a) ((hee.a) obj5);
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(step4, "step");
                Intrinsics.checkNotNullParameter(updateState, "updateState");
                Intrinsics.checkNotNullParameter(currentState, "currentState");
                Intrinsics.checkNotNullParameter(datePickerProvider, "datePickerProvider");
                if (!Intrinsics.f(step4, TransferTrackerInputFormScreenContract$ModalStep.CurrencyPicker.f89414a)) {
                    if (Intrinsics.f(step4, TransferTrackerInputFormScreenContract$ModalStep.CountryPicker.f89413a)) {
                        PickerScreen pickerScreen = new PickerScreen(new PickerScreenContract$InputData(null, new TextLocalisedClause(com.revolut.feature.support.impl.R$string.locate_inbound_transfer_input_sender_bank_country, null, null, 14), null, null, false, new TextLocalisedClause(com.revolut.feature.support.impl.R$string.locate_inbound_transfer_input_sender_bank_country_search_bar_placeholder, null, null, 14), "InboundTransferTrackerCountryPicker", null, ((hee.j) currentState.invoke()).f151691c, null, null, true, null, null, null, 132053757));
                        Function1 function1 = new Function1() { // from class: hee.b
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj7) {
                                switch (i2) {
                                    case 0:
                                        h1j.b result2 = (h1j.b) obj7;
                                        Intrinsics.checkNotNullParameter(result2, "result");
                                        if (result2 instanceof h1j.c) {
                                            updateState.invoke(new e77.j(result2, 1));
                                        } else if (!(result2 instanceof b.a) && !(result2 instanceof h1j.d)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        return Unit.f186387a;
                                    case 1:
                                        y7a.v outputData2 = (y7a.v) obj7;
                                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                        y7a.w wVar = outputData2.f311454a;
                                        if (wVar instanceof b8a.a) {
                                            updateState.invoke(new h56.a(wVar, 28));
                                        }
                                        return Unit.f186387a;
                                    default:
                                        uce.b result3 = (uce.b) obj7;
                                        Intrinsics.checkNotNullParameter(result3, "result");
                                        updateState.invoke(new h56.a(result3, 27));
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(function1, "<set-?>");
                        pickerScreen.H = function1;
                        return pickerScreen;
                    }
                    if (!Intrinsics.f(step4, TransferTrackerInputFormScreenContract$ModalStep.DatePicker.f89415a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ViewController viewController = (ViewController) datePickerProvider.invoke(new uce.a(((hee.j) currentState.invoke()).d, new TextLocalisedClause(com.revolut.feature.support.impl.R$string.locate_inbound_transfer_input_transfer_date, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14)));
                    final int i6 = 2;
                    Function1 block7 = new Function1() { // from class: hee.b
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i6) {
                                case 0:
                                    h1j.b result2 = (h1j.b) obj7;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    if (result2 instanceof h1j.c) {
                                        updateState.invoke(new e77.j(result2, 1));
                                    } else if (!(result2 instanceof b.a) && !(result2 instanceof h1j.d)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    y7a.v outputData2 = (y7a.v) obj7;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    y7a.w wVar = outputData2.f311454a;
                                    if (wVar instanceof b8a.a) {
                                        updateState.invoke(new h56.a(wVar, 28));
                                    }
                                    return Unit.f186387a;
                                default:
                                    uce.b result3 = (uce.b) obj7;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    updateState.invoke(new h56.a(result3, 27));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block7, "block");
                    viewController.H = block7;
                    return viewController;
                }
                l2j.a aVar4 = aVar3.f89416a;
                List listD1 = d0.d1(aVar3.f89417b.c(td0.a.LISTED));
                xi0.a aVar5 = xi0.b.Companion;
                ArrayList arrayList = new ArrayList(zhm.w.t(listD1, 10));
                Iterator it8 = listD1.iterator();
                while (it8.hasNext()) {
                    t61.a.A(aVar5, (String) it8.next(), arrayList);
                }
                String str8 = (String) ((hee.j) currentState.invoke()).f151689a.getContent();
                if (str8 != null) {
                    xi0.b.Companion.getClass();
                    bVarA = xi0.a.a(str8);
                } else {
                    bVarA = null;
                }
                CurrencyChooserFlow currencyChooserFlowA = aVar4.a(new CurrencyChooserFlowDestination.InputData(new CurrencyChooserFlowDestination.StartType.CurrencyChooser(null, null, bVarA, arrayList, null, null, 51)));
                Function1 function12 = new Function1() { // from class: hee.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        switch (i3) {
                            case 0:
                                h1j.b result2 = (h1j.b) obj7;
                                Intrinsics.checkNotNullParameter(result2, "result");
                                if (result2 instanceof h1j.c) {
                                    updateState.invoke(new e77.j(result2, 1));
                                } else if (!(result2 instanceof b.a) && !(result2 instanceof h1j.d)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                return Unit.f186387a;
                            case 1:
                                y7a.v outputData2 = (y7a.v) obj7;
                                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                y7a.w wVar = outputData2.f311454a;
                                if (wVar instanceof b8a.a) {
                                    updateState.invoke(new h56.a(wVar, 28));
                                }
                                return Unit.f186387a;
                            default:
                                uce.b result3 = (uce.b) obj7;
                                Intrinsics.checkNotNullParameter(result3, "result");
                                updateState.invoke(new h56.a(result3, 27));
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(function12, "<set-?>");
                currencyChooserFlowA.J = function12;
                return currencyChooserFlowA;
            case 13:
                Function2 function2 = (Function2) obj5;
                String str9 = (String) obj4;
                d4 d4Var = (d4) obj2;
                d4 d4Var2 = (d4) obj3;
                if (d4Var != null || d4Var2 != null) {
                    if (d4Var != null && d4Var.getKindCase() != c4.STRING_VALUE) {
                        throw new IllegalStateException(str9.toString());
                    }
                    if (d4Var2 != null && d4Var2.getKindCase() != c4.STRING_VALUE) {
                        throw new IllegalStateException(str9.toString());
                    }
                    String str10 = (String) function2.invoke(d4Var != null ? d4Var.getStringValue() : null, d4Var2 != null ? d4Var2.getStringValue() : null);
                    if (str10 != null) {
                        b4 b4VarNewBuilder = d4.newBuilder();
                        b4VarNewBuilder.h(str10);
                        return (d4) b4VarNewBuilder.a();
                    }
                }
                return null;
            case 14:
                com.revolut.feature.kyc.impl.idnow.video_ident.flow.a aVar6 = (com.revolut.feature.kyc.impl.idnow.video_ident.flow.a) obj5;
                IdnowVideoIdentFlowContract$InputData idnowVideoIdentFlowContract$InputData = (IdnowVideoIdentFlowContract$InputData) obj4;
                yki.l FlowCoordinator2 = (yki.l) obj2;
                IdnowVideoIdentFlowContract$Step step5 = (IdnowVideoIdentFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (step5 instanceof IdnowVideoIdentFlowContract$Step.WebPortal) {
                    IdnowVideoIdentFlowContract$Step.WebPortal webPortal = (IdnowVideoIdentFlowContract$Step.WebPortal) step5;
                    IdnowVideoIdentScreen idnowVideoIdentScreen = new IdnowVideoIdentScreen(new IdnowVideoIdentScreenContract$InputData(webPortal.f77787a, webPortal.f77788b));
                    hs4.l block8 = new hs4.l(aVar6, 29);
                    Intrinsics.checkNotNullParameter(block8, "block");
                    idnowVideoIdentScreen.H = block8;
                    return idnowVideoIdentScreen;
                }
                if (step5 instanceof IdnowVideoIdentFlowContract$Step.PermissionPrompt) {
                    permissionsController = new PromptMarketingScreen(new PromptMarketingScreenContract$InputData(aVar6.o, aVar6.f77789p, aVar6.f77792s, null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, new PromptMarketingContentDelegate.Model.Button((Clause) aVar6.f77790q, (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, null, null, null, null, 65368));
                    hul.v block9 = new hul.v(FlowCoordinator2, aVar6, 6);
                    Intrinsics.checkNotNullParameter(block9, "block");
                    permissionsController.H = block9;
                } else {
                    if (!(step5 instanceof IdnowVideoIdentFlowContract$Step.RequestPermissions)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    permissionsController = new PermissionsController(new PermissionsControllerContract$InputData(zhm.v.k(new PermissionsControllerContract$Permission("android.permission.CAMERA", null, new PermissionsControllerContract$Explanation.PromptScreen(aVar6.o, aVar6.f77789p, aVar6.f77791r, aVar6.f77792s, null), true, 2), new PermissionsControllerContract$Permission("android.permission.RECORD_AUDIO", null, new PermissionsControllerContract$Explanation.PromptScreen(aVar6.o, aVar6.f77789p, aVar6.f77791r, aVar6.f77792s, null), true, 2))));
                    hsa.l block10 = new hsa.l(FlowCoordinator2, 2, aVar6, idnowVideoIdentFlowContract$InputData);
                    Intrinsics.checkNotNullParameter(block10, "block");
                    permissionsController.H = block10;
                }
                return permissionsController;
            case 15:
                return BoxWithConstraintsKt.BoxWithConstraints$lambda$0$0((MeasurePolicy) obj5, (Function3) obj4, (SubcomposeMeasureScope) obj2, (Constraints) obj3);
            case 16:
                i4g.h hVar = (i4g.h) obj5;
                String searchSessionId = (String) obj4;
                b4g.c params2 = (b4g.c) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(params2, "params");
                b4g.i0 i0Var = hVar.f158431a;
                if (zBooleanValue) {
                    loadingStrategy = w4l.i.f294643c;
                }
                i0Var.getClass();
                Intrinsics.checkNotNullParameter(params2, "params");
                Intrinsics.checkNotNullParameter(searchSessionId, "searchSessionId");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return rd0.e.c(new b0(new q0(i0Var.f12337c.b(new h0(params2, searchSessionId), loadingStrategy), new i4g.d(hVar, null), 1), params2, hVar, 5), kotlin.coroutines.g.f186406a);
            case 17:
                oki.g onResult = (oki.g) obj2;
                f7f.d result2 = (f7f.d) obj3;
                Intrinsics.checkNotNullParameter(onResult, "$this$onResult");
                Intrinsics.checkNotNullParameter(result2, "result");
                ((com.revolut.feature.trading.managed_portfolios.impl.ui.details.c) obj5).C2(new i6f.u(result2.f132604a, ((ManagedPortfolioDetailsControllerContract$ModalStep.MoreActions) ((ManagedPortfolioDetailsControllerContract$ModalStep) obj4)).f91279a));
                return Unit.f186387a;
            case 18:
                final com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g gVar2 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g) obj5;
                PlanHubV2ScreenContract$InputData planHubV2ScreenContract$InputData = (PlanHubV2ScreenContract$InputData) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator3 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                PlanHubV2ScreenContract$ModalStep step6 = (PlanHubV2ScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator3, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (step6 instanceof PlanHubV2ScreenContract$ModalStep.ProductArticle) {
                    PlanHubV2ScreenContract$ModalStep.ProductArticle productArticle = (PlanHubV2ScreenContract$ModalStep.ProductArticle) step6;
                    ViewController viewControllerE1 = gVar2.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Id(productArticle.f103560a), productArticle.f103561b), SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a, true, null, null, false, 56));
                    viewControllerE1.l2(new Function0() { // from class: imk.k0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i3) {
                                case 0:
                                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g gVar3 = gVar2;
                                    gVar3.f103577y.f103567h = null;
                                    gVar3.f103575w.d3();
                                    break;
                                case 1:
                                    gVar2.f103577y.f103567h = null;
                                    break;
                                default:
                                    gVar2.f103577y.f103567h = null;
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    });
                    return viewControllerE1;
                }
                if (step6 instanceof PlanHubV2ScreenContract$ModalStep.PromptOffer) {
                    PlanOfferFlow planOfferFlow = new PlanOfferFlow(new PlanOfferFlowContract$InputData.ByPrompt(((PlanHubV2ScreenContract$ModalStep.PromptOffer) step6).f103562a));
                    planOfferFlow.l2(new Function0() { // from class: imk.k0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i2) {
                                case 0:
                                    com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g gVar3 = gVar2;
                                    gVar3.f103577y.f103567h = null;
                                    gVar3.f103575w.d3();
                                    break;
                                case 1:
                                    gVar2.f103577y.f103567h = null;
                                    break;
                                default:
                                    gVar2.f103577y.f103567h = null;
                                    break;
                            }
                            return Unit.f186387a;
                        }
                    });
                    return planOfferFlow;
                }
                if (!(step6 instanceof PlanHubV2ScreenContract$ModalStep.BeDrivenModal)) {
                    throw new NoWhenBranchMatchedException();
                }
                PricingPlanBottomSheetBEDrivenScreen pricingPlanBottomSheetBEDrivenScreen = new PricingPlanBottomSheetBEDrivenScreen(new PricingPlanBottomSheetBEDrivenScreenContract$InputData(((PlanHubV2ScreenContract$ModalStep.BeDrivenModal) step6).f103559a, planHubV2ScreenContract$InputData.f103558a));
                final int i21 = 2;
                pricingPlanBottomSheetBEDrivenScreen.l2(new Function0() { // from class: imk.k0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i21) {
                            case 0:
                                com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.g gVar3 = gVar2;
                                gVar3.f103577y.f103567h = null;
                                gVar3.f103575w.d3();
                                break;
                            case 1:
                                gVar2.f103577y.f103567h = null;
                                break;
                            default:
                                gVar2.f103577y.f103567h = null;
                                break;
                        }
                        return Unit.f186387a;
                    }
                });
                return pricingPlanBottomSheetBEDrivenScreen;
            case 19:
                Integer num = (Integer) obj2;
                num.intValue();
                Integer num2 = (Integer) obj3;
                num2.intValue();
                ((RangeSliderTitleDelegate) obj5).f53139c.onNext(new Pair((r70) obj4, new Pair(num, num2)));
                return Unit.f186387a;
            case 20:
                SmartTileSendMoneyDelegate.Model model = (SmartTileSendMoneyDelegate.Model) obj4;
                CenteredAmountView field = (CenteredAmountView) obj3;
                Intrinsics.checkNotNullParameter((v9) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(field, "field");
                Function2 function22 = ((SmartTileSendMoneyDelegate) obj5).f53441c;
                if (function22 != null) {
                    return (zp0.d) function22.invoke(model, field);
                }
                return null;
            case 21:
                j0i.a aVar7 = (j0i.a) obj5;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                List list2 = aVar7.f;
                zhm.f0 f0Var = zhm.f0.f322471a;
                return ((j0i.o) obj4).a(new cw5.a(list2, f0Var, f0Var), aVar7);
            case 22:
                CenteredAmountDelegate.Model data = (CenteredAmountDelegate.Model) obj2;
                CenteredAmountView field2 = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr = FormAmountScreen.S;
                Intrinsics.checkNotNullParameter(data, "data");
                Intrinsics.checkNotNullParameter(field2, "field");
                return new zp0.d(field2.getEditText(), ((FormAmountScreenContract$InputData) obj5).f78786c.f115083b, (u80.d) ((FormAmountScreen) obj4).O.getValue(), null, null, false, false, 0, false, null, 1944);
            case 23:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return (List) iii.c.f((Data) obj4, new jyk.d0(14), new jul.c(21), new j75.i((jzb.h0) obj5, 23));
            case 24:
                return LazyLayoutKt.LazyLayout$lambda$1$3$0((LazyLayoutItemContentFactory) obj5, (LazyLayoutMeasurePolicy) obj4, (SubcomposeMeasureScope) obj2, (Constraints) obj3);
            case 25:
                com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.qr.b bVar3 = (com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.qr.b) obj5;
                PaymentLinkQrScreenContract$InputData paymentLinkQrScreenContract$InputData = (PaymentLinkQrScreenContract$InputData) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator4 = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                PaymentLinkQrScreenContract$ModalStep step7 = (PaymentLinkQrScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator4, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step7, "step");
                if (!(step7 instanceof PaymentLinkQrScreenContract$ModalStep.SetAmountAndNote)) {
                    if (step7 instanceof PaymentLinkQrScreenContract$ModalStep.ShowLimits) {
                        return new LimitsExplanationScreen(new LimitsExplanationScreenContract$InputData(((PaymentLinkQrScreenContract$ModalStep.ShowLimits) step7).f102226a));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                PaymentLinkQrScreenContract$ModalStep.SetAmountAndNote setAmountAndNote = (PaymentLinkQrScreenContract$ModalStep.SetAmountAndNote) step7;
                PaymentLinksAmountScreen paymentLinksAmountScreen = new PaymentLinksAmountScreen(new PaymentLinksAmountScreenContract$InputData.RequestCustomAmountAndNote(setAmountAndNote.f102224a, setAmountAndNote.f102225b, hrf.f.INCOMING));
                k79.b block11 = new k79.b(bVar3, paymentLinkQrScreenContract$InputData, 4);
                Intrinsics.checkNotNullParameter(block11, "block");
                paymentLinksAmountScreen.H = block11;
                return paymentLinksAmountScreen;
            case 26:
                NavigationHubFlowContract$InputData navigationHubFlowContract$InputData = (NavigationHubFlowContract$InputData) obj5;
                final com.feature.navigation.hub.impl.ui.flow.d dVar5 = (com.feature.navigation.hub.impl.ui.flow.d) obj4;
                yki.l FlowCoordinator3 = (yki.l) obj2;
                NavigationHubFlowContract$Step step8 = (NavigationHubFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step8, "step");
                if (Intrinsics.f(step8, NavigationHubFlowContract$Step.NavigationHubMain.f26221a)) {
                    NavigationHubController navigationHubController = new NavigationHubController(new NavigationHubControllerContract$InputData(navigationHubFlowContract$InputData.f26217a));
                    k79.b block12 = new k79.b(dVar5, FlowCoordinator3, 5);
                    Intrinsics.checkNotNullParameter(block12, "block");
                    navigationHubController.H = block12;
                    return navigationHubController;
                }
                if (step8 instanceof NavigationHubFlowContract$Step.InnerWorkflow) {
                    WorkflowFlow workflowFlowB = til.m.b(dVar5.o, new WorkflowConfiguration.Workflow(((NavigationHubFlowContract$Step.InnerWorkflow) step8).f26220a, (wi0.b) null, (NaviCommand) null, (String) null, (AnalyticsProduct) null, (WorkflowConfiguration.Extras) null, 126), new WorkflowFlowType.Regular(0), null, 56);
                    Function1 block13 = new Function1() { // from class: ka.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i3) {
                                case 0:
                                    til.r it9 = (til.r) obj7;
                                    Intrinsics.checkNotNullParameter(it9, "it");
                                    if (Intrinsics.f(it9, til.q.f271586a)) {
                                        ((k1) dVar5.f26222p).d(ShotDialogDisplayer$Configuration.Companion.f(ShotDialogDisplayer$Configuration.INSTANCE, "NAVIGATION_HUB_SUCCESS_TOAST_ID", new TextLocalisedClause(R.string.navigation_hub_completed_title, null, null, 14), null, null, null, 60));
                                    }
                                    return Unit.f186387a;
                                default:
                                    m90.b result3 = (m90.b) obj7;
                                    Intrinsics.checkNotNullParameter(result3, "result");
                                    if (!(result3 instanceof m90.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    ((k1) dVar5.f26222p).d(ShotDialogDisplayer$Configuration.Companion.f(ShotDialogDisplayer$Configuration.INSTANCE, "NAVIGATION_HUB_SUCCESS_TOAST_ID", new TextLocalisedClause(R.string.navigation_hub_completed_title, null, null, 14), null, null, null, 60));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block13, "block");
                    workflowFlowB.H = block13;
                    return workflowFlowB;
                }
                if (!(step8 instanceof NavigationHubFlowContract$Step.InnerForm)) {
                    throw new NoWhenBranchMatchedException();
                }
                NavigationHubFlowContract$Step.InnerForm innerForm = (NavigationHubFlowContract$Step.InnerForm) step8;
                ViewController viewControllerE12 = dVar5.e1(new n90.a(BackendFlowInput.Companion.a(BackendFlowInput.INSTANCE, innerForm.f26218a, innerForm.f26219b, null, 4)));
                Function1 block14 = new Function1() { // from class: ka.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        switch (i2) {
                            case 0:
                                til.r it9 = (til.r) obj7;
                                Intrinsics.checkNotNullParameter(it9, "it");
                                if (Intrinsics.f(it9, til.q.f271586a)) {
                                    ((k1) dVar5.f26222p).d(ShotDialogDisplayer$Configuration.Companion.f(ShotDialogDisplayer$Configuration.INSTANCE, "NAVIGATION_HUB_SUCCESS_TOAST_ID", new TextLocalisedClause(R.string.navigation_hub_completed_title, null, null, 14), null, null, null, 60));
                                }
                                return Unit.f186387a;
                            default:
                                m90.b result3 = (m90.b) obj7;
                                Intrinsics.checkNotNullParameter(result3, "result");
                                if (!(result3 instanceof m90.a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ((k1) dVar5.f26222p).d(ShotDialogDisplayer$Configuration.Companion.f(ShotDialogDisplayer$Configuration.INSTANCE, "NAVIGATION_HUB_SUCCESS_TOAST_ID", new TextLocalisedClause(R.string.navigation_hub_completed_title, null, null, 14), null, null, null, 60));
                                return Unit.f186387a;
                        }
                    }
                };
                Intrinsics.checkNotNullParameter(block14, "block");
                viewControllerE12.H = block14;
                return viewControllerE12;
            case 27:
                FormPermissionFlowContract$InputData formPermissionFlowContract$InputData = (FormPermissionFlowContract$InputData) obj5;
                com.revolut.core.backend_flow.impl.flow.permission.b bVar4 = (com.revolut.core.backend_flow.impl.flow.permission.b) obj4;
                FormPermissionFlowContract$Step step9 = (FormPermissionFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step9, "step");
                if (!(step9 instanceof FormPermissionFlowContract$Step.RequestPermissions)) {
                    throw new NoWhenBranchMatchedException();
                }
                PermissionInputItem permissionInputItem = formPermissionFlowContract$InputData.f51231a;
                PermissionInputItem.DeclinedPermissionDialog declinedPermissionDialog = permissionInputItem.e;
                if (declinedPermissionDialog != null) {
                    ArrayList arrayList2 = declinedPermissionDialog.d;
                    Iterator it9 = arrayList2.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            next = it9.next();
                            if (Intrinsics.f(((PermissionInputItem.DeclinedPermissionDialogAction) next).f63561a, "SETTINGS")) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    PermissionInputItem.DeclinedPermissionDialogAction declinedPermissionDialogAction = (PermissionInputItem.DeclinedPermissionDialogAction) next;
                    Clause textLocalisedClause3 = (declinedPermissionDialogAction == null || (str3 = declinedPermissionDialogAction.f63562b) == null) ? new TextLocalisedClause(com.revolut.uicomponent.R$string.permission_storage_reason_action, null, null, 14) : new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    Iterator it10 = arrayList2.iterator();
                    while (true) {
                        if (it10.hasNext()) {
                            next2 = it10.next();
                            if (Intrinsics.f(((PermissionInputItem.DeclinedPermissionDialogAction) next2).f63561a, "SKIP")) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    PermissionInputItem.DeclinedPermissionDialogAction declinedPermissionDialogAction2 = (PermissionInputItem.DeclinedPermissionDialogAction) next2;
                    promptScreen = new PermissionsFlowContract$Explanation.PromptScreen(new TextClause(declinedPermissionDialog.f63559b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(declinedPermissionDialog.f63560c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), textLocalisedClause3, new UrlImage(declinedPermissionDialog.f63558a, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), (declinedPermissionDialogAction2 == null || (str2 = declinedPermissionDialogAction2.f63562b) == null) ? null : new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 16);
                } else {
                    promptScreen = PermissionsFlowContract$Explanation.None.f98339a;
                }
                oa0.g gVar3 = oa0.h.Companion;
                y yVar = permissionInputItem.f63557c;
                gVar3.getClass();
                Intrinsics.checkNotNullParameter(yVar, "<this>");
                switch (oa0.f.f223490a[yVar.ordinal()]) {
                    case 1:
                        str = "android.permission.ACCESS_FINE_LOCATION";
                        break;
                    case 2:
                        str = "android.permission.MANAGE_EXTERNAL_STORAGE";
                        break;
                    case 3:
                        str = "android.permission.READ_CONTACTS";
                        break;
                    case 4:
                        str = "android.permission.CAMERA";
                        break;
                    case 5:
                        str = "android.permission.RECORD_AUDIO";
                        break;
                    case 6:
                        str = "android.permission.ACCESS_NETWORK_STATE";
                        break;
                    case 7:
                        str = "android.permission.GET_ACCOUNTS";
                        break;
                    case 8:
                        str = "android.permission.BLUETOOTH";
                        break;
                    case 9:
                        str = "android.permission.POST_NOTIFICATIONS";
                        break;
                    case 10:
                        throw new IllegalStateException("META_SSO is handled via web authorization flow, not system permissions");
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                PermissionsFlow permissionsFlow = new PermissionsFlow(zhm.u.c(new PermissionsFlowContract$Permission(str, promptScreen, 2)));
                k79.b bVar5 = new k79.b(bVar4, permissionInputItem, 6);
                Intrinsics.checkNotNullParameter(bVar5, "<set-?>");
                permissionsFlow.J = bVar5;
                return permissionsFlow;
            case 28:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                ((Ref$BooleanRef) obj5).f186407a = false;
                ((Ref$BooleanRef) obj4).f186407a = true;
                return Unit.f186387a;
            default:
                int iIntValue = ((Integer) obj2).intValue();
                int i22 = ChatAttachmentGridBubbleDelegate.f53774n;
                ((kp0.j) obj5).f188021p.a(((Number) ((Pair) ((ArrayList) obj4).get(iIntValue)).f186385a).intValue(), (Float) obj3);
                return Unit.f186387a;
        }
    }
}

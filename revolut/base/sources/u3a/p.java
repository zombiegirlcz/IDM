package u3a;

import android.os.Parcelable;
import androidx.compose.material.FabPlacement;
import androidx.compose.material.FloatingActionButtonKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.ScaffoldKt$ScaffoldLayout$contentPadding$1$1;
import androidx.compose.material.ScaffoldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImplKt;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import aw0.n6;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$InputData;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.backend_flow.domain.models.BottomPromptScreen;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.LinkedAccountsConsentFlowContract$Step;
import com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.a;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessOutput;
import com.revolut.feature.payments.send_from_clipboard.api.navigation.SendFromClipboardNavigation$InputData;
import com.revolut.feature.payments.send_from_clipboard.impl.flow.SendFromClipboardFlowContract$Step;
import com.revolut.feature.payments.send_from_clipboard.impl.ui.selection.SendFromClipboardSelectionScreen;
import com.revolut.feature.payments.send_from_clipboard.impl.ui.selection.SendFromClipboardSelectionScreenContract$InputData;
import com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.flow.SplitBillQrFlowContract$Step;
import com.revolut.feature.payments.who_to_transfer.api.who_to_transfer.navigation.ContactsSyncOnboardingDescriptor$LaunchMode;
import com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.flow.OnboardingContactSyncFlowContract$Step;
import com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.notify.OnboardingContactSyncNotifyScreen;
import com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.notify.OnboardingContactSyncNotifyScreenContract$InputData;
import com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.permission.OnboardingContactSyncPermissionScreen;
import com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.permission.OnboardingContactSyncPermissionScreenContract$InputData;
import com.revolut.feature.pix.impl.flow.alias_deletion.AliasDeletionContract$InputData;
import com.revolut.feature.pix.impl.flow.alias_deletion.AliasDeletionContract$Step;
import com.revolut.feature.pix.impl.flow.alias_deletion.screens.review_delete.ReviewDeleteAliasScreen;
import com.revolut.feature.pix.impl.flow.alias_deletion.screens.review_delete.ReviewDeleteAliasScreenContract$InputData;
import com.revolut.feature.pix.impl.flow.alias_registration.AliasRegistrationContract$InputData;
import com.revolut.feature.pix.impl.flow.alias_registration.AliasRegistrationFlow;
import com.revolut.feature.pix.impl.flow.pix_area.screens.my_aliases.MyAliasesScreen;
import com.revolut.feature.pix.impl.flow.pix_area.screens.my_aliases.MyAliasesScreenContract$InputData;
import com.revolut.feature.pix.impl.flow.qr_request.PixQrRequestContract$InputData;
import com.revolut.feature.pix.impl.flow.qr_request.PixQrRequestContract$State;
import com.revolut.feature.pix.impl.flow.qr_request.PixQrRequestContract$Step;
import com.revolut.feature.pix.impl.flow.qr_request.screen.add_amount.PixQrRequestAddAmountScreen;
import com.revolut.feature.pix.impl.flow.qr_request.screen.add_amount.PixQrRequestAddAmountScreenContract$InputData;
import com.revolut.feature.pix.impl.flow.qr_request.screen.add_description.PixQrRequestAddDescriptionScreen;
import com.revolut.feature.pix.impl.flow.qr_request.screen.add_description.PixQrRequestAddDescriptionScreenContract$InputData;
import com.revolut.feature.pix.impl.flow.qr_request.screen.request.PixQrRequestScreen;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.retail.cfd.impl.R$string;
import com.revolut.feature.retail.cfd.impl.flows.onboarding.CfdOnboardingFlowContract$Step;
import com.revolut.feature.retail.cfd.impl.flows.onboarding.CfdProductWelcomeArticleKey;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsCardConfiguration;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlan;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.CobrandedCardsValueReminderScreenContract$ModalStep;
import com.revolut.feature.revolutpay.shipping.api.domain.models.shippingcontacts.ShippingContact;
import com.revolut.feature.revolutpay.shipping.api.navigation.ShippingContactsScreenDescriptor$InputData;
import com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contact_options.ShippingContactOptionsScreen;
import com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.ShippingContactsContract$ModalStep;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.RentAndBillsFlowContract$Step;
import com.revolut.feature.store.api.model.StoreMegaFilterSelection;
import com.revolut.feature.transaction.recogniser.api.domain.models.TransactionRecogniserDetails;
import com.revolut.feature.wealth.analytics.ui.widgetised.performance.WidgetisedAnalyticsPerformanceContract$ModalStep;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$MoveMoneyProcessState;
import com.revolut.feature_move_money.impl.flow.MoveMoneyFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.adjust_analytics.impl.ui.AdjustAnalyticsContract$InputData;
import com.revolut.retail.feature.adjust_analytics.impl.ui.AdjustAnalyticsController;
import com.revolut.shared.feature.wealth.ui_kit.models.image.RoundedRectImage;
import dca.j;
import dca.k;
import dca.m;
import fag.m0;
import fag.t0;
import grl.k9;
import i9g.b0;
import ip0.ep;
import ip0.xk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import mii.f;
import nii.g0;
import nii.y0;
import o97.e0;
import oki.h;
import org.jmrtd.lds.LDSFile;
import te0.w;
import vch.h0;
import vkm.j2;
import xif.y;
import xif.z;
import y8a.e;
import yki.l;
import zba.g;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f276869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f276870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f276871c;

    public /* synthetic */ p(Object obj2, Object obj3, int i) {
        this.f276869a = i;
        this.f276870b = obj2;
        this.f276871c = obj3;
    }

    /* JADX WARN: Type inference failed for: r1v114, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        dj0.d dVar;
        Pair pair;
        ViewController actionsBottomSheetController;
        int i;
        List listC;
        Object next;
        int i2 = this.f276869a;
        final int i3 = 0;
        Continuation continuation = null;
        Object obj4 = this.f276871c;
        Object obj5 = this.f276870b;
        switch (i2) {
            case 0:
                zm3.b bVar = (zm3.b) obj5;
                String str = (String) obj4;
                List revolut = (List) obj2;
                List other = (List) obj3;
                Intrinsics.checkNotNullParameter(revolut, "filteredRevolut");
                Intrinsics.checkNotNullParameter(other, "filteredOther");
                boolean z = str != null && str.length() > 0;
                List frequent = bVar.f323332a;
                List recent = bVar.f323333b;
                Intrinsics.checkNotNullParameter(frequent, "frequent");
                Intrinsics.checkNotNullParameter(recent, "recent");
                Intrinsics.checkNotNullParameter(revolut, "revolut");
                Intrinsics.checkNotNullParameter(other, "other");
                return new zm3.b(frequent, recent, revolut, other, z);
            case 1:
                uef.k kVar = (uef.k) obj5;
                TransactionRecogniserDetails transactionRecogniserDetails = (TransactionRecogniserDetails) obj4;
                Throwable th10 = (Throwable) obj2;
                Function1 defaultItemsFactory = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultItemsFactory, "defaultItemsFactory");
                if (th10 == null) {
                    return kVar.b(transactionRecogniserDetails);
                }
                RowDelegate.Model modelB = ((dff.b) kVar.f279358a).b(transactionRecogniserDetails.f91803a, false);
                yp0.b.l(modelB, 0, 0, 0, 0, null, false, 63);
                return d0.E0((Iterable) defaultItemsFactory.invoke(new iii.d(12, null, true, true, null)), zhm.u.c(modelB));
            case 2:
                vfi.a params = (vfi.a) obj2;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                Intrinsics.checkNotNullParameter(params, "params");
                b0 b0Var = ((ueg.e) obj5).f279382b;
                params.getClass();
                vfi.a availabilityPageParams = new vfi.a((dgi.c) obj4, params.f288660b);
                b0Var.getClass();
                Intrinsics.checkNotNullParameter(availabilityPageParams, "availabilityPageParams");
                t0 t0Var = b0Var.f159780a;
                t0Var.getClass();
                Intrinsics.checkNotNullParameter(availabilityPageParams, "availabilityPageParams");
                efm.r map = mo3.a.n(t0Var.D.f(availabilityPageParams, zBooleanValue)).map(new m0(new f0m.c(availabilityPageParams, 23), 14));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return map;
            case 3:
                return FloatingActionButtonKt.ExtendedFloatingActionButton_wqdebIU$lambda$0((Function2) obj5, (Function2) obj4, (Composer) obj2, ((Integer) obj3).intValue());
            case 4:
                return ScaffoldKt.ScaffoldLayout_i1QSOvI$lambda$1$0$7((FabPlacement) obj5, (Function2) obj4, (Composer) obj2, ((Integer) obj3).intValue());
            case 5:
                return ScaffoldKt.ScaffoldLayout_i1QSOvI$lambda$1$0$11((Function3) obj5, (ScaffoldKt$ScaffoldLayout$contentPadding$1$1) obj4, (Composer) obj2, ((Integer) obj3).intValue());
            case 6:
                return ScaffoldKt.Scaffold_u4IkXBM$lambda$1$1$0((Function3) obj5, (ScaffoldState) obj4, (Composer) obj2, ((Integer) obj3).intValue());
            case 7:
                com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.flow.c cVar = (com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.flow.c) obj5;
                SplitBillQrFlowContract$Step.EditSplit editSplit = (SplitBillQrFlowContract$Step.EditSplit) obj4;
                oki.g onResult = (oki.g) obj2;
                s1a.d output = (s1a.d) obj3;
                Intrinsics.checkNotNullParameter(onResult, "$this$onResult");
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof s1a.c) {
                    dVar = ((s1a.c) output).f259118b;
                } else {
                    if (!Intrinsics.f(output, s1a.b.f259117b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar = null;
                }
                if (Intrinsics.f(editSplit.f79867b, dVar)) {
                    onResult.pop();
                    return Unit.f186387a;
                }
                cVar.l2(new com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.flow.b(cVar, output, onResult, editSplit, dVar, null), new yi5.b(26));
                return Unit.f186387a;
            case 8:
                com.revolut.feature.retail.cfd.impl.flows.onboarding.b bVar2 = (com.revolut.feature.retail.cfd.impl.flows.onboarding.b) obj5;
                v2b.c cVar2 = (v2b.c) obj4;
                CfdOnboardingFlowContract$Step step = (CfdOnboardingFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter((yki.l) obj2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof CfdOnboardingFlowContract$Step.ProductArticle) {
                    return bVar2.e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(new CfdProductWelcomeArticleKey(i3))), SkipShownArticleBehaviour.AlwaysShow.f81285a, false, cVar2.f285689a, null, false, 20));
                }
                if (!Intrinsics.f(step, CfdOnboardingFlowContract$Step.RiskWarning.f82162a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE1 = bVar2.e1(new a2b.e(new TextLocalisedClause(R$string.wealth_cfd_onboarding_risk_warning_title, null, null, 14), new TextLocalisedClause(R$string.wealth_cfd_onboarding_risk_warning_button, null, null, 14)));
                v25.k block = new v25.k(bVar2, 1);
                Intrinsics.checkNotNullParameter(block, "block");
                viewControllerE1.H = block;
                return viewControllerE1;
            case 9:
                AliasDeletionContract$InputData aliasDeletionContract$InputData = (AliasDeletionContract$InputData) obj5;
                com.revolut.feature.pix.impl.flow.alias_deletion.a aVar = (com.revolut.feature.pix.impl.flow.alias_deletion.a) obj4;
                yki.l FlowCoordinator = (yki.l) obj2;
                AliasDeletionContract$Step step2 = (AliasDeletionContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (!(step2 instanceof AliasDeletionContract$Step.ReviewDelete)) {
                    if (step2 instanceof AliasDeletionContract$Step.NewKey) {
                        return new AliasRegistrationFlow(new AliasRegistrationContract$InputData(aliasDeletionContract$InputData.f80568a, null));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                ReviewDeleteAliasScreen reviewDeleteAliasScreen = new ReviewDeleteAliasScreen(new ReviewDeleteAliasScreenContract$InputData(aliasDeletionContract$InputData.f80568a, aliasDeletionContract$InputData.f80569b));
                v73.c block2 = new v73.c(aVar, FlowCoordinator, 3);
                Intrinsics.checkNotNullParameter(block2, "block");
                reviewDeleteAliasScreen.H = block2;
                return reviewDeleteAliasScreen;
            case 10:
                w4l.f DataObservableDelegate = (w4l.f) obj2;
                String portfolioId = (String) obj3;
                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                efm.d0<qdl.a> settings = ((vdl.t0) obj5).f288045b.getSettings(portfolioId);
                vdl.s sVar = new vdl.s(9, new h0(23));
                settings.getClass();
                ufm.i iVar = new ufm.i(settings, sVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return w.n0(iVar, (b80.c) obj4);
            case 11:
                Data data = (Data) obj5;
                Data data2 = (Data) obj4;
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(8, null, true, true, (data.getError() == null || data2.getError() == null) ? data.getError() != null ? "UNDERLYING_PRICE_ERROR_LIST_ID" : "EXPIRATION_DATES_ERROR_LIST_ID" : "UNDERLYING_PRICE_AND_EXPIRATION_DATES_ERROR_LIST_ID"));
            case 12:
                com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.a aVar2 = (com.revolut.feature.external_accounts.impl.ui.consents_kompot.linked_accounts.a) obj5;
                LinkedAccountsConsentFlowContract$Step linkedAccountsConsentFlowContract$Step = (LinkedAccountsConsentFlowContract$Step) obj4;
                oki.g onResult2 = (oki.g) obj2;
                com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.a output2 = (com.revolut.feature.external_accounts.impl.ui.link.screens.review_account_linking_details.a) obj3;
                Intrinsics.checkNotNullParameter(onResult2, "$this$onResult");
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof a.b) {
                    onResult2.pop();
                } else if (output2 instanceof zn6.i) {
                    String str2 = ((zn6.i) output2).f323676a;
                    String str3 = ((LinkedAccountsConsentFlowContract$Step.ReviewAccountLinkingDetailsScreen) linkedAccountsConsentFlowContract$Step).f72796b;
                    yji.l.b1(aVar2, aVar2.X1(new y0(null, new g0(new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_out_of_process_linking_title, zhm.u.c(str3), null, 12), new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.external_institutions_out_of_process_linking_description, zhm.u.c(str3), null, 12), null, null, null, null, null, null, false, null, false, null, 16380), false, 5)), null, new vfg.m(aVar2, str2, continuation, 10), 3);
                } else if (output2 instanceof zn6.j) {
                    oki.h.D2(aVar2.f72802s);
                } else {
                    if (!(output2 instanceof a.C0485a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    onResult2.pop();
                }
                return Unit.f186387a;
            case 13:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new vpd.p((List) getDefaultErrorItems2.invoke(new iii.d(12, null, true, false, null)), (TextLocalisedClause) obj5, (TextLocalisedClause) obj4, vpd.m.f291174a);
            case 14:
                ContactsSyncOnboardingDescriptor$LaunchMode contactsSyncOnboardingDescriptor$LaunchMode = (ContactsSyncOnboardingDescriptor$LaunchMode) obj5;
                com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.flow.a aVar3 = (com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.flow.a) obj4;
                yki.l FlowCoordinator2 = (yki.l) obj2;
                OnboardingContactSyncFlowContract$Step step3 = (OnboardingContactSyncFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (step3 instanceof OnboardingContactSyncFlowContract$Step.NotifyStep) {
                    OnboardingContactSyncFlowContract$Step.NotifyStep notifyStep = (OnboardingContactSyncFlowContract$Step.NotifyStep) step3;
                    OnboardingContactSyncNotifyScreen onboardingContactSyncNotifyScreen = new OnboardingContactSyncNotifyScreen(new OnboardingContactSyncNotifyScreenContract$InputData(notifyStep.f80106a, notifyStep.f80108c, notifyStep.f80107b));
                    vx9.v block3 = new vx9.v(contactsSyncOnboardingDescriptor$LaunchMode, 5, aVar3, FlowCoordinator2);
                    Intrinsics.checkNotNullParameter(block3, "block");
                    onboardingContactSyncNotifyScreen.H = block3;
                    return onboardingContactSyncNotifyScreen;
                }
                if (!(step3 instanceof OnboardingContactSyncFlowContract$Step.PermissionStep)) {
                    throw new NoWhenBranchMatchedException();
                }
                OnboardingContactSyncPermissionScreen onboardingContactSyncPermissionScreen = new OnboardingContactSyncPermissionScreen(new OnboardingContactSyncPermissionScreenContract$InputData(((OnboardingContactSyncFlowContract$Step.PermissionStep) step3).f80109a));
                vx9.v block4 = new vx9.v(aVar3, 6, FlowCoordinator2, step3);
                Intrinsics.checkNotNullParameter(block4, "block");
                onboardingContactSyncPermissionScreen.H = block4;
                return onboardingContactSyncPermissionScreen;
            case 15:
                com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c cVar3 = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.c) obj5;
                r5b.p action = (r5b.p) obj2;
                String str4 = (String) obj3;
                Intrinsics.checkNotNullParameter(action, "action");
                CobrandedCardsValueReminderScreenContract$ModalStep.DowngradeConfirmation downgradeConfirmation = (CobrandedCardsValueReminderScreenContract$ModalStep.DowngradeConfirmation) ((CobrandedCardsValueReminderScreenContract$ModalStep) obj4);
                CobrandedCardsPlan cobrandedCardsPlan = downgradeConfirmation.f82616a;
                CobrandedCardsCardConfiguration cobrandedCardsCardConfiguration = downgradeConfirmation.f82617b;
                int i5 = w7b.q.f295511a[action.ordinal()];
                if (i5 == 1) {
                    cVar3.l2(new com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.b(cVar3, str4, null), new w7b.p(cVar3, 1));
                } else if (i5 == 2 || i5 == 3) {
                    IllegalStateException illegalStateException = new IllegalStateException("Unexpected ActionItem " + action + " in DowngradeConfirmation");
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                } else if (i5 != 4) {
                    if (i5 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected ActionItem " + action + " in DowngradeConfirmation");
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                } else {
                    cVar3.l2(new sxe.g((Object) cVar3, (Object) cobrandedCardsPlan, (Object) cobrandedCardsCardConfiguration, str4, (Continuation) null, 28), new w7b.p(cVar3, i3));
                }
                return Unit.f186387a;
            case 16:
                com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.c cVar4 = (com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.c) obj5;
                yki.i iVar2 = cVar4.u;
                RentAndBillsFlowContract$Step rentAndBillsFlowContract$Step = (RentAndBillsFlowContract$Step) obj4;
                oki.g onResult3 = (oki.g) obj2;
                djc.r output3 = (djc.r) obj3;
                Intrinsics.checkNotNullParameter(onResult3, "$this$onResult");
                Intrinsics.checkNotNullParameter(output3, "output");
                if (output3 instanceof djc.n) {
                    RentAndBillsFlowContract$Step.ManageLinkedPayments manageLinkedPayments = (RentAndBillsFlowContract$Step.ManageLinkedPayments) rentAndBillsFlowContract$Step;
                    oki.h.t2(cVar4, cVar4.u, new RentAndBillsFlowContract$Step.SelectPayment(manageLinkedPayments.f84963a, manageLinkedPayments.f84964b), true, null, false, 12);
                    onResult3.pop();
                } else {
                    boolean z3 = output3 instanceof djc.o;
                    ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                    if (z3) {
                        RentAndBillsFlowContract$Step.ManageLinkedPayments manageLinkedPayments2 = (RentAndBillsFlowContract$Step.ManageLinkedPayments) rentAndBillsFlowContract$Step;
                        oki.h.w2(iVar2, new RentAndBillsFlowContract$Step.AllowanceDetails(manageLinkedPayments2.f84963a, manageLinkedPayments2.f84964b, ((djc.o) output3).f115310a), bottom_dialog);
                    } else if (output3 instanceof djc.p) {
                        RentAndBillsFlowContract$Step.ManageLinkedPayments manageLinkedPayments3 = (RentAndBillsFlowContract$Step.ManageLinkedPayments) rentAndBillsFlowContract$Step;
                        oki.h.w2(iVar2, new RentAndBillsFlowContract$Step.EarnRateDetails(manageLinkedPayments3.f84963a, manageLinkedPayments3.f84964b), bottom_dialog);
                    } else {
                        if (!(output3 instanceof djc.q)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        djc.q qVar = (djc.q) output3;
                        oki.h.w2(iVar2, new RentAndBillsFlowContract$Step.UnlinkPayments(((RentAndBillsFlowContract$Step.ManageLinkedPayments) rentAndBillsFlowContract$Step).f84963a, qVar.f115312a, qVar.f115313b), bottom_dialog);
                    }
                }
                return Unit.f186387a;
            case 17:
                com.revolut.feature.payments.send_from_clipboard.impl.flow.a aVar4 = (com.revolut.feature.payments.send_from_clipboard.impl.flow.a) obj5;
                SendFromClipboardNavigation$InputData sendFromClipboardNavigation$InputData = (SendFromClipboardNavigation$InputData) obj4;
                yki.b LazyFlowCoordinator = (yki.b) obj2;
                SendFromClipboardFlowContract$Step step4 = (SendFromClipboardFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(LazyFlowCoordinator, "$this$LazyFlowCoordinator");
                Intrinsics.checkNotNullParameter(step4, "step");
                if (!(step4 instanceof SendFromClipboardFlowContract$Step.Selection)) {
                    throw new NoWhenBranchMatchedException();
                }
                SendFromClipboardSelectionScreen sendFromClipboardSelectionScreen = new SendFromClipboardSelectionScreen(new SendFromClipboardSelectionScreenContract$InputData(sendFromClipboardNavigation$InputData.f79711a));
                wvg.d0 block5 = new wvg.d0(aVar4, 16);
                Intrinsics.checkNotNullParameter(block5, "block");
                sendFromClipboardSelectionScreen.H = block5;
                sendFromClipboardSelectionScreen.k2(new wp0.b(aVar4, 11));
                return sendFromClipboardSelectionScreen;
            case 18:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_performance_title, null, null, 14);
                kotlin.jvm.internal.t0 t0Var2 = kotlin.jvm.internal.t0.f186434a;
                m70.a.c(t0Var2);
                TextClause textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                CompositeClause compositeClauseB = ((wyg.u) obj5).b((wyg.a) obj4);
                Intrinsics.checkNotNullParameter(t0Var2, "<this>");
                return new wyg.b(textLocalisedClause, textClause, compositeClauseB, false, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null);
            case 19:
                WidgetisedAnalyticsPerformanceContract$ModalStep widgetisedAnalyticsPerformanceContract$ModalStep = (WidgetisedAnalyticsPerformanceContract$ModalStep) obj5;
                com.revolut.feature.wealth.analytics.ui.widgetised.performance.a aVar5 = (com.revolut.feature.wealth.analytics.ui.widgetised.performance.a) obj4;
                kvg.f outputData = (kvg.f) obj3;
                Intrinsics.checkNotNullParameter((oki.g) obj2, "$this$onResult");
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (Intrinsics.f(outputData, kvg.d.f190116a)) {
                    pair = new Pair(((WidgetisedAnalyticsPerformanceContract$ModalStep.BenchmarkSelection) widgetisedAnalyticsPerformanceContract$ModalStep).f95102a, Boolean.FALSE);
                } else {
                    if (!(outputData instanceof kvg.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pair = new Pair(((kvg.e) outputData).f190117a.f200457a, Boolean.TRUE);
                }
                String benchmarkRef = (String) pair.f186385a;
                boolean zBooleanValue2 = ((Boolean) pair.f186386b).booleanValue();
                kbb.c cVar5 = aVar5.v;
                WidgetisedAnalyticsType analyticsType = ((wyg.a) ((j2) aVar5.f95110w.f22677a).getValue()).f301273b;
                cVar5.getClass();
                Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
                Intrinsics.checkNotNullParameter(benchmarkRef, "benchmarkRef");
                vyg.g gVarS = kbb.c.S(analyticsType);
                if (gVarS != null) {
                    ((vvg.b) cVar5.f182549b).a(gVarS, benchmarkRef, zBooleanValue2);
                }
                return Unit.f186387a;
            case 20:
                ShippingContactsScreenDescriptor$InputData shippingContactsScreenDescriptor$InputData = (ShippingContactsScreenDescriptor$InputData) obj5;
                final com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b bVar3 = (com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b) obj4;
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                final ShippingContactsContract$ModalStep step5 = (ShippingContactsContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step5, "step");
                if (step5 instanceof ShippingContactsContract$ModalStep.AddNewAddress) {
                    ShippingContactsScreenDescriptor$InputData.ModeConfiguration modeConfiguration = shippingContactsScreenDescriptor$InputData.f84743a;
                    if (modeConfiguration instanceof ShippingContactsScreenDescriptor$InputData.ModeConfiguration.SelectContact) {
                        i = com.revolut.feature.revolutpay.shipping.shared.R$string.revolut_pay_order_summary_add_address;
                    } else {
                        if (!(modeConfiguration instanceof ShippingContactsScreenDescriptor$InputData.ModeConfiguration.UpdatedDefaultContact)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = com.revolut.feature.revolutpay.shipping.shared.R$string.revolut_pay_new_address_title;
                    }
                    ViewController viewControllerE12 = bVar3.e1(new th1.a(new AddressFlowContract$InputData(((ShippingContactsContract$ModalStep.AddNewAddress) step5).f84751a, new TextLocalisedClause(i, null, null, 14), null, false, new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_common_action_save, null, null, 14), null, null, null, false, null, 2097076), null, null, 6));
                    wma.e block6 = new wma.e(1, bVar3, com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b.class, "handleAddAddress", "handleAddAddress(Lcom/revolut/feature/address/common/api/flow/AddressFlowContract$OutputData;)V", 0, 21);
                    Intrinsics.checkNotNullParameter(block6, "block");
                    viewControllerE12.H = block6;
                    return viewControllerE12;
                }
                if (step5 instanceof ShippingContactsContract$ModalStep.EditShippingContact) {
                    actionsBottomSheetController = bVar3.e1(new th1.a(new AddressFlowContract$InputData(((ShippingContactsContract$ModalStep.EditShippingContact) step5).f84753a.f84741b, new TextLocalisedClause(com.revolut.feature.revolutpay.shipping.shared.R$string.revolut_pay_edit_address_title, null, null, 14), null, false, new TextLocalisedClause(com.revolut.feature.revolutpay.shipping.shared.R$string.revolut_pay_edit_address_update, null, null, 14), null, null, null, false, null, 2097076), null, null, 6));
                    Function1 block7 = new Function1() { // from class: xec.y
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            List list;
                            switch (i3) {
                                case 0:
                                    AddressFlowContract$OutputData outputData2 = (AddressFlowContract$OutputData) obj6;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    ShippingContact shippingContact = ((ShippingContactsContract$ModalStep.EditShippingContact) step5).f84753a;
                                    com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b bVar4 = bVar3;
                                    bVar4.n2(new wih.c(bVar4, shippingContact, outputData2, null, 28), new whi.b(6));
                                    return Unit.f186387a;
                                case 1:
                                    com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b bVar5 = bVar3;
                                    com.revolut.kompot.navigable.vc.modal.a aVar6 = bVar5.f84759t;
                                    vec.c result = (vec.c) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    String str5 = ((ShippingContactsContract$ModalStep.ShippingContactOptions) step5).f84754a;
                                    if (result instanceof vec.b) {
                                        nec.c cVar6 = (nec.c) ((e) ((j2) bVar5.f84758s.f22677a).getValue()).f304580a.getContent();
                                        ShippingContact shippingContact2 = null;
                                        Object obj7 = null;
                                        shippingContact2 = null;
                                        if (cVar6 != null && (list = cVar6.f214428a) != null) {
                                            Iterator it8 = list.iterator();
                                            while (true) {
                                                if (it8.hasNext()) {
                                                    Object next2 = it8.next();
                                                    if (Intrinsics.f(((ShippingContact) next2).f84740a, str5)) {
                                                        obj7 = next2;
                                                    }
                                                }
                                            }
                                            shippingContact2 = (ShippingContact) obj7;
                                        }
                                        if (shippingContact2 == null) {
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                        oki.h.v2(aVar6, new ShippingContactsContract$ModalStep.EditShippingContact(shippingContact2), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
                                    } else {
                                        if (!(result instanceof vec.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.v2(aVar6, new ShippingContactsContract$ModalStep.DeleteAddressConfirmation(str5), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    dii.g result2 = (dii.g) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    String str6 = ((ShippingContactsContract$ModalStep.DeleteAddressConfirmation) step5).f84752a;
                                    if (result2 instanceof dii.f) {
                                        com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b bVar6 = bVar3;
                                        bVar6.n2(new c0(bVar6, str6, null, 1), new x(bVar6, 1));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block7, "block");
                    actionsBottomSheetController.H = block7;
                } else if (step5 instanceof ShippingContactsContract$ModalStep.ShippingContactOptions) {
                    actionsBottomSheetController = new ShippingContactOptionsScreen();
                    final int i6 = 1;
                    Function1 block8 = new Function1() { // from class: xec.y
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            List list;
                            switch (i6) {
                                case 0:
                                    AddressFlowContract$OutputData outputData2 = (AddressFlowContract$OutputData) obj6;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    ShippingContact shippingContact = ((ShippingContactsContract$ModalStep.EditShippingContact) step5).f84753a;
                                    com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b bVar4 = bVar3;
                                    bVar4.n2(new wih.c(bVar4, shippingContact, outputData2, null, 28), new whi.b(6));
                                    return Unit.f186387a;
                                case 1:
                                    com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b bVar5 = bVar3;
                                    com.revolut.kompot.navigable.vc.modal.a aVar6 = bVar5.f84759t;
                                    vec.c result = (vec.c) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    String str5 = ((ShippingContactsContract$ModalStep.ShippingContactOptions) step5).f84754a;
                                    if (result instanceof vec.b) {
                                        nec.c cVar6 = (nec.c) ((e) ((j2) bVar5.f84758s.f22677a).getValue()).f304580a.getContent();
                                        ShippingContact shippingContact2 = null;
                                        Object obj7 = null;
                                        shippingContact2 = null;
                                        if (cVar6 != null && (list = cVar6.f214428a) != null) {
                                            Iterator it8 = list.iterator();
                                            while (true) {
                                                if (it8.hasNext()) {
                                                    Object next2 = it8.next();
                                                    if (Intrinsics.f(((ShippingContact) next2).f84740a, str5)) {
                                                        obj7 = next2;
                                                    }
                                                }
                                            }
                                            shippingContact2 = (ShippingContact) obj7;
                                        }
                                        if (shippingContact2 == null) {
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                        oki.h.v2(aVar6, new ShippingContactsContract$ModalStep.EditShippingContact(shippingContact2), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
                                    } else {
                                        if (!(result instanceof vec.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.v2(aVar6, new ShippingContactsContract$ModalStep.DeleteAddressConfirmation(str5), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    dii.g result2 = (dii.g) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    String str6 = ((ShippingContactsContract$ModalStep.DeleteAddressConfirmation) step5).f84752a;
                                    if (result2 instanceof dii.f) {
                                        com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b bVar6 = bVar3;
                                        bVar6.n2(new c0(bVar6, str6, null, 1), new x(bVar6, 1));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block8, "block");
                    actionsBottomSheetController.H = block8;
                } else {
                    if (!(step5 instanceof ShippingContactsContract$ModalStep.DeleteAddressConfirmation)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lw0.a aVar6 = new lw0.a(new TextLocalisedClause(com.revolut.feature.revolutpay.shipping.shared.R$string.revolut_pay_delete_address_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.revolutpay.shipping.shared.R$string.revolut_pay_delete_address_subtitle, null, null, 14), null, null, false, 28);
                    aw0.g gVar = new aw0.g(new n6(new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_common_action_delete, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (aw0.f) null, 25);
                    k9 k9Var = k9.RevolutPay;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar6, gVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
                    final int i21 = 2;
                    Function1 block9 = new Function1() { // from class: xec.y
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj6) {
                            List list;
                            switch (i21) {
                                case 0:
                                    AddressFlowContract$OutputData outputData2 = (AddressFlowContract$OutputData) obj6;
                                    Intrinsics.checkNotNullParameter(outputData2, "outputData");
                                    ShippingContact shippingContact = ((ShippingContactsContract$ModalStep.EditShippingContact) step5).f84753a;
                                    com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b bVar4 = bVar3;
                                    bVar4.n2(new wih.c(bVar4, shippingContact, outputData2, null, 28), new whi.b(6));
                                    return Unit.f186387a;
                                case 1:
                                    com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b bVar5 = bVar3;
                                    com.revolut.kompot.navigable.vc.modal.a aVar62 = bVar5.f84759t;
                                    vec.c result = (vec.c) obj6;
                                    Intrinsics.checkNotNullParameter(result, "result");
                                    String str5 = ((ShippingContactsContract$ModalStep.ShippingContactOptions) step5).f84754a;
                                    if (result instanceof vec.b) {
                                        nec.c cVar6 = (nec.c) ((e) ((j2) bVar5.f84758s.f22677a).getValue()).f304580a.getContent();
                                        ShippingContact shippingContact2 = null;
                                        Object obj7 = null;
                                        shippingContact2 = null;
                                        if (cVar6 != null && (list = cVar6.f214428a) != null) {
                                            Iterator it8 = list.iterator();
                                            while (true) {
                                                if (it8.hasNext()) {
                                                    Object next2 = it8.next();
                                                    if (Intrinsics.f(((ShippingContact) next2).f84740a, str5)) {
                                                        obj7 = next2;
                                                    }
                                                }
                                            }
                                            shippingContact2 = (ShippingContact) obj7;
                                        }
                                        if (shippingContact2 == null) {
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                        oki.h.v2(aVar62, new ShippingContactsContract$ModalStep.EditShippingContact(shippingContact2), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
                                    } else {
                                        if (!(result instanceof vec.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.v2(aVar62, new ShippingContactsContract$ModalStep.DeleteAddressConfirmation(str5), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    }
                                    return Unit.f186387a;
                                default:
                                    dii.g result2 = (dii.g) obj6;
                                    Intrinsics.checkNotNullParameter(result2, "result");
                                    String str6 = ((ShippingContactsContract$ModalStep.DeleteAddressConfirmation) step5).f84752a;
                                    if (result2 instanceof dii.f) {
                                        com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.b bVar6 = bVar3;
                                        bVar6.n2(new c0(bVar6, str6, null, 1), new x(bVar6, 1));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block9, "block");
                    actionsBottomSheetController.H = block9;
                }
                return actionsBottomSheetController;
            case 21:
                w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                y params2 = (y) obj3;
                Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(params2, "params");
                efm.d0 d0Var = (efm.d0) ((Function1) obj5).invoke(params2);
                xg6.k kVar2 = new xg6.k(new wma.e(1, ((z) obj4).f306394c, hif.c.class, "toDomain", "toDomain(Lcom/revolut/feature/transactions/impl/data/network/dto/WarrantDto;)Lcom/revolut/feature/transactions/impl/model/Warrant;", 0, 27), 21);
                d0Var.getClass();
                ufm.i iVar3 = new ufm.i(d0Var, kVar2, 1);
                Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                return iVar3;
            case 22:
                CenteredAmountView field = (CenteredAmountView) obj3;
                KProperty[] kPropertyArr = AdjustAnalyticsController.V;
                Intrinsics.checkNotNullParameter((CenteredAmountDelegate.Model) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(field, "field");
                MaskedTextInputEditText editText = field.getEditText();
                xi0.b bVar4 = ((AdjustAnalyticsContract$InputData) obj5).f98703a.k.f115083b;
                qd0.b bVarN = ((vsi.d) ((AdjustAnalyticsController) obj4).P.getValue()).f291813b.f291808a.n();
                vc.s.j(bVarN);
                return new zp0.d(editText, bVar4, new u80.d(((s80.b) bVarN).b()), null, null, false, false, 0, false, null, 1976);
            case 23:
                g2e.a aVar7 = (g2e.a) obj4;
                y2e.i params3 = (y2e.i) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(params3, "params");
                l2e.a aVar8 = ((y2e.m) obj5).f310649a;
                params3.getClass();
                t1e.v params4 = new t1e.v(Integer.valueOf(params3.f310644a), aVar7.f139972b, aVar7.f139971a, 4);
                Intrinsics.checkNotNullParameter(params4, "params");
                w4l.h loadingStrategy = w4l.h.f294642c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                g2e.r rVar = aVar8.f191789a;
                List list = params4.f267275c;
                ArrayList arrayList = new ArrayList();
                for (Object obj6 : list) {
                    if (!((StoreMegaFilterSelection) obj6).f88544b.isEmpty()) {
                        arrayList.add(obj6);
                    }
                }
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(d0.k0(((StoreMegaFilterSelection) it8.next()).f88544b, ",", null, null, 0, new l2d.a(2), 30));
                }
                g2e.k params5 = new g2e.k(params4.f267273a, params4.f267274b, arrayList2, params4.d, 1);
                rVar.getClass();
                Intrinsics.checkNotNullParameter(params5, "params");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                String strZ = rVar.e.z();
                x4l.c cVar6 = rVar.f;
                List filters = params5.e;
                Intrinsics.checkNotNullParameter(filters, "filters");
                List quickFilterIds = params5.f;
                Intrinsics.checkNotNullParameter(quickFilterIds, "quickFilterIds");
                efm.r map2 = rd0.e.c(cVar6.b(new g2e.k(strZ, params5.f140002b, params5.f140003c, null, filters, quickFilterIds), loadingStrategy), kotlin.coroutines.g.f186406a).map(new y25.c(new y1.a(params3, 6), 2));
                Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
                return map2;
            case 24:
                com.revolut.feature_move_money.impl.flow.e eVar = (com.revolut.feature_move_money.impl.flow.e) obj5;
                ExchangeGlobalAccessOutput result = (ExchangeGlobalAccessOutput) obj3;
                Intrinsics.checkNotNullParameter((oki.g) obj2, "$this$onResult");
                Intrinsics.checkNotNullParameter(result, "result");
                MoveMoneyFlowContract$Step.ExchangeGlobalAccessModal exchangeGlobalAccessModal = (MoveMoneyFlowContract$Step.ExchangeGlobalAccessModal) ((MoveMoneyFlowContract$Step) obj4);
                MoveMoneyFlowContract$MoveMoneyProcessState moveMoneyFlowContract$MoveMoneyProcessState = exchangeGlobalAccessModal.f97356b;
                String str5 = exchangeGlobalAccessModal.f97357c;
                if (result instanceof ExchangeGlobalAccessOutput.FeatureAvailable) {
                    eVar.K2(str5, MoveMoneyFlowContract$MoveMoneyProcessState.a(moveMoneyFlowContract$MoveMoneyProcessState, null, false, null, null, 47));
                } else if (result instanceof ExchangeGlobalAccessOutput.FeatureNotAvailable) {
                    eVar.B2();
                }
                return Unit.f186387a;
            case 25:
                Data recentlyViewedData = (Data) obj2;
                Data productCellsData = (Data) obj3;
                Intrinsics.checkNotNullParameter(recentlyViewedData, "recentlyViewed");
                Intrinsics.checkNotNullParameter(productCellsData, "productCells");
                y97.b bVar5 = ((y97.e) obj5).f311759b;
                List<p97.b> fallbackProductIds = p97.d.a((GlobalSearchContext) obj4);
                Intrinsics.checkNotNullParameter(recentlyViewedData, "recentlyViewedData");
                Intrinsics.checkNotNullParameter(productCellsData, "productCellsData");
                Intrinsics.checkNotNullParameter(fallbackProductIds, "fallbackProductIds");
                boolean z4 = (recentlyViewedData.getContent() == null && recentlyViewedData.getError() == null && recentlyViewedData.getLoading()) || (productCellsData.getContent() == null && productCellsData.getError() == null);
                if (z4) {
                    ArrayList arrayList3 = new ArrayList(4);
                    for (int i22 = 4; i3 < i22; i22 = 4) {
                        arrayList3.add(new ep(a0.d.n("INVEST_SUGGESTION_ITEM_ID_LOADING_", i3)));
                        i3++;
                    }
                    xk xkVar = new xk("INVEST_SUGGESTION_ITEM_ID", arrayList3, null, null, null, 60);
                    yp0.b.l(xkVar, 0, 0, 0, 0, null, false, 63);
                    listC = zhm.u.c(xkVar);
                } else {
                    mih.a aVar9 = (mih.a) recentlyViewedData.getContent();
                    List list2 = aVar9 != null ? aVar9.f205847a : null;
                    if (list2 == null) {
                        list2 = f0.f322471a;
                    }
                    List<vel.f> listV0 = d0.V0(list2, 3);
                    ArrayList arrayList4 = new ArrayList(zhm.w.t(listV0, 10));
                    for (vel.f performanceAsset : listV0) {
                        jbh.e eVar2 = bVar5.f311756a;
                        String strS = a0.d.s("INVEST_SUGGESTION_ASSET_", performanceAsset.b().f288358b.name(), "_", performanceAsset.b().f288357a);
                        o97.r rVar2 = o97.r.SUGGESTIONS_INVEST;
                        o97.y parcel = new o97.y(rVar2, performanceAsset, null, 60);
                        AnalyticsContext analyticsContext = new AnalyticsContext(o97.h.a(rVar2, performanceAsset.c()));
                        Intrinsics.checkNotNullParameter(performanceAsset, "performanceAsset");
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        if (strS == null) {
                            strS = jbh.e.c(performanceAsset);
                        }
                        arrayList4.add(new IconDelegate.Model(strS, new RoundedRectImage(jbh.c.a(performanceAsset), 36.0f, 12.0f, 14.0f, new Color.ModifiedColor(new Color.Solid(R$attr.uikit_colorAccentNeutral), 0.1f)), eVar2.e(performanceAsset), null, null, null, parcel, analyticsContext, 192));
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (p97.b bVar6 : fallbackProductIds) {
                        Iterable iterable = (List) productCellsData.getContent();
                        if (iterable == null) {
                            iterable = f0.f322471a;
                        }
                        Iterator it9 = iterable.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                next = it9.next();
                                if (Intrinsics.f(((p97.a) next).f234280a, bVar6)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        p97.a aVar10 = (p97.a) next;
                        if (aVar10 != null) {
                            arrayList5.add(aVar10);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                    Iterator it10 = arrayList5.iterator();
                    while (it10.hasNext()) {
                        arrayList6.add(w97.a.a((p97.a) it10.next(), o97.r.SUGGESTIONS_INVEST));
                    }
                    List listV02 = d0.V0(d0.E0(arrayList6, arrayList4), 4);
                    if (listV02.isEmpty()) {
                        listC = f0.f322471a;
                    } else {
                        xk xkVar2 = new xk("INVEST_SUGGESTION_ITEM_ID", listV02, null, null, null, 60);
                        yp0.b.l(xkVar2, 0, 0, 0, 0, null, false, 63);
                        listC = zhm.u.c(xkVar2);
                    }
                }
                return new Data(zhm.u.c(new e0(listC)), null, z4, 2, null);
            case 26:
                PixQrRequestContract$InputData pixQrRequestContract$InputData = (PixQrRequestContract$InputData) obj5;
                final com.revolut.feature.pix.impl.flow.qr_request.a aVar11 = (com.revolut.feature.pix.impl.flow.qr_request.a) obj4;
                qki.d dVar2 = aVar11.o;
                final yki.l FlowCoordinator3 = (yki.l) obj2;
                PixQrRequestContract$Step step6 = (PixQrRequestContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step6, "step");
                if (step6 instanceof PixQrRequestContract$Step.RegisterNewAlias) {
                    AliasRegistrationFlow aliasRegistrationFlow = new AliasRegistrationFlow(new AliasRegistrationContract$InputData(pixQrRequestContract$InputData.f80710a, null));
                    Function1 block10 = new Function1() { // from class: yba.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i3) {
                                case 0:
                                    com.revolut.feature.pix.impl.flow.qr_request.a aVar12 = aVar11;
                                    qki.d dVar3 = aVar12.o;
                                    e output4 = (e) obj7;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    boolean z6 = output4 instanceof y8a.b;
                                    l lVar = FlowCoordinator3;
                                    if (z6) {
                                        aVar12.I2(((y8a.b) output4).f311642a, ((PixQrRequestContract$State) ((j2) dVar3.f22677a).getValue()).f80714b, ((PixQrRequestContract$State) ((j2) dVar3.f22677a).getValue()).f80715c);
                                        h.t2(aVar12, lVar, PixQrRequestContract$Step.RequestViaQR.f80720a, false, null, false, 12);
                                    } else {
                                        h.D2(lVar);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    m output5 = (m) obj7;
                                    Intrinsics.checkNotNullParameter(output5, "output");
                                    boolean z11 = output5 instanceof j;
                                    l lVar2 = FlowCoordinator3;
                                    if (z11) {
                                        h.t2(aVar11, lVar2, PixQrRequestContract$Step.AddAmount.f80716a, true, null, false, 12);
                                    } else if (output5 instanceof k) {
                                        h.w2(lVar2, PixQrRequestContract$Step.AddDescription.f80717a, ModalDestination.Style.POPUP.f98311a);
                                    } else {
                                        if (!(output5 instanceof dca.l)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.w2(lVar2, PixQrRequestContract$Step.ChangeKey.f80718a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    g output6 = (g) obj7;
                                    Intrinsics.checkNotNullParameter(output6, "output");
                                    dj0.d dVar4 = output6.f320858a;
                                    String str6 = output6.f320859b;
                                    com.revolut.feature.pix.impl.flow.qr_request.a aVar13 = aVar11;
                                    com.revolut.feature.pix.impl.flow.qr_request.a.J2(aVar13, null, dVar4, str6, 1);
                                    FlowCoordinator3.e(true);
                                    aVar13.X1(new f("SHOT_DIALOG_ID_SUCCESS", new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_qr_request_popup_amount_added, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, LDSFile.EF_DG12_TAG));
                                    return Unit.f186387a;
                                default:
                                    bca.f output7 = (bca.f) obj7;
                                    Intrinsics.checkNotNullParameter(output7, "output");
                                    String str7 = output7.f14412a;
                                    com.revolut.feature.pix.impl.flow.qr_request.a aVar14 = aVar11;
                                    com.revolut.feature.pix.impl.flow.qr_request.a.J2(aVar14, null, null, str7, 3);
                                    FlowCoordinator3.e(true);
                                    aVar14.X1(new mii.k("SHOT_DIALOG_ID_SUCCESS", new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_qr_request_popup_description_added, null, null, 14), null, null, null, 28));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block10, "block");
                    aliasRegistrationFlow.H = block10;
                    return aliasRegistrationFlow;
                }
                if (step6 instanceof PixQrRequestContract$Step.RequestViaQR) {
                    PixQrRequestScreen pixQrRequestScreen = new PixQrRequestScreen(aVar11.f80721p);
                    final int i32 = 1;
                    Function1 block11 = new Function1() { // from class: yba.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i32) {
                                case 0:
                                    com.revolut.feature.pix.impl.flow.qr_request.a aVar12 = aVar11;
                                    qki.d dVar3 = aVar12.o;
                                    e output4 = (e) obj7;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    boolean z6 = output4 instanceof y8a.b;
                                    l lVar = FlowCoordinator3;
                                    if (z6) {
                                        aVar12.I2(((y8a.b) output4).f311642a, ((PixQrRequestContract$State) ((j2) dVar3.f22677a).getValue()).f80714b, ((PixQrRequestContract$State) ((j2) dVar3.f22677a).getValue()).f80715c);
                                        h.t2(aVar12, lVar, PixQrRequestContract$Step.RequestViaQR.f80720a, false, null, false, 12);
                                    } else {
                                        h.D2(lVar);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    m output5 = (m) obj7;
                                    Intrinsics.checkNotNullParameter(output5, "output");
                                    boolean z11 = output5 instanceof j;
                                    l lVar2 = FlowCoordinator3;
                                    if (z11) {
                                        h.t2(aVar11, lVar2, PixQrRequestContract$Step.AddAmount.f80716a, true, null, false, 12);
                                    } else if (output5 instanceof k) {
                                        h.w2(lVar2, PixQrRequestContract$Step.AddDescription.f80717a, ModalDestination.Style.POPUP.f98311a);
                                    } else {
                                        if (!(output5 instanceof dca.l)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.w2(lVar2, PixQrRequestContract$Step.ChangeKey.f80718a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    g output6 = (g) obj7;
                                    Intrinsics.checkNotNullParameter(output6, "output");
                                    dj0.d dVar4 = output6.f320858a;
                                    String str6 = output6.f320859b;
                                    com.revolut.feature.pix.impl.flow.qr_request.a aVar13 = aVar11;
                                    com.revolut.feature.pix.impl.flow.qr_request.a.J2(aVar13, null, dVar4, str6, 1);
                                    FlowCoordinator3.e(true);
                                    aVar13.X1(new f("SHOT_DIALOG_ID_SUCCESS", new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_qr_request_popup_amount_added, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, LDSFile.EF_DG12_TAG));
                                    return Unit.f186387a;
                                default:
                                    bca.f output7 = (bca.f) obj7;
                                    Intrinsics.checkNotNullParameter(output7, "output");
                                    String str7 = output7.f14412a;
                                    com.revolut.feature.pix.impl.flow.qr_request.a aVar14 = aVar11;
                                    com.revolut.feature.pix.impl.flow.qr_request.a.J2(aVar14, null, null, str7, 3);
                                    FlowCoordinator3.e(true);
                                    aVar14.X1(new mii.k("SHOT_DIALOG_ID_SUCCESS", new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_qr_request_popup_description_added, null, null, 14), null, null, null, 28));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block11, "block");
                    pixQrRequestScreen.H = block11;
                    return pixQrRequestScreen;
                }
                if (step6 instanceof PixQrRequestContract$Step.AddAmount) {
                    PixQrRequestAddAmountScreen pixQrRequestAddAmountScreen = new PixQrRequestAddAmountScreen(new PixQrRequestAddAmountScreenContract$InputData(((PixQrRequestContract$State) ((j2) dVar2.f22677a).getValue()).f80714b, ((PixQrRequestContract$State) ((j2) dVar2.f22677a).getValue()).f80715c));
                    final int i33 = 2;
                    Function1 block12 = new Function1() { // from class: yba.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i33) {
                                case 0:
                                    com.revolut.feature.pix.impl.flow.qr_request.a aVar12 = aVar11;
                                    qki.d dVar3 = aVar12.o;
                                    e output4 = (e) obj7;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    boolean z6 = output4 instanceof y8a.b;
                                    l lVar = FlowCoordinator3;
                                    if (z6) {
                                        aVar12.I2(((y8a.b) output4).f311642a, ((PixQrRequestContract$State) ((j2) dVar3.f22677a).getValue()).f80714b, ((PixQrRequestContract$State) ((j2) dVar3.f22677a).getValue()).f80715c);
                                        h.t2(aVar12, lVar, PixQrRequestContract$Step.RequestViaQR.f80720a, false, null, false, 12);
                                    } else {
                                        h.D2(lVar);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    m output5 = (m) obj7;
                                    Intrinsics.checkNotNullParameter(output5, "output");
                                    boolean z11 = output5 instanceof j;
                                    l lVar2 = FlowCoordinator3;
                                    if (z11) {
                                        h.t2(aVar11, lVar2, PixQrRequestContract$Step.AddAmount.f80716a, true, null, false, 12);
                                    } else if (output5 instanceof k) {
                                        h.w2(lVar2, PixQrRequestContract$Step.AddDescription.f80717a, ModalDestination.Style.POPUP.f98311a);
                                    } else {
                                        if (!(output5 instanceof dca.l)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.w2(lVar2, PixQrRequestContract$Step.ChangeKey.f80718a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    g output6 = (g) obj7;
                                    Intrinsics.checkNotNullParameter(output6, "output");
                                    dj0.d dVar4 = output6.f320858a;
                                    String str6 = output6.f320859b;
                                    com.revolut.feature.pix.impl.flow.qr_request.a aVar13 = aVar11;
                                    com.revolut.feature.pix.impl.flow.qr_request.a.J2(aVar13, null, dVar4, str6, 1);
                                    FlowCoordinator3.e(true);
                                    aVar13.X1(new f("SHOT_DIALOG_ID_SUCCESS", new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_qr_request_popup_amount_added, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, LDSFile.EF_DG12_TAG));
                                    return Unit.f186387a;
                                default:
                                    bca.f output7 = (bca.f) obj7;
                                    Intrinsics.checkNotNullParameter(output7, "output");
                                    String str7 = output7.f14412a;
                                    com.revolut.feature.pix.impl.flow.qr_request.a aVar14 = aVar11;
                                    com.revolut.feature.pix.impl.flow.qr_request.a.J2(aVar14, null, null, str7, 3);
                                    FlowCoordinator3.e(true);
                                    aVar14.X1(new mii.k("SHOT_DIALOG_ID_SUCCESS", new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_qr_request_popup_description_added, null, null, 14), null, null, null, 28));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block12, "block");
                    pixQrRequestAddAmountScreen.H = block12;
                    return pixQrRequestAddAmountScreen;
                }
                if (step6 instanceof PixQrRequestContract$Step.AddDescription) {
                    PixQrRequestAddDescriptionScreen pixQrRequestAddDescriptionScreen = new PixQrRequestAddDescriptionScreen(new PixQrRequestAddDescriptionScreenContract$InputData(((PixQrRequestContract$State) ((j2) dVar2.f22677a).getValue()).f80715c));
                    final int i43 = 3;
                    Function1 block13 = new Function1() { // from class: yba.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            switch (i43) {
                                case 0:
                                    com.revolut.feature.pix.impl.flow.qr_request.a aVar12 = aVar11;
                                    qki.d dVar3 = aVar12.o;
                                    e output4 = (e) obj7;
                                    Intrinsics.checkNotNullParameter(output4, "output");
                                    boolean z6 = output4 instanceof y8a.b;
                                    l lVar = FlowCoordinator3;
                                    if (z6) {
                                        aVar12.I2(((y8a.b) output4).f311642a, ((PixQrRequestContract$State) ((j2) dVar3.f22677a).getValue()).f80714b, ((PixQrRequestContract$State) ((j2) dVar3.f22677a).getValue()).f80715c);
                                        h.t2(aVar12, lVar, PixQrRequestContract$Step.RequestViaQR.f80720a, false, null, false, 12);
                                    } else {
                                        h.D2(lVar);
                                    }
                                    return Unit.f186387a;
                                case 1:
                                    m output5 = (m) obj7;
                                    Intrinsics.checkNotNullParameter(output5, "output");
                                    boolean z11 = output5 instanceof j;
                                    l lVar2 = FlowCoordinator3;
                                    if (z11) {
                                        h.t2(aVar11, lVar2, PixQrRequestContract$Step.AddAmount.f80716a, true, null, false, 12);
                                    } else if (output5 instanceof k) {
                                        h.w2(lVar2, PixQrRequestContract$Step.AddDescription.f80717a, ModalDestination.Style.POPUP.f98311a);
                                    } else {
                                        if (!(output5 instanceof dca.l)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        h.w2(lVar2, PixQrRequestContract$Step.ChangeKey.f80718a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                    }
                                    return Unit.f186387a;
                                case 2:
                                    g output6 = (g) obj7;
                                    Intrinsics.checkNotNullParameter(output6, "output");
                                    dj0.d dVar4 = output6.f320858a;
                                    String str6 = output6.f320859b;
                                    com.revolut.feature.pix.impl.flow.qr_request.a aVar13 = aVar11;
                                    com.revolut.feature.pix.impl.flow.qr_request.a.J2(aVar13, null, dVar4, str6, 1);
                                    FlowCoordinator3.e(true);
                                    aVar13.X1(new f("SHOT_DIALOG_ID_SUCCESS", new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_qr_request_popup_amount_added, null, null, 14), null, new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, LDSFile.EF_DG12_TAG));
                                    return Unit.f186387a;
                                default:
                                    bca.f output7 = (bca.f) obj7;
                                    Intrinsics.checkNotNullParameter(output7, "output");
                                    String str7 = output7.f14412a;
                                    com.revolut.feature.pix.impl.flow.qr_request.a aVar14 = aVar11;
                                    com.revolut.feature.pix.impl.flow.qr_request.a.J2(aVar14, null, null, str7, 3);
                                    FlowCoordinator3.e(true);
                                    aVar14.X1(new mii.k("SHOT_DIALOG_ID_SUCCESS", new TextLocalisedClause(com.revolut.feature.pix.impl.R$string.pix_qr_request_popup_description_added, null, null, 14), null, null, null, 28));
                                    return Unit.f186387a;
                            }
                        }
                    };
                    Intrinsics.checkNotNullParameter(block13, "block");
                    pixQrRequestAddDescriptionScreen.H = block13;
                    return pixQrRequestAddDescriptionScreen;
                }
                if (!(step6 instanceof PixQrRequestContract$Step.ChangeKey)) {
                    throw new NoWhenBranchMatchedException();
                }
                MyAliasesScreen myAliasesScreen = new MyAliasesScreen(new MyAliasesScreenContract$InputData(false, ((PixQrRequestContract$State) ((j2) dVar2.f22677a).getValue()).f80713a));
                y8a.h block14 = new y8a.h(aVar11, 16);
                Intrinsics.checkNotNullParameter(block14, "block");
                myAliasesScreen.H = block14;
                return myAliasesScreen;
            case 27:
                yc0.j jVar = (yc0.j) obj5;
                BottomPromptScreen bottomPromptScreen = (BottomPromptScreen) obj4;
                Function1 getDefaultErrorItems3 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems3, "getDefaultErrorItems");
                List list3 = (List) getDefaultErrorItems3.invoke(new iii.d(12, null, true, true, null));
                rp0.t tVarA = jVar.a(bottomPromptScreen);
                rp0.l lVar = rp0.l.WINDOW;
                yc0.g gVar2 = jVar.f312428c;
                return new rp0.y(list3, tVarA, lVar, null, null, null, null, gVar2.f312422a.getR(), new AnalyticsContext(gVar2.a(bottomPromptScreen)), null, 2296);
            case 28:
                com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.f fVar = (com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.f) obj5;
                yv2.f fVar2 = (yv2.f) obj4;
                Function1 getDefaultErrorItems4 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems4, "getDefaultErrorItems");
                return new yv2.i((List) getDefaultErrorItems4.invoke(new iii.d(12, null, false, true, null)), null, fVar.g(fVar2), fVar.f(fVar2), null, false, false, 498);
            default:
                return ComposerImplKt.deactivateCurrentGroup$lambda$0((RememberManager) obj5, (SlotWriter) obj4, ((Integer) obj2).intValue(), obj3);
        }
    }

    public /* synthetic */ p(veh.n nVar, Data data, Data data2) {
        this.f276869a = 11;
        this.f276870b = data;
        this.f276871c = data2;
    }
}

package a83;

import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuUiKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider_androidKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$InputData;
import com.revolut.feature.address.common.api.flow.FieldMode;
import com.revolut.feature.backgroundpicker.api.model.ChosenBackground;
import com.revolut.feature.card_screen.impl.kompot.cards_list.screen.expiring_cards_bottom_sheet.ExpiringCardsBottomSheetScreen;
import com.revolut.feature.credit.application.plugins.api.models.config.DocumentViewerScreenConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$OfferUpdateContext;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.a;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.bridge.CryptoSendDualChooserBridgeContract$Step;
import com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.BrazilInboundMandatePreviewScreenContract$EditableFieldClickPayload;
import com.revolut.feature.retail.cfd.api.navigation.CfdTradingDescriptor$Withdraw;
import com.revolut.feature.revolut_shop.api.R$string;
import com.revolut.feature.tickets.api.models.TicketDetails;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.feature.wealth.api.declaration.WithdrawFeatureDescriptor;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.feature.wealth.ui.impl.actions.handler.WealthTransferFlowControllerFactory$Descriptor;
import com.revolut.feature.wealth.ui.impl.actions.handler.WealthTransferFlowControllerFactory$Step;
import com.revolut.feature.wealth.ui.impl.transfer_picker.WealthTransferPickerController;
import com.revolut.feature.wealth.ui.impl.transfer_picker.WealthTransferPickerControllerContract$Output;
import com.revolut.kompot.navigable.ModalTransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.balance.picker.api.navigation.DualChooserContract$InputData;
import com.revolut.retail.feature.freelancer.revolut_shop.impl.ui.flow.RevolutShopAddressFlowContract$InputData;
import com.revolut.retail.feature.freelancer.revolut_shop.impl.ui.flow.RevolutShopAddressFlowContract$Step;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.youTransactor.uCube.rpc.Constants;
import java.time.Instant;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.channels.ProducerScope;
import tof.a3;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class z implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2101c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3, swb.k kVar) {
        this.f2099a = 16;
        this.f2100b = textLocalisedClause;
        this.f2101c = textLocalisedClause2;
        this.d = textLocalisedClause3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ?? r92;
        op0.q qVar;
        op0.q qVar2;
        boolean z;
        wjh.a aVar;
        wjh.a aVar2;
        Object rVar;
        aii.e eVarA;
        aii.e eVarA2;
        aii.e eVarA3;
        aii.e eVarA4;
        int i = this.f2099a;
        int i2 = 4;
        boolean z3 = true;
        int i3 = 0;
        Object obj4 = this.d;
        Object obj5 = this.f2101c;
        Object obj6 = this.f2100b;
        switch (i) {
            case 0:
                ExpiringCardsBottomSheetScreen expiringCardsBottomSheetScreen = (ExpiringCardsBottomSheetScreen) obj5;
                com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a aVar3 = (com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a) obj4;
                d83.c result = (d83.c) obj3;
                Intrinsics.checkNotNullParameter((oki.g) obj2, "$this$onResult");
                Intrinsics.checkNotNullParameter(result, "result");
                ((Ref$BooleanRef) obj6).f186407a = true;
                if (result instanceof d83.a) {
                    expiringCardsBottomSheetScreen.l2(new a07.b(aVar3, result, 15));
                } else {
                    if (!(result instanceof d83.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    expiringCardsBottomSheetScreen.l2(new b0(aVar3, 0));
                }
                return Unit.f186387a;
            case 1:
                return ContextMenuUiKt.ContextMenuPopup$lambda$1((Modifier) obj6, (ContextMenuColors) obj5, (Function1) obj4, (Composer) obj2, ((Integer) obj3).intValue());
            case 2:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                ChosenBackground chosenBackground = (ChosenBackground) ((Data) obj5).getContent();
                ((fme.i) obj6).getClass();
                return fme.i.a(chosenBackground, (ld6.b) obj4);
            case 3:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                ((fme.i) obj6).getClass();
                return fme.i.a((ChosenBackground) obj5, (ld6.b) obj4);
            case 4:
                kwg.l lVar = (kwg.l) obj6;
                eel.c timeSpan = (eel.c) obj5;
                String userId = (String) obj2;
                xi0.b currency = (xi0.b) obj3;
                Intrinsics.checkNotNullParameter(userId, "userId");
                Intrinsics.checkNotNullParameter(currency, "currency");
                wvg.s sVar = lVar.f190356g;
                List analyticsProductTypes = lVar.f190363q.b((WidgetisedAnalyticsType) obj4);
                Instant to6 = ((l80.f) lVar.f190360m).b();
                sVar.getClass();
                Intrinsics.checkNotNullParameter(userId, "userId");
                Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
                Intrinsics.checkNotNullParameter(analyticsProductTypes, "analyticsProductTypes");
                Intrinsics.checkNotNullParameter(currency, "currency");
                Intrinsics.checkNotNullParameter(to6, "to");
                w4l.i loadingStrategy = w4l.i.f294643c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return sVar.d.b(new wvg.r(userId, analyticsProductTypes, timeSpan, to6, currency), loadingStrategy);
            case 5:
                m3j.h hVar = (m3j.h) obj6;
                String str = (String) obj4;
                String fieldKey = (String) obj2;
                String fieldValue = (String) obj3;
                Intrinsics.checkNotNullParameter(fieldKey, "fieldKey");
                Intrinsics.checkNotNullParameter(fieldValue, "fieldValue");
                String strE = hVar.e(((f5j.a) obj5).f132335l, fieldKey);
                String strB = hVar.f202576c.b(fieldKey, fieldValue);
                if (strE.length() == 0 || strB.length() == 0) {
                    return null;
                }
                CellDetailsActionDelegate.Model model = new CellDetailsActionDelegate.Model("ID_EXTRAS_BENEFICIARY_FIELD".concat(fieldKey), new TextClause(strE, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, false, false, null, null, 0, 0, 32736);
                String strConcat = "ID_EXTRAS_BENEFICIARY_FIELD_VALUE".concat(fieldKey);
                TextClause textClause = new TextClause(strB, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                return zhm.v.k(model, new CellDetailsStandaloneNoteDelegate.Model(strConcat, null, (!fieldKey.equals("IBAN") || str == null) ? textClause : new CompositeClause(zhm.v.k(textClause, new TextClause(str, (Style) new Custom(new Custom.Color.Solid(R$attr.uikit_colorGreyTone50), false, false, 254), (Integer) null, false, (o9) null, (List) null, 124)), new TextClause(m70.a.o(kotlin.jvm.internal.t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, null, false, null, 0, 0, 2042));
            case 6:
                com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g gVar = (com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g) obj6;
                mf4.e eVar = gVar.f68151q;
                OfferV2FlowContract$OfferUpdateContext offerV2FlowContract$OfferUpdateContext = (OfferV2FlowContract$OfferUpdateContext) obj5;
                String str2 = (String) obj4;
                oki.g onResult = (oki.g) obj2;
                com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.a outputData = (com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.calculator.a) obj3;
                Intrinsics.checkNotNullParameter(onResult, "$this$onResult");
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                int i5 = 26;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                if (outputData instanceof a.b) {
                    gVar.l2(new lr.l((Object) gVar, (Object) offerV2FlowContract$OfferUpdateContext, (Object) onResult, (Continuation) (objArr2 == true ? 1 : 0), 19), new yi5.b(i5));
                } else if (outputData instanceof a.C0474a) {
                    OfferV2FlowContract$InputData.Config config = gVar.f68150p.f68089a;
                    OfferV2FlowContract$InputData.Config.Intro intro = config instanceof OfferV2FlowContract$InputData.Config.Intro ? (OfferV2FlowContract$InputData.Config.Intro) config : null;
                    if ((intro != null ? intro.f68092a : null) == hs3.l0.CALCULATOR) {
                        c84.t.J2(gVar, false, null, null, 7);
                    } else {
                        ((mf4.a0) eVar).f204836g = null;
                        onResult.pop();
                    }
                } else if (outputData instanceof nf4.f) {
                    gVar.l2(new lr.l((Object) gVar, (Object) outputData, (Object) str2, (Continuation) (objArr == true ? 1 : 0), 20), new yi5.b(i5));
                } else if (outputData instanceof nf4.h) {
                    int i6 = jli.h.f175850a;
                } else if (outputData instanceof nf4.i) {
                    gVar.K2(((nf4.i) outputData).f214812a);
                } else {
                    if (!(outputData instanceof nf4.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cv3.b0 b0Var = ((mf4.a0) eVar).f204836g;
                    cv3.d0 d0Var = b0Var != null ? b0Var.f109237a : null;
                    nf4.g gVar2 = (nf4.g) outputData;
                    String documentId = gVar2.f214808a;
                    su3.a document = gVar2.f214809b;
                    DocumentViewerScreenConfig screenConfig = gVar2.f214810c;
                    Intrinsics.checkNotNullParameter(documentId, "documentId");
                    Intrinsics.checkNotNullParameter(document, "document");
                    Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
                    Long l2 = d0Var != null ? d0Var.f109249a : null;
                    Long l3 = d0Var != null ? d0Var.f109250b : null;
                    Intrinsics.checkNotNullParameter(document, "<this>");
                    su3.a document2 = su3.a.a(document, do3.q.d(document.f265635a, l2, l3), do3.q.d(document.f265636b, l2, l3), 60);
                    Intrinsics.checkNotNullParameter(documentId, "documentId");
                    Intrinsics.checkNotNullParameter(document2, "document");
                    Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
                    gVar.R2(new mf4.c0(documentId, document2, screenConfig));
                }
                return Unit.f186387a;
            case 7:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                zhm.f0 f0Var = zhm.f0.f322471a;
                return ((oce.e) obj6).b(f0Var, f0Var, (a3) obj5, (k71.q) obj4);
            case 8:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                zhm.f0 f0Var2 = zhm.f0.f322471a;
                return ((oce.h) obj6).b(f0Var2, f0Var2, obj5, (k71.q) obj4);
            case 9:
                oi0.b bVar = (oi0.b) obj6;
                xg0.o oVar = new xg0.o((String) obj3, (Exception) obj2);
                bVar.d.k(new xg0.e((Set) obj5, oVar));
                oi0.b.a(bVar, (ProducerScope) obj4, oVar);
                return Unit.f186387a;
            case 10:
                return AndroidTextContextMenuToolbarProvider_androidKt.ProvidePlatformTextContextMenuToolbar$lambda$5((Modifier) obj6, (MutableState) obj5, (Function2) obj4, (Composer) obj2, ((Integer) obj3).intValue());
            case 11:
                ph4.c cVar = (ph4.c) obj5;
                AtomicReference atomicReference = (AtomicReference) obj4;
                oki.g onResult2 = (oki.g) obj2;
                aii.r output = (aii.r) obj3;
                Intrinsics.checkNotNullParameter(onResult2, "$this$onResult");
                Intrinsics.checkNotNullParameter(output, "output");
                if (((Boolean) ((pfk.h0) obj6).invoke(output)).booleanValue()) {
                    cVar.invoke(output);
                } else {
                    atomicReference.set(output);
                    onResult2.pop();
                }
                return Unit.f186387a;
            case 12:
                com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.bridge.a aVar4 = (com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.bridge.a) obj6;
                DualChooserContract$InputData dualChooserContract$InputData = (DualChooserContract$InputData) obj5;
                pp5.a aVar5 = (pp5.a) obj4;
                yki.l FlowCoordinator = (yki.l) obj2;
                CryptoSendDualChooserBridgeContract$Step step = (CryptoSendDualChooserBridgeContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (!(step instanceof CryptoSendDualChooserBridgeContract$Step.DualChooser)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE1 = aVar4.e1(new l1j.d(dualChooserContract$InputData, aVar5));
                pp5.d block = new pp5.d(aVar4, i3);
                Intrinsics.checkNotNullParameter(block, "block");
                viewControllerE1.H = block;
                return viewControllerE1;
            case 13:
                com.revolut.retail.feature.freelancer.revolut_shop.impl.ui.flow.a aVar6 = (com.revolut.retail.feature.freelancer.revolut_shop.impl.ui.flow.a) obj6;
                RevolutShopAddressFlowContract$InputData revolutShopAddressFlowContract$InputData = (RevolutShopAddressFlowContract$InputData) obj5;
                vh1.d dVar = (vh1.d) obj4;
                yki.l FlowCoordinator2 = (yki.l) obj2;
                RevolutShopAddressFlowContract$Step step2 = (RevolutShopAddressFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator2, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (!(step2 instanceof RevolutShopAddressFlowContract$Step.AddressPicker)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewController viewControllerE12 = aVar6.e1(new th1.a(new AddressFlowContract$InputData(revolutShopAddressFlowContract$InputData.f101492a, new TextLocalisedClause(R$string.revolut_shop_flow_checkout_screen_add_address_title, null, null, 14), null, false, new TextLocalisedClause(R$string.revolut_shop_flow_checkout_screen_add_address_button_title, null, null, 14), FieldMode.NotEditable.f60955a, null, null, false, null, 2096940), dVar, null, 4));
                pp5.d block2 = new pp5.d(aVar6, 6);
                Intrinsics.checkNotNullParameter(block2, "block");
                viewControllerE12.H = block2;
                return viewControllerE12;
            case 14:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                zhm.f0 f0Var3 = zhm.f0.f322471a;
                return ((qce.t0) obj6).b(f0Var3, f0Var3, (qua.p) obj5, (k71.q) obj4);
            case 15:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return ((rd3.j) obj6).j((od3.l) obj5, (Clause) obj4);
            case 16:
                Function1 defaultErrorItemsProvider = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItemsProvider, "defaultErrorItemsProvider");
                return new swb.i((TextLocalisedClause) obj6, (TextLocalisedClause) obj5, (TextLocalisedClause) obj4, (List) defaultErrorItemsProvider.invoke(new iii.d(12, null, false, true, null)), false);
            case 17:
                Map map = (Map) obj5;
                Map map2 = (Map) obj4;
                String listId = (String) obj2;
                so6.f item = (so6.f) obj3;
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(item, "item");
                ne6.b bVar2 = ((com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.c) obj6).f72615a;
                so6.d dVar2 = item.f264799c;
                if (dVar2 == null) {
                    return ((hj6.a) bVar2).g(listId, item.f264797a, item.f264798b);
                }
                if (dVar2 instanceof so6.c) {
                    so6.c cVar2 = (so6.c) dVar2;
                    String str3 = cVar2.f264792a;
                    dj0.d dVar3 = map.containsKey(str3) ? (dj0.d) map.get(str3) : cVar2.f264793b;
                    String str4 = item.f264797a;
                    return ((hj6.a) bVar2).c(listId, str3, str4, dVar3, new BrazilInboundMandatePreviewScreenContract$EditableFieldClickPayload.MoneyField(dVar3, str3, str4));
                }
                if (!(dVar2 instanceof so6.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                so6.b bVar3 = (so6.b) dVar2;
                String str5 = bVar3.f264790a;
                LocalDate localDate = map2.containsKey(str5) ? (LocalDate) map2.get(str5) : bVar3.f264791b;
                String str6 = item.f264797a;
                return ((hj6.a) bVar2).b(listId, str5, str6, localDate, new BrazilInboundMandatePreviewScreenContract$EditableFieldClickPayload.DateField(str5, str6, localDate));
            case 18:
                return ButtonKt.Button$lambda$3((State) obj6, (PaddingValues) obj5, (Function3) obj4, (Composer) obj2, ((Integer) obj3).intValue());
            case 19:
                v88.c cVar3 = (v88.c) obj6;
                String id10 = (String) obj5;
                String widgetType = (String) obj4;
                Throwable noSuchElementException = (Throwable) obj3;
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                if (noSuchElementException == null) {
                    noSuchElementException = new NoSuchElementException("Could not build junior total wealth");
                }
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.c cVar4 = rd0.c.ERROR;
                rd0.d.a(cVar4, null, null, noSuchElementException, h0Var);
                ((x88.f) cVar3.f286723h).getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(widgetType, "widgetType");
                if (Intrinsics.f(widgetType, "TotalWealthList")) {
                    qVar2 = op0.q.LARGE;
                } else {
                    if (!Intrinsics.f(widgetType, "TotalWealthListSmall")) {
                        r92 = 0;
                        rd0.d.a(cVar4, null, null, new IllegalArgumentException(j6.a.q("Unexpected widget type = ", widgetType)), h0Var);
                        qVar = op0.q.LARGE;
                        return new ErrorWidgetDelegate.Model(id10, null, new TextLocalisedClause(com.revolut.feature.junior.accounts.impl.R$string.junior_widgets_total_wealth_error_title, r92, r92, 14), new TextLocalisedClause(com.revolut.feature.junior.accounts.impl.R$string.junior_widgets_total_wealth_error_description, r92, r92, 14), qVar, null, null, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
                    }
                    qVar2 = op0.q.SMALL;
                }
                qVar = qVar2;
                r92 = 0;
                return new ErrorWidgetDelegate.Model(id10, null, new TextLocalisedClause(com.revolut.feature.junior.accounts.impl.R$string.junior_widgets_total_wealth_error_title, r92, r92, 14), new TextLocalisedClause(com.revolut.feature.junior.accounts.impl.R$string.junior_widgets_total_wealth_error_description, r92, r92, 14), qVar, null, null, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
            case 20:
                vjh.e eVar2 = (vjh.e) obj6;
                WealthAccount account = (WealthAccount) obj5;
                Throwable th10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                TradingLegalEntityInformation tradingLegalEntityInformation = ((dih.b) obj4).f115061b;
                eVar2.getClass();
                if (th10 == null || (((z = account instanceof WealthAccount.Robo)) && ((jte.d) eVar2.f).c(WealthUiApi$Toggles.RoboStrategies.f95863c))) {
                    return zhm.f0.f322471a;
                }
                boolean z4 = account instanceof WealthAccount.Commodities;
                if (z4) {
                    kjh.b bVar4 = (kjh.b) eVar2.f289749c;
                    bVar4.getClass();
                    aVar2 = new wjh.a(new TextLocalisedClause(com.revolut.feature.wealth.ui.impl.R$string.wealth_invest_home_portfolio_commodity_header_title, null, null, 14), (Image) bVar4.f184409c.getValue());
                } else if (account instanceof WealthAccount.Margin) {
                    mjh.g gVar3 = (mjh.g) ((mjh.i) eVar2.d).f206048a;
                    gVar3.getClass();
                    aVar2 = new wjh.a(new TextLocalisedClause(com.revolut.feature.wealth.ui.impl.R$string.wealth_invest_home_portfolio_cfds_header_title, null, null, 14), (Image) gVar3.f206047a.getValue());
                } else if (z) {
                    njh.e eVar3 = (njh.e) eVar2.f289748b;
                    aVar2 = new wjh.a(new TextLocalisedClause(((jte.d) eVar3.d).c(WealthUiApi$Toggles.RoboStrategies.f95863c) ? com.revolut.feature.wealth.ui.impl.R$string.wealth_invest_home_portfolio_strategies_header_title : com.revolut.feature.wealth.ui.impl.R$string.wealth_invest_home_portfolio_robo_header_title, null, null, 14), eVar3.a());
                } else {
                    if (account instanceof WealthAccount.Securities) {
                        ojh.c cVar5 = (ojh.c) eVar2.f289747a;
                        cVar5.getClass();
                        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
                        Intrinsics.checkNotNullParameter(account, "account");
                        aVar = new wjh.a(cVar5.b(tradingLegalEntityInformation, account), cVar5.a(account));
                    } else {
                        if (!(account instanceof WealthAccount.TaxAdvantageWealthAccount)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        WealthAccount.TaxAdvantageWealthAccount account2 = (WealthAccount.TaxAdvantageWealthAccount) account;
                        rjh.b bVar5 = (rjh.b) eVar2.e;
                        bVar5.getClass();
                        Intrinsics.checkNotNullParameter(account2, "account");
                        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
                        aVar = new wjh.a(bVar5.b(account2, tradingLegalEntityInformation), bVar5.a(account2));
                    }
                    aVar2 = aVar;
                }
                String strQ = j6.a.q("PRODUCT_WIDGET_ERROR", jjh.b.c(account));
                RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(aVar2.f298089b, null, null, false, null, false, 62);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14);
                List listK = zhm.v.k(aVar2.f298088a, new ImageClause(R$drawable.uikit_icn_16_warning, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Float) null, (Float) null, 28));
                kotlin.jvm.internal.t0 t0Var = kotlin.jvm.internal.t0.f186434a;
                m70.a.t(t0Var);
                CompositeClause compositeClause = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                List listK2 = zhm.v.k(new ImageClause(R$drawable.uikit_icn_16_arrow_recurring, Integer.valueOf(R$attr.uikit_colorAccent), (Float) null, (Float) null, 28), new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_action, null, null, 14));
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                TextClause textClause2 = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String strQ2 = j6.a.q("PRODUCT_WIDGET_ERROR", jjh.b.c(account));
                if (account instanceof WealthAccount.Securities) {
                    rVar = wjh.p.f298108a;
                } else if (z) {
                    rVar = wjh.o.f298107a;
                } else if (z4) {
                    rVar = wjh.m.f298105a;
                } else if (account instanceof WealthAccount.Margin) {
                    rVar = wjh.n.f298106a;
                } else if (account instanceof WealthAccount.TaxAdvantageWealthAccount.Isa) {
                    rVar = wjh.q.f298109a;
                } else if (account instanceof WealthAccount.TaxAdvantageWealthAccount.Pea) {
                    rVar = wjh.s.f298112a;
                } else {
                    if (!(account instanceof WealthAccount.TaxAdvantageWealthAccount.JIsa)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String string = ((WealthAccount.TaxAdvantageWealthAccount.JIsa) account).getF().f105175a.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    rVar = new wjh.r(string);
                }
                List listC = zhm.u.c(new RowDelegate.Model(strQ, image40, compositeClause, null, 0, textLocalisedClause, new CompositeClause(listK2, textClause2, new Click(28, (Integer) null, rVar, strQ2, false), null, 8), null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868760));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return listC;
            case 21:
                TicketDetails ticketDetails = (TicketDetails) obj5;
                ose.c cVar6 = (ose.c) obj4;
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                aim.e eVarB = zhm.u.b();
                zhm.a0.x(((vse.d) obj6).e(cVar6.f229322a, cVar6.f229323b, ticketDetails, null, new vqd.b(ticketDetails, getDefaultErrorItems, 6)), eVarB);
                return zhm.u.a(eVarB);
            case 22:
                wd6.c cVar7 = (wd6.c) obj6;
                Set set = (Set) obj5;
                Set set2 = (Set) obj4;
                Boolean cryptoEnabled = (Boolean) obj2;
                Boolean commoditiesEnabled = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(cryptoEnabled, "cryptoEnabled");
                Intrinsics.checkNotNullParameter(commoditiesEnabled, "commoditiesEnabled");
                Object[] objArr3 = (!cryptoEnabled.booleanValue() || cVar7.a() || set.contains(xi0.e.CRYPTO)) ? false : true;
                Object[] objArr4 = (!commoditiesEnabled.booleanValue() || cVar7.a() || set.contains(xi0.e.COMMODITY)) ? false : true;
                Object[] objArr5 = (cVar7 == wd6.c.CRYPTO_ONLY && objArr3 == true) ? false : true;
                if (cVar7 == wd6.c.COMMODITY_ONLY && commoditiesEnabled.booleanValue()) {
                    z3 = false;
                }
                boolean zContains = set.contains(xi0.e.FIAT);
                Intrinsics.h(set2);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (Object obj7 : set2) {
                    xi0.b bVar6 = (xi0.b) obj7;
                    if (!cp5.d.A(bVar6) || !zContains) {
                        if (objArr3 != false || !cp5.d.z(bVar6)) {
                            if (objArr5 != false || cp5.d.z(bVar6)) {
                                if (objArr4 != false || !cp5.d.y(bVar6)) {
                                    if (z3 || cp5.d.y(bVar6)) {
                                        linkedHashSet.add(obj7);
                                    }
                                }
                            }
                        }
                    }
                }
                return linkedHashSet;
            default:
                WealthTransferFlowControllerFactory$Descriptor wealthTransferFlowControllerFactory$Descriptor = (WealthTransferFlowControllerFactory$Descriptor) obj6;
                com.revolut.feature.wealth.ui.impl.actions.handler.a aVar7 = (com.revolut.feature.wealth.ui.impl.actions.handler.a) obj5;
                iih.a aVar8 = (iih.a) obj4;
                yki.l FlowCoordinator3 = (yki.l) obj2;
                WealthTransferFlowControllerFactory$Step step3 = (WealthTransferFlowControllerFactory$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator3, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step3, "step");
                if (Intrinsics.f(step3, WealthTransferFlowControllerFactory$Step.Initial.f95943a)) {
                    WealthTransferPickerController wealthTransferPickerController = new WealthTransferPickerController(new snh.f(boh.f.a(wealthTransferFlowControllerFactory$Descriptor.f95942b), wealthTransferFlowControllerFactory$Descriptor.f95941a));
                    yj2.b block3 = new yj2.b(aVar7, FlowCoordinator3, i2);
                    Intrinsics.checkNotNullParameter(block3, "block");
                    wealthTransferPickerController.H = block3;
                    return wealthTransferPickerController;
                }
                if (!(step3 instanceof WealthTransferFlowControllerFactory$Step.TransferDestination)) {
                    throw new NoWhenBranchMatchedException();
                }
                WealthTransferPickerControllerContract$Output wealthTransferPickerControllerContract$Output = ((WealthTransferFlowControllerFactory$Step.TransferDestination) step3).f95944a;
                if (wealthTransferPickerControllerContract$Output instanceof WealthTransferPickerControllerContract$Output.StocksTransfer) {
                    iih.b transferType = boh.f.a(wealthTransferFlowControllerFactory$Descriptor.f95942b);
                    WealthTransferPickerControllerContract$Output.StocksTransfer stocksTransfer = (WealthTransferPickerControllerContract$Output.StocksTransfer) wealthTransferPickerControllerContract$Output;
                    String portfolioId = stocksTransfer.f96063a;
                    kel.b cashHolding = stocksTransfer.f96064b;
                    ale.b bVar7 = (ale.b) aVar8;
                    Intrinsics.checkNotNullParameter(transferType, "transferType");
                    Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                    Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
                    int i21 = ale.a.f6248a[transferType.ordinal()];
                    if (i21 == 1) {
                        m4f.b bVar8 = bVar7.f6249a;
                        kel.a aVar9 = cashHolding.f183148a;
                        eVarA4 = b3f.b.a(bVar8, new TransferSubjectId.CashHolding(portfolioId, aVar9.f183145a, aVar9.e, cashHolding.f183150c), WealthAccountType.SECURITIES);
                    } else {
                        if (i21 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        kel.a aVar10 = cashHolding.f183148a;
                        TransferSubjectId.CashHolding cashHolding2 = new TransferSubjectId.CashHolding(portfolioId, aVar10.f183145a, aVar10.e, cashHolding.f183150c);
                        WealthAccountType wealthAccountType = WealthAccountType.SECURITIES;
                        xi0.a aVar11 = xi0.b.Companion;
                        String str7 = cashHolding.f183148a.e;
                        aVar11.getClass();
                        eVarA4 = new WithdrawFeatureDescriptor(cashHolding2, wealthAccountType, xi0.a.a(str7));
                    }
                    return aVar7.e1(eVarA4);
                }
                if (wealthTransferPickerControllerContract$Output instanceof WealthTransferPickerControllerContract$Output.TaxAdvantageTransfer) {
                    iih.b transferType2 = boh.f.a(wealthTransferFlowControllerFactory$Descriptor.f95942b);
                    WealthTransferPickerControllerContract$Output.TaxAdvantageTransfer taxAdvantageTransfer = (WealthTransferPickerControllerContract$Output.TaxAdvantageTransfer) wealthTransferPickerControllerContract$Output;
                    String portfolioId2 = taxAdvantageTransfer.f96066b;
                    kel.b cashHolding3 = taxAdvantageTransfer.f96067c;
                    WealthAccount.TaxAdvantageWealthAccount account3 = taxAdvantageTransfer.f96065a;
                    ale.b bVar9 = (ale.b) aVar8;
                    Intrinsics.checkNotNullParameter(account3, "account");
                    Intrinsics.checkNotNullParameter(transferType2, "transferType");
                    Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                    Intrinsics.checkNotNullParameter(cashHolding3, "cashHolding");
                    int i22 = ale.a.f6248a[transferType2.ordinal()];
                    if (i22 == 1) {
                        m4f.b bVar10 = bVar9.f6249a;
                        kel.a aVar12 = cashHolding3.f183148a;
                        eVarA3 = b3f.b.a(bVar10, new TransferSubjectId.CashHolding(portfolioId2, aVar12.f183145a, aVar12.e, cashHolding3.f183150c), account3.T0());
                    } else {
                        if (i22 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        kel.a aVar13 = cashHolding3.f183148a;
                        TransferSubjectId.CashHolding cashHolding4 = new TransferSubjectId.CashHolding(portfolioId2, aVar13.f183145a, aVar13.e, cashHolding3.f183150c);
                        WealthAccountType wealthAccountTypeT0 = account3.T0();
                        xi0.a aVar14 = xi0.b.Companion;
                        String str8 = cashHolding3.f183148a.e;
                        aVar14.getClass();
                        eVarA3 = new WithdrawFeatureDescriptor(cashHolding4, wealthAccountTypeT0, xi0.a.a(str8));
                    }
                    return aVar7.e1(eVarA3);
                }
                if (wealthTransferPickerControllerContract$Output instanceof WealthTransferPickerControllerContract$Output.RoboTransfer) {
                    iih.b transferType3 = boh.f.a(wealthTransferFlowControllerFactory$Descriptor.f95942b);
                    RoboPortfolioInfo portfolio = ((WealthTransferPickerControllerContract$Output.RoboTransfer) wealthTransferPickerControllerContract$Output).f96062a.f96074a;
                    ale.b bVar11 = (ale.b) aVar8;
                    Intrinsics.checkNotNullParameter(transferType3, "transferType");
                    Intrinsics.checkNotNullParameter(portfolio, "portfolio");
                    int i32 = ale.a.f6248a[transferType3.ordinal()];
                    if (i32 == 1) {
                        eVarA2 = b3f.b.a(bVar11.f6249a, new TransferSubjectId.Portfolio(portfolio.f95703c), WealthAccountType.ROBO);
                    } else {
                        if (i32 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        eVarA2 = new WithdrawFeatureDescriptor(new TransferSubjectId.Portfolio(portfolio.f95703c), WealthAccountType.ROBO, portfolio.f);
                    }
                    return aVar7.e1(eVarA2);
                }
                if (!(wealthTransferPickerControllerContract$Output instanceof WealthTransferPickerControllerContract$Output.MarginTransfer)) {
                    throw new NoWhenBranchMatchedException();
                }
                iih.b transferType4 = boh.f.a(wealthTransferFlowControllerFactory$Descriptor.f95942b);
                kel.b bVar12 = ((WealthTransferPickerControllerContract$Output.MarginTransfer) wealthTransferPickerControllerContract$Output).f96061a.f96072a;
                String portfolioId3 = bVar12.f183148a.f183146b;
                xi0.b currency2 = yoj.b.f(bVar12);
                ale.b bVar13 = (ale.b) aVar8;
                Intrinsics.checkNotNullParameter(transferType4, "transferType");
                Intrinsics.checkNotNullParameter(portfolioId3, "portfolioId");
                Intrinsics.checkNotNullParameter(currency2, "currency");
                int i33 = ale.a.f6248a[transferType4.ordinal()];
                if (i33 == 1) {
                    eVarA = b3f.b.a(bVar13.f6249a, new TransferSubjectId.Portfolio(portfolioId3), WealthAccountType.MARGIN);
                } else {
                    if (i33 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVarA = new CfdTradingDescriptor$Withdraw(portfolioId3, currency2, ModalTransitionAnimation.Style.POPUP.f98391a);
                }
                return aVar7.e1(eVarA);
        }
    }

    public /* synthetic */ z(Object obj2, int i, Object obj3, Object obj4) {
        this.f2099a = i;
        this.f2100b = obj2;
        this.f2101c = obj3;
        this.d = obj4;
    }
}

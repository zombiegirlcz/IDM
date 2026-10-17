package com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos;

import aw0.n6;
import aw0.o9;
import cli.y;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.lite_pos.impl.R$string;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.currency_picker.LitePosCurrencyPickerFlow;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.currency_picker.LitePosCurrencyPickerFlowContract$InputData;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.LitePosFlowContract$ModalStep;
import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.LitePosFlowContract$Step;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.CatalogueEmbeddedScreen;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.CatalogueScreenContract$InputData;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.new_sale.SaleScreen;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.receipt.ReceiptScreen;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.receipt.ReceiptScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import hd.r;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import nd1.i;
import nd1.j;
import nd1.n;
import vkm.z1;
import wf0.r0;
import xd1.m;
import yji.l;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends oki.h implements xd1.d {
    public final y A;
    public final ali.b B;
    public final com.revolut.kompot.navigable.vc.modal.a C;
    public final n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nd1.c f60738p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f60739q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final rd1.a f60740r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j f60741s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wc1.a f60742t;
    public final ad1.b u;
    public final r v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final pd1.a f60743w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final z1 f60744x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final z1 f60745y;
    public final z1 z;

    public g(n shoppingCartInteractor, nd1.c catalogueInteractor, i currencyInteractor, rd1.a actionBottomSheetControllerFactory, j paymentNotificationObserver, wc1.a keyboardControllerExtension, ad1.b prePaymentExtension, r paymentDelegate, pd1.a colorMapper, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(shoppingCartInteractor, "shoppingCartInteractor");
        Intrinsics.checkNotNullParameter(catalogueInteractor, "catalogueInteractor");
        Intrinsics.checkNotNullParameter(currencyInteractor, "currencyInteractor");
        Intrinsics.checkNotNullParameter(actionBottomSheetControllerFactory, "actionBottomSheetControllerFactory");
        Intrinsics.checkNotNullParameter(paymentNotificationObserver, "paymentNotificationObserver");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        Intrinsics.checkNotNullParameter(prePaymentExtension, "prePaymentExtension");
        Intrinsics.checkNotNullParameter(paymentDelegate, "paymentDelegate");
        Intrinsics.checkNotNullParameter(colorMapper, "colorMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = shoppingCartInteractor;
        this.f60738p = catalogueInteractor;
        this.f60739q = currencyInteractor;
        this.f60740r = actionBottomSheetControllerFactory;
        this.f60741s = paymentNotificationObserver;
        this.f60742t = keyboardControllerExtension;
        this.u = prePaymentExtension;
        this.v = paymentDelegate;
        this.f60743w = colorMapper;
        final int i = 0;
        this.f60744x = ta6.a.a(0);
        this.f60745y = ta6.a.a(0);
        this.z = ta6.a.a(0);
        xd1.f fVar = new xd1.f(new ResourceImage(R$drawable.uikit_icn_24_cart, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), null);
        xd1.g gVar = new xd1.g(new TextLocalisedClause(R$string.product_catalogue_flow_new_sale_new_sale_primary_button_title, null, null, 14), false);
        LitePosFlowContract$Step.Amount amount = LitePosFlowContract$Step.Amount.f60731a;
        final int i2 = 1;
        this.A = mra.d.b(this, new a(v.k(amount, LitePosFlowContract$Step.Catalogue.f60732a), amount.getF70838b(), fVar, gVar), stateMapper, null, false, 12);
        this.B = s.b(this, new Function2(this) { // from class: xd1.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g f304220b;

            {
                this.f304220b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        ali.b PagerCoordinator = (ali.b) obj2;
                        LitePosFlowContract$Step step = (LitePosFlowContract$Step) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        if (Intrinsics.f(step, LitePosFlowContract$Step.Amount.f60731a)) {
                            return new SaleScreen();
                        }
                        if (!Intrinsics.f(step, LitePosFlowContract$Step.Catalogue.f60732a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        CatalogueEmbeddedScreen catalogueEmbeddedScreen = new CatalogueEmbeddedScreen(new CatalogueScreenContract$InputData(false));
                        j block = new j(this.f304220b, 0);
                        Intrinsics.checkNotNullParameter(block, "block");
                        catalogueEmbeddedScreen.H = block;
                        return catalogueEmbeddedScreen;
                    default:
                        com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g gVar2 = this.f304220b;
                        rd1.a aVar = gVar2.f60740r;
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        LitePosFlowContract$ModalStep step2 = (LitePosFlowContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step2, "step");
                        if (step2 instanceof LitePosFlowContract$ModalStep.Receipt) {
                            return new ReceiptScreen(new ReceiptScreenContract$InputData(((LitePosFlowContract$ModalStep.Receipt) step2).f60730a));
                        }
                        if (step2 instanceof LitePosFlowContract$ModalStep.CurrencyPicker) {
                            LitePosCurrencyPickerFlow litePosCurrencyPickerFlow = new LitePosCurrencyPickerFlow(new LitePosCurrencyPickerFlowContract$InputData(((LitePosFlowContract$ModalStep.CurrencyPicker) step2).f60729a));
                            x52.a aVar2 = new x52.a(step2, gVar2, 23);
                            Intrinsics.checkNotNullParameter(aVar2, "<set-?>");
                            litePosCurrencyPickerFlow.J = aVar2;
                            return litePosCurrencyPickerFlow;
                        }
                        if (step2 instanceof LitePosFlowContract$ModalStep.AmountExceedsLimit) {
                            return aVar.a(((LitePosFlowContract$ModalStep.AmountExceedsLimit) step2).f60725a);
                        }
                        if (step2 instanceof LitePosFlowContract$ModalStep.ChangeCurrency) {
                            xi0.b current = ((LitePosFlowContract$ModalStep.ChangeCurrency) step2).f60728a;
                            aVar.getClass();
                            Intrinsics.checkNotNullParameter(current, "current");
                            ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(R$string.product_catalogue_change_currency_alert_custom_item_title, null, null, 14), new TextLocalisedClause(R$string.product_catalogue_change_currency_alert_custom_item_subtitle, u.c(current.f306286a), null, 12), null, null, false, 28), new aw0.h(false, new n6(new TextLocalisedClause(R$string.product_catalogue_change_currency_alert_custom_item_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.product_catalogue_common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), aVar.f253314b, null, null, 24));
                            j block2 = new j(gVar2, 1);
                            Intrinsics.checkNotNullParameter(block2, "block");
                            actionsBottomSheetController.H = block2;
                            return actionsBottomSheetController;
                        }
                        if (!(step2 instanceof LitePosFlowContract$ModalStep.CatalogueBaseCurrencyWarning)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        LitePosFlowContract$ModalStep.CatalogueBaseCurrencyWarning catalogueBaseCurrencyWarning = (LitePosFlowContract$ModalStep.CatalogueBaseCurrencyWarning) step2;
                        xi0.b current2 = catalogueBaseCurrencyWarning.f60726a;
                        xi0.b base = catalogueBaseCurrencyWarning.f60727b;
                        aVar.getClass();
                        Intrinsics.checkNotNullParameter(current2, "current");
                        Intrinsics.checkNotNullParameter(base, "base");
                        ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(R$string.product_catalogue_change_currency_alert_catalogue_title, null, null, 14), new TextLocalisedClause(R$string.product_catalogue_change_currency_alert_catalogue_subtitle, v.k(new TextClause(current2.f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(base.f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, null, false, 28), new aw0.h(false, new n6(new TextLocalisedClause(R$string.product_catalogue_change_currency_alert_catalogue_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.product_catalogue_common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), aVar.f253314b, null, null, 24));
                        j block3 = new j(gVar2, 2);
                        Intrinsics.checkNotNullParameter(block3, "block");
                        actionsBottomSheetController2.H = block3;
                        return actionsBottomSheetController2;
                }
            }
        });
        this.C = hx7.e.a(this, new Function2(this) { // from class: xd1.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g f304220b;

            {
                this.f304220b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        ali.b PagerCoordinator = (ali.b) obj2;
                        LitePosFlowContract$Step step = (LitePosFlowContract$Step) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        if (Intrinsics.f(step, LitePosFlowContract$Step.Amount.f60731a)) {
                            return new SaleScreen();
                        }
                        if (!Intrinsics.f(step, LitePosFlowContract$Step.Catalogue.f60732a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        CatalogueEmbeddedScreen catalogueEmbeddedScreen = new CatalogueEmbeddedScreen(new CatalogueScreenContract$InputData(false));
                        j block = new j(this.f304220b, 0);
                        Intrinsics.checkNotNullParameter(block, "block");
                        catalogueEmbeddedScreen.H = block;
                        return catalogueEmbeddedScreen;
                    default:
                        com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g gVar2 = this.f304220b;
                        rd1.a aVar = gVar2.f60740r;
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        LitePosFlowContract$ModalStep step2 = (LitePosFlowContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step2, "step");
                        if (step2 instanceof LitePosFlowContract$ModalStep.Receipt) {
                            return new ReceiptScreen(new ReceiptScreenContract$InputData(((LitePosFlowContract$ModalStep.Receipt) step2).f60730a));
                        }
                        if (step2 instanceof LitePosFlowContract$ModalStep.CurrencyPicker) {
                            LitePosCurrencyPickerFlow litePosCurrencyPickerFlow = new LitePosCurrencyPickerFlow(new LitePosCurrencyPickerFlowContract$InputData(((LitePosFlowContract$ModalStep.CurrencyPicker) step2).f60729a));
                            x52.a aVar2 = new x52.a(step2, gVar2, 23);
                            Intrinsics.checkNotNullParameter(aVar2, "<set-?>");
                            litePosCurrencyPickerFlow.J = aVar2;
                            return litePosCurrencyPickerFlow;
                        }
                        if (step2 instanceof LitePosFlowContract$ModalStep.AmountExceedsLimit) {
                            return aVar.a(((LitePosFlowContract$ModalStep.AmountExceedsLimit) step2).f60725a);
                        }
                        if (step2 instanceof LitePosFlowContract$ModalStep.ChangeCurrency) {
                            xi0.b current = ((LitePosFlowContract$ModalStep.ChangeCurrency) step2).f60728a;
                            aVar.getClass();
                            Intrinsics.checkNotNullParameter(current, "current");
                            ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(R$string.product_catalogue_change_currency_alert_custom_item_title, null, null, 14), new TextLocalisedClause(R$string.product_catalogue_change_currency_alert_custom_item_subtitle, u.c(current.f306286a), null, 12), null, null, false, 28), new aw0.h(false, new n6(new TextLocalisedClause(R$string.product_catalogue_change_currency_alert_custom_item_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.product_catalogue_common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), aVar.f253314b, null, null, 24));
                            j block2 = new j(gVar2, 1);
                            Intrinsics.checkNotNullParameter(block2, "block");
                            actionsBottomSheetController.H = block2;
                            return actionsBottomSheetController;
                        }
                        if (!(step2 instanceof LitePosFlowContract$ModalStep.CatalogueBaseCurrencyWarning)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        LitePosFlowContract$ModalStep.CatalogueBaseCurrencyWarning catalogueBaseCurrencyWarning = (LitePosFlowContract$ModalStep.CatalogueBaseCurrencyWarning) step2;
                        xi0.b current2 = catalogueBaseCurrencyWarning.f60726a;
                        xi0.b base = catalogueBaseCurrencyWarning.f60727b;
                        aVar.getClass();
                        Intrinsics.checkNotNullParameter(current2, "current");
                        Intrinsics.checkNotNullParameter(base, "base");
                        ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(new lw0.a(new TextLocalisedClause(R$string.product_catalogue_change_currency_alert_catalogue_title, null, null, 14), new TextLocalisedClause(R$string.product_catalogue_change_currency_alert_catalogue_subtitle, v.k(new TextClause(current2.f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(base.f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, null, false, 28), new aw0.h(false, new n6(new TextLocalisedClause(R$string.product_catalogue_change_currency_alert_catalogue_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.product_catalogue_common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), aVar.f253314b, null, null, 24));
                        j block3 = new j(gVar2, 2);
                        Intrinsics.checkNotNullParameter(block3, "block");
                        actionsBottomSheetController2.H = block3;
                        return actionsBottomSheetController2;
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g.I2(com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g, gim.c):java.lang.Object");
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.B;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, rd0.e.b(this.f60738p.c(true)), new r0(2, 3, null), null, null, 6);
        l.a1(this, this.f60741s.f214295a, null, null, new rf9.h(this, continuation, 21), 3);
        l2(new m(this, continuation, 1), new yi5.b(26));
        l.a1(this, this.o.c(), null, null, new xd1.n(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof xd1.l
            if (r0 == 0) goto L13
            r0 = r5
            xd1.l r0 = (xd1.l) r0
            int r1 = r0.f304225w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f304225w = r1
            goto L18
        L13:
            xd1.l r0 = new xd1.l
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f304225w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            nd1.n r5 = r4.o
            n1g.p r5 = r5.c()
            r0.f304225w = r3
            java.lang.Object r5 = vkm.q.x(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            cd1.e r5 = (cd1.e) r5
            int r5 = r5.f23150b
            if (r5 != 0) goto L48
            goto L49
        L48:
            r3 = 0
        L49:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.g.J2(gim.c):java.lang.Object");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.C;
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return this.A;
    }
}

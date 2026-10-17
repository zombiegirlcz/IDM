package com.revolut.feature.card_order_new.impl.kompot.ordernewcard;

import a07.p;
import ae8.c;
import ag1.k;
import al4.b;
import android.os.Parcelable;
import aw0.m6;
import aw0.n6;
import ble.c1;
import cli.n;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.card_order_new.api.BackConfirmationDialog;
import com.revolut.feature.card_order_new.api.CardOrderAccountWrapper;
import com.revolut.feature.card_order_new.api.SelectedTab;
import com.revolut.feature.card_order_new.impl.R$string;
import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.OrderNewCardFlowContract$InputData;
import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.OrderNewCardFlowContract$ModalStep;
import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.dialogs.CardSubtypePickerBottomSheetController;
import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.tab.OrderNewCardTabController;
import com.revolut.feature.card_order_new.impl.kompot.ordernewcard.tab.OrderNewCardTabControllerContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.retail.core.navigation.NaviCommand;
import f23.c0;
import f23.g0;
import f23.h0;
import f23.l0;
import f23.m;
import f23.q;
import f23.x;
import go.g;
import grl.k9;
import hx7.e;
import k23.f;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m23.i;
import md6.s;
import oki.h;
import om4.s3;
import vkm.v1;
import vkm.y;
import yhm.j;
import yji.l;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements q {
    public final OrderNewCardFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l0 f65104p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f65105q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c0 f65106r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f65107s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f65108t;
    public final m u;
    public final Lazy v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ali.b f65109w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f65110x;

    public a(n stateMapper, OrderNewCardFlowContract$InputData inputData, l0 tabVisibilityInteractor, b comboCardInteractor, c0 toolbarDescriptionFactory, f sharedDataSource, i dialogProvider, m orderCoordinator) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(tabVisibilityInteractor, "tabVisibilityInteractor");
        Intrinsics.checkNotNullParameter(comboCardInteractor, "comboCardInteractor");
        Intrinsics.checkNotNullParameter(toolbarDescriptionFactory, "toolbarDescriptionFactory");
        Intrinsics.checkNotNullParameter(sharedDataSource, "sharedDataSource");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(orderCoordinator, "orderCoordinator");
        this.o = inputData;
        this.f65104p = tabVisibilityInteractor;
        this.f65105q = comboCardInteractor;
        this.f65106r = toolbarDescriptionFactory;
        this.f65107s = sharedDataSource;
        this.f65108t = dialogProvider;
        this.u = orderCoordinator;
        this.v = j.b(new eq8.b(this, stateMapper, 21));
        final int i = 0;
        this.f65109w = s.b(this, new Function2(this) { // from class: f23.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a f131417b;

            {
                this.f131417b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i2 = i;
                final com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a aVar = this.f131417b;
                switch (i2) {
                    case 0:
                        ali.b PagerCoordinator = (ali.b) obj2;
                        SelectedTab tab2 = (SelectedTab) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(tab2, "tab");
                        OrderNewCardFlowContract$InputData orderNewCardFlowContract$InputData = aVar.o;
                        boolean f64941b = orderNewCardFlowContract$InputData.e.getF64941b();
                        CardOrderAccountWrapper cardOrderAccountWrapper = orderNewCardFlowContract$InputData.f65091b;
                        NaviCommand naviCommand = orderNewCardFlowContract$InputData.k;
                        zn3.a aVar2 = orderNewCardFlowContract$InputData.f;
                        String str = orderNewCardFlowContract$InputData.f65094h;
                        h93.l0 l0Var = orderNewCardFlowContract$InputData.i;
                        pi3.h hVar = orderNewCardFlowContract$InputData.f65093g;
                        final int i3 = 0;
                        OrderNewCardTabController orderNewCardTabController = new OrderNewCardTabController(new OrderNewCardTabControllerContract$InputData(tab2, f64941b, cardOrderAccountWrapper, naviCommand, aVar2, str, l0Var, (hVar == null || !hVar.d) ? 0 : 1, orderNewCardFlowContract$InputData.f65095j, hVar, orderNewCardFlowContract$InputData.f65098n), aVar.f65107s);
                        Function1 block = new Function1() { // from class: f23.w
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i3) {
                                    case 0:
                                        n23.h output = (n23.h) obj4;
                                        Intrinsics.checkNotNullParameter(output, "output");
                                        if (output == null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.v2(aVar.f65110x, output.f211435a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                        return Unit.f186387a;
                                    case 1:
                                        dii.g result = (dii.g) obj4;
                                        Intrinsics.checkNotNullParameter(result, "result");
                                        if (Intrinsics.f(result, dii.f.f115069a)) {
                                            com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a aVar3 = aVar;
                                            NaviCommand naviCommand2 = aVar3.o.f65097m;
                                            if (naviCommand2 != null) {
                                                aVar3.C1(u0.b(naviCommand2));
                                            } else {
                                                aVar3.B2();
                                            }
                                        }
                                        return Unit.f186387a;
                                    case 2:
                                        dii.g result2 = (dii.g) obj4;
                                        Intrinsics.checkNotNullParameter(result2, "result");
                                        if (Intrinsics.f(result2, dii.f.f115069a)) {
                                            com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a aVar4 = aVar;
                                            NaviCommand naviCommand3 = aVar4.o.f65096l;
                                            if (naviCommand3 != null) {
                                                aVar4.C1(u0.b(naviCommand3));
                                            } else {
                                                aVar4.B2();
                                            }
                                        }
                                        return Unit.f186387a;
                                    default:
                                        m23.e result3 = (m23.e) obj4;
                                        Intrinsics.checkNotNullParameter(result3, "result");
                                        if (result3 != null) {
                                            com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a aVar5 = aVar;
                                            aVar5.A1(new esa.i(aVar5, result3, null, 15), new yi5.b(25));
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block, "block");
                        orderNewCardTabController.H = block;
                        return orderNewCardTabController;
                    default:
                        m23.i iVar = aVar.f65108t;
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        OrderNewCardFlowContract$ModalStep step = (OrderNewCardFlowContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        if (step instanceof OrderNewCardFlowContract$ModalStep.BackConfirmation) {
                            BackConfirmationDialog dialog = ((OrderNewCardFlowContract$ModalStep.BackConfirmation) step).f65099a;
                            iVar.getClass();
                            Intrinsics.checkNotNullParameter(dialog, "dialog");
                            lw0.a aVar3 = new lw0.a(dialog.f64930a, dialog.f64931b, null, null, false, 28);
                            m6 m6Var = n6.Companion;
                            aw0.h hVar2 = new aw0.h(false, m6.c(m6Var, dialog.f64932c, LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, dialog.d, LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121);
                            k9 k9Var = k9.Cards;
                            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                            ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar3, hVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
                            Function1 block2 = new Function1() { // from class: f23.w
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    switch (i) {
                                        case 0:
                                            n23.h output = (n23.h) obj4;
                                            Intrinsics.checkNotNullParameter(output, "output");
                                            if (output == null) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.v2(aVar.f65110x, output.f211435a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                            return Unit.f186387a;
                                        case 1:
                                            dii.g result = (dii.g) obj4;
                                            Intrinsics.checkNotNullParameter(result, "result");
                                            if (Intrinsics.f(result, dii.f.f115069a)) {
                                                com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a aVar32 = aVar;
                                                NaviCommand naviCommand2 = aVar32.o.f65097m;
                                                if (naviCommand2 != null) {
                                                    aVar32.C1(u0.b(naviCommand2));
                                                } else {
                                                    aVar32.B2();
                                                }
                                            }
                                            return Unit.f186387a;
                                        case 2:
                                            dii.g result2 = (dii.g) obj4;
                                            Intrinsics.checkNotNullParameter(result2, "result");
                                            if (Intrinsics.f(result2, dii.f.f115069a)) {
                                                com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a aVar4 = aVar;
                                                NaviCommand naviCommand3 = aVar4.o.f65096l;
                                                if (naviCommand3 != null) {
                                                    aVar4.C1(u0.b(naviCommand3));
                                                } else {
                                                    aVar4.B2();
                                                }
                                            }
                                            return Unit.f186387a;
                                        default:
                                            m23.e result3 = (m23.e) obj4;
                                            Intrinsics.checkNotNullParameter(result3, "result");
                                            if (result3 != null) {
                                                com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a aVar5 = aVar;
                                                aVar5.A1(new esa.i(aVar5, result3, null, 15), new yi5.b(25));
                                            }
                                            return Unit.f186387a;
                                    }
                                }
                            };
                            Intrinsics.checkNotNullParameter(block2, "block");
                            actionsBottomSheetController.H = block2;
                            return actionsBottomSheetController;
                        }
                        if (!Intrinsics.f(step, OrderNewCardFlowContract$ModalStep.JuniorSkip.f65100a)) {
                            if (!(step instanceof OrderNewCardFlowContract$ModalStep.SubtypePicker)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            OrderNewCardFlowContract$ModalStep.SubtypePicker subtypePicker = (OrderNewCardFlowContract$ModalStep.SubtypePicker) step;
                            CardSubtypePickerBottomSheetController cardSubtypePickerBottomSheetController = new CardSubtypePickerBottomSheetController(new m23.d(subtypePicker.f65101a, subtypePicker.f65102b, subtypePicker.f65103c, subtypePicker.d));
                            final int i5 = 3;
                            Function1 block3 = new Function1() { // from class: f23.w
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    switch (i5) {
                                        case 0:
                                            n23.h output = (n23.h) obj4;
                                            Intrinsics.checkNotNullParameter(output, "output");
                                            if (output == null) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.v2(aVar.f65110x, output.f211435a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                            return Unit.f186387a;
                                        case 1:
                                            dii.g result = (dii.g) obj4;
                                            Intrinsics.checkNotNullParameter(result, "result");
                                            if (Intrinsics.f(result, dii.f.f115069a)) {
                                                com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a aVar32 = aVar;
                                                NaviCommand naviCommand2 = aVar32.o.f65097m;
                                                if (naviCommand2 != null) {
                                                    aVar32.C1(u0.b(naviCommand2));
                                                } else {
                                                    aVar32.B2();
                                                }
                                            }
                                            return Unit.f186387a;
                                        case 2:
                                            dii.g result2 = (dii.g) obj4;
                                            Intrinsics.checkNotNullParameter(result2, "result");
                                            if (Intrinsics.f(result2, dii.f.f115069a)) {
                                                com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a aVar4 = aVar;
                                                NaviCommand naviCommand3 = aVar4.o.f65096l;
                                                if (naviCommand3 != null) {
                                                    aVar4.C1(u0.b(naviCommand3));
                                                } else {
                                                    aVar4.B2();
                                                }
                                            }
                                            return Unit.f186387a;
                                        default:
                                            m23.e result3 = (m23.e) obj4;
                                            Intrinsics.checkNotNullParameter(result3, "result");
                                            if (result3 != null) {
                                                com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a aVar5 = aVar;
                                                aVar5.A1(new esa.i(aVar5, result3, null, 15), new yi5.b(25));
                                            }
                                            return Unit.f186387a;
                                    }
                                }
                            };
                            Intrinsics.checkNotNullParameter(block3, "block");
                            cardSubtypePickerBottomSheetController.H = block3;
                            return cardSubtypePickerBottomSheetController;
                        }
                        iVar.getClass();
                        lw0.a aVar4 = new lw0.a(new TextLocalisedClause(R$string.rev_u18_card_order_skip_confirmation_title, null, null, 14), new TextLocalisedClause(R$string.rev_u18_card_order_skip_confirmation_subtitle, null, null, 14), null, null, false, 28);
                        m6 m6Var2 = n6.Companion;
                        aw0.h hVar3 = new aw0.h(false, m6.c(m6Var2, new TextLocalisedClause(R$string.rev_u18_card_order_skip_confirmation_button_get_card, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var2, new TextLocalisedClause(R$string.rev_u18_card_order_skip_confirmation_button_skip, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121);
                        k9 k9Var2 = k9.Cards;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                        ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(aVar4, hVar3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
                        final int i6 = 2;
                        Function1 block4 = new Function1() { // from class: f23.w
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i6) {
                                    case 0:
                                        n23.h output = (n23.h) obj4;
                                        Intrinsics.checkNotNullParameter(output, "output");
                                        if (output == null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.v2(aVar.f65110x, output.f211435a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                        return Unit.f186387a;
                                    case 1:
                                        dii.g result = (dii.g) obj4;
                                        Intrinsics.checkNotNullParameter(result, "result");
                                        if (Intrinsics.f(result, dii.f.f115069a)) {
                                            com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a aVar32 = aVar;
                                            NaviCommand naviCommand2 = aVar32.o.f65097m;
                                            if (naviCommand2 != null) {
                                                aVar32.C1(u0.b(naviCommand2));
                                            } else {
                                                aVar32.B2();
                                            }
                                        }
                                        return Unit.f186387a;
                                    case 2:
                                        dii.g result2 = (dii.g) obj4;
                                        Intrinsics.checkNotNullParameter(result2, "result");
                                        if (Intrinsics.f(result2, dii.f.f115069a)) {
                                            com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a aVar42 = aVar;
                                            NaviCommand naviCommand3 = aVar42.o.f65096l;
                                            if (naviCommand3 != null) {
                                                aVar42.C1(u0.b(naviCommand3));
                                            } else {
                                                aVar42.B2();
                                            }
                                        }
                                        return Unit.f186387a;
                                    default:
                                        m23.e result3 = (m23.e) obj4;
                                        Intrinsics.checkNotNullParameter(result3, "result");
                                        if (result3 != null) {
                                            com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a aVar5 = aVar;
                                            aVar5.A1(new esa.i(aVar5, result3, null, 15), new yi5.b(25));
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block4, "block");
                        actionsBottomSheetController2.H = block4;
                        return actionsBottomSheetController2;
                }
            }
        });
        final int i2 = 1;
        this.f65110x = e.a(this, new Function2(this) { // from class: f23.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a f131417b;

            {
                this.f131417b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i2;
                final com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a aVar = this.f131417b;
                switch (i22) {
                    case 0:
                        ali.b PagerCoordinator = (ali.b) obj2;
                        SelectedTab tab2 = (SelectedTab) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(tab2, "tab");
                        OrderNewCardFlowContract$InputData orderNewCardFlowContract$InputData = aVar.o;
                        boolean f64941b = orderNewCardFlowContract$InputData.e.getF64941b();
                        CardOrderAccountWrapper cardOrderAccountWrapper = orderNewCardFlowContract$InputData.f65091b;
                        NaviCommand naviCommand = orderNewCardFlowContract$InputData.k;
                        zn3.a aVar2 = orderNewCardFlowContract$InputData.f;
                        String str = orderNewCardFlowContract$InputData.f65094h;
                        h93.l0 l0Var = orderNewCardFlowContract$InputData.i;
                        pi3.h hVar = orderNewCardFlowContract$InputData.f65093g;
                        final int i3 = 0;
                        OrderNewCardTabController orderNewCardTabController = new OrderNewCardTabController(new OrderNewCardTabControllerContract$InputData(tab2, f64941b, cardOrderAccountWrapper, naviCommand, aVar2, str, l0Var, (hVar == null || !hVar.d) ? 0 : 1, orderNewCardFlowContract$InputData.f65095j, hVar, orderNewCardFlowContract$InputData.f65098n), aVar.f65107s);
                        Function1 block = new Function1() { // from class: f23.w
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i3) {
                                    case 0:
                                        n23.h output = (n23.h) obj4;
                                        Intrinsics.checkNotNullParameter(output, "output");
                                        if (output == null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.v2(aVar.f65110x, output.f211435a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                        return Unit.f186387a;
                                    case 1:
                                        dii.g result = (dii.g) obj4;
                                        Intrinsics.checkNotNullParameter(result, "result");
                                        if (Intrinsics.f(result, dii.f.f115069a)) {
                                            com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a aVar32 = aVar;
                                            NaviCommand naviCommand2 = aVar32.o.f65097m;
                                            if (naviCommand2 != null) {
                                                aVar32.C1(u0.b(naviCommand2));
                                            } else {
                                                aVar32.B2();
                                            }
                                        }
                                        return Unit.f186387a;
                                    case 2:
                                        dii.g result2 = (dii.g) obj4;
                                        Intrinsics.checkNotNullParameter(result2, "result");
                                        if (Intrinsics.f(result2, dii.f.f115069a)) {
                                            com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a aVar42 = aVar;
                                            NaviCommand naviCommand3 = aVar42.o.f65096l;
                                            if (naviCommand3 != null) {
                                                aVar42.C1(u0.b(naviCommand3));
                                            } else {
                                                aVar42.B2();
                                            }
                                        }
                                        return Unit.f186387a;
                                    default:
                                        m23.e result3 = (m23.e) obj4;
                                        Intrinsics.checkNotNullParameter(result3, "result");
                                        if (result3 != null) {
                                            com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a aVar5 = aVar;
                                            aVar5.A1(new esa.i(aVar5, result3, null, 15), new yi5.b(25));
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block, "block");
                        orderNewCardTabController.H = block;
                        return orderNewCardTabController;
                    default:
                        m23.i iVar = aVar.f65108t;
                        com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                        OrderNewCardFlowContract$ModalStep step = (OrderNewCardFlowContract$ModalStep) obj3;
                        Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                        Intrinsics.checkNotNullParameter(step, "step");
                        if (step instanceof OrderNewCardFlowContract$ModalStep.BackConfirmation) {
                            BackConfirmationDialog dialog = ((OrderNewCardFlowContract$ModalStep.BackConfirmation) step).f65099a;
                            iVar.getClass();
                            Intrinsics.checkNotNullParameter(dialog, "dialog");
                            lw0.a aVar3 = new lw0.a(dialog.f64930a, dialog.f64931b, null, null, false, 28);
                            m6 m6Var = n6.Companion;
                            aw0.h hVar2 = new aw0.h(false, m6.c(m6Var, dialog.f64932c, LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, dialog.d, LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121);
                            k9 k9Var = k9.Cards;
                            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                            ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar3, hVar2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
                            Function1 block2 = new Function1() { // from class: f23.w
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    switch (i) {
                                        case 0:
                                            n23.h output = (n23.h) obj4;
                                            Intrinsics.checkNotNullParameter(output, "output");
                                            if (output == null) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.v2(aVar.f65110x, output.f211435a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                            return Unit.f186387a;
                                        case 1:
                                            dii.g result = (dii.g) obj4;
                                            Intrinsics.checkNotNullParameter(result, "result");
                                            if (Intrinsics.f(result, dii.f.f115069a)) {
                                                com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a aVar32 = aVar;
                                                NaviCommand naviCommand2 = aVar32.o.f65097m;
                                                if (naviCommand2 != null) {
                                                    aVar32.C1(u0.b(naviCommand2));
                                                } else {
                                                    aVar32.B2();
                                                }
                                            }
                                            return Unit.f186387a;
                                        case 2:
                                            dii.g result2 = (dii.g) obj4;
                                            Intrinsics.checkNotNullParameter(result2, "result");
                                            if (Intrinsics.f(result2, dii.f.f115069a)) {
                                                com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a aVar42 = aVar;
                                                NaviCommand naviCommand3 = aVar42.o.f65096l;
                                                if (naviCommand3 != null) {
                                                    aVar42.C1(u0.b(naviCommand3));
                                                } else {
                                                    aVar42.B2();
                                                }
                                            }
                                            return Unit.f186387a;
                                        default:
                                            m23.e result3 = (m23.e) obj4;
                                            Intrinsics.checkNotNullParameter(result3, "result");
                                            if (result3 != null) {
                                                com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a aVar5 = aVar;
                                                aVar5.A1(new esa.i(aVar5, result3, null, 15), new yi5.b(25));
                                            }
                                            return Unit.f186387a;
                                    }
                                }
                            };
                            Intrinsics.checkNotNullParameter(block2, "block");
                            actionsBottomSheetController.H = block2;
                            return actionsBottomSheetController;
                        }
                        if (!Intrinsics.f(step, OrderNewCardFlowContract$ModalStep.JuniorSkip.f65100a)) {
                            if (!(step instanceof OrderNewCardFlowContract$ModalStep.SubtypePicker)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            OrderNewCardFlowContract$ModalStep.SubtypePicker subtypePicker = (OrderNewCardFlowContract$ModalStep.SubtypePicker) step;
                            CardSubtypePickerBottomSheetController cardSubtypePickerBottomSheetController = new CardSubtypePickerBottomSheetController(new m23.d(subtypePicker.f65101a, subtypePicker.f65102b, subtypePicker.f65103c, subtypePicker.d));
                            final int i5 = 3;
                            Function1 block3 = new Function1() { // from class: f23.w
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    switch (i5) {
                                        case 0:
                                            n23.h output = (n23.h) obj4;
                                            Intrinsics.checkNotNullParameter(output, "output");
                                            if (output == null) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            oki.h.v2(aVar.f65110x, output.f211435a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                            return Unit.f186387a;
                                        case 1:
                                            dii.g result = (dii.g) obj4;
                                            Intrinsics.checkNotNullParameter(result, "result");
                                            if (Intrinsics.f(result, dii.f.f115069a)) {
                                                com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a aVar32 = aVar;
                                                NaviCommand naviCommand2 = aVar32.o.f65097m;
                                                if (naviCommand2 != null) {
                                                    aVar32.C1(u0.b(naviCommand2));
                                                } else {
                                                    aVar32.B2();
                                                }
                                            }
                                            return Unit.f186387a;
                                        case 2:
                                            dii.g result2 = (dii.g) obj4;
                                            Intrinsics.checkNotNullParameter(result2, "result");
                                            if (Intrinsics.f(result2, dii.f.f115069a)) {
                                                com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a aVar42 = aVar;
                                                NaviCommand naviCommand3 = aVar42.o.f65096l;
                                                if (naviCommand3 != null) {
                                                    aVar42.C1(u0.b(naviCommand3));
                                                } else {
                                                    aVar42.B2();
                                                }
                                            }
                                            return Unit.f186387a;
                                        default:
                                            m23.e result3 = (m23.e) obj4;
                                            Intrinsics.checkNotNullParameter(result3, "result");
                                            if (result3 != null) {
                                                com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a aVar5 = aVar;
                                                aVar5.A1(new esa.i(aVar5, result3, null, 15), new yi5.b(25));
                                            }
                                            return Unit.f186387a;
                                    }
                                }
                            };
                            Intrinsics.checkNotNullParameter(block3, "block");
                            cardSubtypePickerBottomSheetController.H = block3;
                            return cardSubtypePickerBottomSheetController;
                        }
                        iVar.getClass();
                        lw0.a aVar4 = new lw0.a(new TextLocalisedClause(R$string.rev_u18_card_order_skip_confirmation_title, null, null, 14), new TextLocalisedClause(R$string.rev_u18_card_order_skip_confirmation_subtitle, null, null, 14), null, null, false, 28);
                        m6 m6Var2 = n6.Companion;
                        aw0.h hVar3 = new aw0.h(false, m6.c(m6Var2, new TextLocalisedClause(R$string.rev_u18_card_order_skip_confirmation_button_get_card, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var2, new TextLocalisedClause(R$string.rev_u18_card_order_skip_confirmation_button_skip, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, null, 1020), null, null, null, 121);
                        k9 k9Var2 = k9.Cards;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                        ActionsBottomSheetController actionsBottomSheetController2 = new ActionsBottomSheetController(new dii.a(aVar4, hVar3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), null, null, 24));
                        final int i6 = 2;
                        Function1 block4 = new Function1() { // from class: f23.w
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                switch (i6) {
                                    case 0:
                                        n23.h output = (n23.h) obj4;
                                        Intrinsics.checkNotNullParameter(output, "output");
                                        if (output == null) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oki.h.v2(aVar.f65110x, output.f211435a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                        return Unit.f186387a;
                                    case 1:
                                        dii.g result = (dii.g) obj4;
                                        Intrinsics.checkNotNullParameter(result, "result");
                                        if (Intrinsics.f(result, dii.f.f115069a)) {
                                            com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a aVar32 = aVar;
                                            NaviCommand naviCommand2 = aVar32.o.f65097m;
                                            if (naviCommand2 != null) {
                                                aVar32.C1(u0.b(naviCommand2));
                                            } else {
                                                aVar32.B2();
                                            }
                                        }
                                        return Unit.f186387a;
                                    case 2:
                                        dii.g result2 = (dii.g) obj4;
                                        Intrinsics.checkNotNullParameter(result2, "result");
                                        if (Intrinsics.f(result2, dii.f.f115069a)) {
                                            com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a aVar42 = aVar;
                                            NaviCommand naviCommand3 = aVar42.o.f65096l;
                                            if (naviCommand3 != null) {
                                                aVar42.C1(u0.b(naviCommand3));
                                            } else {
                                                aVar42.B2();
                                            }
                                        }
                                        return Unit.f186387a;
                                    default:
                                        m23.e result3 = (m23.e) obj4;
                                        Intrinsics.checkNotNullParameter(result3, "result");
                                        if (result3 != null) {
                                            com.revolut.feature.card_order_new.impl.kompot.ordernewcard.a aVar5 = aVar;
                                            aVar5.A1(new esa.i(aVar5, result3, null, 15), new yi5.b(25));
                                        }
                                        return Unit.f186387a;
                                }
                            }
                        };
                        Intrinsics.checkNotNullParameter(block4, "block");
                        actionsBottomSheetController2.H = block4;
                        return actionsBottomSheetController2;
                }
            }
        });
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.f65109w;
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f65110x;
    }

    @Override // yji.l
    public final void T1(long j2) {
        OrderNewCardFlowContract$InputData orderNewCardFlowContract$InputData = this.o;
        SelectedTab selectedTab = orderNewCardFlowContract$InputData.f65090a;
        zn3.a aVar = orderNewCardFlowContract$InputData.f;
        CardOrderAccountWrapper accountWrapper = orderNewCardFlowContract$InputData.f65091b;
        l0 l0Var = this.f65104p;
        l0Var.getClass();
        Intrinsics.checkNotNullParameter(accountWrapper, "accountWrapper");
        Intrinsics.checkNotNullParameter(accountWrapper, "accountWrapper");
        Continuation continuation = null;
        Flow gVar = ((com.revolut.feature.card_order_new.api.a.a(accountWrapper) instanceof AccountId.Joint) || aVar == zn3.a.ONBOARDING) ? new g(Boolean.FALSE, 2) : new y(((s3) l0Var.f131388a).s(), new eob.e(3, 9, null));
        Intrinsics.checkNotNullParameter(accountWrapper, "accountWrapper");
        Flow gVar2 = com.revolut.feature.card_order_new.api.a.a(accountWrapper) instanceof AccountId.Joint ? new g(Boolean.FALSE, 2) : new y(new v1(new h0(l0Var, continuation, 1)), new eob.e(3, 16, null));
        Intrinsics.checkNotNullParameter(accountWrapper, "accountWrapper");
        Flow gVar3 = ((com.revolut.feature.card_order_new.api.a.a(accountWrapper) instanceof AccountId.Joint) || aVar == zn3.a.ONBOARDING) ? new g(Boolean.FALSE, 2) : new y(vkm.q.Q(((et6.l0) l0Var.f131390c).m(), new dz6.n(continuation, l0Var, 27)), new eob.e(3, 13, null));
        Intrinsics.checkNotNullParameter(accountWrapper, "accountWrapper");
        int i = 0;
        k kVar = new k(new Flow[]{gVar, gVar2, gVar3, com.revolut.feature.card_order_new.api.a.a(accountWrapper) instanceof AccountId.Joint ? new g(Boolean.TRUE, 2) : new y(new p(l0Var.e.c(), 15), new eob.e(3, 14, null)), new y(new c(bla.b.b(l0Var.f, "YOUTH"), 8), new eob.e(3, 15, null)), new t38.e(new y(new eq8.g(rd0.e.b(l0Var.f131391g.a()), 16), new eob.e(3, 10, null)), 24, new y(new c1(new v1(new h0(l0Var, continuation, i)), 8), new eob.e(3, 11, null)), new g0(3, 0, null))}, 17);
        f fVar = this.f65107s;
        l.b1(this, ta6.a.h(kVar, (Flow) fVar.f180318g.getValue(), fVar.a(), x.f131422a), null, new f23.y(this, selectedTab, continuation, i), 3);
        l.b1(this, ((om4.f) this.f65105q).b(), null, new a2g.q(this, (Continuation) null, 19), 3);
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return (cli.g) this.v.getValue();
    }
}

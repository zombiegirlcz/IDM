package cie;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.models.navbar.NavBarMessage;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.core.ui_kit.views.slider_layout.HomeOverlayConfig;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig;
import com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle;
import com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitleAction;
import com.revolut.feature.tab.accounts.impl.ui.tab.AccountsController;
import com.revolut.feature.tab.accounts.impl.ui.tab.TabAccountsScreenContract$ModalStep;
import com.revolut.feature.tab.accounts.impl.ui.tab.TabAccountsScreenContract$State;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.transition.ZoomTarget;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.common.ui.model.NewsUiItem;
import ip0.t80;
import ip0.u80;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vge.t3;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AccountsController f24487w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(AccountsController accountsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f24487w = accountsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f24487w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            case 1:
                i iVar2 = new i(this.f24487w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
            case 2:
                i iVar3 = new i(this.f24487w, continuation, 2);
                iVar3.v = obj2;
                return iVar3;
            case 3:
                i iVar4 = new i(this.f24487w, continuation, 3);
                iVar4.v = obj2;
                return iVar4;
            case 4:
                i iVar5 = new i(this.f24487w, continuation, 4);
                iVar5.v = obj2;
                return iVar5;
            case 5:
                i iVar6 = new i(this.f24487w, continuation, 5);
                iVar6.v = obj2;
                return iVar6;
            case 6:
                i iVar7 = new i(this.f24487w, continuation, 6);
                iVar7.v = obj2;
                return iVar7;
            case 7:
                i iVar8 = new i(this.f24487w, continuation, 7);
                iVar8.v = obj2;
                return iVar8;
            case 8:
                i iVar9 = new i(this.f24487w, continuation, 8);
                iVar9.v = obj2;
                return iVar9;
            case 9:
                i iVar10 = new i(this.f24487w, continuation, 9);
                iVar10.v = obj2;
                return iVar10;
            case 10:
                i iVar11 = new i(this.f24487w, continuation, 10);
                iVar11.v = obj2;
                return iVar11;
            case 11:
                i iVar12 = new i(this.f24487w, continuation, 11);
                iVar12.v = obj2;
                return iVar12;
            case 12:
                i iVar13 = new i(this.f24487w, continuation, 12);
                iVar13.v = obj2;
                return iVar13;
            case 13:
                i iVar14 = new i(this.f24487w, continuation, 13);
                iVar14.v = obj2;
                return iVar14;
            case 14:
                i iVar15 = new i(this.f24487w, continuation, 14);
                iVar15.v = obj2;
                return iVar15;
            default:
                i iVar16 = new i(this.f24487w, continuation, 15);
                iVar16.v = obj2;
                return iVar16;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((NewsUiItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i) create((NewsUiItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((i) create((com.revolut.core.ui_kit.delegates.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((i) create((u80) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((i) create((t80) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((i) create((t80) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((i) create((ux0.s) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((i) create((PopupMenuItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((i) create((NavBarMessage) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((i) create((NavBarMessage) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((i) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((i) create((zn.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((i) create((tx0.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((i) create((tx0.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((i) create((tx0.a0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        ProductAccountDescriptor$Value productAccountDescriptor$Value;
        int i = this.u;
        int i2 = 1;
        AccountsController accountsController = this.f24487w;
        switch (i) {
            case 0:
                NewsUiItem model = (NewsUiItem) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.tab.accounts.impl.ui.tab.d dVar = (com.revolut.feature.tab.accounts.impl.ui.tab.d) accountsController.R2();
                dVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                dVar.n2(new c84.y(model, dVar, null, 19), new whi.b(6));
                return Unit.f186387a;
            case 1:
                NewsUiItem model2 = (NewsUiItem) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.tab.accounts.impl.ui.tab.d dVar2 = (com.revolut.feature.tab.accounts.impl.ui.tab.d) accountsController.R2();
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                w8i.b bVar = dVar2.f89712w;
                String id10 = model2.f98597a;
                x8i.i iVar = (x8i.i) bVar;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(id10, "newsId");
                a61.a aVar3 = iVar.f303414a;
                Intrinsics.checkNotNullParameter(id10, "id");
                ((q71.a) aVar3.f1531b).a(id10);
                ihm.b bVar2 = (ihm.b) aVar3.f1532c;
                Unit unit = Unit.f186387a;
                bVar2.onNext(unit);
                return unit;
            case 2:
                com.revolut.core.ui_kit.delegates.t data = (com.revolut.core.ui_kit.delegates.t) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0 e0VarG3 = accountsController.R2();
                Intrinsics.h(data);
                com.revolut.feature.tab.accounts.impl.ui.tab.d dVar3 = (com.revolut.feature.tab.accounts.impl.ui.tab.d) e0VarG3;
                dVar3.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                dVar3.f89708q.b3(data);
                return Unit.f186387a;
            case 3:
                u80 clickData = (u80) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0 e0VarG32 = accountsController.R2();
                Intrinsics.h(clickData);
                com.revolut.feature.tab.accounts.impl.ui.tab.d dVar4 = (com.revolut.feature.tab.accounts.impl.ui.tab.d) e0VarG32;
                dVar4.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                ((cc7.h) dVar4.z).d3(clickData);
                return Unit.f186387a;
            case 4:
                t80 model3 = (t80) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0 e0VarG33 = accountsController.R2();
                Intrinsics.h(model3);
                com.revolut.feature.tab.accounts.impl.ui.tab.d dVar5 = (com.revolut.feature.tab.accounts.impl.ui.tab.d) e0VarG33;
                dVar5.getClass();
                Intrinsics.checkNotNullParameter(model3, "model");
                ((cc7.h) dVar5.z).c3(model3);
                return Unit.f186387a;
            case 5:
                t80 model4 = (t80) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0 e0VarG34 = accountsController.R2();
                Intrinsics.h(model4);
                com.revolut.feature.tab.accounts.impl.ui.tab.d dVar6 = (com.revolut.feature.tab.accounts.impl.ui.tab.d) e0VarG34;
                dVar6.getClass();
                Intrinsics.checkNotNullParameter(model4, "model");
                ((cc7.h) dVar6.z).b3(model4);
                return Unit.f186387a;
            case 6:
                ux0.s animationToProductState = (ux0.s) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0 e0VarG35 = accountsController.R2();
                Intrinsics.h(animationToProductState);
                com.revolut.feature.tab.accounts.impl.ui.tab.d dVar7 = (com.revolut.feature.tab.accounts.impl.ui.tab.d) e0VarG35;
                dVar7.getClass();
                Intrinsics.checkNotNullParameter(animationToProductState, "animationToProductState");
                if (animationToProductState.equals(ux0.q.f283796a)) {
                    cli.h hVar = dVar7.i0;
                    List list = (List) ((TabAccountsScreenContract$State) ((j2) hVar.f22677a).getValue()).e.getContent();
                    koi.j jVar = list != null ? (koi.j) zhm.d0.d0(list) : null;
                    ActionWidgetDelegate.Model model5 = jVar instanceof ActionWidgetDelegate.Model ? (ActionWidgetDelegate.Model) jVar : null;
                    Object obj3 = model5 != null ? model5.f51596l : null;
                    if ((obj3 instanceof fkd.r0 ? (fkd.r0) obj3 : null) != null) {
                        dVar7.H2(hVar, new ble.a0(list, model5, i2));
                    } else if (!dVar7.P2()) {
                        dVar7.Q.e3();
                    }
                } else if (!animationToProductState.equals(ux0.r.f283798a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 7:
                PopupMenuItem popupMenuItem = (PopupMenuItem) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0 e0VarG36 = accountsController.R2();
                Intrinsics.h(popupMenuItem);
                ((com.revolut.feature.tab.accounts.impl.ui.tab.d) e0VarG36).O2(popupMenuItem);
                return Unit.f186387a;
            case 8:
                NavBarMessage message = (NavBarMessage) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0 e0VarG37 = accountsController.R2();
                Intrinsics.h(message);
                com.revolut.feature.tab.accounts.impl.ui.tab.d dVar8 = (com.revolut.feature.tab.accounts.impl.ui.tab.d) e0VarG37;
                dVar8.getClass();
                Intrinsics.checkNotNullParameter(message, "message");
                dVar8.T.b3(message);
                return Unit.f186387a;
            case 9:
                NavBarMessage message2 = (NavBarMessage) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0 e0VarG38 = accountsController.R2();
                Intrinsics.h(message2);
                com.revolut.feature.tab.accounts.impl.ui.tab.d dVar9 = (com.revolut.feature.tab.accounts.impl.ui.tab.d) e0VarG38;
                dVar9.getClass();
                Intrinsics.checkNotNullParameter(message2, "message");
                dVar9.T.c3(message2);
                return Unit.f186387a;
            case 10:
                List list2 = (List) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0 e0VarG39 = accountsController.R2();
                Intrinsics.h(list2);
                ((com.revolut.feature.tab.accounts.impl.ui.tab.d) e0VarG39).O2(new mhe.k(list2));
                return Unit.f186387a;
            case 11:
                zn.f viewableRecordSnapshot = (zn.f) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.tab.accounts.impl.ui.tab.d dVar10 = (com.revolut.feature.tab.accounts.impl.ui.tab.d) accountsController.R2();
                dVar10.getClass();
                Intrinsics.checkNotNullParameter(viewableRecordSnapshot, "viewableRecordSnapshot");
                dVar10.I.b3(viewableRecordSnapshot);
                return Unit.f186387a;
            case 12:
                tx0.r model6 = (tx0.r) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0 e0VarG310 = accountsController.R2();
                Intrinsics.h(model6);
                com.revolut.feature.tab.accounts.impl.ui.tab.d dVar11 = (com.revolut.feature.tab.accounts.impl.ui.tab.d) e0VarG310;
                cli.h hVar2 = dVar11.i0;
                Intrinsics.checkNotNullParameter(model6, "model");
                if ((model6 instanceof tx0.g) && (productAccountDescriptor$Value = ((TabAccountsScreenContract$State) ((j2) hVar2.f22677a).getValue()).k) != null) {
                    if (((TabAccountsScreenContract$State) ((j2) hVar2.f22677a).getValue()).f89697t) {
                        oki.h.v2(dVar11.p0, new TabAccountsScreenContract$ModalStep.UnhideAccount(productAccountDescriptor$Value.getF89728b().f89729a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    } else {
                        ProductAccountDescriptor$Value productAccountDescriptor$Value2 = ((TabAccountsScreenContract$State) ((j2) dVar11.i0.f22677a).getValue()).k;
                        if (productAccountDescriptor$Value2 != null) {
                            dVar11.n2(new q0(dVar11, productAccountDescriptor$Value2, null, null, 0), new whi.b(6));
                        }
                    }
                }
                return Unit.f186387a;
            case 13:
                tx0.r model7 = (tx0.r) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0 e0VarG311 = accountsController.R2();
                Intrinsics.h(model7);
                com.revolut.feature.tab.accounts.impl.ui.tab.d dVar12 = (com.revolut.feature.tab.accounts.impl.ui.tab.d) e0VarG311;
                dVar12.getClass();
                cli.h hVar3 = dVar12.i0;
                Intrinsics.checkNotNullParameter(model7, "model");
                tx0.g gVar = model7 instanceof tx0.g ? (tx0.g) model7 : null;
                if (gVar != null) {
                    Object obj4 = gVar.f275133l;
                    Parcelable parcelable = obj4 instanceof ProductAccountSubtitle ? (ProductAccountSubtitle) obj4 : null;
                    if (parcelable instanceof sfe.t) {
                        ProductAccountSubtitleAction d = ((sfe.t) parcelable).getD();
                        if (d instanceof ProductAccountSubtitleAction.SwitchToAccountIdAction) {
                            ((t3) dVar12.f89710s).t(((ProductAccountSubtitleAction.SwitchToAccountIdAction) d).f89530b, tge.b.SWITCHED);
                        } else if (d instanceof ProductAccountSubtitleAction.General) {
                            Parcelable parcelable2 = ((ProductAccountSubtitleAction.General) d).f89529b;
                            ProductAccountDescriptor$Value productAccountDescriptor$Value3 = ((TabAccountsScreenContract$State) ((j2) hVar3.f22677a).getValue()).k;
                            if (productAccountDescriptor$Value3 != null) {
                                dVar12.n2(new q0(dVar12, productAccountDescriptor$Value3, parcelable2, null, 0), new whi.b(6));
                            }
                        } else {
                            ProductAccountDescriptor$Value productAccountDescriptor$Value4 = ((TabAccountsScreenContract$State) ((j2) hVar3.f22677a).getValue()).k;
                            if (productAccountDescriptor$Value4 != null) {
                                dVar12.n2(new q0(dVar12, productAccountDescriptor$Value4, null, null, 0), new whi.b(6));
                            }
                        }
                    } else {
                        ProductAccountDescriptor$Value productAccountDescriptor$Value5 = ((TabAccountsScreenContract$State) ((j2) hVar3.f22677a).getValue()).k;
                        if (productAccountDescriptor$Value5 != null) {
                            dVar12.n2(new q0(dVar12, productAccountDescriptor$Value5, null, null, 0), new whi.b(6));
                        }
                    }
                }
                return Unit.f186387a;
            case 14:
                tx0.a0 data2 = (tx0.a0) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0 e0VarG312 = accountsController.R2();
                Intrinsics.h(data2);
                com.revolut.feature.tab.accounts.impl.ui.tab.d dVar13 = (com.revolut.feature.tab.accounts.impl.ui.tab.d) e0VarG312;
                dVar13.getClass();
                Intrinsics.checkNotNullParameter(data2, "data");
                Parcelable parcelable3 = data2.f275079b;
                ProductAccountSubtitle.CopyValue copyValue = parcelable3 instanceof ProductAccountSubtitle.CopyValue ? (ProductAccountSubtitle.CopyValue) parcelable3 : null;
                if (copyValue != null) {
                    dVar13.f89702e0.c(null, copyValue.f89520a, true, new l0(dVar13, 0));
                }
                return Unit.f186387a;
            default:
                String menuItemId = (String) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e0 e0VarG313 = accountsController.R2();
                Intrinsics.h(menuItemId);
                com.revolut.feature.tab.accounts.impl.ui.tab.d dVar14 = (com.revolut.feature.tab.accounts.impl.ui.tab.d) e0VarG313;
                dVar14.getClass();
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                if (menuItemId.equals("cards_menu_item")) {
                    dVar14.C1(new MainContainerScreenDestination.Slide(dy0.o.LEFT, false));
                } else if (menuItemId.equals("analytics_menu_item")) {
                    ProductAccountDescriptor$Value productAccountDescriptor$Value6 = ((TabAccountsScreenContract$State) ((j2) dVar14.i0.f22677a).getValue()).k;
                    TransitionAnimation.Companion companion = TransitionAnimation.INSTANCE;
                    ZoomTarget.ListId listId = new ZoomTarget.ListId("analytics_menu_item");
                    HomeOverlayConfig.INSTANCE.getClass();
                    dVar14.C1(new AnalyticsFeatureConfig.Dashboard.Destination(productAccountDescriptor$Value6, com.revolut.kompot.common.transition.a.d(companion, listId, HomeOverlayConfig.f59654b)));
                }
                return Unit.f186387a;
        }
    }
}

package nme;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.models.navbar.NavBarMessage;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.feature.cashback.api.navigation.YourCashbackFeatureConfig;
import com.revolut.feature.lifestyle.content_gateway.api.ui.HeaderSlotPayload;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.rev_points.api.navigation.RevPointsTrophyRoomDestination;
import com.revolut.feature.tab.lifestyle.impl.ui.screen.TabLifestyleScreen;
import com.revolut.kompot.common.transition.ZoomTarget;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tx0.f4;
import vkm.j2;
import vkm.z1;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TabLifestyleScreen f217294w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TabLifestyleScreen tabLifestyleScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f217294w = tabLifestyleScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f217294w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f217294w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            case 2:
                d dVar3 = new d(this.f217294w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
            case 3:
                d dVar4 = new d(this.f217294w, continuation, 3);
                dVar4.v = obj2;
                return dVar4;
            case 4:
                d dVar5 = new d(this.f217294w, continuation, 4);
                dVar5.v = obj2;
                return dVar5;
            case 5:
                d dVar6 = new d(this.f217294w, continuation, 5);
                dVar6.v = obj2;
                return dVar6;
            case 6:
                d dVar7 = new d(this.f217294w, continuation, 6);
                dVar7.v = obj2;
                return dVar7;
            case 7:
                d dVar8 = new d(this.f217294w, continuation, 7);
                dVar8.v = obj2;
                return dVar8;
            default:
                d dVar9 = new d(this.f217294w, continuation, 8);
                dVar9.v = obj2;
                return dVar9;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((PopupMenuItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((d) create((tx0.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((d) create((NavBarMessage) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((d) create((NavBarMessage) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((d) create((f4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((d) create((ux0.s) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((zn.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TabLifestyleScreen tabLifestyleScreen = this.f217294w;
        switch (i) {
            case 0:
                List listItems = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z zVarG3 = tabLifestyleScreen.d();
                Intrinsics.h(listItems);
                com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar = (com.revolut.feature.tab.lifestyle.impl.ui.screen.f) zVarG3;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(listItems, "listItems");
                fVar.f89944e0.onNext(listItems);
                return Unit.f186387a;
            case 1:
                PopupMenuItem popupMenuItem = (PopupMenuItem) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (Intrinsics.f(popupMenuItem.getF55172b(), "LIFESTYLE_ACTION_ADD_WIDGET_ID")) {
                    ((com.revolut.feature.tab.lifestyle.impl.ui.screen.f) tabLifestyleScreen.d()).K2("LIFESTYLE_ACTION_ADD_WIDGET_ID");
                }
                return Unit.f186387a;
            case 2:
                tx0.r rVar = (tx0.r) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.tab.lifestyle.impl.ui.screen.f) tabLifestyleScreen.d()).K2(rVar.getId());
                return Unit.f186387a;
            case 3:
                NavBarMessage message = (NavBarMessage) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z zVarG32 = tabLifestyleScreen.d();
                Intrinsics.h(message);
                com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar2 = (com.revolut.feature.tab.lifestyle.impl.ui.screen.f) zVarG32;
                fVar2.getClass();
                Intrinsics.checkNotNullParameter(message, "message");
                fVar2.O.b3(message);
                return Unit.f186387a;
            case 4:
                NavBarMessage message2 = (NavBarMessage) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z zVarG33 = tabLifestyleScreen.d();
                Intrinsics.h(message2);
                com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar3 = (com.revolut.feature.tab.lifestyle.impl.ui.screen.f) zVarG33;
                fVar3.getClass();
                Intrinsics.checkNotNullParameter(message2, "message");
                fVar3.O.c3(message2);
                return Unit.f186387a;
            case 5:
                String menuItemId = (String) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z zVarG34 = tabLifestyleScreen.d();
                Intrinsics.h(menuItemId);
                pme.a aVar7 = ((com.revolut.feature.tab.lifestyle.impl.ui.screen.f) zVarG34).K;
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                int iHashCode = menuItemId.hashCode();
                if (iHashCode != -823737236) {
                    if (iHashCode != 444809827) {
                        if (iHashCode == 1870432124 && menuItemId.equals("TROPHY_ROOM_MENU_ITEM_ID")) {
                            ZoomTarget.ListId listId = new ZoomTarget.ListId("TROPHY_ROOM_MENU_ITEM_ID");
                            pme.b bVar = (pme.b) aVar7;
                            bVar.getClass();
                            bVar.A2(new RevPointsTrophyRoomDestination(listId));
                        }
                    } else if (menuItemId.equals("CARDS_MENU_ITEM_ID")) {
                        pme.b bVar2 = (pme.b) aVar7;
                        bVar2.getClass();
                        bVar2.A2(new MainContainerScreenDestination.Slide(dy0.o.LEFT, false));
                    }
                } else if (menuItemId.equals("REVOLUT_CASHBACK_MENU_ITEM_ID")) {
                    ZoomTarget.ListId listId2 = new ZoomTarget.ListId("REVOLUT_CASHBACK_MENU_ITEM_ID");
                    pme.b bVar3 = (pme.b) aVar7;
                    bVar3.getClass();
                    bVar3.A2(new YourCashbackFeatureConfig.HomeDestination(listId2, true));
                }
                return Unit.f186387a;
            case 6:
                f4 item = (f4) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z zVarG35 = tabLifestyleScreen.d();
                Intrinsics.h(item);
                com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar4 = (com.revolut.feature.tab.lifestyle.impl.ui.screen.f) zVarG35;
                fVar4.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                HeaderSlotPayload headerSlotPayload = item.e;
                fVar4.z.Z2(headerSlotPayload);
                fVar4.M2(headerSlotPayload.f78049b, headerSlotPayload.f78050c, headerSlotPayload);
                return Unit.f186387a;
            case 7:
                ux0.s state = (ux0.s) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z zVarG36 = tabLifestyleScreen.d();
                Intrinsics.h(state);
                com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar5 = (com.revolut.feature.tab.lifestyle.impl.ui.screen.f) zVarG36;
                fVar5.getClass();
                Intrinsics.checkNotNullParameter(state, "state");
                if (state.equals(ux0.q.f283796a)) {
                    List list = ((com.revolut.feature.tab.lifestyle.impl.ui.screen.a) ((j2) fVar5.g0.f22677a).getValue()).f89934r;
                    Object objD0 = zhm.d0.d0(list);
                    ActionWidgetDelegate.Model model = objD0 instanceof ActionWidgetDelegate.Model ? (ActionWidgetDelegate.Model) objD0 : null;
                    Object obj3 = model != null ? model.f51596l : null;
                    if ((obj3 instanceof fkd.r0 ? (fkd.r0) obj3 : null) == null) {
                        ((z1) fVar5.N.f178696c).k(Unit.f186387a);
                    } else {
                        fVar5.N2(new ble.a0(list, model, 3));
                    }
                } else if (!state.equals(ux0.r.f283798a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            default:
                zn.f viewableRecordSnapshot = (zn.f) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar6 = (com.revolut.feature.tab.lifestyle.impl.ui.screen.f) tabLifestyleScreen.d();
                fVar6.getClass();
                Intrinsics.checkNotNullParameter(viewableRecordSnapshot, "viewableRecordSnapshot");
                fVar6.z.b3(viewableRecordSnapshot);
                return Unit.f186387a;
        }
    }
}

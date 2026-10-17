package hp3;

import android.R;
import android.net.Uri;
import au0.j4;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.corporate_events.impl.ui.screen.home.CorporateEventsHomeScreen;
import com.revolut.feature.corporate_events.impl.ui.screen.home.a;
import com.revolut.feature.corporate_events.impl.ui.screen.type_filter.CorporateEventsTypeFilterScreen;
import com.revolut.feature.corporate_events.impl.ui.screen.type_filter.CorporateEventsTypeFilterScreenContract$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.BrowserCommand;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import com.youTransactor.uCube.rpc.Constants;
import ip0.um0;
import ip0.vd;
import ip0.wd;
import java.time.LocalDate;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CorporateEventsHomeScreen f154401w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CorporateEventsHomeScreen corporateEventsHomeScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f154401w = corporateEventsHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f154401w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f154401w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            case 2:
                c cVar3 = new c(this.f154401w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
            case 3:
                c cVar4 = new c(this.f154401w, continuation, 3);
                cVar4.v = obj2;
                return cVar4;
            case 4:
                c cVar5 = new c(this.f154401w, continuation, 4);
                cVar5.v = obj2;
                return cVar5;
            case 5:
                c cVar6 = new c(this.f154401w, continuation, 5);
                cVar6.v = obj2;
                return cVar6;
            case 6:
                c cVar7 = new c(this.f154401w, continuation, 6);
                cVar7.v = obj2;
                return cVar7;
            case 7:
                c cVar8 = new c(this.f154401w, continuation, 7);
                cVar8.v = obj2;
                return cVar8;
            default:
                c cVar9 = new c(this.f154401w, continuation, 8);
                cVar9.v = obj2;
                return cVar9;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((t60.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c) create((vd) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((c) create((wd) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((c) create((p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((c) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((c) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int iIntValue;
        iel.i iVarA;
        String str;
        String strI;
        int i = this.u;
        LocalDate localDateF = null;
        localDateF = null;
        CorporateEventsHomeScreen corporateEventsHomeScreen = this.f154401w;
        switch (i) {
            case 0:
                String input = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarR2 = corporateEventsHomeScreen.R2();
                Intrinsics.h(input);
                com.revolut.feature.corporate_events.impl.ui.screen.home.b bVar = (com.revolut.feature.corporate_events.impl.ui.screen.home.b) nVarR2;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(input, "input");
                bVar.B.onNext(input);
                return Unit.f186387a;
            case 1:
                t60.h hVar = (t60.h) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (hVar == t60.h.DRAGGING) {
                    CorporateEventsHomeScreen.Companion companion = CorporateEventsHomeScreen.INSTANCE;
                    e0m.e.a(corporateEventsHomeScreen.f3());
                }
                return Unit.f186387a;
            case 2:
                vd clickData = (vd) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarR22 = corporateEventsHomeScreen.R2();
                Intrinsics.h(clickData);
                com.revolut.feature.corporate_events.impl.ui.screen.home.b bVar2 = (com.revolut.feature.corporate_events.impl.ui.screen.home.b) nVarR22;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                bVar2.H2(bVar2.f66146x, new hm3.b(bVar2, clickData.f166807b, 14));
                j60.a.v(bVar2.f66143s, false, null, 3);
                return Unit.f186387a;
            case 3:
                wd displayData = (wd) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarR23 = corporateEventsHomeScreen.R2();
                Intrinsics.h(displayData);
                com.revolut.feature.corporate_events.impl.ui.screen.home.b bVar3 = (com.revolut.feature.corporate_events.impl.ui.screen.home.b) nVarR23;
                bVar3.getClass();
                Intrinsics.checkNotNullParameter(displayData, "displayData");
                bVar3.C = displayData.f166988b;
                return Unit.f186387a;
            case 4:
                p visibilityReport = (p) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarR24 = corporateEventsHomeScreen.R2();
                Intrinsics.h(visibilityReport);
                Integer num = corporateEventsHomeScreen.f0;
                com.revolut.feature.corporate_events.impl.ui.screen.home.b bVar4 = (com.revolut.feature.corporate_events.impl.ui.screen.home.b) nVarR24;
                bVar4.getClass();
                Intrinsics.checkNotNullParameter(visibilityReport, "visibilityReport");
                List items = visibilityReport.f154429c;
                int i2 = visibilityReport.f154427a;
                IntRange intRange = new IntRange(i2, visibilityReport.f154428b, 1);
                String str2 = ((m) ((j2) bVar4.f66146x.f22677a).getValue()).f;
                a.b bVar5 = a.b.f66138a;
                a.c cVar = a.c.f66139a;
                a.C0469a c0469a = a.C0469a.f66137a;
                com.revolut.feature.corporate_events.impl.ui.screen.home.a aVar6 = ((str2 != null && str2.length() > 0) || num == null || items.isEmpty() || i2 == -1 || (i2 <= (iIntValue = num.intValue()) && iIntValue <= intRange.f186449b)) ? c0469a : i2 > num.intValue() ? cVar : bVar5;
                if (!Intrinsics.f(corporateEventsHomeScreen.f66133e0, aVar6)) {
                    if (aVar6.equals(c0469a)) {
                        corporateEventsHomeScreen.g3().animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(150L).withEndAction(new fp0.l(corporateEventsHomeScreen, 7)).start();
                    } else {
                        if (!aVar6.equals(bVar5) && !aVar6.equals(cVar)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        corporateEventsHomeScreen.g3().setImage(new ResourceImage(aVar6.equals(cVar) ? R$drawable.uikit_icn_24_arrow_thin_up : R$drawable.uikit_icn_24_arrow_thin_down, Integer.valueOf(R.color.white), (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, Constants.TAG_FC_SPEED_MODE));
                        if (Intrinsics.f(corporateEventsHomeScreen.f66133e0, c0469a)) {
                            corporateEventsHomeScreen.g3().setVisibility(0);
                            corporateEventsHomeScreen.g3().animate().alpha(1.0f).setDuration(150L).start();
                        }
                    }
                    corporateEventsHomeScreen.f66133e0 = aVar6;
                }
                com.revolut.feature.corporate_events.impl.ui.screen.home.b bVar6 = (com.revolut.feature.corporate_events.impl.ui.screen.home.b) corporateEventsHomeScreen.R2();
                bVar6.getClass();
                Intrinsics.checkNotNullParameter(items, "items");
                bVar6.E.getClass();
                kp3.b bVar7 = (kp3.b) d0.d0(g2e.t.i(items));
                if (bVar7 != null && (iVarA = bVar7.a()) != null) {
                    localDateF = iVarA.f();
                }
                bVar6.D = localDateF;
                jp3.f fVar = bVar6.F;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(items, "items");
                fVar.f177203c = items;
                fVar.a(items);
                return Unit.f186387a;
            case 5:
                String tabId = (String) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarR25 = corporateEventsHomeScreen.R2();
                Intrinsics.h(tabId);
                com.revolut.feature.corporate_events.impl.ui.screen.home.b bVar8 = (com.revolut.feature.corporate_events.impl.ui.screen.home.b) nVarR25;
                bVar8.getClass();
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                q.Companion.getClass();
                if (k.f154409b.contains(tabId)) {
                    bVar8.z.onNext(tabId);
                }
                return Unit.f186387a;
            case 6:
                um0 model = (um0) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarR26 = corporateEventsHomeScreen.R2();
                Intrinsics.h(model);
                com.revolut.feature.corporate_events.impl.ui.screen.home.b bVar9 = (com.revolut.feature.corporate_events.impl.ui.screen.home.b) nVarR26;
                bVar9.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj3 = model.d;
                if (Intrinsics.f(model.f166695a, "CORPORATE_EVENTS_TWIN_BUTTON_ID")) {
                    kp3.a aVar9 = obj3 instanceof kp3.a ? (kp3.a) obj3 : null;
                    iel.a aVar10 = aVar9 != null ? aVar9.f188164a : null;
                    iel.h hVar2 = aVar10 instanceof iel.h ? (iel.h) aVar10 : null;
                    if (hVar2 != null && (str = hVar2.d) != null) {
                        bVar9.C1(new AssetDetailsDestination(str, null, false, null, null, null, 62));
                    }
                }
                return Unit.f186387a;
            case 7:
                um0 model2 = (um0) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarR27 = corporateEventsHomeScreen.R2();
                Intrinsics.h(model2);
                com.revolut.feature.corporate_events.impl.ui.screen.home.b bVar10 = (com.revolut.feature.corporate_events.impl.ui.screen.home.b) nVarR27;
                bVar10.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                if (Intrinsics.f(model2.f166695a, "CORPORATE_EVENTS_TWIN_BUTTON_ID")) {
                    Object obj4 = model2.d;
                    kp3.a aVar12 = obj4 instanceof kp3.a ? (kp3.a) obj4 : null;
                    iel.a aVar13 = aVar12 != null ? aVar12.f188164a : null;
                    iel.h hVar3 = aVar13 instanceof iel.h ? (iel.h) aVar13 : null;
                    if (hVar3 != null && (strI = oi0.d.i(hVar3)) != null) {
                        Uri uri2 = Uri.parse(strI);
                        Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
                        bVar10.C1(new BridgeDestination(new BrowserCommand(uri2)));
                    }
                }
                return Unit.f186387a;
            default:
                String menuItemId = (String) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (Intrinsics.f(menuItemId, "SEARCH_MENU_ITEM_ID")) {
                    CorporateEventsHomeScreen.Companion companion2 = CorporateEventsHomeScreen.INSTANCE;
                    corporateEventsHomeScreen.d3().e.setVisibility(8);
                    NavBarWithToolbar corporateEventsHomeNavBar = corporateEventsHomeScreen.d3().f307592b;
                    Intrinsics.checkNotNullExpressionValue(corporateEventsHomeNavBar, "corporateEventsHomeNavBar");
                    corporateEventsHomeNavBar.K0(j4.FROM_CLICKED_BUTTON);
                    corporateEventsHomeNavBar.post(new cgd.e(corporateEventsHomeNavBar, 1));
                } else {
                    n nVarR28 = corporateEventsHomeScreen.R2();
                    Intrinsics.h(menuItemId);
                    com.revolut.feature.corporate_events.impl.ui.screen.home.b bVar11 = (com.revolut.feature.corporate_events.impl.ui.screen.home.b) nVarR28;
                    cli.y yVar = bVar11.f66146x;
                    Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                    if (menuItemId.equals("FILTER_MENU_ITEM_ID")) {
                        bVar11.Y1(new CorporateEventsTypeFilterScreen(new CorporateEventsTypeFilterScreenContract$InputData(((m) ((j2) yVar.f22677a).getValue()).f154414b, ((m) ((j2) yVar.f22677a).getValue()).f154415c)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new hg4.a(bVar11, 27));
                    } else if (menuItemId.equals("CALENDAR_MENU_ITEM_ID")) {
                        LocalDate localDate = bVar11.D;
                        if (localDate != null) {
                            if (localDate.equals(((m) ((j2) yVar.f22677a).getValue()).f154413a)) {
                                localDate = null;
                            }
                            if (localDate != null) {
                                bVar11.H2(yVar, new a15.l(10, localDate));
                            }
                        }
                        bVar11.I2(null);
                    }
                }
                return Unit.f186387a;
        }
    }
}

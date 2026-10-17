package hbg;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.delegates.u8;
import com.revolut.core.ui_kit.delegates.ve;
import com.revolut.core.ui_kit.delegates.w8;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.TravelHotelsBookingDetailsScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.TravelHotelsBookingDetailsScreenContract$ModalStep;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.map_preview.TravelHotelsPropertyOnMap;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelHotelsBookingDetailsScreen f150696w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(TravelHotelsBookingDetailsScreen travelHotelsBookingDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f150696w = travelHotelsBookingDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f150696w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f150696w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            case 2:
                e eVar3 = new e(this.f150696w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
            case 3:
                e eVar4 = new e(this.f150696w, continuation, 3);
                eVar4.v = obj2;
                return eVar4;
            case 4:
                e eVar5 = new e(this.f150696w, continuation, 4);
                eVar5.v = obj2;
                return eVar5;
            case 5:
                e eVar6 = new e(this.f150696w, continuation, 5);
                eVar6.v = obj2;
                return eVar6;
            default:
                e eVar7 = new e(this.f150696w, continuation, 6);
                eVar7.v = obj2;
                return eVar7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((com.revolut.core.ui_kit.delegates.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((e) create((w8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((e) create((u8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((e) create((ve) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((e) create((ve) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((sa) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 0;
        TravelHotelsBookingDetailsScreen travelHotelsBookingDetailsScreen = this.f150696w;
        switch (i) {
            case 0:
                com.revolut.core.ui_kit.delegates.t clickData = (com.revolut.core.ui_kit.delegates.t) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarE3 = travelHotelsBookingDetailsScreen.R2();
                Intrinsics.h(clickData);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b bVar = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b) tVarE3;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                String str = clickData.f54722b.f51590a;
                if (Intrinsics.f(str, "REV_POINTS_PAY_LATER_BANNER_ID")) {
                    if (Intrinsics.f(clickData.f54721a, ActionWidgetDelegate.a.d.f51610a)) {
                        bVar.L2();
                    }
                } else if (Intrinsics.f(str, "CHECK_IN_INSTRUCTIONS_ITEM_ID")) {
                    oki.h.v2(bVar.Q, new TravelHotelsBookingDetailsScreenContract$ModalStep.CheckInInstructions(bVar.o.f93646a), ModalDestination.Style.POPUP.f98311a);
                }
                break;
            case 1:
                String menuId = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarE32 = travelHotelsBookingDetailsScreen.R2();
                Intrinsics.h(menuId);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b bVar2 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b) tVarE32;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(menuId, "menuId");
                if (Intrinsics.f(menuId, "SHARE_PDF_MENU_ITEM_ID")) {
                    bVar2.N2();
                }
                break;
            case 2:
                w8 model = (w8) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarE33 = travelHotelsBookingDetailsScreen.R2();
                Intrinsics.h(model);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b bVar3 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b) tVarE33;
                bVar3.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                rei.g gVar = (rei.g) ((l) ((j2) bVar3.P.f22677a).getValue()).f150703a.getContent();
                if (gVar != null) {
                    bVar3.C2(new n(new TravelHotelsPropertyOnMap(gVar.f.d.f98039a)));
                }
                break;
            case 3:
                u8 model2 = (u8) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarE34 = travelHotelsBookingDetailsScreen.R2();
                Intrinsics.h(model2);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b bVar4 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b) tVarE34;
                bVar4.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                bVar4.M2();
                break;
            case 4:
                ve model3 = (ve) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarE35 = travelHotelsBookingDetailsScreen.R2();
                Intrinsics.h(model3);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b bVar5 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b) tVarE35;
                bVar5.getClass();
                Intrinsics.checkNotNullParameter(model3, "model");
                bVar5.K2(false);
                break;
            case 5:
                ve model4 = (ve) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarE36 = travelHotelsBookingDetailsScreen.R2();
                Intrinsics.h(model4);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b bVar6 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b) tVarE36;
                bVar6.getClass();
                Intrinsics.checkNotNullParameter(model4, "model");
                Object obj3 = model4.f54872j;
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature_travel_hotels_models.booking.details.HotelsPropertyBookingRoom");
                rei.k kVar = (rei.k) obj3;
                rei.g gVar2 = (rei.g) ((l) ((j2) bVar6.P.f22677a).getValue()).f150703a.getContent();
                if (gVar2 != null) {
                    bVar6.n2(new gsh.w(bVar6, gVar2, kVar, null, 21), new whi.b(6));
                }
                break;
            default:
                sa model5 = (sa) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarE37 = travelHotelsBookingDetailsScreen.R2();
                Intrinsics.h(model5);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b bVar7 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b) tVarE37;
                bVar7.getClass();
                Intrinsics.checkNotNullParameter(model5, "model");
                String str2 = model5.f54700a;
                int iHashCode = str2.hashCode();
                Object[] objArr = 0;
                if (iHashCode != -910670901) {
                    if (iHashCode != 1545943549) {
                        if (iHashCode == 1906834089 && str2.equals("EARN_CASHBACK_ITEM_ID")) {
                            bVar7.L2();
                        }
                    } else if (str2.equals("PARTIALLY_COMPLETED_STATUS_CONTACT_ACTION_ID")) {
                        Object obj4 = model5.i;
                        rei.g gVar3 = obj4 instanceof rei.g ? (rei.g) obj4 : null;
                        if (gVar3 != null) {
                            bVar7.P2(gVar3);
                        }
                    }
                } else if (str2.equals("CLAIM_YOUR_CASHBACK_ITEM_ID")) {
                    bVar7.n2(new z(bVar7, objArr == true ? 1 : 0, i2), new whi.b(6));
                }
                break;
        }
        return Unit.f186387a;
    }
}

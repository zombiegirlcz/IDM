package i83;

import aw0.e4;
import com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatus;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.flow.tracking.TrackingFlowContract$Step;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.OrderDetailsScreen;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.order_details.OrderDetailsScreenContract$InputData;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.shipping_tracking.ShippingTrackingScreen;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.shipping_tracking.ShippingTrackingScreenContract$InputData;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.TravelHotelsRoomsSelectionScreenContract$ModalStep;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.amenities_filter.TravelHotelsRoomAmenitiesFilterScreen;
import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.InstrumentsCollectionController;
import i85.q;
import i85.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159426a;

    public /* synthetic */ m(int i) {
        this.f159426a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        List listB;
        int i = this.f159426a;
        od0.i iVar = od0.i.f224256b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return p.d(R$string.card_reactivate_no_cards_title);
            case 1:
                Function1 defaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItems, "defaultErrorItems");
                return new t((List) defaultErrorItems.invoke(new iii.d(14, null, true, false, null)), q.f159463a, false);
            case 2:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 3:
                Throwable th10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return (th10 == null || (listB = iii.c.b(null, null, 6, true)) == null) ? i9d.a.b() : listB;
            case 4:
                Throwable error = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (list == null) {
                    return error;
                }
                return null;
            case 5:
                ((Boolean) obj2).booleanValue();
                od0.i.Companion.getClass();
                return iVar;
            case 6:
                Throwable error2 = (Throwable) obj2;
                xi0.b bVar = (xi0.b) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (bVar == null) {
                    return error2;
                }
                return null;
            case 7:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return (List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null));
            case 8:
                Throwable error3 = (Throwable) obj2;
                do3.n nVar = (do3.n) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (nVar == null) {
                    return error3;
                }
                return null;
            case 9:
                yki.l FlowCoordinator = (yki.l) obj2;
                TrackingFlowContract$Step step = (TrackingFlowContract$Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (step instanceof TrackingFlowContract$Step.OrderDetails) {
                    return new OrderDetailsScreen(new OrderDetailsScreenContract$InputData(((TrackingFlowContract$Step.OrderDetails) step).f84616a));
                }
                if (!(step instanceof TrackingFlowContract$Step.TrackingDetails)) {
                    throw new NoWhenBranchMatchedException();
                }
                TrackingFlowContract$Step.TrackingDetails trackingDetails = (TrackingFlowContract$Step.TrackingDetails) step;
                return new ShippingTrackingScreen(new ShippingTrackingScreenContract$InputData(trackingDetails.f84617a, trackingDetails.f84618b));
            case 10:
                ((Boolean) obj2).booleanValue();
                od0.i.Companion.getClass();
                return iVar;
            case 11:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 12:
                Function1 errorMapper = (Function1) obj3;
                Intrinsics.checkNotNullParameter(errorMapper, "errorMapper");
                return (List) errorMapper.invoke(new iii.d(12, null, true, true, null));
            case 13:
                Throwable error4 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (bool == null) {
                    return error4;
                }
                return null;
            case 14:
                List lastVisibleItems = (List) obj2;
                List currentVisibleItems = (List) obj3;
                InstrumentsCollectionController.Companion aVar = InstrumentsCollectionController.INSTANCE;
                Intrinsics.checkNotNullParameter(lastVisibleItems, "lastVisibleItems");
                Intrinsics.checkNotNullParameter(currentVisibleItems, "currentVisibleItems");
                List list2 = lastVisibleItems;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((koi.j) it8.next()).getF57791a());
                }
                List list3 = currentVisibleItems;
                ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
                Iterator it9 = list3.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(((koi.j) it9.next()).getF57791a());
                }
                return Boolean.valueOf(arrayList.equals(arrayList2));
            case 15:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 16:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return e4.GONE;
            case 17:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 18:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 19:
                ((Boolean) obj2).booleanValue();
                return r0.g();
            case 20:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 21:
                ((Boolean) obj2).booleanValue();
                return r0.g();
            case 22:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 23:
                ((Boolean) obj2).booleanValue();
                return f0.f322471a;
            case 24:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 25:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 26:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return f0.f322471a;
            case 27:
                Throwable error5 = (Throwable) obj2;
                ApmOnboardingStatus apmOnboardingStatus = (ApmOnboardingStatus) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (apmOnboardingStatus == null) {
                    return error5;
                }
                return null;
            case 28:
                Throwable error6 = (Throwable) obj2;
                do3.n nVar2 = (do3.n) obj3;
                Intrinsics.checkNotNullParameter(error6, "error");
                if (nVar2 == null) {
                    return error6;
                }
                return null;
            default:
                com.revolut.kompot.navigable.vc.modal.a ModalCoordinator = (com.revolut.kompot.navigable.vc.modal.a) obj2;
                TravelHotelsRoomsSelectionScreenContract$ModalStep step2 = (TravelHotelsRoomsSelectionScreenContract$ModalStep) obj3;
                Intrinsics.checkNotNullParameter(ModalCoordinator, "$this$ModalCoordinator");
                Intrinsics.checkNotNullParameter(step2, "step");
                if (step2 instanceof TravelHotelsRoomsSelectionScreenContract$ModalStep.Amenities) {
                    return new TravelHotelsRoomAmenitiesFilterScreen();
                }
                throw new NoWhenBranchMatchedException();
        }
    }

    public /* synthetic */ m(Object obj2, int i) {
        this.f159426a = i;
    }
}

package beg;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.selection.amendment.TravelHotelsRoomsSelectionAmendmentScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.room.selection.common.TravelHotelsRoomsSelectionScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsRoomsSelectionAmendmentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TravelHotelsRoomsSelectionAmendmentScreen travelHotelsRoomsSelectionAmendmentScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsRoomsSelectionAmendmentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionsView.Item item = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.d();
        Intrinsics.h(item);
        s sVar = (s) jVarE3;
        xag.g gVar = sVar.f14846q;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f58316a;
        switch (str.hashCode()) {
            case -1704324088:
                if (str.equals("AMENITIES_QUICK_FILTER_ID")) {
                    oki.h.v2(sVar.v, TravelHotelsRoomsSelectionScreenContract$ModalStep.Amenities.f94007a, ModalDestination.Style.POPUP.f98311a);
                }
                break;
            case -980865785:
                if (str.equals("FREE_CANCELLATION_QUICK_FILTER_ID")) {
                    gVar.b(new x8i.h(19));
                }
                break;
            case 1199640780:
                if (str.equals("BREAKFAST_QUICK_FILTER_ID")) {
                    Object obj3 = item.f58324n;
                    Boolean bool = obj3 instanceof Boolean ? (Boolean) obj3 : null;
                    if (bool == null) {
                        IllegalStateException illegalStateException = new IllegalStateException("BREAKFAST_QUICK_FILTER_ID should have boolean parcel");
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    } else {
                        boolean zBooleanValue = bool.booleanValue();
                        gVar.getClass();
                        gVar.b(new t9f.n(gVar, zBooleanValue, 17));
                    }
                }
                break;
            case 1479356475:
                if (str.equals("PAY_AT_PROPERTY_QUICK_FILTER_ID")) {
                    gVar.b(new x8i.h(20));
                }
                break;
        }
        return Unit.f186387a;
    }
}

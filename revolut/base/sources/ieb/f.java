package ieb;

import cli.y;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.ReservationCreationScreen;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.ReservationCreationScreenContract$SlotSelection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ReservationCreationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ReservationCreationScreen reservationCreationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = reservationCreationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((AttributeSelectorSmallDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        AttributeSelectorSmallDelegate.Model model = (AttributeSelectorSmallDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.f51674g;
        Object obj4 = null;
        ReservationCreationScreenContract$SlotSelection selection = obj3 instanceof ReservationCreationScreenContract$SlotSelection ? (ReservationCreationScreenContract$SlotSelection) obj3 : null;
        if (selection != null) {
            com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a aVar2 = (com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a) this.v.d();
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(selection, "selection");
            y yVar = aVar2.v;
            g gVar = (g) ((j2) yVar.f22677a).getValue();
            List list = (List) gVar.e.getContent();
            if (list == null) {
                list = f0.f322471a;
            }
            List list2 = (List) gVar.f.getContent();
            if (list2 == null) {
                list2 = f0.f322471a;
            }
            nkm.i iVar = new nkm.i(com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a.L2(list, list2));
            while (true) {
                if (!iVar.hasNext()) {
                    break;
                }
                Object next = iVar.next();
                ReservationCreationScreenContract$SlotSelection reservationCreationScreenContract$SlotSelection = (ReservationCreationScreenContract$SlotSelection) next;
                if (Intrinsics.f(reservationCreationScreenContract$SlotSelection, selection) && reservationCreationScreenContract$SlotSelection.f82859a.d) {
                    obj4 = next;
                    break;
                }
            }
            ReservationCreationScreenContract$SlotSelection reservationCreationScreenContract$SlotSelection2 = (ReservationCreationScreenContract$SlotSelection) obj4;
            if (reservationCreationScreenContract$SlotSelection2 != null && !reservationCreationScreenContract$SlotSelection2.equals(((g) ((j2) yVar.f22677a).getValue()).f160688h)) {
                aVar2.f82863r.a("retail_restaurants_create_reservation");
                aVar2.H2(yVar, new i9e.a(reservationCreationScreenContract$SlotSelection2, 18));
            }
        }
        return Unit.f186387a;
    }
}

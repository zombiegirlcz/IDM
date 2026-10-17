package sxi;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.lounge_details.AirportLoungeDetailsScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import rp0.t;
import rp0.y;
import zhm.h0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AirportLoungeDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AirportLoungeDetailsScreen airportLoungeDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = airportLoungeDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CellDetailsNoteDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsNoteDelegate.Model model = (CellDetailsNoteDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarI3 = this.v.T2();
        String itemId = model.f51871a;
        Object obj3 = model.f51877l;
        q qVar = (q) lVarI3;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        if (Intrinsics.f(itemId, "ID_OPENING_HOURS_ITEM")) {
            svi.i openingHours = obj3 instanceof svi.i ? (svi.i) obj3 : null;
            if (openingHours == null) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "AirportLoungeDetailsScreenModel", "No WeeklySchedule model is passed into the parcel when 'Full Schedule' label is clicked.", null, h0Var);
            } else {
                j60.a aVar2 = qVar.f266519t;
                qVar.f266518s.getClass();
                Intrinsics.checkNotNullParameter(openingHours, "openingHours");
                List listK = v.k(1, 2, 3, 4, 5, 6, 7);
                ArrayList arrayList = new ArrayList(w.t(listK, 10));
                Iterator it8 = listK.iterator();
                while (it8.hasNext()) {
                    int iIntValue = ((Number) it8.next()).intValue();
                    List list = (List) openingHours.f265920a.get(Integer.valueOf(iIntValue));
                    LocalDate localDateWithDayOfWeek = new DateTime().toLocalDate().withDayOfWeek(iIntValue);
                    Intrinsics.h(localDateWithDayOfWeek);
                    TimeClause timeClause = new TimeClause(jli.b.b(localDateWithDayOfWeek), TimeClause.Format.DayOfWeek.f57966b, null, null, 12);
                    Object obj4 = ixi.f.f169569a;
                    arrayList.add(new CellDetailsDelegate.Model(a0.d.n("weekDay_", iIntValue), timeClause, ixi.f.b(list, ixi.c.UPPERCASE), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
                }
                yp0.b.k(arrayList, R$attr.uikit_dp16, R$attr.uikit_dp24, 0, 0, 28);
                aVar2.x(new y(arrayList, new t(new TextLocalisedClause(R$string.airport_lounges_lounge_details_opening_hours_title, null, null, 14), null, null, 30), rp0.l.WINDOW, null, null, null, 1016));
            }
        }
        return Unit.f186387a;
    }
}

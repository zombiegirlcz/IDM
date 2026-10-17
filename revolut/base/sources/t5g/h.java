package t5g;

import com.revolut.data.model.Data;
import com.revolut.feature.travel.flights.impl.ui.screen.dates_selection.TravelFlightsDatesSelectionScreenContract$Trip;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import ueg.v;
import vim.i;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f268114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocalDate f268115b;

    public /* synthetic */ h(int i, LocalDate localDate) {
        this.f268114a = i;
        this.f268115b = localDate;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        veh.f state;
        switch (this.f268114a) {
            case 0:
                d update = (d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return d.a(update, new TravelFlightsDatesSelectionScreenContract$Trip.OneWayTrip(this.f268115b));
            case 1:
                d update2 = (d) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return d.a(update2, new TravelFlightsDatesSelectionScreenContract$Trip.OneWayTrip(this.f268115b));
            case 2:
                ttl.g update3 = (ttl.g) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return ttl.g.a(update3, null, this.f268115b, null, 5);
            case 3:
                return v.a((v) obj2, null, null, null, null, null, null, null, null, this.f268115b, null, null, null, null, null, null, null, null, null, false, null, null, null, null, 8388351);
            case 4:
                return v.a((v) obj2, null, null, null, null, null, null, null, null, null, this.f268115b, null, null, null, null, null, null, null, null, false, null, null, null, null, 8388095);
            case 5:
                veh.e updateStateAndOptionsChainParams = (veh.e) obj2;
                Intrinsics.checkNotNullParameter(updateStateAndOptionsChainParams, "$this$updateStateAndOptionsChainParams");
                Data data = updateStateAndOptionsChainParams.f288321a;
                if (data == null || (state = (veh.f) data.getContent()) == null) {
                    return updateStateAndOptionsChainParams;
                }
                Data data2 = updateStateAndOptionsChainParams.f288321a;
                Intrinsics.checkNotNullParameter(state, "state");
                List list = state.f288324a;
                LocalDate localDate = this.f268115b;
                if (list.contains(localDate) && !Intrinsics.f(localDate, state.f288325b)) {
                    Intrinsics.h(localDate);
                    state = veh.f.a(state, localDate, null, 5);
                }
                return veh.e.a(updateStateAndOptionsChainParams, Data.copy$default(data2, state, null, false, 6, null), null, null, 6);
            case 6:
                vm5.e update4 = (vm5.e) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                update4.getClass();
                return new vm5.e(this.f268115b);
            case 7:
                wo7.d updateState = (wo7.d) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return wo7.d.a(updateState, null, this.f268115b, 1);
            case 8:
                wo7.d updateState2 = (wo7.d) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return wo7.d.a(updateState2, this.f268115b, null, 2);
            case 9:
                ycg.d update5 = (ycg.d) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                vim.d dVar = update5.f312614b;
                LocalDate localDate2 = this.f268115b;
                vim.e eVarB = (dVar == null || !Intrinsics.f(dVar.getStart(), dVar.b())) ? i.b(localDate2, localDate2) : localDate2.isBefore((ChronoLocalDate) dVar.getStart()) ? i.b(localDate2, dVar.getStart()) : i.b(dVar.getStart(), localDate2);
                vim.d calendarDatesRange = update5.f312613a;
                LocalDate selectableDatesStart = update5.f312615c;
                LocalDate currentDate = update5.d;
                Intrinsics.checkNotNullParameter(calendarDatesRange, "calendarDatesRange");
                Intrinsics.checkNotNullParameter(selectableDatesStart, "selectableDatesStart");
                Intrinsics.checkNotNullParameter(currentDate, "currentDate");
                return new ycg.d(calendarDatesRange, eVarB, selectableDatesStart, currentDate);
            case 10:
                yde.d update6 = (yde.d) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                update6.getClass();
                LocalDate selectedDate = this.f268115b;
                Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
                return new yde.d(selectedDate);
            case 11:
                return yic.e.a((yic.e) obj2, null, null, null, null, null, null, null, this.f268115b, CertificateBody.profileType);
            default:
                zag.d update7 = (zag.d) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                vim.d dVar2 = update7.f320689c;
                LocalDate localDate3 = this.f268115b;
                return zag.d.a(update7, null, (dVar2 == null || !Intrinsics.f(dVar2.getStart(), dVar2.b())) ? i.b(localDate3, localDate3) : localDate3.isBefore((ChronoLocalDate) dVar2.getStart()) ? i.b(localDate3, dVar2.getStart()) : i.b(dVar2.getStart(), localDate3), 11);
        }
    }

    public /* synthetic */ h(oki.h hVar, LocalDate localDate, int i) {
        this.f268114a = i;
        this.f268115b = localDate;
    }
}

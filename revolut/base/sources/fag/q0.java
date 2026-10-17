package fag;

import com.revolut.feature_travel_hotels_models.property.search.LocationData;
import com.revolut.feature_travel_hotels_models.search.TravelHotelsSortingOption;
import java.time.LocalDate;
import kotlin.Pair;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class q0 implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f133364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dgi.j f133365c;

    public /* synthetic */ q0(t0 t0Var, dgi.j jVar, int i) {
        this.f133363a = i;
        this.f133364b = t0Var;
        this.f133365c = jVar;
    }

    @Override // kfm.a
    public final void run() {
        LocalDate localDate;
        LocalDate localDate2;
        LocalDate localDate3;
        LocalDate localDate4;
        switch (this.f133363a) {
            case 0:
                t0 t0Var = this.f133364b;
                dgi.c cVarA = t0Var.a();
                LocationData locationData = cVarA.f114671a;
                dgi.j jVar = this.f133365c;
                LocationData locationData2 = jVar.e;
                boolean z = (locationData2 == null || locationData2.equals(locationData)) ? false : true;
                zfi.a aVar = jVar.f114697b;
                if (aVar == null) {
                    aVar = cVarA.k;
                }
                zfi.a aVar2 = aVar;
                TravelHotelsSortingOption travelHotelsSortingOption = jVar.f114698c;
                if (travelHotelsSortingOption == null) {
                    travelHotelsSortingOption = z ? null : cVarA.f114676j;
                }
                TravelHotelsSortingOption travelHotelsSortingOption2 = travelHotelsSortingOption;
                Pair pair = jVar.d;
                if (pair == null || (localDate = (LocalDate) pair.f186385a) == null) {
                    localDate = cVarA.f114672b;
                }
                if (pair == null || (localDate2 = (LocalDate) pair.f186386b) == null) {
                    localDate2 = cVarA.f114673c;
                }
                if (locationData2 != null) {
                    locationData = locationData2;
                }
                t0Var.e(dgi.c.a(cVarA, locationData, localDate, localDate2, null, null, null, null, false, null, travelHotelsSortingOption2, aVar2, jVar.f114696a, jVar.f, 1048568));
                break;
            default:
                t0 t0Var2 = this.f133364b;
                dgi.c cVarA2 = t0Var2.a();
                dgi.j jVar2 = this.f133365c;
                zfi.a aVar3 = jVar2.f114697b;
                if (aVar3 == null) {
                    aVar3 = cVarA2.k;
                }
                zfi.a aVar4 = aVar3;
                TravelHotelsSortingOption travelHotelsSortingOption3 = jVar2.f114698c;
                if (travelHotelsSortingOption3 == null) {
                    travelHotelsSortingOption3 = cVarA2.f114676j;
                }
                TravelHotelsSortingOption travelHotelsSortingOption4 = travelHotelsSortingOption3;
                Pair pair2 = jVar2.d;
                if (pair2 == null || (localDate3 = (LocalDate) pair2.f186385a) == null) {
                    localDate3 = cVarA2.f114672b;
                }
                if (pair2 == null || (localDate4 = (LocalDate) pair2.f186386b) == null) {
                    localDate4 = cVarA2.f114673c;
                }
                LocationData locationData3 = jVar2.e;
                if (locationData3 == null) {
                    locationData3 = cVarA2.f114671a;
                }
                t0Var2.e(dgi.c.a(cVarA2, locationData3, localDate3, localDate4, null, null, null, null, false, null, travelHotelsSortingOption4, aVar4, jVar2.f114696a, jVar2.f, 1048568));
                break;
        }
    }
}

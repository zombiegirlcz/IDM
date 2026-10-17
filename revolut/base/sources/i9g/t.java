package i9g;

import com.revolut.feature_travel_hotels_models.dropoff.TravelHotelsRoomsInformation;
import com.revolut.feature_travel_hotels_models.property.room.BedOptionSelection;
import com.revolut.feature_travel_hotels_models.property.room.HotelsPropertyRoomOccupancyRatesSelection;
import fag.t0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class t implements p8g.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f159838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f159839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f159840c;

    public t(h0 travelHotelsPropertySearchParamsInteractor, t0 travelHotelsRepository, i0 travelHotelsSearchSessionInteractor) {
        Intrinsics.checkNotNullParameter(travelHotelsPropertySearchParamsInteractor, "travelHotelsPropertySearchParamsInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsRepository, "travelHotelsRepository");
        Intrinsics.checkNotNullParameter(travelHotelsSearchSessionInteractor, "travelHotelsSearchSessionInteractor");
        this.f159838a = travelHotelsPropertySearchParamsInteractor;
        this.f159839b = travelHotelsRepository;
        this.f159840c = travelHotelsSearchSessionInteractor;
    }

    public static ArrayList b(List list) {
        List<BedOptionSelection> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (BedOptionSelection bedOptionSelection : list2) {
            HotelsPropertyRoomOccupancyRatesSelection hotelsPropertyRoomOccupancyRatesSelection = bedOptionSelection.f98090a;
            arrayList.add(new TravelHotelsRoomsInformation(hotelsPropertyRoomOccupancyRatesSelection.f98104a.f98098a, bedOptionSelection.f98091b.f98087a, hotelsPropertyRoomOccupancyRatesSelection.f98105b.f98115a, v04.b.M(hotelsPropertyRoomOccupancyRatesSelection.f98106c.f98112a)));
        }
        return arrayList;
    }

    public final pfm.a a(String propertyId, List bedOptionSelectionList) {
        Intrinsics.checkNotNullParameter(propertyId, "propertyId");
        Intrinsics.checkNotNullParameter(bedOptionSelectionList, "bedOptionSelectionList");
        efm.d0 d0VarFirstOrError = te0.w.l(this.f159838a.h(), this.f159840c.a()).firstOrError();
        i52.j jVar = new i52.j(24, new q(this, bedOptionSelectionList, propertyId, 1));
        d0VarFirstOrError.getClass();
        pfm.a aVar = new pfm.a(d0VarFirstOrError, jVar, 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return ue0.e.v(aVar);
    }
}

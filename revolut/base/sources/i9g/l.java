package i9g;

import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.data.model.Data;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.feature_travel_hotels_models.property.room.BedOptionSelection;
import com.revolut.feature_travel_hotels_models.property.room.RoomOccupancy;
import com.revolut.feature_travel_hotels_models.property.search.Child;
import com.revolut.feature_travel_hotels_models.property.search.HotelsPropertyRoomOccupancy;
import fag.t0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fag.r f159811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f159812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f159813c;
    public final b0 d;
    public final t0 e;
    public final i90.b f;

    public l(fag.r repository, n0 travelHotelsTravellerInfoProvider, ang.f userInteractor, b0 travelHotelsPropertyInteractor, t0 travelHotelsRepository, i90.b uuidGenerator) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(travelHotelsTravellerInfoProvider, "travelHotelsTravellerInfoProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsPropertyInteractor, "travelHotelsPropertyInteractor");
        Intrinsics.checkNotNullParameter(travelHotelsRepository, "travelHotelsRepository");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        this.f159811a = repository;
        this.f159812b = travelHotelsTravellerInfoProvider;
        this.f159813c = userInteractor;
        this.d = travelHotelsPropertyInteractor;
        this.e = travelHotelsRepository;
        this.f = uuidGenerator;
    }

    public final ufm.i a(HotelsProperty hotelsProperty, do3.n user, List bedOptionSelection, LocalDate checkInDate, LocalDate checkOutDate) {
        Intrinsics.checkNotNullParameter(hotelsProperty, "hotelsProperty");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(bedOptionSelection, "bedOptionSelection");
        Intrinsics.checkNotNullParameter(checkInDate, "checkInDate");
        Intrinsics.checkNotNullParameter(checkOutDate, "checkOutDate");
        String strU = wp5.y.u(this.f, "toString(...)");
        List list = bedOptionSelection;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            RoomOccupancy roomOccupancy = ((BedOptionSelection) it8.next()).f98090a.f98106c.f98112a;
            Intrinsics.checkNotNullParameter(roomOccupancy, "<this>");
            int i = roomOccupancy.f98119a;
            List list2 = roomOccupancy.f98120b;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                arrayList2.add(new Child(Integer.valueOf(((Number) it9.next()).intValue())));
            }
            arrayList.add(new HotelsPropertyRoomOccupancy(i, arrayList2));
        }
        n0 n0Var = this.f159812b;
        String strA = n0Var.a(user);
        String strB = n0Var.b(user);
        String str = user.i;
        String str2 = user.f116411g;
        if (str2 == null) {
            m70.a.c(kotlin.jvm.internal.t0.f186434a);
            str2 = "";
        }
        ufm.i iVar = new ufm.i(efm.d0.m(new afi.a(strU, hotelsProperty, checkInDate, checkOutDate, arrayList, bedOptionSelection, strA, strB, str, str2, 1024)), new i52.j(20, new i(this, 1)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final ufm.i b(HotelsProperty hotelsProperty, List roomsOccupancySelection, LocalDate checkInDate, LocalDate checkOutDate) {
        Intrinsics.checkNotNullParameter(hotelsProperty, "hotelsProperty");
        Intrinsics.checkNotNullParameter(roomsOccupancySelection, "roomsOccupancySelection");
        Intrinsics.checkNotNullParameter(checkInDate, "checkInDate");
        Intrinsics.checkNotNullParameter(checkOutDate, "checkOutDate");
        ufm.i iVar = new ufm.i(efm.d0.m(new afi.a(wp5.y.u(this.f, "toString(...)"), hotelsProperty, checkInDate, checkOutDate, roomsOccupancySelection, (List) null, (String) null, (String) null, (String) null, (String) null, YearClass.CLASS_2016)), new i52.j(19, new i(this, 0)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final efm.r c(String draftId, String propertyId, LocalDate localDate, LocalDate localDate2, List list, List list2) {
        efm.r rVarJust;
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        Intrinsics.checkNotNullParameter(propertyId, "propertyId");
        t0 t0Var = this.e;
        LocalDate localDate3 = localDate == null ? t0Var.a().f114672b : localDate;
        LocalDate localDate4 = localDate2 == null ? t0Var.a().f114673c : localDate2;
        List list3 = list == null ? t0Var.a().d : list;
        fag.r rVar = this.f159811a;
        efm.r map = rVar.b(draftId).n().map(new a31.o(21, j.f159805a));
        yfi.a aVar = new yfi.a(propertyId, Boolean.TRUE, localDate3, localDate4, hx7.a.F(list3));
        b0 b0Var = this.d;
        efm.r rVarA = b0Var.a(aVar, false);
        List list4 = list2;
        if (list4 == null || list4.isEmpty()) {
            rVarJust = efm.r.just(new Data(zhm.f0.f322471a, null, false, 6, null));
            Intrinsics.h(rVarJust);
        } else {
            rVarJust = nim.a.w(b0Var.d(new cgi.c(propertyId, localDate3, localDate4, hx7.a.F(list3))), new i2l.e0(list2, 2));
        }
        efm.r rVarSwitchIfEmpty = map.switchIfEmpty(pd.b.r(kli.a.i(rVarA, rVarJust, this.f159813c.k(false)), new a5b.a(draftId, (Object) localDate3, (Object) localDate4, (Object) list3, (Object) this, 24)));
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        efm.r map2 = rVar.f133367b.filter(new f9g.h(new f9g.l(draftId, 3), 12)).map(new f9g.h(new f7l.c(10), 13));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        efm.r rVarMergeWith = rVarSwitchIfEmpty.mergeWith(map2.map(new a31.o(22, k.f159807a)));
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        return rVarMergeWith;
    }

    public final efm.k d(String draftId) {
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        return this.f159811a.b(draftId);
    }

    public final rfm.f0 e(afi.a draft) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        rfm.f0 f0VarF = this.f159811a.a(draft).f(efm.d0.m(draft));
        Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
        return f0VarF;
    }
}

package hb3;

import com.revolut.feature.cash_topup.api.models.CashTopUpLocationInfo;
import com.revolut.feature.cash_topup.api.models.LockedStatus;
import com.revolut.feature.cash_topup.api.models.OpenInterval;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.joda.time.DateTime;
import zhm.f0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d49.a f150566a;

    public c(d49.a locationDistanceMeter) {
        Intrinsics.checkNotNullParameter(locationDistanceMeter, "locationDistanceMeter");
        this.f150566a = locationDistanceMeter;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Map] */
    public final CashTopUpLocationInfo a(e eVar, co3.a aVar, DateTime dateTime) throws Throwable {
        CashTopUpLocationInfo cashTopUpLocationInfo;
        double d = Double.parseDouble(eVar.getLatitude());
        double d5 = Double.parseDouble(eVar.getLongitude());
        String retailerName = eVar.getRetailerName();
        String address = eVar.getAddress();
        String phone = eVar.getPhone();
        String id10 = eVar.getId();
        String city = eVar.getCity();
        String zipCode = eVar.getZipCode();
        String state = eVar.getState();
        if (state == null) {
            state = "";
        }
        String str = state;
        float fA = this.f150566a.a(d, d5, aVar.f25486a, aVar.f25487b);
        String logo = eVar.getLogo();
        jo3.a fee2 = eVar.getFee();
        dj0.d dVarO = fee2 != null ? mo3.a.o(fee2) : null;
        LockedStatus unlocked = dateTime == null ? LockedStatus.NotApplicable.f65600a : eVar.getUnlocked() ? new LockedStatus.Unlocked(dateTime.plusMinutes(30).getMillis()) : LockedStatus.Locked.f65599a;
        boolean z = eVar.getMinutesUntilClose() != null && eVar.getMinutesUntilClose().intValue() > 0;
        List openingHours = eVar.getOpeningHours();
        if (openingHours == null) {
            openingHours = f0.f322471a;
        }
        Object obj2 = d.f150567a;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = openingHours.iterator();
        while (it8.hasNext()) {
            l lVar = (l) it8.next();
            Iterator it9 = it8;
            LockedStatus lockedStatus = unlocked;
            Object objU = u1.u(lVar.getDay(), d.f150567a);
            List open = lVar.getOpen();
            CashTopUpLocationInfo cashTopUpLocationInfo2 = cashTopUpLocationInfo;
            ArrayList arrayList2 = new ArrayList(w.t(open, 10));
            Iterator it10 = open.iterator();
            while (it10.hasNext()) {
                k kVar = (k) it10.next();
                arrayList2.add(new OpenInterval(kVar.getBegin(), kVar.getEnd()));
                it10 = it10;
                fA = fA;
            }
            arrayList.add(new Pair(objU, arrayList2));
            it8 = it9;
            unlocked = lockedStatus;
            cashTopUpLocationInfo = cashTopUpLocationInfo2;
        }
        return new CashTopUpLocationInfo(retailerName, address, phone, d, d5, id10, city, zipCode, str, fA, logo, dVarO, unlocked, z, r0.t(arrayList));
    }
}

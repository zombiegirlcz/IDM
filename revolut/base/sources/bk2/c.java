package bk2;

import android.os.Parcelable;
import com.revolut.feature.atm.api.model.Atm;
import com.revolut.feature.atm.api.model.AtmAddress;
import com.revolut.feature.atm.api.model.AtmFees;
import com.revolut.feature.atm.api.model.AtmWithdrawalCommission;
import com.revolut.feature.atm.api.model.Feature;
import com.revolut.feature.atm.api.model.OpeningHours;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class c {
    public static List a(List list) {
        ArrayList arrayList;
        if (list != null) {
            List<ak2.e> list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            for (ak2.e eVar : list2) {
                long amount = eVar.getAmount();
                xi0.a aVar = xi0.b.Companion;
                String currency = eVar.getCurrency();
                aVar.getClass();
                arrayList.add(new dj0.d(amount, xi0.a.a(currency)));
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? f0.f322471a : arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r20v2, types: [com.revolut.feature.atm.api.model.AtmFees] */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r6v2, types: [dj0.d] */
    public static Atm b(ak2.b atmDto) {
        AtmAddress atmAddress;
        int i;
        ArrayList arrayList;
        ?? arrayList2;
        sj2.g gVar;
        ?? r222;
        AtmAddress atmAddress2;
        float f;
        double d;
        AtmWithdrawalCommission atmWithdrawalCommission;
        AtmWithdrawalCommission atmWithdrawalCommission2;
        dj0.d dVar;
        Iterator it8;
        String str;
        Parcelable closed;
        Intrinsics.checkNotNullParameter(atmDto, "atmDto");
        int id10 = atmDto.getId();
        String name = atmDto.getName();
        double longitude = atmDto.getLocation().getLongitude();
        double latitude = atmDto.getLocation().getLatitude();
        ak2.a address = atmDto.getAddress();
        if (address != null) {
            String city = address.getCity();
            if (city == null) {
                city = "";
            }
            String streetLine = address.getStreetLine();
            if (streetLine == null) {
                streetLine = "";
            }
            String postCode = address.getPostCode();
            if (postCode == null) {
                postCode = "";
            }
            String country = address.getCountry();
            atmAddress = new AtmAddress(streetLine, city, postCode, country != null ? country : "");
        } else {
            AtmAddress.INSTANCE.getClass();
            atmAddress = new AtmAddress("", "", "", "");
        }
        AtmAddress atmAddress3 = atmAddress;
        float distance = atmDto.getDistance().getDistance();
        boolean zJ = pd.b.j(atmDto.getSurchargeFree());
        String wheelchairAccess = atmDto.getWheelchairAccess();
        sj2.h hVar = Intrinsics.f(wheelchairAccess, "Available") ? sj2.h.AVAILABLE : Intrinsics.f(wheelchairAccess, "Unavailable") ? sj2.h.UNAVAILABLE : sj2.h.UNKNOWN;
        List listA = a(atmDto.getWithdrawalBanknotes());
        List listA2 = a(atmDto.getDepositBanknotes());
        String image = atmDto.getImage();
        List openingHours = atmDto.getOpeningHours();
        if (openingHours != null) {
            List list = openingHours;
            i = id10;
            arrayList = new ArrayList(w.t(list, 10));
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                ak2.h hVar2 = (ak2.h) it9.next();
                DayOfWeek dayOfWeekValueOf = DayOfWeek.valueOf(hVar2.getDayOfWeek());
                if (hVar2.getOpenTime() == null || hVar2.getCloseTime() == null) {
                    it8 = it9;
                    str = name;
                    closed = new OpeningHours.Closed(dayOfWeekValueOf);
                } else {
                    it8 = it9;
                    if (Intrinsics.f(hVar2.getOpenTime(), hVar2.getCloseTime())) {
                        closed = new OpeningHours.TwentyFourHours(dayOfWeekValueOf);
                        str = name;
                    } else {
                        str = name;
                        closed = new OpeningHours.SpecificTime(dayOfWeekValueOf, hVar2.getOpenTime(), hVar2.getCloseTime());
                    }
                }
                arrayList.add(closed);
                it9 = it8;
                name = str;
            }
        } else {
            i = id10;
            arrayList = null;
        }
        String str2 = name;
        List list2 = arrayList;
        if (arrayList == null) {
            list2 = f0.f322471a;
        }
        List list3 = list2;
        List list4 = atmDto.getIb.b.Features java.lang.String();
        if (list4 != null) {
            List list5 = list4;
            arrayList2 = new ArrayList(w.t(list5, 10));
            for (Iterator it10 = list5.iterator(); it10.hasNext(); it10 = it10) {
                ak2.g gVar2 = (ak2.g) it10.next();
                arrayList2.add(new Feature(sj2.d.valueOf(gVar2.getCode()), gVar2.getLocalisedName()));
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = f0.f322471a;
        }
        String status = atmDto.getStatus();
        sj2.g gVar3 = Intrinsics.f(status, "ACTIVE") ? sj2.g.ACTIVE : Intrinsics.f(status, "DISABLE") ? sj2.g.DISABLED : sj2.g.UNKNOWN;
        String network = atmDto.getNetwork();
        sj2.f fVar = Intrinsics.f(network, "Revolut") ? sj2.f.REVOLUT : network == null ? sj2.f.UNKNOWN : sj2.f.OTHER;
        String localityType = atmDto.getLocalityType();
        sj2.e eVar = Intrinsics.f(localityType, "DOMESTIC") ? sj2.e.DOMESTIC : Intrinsics.f(localityType, "INTERNATIONAL") ? sj2.e.INTERNATIONAL : sj2.e.UNKNOWN;
        ak2.c fees = atmDto.getFees();
        if (fees != null) {
            gVar = gVar3;
            Boolean hasWithdrawalFee = fees.getHasWithdrawalFee();
            r222 = arrayList2;
            Boolean hasExchangeFee = fees.getHasExchangeFee();
            ak2.d blikWithdrawalCommission = fees.getBlikWithdrawalCommission();
            if (blikWithdrawalCommission != null) {
                atmAddress2 = atmAddress3;
                Float percentage = blikWithdrawalCommission.getPercentage();
                jo3.a minimumAmount = blikWithdrawalCommission.getMinimumAmount();
                if (minimumAmount != null) {
                    dj0.d dVarO = mo3.a.o(minimumAmount);
                    f = distance;
                    dVar = dVarO;
                } else {
                    f = distance;
                    dVar = null;
                }
                atmWithdrawalCommission = new AtmWithdrawalCommission(percentage, dVar);
            } else {
                atmAddress2 = atmAddress3;
                f = distance;
                atmWithdrawalCommission = null;
            }
            ak2.d creditCardWithdrawalCommission = fees.getCreditCardWithdrawalCommission();
            if (creditCardWithdrawalCommission != null) {
                Float percentage2 = creditCardWithdrawalCommission.getPercentage();
                jo3.a minimumAmount2 = creditCardWithdrawalCommission.getMinimumAmount();
                d = latitude;
                atmWithdrawalCommission2 = new AtmWithdrawalCommission(percentage2, minimumAmount2 != null ? mo3.a.o(minimumAmount2) : null);
            } else {
                d = latitude;
                atmWithdrawalCommission2 = null;
            }
            atmFees = new AtmFees(hasWithdrawalFee, hasExchangeFee, atmWithdrawalCommission, atmWithdrawalCommission2);
        } else {
            gVar = gVar3;
            r222 = arrayList2;
            atmAddress2 = atmAddress3;
            f = distance;
            d = latitude;
        }
        return new Atm(i, str2, atmAddress2, f, d, longitude, zJ, hVar, listA, listA2, image, list3, r222, gVar, fVar, eVar, atmFees, atmDto.getLocalisedDirections());
    }
}

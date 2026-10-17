package kfi;

import com.revolut.feature_travel_hotels_models.promotions.TravelHotelsPromotion;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.joda.time.DateTime;
import qfi.a;
import v04.b;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a {
    public static final TravelHotelsPromotion a(qfi.a aVar) {
        tfi.a aVar2;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String id10 = aVar.getId();
        String type = aVar.getType();
        tfi.a[] aVarArrValues = tfi.a.values();
        int length = aVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                aVar2 = null;
                break;
            }
            aVar2 = aVarArrValues[i];
            if (a0.z(aVar2.name(), type, true)) {
                break;
            }
            i++;
        }
        if (aVar2 == null) {
            aVar2 = tfi.a.UNKNOWN;
        }
        tfi.a aVar3 = aVar2;
        DateTime dateTime = DateTime.parse(aVar.getStart());
        Intrinsics.checkNotNullExpressionValue(dateTime, "parse(...)");
        DateTime dateTime2 = DateTime.parse(aVar.getEnd());
        Intrinsics.checkNotNullExpressionValue(dateTime2, "parse(...)");
        TravelHotelsPromotion.Requirements requirements = null;
        double maxDiscountPercentage = aVar.getMaxDiscountPercentage();
        a.C1346a requirements2 = aVar.getRequirements();
        if (requirements2 != null) {
            Intrinsics.checkNotNullParameter(requirements2, "<this>");
            DateTime dateTime3 = DateTime.parse(requirements2.getCheckOutTo());
            Intrinsics.checkNotNullExpressionValue(dateTime3, "parse(...)");
            DateTime dateTime4 = DateTime.parse(requirements2.getCheckInFrom());
            Intrinsics.checkNotNullExpressionValue(dateTime4, "parse(...)");
            requirements = new TravelHotelsPromotion.Requirements(dateTime4, dateTime3);
        }
        return new TravelHotelsPromotion(id10, aVar3, dateTime, dateTime2, maxDiscountPercentage, requirements, b.u(aVar.getLocation()));
    }
}

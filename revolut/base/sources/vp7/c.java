package vp7;

import com.revolut.feature.insurance_car.impl.data.model.Answer;
import com.revolut.feature.insurance_car.impl.data.model.Survey;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    public static final ArrayList a(List list) {
        Answer.ClaimType claimType;
        Boolean bool;
        Boolean bool2;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (true) {
            Survey.Claims.Details details = null;
            if (!it8.hasNext()) {
                break;
            }
            b bVar = (b) it8.next();
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            LocalDate localDate = bVar.f291113a;
            if (localDate != null && (claimType = bVar.f291114b) != null && (bool = bVar.f291115c) != null && (bool2 = bVar.d) != null) {
                details = new Survey.Claims.Details(localDate, claimType, bool, bool2);
            }
            if (details != null) {
                arrayList.add(details);
            }
        }
        if (arrayList.size() == list.size()) {
            return arrayList;
        }
        return null;
    }
}

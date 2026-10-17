package yqe;

import com.revolut.feature.address.models.Address;
import com.revolut.feature.teen_profile.api.models.TeenProfile;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import zhm.w;
import zqe.f;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DateTimeFormatter f316028a = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static final ArrayList a(List list) {
        Iterator it8;
        String str;
        tqe.a aVar;
        String str2 = "<this>";
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            f fVar = (f) it9.next();
            Intrinsics.checkNotNullParameter(fVar, str2);
            String value = fVar.f324471a;
            Intrinsics.checkNotNullParameter(value, "value");
            String str3 = fVar.f324472b;
            String str4 = fVar.f324473c;
            LocalDate localDate = LocalDate.parse(fVar.d, f316028a);
            Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
            Address addressA = oo3.a.a(fVar.e);
            String str5 = fVar.f;
            String str6 = fVar.f324474g;
            String str7 = fVar.f324475h;
            String str8 = fVar.i;
            if (str8 != null) {
                tqe.a[] aVarArrValues = tqe.a.values();
                int length = aVarArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        it8 = it9;
                        str = str2;
                        aVar = null;
                        break;
                    }
                    aVar = aVarArrValues[i];
                    it8 = it9;
                    str = str2;
                    if (a0.z(aVar.name(), str8, true)) {
                        break;
                    }
                    i++;
                    it9 = it8;
                    str2 = str;
                }
                if (aVar == null) {
                }
                arrayList.add(new TeenProfile(value, str3, str4, localDate, addressA, str5, str6, str7, aVar));
                it9 = it8;
                str2 = str;
            } else {
                it8 = it9;
                str = str2;
            }
            aVar = tqe.a.NONE;
            arrayList.add(new TeenProfile(value, str3, str4, localDate, addressA, str5, str6, str7, aVar));
            it9 = it8;
            str2 = str;
        }
        return arrayList;
    }
}

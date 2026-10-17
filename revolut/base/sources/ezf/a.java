package ezf;

import c0g.c;
import com.revolut.feature.travel.experiences.api.models.search.TravelSearchDestination;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    public static final TravelSearchDestination a(c cVar) {
        qyf.a aVar;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String value = cVar.getId();
        Intrinsics.checkNotNullParameter(value, "value");
        String name = cVar.getName();
        String type = cVar.getType();
        qyf.a[] aVarArrValues = qyf.a.values();
        int length = aVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                aVar = null;
                break;
            }
            aVar = aVarArrValues[i];
            if (a0.z(aVar.name(), type, true)) {
                break;
            }
            i++;
        }
        if (aVar == null) {
            aVar = qyf.a.UNKNOWN;
        }
        return new TravelSearchDestination(value, name, aVar, cVar.getCountry(), cVar.getRegion());
    }
}

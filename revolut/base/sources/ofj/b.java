package ofj;

import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanCoverageCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b {
    public static final String a(EsimCoverage esimCoverage) {
        Intrinsics.checkNotNullParameter(esimCoverage, "<this>");
        if (esimCoverage instanceof EsimCoverage.Country) {
            return "COUNTRY";
        }
        if (esimCoverage instanceof EsimCoverage.Regional) {
            return "REGIONAL";
        }
        if (esimCoverage instanceof EsimCoverage.Global) {
            return "GLOBAL";
        }
        if (esimCoverage instanceof EsimCoverage.Undefined) {
            return "UNKNOWN";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final EsimCoverage b(String coverageType, String coverageCode, String str, List coverageCountries) {
        Intrinsics.checkNotNullParameter(coverageType, "coverageType");
        Intrinsics.checkNotNullParameter(coverageCode, "coverageCode");
        Intrinsics.checkNotNullParameter(coverageCountries, "coverageCountries");
        int iHashCode = coverageType.hashCode();
        if (iHashCode != 92288543) {
            if (iHashCode != 1675813750) {
                if (iHashCode == 2105276323 && coverageType.equals("GLOBAL")) {
                    List list = coverageCountries;
                    ArrayList arrayList = new ArrayList(w.t(list, 10));
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(com.bumptech.glide.d.c((String) it8.next()));
                    }
                    return new EsimCoverage.Global(arrayList, str);
                }
            } else if (coverageType.equals("COUNTRY")) {
                return new EsimCoverage.Country(com.bumptech.glide.d.c((String) d0.b0(coverageCountries)), str);
            }
        } else if (coverageType.equals("REGIONAL")) {
            List list2 = coverageCountries;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                arrayList2.add(com.bumptech.glide.d.c((String) it9.next()));
            }
            return new EsimCoverage.Regional(arrayList2, new EsimDataPlanCoverageCode(coverageCode), str);
        }
        return EsimCoverage.Undefined.f100211a;
    }
}

package fy1;

import com.revolut.domain.models.beneficiary.BeneficiarySpecialPurpose;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Flow;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cz5.b f138874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hh3.c f138875b;

    public r(cz5.b apmContactsProviderMap, hh3.c apmBeneficiariesProviderMap) {
        Intrinsics.checkNotNullParameter(apmContactsProviderMap, "apmContactsProviderMap");
        Intrinsics.checkNotNullParameter(apmBeneficiariesProviderMap, "apmBeneficiariesProviderMap");
        this.f138874a = apmContactsProviderMap;
        this.f138875b = apmBeneficiariesProviderMap;
    }

    public final ag1.k a() {
        s0 s0Var = new s0(2);
        Collection collectionValues = this.f138874a.f110163b.values();
        ArrayList arrayList = new ArrayList(w.t(collectionValues, 10));
        Iterator it8 = collectionValues.iterator();
        while (it8.hasNext()) {
            arrayList.add(((ky1.a) it8.next()).e());
        }
        s0Var.b(arrayList.toArray(new Flow[0]));
        Collection collectionValues2 = this.f138875b.f152245a.values();
        ArrayList arrayList2 = new ArrayList(w.t(collectionValues2, 10));
        Iterator it9 = collectionValues2.iterator();
        while (it9.hasNext()) {
            gy1.e eVar = (gy1.e) ((ky1.b) it9.next());
            efm.r map = ue0.e.H(m70.a.g(o71.a.b(eVar.f147773a, BeneficiarySpecialPurpose.PAYID_ALIAS, null, 13), null, new gug.c(8), 1), h0.f322473a, new gvi.p(14)).map(new gv5.b(new gvi.p(eVar, 15), 11));
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            arrayList2.add(rd0.e.b(map));
        }
        s0Var.b(arrayList2.toArray(new Flow[0]));
        ArrayList arrayList3 = s0Var.f186433a;
        return new ag1.k((Flow[]) arrayList3.toArray(new Flow[arrayList3.size()]), 20);
    }
}

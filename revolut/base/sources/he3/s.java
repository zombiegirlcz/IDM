package he3;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kl.b0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.q0;

/* JADX INFO: loaded from: classes21.dex */
public final class s {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f151572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f151573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f151574c;
    public final b0 d;

    public s(List allTransactions, xi0.b targetCurrency, List rates, b0 categoryGroupingProvider) {
        Intrinsics.checkNotNullParameter(allTransactions, "allTransactions");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(categoryGroupingProvider, "categoryGroupingProvider");
        this.f151572a = allTransactions;
        this.f151573b = targetCurrency;
        this.f151574c = rates;
        this.d = categoryGroupingProvider;
    }

    public final r a(l categoryType, knd.r rVar) {
        cam.f cVar;
        Map mapC;
        Intrinsics.checkNotNullParameter(categoryType, "categoryType");
        j9l.a moneyCalculator = (j9l.a) this.d.f185144b;
        Intrinsics.checkNotNullParameter(categoryType, "categoryType");
        switch (le3.t.f194496a[categoryType.ordinal()]) {
            case 1:
                Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
                cVar = new me3.c(moneyCalculator, 7);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
                cVar = new me3.c(moneyCalculator, 1);
                break;
            case 3:
            case 4:
                Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
                cVar = new me3.e(moneyCalculator);
                break;
            case 5:
                Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
                cVar = new me3.c(moneyCalculator, 2);
                break;
            case 6:
                Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
                cVar = new me3.c(moneyCalculator, 4);
                break;
            case 7:
                Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
                cVar = new me3.c(moneyCalculator, 5);
                break;
            case 8:
                Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
                cVar = new me3.c(moneyCalculator, 0);
                break;
            case 9:
                Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
                cVar = new me3.c(moneyCalculator, 3);
                break;
            case 10:
                Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
                cVar = new me3.c(moneyCalculator, 6);
                break;
            case 11:
            case 12:
                Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
                cVar = new me3.b(moneyCalculator);
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new UnsupportedOperationException("Grouping for pro types is not supported");
            default:
                throw new NoWhenBranchMatchedException();
        }
        xi0.b bVar = this.f151573b;
        List list = this.f151572a;
        List list2 = this.f151574c;
        if (rVar != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : list) {
                Object objInvoke = rVar.invoke(obj2);
                Object arrayList = linkedHashMap.get(objInvoke);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(objInvoke, arrayList);
                }
                ((List) arrayList).add(obj2);
            }
            mapC = new LinkedHashMap(q0.b(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                mapC.put(entry.getKey(), cVar.r((List) entry.getValue(), list2, bVar));
            }
        } else {
            mapC = q0.c(new Pair("default", cVar.r(list, list2, bVar)));
        }
        return new r(mapC, list2);
    }

    public final LinkedHashMap b(LinkedHashMap linkedHashMap, j9l.a aVar) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            xi0.b bVar = this.f151573b;
            dj0.d dVarA = aVar.a(bVar, do3.q.j(list, false, bVar), this.f151574c);
            linkedHashMap2.put(key, Long.valueOf(dVarA != null ? dVarA.f115082a : 0L));
        }
        return linkedHashMap2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f151572a, sVar.f151572a) && Intrinsics.f(this.f151573b, sVar.f151573b) && Intrinsics.f(this.f151574c, sVar.f151574c) && Intrinsics.f(this.d, sVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(h30.l.j(this.f151573b, this.f151572a.hashCode() * 31, 31), 31, this.f151574c);
    }
}

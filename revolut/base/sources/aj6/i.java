package aj6;

import com.revolut.data.model.Data;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ei6.d f5406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f5407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f5408c;
    public final Set d;
    public final uib.a e;
    public final x61.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f5409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f5410h;
    public final Set i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set f5411j;

    public i(ei6.d dVar, Data accountsData, Set enabledAccountIds, Set enabledLoans, uib.a aVar, x61.a aVar2, Map toBaseCurrencyRatesMap, boolean z, Set allSelectableAccountIds, Set allSelectableLoanIds) {
        Intrinsics.checkNotNullParameter(accountsData, "accountsData");
        Intrinsics.checkNotNullParameter(enabledAccountIds, "enabledAccountIds");
        Intrinsics.checkNotNullParameter(enabledLoans, "enabledLoans");
        Intrinsics.checkNotNullParameter(toBaseCurrencyRatesMap, "toBaseCurrencyRatesMap");
        Intrinsics.checkNotNullParameter(allSelectableAccountIds, "allSelectableAccountIds");
        Intrinsics.checkNotNullParameter(allSelectableLoanIds, "allSelectableLoanIds");
        this.f5406a = dVar;
        this.f5407b = accountsData;
        this.f5408c = enabledAccountIds;
        this.d = enabledLoans;
        this.e = aVar;
        this.f = aVar2;
        this.f5409g = toBaseCurrencyRatesMap;
        this.f5410h = z;
        this.i = allSelectableAccountIds;
        this.f5411j = allSelectableLoanIds;
    }

    public static i a(i iVar, ei6.d dVar, Data data, Set set, Set set2, uib.a aVar, x61.a aVar2, Map map, boolean z, Set set3, Set set4, int i) {
        if ((i & 1) != 0) {
            dVar = iVar.f5406a;
        }
        ei6.d dVar2 = dVar;
        if ((i & 2) != 0) {
            data = iVar.f5407b;
        }
        Data accountsData = data;
        if ((i & 4) != 0) {
            set = iVar.f5408c;
        }
        Set enabledAccountIds = set;
        if ((i & 8) != 0) {
            set2 = iVar.d;
        }
        Set enabledLoans = set2;
        uib.a aVar3 = (i & 16) != 0 ? iVar.e : aVar;
        x61.a aVar4 = (i & 32) != 0 ? iVar.f : aVar2;
        Map toBaseCurrencyRatesMap = (i & 64) != 0 ? iVar.f5409g : map;
        boolean z3 = (i & 128) != 0 ? iVar.f5410h : z;
        Set allSelectableAccountIds = (i & 256) != 0 ? iVar.i : set3;
        Set allSelectableLoanIds = (i & 512) != 0 ? iVar.f5411j : set4;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(accountsData, "accountsData");
        Intrinsics.checkNotNullParameter(enabledAccountIds, "enabledAccountIds");
        Intrinsics.checkNotNullParameter(enabledLoans, "enabledLoans");
        Intrinsics.checkNotNullParameter(toBaseCurrencyRatesMap, "toBaseCurrencyRatesMap");
        Intrinsics.checkNotNullParameter(allSelectableAccountIds, "allSelectableAccountIds");
        Intrinsics.checkNotNullParameter(allSelectableLoanIds, "allSelectableLoanIds");
        return new i(dVar2, accountsData, enabledAccountIds, enabledLoans, aVar3, aVar4, toBaseCurrencyRatesMap, z3, allSelectableAccountIds, allSelectableLoanIds);
    }

    public final boolean c() {
        Set set = this.i;
        boolean zIsEmpty = set.isEmpty();
        Set set2 = this.f5411j;
        if (zIsEmpty && set2.isEmpty()) {
            return false;
        }
        Set set3 = set;
        if (!(set3 instanceof Collection) || !set3.isEmpty()) {
            Iterator it8 = set3.iterator();
            while (it8.hasNext()) {
                if (!this.f5408c.contains((String) it8.next())) {
                    return false;
                }
            }
        }
        Set set4 = set2;
        if ((set4 instanceof Collection) && set4.isEmpty()) {
            return true;
        }
        Iterator it9 = set4.iterator();
        while (it9.hasNext()) {
            if (!this.d.contains((String) it9.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f5406a, iVar.f5406a) && Intrinsics.f(this.f5407b, iVar.f5407b) && Intrinsics.f(this.f5408c, iVar.f5408c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f5409g, iVar.f5409g) && this.f5410h == iVar.f5410h && Intrinsics.f(this.i, iVar.i) && Intrinsics.f(this.f5411j, iVar.f5411j);
    }

    public final int hashCode() {
        ei6.d dVar = this.f5406a;
        int iF = p.a.f(p.a.f(kii.e.c(this.f5407b, (dVar == null ? 0 : dVar.hashCode()) * 31, 31), 31, this.f5408c), 31, this.d);
        uib.a aVar = this.e;
        int iHashCode = (iF + (aVar == null ? 0 : aVar.hashCode())) * 31;
        x61.a aVar2 = this.f;
        return this.f5411j.hashCode() + p.a.f(j6.a.c(p.a.e((iHashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31, 31, this.f5409g), 31, this.f5410h), 31, this.i);
    }
}

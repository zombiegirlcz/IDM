package wi6;

import com.revolut.data.model.Data;
import com.revolut.feature.external_accounts.api.model.consent.ConsentExpiration;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ei6.d f297807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f297808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f297809c;
    public final Set d;
    public final Set e;
    public final Set f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConsentExpiration f297810g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f297811h;
    public final Set i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set f297812j;
    public final Set k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Set f297813l;

    public h(ei6.d dVar, Data accountsData, Set enabledPockets, Set enabledVaults, Set enabledCredits, Set enabledJuniorPockets, ConsentExpiration consentExpiration, Map toBaseCurrencyRatesMap, Set allSelectablePockets, Set allSelectableCredits, Set allSelectableVaults, Set allSelectableJuniorPockets) {
        Intrinsics.checkNotNullParameter(accountsData, "accountsData");
        Intrinsics.checkNotNullParameter(enabledPockets, "enabledPockets");
        Intrinsics.checkNotNullParameter(enabledVaults, "enabledVaults");
        Intrinsics.checkNotNullParameter(enabledCredits, "enabledCredits");
        Intrinsics.checkNotNullParameter(enabledJuniorPockets, "enabledJuniorPockets");
        Intrinsics.checkNotNullParameter(toBaseCurrencyRatesMap, "toBaseCurrencyRatesMap");
        Intrinsics.checkNotNullParameter(allSelectablePockets, "allSelectablePockets");
        Intrinsics.checkNotNullParameter(allSelectableCredits, "allSelectableCredits");
        Intrinsics.checkNotNullParameter(allSelectableVaults, "allSelectableVaults");
        Intrinsics.checkNotNullParameter(allSelectableJuniorPockets, "allSelectableJuniorPockets");
        this.f297807a = dVar;
        this.f297808b = accountsData;
        this.f297809c = enabledPockets;
        this.d = enabledVaults;
        this.e = enabledCredits;
        this.f = enabledJuniorPockets;
        this.f297810g = consentExpiration;
        this.f297811h = toBaseCurrencyRatesMap;
        this.i = allSelectablePockets;
        this.f297812j = allSelectableCredits;
        this.k = allSelectableVaults;
        this.f297813l = allSelectableJuniorPockets;
    }

    public static h a(h hVar, ei6.d dVar, Data data, Set set, Set set2, Set set3, Set set4, ConsentExpiration consentExpiration, Map map, Set set5, Set set6, Set set7, Set set8, int i) {
        if ((i & 1) != 0) {
            dVar = hVar.f297807a;
        }
        ei6.d dVar2 = dVar;
        if ((i & 2) != 0) {
            data = hVar.f297808b;
        }
        Data accountsData = data;
        Set enabledPockets = (i & 4) != 0 ? hVar.f297809c : set;
        Set enabledVaults = (i & 8) != 0 ? hVar.d : set2;
        Set enabledCredits = (i & 16) != 0 ? hVar.e : set3;
        Set enabledJuniorPockets = (i & 32) != 0 ? hVar.f : set4;
        ConsentExpiration consentExpiration2 = (i & 64) != 0 ? hVar.f297810g : consentExpiration;
        Map toBaseCurrencyRatesMap = (i & 128) != 0 ? hVar.f297811h : map;
        Set allSelectablePockets = (i & 256) != 0 ? hVar.i : set5;
        Set allSelectableCredits = (i & 512) != 0 ? hVar.f297812j : set6;
        Set allSelectableVaults = (i & 1024) != 0 ? hVar.k : set7;
        Set allSelectableJuniorPockets = (i & 2048) != 0 ? hVar.f297813l : set8;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(accountsData, "accountsData");
        Intrinsics.checkNotNullParameter(enabledPockets, "enabledPockets");
        Intrinsics.checkNotNullParameter(enabledVaults, "enabledVaults");
        Intrinsics.checkNotNullParameter(enabledCredits, "enabledCredits");
        Intrinsics.checkNotNullParameter(enabledJuniorPockets, "enabledJuniorPockets");
        Intrinsics.checkNotNullParameter(toBaseCurrencyRatesMap, "toBaseCurrencyRatesMap");
        Intrinsics.checkNotNullParameter(allSelectablePockets, "allSelectablePockets");
        Intrinsics.checkNotNullParameter(allSelectableCredits, "allSelectableCredits");
        Intrinsics.checkNotNullParameter(allSelectableVaults, "allSelectableVaults");
        Intrinsics.checkNotNullParameter(allSelectableJuniorPockets, "allSelectableJuniorPockets");
        return new h(dVar2, accountsData, enabledPockets, enabledVaults, enabledCredits, enabledJuniorPockets, consentExpiration2, toBaseCurrencyRatesMap, allSelectablePockets, allSelectableCredits, allSelectableVaults, allSelectableJuniorPockets);
    }

    public final boolean c() {
        Set set = this.i;
        boolean zIsEmpty = set.isEmpty();
        Set set2 = this.f297813l;
        Set set3 = this.k;
        Set set4 = this.f297812j;
        if (zIsEmpty && set4.isEmpty() && set3.isEmpty() && set2.isEmpty()) {
            return false;
        }
        Set set5 = set;
        if (!(set5 instanceof Collection) || !set5.isEmpty()) {
            Iterator it8 = set5.iterator();
            while (it8.hasNext()) {
                if (!this.f297809c.contains((String) it8.next())) {
                    return false;
                }
            }
        }
        Set set6 = set4;
        if (!(set6 instanceof Collection) || !set6.isEmpty()) {
            Iterator it9 = set6.iterator();
            while (it9.hasNext()) {
                if (!this.e.contains((String) it9.next())) {
                    return false;
                }
            }
        }
        Set set7 = set3;
        if (!(set7 instanceof Collection) || !set7.isEmpty()) {
            Iterator it10 = set7.iterator();
            while (it10.hasNext()) {
                if (!this.d.contains((String) it10.next())) {
                    return false;
                }
            }
        }
        Set set8 = set2;
        if ((set8 instanceof Collection) && set8.isEmpty()) {
            return true;
        }
        Iterator it11 = set8.iterator();
        while (it11.hasNext()) {
            if (!this.f.contains((String) it11.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f297807a, hVar.f297807a) && Intrinsics.f(this.f297808b, hVar.f297808b) && Intrinsics.f(this.f297809c, hVar.f297809c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f297810g, hVar.f297810g) && Intrinsics.f(this.f297811h, hVar.f297811h) && Intrinsics.f(this.i, hVar.i) && Intrinsics.f(this.f297812j, hVar.f297812j) && Intrinsics.f(this.k, hVar.k) && Intrinsics.f(this.f297813l, hVar.f297813l);
    }

    public final int hashCode() {
        ei6.d dVar = this.f297807a;
        int iF = p.a.f(p.a.f(p.a.f(p.a.f(kii.e.c(this.f297808b, (dVar == null ? 0 : dVar.hashCode()) * 31, 31), 31, this.f297809c), 31, this.d), 31, this.e), 31, this.f);
        ConsentExpiration consentExpiration = this.f297810g;
        return this.f297813l.hashCode() + p.a.f(p.a.f(p.a.f(p.a.e((iF + (consentExpiration != null ? Long.hashCode(consentExpiration.f72238a) : 0)) * 31, 31, this.f297811h), 31, this.i), 31, this.f297812j), 31, this.k);
    }
}

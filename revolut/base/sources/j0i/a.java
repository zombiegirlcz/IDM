package j0i;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f170040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f170041c;
    public final List d;
    public final List e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f170042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f170043h;
    public final Set i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final sh5.c f170044j;

    public a(String searchQuery, c sortingOrder, List currencies, List cryptoStats, List sortedCurrencies, List filteredCurrencies, Data rates, Data performance, Set selectedCurrencies, sh5.c fcaDisclaimer) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(sortingOrder, "sortingOrder");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(cryptoStats, "cryptoStats");
        Intrinsics.checkNotNullParameter(sortedCurrencies, "sortedCurrencies");
        Intrinsics.checkNotNullParameter(filteredCurrencies, "filteredCurrencies");
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(performance, "performance");
        Intrinsics.checkNotNullParameter(selectedCurrencies, "selectedCurrencies");
        Intrinsics.checkNotNullParameter(fcaDisclaimer, "fcaDisclaimer");
        this.f170039a = searchQuery;
        this.f170040b = sortingOrder;
        this.f170041c = currencies;
        this.d = cryptoStats;
        this.e = sortedCurrencies;
        this.f = filteredCurrencies;
        this.f170042g = rates;
        this.f170043h = performance;
        this.i = selectedCurrencies;
        this.f170044j = fcaDisclaimer;
    }

    public static a a(a aVar, String str, c cVar, ArrayList arrayList, List list, List list2, List list3, Data data, Data data2, LinkedHashSet linkedHashSet, sh5.c cVar2, int i) {
        if ((i & 1) != 0) {
            str = aVar.f170039a;
        }
        String searchQuery = str;
        if ((i & 2) != 0) {
            cVar = aVar.f170040b;
        }
        c sortingOrder = cVar;
        List list4 = arrayList;
        if ((i & 4) != 0) {
            list4 = aVar.f170041c;
        }
        List currencies = list4;
        if ((i & 8) != 0) {
            list = aVar.d;
        }
        List cryptoStats = list;
        List sortedCurrencies = (i & 16) != 0 ? aVar.e : list2;
        List filteredCurrencies = (i & 32) != 0 ? aVar.f : list3;
        Data rates = (i & 64) != 0 ? aVar.f170042g : data;
        Data performance = (i & 128) != 0 ? aVar.f170043h : data2;
        Set selectedCurrencies = (i & 256) != 0 ? aVar.i : linkedHashSet;
        sh5.c fcaDisclaimer = (i & 512) != 0 ? aVar.f170044j : cVar2;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(sortingOrder, "sortingOrder");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(cryptoStats, "cryptoStats");
        Intrinsics.checkNotNullParameter(sortedCurrencies, "sortedCurrencies");
        Intrinsics.checkNotNullParameter(filteredCurrencies, "filteredCurrencies");
        Intrinsics.checkNotNullParameter(rates, "rates");
        Intrinsics.checkNotNullParameter(performance, "performance");
        Intrinsics.checkNotNullParameter(selectedCurrencies, "selectedCurrencies");
        Intrinsics.checkNotNullParameter(fcaDisclaimer, "fcaDisclaimer");
        return new a(searchQuery, sortingOrder, currencies, cryptoStats, sortedCurrencies, filteredCurrencies, rates, performance, selectedCurrencies, fcaDisclaimer);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f170039a, aVar.f170039a) && this.f170040b == aVar.f170040b && Intrinsics.f(this.f170041c, aVar.f170041c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f170042g, aVar.f170042g) && Intrinsics.f(this.f170043h, aVar.f170043h) && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f170044j, aVar.f170044j);
    }

    public final int hashCode() {
        return this.f170044j.hashCode() + p.a.f(kii.e.c(this.f170043h, kii.e.c(this.f170042g, p.a.d(p.a.d(p.a.d(p.a.d((this.f170040b.hashCode() + (this.f170039a.hashCode() * 31)) * 31, 31, this.f170041c), 31, this.d), 31, this.e), 31, this.f), 31), 31), 31, this.i);
    }
}

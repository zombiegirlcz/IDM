package z8b;

import com.revolut.data.model.Data;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f320057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f320058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f320059c;

    public g() {
        this(7, null);
    }

    public static g a(g gVar, Data allCurrenciesData, LinkedHashSet linkedHashSet, String query, int i) {
        if ((i & 1) != 0) {
            allCurrenciesData = gVar.f320057a;
        }
        Set selectedCurrencies = linkedHashSet;
        if ((i & 2) != 0) {
            selectedCurrencies = gVar.f320058b;
        }
        if ((i & 4) != 0) {
            query = gVar.f320059c;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(allCurrenciesData, "allCurrenciesData");
        Intrinsics.checkNotNullParameter(selectedCurrencies, "selectedCurrencies");
        Intrinsics.checkNotNullParameter(query, "query");
        return new g(allCurrenciesData, selectedCurrencies, query);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f320057a, gVar.f320057a) && Intrinsics.f(this.f320058b, gVar.f320058b) && Intrinsics.f(this.f320059c, gVar.f320059c);
    }

    public final int hashCode() {
        return this.f320059c.hashCode() + p.a.f(this.f320057a.hashCode() * 31, 31, this.f320058b);
    }

    public g(Data allCurrenciesData, Set selectedCurrencies, String query) {
        Intrinsics.checkNotNullParameter(allCurrenciesData, "allCurrenciesData");
        Intrinsics.checkNotNullParameter(selectedCurrencies, "selectedCurrencies");
        Intrinsics.checkNotNullParameter(query, "query");
        this.f320057a = allCurrenciesData;
        this.f320058b = selectedCurrencies;
        this.f320059c = query;
    }

    public g(int i, Set set) {
        this(new Data(null, null, true, 3, null), (i & 2) != 0 ? h0.f322473a : set, "");
    }
}

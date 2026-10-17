package afa;

import com.revolut.data.model.Data;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f3987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f3988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f3989c;
    public final Data d;
    public final Map e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f3990g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f3991h;

    public g(Data pockets, Data availableCurrencies, Data slots, Data currencyAccountInfoByCountry, Map isCurrencyGroupExpandedMap, String searchTerm, Data switchToRevAccountAvailability, Data salaryAccountAvailability) {
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(availableCurrencies, "availableCurrencies");
        Intrinsics.checkNotNullParameter(slots, "slots");
        Intrinsics.checkNotNullParameter(currencyAccountInfoByCountry, "currencyAccountInfoByCountry");
        Intrinsics.checkNotNullParameter(isCurrencyGroupExpandedMap, "isCurrencyGroupExpandedMap");
        Intrinsics.checkNotNullParameter(searchTerm, "searchTerm");
        Intrinsics.checkNotNullParameter(switchToRevAccountAvailability, "switchToRevAccountAvailability");
        Intrinsics.checkNotNullParameter(salaryAccountAvailability, "salaryAccountAvailability");
        this.f3987a = pockets;
        this.f3988b = availableCurrencies;
        this.f3989c = slots;
        this.d = currencyAccountInfoByCountry;
        this.e = isCurrencyGroupExpandedMap;
        this.f = searchTerm;
        this.f3990g = switchToRevAccountAvailability;
        this.f3991h = salaryAccountAvailability;
    }

    public static g a(g gVar, Data data, Data data2, Data data3, Data data4, Map map, String str, Data data5, Data data6, int i) {
        if ((i & 1) != 0) {
            data = gVar.f3987a;
        }
        Data pockets = data;
        if ((i & 2) != 0) {
            data2 = gVar.f3988b;
        }
        Data availableCurrencies = data2;
        if ((i & 4) != 0) {
            data3 = gVar.f3989c;
        }
        Data slots = data3;
        if ((i & 8) != 0) {
            data4 = gVar.d;
        }
        Data currencyAccountInfoByCountry = data4;
        if ((i & 16) != 0) {
            map = gVar.e;
        }
        Map isCurrencyGroupExpandedMap = map;
        if ((i & 32) != 0) {
            str = gVar.f;
        }
        String searchTerm = str;
        Data switchToRevAccountAvailability = (i & 64) != 0 ? gVar.f3990g : data5;
        Data salaryAccountAvailability = (i & 128) != 0 ? gVar.f3991h : data6;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(availableCurrencies, "availableCurrencies");
        Intrinsics.checkNotNullParameter(slots, "slots");
        Intrinsics.checkNotNullParameter(currencyAccountInfoByCountry, "currencyAccountInfoByCountry");
        Intrinsics.checkNotNullParameter(isCurrencyGroupExpandedMap, "isCurrencyGroupExpandedMap");
        Intrinsics.checkNotNullParameter(searchTerm, "searchTerm");
        Intrinsics.checkNotNullParameter(switchToRevAccountAvailability, "switchToRevAccountAvailability");
        Intrinsics.checkNotNullParameter(salaryAccountAvailability, "salaryAccountAvailability");
        return new g(pockets, availableCurrencies, slots, currencyAccountInfoByCountry, isCurrencyGroupExpandedMap, searchTerm, switchToRevAccountAvailability, salaryAccountAvailability);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f3987a, gVar.f3987a) && Intrinsics.f(this.f3988b, gVar.f3988b) && Intrinsics.f(this.f3989c, gVar.f3989c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f3990g, gVar.f3990g) && Intrinsics.f(this.f3991h, gVar.f3991h);
    }

    public final int hashCode() {
        return this.f3991h.hashCode() + kii.e.c(this.f3990g, p.a.c(p.a.e(kii.e.c(this.d, kii.e.c(this.f3989c, kii.e.c(this.f3988b, this.f3987a.hashCode() * 31, 31), 31), 31), 31, this.e), 31, this.f), 31);
    }
}

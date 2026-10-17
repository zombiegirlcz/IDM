package fod;

import do3.n;
import h30.l;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f136922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f136923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f136924c;
    public final Collection d;
    public final LinkedHashMap e;

    public a(n user, xi0.b baseCurrency, boolean z, Collection currencyPairs, LinkedHashMap exchangeRatesMap) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(currencyPairs, "currencyPairs");
        Intrinsics.checkNotNullParameter(exchangeRatesMap, "exchangeRatesMap");
        this.f136922a = user;
        this.f136923b = baseCurrency;
        this.f136924c = z;
        this.d = currencyPairs;
        this.e = exchangeRatesMap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f136922a, aVar.f136922a) && Intrinsics.f(this.f136923b, aVar.f136923b) && this.f136924c == aVar.f136924c && Intrinsics.f(this.d, aVar.d) && this.e.equals(aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + j6.a.c(l.j(this.f136923b, this.f136922a.hashCode() * 31, 31), 31, this.f136924c)) * 31);
    }
}

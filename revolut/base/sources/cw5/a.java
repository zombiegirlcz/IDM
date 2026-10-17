package cw5;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f109531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f109532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f109533c;

    public a(List sortedCurrencies, List exchangeRates, List performances) {
        Intrinsics.checkNotNullParameter(sortedCurrencies, "sortedCurrencies");
        Intrinsics.checkNotNullParameter(exchangeRates, "exchangeRates");
        Intrinsics.checkNotNullParameter(performances, "performances");
        this.f109531a = sortedCurrencies;
        this.f109532b = exchangeRates;
        this.f109533c = performances;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f109531a, aVar.f109531a) && Intrinsics.f(this.f109532b, aVar.f109532b) && Intrinsics.f(this.f109533c, aVar.f109533c);
    }

    public final int hashCode() {
        return this.f109533c.hashCode() + p.a.d(this.f109531a.hashCode() * 31, 31, this.f109532b);
    }
}

package kye;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class x extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f190868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f190869b;

    public x(String currency, List topUpCurrencies) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(topUpCurrencies, "topUpCurrencies");
        this.f190868a = currency;
        this.f190869b = topUpCurrencies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f190868a, xVar.f190868a) && Intrinsics.f(this.f190869b, xVar.f190869b);
    }

    public final int hashCode() {
        return this.f190869b.hashCode() + (this.f190868a.hashCode() * 31);
    }
}

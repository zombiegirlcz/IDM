package x8b;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f303307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f303308b;

    public b(String baseCurrencyCode, ArrayList cryptosMarketCap) {
        Intrinsics.checkNotNullParameter(baseCurrencyCode, "baseCurrencyCode");
        Intrinsics.checkNotNullParameter(cryptosMarketCap, "cryptosMarketCap");
        this.f303307a = baseCurrencyCode;
        this.f303308b = cryptosMarketCap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f303307a, bVar.f303307a) && this.f303308b.equals(bVar.f303308b);
    }

    public final int hashCode() {
        return this.f303308b.hashCode() + (this.f303307a.hashCode() * 31);
    }
}

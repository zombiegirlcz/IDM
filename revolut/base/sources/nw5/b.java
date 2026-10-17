package nw5;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f219773b;

    public b(String baseCurrencyCode, ArrayList cryptosMarketCap) {
        Intrinsics.checkNotNullParameter(baseCurrencyCode, "baseCurrencyCode");
        Intrinsics.checkNotNullParameter(cryptosMarketCap, "cryptosMarketCap");
        this.f219772a = baseCurrencyCode;
        this.f219773b = cryptosMarketCap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f219772a, bVar.f219772a) && this.f219773b.equals(bVar.f219773b);
    }

    public final int hashCode() {
        return this.f219773b.hashCode() + (this.f219772a.hashCode() * 31);
    }
}

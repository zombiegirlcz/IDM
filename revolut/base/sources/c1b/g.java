package c1b;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f20434b;

    public g(String symbol, List historyItems) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(historyItems, "historyItems");
        this.f20433a = symbol;
        this.f20434b = historyItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f20433a, gVar.f20433a) && Intrinsics.f(this.f20434b, gVar.f20434b);
    }

    public final int hashCode() {
        return this.f20434b.hashCode() + (this.f20433a.hashCode() * 31);
    }
}

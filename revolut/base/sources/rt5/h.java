package rt5;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f257199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f257200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f257201c;

    public h(List pocketBalances, List averagePrices, List midRates) {
        Intrinsics.checkNotNullParameter(pocketBalances, "pocketBalances");
        Intrinsics.checkNotNullParameter(averagePrices, "averagePrices");
        Intrinsics.checkNotNullParameter(midRates, "midRates");
        this.f257199a = pocketBalances;
        this.f257200b = averagePrices;
        this.f257201c = midRates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f257199a, hVar.f257199a) && Intrinsics.f(this.f257200b, hVar.f257200b) && Intrinsics.f(this.f257201c, hVar.f257201c);
    }

    public final int hashCode() {
        return this.f257201c.hashCode() + p.a.d(this.f257199a.hashCode() * 31, 31, this.f257200b);
    }
}

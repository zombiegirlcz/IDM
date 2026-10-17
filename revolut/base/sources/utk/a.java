package utk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f283117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eel.e f283118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mel.c f283119c;

    public a(dj0.d currentPrice, eel.e historicalChartData, mel.c priceTarget) {
        Intrinsics.checkNotNullParameter(currentPrice, "currentPrice");
        Intrinsics.checkNotNullParameter(historicalChartData, "historicalChartData");
        Intrinsics.checkNotNullParameter(priceTarget, "priceTarget");
        this.f283117a = currentPrice;
        this.f283118b = historicalChartData;
        this.f283119c = priceTarget;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f283117a, aVar.f283117a) && Intrinsics.f(this.f283118b, aVar.f283118b) && Intrinsics.f(this.f283119c, aVar.f283119c);
    }

    public final int hashCode() {
        return this.f283119c.hashCode() + ((this.f283118b.hashCode() + (this.f283117a.hashCode() * 31)) * 31);
    }
}

package xzg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f310027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f310028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f310029c;
    public final List d;

    public s(List commodities, List allAssets, List stocks, List crypto) {
        Intrinsics.checkNotNullParameter(commodities, "commodities");
        Intrinsics.checkNotNullParameter(allAssets, "allAssets");
        Intrinsics.checkNotNullParameter(stocks, "stocks");
        Intrinsics.checkNotNullParameter(crypto, "crypto");
        this.f310027a = commodities;
        this.f310028b = allAssets;
        this.f310029c = stocks;
        this.d = crypto;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f310027a, sVar.f310027a) && Intrinsics.f(this.f310028b, sVar.f310028b) && Intrinsics.f(this.f310029c, sVar.f310029c) && Intrinsics.f(this.d, sVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.d(this.f310027a.hashCode() * 31, 31, this.f310028b), 31, this.f310029c);
    }
}

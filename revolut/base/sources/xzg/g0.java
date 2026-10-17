package xzg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f309992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f309993b;

    public g0(List stocks, List etfs) {
        Intrinsics.checkNotNullParameter(stocks, "stocks");
        Intrinsics.checkNotNullParameter(etfs, "etfs");
        this.f309992a = stocks;
        this.f309993b = etfs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f309992a, g0Var.f309992a) && Intrinsics.f(this.f309993b, g0Var.f309993b);
    }

    public final int hashCode() {
        return this.f309993b.hashCode() + (this.f309992a.hashCode() * 31);
    }
}

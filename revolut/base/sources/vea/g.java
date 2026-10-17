package vea;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f288191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f288192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f288193c;

    public g(LinkedHashMap currencies, Map ratesByCode, Map performancesByCode) {
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(ratesByCode, "ratesByCode");
        Intrinsics.checkNotNullParameter(performancesByCode, "performancesByCode");
        this.f288191a = currencies;
        this.f288192b = ratesByCode;
        this.f288193c = performancesByCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f288191a, gVar.f288191a) && this.f288192b.equals(gVar.f288192b) && this.f288193c.equals(gVar.f288193c);
    }

    public final int hashCode() {
        return this.f288193c.hashCode() + p.a.b(this.f288191a.hashCode() * 31, 31, this.f288192b);
    }
}

package le3;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f194462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f194463b;

    public g(List rates, Set currencyPairs) {
        Intrinsics.checkNotNullParameter(currencyPairs, "currencyPairs");
        Intrinsics.checkNotNullParameter(rates, "rates");
        this.f194462a = currencyPairs;
        this.f194463b = rates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f194462a, gVar.f194462a) && Intrinsics.f(this.f194463b, gVar.f194463b);
    }

    public final int hashCode() {
        return this.f194463b.hashCode() + (this.f194462a.hashCode() * 31);
    }
}

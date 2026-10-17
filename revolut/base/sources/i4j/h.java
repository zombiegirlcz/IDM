package i4j;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f158518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f158519b;

    public h(Set availableCurrencies, xi0.b preselectedCurrency) {
        Intrinsics.checkNotNullParameter(preselectedCurrency, "preselectedCurrency");
        Intrinsics.checkNotNullParameter(availableCurrencies, "availableCurrencies");
        this.f158518a = preselectedCurrency;
        this.f158519b = availableCurrencies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f158518a, hVar.f158518a) && Intrinsics.f(this.f158519b, hVar.f158519b);
    }

    public final int hashCode() {
        return this.f158519b.hashCode() + (this.f158518a.hashCode() * 31);
    }
}

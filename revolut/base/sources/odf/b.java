package odf;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f224457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f224458b;

    public b(Set currencies, xi0.b selectedCurrency) {
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(selectedCurrency, "selectedCurrency");
        this.f224457a = currencies;
        this.f224458b = selectedCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f224457a, bVar.f224457a) && Intrinsics.f(this.f224458b, bVar.f224458b);
    }

    public final int hashCode() {
        return this.f224458b.hashCode() + (this.f224457a.hashCode() * 31);
    }
}

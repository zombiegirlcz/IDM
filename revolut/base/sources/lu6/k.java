package lu6;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f200046a;

    public k(Set allCurrencies) {
        Intrinsics.checkNotNullParameter(allCurrencies, "allCurrencies");
        this.f200046a = allCurrencies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f200046a, ((k) obj2).f200046a);
    }

    public final int hashCode() {
        return this.f200046a.hashCode();
    }
}

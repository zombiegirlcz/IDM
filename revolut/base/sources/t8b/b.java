package t8b;

import aii.e;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f268877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f268878b;

    public b(Set currenciesToExclude, Set selectedCurrencies) {
        Intrinsics.checkNotNullParameter(currenciesToExclude, "currenciesToExclude");
        Intrinsics.checkNotNullParameter(selectedCurrencies, "selectedCurrencies");
        this.f268877a = currenciesToExclude;
        this.f268878b = selectedCurrencies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f268877a, bVar.f268877a) && Intrinsics.f(this.f268878b, bVar.f268878b);
    }

    public final int hashCode() {
        return this.f268878b.hashCode() + (this.f268877a.hashCode() * 31);
    }
}

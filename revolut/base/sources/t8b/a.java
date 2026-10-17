package t8b;

import aii.r;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f268876a;

    public a(Set selectedCurrencies) {
        Intrinsics.checkNotNullParameter(selectedCurrencies, "selectedCurrencies");
        this.f268876a = selectedCurrencies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f268876a, ((a) obj2).f268876a);
    }

    public final int hashCode() {
        return this.f268876a.hashCode();
    }
}

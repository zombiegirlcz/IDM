package z8b;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f320060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f320061b;

    public h(Set currenciesToExclude, Set selectedCurrencies) {
        Intrinsics.checkNotNullParameter(currenciesToExclude, "currenciesToExclude");
        Intrinsics.checkNotNullParameter(selectedCurrencies, "selectedCurrencies");
        this.f320060a = currenciesToExclude;
        this.f320061b = selectedCurrencies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f320060a, hVar.f320060a) && Intrinsics.f(this.f320061b, hVar.f320061b);
    }

    public final int hashCode() {
        return this.f320061b.hashCode() + (this.f320060a.hashCode() * 31);
    }
}

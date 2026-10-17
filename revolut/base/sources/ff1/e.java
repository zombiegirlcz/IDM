package ff1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f134692a;

    public e(List taxRates) {
        Intrinsics.checkNotNullParameter(taxRates, "taxRates");
        this.f134692a = taxRates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f134692a, ((e) obj2).f134692a);
    }

    public final int hashCode() {
        return this.f134692a.hashCode();
    }
}

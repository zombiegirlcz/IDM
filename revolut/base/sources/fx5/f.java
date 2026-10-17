package fx5;

import aii.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f138739a;

    public f(List selectedCryptocurrencies) {
        Intrinsics.checkNotNullParameter(selectedCryptocurrencies, "selectedCryptocurrencies");
        this.f138739a = selectedCryptocurrencies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f138739a, ((f) obj2).f138739a);
    }

    public final int hashCode() {
        return this.f138739a.hashCode();
    }
}

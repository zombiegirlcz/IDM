package f47;

import aii.r;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f132016a;

    public g(Set currencies) {
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        this.f132016a = currencies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f132016a, ((g) obj2).f132016a);
    }

    public final int hashCode() {
        return this.f132016a.hashCode();
    }
}

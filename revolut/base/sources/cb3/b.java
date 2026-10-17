package cb3;

import aii.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f22718a;

    public b(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f22718a = currency;
    }

    public final xi0.b b() {
        return this.f22718a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f22718a, ((b) obj2).f22718a);
    }

    public final int hashCode() {
        return this.f22718a.hashCode();
    }
}

package k5k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class t implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nrf.f f181551a;

    public t(nrf.f fees) {
        Intrinsics.checkNotNullParameter(fees, "fees");
        this.f181551a = fees;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f181551a, ((t) obj2).f181551a);
    }

    public final int hashCode() {
        return this.f181551a.hashCode();
    }
}

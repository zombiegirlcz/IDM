package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l6 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f272916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272917b;

    public l6(long j2, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f272916a = j2;
        this.f272917b = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l6)) {
            return false;
        }
        l6 l6Var = (l6) obj2;
        return this.f272916a == l6Var.f272916a && Intrinsics.f(this.f272917b, l6Var.f272917b);
    }

    public final int hashCode() {
        return this.f272917b.hashCode() + (Long.hashCode(this.f272916a) * 31);
    }
}

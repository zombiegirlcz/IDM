package xdf;

import kotlin.jvm.internal.Intrinsics;
import nel.n;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f304433a;

    public g(n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.f304433a = instrument;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f304433a, ((g) obj2).f304433a);
    }

    public final int hashCode() {
        return this.f304433a.hashCode();
    }
}

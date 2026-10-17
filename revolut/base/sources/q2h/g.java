package q2h;

import kotlin.jvm.internal.Intrinsics;
import nel.n;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f241657a;

    public g(n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.f241657a = instrument;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f241657a, ((g) obj2).f241657a);
    }

    public final int hashCode() {
        return this.f241657a.hashCode();
    }
}

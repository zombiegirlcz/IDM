package y1h;

import kotlin.jvm.internal.Intrinsics;
import nel.n;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f310380a;

    public b(n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.f310380a = instrument;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f310380a, ((b) obj2).f310380a);
    }

    @Override // y1h.c
    public final String getId() {
        return this.f310380a.f214596b;
    }

    public final int hashCode() {
        return this.f310380a.hashCode();
    }
}

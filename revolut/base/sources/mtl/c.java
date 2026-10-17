package mtl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nel.n f208915a;

    public c(nel.n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.f208915a = instrument;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f208915a, ((c) obj2).f208915a);
    }

    public final int hashCode() {
        return this.f208915a.hashCode();
    }
}

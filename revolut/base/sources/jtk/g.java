package jtk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3h.a f178532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nel.n f178533b;

    public g(g3h.a warning, nel.n instrument) {
        Intrinsics.checkNotNullParameter(warning, "warning");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.f178532a = warning;
        this.f178533b = instrument;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f178532a == gVar.f178532a && Intrinsics.f(this.f178533b, gVar.f178533b);
    }

    public final int hashCode() {
        return this.f178533b.hashCode() + (this.f178532a.hashCode() * 31);
    }
}

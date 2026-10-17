package k3h;

import kotlin.jvm.internal.Intrinsics;
import nel.n;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wdh.a f180741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f180742b;

    public f(wdh.a ratingsProvider, n instrument) {
        Intrinsics.checkNotNullParameter(ratingsProvider, "ratingsProvider");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.f180741a = ratingsProvider;
        this.f180742b = instrument;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f180741a == fVar.f180741a && Intrinsics.f(this.f180742b, fVar.f180742b);
    }

    public final int hashCode() {
        return this.f180742b.hashCode() + (this.f180741a.hashCode() * 31);
    }
}

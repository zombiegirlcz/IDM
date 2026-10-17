package odf;

import kotlin.jvm.internal.Intrinsics;
import nel.n;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f224456a;

    public a(n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.f224456a = instrument;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f224456a, ((a) obj2).f224456a);
    }

    public final int hashCode() {
        return this.f224456a.hashCode();
    }
}

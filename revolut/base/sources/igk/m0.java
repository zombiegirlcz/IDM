package igk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m0 implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xfa.b f161260a;

    public m0(xfa.b source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f161260a = source;
    }

    public final xfa.b b() {
        return this.f161260a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m0) && this.f161260a == ((m0) obj2).f161260a;
    }

    public final int hashCode() {
        return this.f161260a.hashCode();
    }
}

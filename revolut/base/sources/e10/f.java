package e10;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f121805a;

    public f(h thresholds) {
        Intrinsics.checkNotNullParameter(thresholds, "thresholds");
        this.f121805a = thresholds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f121805a, ((f) obj2).f121805a);
    }

    public final int hashCode() {
        return this.f121805a.hashCode();
    }
}

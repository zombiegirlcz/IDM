package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class tc implements vc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sc f166493a;

    public tc(sc heightMode) {
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        this.f166493a = heightMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof tc) && Intrinsics.f(this.f166493a, ((tc) obj2).f166493a);
    }

    public final int hashCode() {
        return this.f166493a.hashCode();
    }

    public tc() {
        this(pc.f165813a);
    }
}

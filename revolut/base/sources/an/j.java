package an;

import kotlin.jvm.internal.Intrinsics;
import rp0.v0;

/* JADX INFO: loaded from: classes17.dex */
public final class j extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f6508a;

    public j(v0 visibilityData) {
        Intrinsics.checkNotNullParameter(visibilityData, "visibilityData");
        this.f6508a = visibilityData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f6508a, ((j) obj2).f6508a);
    }

    public final int hashCode() {
        return this.f6508a.hashCode();
    }
}

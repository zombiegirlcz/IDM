package m6f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class s extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdh.b f203082a;

    public s(xdh.b rebalanceStatus) {
        Intrinsics.checkNotNullParameter(rebalanceStatus, "rebalanceStatus");
        this.f203082a = rebalanceStatus;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && this.f203082a == ((s) obj2).f203082a;
    }

    public final int hashCode() {
        return this.f203082a.hashCode();
    }
}

package h7f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdh.b f149877a;

    public b(xdh.b rebalanceStatus) {
        Intrinsics.checkNotNullParameter(rebalanceStatus, "rebalanceStatus");
        this.f149877a = rebalanceStatus;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f149877a == ((b) obj2).f149877a;
    }

    public final int hashCode() {
        return this.f149877a.hashCode();
    }
}

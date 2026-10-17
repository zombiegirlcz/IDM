package n6f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdh.b f212779a;

    public d(xdh.b rebalanceStatus) {
        Intrinsics.checkNotNullParameter(rebalanceStatus, "rebalanceStatus");
        this.f212779a = rebalanceStatus;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f212779a == ((d) obj2).f212779a;
    }

    public final int hashCode() {
        return this.f212779a.hashCode();
    }
}

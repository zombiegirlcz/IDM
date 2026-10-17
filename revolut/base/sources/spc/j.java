package spc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdh.b f264950a;

    public j(xdh.b rebalanceStatus) {
        Intrinsics.checkNotNullParameter(rebalanceStatus, "rebalanceStatus");
        this.f264950a = rebalanceStatus;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f264950a == ((j) obj2).f264950a;
    }

    public final int hashCode() {
        return this.f264950a.hashCode();
    }
}

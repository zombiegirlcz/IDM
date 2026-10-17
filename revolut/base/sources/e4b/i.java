package e4b;

import dfl.v;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f122525a;

    public i(v trade) {
        Intrinsics.checkNotNullParameter(trade, "trade");
        this.f122525a = trade;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f122525a, ((i) obj2).f122525a);
    }

    public final int hashCode() {
        return this.f122525a.hashCode();
    }
}

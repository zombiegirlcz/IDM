package m9a;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g8a.a f203674a;

    public d(g8a.a reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f203674a = reason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f203674a == ((d) obj2).f203674a;
    }

    public final int hashCode() {
        return this.f203674a.hashCode();
    }
}

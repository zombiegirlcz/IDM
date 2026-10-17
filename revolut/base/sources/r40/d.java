package r40;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f251330a;

    public d(String ticketId) {
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        this.f251330a = ticketId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f251330a, ((d) obj2).f251330a);
    }

    public final int hashCode() {
        return this.f251330a.hashCode();
    }
}

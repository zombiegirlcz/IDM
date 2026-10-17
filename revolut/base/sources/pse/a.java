package pse;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f239483a;

    public a(String ticketId) {
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        this.f239483a = ticketId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f239483a, ((a) obj2).f239483a);
    }

    public final int hashCode() {
        return this.f239483a.hashCode();
    }
}

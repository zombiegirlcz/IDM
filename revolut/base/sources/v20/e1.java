package v20;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e1 extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f285371a;

    public e1(UUID ticketId) {
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        this.f285371a = ticketId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e1) && Intrinsics.f(this.f285371a, ((e1) obj2).f285371a);
    }

    public final int hashCode() {
        return this.f285371a.hashCode();
    }
}

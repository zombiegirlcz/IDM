package ix6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169418a;

    public z(String invoiceId) {
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        this.f169418a = invoiceId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && Intrinsics.f(this.f169418a, ((z) obj2).f169418a);
    }

    public final int hashCode() {
        return this.f169418a.hashCode();
    }
}

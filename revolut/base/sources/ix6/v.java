package ix6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169414a;

    public v(String invoiceId) {
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        this.f169414a = invoiceId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f169414a, ((v) obj2).f169414a);
    }

    public final int hashCode() {
        return this.f169414a.hashCode();
    }
}

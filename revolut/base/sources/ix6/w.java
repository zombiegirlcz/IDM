package ix6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169415a;

    public w(String invoiceId) {
        Intrinsics.checkNotNullParameter(invoiceId, "invoiceId");
        this.f169415a = invoiceId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f169415a, ((w) obj2).f169415a);
    }

    public final int hashCode() {
        return this.f169415a.hashCode();
    }
}

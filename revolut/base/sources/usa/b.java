package usa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f282845a;

    public b(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f282845a = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f282845a, ((b) obj2).f282845a);
    }

    public final int hashCode() {
        return this.f282845a.hashCode();
    }
}

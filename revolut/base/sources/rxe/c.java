package rxe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f258142a;

    public c(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f258142a = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f258142a, ((c) obj2).f258142a);
    }

    public final int hashCode() {
        return this.f258142a.hashCode();
    }
}

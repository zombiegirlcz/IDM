package lee;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194533a;

    public h(String uniqueTransactionReference) {
        Intrinsics.checkNotNullParameter(uniqueTransactionReference, "uniqueTransactionReference");
        this.f194533a = uniqueTransactionReference;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f194533a, ((h) obj2).f194533a);
    }

    public final int hashCode() {
        return this.f194533a.hashCode();
    }
}

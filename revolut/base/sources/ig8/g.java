package ig8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f161089a;

    public g(e failureReason) {
        Intrinsics.checkNotNullParameter(failureReason, "failureReason");
        this.f161089a = failureReason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f161089a == ((g) obj2).f161089a;
    }

    public final int hashCode() {
        return this.f161089a.hashCode();
    }
}

package g00;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f139246a;

    public b(a failureReason) {
        Intrinsics.checkNotNullParameter(failureReason, "failureReason");
        this.f139246a = failureReason;
    }

    @Override // xv.q
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f139246a == ((b) obj2).f139246a;
    }

    public final int hashCode() {
        return this.f139246a.hashCode();
    }
}

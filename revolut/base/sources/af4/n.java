package af4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final it3.d f3869a;

    public n(it3.d currentStatus) {
        Intrinsics.checkNotNullParameter(currentStatus, "currentStatus");
        this.f3869a = currentStatus;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f3869a, ((n) obj2).f3869a);
    }

    public final int hashCode() {
        return this.f3869a.hashCode();
    }
}

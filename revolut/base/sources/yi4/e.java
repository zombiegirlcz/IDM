package yi4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final it3.d f314236a;

    public e(it3.d status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f314236a = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f314236a, ((e) obj2).f314236a);
    }

    public final int hashCode() {
        return this.f314236a.hashCode();
    }
}

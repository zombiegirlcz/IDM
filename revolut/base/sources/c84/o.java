package c84;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final it3.d f22101a;

    public o(it3.d status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f22101a = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f22101a, ((o) obj2).f22101a);
    }

    public final int hashCode() {
        return this.f22101a.hashCode();
    }
}

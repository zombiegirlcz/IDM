package y7a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f311454a;

    public v(w result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f311454a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f311454a, ((v) obj2).f311454a);
    }

    public final int hashCode() {
        return this.f311454a.hashCode();
    }
}

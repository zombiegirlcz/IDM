package s3d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f259645a;

    public e(String watchlistId) {
        Intrinsics.checkNotNullParameter(watchlistId, "watchlistId");
        this.f259645a = watchlistId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f259645a, ((e) obj2).f259645a);
    }

    public final int hashCode() {
        return this.f259645a.hashCode();
    }
}

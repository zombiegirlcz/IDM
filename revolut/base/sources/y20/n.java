package y20;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f310525a;

    public n(UUID feedId) {
        Intrinsics.checkNotNullParameter(feedId, "feedId");
        this.f310525a = feedId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f310525a, ((n) obj2).f310525a);
    }

    public final int hashCode() {
        return this.f310525a.hashCode();
    }
}

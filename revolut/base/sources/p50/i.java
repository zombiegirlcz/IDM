package p50;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f232996a;

    public i(UUID feedId) {
        Intrinsics.checkNotNullParameter(feedId, "feedId");
        this.f232996a = feedId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f232996a, ((i) obj2).f232996a);
    }

    public final int hashCode() {
        return this.f232996a.hashCode() * 31;
    }
}

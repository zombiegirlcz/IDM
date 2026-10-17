package re7;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f253534a;

    public e(Instant claimEndDate) {
        Intrinsics.checkNotNullParameter(claimEndDate, "claimEndDate");
        this.f253534a = claimEndDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f253534a, ((e) obj2).f253534a);
    }

    public final int hashCode() {
        return this.f253534a.hashCode();
    }
}

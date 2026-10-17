package rsl;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f257137a;

    public k(Instant deadline) {
        Intrinsics.checkNotNullParameter(deadline, "deadline");
        this.f257137a = deadline;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f257137a, ((k) obj2).f257137a);
    }

    public final int hashCode() {
        return this.f257137a.hashCode();
    }
}

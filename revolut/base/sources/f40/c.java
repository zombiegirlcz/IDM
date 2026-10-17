package f40;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f131989a;

    public c(Instant instant) {
        this.f131989a = instant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f131989a, ((c) obj2).f131989a);
    }

    public final int hashCode() {
        Instant instant = this.f131989a;
        if (instant == null) {
            return 0;
        }
        return instant.hashCode();
    }
}

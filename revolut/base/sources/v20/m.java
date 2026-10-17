package v20;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes19.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f285468a;

    public m(Instant instant) {
        this.f285468a = instant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f285468a, ((m) obj2).f285468a);
    }

    public final int hashCode() {
        Instant instant = this.f285468a;
        return Integer.hashCode(20) + ((instant == null ? 0 : instant.hashCode()) * 31);
    }
}

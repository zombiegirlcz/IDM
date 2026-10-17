package w30;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f294075a;

    public a(Instant instant) {
        this.f294075a = instant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f294075a, ((a) obj2).f294075a);
    }

    public final int hashCode() {
        Instant instant = this.f294075a;
        if (instant == null) {
            return 0;
        }
        return instant.hashCode();
    }
}

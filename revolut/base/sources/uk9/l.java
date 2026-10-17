package uk9;

import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ZonedDateTime f280711a;

    public l(ZonedDateTime date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.f280711a = date;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f280711a, ((l) obj2).f280711a);
    }

    public final int hashCode() {
        return this.f280711a.hashCode();
    }
}

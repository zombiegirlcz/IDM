package uzi;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Interval;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Interval f284681a;

    public d(Interval tabInterval) {
        Intrinsics.checkNotNullParameter(tabInterval, "tabInterval");
        this.f284681a = tabInterval;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f284681a.equals(((d) obj2).f284681a);
    }

    public final int hashCode() {
        return this.f284681a.hashCode() * 31;
    }
}

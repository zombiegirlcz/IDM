package tof;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes8.dex */
public final class g8 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f272769a;

    public g8(DateTime completedDate) {
        Intrinsics.checkNotNullParameter(completedDate, "completedDate");
        this.f272769a = completedDate;
    }

    public final DateTime a() {
        return this.f272769a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g8) && Intrinsics.f(this.f272769a, ((g8) obj2).f272769a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f272769a.hashCode() * 31);
    }
}

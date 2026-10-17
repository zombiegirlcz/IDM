package tof;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes8.dex */
public final class h8 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f272787a;

    public h8(DateTime completedDate) {
        Intrinsics.checkNotNullParameter(completedDate, "completedDate");
        this.f272787a = completedDate;
    }

    public final DateTime a() {
        return this.f272787a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h8) && Intrinsics.f(this.f272787a, ((h8) obj2).f272787a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f272787a.hashCode() * 31);
    }
}

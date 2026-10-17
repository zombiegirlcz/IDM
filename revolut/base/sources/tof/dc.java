package tof;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes8.dex */
public final class dc extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f272700a;

    public dc(DateTime updatedDate) {
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        this.f272700a = updatedDate;
    }

    public final DateTime a() {
        return this.f272700a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof dc) && Intrinsics.f(this.f272700a, ((dc) obj2).f272700a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f272700a.hashCode() * 31);
    }
}

package k4l;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class w extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f181006a;

    public w(LocalDate startDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        this.f181006a = startDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f181006a, ((w) obj2).f181006a);
    }

    public final int hashCode() {
        return this.f181006a.hashCode();
    }
}

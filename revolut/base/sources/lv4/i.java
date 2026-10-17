package lv4;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f200302a;

    public i(LocalDate startDate) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        this.f200302a = startDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f200302a, ((i) obj2).f200302a);
    }

    public final int hashCode() {
        return this.f200302a.hashCode();
    }
}

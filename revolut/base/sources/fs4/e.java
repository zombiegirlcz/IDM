package fs4;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f137591a;

    public e(LocalDate nextDueDate) {
        Intrinsics.checkNotNullParameter(nextDueDate, "nextDueDate");
        this.f137591a = nextDueDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f137591a, ((e) obj2).f137591a);
    }

    public final int hashCode() {
        return this.f137591a.hashCode();
    }
}

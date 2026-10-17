package nvl;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f219747a;

    public e(LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.f219747a = date;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f219747a, ((e) obj2).f219747a);
    }

    public final int hashCode() {
        return this.f219747a.hashCode();
    }
}

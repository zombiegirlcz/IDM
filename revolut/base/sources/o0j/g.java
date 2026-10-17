package o0j;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f221234a;

    public g(LocalDate dateOfBirth) {
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        this.f221234a = dateOfBirth;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f221234a, ((g) obj2).f221234a);
    }

    public final int hashCode() {
        return this.f221234a.hashCode();
    }
}

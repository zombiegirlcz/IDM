package jgk;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class s extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f174089a;

    public s(LocalDate endDate) {
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        this.f174089a = endDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f174089a, ((s) obj2).f174089a);
    }

    public final int hashCode() {
        return this.f174089a.hashCode();
    }
}

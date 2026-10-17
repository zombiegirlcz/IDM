package jck;

import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f172853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f172854b;

    public j0(LocalDate firstBirthday, List upcomingBirthdays) {
        Intrinsics.checkNotNullParameter(firstBirthday, "firstBirthday");
        Intrinsics.checkNotNullParameter(upcomingBirthdays, "upcomingBirthdays");
        this.f172853a = firstBirthday;
        this.f172854b = upcomingBirthdays;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f172853a, j0Var.f172853a) && Intrinsics.f(this.f172854b, j0Var.f172854b);
    }

    public final int hashCode() {
        return this.f172854b.hashCode() + (this.f172853a.hashCode() * 31);
    }
}

package tq7;

import java.time.LocalDate;
import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f273532a;

    public c(LocalDate localDate) {
        this.f273532a = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f273532a, ((c) obj2).f273532a);
    }

    public final int hashCode() {
        LocalDate localDate = this.f273532a;
        if (localDate == null) {
            return 0;
        }
        return localDate.hashCode();
    }
}

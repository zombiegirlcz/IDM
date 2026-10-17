package e71;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f123022a;

    public c(LocalDate estimatedValueDate) {
        Intrinsics.checkNotNullParameter(estimatedValueDate, "estimatedValueDate");
        this.f123022a = estimatedValueDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f123022a, ((c) obj2).f123022a);
    }

    public final int hashCode() {
        return this.f123022a.hashCode();
    }
}

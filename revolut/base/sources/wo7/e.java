package wo7;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f298900a;

    public e(LocalDate policyStartDate) {
        Intrinsics.checkNotNullParameter(policyStartDate, "policyStartDate");
        this.f298900a = policyStartDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f298900a, ((e) obj2).f298900a);
    }

    public final int hashCode() {
        return this.f298900a.hashCode();
    }
}

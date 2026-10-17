package cl4;

import java.time.Period;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Period f24953a;

    public l(Period period) {
        Intrinsics.checkNotNullParameter(period, "period");
        this.f24953a = period;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f24953a, ((l) obj2).f24953a);
    }

    public final int hashCode() {
        return this.f24953a.hashCode();
    }
}

package iha;

import java.time.Period;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Period f161358a;

    public w(Period period) {
        Intrinsics.checkNotNullParameter(period, "period");
        this.f161358a = period;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f161358a, ((w) obj2).f161358a);
    }

    public final int hashCode() {
        return this.f161358a.hashCode();
    }
}

package qp1;

import java.time.YearMonth;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final YearMonth f248233a;

    public e(YearMonth value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f248233a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f248233a, ((e) obj2).f248233a);
    }

    public final int hashCode() {
        return this.f248233a.hashCode();
    }
}

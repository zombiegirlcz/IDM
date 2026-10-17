package z47;

import aii.r;
import java.time.Month;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Month f319335a;

    public c(Month period) {
        Intrinsics.checkNotNullParameter(period, "period");
        this.f319335a = period;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f319335a == ((c) obj2).f319335a;
    }

    public final int hashCode() {
        return this.f319335a.hashCode();
    }
}

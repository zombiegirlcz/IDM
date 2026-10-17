package b57;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fs6.b f12439a;

    public c(fs6.b period) {
        Intrinsics.checkNotNullParameter(period, "period");
        this.f12439a = period;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f12439a == ((c) obj2).f12439a;
    }

    public final int hashCode() {
        return this.f12439a.hashCode();
    }
}

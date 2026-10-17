package gch;

import k4l.c0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f142480a;

    public i(c0 period) {
        Intrinsics.checkNotNullParameter(period, "period");
        this.f142480a = period;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f142480a == ((i) obj2).f142480a;
    }

    public final int hashCode() {
        return this.f142480a.hashCode();
    }
}

package xdb;

import java.time.Duration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Duration f304391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f304392b;

    public f(Duration timeframe, c breakdown) {
        Intrinsics.checkNotNullParameter(timeframe, "timeframe");
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        this.f304391a = timeframe;
        this.f304392b = breakdown;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f304391a, fVar.f304391a) && Intrinsics.f(this.f304392b, fVar.f304392b);
    }

    public final int hashCode() {
        return this.f304392b.hashCode() + (this.f304391a.hashCode() * 31);
    }
}

package xdb;

import java.time.Duration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Duration f304388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f304389b;

    public d(Duration timeframe, c breakdown) {
        Intrinsics.checkNotNullParameter(timeframe, "timeframe");
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        this.f304388a = timeframe;
        this.f304389b = breakdown;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f304388a, dVar.f304388a) && Intrinsics.f(this.f304389b, dVar.f304389b);
    }

    public final int hashCode() {
        return this.f304389b.hashCode() + (this.f304388a.hashCode() * 31);
    }
}

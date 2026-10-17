package h02;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f148188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f148189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f148190c;
    public final long d;

    public g(long j2, dj0.d min, dj0.d max) {
        Intrinsics.checkNotNullParameter(min, "min");
        Intrinsics.checkNotNullParameter(max, "max");
        this.f148188a = min;
        this.f148189b = max;
        this.f148190c = j2;
        this.d = (long) (j2 / ((float) Math.pow(10.0f, max.f115083b.c())));
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f148188a, gVar.f148188a) && Intrinsics.f(this.f148189b, gVar.f148189b) && this.f148190c == gVar.f148190c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f148190c) + v7.c(this.f148188a.hashCode() * 31, 31, this.f148189b);
    }
}

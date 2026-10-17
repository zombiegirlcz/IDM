package qta;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f249059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f249060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f249061c;
    public final dj0.d d;
    public final DateTime e;
    public final DateTime f;

    public j(dj0.d open, dj0.d close, dj0.d high, dj0.d low, DateTime timestampStart, DateTime timestampEnd) {
        Intrinsics.checkNotNullParameter(open, "open");
        Intrinsics.checkNotNullParameter(close, "close");
        Intrinsics.checkNotNullParameter(high, "high");
        Intrinsics.checkNotNullParameter(low, "low");
        Intrinsics.checkNotNullParameter(timestampStart, "timestampStart");
        Intrinsics.checkNotNullParameter(timestampEnd, "timestampEnd");
        this.f249059a = open;
        this.f249060b = close;
        this.f249061c = high;
        this.d = low;
        this.e = timestampStart;
        this.f = timestampEnd;
    }

    public final DateTime a() {
        return this.f;
    }

    public final DateTime b() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f249059a, jVar.f249059a) && Intrinsics.f(this.f249060b, jVar.f249060b) && Intrinsics.f(this.f249061c, jVar.f249061c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + m72.b.f(this.e, v7.c(v7.c(v7.c(this.f249059a.hashCode() * 31, 31, this.f249060b), 31, this.f249061c), 31, this.d), 31);
    }
}

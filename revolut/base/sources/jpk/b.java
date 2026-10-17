package jpk;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import wp5.y;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f177308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f177309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.b f177310c;
    public final jo3.b d;
    public final jo3.b e;
    public final jo3.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f177311g;

    public b(DateTime timestampStart, DateTime timestampEnd, jo3.b open, jo3.b close, jo3.b high, jo3.b low, long j2) {
        Intrinsics.checkNotNullParameter(timestampStart, "timestampStart");
        Intrinsics.checkNotNullParameter(timestampEnd, "timestampEnd");
        Intrinsics.checkNotNullParameter(open, "open");
        Intrinsics.checkNotNullParameter(close, "close");
        Intrinsics.checkNotNullParameter(high, "high");
        Intrinsics.checkNotNullParameter(low, "low");
        this.f177308a = timestampStart;
        this.f177309b = timestampEnd;
        this.f177310c = open;
        this.d = close;
        this.e = high;
        this.f = low;
        this.f177311g = j2;
    }

    public static b a(b bVar, long j2) {
        DateTime timestampStart = bVar.f177308a;
        DateTime timestampEnd = bVar.f177309b;
        jo3.b open = bVar.f177310c;
        jo3.b close = bVar.d;
        jo3.b high = bVar.e;
        jo3.b low = bVar.f;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(timestampStart, "timestampStart");
        Intrinsics.checkNotNullParameter(timestampEnd, "timestampEnd");
        Intrinsics.checkNotNullParameter(open, "open");
        Intrinsics.checkNotNullParameter(close, "close");
        Intrinsics.checkNotNullParameter(high, "high");
        Intrinsics.checkNotNullParameter(low, "low");
        return new b(timestampStart, timestampEnd, open, close, high, low, j2);
    }

    public final jo3.b b() {
        return this.d;
    }

    public final long c() {
        return this.f177311g;
    }

    public final jo3.b d() {
        return this.e;
    }

    public final jo3.b e() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f177308a, bVar.f177308a) && Intrinsics.f(this.f177309b, bVar.f177309b) && Intrinsics.f(this.f177310c, bVar.f177310c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && this.f177311g == bVar.f177311g;
    }

    public final jo3.b f() {
        return this.f177310c;
    }

    public final DateTime g() {
        return this.f177309b;
    }

    public final DateTime h() {
        return this.f177308a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f177311g) + y.e(this.f, y.e(this.e, y.e(this.d, y.e(this.f177310c, m72.b.f(this.f177309b, this.f177308a.hashCode() * 31, 31), 31), 31), 31), 31);
    }
}

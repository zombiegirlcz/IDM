package fzg;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f139195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f139196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f139197c;
    public final DateTime d;
    public final DateTime e;

    public b(dj0.d value, DateTime timestamp, dj0.d netSell, DateTime start, DateTime end2) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(netSell, "netSell");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        this.f139195a = value;
        this.f139196b = timestamp;
        this.f139197c = netSell;
        this.d = start;
        this.e = end2;
    }

    public static b b(b bVar, dj0.d dVar, DateTime timestamp, int i) {
        if ((i & 1) != 0) {
            dVar = bVar.f139195a;
        }
        dj0.d value = dVar;
        dj0.d netSell = bVar.f139197c;
        DateTime start = bVar.d;
        DateTime end2 = bVar.e;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(netSell, "netSell");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        return new b(value, timestamp, netSell, start, end2);
    }

    @Override // fzg.e
    public final e a(DateTime timestamp) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        return b(this, null, timestamp, 29);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f139195a, bVar.f139195a) && Intrinsics.f(this.f139196b, bVar.f139196b) && Intrinsics.f(this.f139197c, bVar.f139197c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    @Override // fzg.e
    public final DateTime getTimestamp() {
        return this.f139196b;
    }

    @Override // fzg.e
    public final dj0.d getValue() {
        return this.f139195a;
    }

    public final int hashCode() {
        return this.e.hashCode() + m72.b.f(this.d, v7.c(m72.b.f(this.f139196b, this.f139195a.hashCode() * 31, 31), 31, this.f139197c), 31);
    }
}

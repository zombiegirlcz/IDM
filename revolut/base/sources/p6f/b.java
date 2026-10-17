package p6f;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f233258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f233259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f233260c;

    public b(long j2, dj0.d amount, dj0.d cumulativeNetTopUp) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(cumulativeNetTopUp, "cumulativeNetTopUp");
        this.f233258a = j2;
        this.f233259b = amount;
        this.f233260c = cumulativeNetTopUp;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f233258a == bVar.f233258a && Intrinsics.f(this.f233259b, bVar.f233259b) && Intrinsics.f(this.f233260c, bVar.f233260c);
    }

    public final int hashCode() {
        return this.f233260c.hashCode() + v7.c(Long.hashCode(this.f233258a) * 31, 31, this.f233259b);
    }
}

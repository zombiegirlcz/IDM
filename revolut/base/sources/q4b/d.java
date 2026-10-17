package q4b;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f242117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f242118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f242119c;

    public d(dj0.d askPrice, dj0.d bidPrice, dj0.d spread) {
        Intrinsics.checkNotNullParameter(askPrice, "askPrice");
        Intrinsics.checkNotNullParameter(bidPrice, "bidPrice");
        Intrinsics.checkNotNullParameter(spread, "spread");
        this.f242117a = askPrice;
        this.f242118b = bidPrice;
        this.f242119c = spread;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f242117a, dVar.f242117a) && Intrinsics.f(this.f242118b, dVar.f242118b) && Intrinsics.f(this.f242119c, dVar.f242119c);
    }

    public final int hashCode() {
        return this.f242119c.hashCode() + v7.c(this.f242117a.hashCode() * 31, 31, this.f242118b);
    }
}

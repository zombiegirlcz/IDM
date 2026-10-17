package y49;

import ip0.v7;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f310844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f310845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f310846c;
    public final List d;
    public final List e;

    public f(dj0.d unrealisedPnl, BigDecimal unrealisedPerformance, dj0.d value, List cashBalances, List positions) {
        Intrinsics.checkNotNullParameter(unrealisedPnl, "unrealisedPnl");
        Intrinsics.checkNotNullParameter(unrealisedPerformance, "unrealisedPerformance");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(cashBalances, "cashBalances");
        Intrinsics.checkNotNullParameter(positions, "positions");
        this.f310844a = unrealisedPnl;
        this.f310845b = unrealisedPerformance;
        this.f310846c = value;
        this.d = cashBalances;
        this.e = positions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f310844a, fVar.f310844a) && Intrinsics.f(this.f310845b, fVar.f310845b) && Intrinsics.f(this.f310846c, fVar.f310846c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.d(v7.c(t61.a.d(this.f310845b, this.f310844a.hashCode() * 31, 31), 31, this.f310846c), 31, this.d);
    }
}

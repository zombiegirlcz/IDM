package dej;

import ip0.v7;
import java.time.Instant;
import java.time.Period;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Period f113511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f113512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f113513c;
    public final Instant d;

    public c3(Period period, dj0.d price, Double d, Instant instant) {
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(price, "price");
        this.f113511a = period;
        this.f113512b = price;
        this.f113513c = d;
        this.d = instant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c3)) {
            return false;
        }
        c3 c3Var = (c3) obj2;
        return Intrinsics.f(this.f113511a, c3Var.f113511a) && Intrinsics.f(this.f113512b, c3Var.f113512b) && Intrinsics.f(this.f113513c, c3Var.f113513c) && Intrinsics.f(this.d, c3Var.d);
    }

    public final int hashCode() {
        int iC = v7.c(this.f113511a.hashCode() * 31, 31, this.f113512b);
        Double d = this.f113513c;
        int iHashCode = (iC + (d == null ? 0 : d.hashCode())) * 31;
        Instant instant = this.d;
        return iHashCode + (instant != null ? instant.hashCode() : 0);
    }
}

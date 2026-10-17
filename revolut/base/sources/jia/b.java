package jia;

import dj0.d;
import ip0.v7;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f174417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f174418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f174419c;
    public final int d;

    public b(LocalDate startDate, LocalDate endDate, d total, int i) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(total, "total");
        this.f174417a = startDate;
        this.f174418b = endDate;
        this.f174419c = total;
        this.d = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f174417a, bVar.f174417a) && Intrinsics.f(this.f174418b, bVar.f174418b) && Intrinsics.f(this.f174419c, bVar.f174419c) && this.d == bVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + v7.c(y.a(this.f174417a.hashCode() * 31, 31, this.f174418b), 31, this.f174419c);
    }
}

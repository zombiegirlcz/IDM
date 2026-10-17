package qib;

import ip0.v7;
import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDateTime f246677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDateTime f246678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDateTime f246679c;
    public final dj0.d d;
    public final a e;
    public final String f;

    public b(LocalDateTime startDate, LocalDateTime nextDate, LocalDateTime endDate, dj0.d amount, a status, String str) {
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(nextDate, "nextDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f246677a = startDate;
        this.f246678b = nextDate;
        this.f246679c = endDate;
        this.d = amount;
        this.e = status;
        this.f = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f246677a, bVar.f246677a) && Intrinsics.f(this.f246678b, bVar.f246678b) && Intrinsics.f(this.f246679c, bVar.f246679c) && Intrinsics.f(this.d, bVar.d) && this.e == bVar.e && Intrinsics.f(this.f, bVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + v7.c(v7.i(this.f246679c, v7.i(this.f246678b, this.f246677a.hashCode() * 31, 31), 31), 31, this.d)) * 31;
        String str = this.f;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}

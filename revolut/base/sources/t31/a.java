package t31;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f267609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f267610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f267611c;

    public a(String token, Instant startDate, Instant endDate) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        this.f267609a = token;
        this.f267610b = startDate;
        this.f267611c = endDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f267609a, aVar.f267609a) && Intrinsics.f(this.f267610b, aVar.f267610b) && Intrinsics.f(this.f267611c, aVar.f267611c);
    }

    public final int hashCode() {
        return this.f267611c.hashCode() + r6.b.c(this.f267609a.hashCode() * 31, 31, this.f267610b);
    }
}

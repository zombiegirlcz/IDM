package zkf;

import ip0.v7;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f322958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f322959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f322960c;
    public final Instant d;
    public final dj0.d e;
    public final Instant f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f322961g;

    public i(String payerName, String groupId, dj0.d limit, Instant until, dj0.d originalAmount, Instant originalDate, boolean z) {
        Intrinsics.checkNotNullParameter(payerName, "payerName");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(limit, "limit");
        Intrinsics.checkNotNullParameter(until, "until");
        Intrinsics.checkNotNullParameter(originalAmount, "originalAmount");
        Intrinsics.checkNotNullParameter(originalDate, "originalDate");
        this.f322958a = payerName;
        this.f322959b = groupId;
        this.f322960c = limit;
        this.d = until;
        this.e = originalAmount;
        this.f = originalDate;
        this.f322961g = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f322958a, iVar.f322958a) && Intrinsics.f(this.f322959b, iVar.f322959b) && Intrinsics.f(this.f322960c, iVar.f322960c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && this.f322961g == iVar.f322961g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f322961g) + r6.b.c(v7.c(r6.b.c(v7.c(p.a.c(this.f322958a.hashCode() * 31, 31, this.f322959b), 31, this.f322960c), 31, this.d), 31, this.e), 31, this.f);
    }
}

package fca;

import ip0.v7;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f133673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f133674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f133675c;
    public final Instant d;
    public final dj0.d e;
    public final Instant f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f133676g;

    public c(String payerName, String groupId, dj0.d limit, Instant until, dj0.d originalAmount, Instant instant, boolean z) {
        Intrinsics.checkNotNullParameter(payerName, "payerName");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(limit, "limit");
        Intrinsics.checkNotNullParameter(until, "until");
        Intrinsics.checkNotNullParameter(originalAmount, "originalAmount");
        this.f133673a = payerName;
        this.f133674b = groupId;
        this.f133675c = limit;
        this.d = until;
        this.e = originalAmount;
        this.f = instant;
        this.f133676g = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f133673a, cVar.f133673a) && Intrinsics.f(this.f133674b, cVar.f133674b) && Intrinsics.f(this.f133675c, cVar.f133675c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && this.f133676g == cVar.f133676g;
    }

    public final int hashCode() {
        int iC = v7.c(r6.b.c(v7.c(p.a.c(this.f133673a.hashCode() * 31, 31, this.f133674b), 31, this.f133675c), 31, this.d), 31, this.e);
        Instant instant = this.f;
        return Boolean.hashCode(this.f133676g) + ((iC + (instant == null ? 0 : instant.hashCode())) * 31);
    }
}

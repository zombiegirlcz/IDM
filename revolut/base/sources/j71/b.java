package j71;

import dj0.d;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f171829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f171830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f171831c;

    public b(String transactionId, Instant expiryTime, d exchangedAmountWithCharges) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(expiryTime, "expiryTime");
        Intrinsics.checkNotNullParameter(exchangedAmountWithCharges, "exchangedAmountWithCharges");
        this.f171829a = transactionId;
        this.f171830b = expiryTime;
        this.f171831c = exchangedAmountWithCharges;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f171829a, bVar.f171829a) && Intrinsics.f(this.f171830b, bVar.f171830b) && Intrinsics.f(this.f171831c, bVar.f171831c);
    }

    public final int hashCode() {
        return this.f171831c.hashCode() + r6.b.c(this.f171829a.hashCode() * 31, 31, this.f171830b);
    }
}

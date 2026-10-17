package jgk;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f174081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f174082b;

    public n(int i, Instant instant) {
        this.f174081a = i;
        this.f174082b = instant;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f174081a == nVar.f174081a && Intrinsics.f(this.f174082b, nVar.f174082b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f174081a) * 31;
        Instant instant = this.f174082b;
        return iHashCode + (instant == null ? 0 : instant.hashCode());
    }
}

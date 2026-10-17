package ug5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f279931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f279932b;

    public b(long j2, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f279931a = currency;
        this.f279932b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f279931a, bVar.f279931a) && this.f279932b == bVar.f279932b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f279932b) + (this.f279931a.hashCode() * 31);
    }
}

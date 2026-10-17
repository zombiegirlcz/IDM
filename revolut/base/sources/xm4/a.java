package xm4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f307072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f307073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f307074c;

    public a(long j2, dj0.d amount, String label) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f307072a = amount;
        this.f307073b = j2;
        this.f307074c = label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f307072a, aVar.f307072a) && this.f307073b == aVar.f307073b && Intrinsics.f(this.f307074c, aVar.f307074c);
    }

    public final int hashCode() {
        return this.f307074c.hashCode() + a0.d.c(this.f307072a.hashCode() * 31, 31, this.f307073b);
    }
}

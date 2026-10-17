package eo;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f127852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f127853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f127854c;
    public final String d;
    public final boolean e;
    public final int f;

    public b(int i, String reason, String nature, String retryPolicy, boolean z, int i2) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(nature, "nature");
        Intrinsics.checkNotNullParameter(retryPolicy, "retryPolicy");
        this.f127852a = i;
        this.f127853b = reason;
        this.f127854c = nature;
        this.d = retryPolicy;
        this.e = z;
        this.f = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f127852a == bVar.f127852a && Intrinsics.f(this.f127853b, bVar.f127853b) && Intrinsics.f(this.f127854c, bVar.f127854c) && Intrinsics.f(this.d, bVar.d) && this.e == bVar.e && this.f == bVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + j6.a.c(p.a.c(p.a.c(p.a.c(Integer.hashCode(this.f127852a) * 31, 31, this.f127853b), 31, this.f127854c), 31, this.d), 31, this.e);
    }
}

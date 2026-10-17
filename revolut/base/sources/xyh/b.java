package xyh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wd6.h f309725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f309726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f309727c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f309728g;

    public b(wd6.h orderType, boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        this.f309725a = orderType;
        this.f309726b = z;
        this.f309727c = z3;
        this.d = z4;
        this.e = z6;
        this.f = z11;
        this.f309728g = z12;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f309725a == bVar.f309725a && this.f309726b == bVar.f309726b && this.f309727c == bVar.f309727c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.f309728g == bVar.f309728g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f309728g) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(this.f309725a.hashCode() * 31, 31, this.f309726b), 31, this.f309727c), 31, this.d), 31, this.e), 31, this.f);
    }
}

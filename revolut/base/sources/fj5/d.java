package fj5;

import cli.o;
import kotlin.jvm.internal.Intrinsics;
import mx0.qb;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qb f135536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f135537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f135538c;

    public d(qb scanState, int i, int i2) {
        Intrinsics.checkNotNullParameter(scanState, "scanState");
        this.f135536a = scanState;
        this.f135537b = i;
        this.f135538c = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f135536a == dVar.f135536a && this.f135537b == dVar.f135537b && this.f135538c == dVar.f135538c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f135538c) + j6.a.b(this.f135537b, this.f135536a.hashCode() * 31, 31);
    }
}

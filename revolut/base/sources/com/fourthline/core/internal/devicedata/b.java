package com.fourthline.core.internal.devicedata;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Orientation f26342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f26343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f26344c;
    private final c d;
    private final boolean e;

    public b(Orientation orientation, List rotationRate, long j2, c source, boolean z) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(rotationRate, "rotationRate");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f26342a = orientation;
        this.f26343b = rotationRate;
        this.f26344c = j2;
        this.d = source;
        this.e = z;
    }

    public final Orientation a() {
        return this.f26342a;
    }

    public final List b() {
        return this.f26343b;
    }

    public final c c() {
        return this.d;
    }

    public final long d() {
        return this.f26344c;
    }

    public final boolean e() {
        return this.e;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f26342a, bVar.f26342a) && Intrinsics.f(this.f26343b, bVar.f26343b) && this.f26344c == bVar.f26344c && this.d == bVar.d && this.e == bVar.e;
    }

    public int hashCode() {
        return (((((((this.f26342a.hashCode() * 31) + this.f26343b.hashCode()) * 31) + Long.hashCode(this.f26344c)) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.e);
    }

    public String toString() {
        return "OrientationData(orientation=" + this.f26342a + ", rotationRate=" + this.f26343b + ", timestamp=" + this.f26344c + ", source=" + this.d + ", isAbsolute=" + this.e + ")";
    }
}

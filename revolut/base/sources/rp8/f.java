package rp8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f256273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f256274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f256275c;

    public f(String name, String description, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f256273a = name;
        this.f256274b = description;
        this.f256275c = z;
    }

    public static f a(f fVar, String name, String description, boolean z, int i) {
        if ((i & 1) != 0) {
            name = fVar.f256273a;
        }
        if ((i & 2) != 0) {
            description = fVar.f256274b;
        }
        if ((i & 4) != 0) {
            z = fVar.f256275c;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        return new f(name, description, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f256273a, fVar.f256273a) && Intrinsics.f(this.f256274b, fVar.f256274b) && this.f256275c == fVar.f256275c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f256275c) + p.a.c(this.f256273a.hashCode() * 31, 31, this.f256274b);
    }
}

package cq9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f108047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f108049c;

    public f(long j2, String name, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f108047a = j2;
        this.f108048b = name;
        this.f108049c = i;
    }

    public static f a(f fVar, long j2, String name, int i, int i2) {
        if ((i2 & 1) != 0) {
            j2 = fVar.f108047a;
        }
        if ((i2 & 2) != 0) {
            name = fVar.f108048b;
        }
        if ((i2 & 4) != 0) {
            i = fVar.f108049c;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        return new f(j2, name, i);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f108047a == fVar.f108047a && Intrinsics.f(this.f108048b, fVar.f108048b) && this.f108049c == fVar.f108049c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f108049c) + p.a.c(Long.hashCode(this.f108047a) * 31, 31, this.f108048b);
    }
}

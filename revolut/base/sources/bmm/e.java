package bmm;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();
    public static final mmm.m d;
    public static final mmm.m e;
    public static final mmm.m f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final mmm.m f16899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final mmm.m f16900h;
    public static final mmm.m i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mmm.m f16901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mmm.m f16902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16903c;

    static {
        mmm.m.Companion.getClass();
        d = mmm.l.c(":");
        e = mmm.l.c(":status");
        f = mmm.l.c(":method");
        f16899g = mmm.l.c(":path");
        f16900h = mmm.l.c(":scheme");
        i = mmm.l.c(":authority");
    }

    public e(mmm.m name, mmm.m value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f16901a = name;
        this.f16902b = value;
        this.f16903c = value.d() + name.d() + 32;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f16901a, eVar.f16901a) && Intrinsics.f(this.f16902b, eVar.f16902b);
    }

    public final int hashCode() {
        return this.f16902b.hashCode() + (this.f16901a.hashCode() * 31);
    }

    public final String toString() {
        return this.f16901a.v() + ": " + this.f16902b.v();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(String name, String value) {
        this(mmm.l.c(name), mmm.l.c(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        mmm.m.Companion.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(mmm.m name, String value) {
        this(name, mmm.l.c(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        mmm.m.Companion.getClass();
    }
}

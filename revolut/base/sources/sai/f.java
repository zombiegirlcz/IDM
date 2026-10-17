package sai;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f261410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f261411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f261412c;
    public final boolean d;

    public f(int i, String code, boolean z, String str) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f261410a = code;
        this.f261411b = i;
        this.f261412c = str;
        this.d = z;
    }

    public static f a(f fVar, String code, int i, String str, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            code = fVar.f261410a;
        }
        if ((i2 & 2) != 0) {
            i = fVar.f261411b;
        }
        if ((i2 & 4) != 0) {
            str = fVar.f261412c;
        }
        if ((i2 & 8) != 0) {
            z = fVar.d;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        return new f(i, code, z, str);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f261410a, fVar.f261410a) && this.f261411b == fVar.f261411b && Intrinsics.f(this.f261412c, fVar.f261412c) && this.d == fVar.d;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f261411b, this.f261410a.hashCode() * 31, 31);
        String str = this.f261412c;
        return Boolean.hashCode(this.d) + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }
}

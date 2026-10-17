package at1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b02.d f8983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8984c;

    public f(String str, b02.d dVar, long j2) {
        this.f8982a = str;
        this.f8983b = dVar;
        this.f8984c = j2;
    }

    public static f a(f fVar, String str, b02.d dVar, long j2, int i) {
        if ((i & 1) != 0) {
            str = fVar.f8982a;
        }
        if ((i & 2) != 0) {
            dVar = fVar.f8983b;
        }
        if ((i & 4) != 0) {
            j2 = fVar.f8984c;
        }
        fVar.getClass();
        return new f(str, dVar, j2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f8982a, fVar.f8982a) && Intrinsics.f(this.f8983b, fVar.f8983b) && this.f8984c == fVar.f8984c;
    }

    public final int hashCode() {
        String str = this.f8982a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        b02.d dVar = this.f8983b;
        return Long.hashCode(this.f8984c) + ((iHashCode + (dVar != null ? dVar.hashCode() : 0)) * 31);
    }
}

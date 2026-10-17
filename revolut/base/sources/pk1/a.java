package pk1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f236913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f236914c;

    public a(String code, int i, long j2) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f236912a = code;
        this.f236913b = i;
        this.f236914c = j2;
    }

    public static a a(a aVar, int i) {
        String code = aVar.f236912a;
        long j2 = aVar.f236914c;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        return new a(code, i, j2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f236912a, aVar.f236912a) && this.f236913b == aVar.f236913b && this.f236914c == aVar.f236914c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f236914c) + j6.a.b(this.f236913b, this.f236912a.hashCode() * 31, 31);
    }
}

package ny0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f220594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f220595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f220596c;
    public Integer d;

    public j() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f220594a == jVar.f220594a && this.f220595b == jVar.f220595b && Intrinsics.f(this.f220596c, jVar.f220596c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f220595b, Integer.hashCode(this.f220594a) * 31, 31);
        Integer num = this.f220596c;
        int iHashCode = (iB + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public j(int i) {
        this.f220594a = 0;
        this.f220595b = 0;
        this.f220596c = null;
        this.d = null;
    }
}

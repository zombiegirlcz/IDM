package g5d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f140766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f140767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f140768c;
    public final boolean d;
    public final long e;

    public j(int i, String id10, String type, long j2) {
        boolean z = (i & 4) == 0;
        boolean z3 = (i & 8) == 0;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f140766a = id10;
        this.f140767b = type;
        this.f140768c = z;
        this.d = z3;
        this.e = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f140766a, jVar.f140766a) && Intrinsics.f(this.f140767b, jVar.f140767b) && this.f140768c == jVar.f140768c && this.d == jVar.d && this.e == jVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + j6.a.c(j6.a.c(p.a.c(this.f140766a.hashCode() * 31, 31, this.f140767b), 31, this.f140768c), 31, this.d);
    }
}

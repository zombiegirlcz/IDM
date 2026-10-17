package h8d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f150000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f150001c;
    public final boolean d;

    public o(String query, int i, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f149999a = query;
        this.f150000b = z;
        this.f150001c = i;
        this.d = z3;
    }

    public static o a(o oVar, int i, int i2) {
        String query = oVar.f149999a;
        boolean z = oVar.f150000b;
        if ((i2 & 4) != 0) {
            i = oVar.f150001c;
        }
        boolean z3 = oVar.d;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(query, "query");
        return new o(query, i, z, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f149999a, oVar.f149999a) && this.f150000b == oVar.f150000b && this.f150001c == oVar.f150001c && this.d == oVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.b(this.f150001c, j6.a.c(this.f149999a.hashCode() * 31, 31, this.f150000b), 31);
    }
}

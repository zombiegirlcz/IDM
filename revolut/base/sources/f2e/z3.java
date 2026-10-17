package f2e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class z3 {

    @NotNull
    public static final y3 Companion = new y3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f131779c;
    public final String d;
    public final String e;

    public /* synthetic */ z3(int i, String str, String str2, String str3, String str4, String str5) {
        if (9 != (i & 9)) {
            qlm.j1.f(x3.f131764a.getDescriptor(), i, 9);
            throw null;
        }
        this.f131777a = str;
        if ((i & 2) == 0) {
            this.f131778b = null;
        } else {
            this.f131778b = str2;
        }
        if ((i & 4) == 0) {
            this.f131779c = null;
        } else {
            this.f131779c = str3;
        }
        this.d = str4;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z3)) {
            return false;
        }
        z3 z3Var = (z3) obj2;
        return Intrinsics.f(this.f131777a, z3Var.f131777a) && Intrinsics.f(this.f131778b, z3Var.f131778b) && Intrinsics.f(this.f131779c, z3Var.f131779c) && Intrinsics.f(this.d, z3Var.d) && Intrinsics.f(this.e, z3Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f131777a.hashCode() * 31;
        String str = this.f131778b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f131779c;
        int iC = p.a.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        String str3 = this.e;
        return iC + (str3 != null ? str3.hashCode() : 0);
    }

    public z3(String id10, String str, String str2, String points, String str3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(points, "points");
        this.f131777a = id10;
        this.f131778b = str;
        this.f131779c = str2;
        this.d = points;
        this.e = str3;
    }
}

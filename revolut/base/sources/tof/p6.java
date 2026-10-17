package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p6 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f272993c;
    public final Boolean d;
    public final Boolean e;
    public final Boolean f;

    public p6(String id10, String lastFour, String str, Boolean bool, Boolean bool2, Boolean bool3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        this.f272991a = id10;
        this.f272992b = lastFour;
        this.f272993c = str;
        this.d = bool;
        this.e = bool2;
        this.f = bool3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p6)) {
            return false;
        }
        p6 p6Var = (p6) obj2;
        return Intrinsics.f(this.f272991a, p6Var.f272991a) && Intrinsics.f(this.f272992b, p6Var.f272992b) && Intrinsics.f(this.f272993c, p6Var.f272993c) && Intrinsics.f(this.d, p6Var.d) && Intrinsics.f(this.e, p6Var.e) && Intrinsics.f(this.f, p6Var.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f272991a.hashCode() * 31, 31, this.f272992b);
        String str = this.f272993c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f;
        return iHashCode3 + (bool3 != null ? bool3.hashCode() : 0);
    }
}

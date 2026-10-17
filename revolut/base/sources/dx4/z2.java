package dx4;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class z2 implements a3, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1 f120862c;
    public final List d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f120863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t1 f120864h;

    public z2(int i, String str, String str2, String str3, List list) {
        this(str, str2, null, (i & 8) != 0 ? zhm.f0.f322471a : list, null, str3, null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z2)) {
            return false;
        }
        z2 z2Var = (z2) obj2;
        return Intrinsics.f(this.f120860a, z2Var.f120860a) && Intrinsics.f(this.f120861b, z2Var.f120861b) && this.f120862c == z2Var.f120862c && Intrinsics.f(this.d, z2Var.d) && Intrinsics.f(this.e, z2Var.e) && Intrinsics.f(this.f, z2Var.f) && Intrinsics.f(this.f120863g, z2Var.f120863g) && Intrinsics.f(this.f120864h, z2Var.f120864h);
    }

    public final int hashCode() {
        int iHashCode = this.f120860a.hashCode() * 31;
        String str = this.f120861b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        a1 a1Var = this.f120862c;
        int iD = p.a.d((iHashCode2 + (a1Var == null ? 0 : a1Var.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        int iHashCode3 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f120863g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        t1 t1Var = this.f120864h;
        return iHashCode5 + (t1Var != null ? t1Var.hashCode() : 0);
    }

    public z2(String title, String str, a1 a1Var, List items, String str2, String str3, String str4, t1 t1Var) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f120860a = title;
        this.f120861b = str;
        this.f120862c = a1Var;
        this.d = items;
        this.e = str2;
        this.f = str3;
        this.f120863g = str4;
        this.f120864h = t1Var;
    }
}

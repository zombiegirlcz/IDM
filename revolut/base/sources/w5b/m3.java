package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class m3 {

    @NotNull
    public static final l3 Companion = new l3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f294924c;
    public final String d;
    public final Float e;
    public final Boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p3 f294925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f294926h;
    public final String i;

    public /* synthetic */ m3(int i, String str, String str2, String str3, String str4, Float f, Boolean bool, p3 p3Var, Boolean bool2, String str5) {
        if (511 != (i & 511)) {
            qlm.j1.f(k3.f294898a.getDescriptor(), i, 511);
            throw null;
        }
        this.f294922a = str;
        this.f294923b = str2;
        this.f294924c = str3;
        this.d = str4;
        this.e = f;
        this.f = bool;
        this.f294925g = p3Var;
        this.f294926h = bool2;
        this.i = str5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m3)) {
            return false;
        }
        m3 m3Var = (m3) obj2;
        return Intrinsics.f(this.f294922a, m3Var.f294922a) && Intrinsics.f(this.f294923b, m3Var.f294923b) && Intrinsics.f(this.f294924c, m3Var.f294924c) && Intrinsics.f(this.d, m3Var.d) && Intrinsics.f(this.e, m3Var.e) && Intrinsics.f(this.f, m3Var.f) && Intrinsics.f(this.f294925g, m3Var.f294925g) && Intrinsics.f(this.f294926h, m3Var.f294926h) && Intrinsics.f(this.i, m3Var.i);
    }

    public final int hashCode() {
        int iHashCode = this.f294922a.hashCode() * 31;
        String str = this.f294923b;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f294924c);
        String str2 = this.d;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f = this.e;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Boolean bool = this.f;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        p3 p3Var = this.f294925g;
        int iHashCode5 = (iHashCode4 + (p3Var == null ? 0 : p3Var.hashCode())) * 31;
        Boolean bool2 = this.f294926h;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.i;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public m3(String title, String str, String icon, String str2, Float f, Boolean bool, p3 p3Var, Boolean bool2, String str3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f294922a = title;
        this.f294923b = str;
        this.f294924c = icon;
        this.d = str2;
        this.e = f;
        this.f = bool;
        this.f294925g = p3Var;
        this.f294926h = bool2;
        this.i = str3;
    }
}

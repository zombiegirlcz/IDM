package f2e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class h3 {

    @NotNull
    public static final u2 Companion = new u2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f131615c;
    public final String d;
    public final g2 e;
    public final a3 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g3 f131616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d3 f131617h;
    public final x2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f131618j;

    public /* synthetic */ h3(int i, String str, String str2, String str3, String str4, g2 g2Var, a3 a3Var, g3 g3Var, d3 d3Var, x2 x2Var, String str5) {
        if (511 != (i & 511)) {
            qlm.j1.f(t2.f131715a.getDescriptor(), i, 511);
            throw null;
        }
        this.f131613a = str;
        this.f131614b = str2;
        this.f131615c = str3;
        this.d = str4;
        this.e = g2Var;
        this.f = a3Var;
        this.f131616g = g3Var;
        this.f131617h = d3Var;
        this.i = x2Var;
        if ((i & 512) == 0) {
            this.f131618j = null;
        } else {
            this.f131618j = str5;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h3)) {
            return false;
        }
        h3 h3Var = (h3) obj2;
        return Intrinsics.f(this.f131613a, h3Var.f131613a) && Intrinsics.f(this.f131614b, h3Var.f131614b) && Intrinsics.f(this.f131615c, h3Var.f131615c) && Intrinsics.f(this.d, h3Var.d) && Intrinsics.f(this.e, h3Var.e) && Intrinsics.f(this.f, h3Var.f) && Intrinsics.f(this.f131616g, h3Var.f131616g) && Intrinsics.f(this.f131617h, h3Var.f131617h) && Intrinsics.f(this.i, h3Var.i) && Intrinsics.f(this.f131618j, h3Var.f131618j);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f131613a.hashCode() * 31, 31, this.f131614b);
        String str = this.f131615c;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        g2 g2Var = this.e;
        int iHashCode = (iC2 + (g2Var == null ? 0 : g2Var.hashCode())) * 31;
        a3 a3Var = this.f;
        int iHashCode2 = (iHashCode + (a3Var == null ? 0 : a3Var.hashCode())) * 31;
        g3 g3Var = this.f131616g;
        int iHashCode3 = (iHashCode2 + (g3Var == null ? 0 : g3Var.hashCode())) * 31;
        d3 d3Var = this.f131617h;
        int iHashCode4 = (iHashCode3 + (d3Var == null ? 0 : d3Var.hashCode())) * 31;
        x2 x2Var = this.i;
        int iHashCode5 = (iHashCode4 + (x2Var == null ? 0 : x2Var.hashCode())) * 31;
        String str2 = this.f131618j;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public h3(String id10, String brandName, String str, String brandLogoUrl, g2 g2Var, a3 a3Var, g3 g3Var, d3 d3Var, x2 x2Var, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(brandName, "brandName");
        Intrinsics.checkNotNullParameter(brandLogoUrl, "brandLogoUrl");
        this.f131613a = id10;
        this.f131614b = brandName;
        this.f131615c = str;
        this.d = brandLogoUrl;
        this.e = g2Var;
        this.f = a3Var;
        this.f131616g = g3Var;
        this.f131617h = d3Var;
        this.i = x2Var;
        this.f131618j = str2;
    }
}

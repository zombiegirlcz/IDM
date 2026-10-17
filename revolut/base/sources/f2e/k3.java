package f2e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class k3 {

    @NotNull
    public static final j3 Companion = new j3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f131644c;
    public final String d;
    public final g2 e;
    public final h3 f;

    public /* synthetic */ k3(int i, String str, String str2, String str3, String str4, g2 g2Var, h3 h3Var) {
        if (63 != (i & 63)) {
            qlm.j1.f(i3.f131622a.getDescriptor(), i, 63);
            throw null;
        }
        this.f131642a = str;
        this.f131643b = str2;
        this.f131644c = str3;
        this.d = str4;
        this.e = g2Var;
        this.f = h3Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k3)) {
            return false;
        }
        k3 k3Var = (k3) obj2;
        return Intrinsics.f(this.f131642a, k3Var.f131642a) && Intrinsics.f(this.f131643b, k3Var.f131643b) && Intrinsics.f(this.f131644c, k3Var.f131644c) && Intrinsics.f(this.d, k3Var.d) && Intrinsics.f(this.e, k3Var.e) && Intrinsics.f(this.f, k3Var.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f131642a.hashCode() * 31, 31, this.f131643b);
        String str = this.f131644c;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        g2 g2Var = this.e;
        int iHashCode = (iC2 + (g2Var == null ? 0 : g2Var.hashCode())) * 31;
        h3 h3Var = this.f;
        return iHashCode + (h3Var != null ? h3Var.hashCode() : 0);
    }

    public k3(String id10, String title, String str, String logoUrl, g2 g2Var, h3 h3Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        this.f131642a = id10;
        this.f131643b = title;
        this.f131644c = str;
        this.d = logoUrl;
        this.e = g2Var;
        this.f = h3Var;
    }
}

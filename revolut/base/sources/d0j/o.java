package d0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f110423c;
    public final String d;
    public final g0 e;
    public final f0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f110424g;

    public o(String title, String str, p status, String str2, g0 g0Var, f0 f0Var, String str3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f110421a = title;
        this.f110422b = str;
        this.f110423c = status;
        this.d = str2;
        this.e = g0Var;
        this.f = f0Var;
        this.f110424g = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f110421a, oVar.f110421a) && Intrinsics.f(this.f110422b, oVar.f110422b) && this.f110423c == oVar.f110423c && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e) && Intrinsics.f(this.f, oVar.f) && Intrinsics.f(this.f110424g, oVar.f110424g);
    }

    public final int hashCode() {
        int iHashCode = this.f110421a.hashCode() * 31;
        String str = this.f110422b;
        int iHashCode2 = (this.f110423c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        g0 g0Var = this.e;
        int iHashCode4 = (iHashCode3 + (g0Var == null ? 0 : g0Var.f110398a.hashCode())) * 31;
        f0 f0Var = this.f;
        int iHashCode5 = (iHashCode4 + (f0Var == null ? 0 : f0Var.hashCode())) * 31;
        String str3 = this.f110424g;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }
}

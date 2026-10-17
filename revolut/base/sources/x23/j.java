package x23;

import com.revolut.data.model.Data;
import e93.g0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f302475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e93.n f302476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f302477c;
    public final Data d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f302478g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f302479h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f302480j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g0 f302481l;

    public j(Data user, e93.n customisation, boolean z, Data customisationPricing, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, List supportedFonts, String str, g0 g0Var) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(customisation, "customisation");
        Intrinsics.checkNotNullParameter(customisationPricing, "customisationPricing");
        Intrinsics.checkNotNullParameter(supportedFonts, "supportedFonts");
        this.f302475a = user;
        this.f302476b = customisation;
        this.f302477c = z;
        this.d = customisationPricing;
        this.e = z3;
        this.f = z4;
        this.f302478g = z6;
        this.f302479h = z11;
        this.i = z12;
        this.f302480j = supportedFonts;
        this.k = str;
        this.f302481l = g0Var;
    }

    public static j a(j jVar, Data data, e93.n nVar, Data data2, boolean z, boolean z3, boolean z4, boolean z6, String str, g0 g0Var, int i) {
        Data user = (i & 1) != 0 ? jVar.f302475a : data;
        e93.n customisation = (i & 2) != 0 ? jVar.f302476b : nVar;
        boolean z11 = jVar.f302477c;
        Data customisationPricing = (i & 8) != 0 ? jVar.d : data2;
        boolean z12 = (i & 16) != 0 ? jVar.e : z;
        boolean z29 = jVar.f;
        boolean z31 = (i & 64) != 0 ? jVar.f302478g : z3;
        boolean z41 = (i & 128) != 0 ? jVar.f302479h : z4;
        boolean z49 = (i & 256) != 0 ? jVar.i : z6;
        List supportedFonts = jVar.f302480j;
        String str2 = (i & 1024) != 0 ? jVar.k : str;
        g0 g0Var2 = (i & 2048) != 0 ? jVar.f302481l : g0Var;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(customisation, "customisation");
        Intrinsics.checkNotNullParameter(customisationPricing, "customisationPricing");
        Intrinsics.checkNotNullParameter(supportedFonts, "supportedFonts");
        return new j(user, customisation, z11, customisationPricing, z12, z29, z31, z41, z49, supportedFonts, str2, g0Var2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f302475a, jVar.f302475a) && Intrinsics.f(this.f302476b, jVar.f302476b) && this.f302477c == jVar.f302477c && Intrinsics.f(this.d, jVar.d) && this.e == jVar.e && this.f == jVar.f && this.f302478g == jVar.f302478g && this.f302479h == jVar.f302479h && this.i == jVar.i && Intrinsics.f(this.f302480j, jVar.f302480j) && Intrinsics.f(this.k, jVar.k) && Intrinsics.f(this.f302481l, jVar.f302481l);
    }

    public final int hashCode() {
        int iD = p.a.d(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(kii.e.c(this.d, j6.a.c((this.f302476b.hashCode() + (this.f302475a.hashCode() * 31)) * 31, 31, this.f302477c), 31), 31, this.e), 31, this.f), 31, this.f302478g), 31, this.f302479h), 31, this.i), 31, this.f302480j);
        String str = this.k;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        g0 g0Var = this.f302481l;
        return iHashCode + (g0Var != null ? g0Var.hashCode() : 0);
    }
}

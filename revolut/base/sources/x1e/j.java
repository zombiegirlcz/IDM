package x1e;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class j {

    @NotNull
    public static final i Companion = new i();
    public static final Lazy[] o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f302375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f302376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f302377c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f302378g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f302379h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f302380j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s f302381l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f302382m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f302383n;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        o = new Lazy[]{null, null, null, null, null, null, null, null, null, yhm.j.c(kVar, new g(0)), yhm.j.c(kVar, new g(1)), null, yhm.j.c(kVar, new g(2)), null};
    }

    public j(int i, String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, boolean z, List list, List list2, s sVar, List list3, boolean z3) {
        if (679 != (i & 679)) {
            j1.f(h.f302374a.getDescriptor(), i, 679);
            throw null;
        }
        this.f302375a = str;
        this.f302376b = str2;
        this.f302377c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        this.f = str6;
        if ((i & 64) == 0) {
            this.f302378g = null;
        } else {
            this.f302378g = num;
        }
        this.f302379h = str7;
        if ((i & 256) == 0) {
            this.i = false;
        } else {
            this.i = z;
        }
        this.f302380j = list;
        if ((i & 1024) == 0) {
            this.k = f0.f322471a;
        } else {
            this.k = list2;
        }
        if ((i & 2048) == 0) {
            this.f302381l = null;
        } else {
            this.f302381l = sVar;
        }
        this.f302382m = (i & 4096) == 0 ? f0.f322471a : list3;
        if ((i & 8192) == 0) {
            this.f302383n = false;
        } else {
            this.f302383n = z3;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f302375a, jVar.f302375a) && Intrinsics.f(this.f302376b, jVar.f302376b) && Intrinsics.f(this.f302377c, jVar.f302377c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && Intrinsics.f(this.f302378g, jVar.f302378g) && Intrinsics.f(this.f302379h, jVar.f302379h) && this.i == jVar.i && Intrinsics.f(this.f302380j, jVar.f302380j) && Intrinsics.f(this.k, jVar.k) && Intrinsics.f(this.f302381l, jVar.f302381l) && Intrinsics.f(this.f302382m, jVar.f302382m) && this.f302383n == jVar.f302383n;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f302375a.hashCode() * 31, 31, this.f302376b), 31, this.f302377c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iC2 = p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f);
        Integer num = this.f302378g;
        int iD = p.a.d(p.a.d(j6.a.c(p.a.c((iC2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f302379h), 31, this.i), 31, this.f302380j), 31, this.k);
        s sVar = this.f302381l;
        return Boolean.hashCode(this.f302383n) + p.a.d((iD + (sVar != null ? sVar.hashCode() : 0)) * 31, 31, this.f302382m);
    }

    public j(String id10, String name, String description, String str, String str2, String image, Integer num, String state, boolean z, ArrayList options, ArrayList productTerms, s sVar, List deliveryCountries, boolean z3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(productTerms, "productTerms");
        Intrinsics.checkNotNullParameter(deliveryCountries, "deliveryCountries");
        this.f302375a = id10;
        this.f302376b = name;
        this.f302377c = description;
        this.d = str;
        this.e = str2;
        this.f = image;
        this.f302378g = num;
        this.f302379h = state;
        this.i = z;
        this.f302380j = options;
        this.k = productTerms;
        this.f302381l = sVar;
        this.f302382m = deliveryCountries;
        this.f302383n = z3;
    }
}

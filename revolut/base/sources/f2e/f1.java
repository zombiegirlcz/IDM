package f2e;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class f1 {

    @NotNull
    public static final e1 Companion = new e1();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Lazy[] f131578l = {null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new i(13)), null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f131581c;
    public final String d;
    public final String e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z3 f131582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f131583h;
    public final d5 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d2 f131584j;
    public final m0 k;

    public /* synthetic */ f1(int i, String str, String str2, String str3, String str4, String str5, List list, z3 z3Var, g gVar, d5 d5Var, d2 d2Var, m0 m0Var) {
        if (7 != (i & 7)) {
            qlm.j1.f(d1.f131564a.getDescriptor(), i, 7);
            throw null;
        }
        this.f131579a = str;
        this.f131580b = str2;
        this.f131581c = str3;
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
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
        if ((i & 64) == 0) {
            this.f131582g = null;
        } else {
            this.f131582g = z3Var;
        }
        if ((i & 128) == 0) {
            this.f131583h = null;
        } else {
            this.f131583h = gVar;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = d5Var;
        }
        if ((i & 512) == 0) {
            this.f131584j = null;
        } else {
            this.f131584j = d2Var;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = m0Var;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj2;
        return Intrinsics.f(this.f131579a, f1Var.f131579a) && Intrinsics.f(this.f131580b, f1Var.f131580b) && Intrinsics.f(this.f131581c, f1Var.f131581c) && Intrinsics.f(this.d, f1Var.d) && Intrinsics.f(this.e, f1Var.e) && Intrinsics.f(this.f, f1Var.f) && Intrinsics.f(this.f131582g, f1Var.f131582g) && Intrinsics.f(this.f131583h, f1Var.f131583h) && Intrinsics.f(this.i, f1Var.i) && Intrinsics.f(this.f131584j, f1Var.f131584j) && Intrinsics.f(this.k, f1Var.k);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f131579a.hashCode() * 31, 31, this.f131580b), 31, this.f131581c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        z3 z3Var = this.f131582g;
        int iHashCode4 = (iHashCode3 + (z3Var == null ? 0 : z3Var.hashCode())) * 31;
        g gVar = this.f131583h;
        int iHashCode5 = (iHashCode4 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        d5 d5Var = this.i;
        int iHashCode6 = (iHashCode5 + (d5Var == null ? 0 : d5Var.hashCode())) * 31;
        d2 d2Var = this.f131584j;
        int iHashCode7 = (iHashCode6 + (d2Var == null ? 0 : d2Var.hashCode())) * 31;
        m0 m0Var = this.k;
        return iHashCode7 + (m0Var != null ? m0Var.hashCode() : 0);
    }

    public f1(String id10, String type, String backgroundImageUrl, String str, String str2, ArrayList arrayList, z3 z3Var, g gVar, d5 d5Var, d2 d2Var, m0 m0Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(backgroundImageUrl, "backgroundImageUrl");
        this.f131579a = id10;
        this.f131580b = type;
        this.f131581c = backgroundImageUrl;
        this.d = str;
        this.e = str2;
        this.f = arrayList;
        this.f131582g = z3Var;
        this.f131583h = gVar;
        this.i = d5Var;
        this.f131584j = d2Var;
        this.k = m0Var;
    }
}

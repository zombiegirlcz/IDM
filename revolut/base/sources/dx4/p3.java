package dx4;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class p3 extends q3 {

    @NotNull
    public static final o3 Companion = new o3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f120712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120713c;
    public final String d;
    public final String e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f120714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f120715h;
    public final boolean i;

    public p3(String name, c1 c1Var, String title, String str, String str2, boolean z, String htmlLink, String str3, boolean z3) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(htmlLink, "htmlLink");
        this.f120711a = name;
        this.f120712b = c1Var;
        this.f120713c = title;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.f120714g = htmlLink;
        this.f120715h = str3;
        this.i = z3;
    }

    @Override // dx4.q3
    public final String a() {
        return this.d;
    }

    @Override // dx4.q3
    public final String b() {
        return this.f120714g;
    }

    @Override // dx4.q3
    public final String c() {
        return this.f120715h;
    }

    @Override // dx4.q3
    public final boolean d() {
        return this.f;
    }

    @Override // dx4.q3
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p3)) {
            return false;
        }
        p3 p3Var = (p3) obj2;
        return Intrinsics.f(this.f120711a, p3Var.f120711a) && Intrinsics.f(this.f120712b, p3Var.f120712b) && Intrinsics.f(this.f120713c, p3Var.f120713c) && Intrinsics.f(this.d, p3Var.d) && Intrinsics.f(this.e, p3Var.e) && this.f == p3Var.f && Intrinsics.f(this.f120714g, p3Var.f120714g) && Intrinsics.f(this.f120715h, p3Var.f120715h) && this.i == p3Var.i;
    }

    @Override // dx4.q3
    public final String getName() {
        return this.f120711a;
    }

    @Override // dx4.q3
    public final String getTitle() {
        return this.f120713c;
    }

    public final int hashCode() {
        int iHashCode = this.f120711a.hashCode() * 31;
        c1 c1Var = this.f120712b;
        int iC = p.a.c((iHashCode + (c1Var == null ? 0 : c1Var.hashCode())) * 31, 31, this.f120713c);
        String str = this.d;
        int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iC2 = p.a.c(j6.a.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f), 31, this.f120714g);
        String str3 = this.f120715h;
        return Boolean.hashCode(this.i) + ((iC2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}

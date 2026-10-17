package zf0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f321824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f321825c;
    public final String d;
    public final String e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f321826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f321827h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f321828j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f321829l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f321830m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f321831n;

    public b() {
        this(null, null, null, null, null, null, null, null, null, 8191);
    }

    public final List a() {
        return this.f321828j;
    }

    public final List b() {
        return this.f321829l;
    }

    public final String c() {
        return this.f321825c;
    }

    public final String d() {
        return this.f321830m;
    }

    public final long e() {
        return this.f321831n;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f321823a, bVar.f321823a) && Intrinsics.f(this.f321824b, bVar.f321824b) && Intrinsics.f(this.f321825c, bVar.f321825c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && this.f == bVar.f && Intrinsics.f(this.f321826g, bVar.f321826g) && Intrinsics.f(this.f321827h, bVar.f321827h) && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f321828j, bVar.f321828j) && Intrinsics.f(this.k, bVar.k) && Intrinsics.f(this.f321829l, bVar.f321829l) && Intrinsics.f(this.f321830m, bVar.f321830m);
    }

    public final String f() {
        return this.f321823a;
    }

    public final String g() {
        return this.f321827h;
    }

    public final String h() {
        return this.e;
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(p.a.c(p.a.d(j6.a.b(this.f, p.a.c(p.a.c(p.a.c(p.a.c(this.f321823a.hashCode() * 31, 31, this.f321824b), 31, this.f321825c), 31, this.d), 31, this.e), 31), 31, this.f321826g), 31, this.f321827h), 31, this.i), 31, this.f321828j);
        String str = this.k;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f321829l;
        return this.f321830m.hashCode() + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String i() {
        return this.d;
    }

    public final List j() {
        return this.f321826g;
    }

    public final String k() {
        return this.k;
    }

    public final String l() {
        return this.f321824b;
    }

    public final String m() {
        return this.i;
    }

    public final int n() {
        return this.f;
    }

    public final void o(long j2) {
        this.f321831n = j2;
    }

    public final void p(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f321827h = str;
    }

    public b(String key, String title, String content, String planeContent, String placement, int i, List relatedItems, String language, String userCountry, List actions, String str, List list, String contentStyle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(planeContent, "planeContent");
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(relatedItems, "relatedItems");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(userCountry, "userCountry");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(contentStyle, "contentStyle");
        this.f321823a = key;
        this.f321824b = title;
        this.f321825c = content;
        this.d = planeContent;
        this.e = placement;
        this.f = i;
        this.f321826g = relatedItems;
        this.f321827h = language;
        this.i = userCountry;
        this.f321828j = actions;
        this.k = str;
        this.f321829l = list;
        this.f321830m = contentStyle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(String str, String str2, String str3, String str4, String str5, ArrayList arrayList, String str6, List list, String str7, int i) {
        String str8 = (i & 1) != 0 ? "" : str;
        String str9 = (i & 2) != 0 ? "" : str2;
        String str10 = (i & 4) != 0 ? "" : str3;
        String str11 = (i & 8) != 0 ? "" : str4;
        String str12 = (i & 16) != 0 ? "" : str5;
        f0 f0Var = f0.f322471a;
        this(str8, str9, str10, str11, str12, -1, f0Var, "", "", (i & 512) != 0 ? f0Var : arrayList, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : list, (i & 4096) != 0 ? "" : str7);
    }
}

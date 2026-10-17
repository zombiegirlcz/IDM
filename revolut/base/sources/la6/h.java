package la6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f193332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f193333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f193334c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f193335g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jo3.b f193336h;
    public final jo3.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f193337j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f193338l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f193339m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f193340n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f193341p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f193342q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f193343r;

    public h(String id10, String name, String pocketId, String brief, String description, String iconUrl, String bannerUrl, jo3.b totalDonation, jo3.b myDonation, a aVar, boolean z, String code, String availabilityArea, long j2, int i, boolean z3, String availability, boolean z4) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(brief, "brief");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(bannerUrl, "bannerUrl");
        Intrinsics.checkNotNullParameter(totalDonation, "totalDonation");
        Intrinsics.checkNotNullParameter(myDonation, "myDonation");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(availabilityArea, "availabilityArea");
        Intrinsics.checkNotNullParameter(availability, "availability");
        this.f193332a = id10;
        this.f193333b = name;
        this.f193334c = pocketId;
        this.d = brief;
        this.e = description;
        this.f = iconUrl;
        this.f193335g = bannerUrl;
        this.f193336h = totalDonation;
        this.i = myDonation;
        this.f193337j = aVar;
        this.k = z;
        this.f193338l = code;
        this.f193339m = availabilityArea;
        this.f193340n = j2;
        this.o = i;
        this.f193341p = z3;
        this.f193342q = availability;
        this.f193343r = z4;
    }

    public final String a() {
        return this.f193342q;
    }

    public final String b() {
        return this.f193339m;
    }

    public final String c() {
        return this.f193335g;
    }

    public final String d() {
        return this.d;
    }

    public final a e() {
        return this.f193337j;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f193332a, hVar.f193332a) && Intrinsics.f(this.f193333b, hVar.f193333b) && Intrinsics.f(this.f193334c, hVar.f193334c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f193335g, hVar.f193335g) && Intrinsics.f(this.f193336h, hVar.f193336h) && Intrinsics.f(this.i, hVar.i) && Intrinsics.f(this.f193337j, hVar.f193337j) && this.k == hVar.k && Intrinsics.f(this.f193338l, hVar.f193338l) && Intrinsics.f(this.f193339m, hVar.f193339m) && this.f193340n == hVar.f193340n && this.o == hVar.o && this.f193341p == hVar.f193341p && Intrinsics.f(this.f193342q, hVar.f193342q) && this.f193343r == hVar.f193343r;
    }

    public final String f() {
        return this.f193338l;
    }

    public final String g() {
        return this.e;
    }

    public final long h() {
        return this.f193340n;
    }

    public final int hashCode() {
        int iE = y.e(this.i, y.e(this.f193336h, p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f193332a.hashCode() * 31, 31, this.f193333b), 31, this.f193334c), 31, this.d), 31, this.e), 31, this.f), 31, this.f193335g), 31), 31);
        a aVar = this.f193337j;
        return Boolean.hashCode(this.f193343r) + p.a.c(j6.a.c(j6.a.b(this.o, a0.d.c(p.a.c(p.a.c(j6.a.c((iE + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.k), 31, this.f193338l), 31, this.f193339m), 31, this.f193340n), 31), 31, this.f193341p), 31, this.f193342q);
    }

    public final boolean i() {
        return this.f193341p;
    }

    public final String j() {
        return this.f;
    }

    public final String k() {
        return this.f193332a;
    }

    public final jo3.b l() {
        return this.i;
    }

    public final String m() {
        return this.f193333b;
    }

    public final String n() {
        return this.f193334c;
    }

    public final boolean o() {
        return this.f193343r;
    }

    public final int p() {
        return this.o;
    }

    public final boolean q() {
        return this.k;
    }

    public final jo3.b r() {
        return this.f193336h;
    }
}

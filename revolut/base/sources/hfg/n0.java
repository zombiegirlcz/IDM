package hfg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f151871c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m0 f151872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m0 f151873h;

    public n0(String id10, String title, String subtitle, String points, String assetUrl, String icon, m0 departureLocation, m0 arrivalLocation) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(assetUrl, "assetUrl");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(departureLocation, "departureLocation");
        Intrinsics.checkNotNullParameter(arrivalLocation, "arrivalLocation");
        this.f151869a = id10;
        this.f151870b = title;
        this.f151871c = subtitle;
        this.d = points;
        this.e = assetUrl;
        this.f = icon;
        this.f151872g = departureLocation;
        this.f151873h = arrivalLocation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return Intrinsics.f(this.f151869a, n0Var.f151869a) && Intrinsics.f(this.f151870b, n0Var.f151870b) && Intrinsics.f(this.f151871c, n0Var.f151871c) && Intrinsics.f(this.d, n0Var.d) && Intrinsics.f(this.e, n0Var.e) && Intrinsics.f(this.f, n0Var.f) && Intrinsics.f(this.f151872g, n0Var.f151872g) && Intrinsics.f(this.f151873h, n0Var.f151873h);
    }

    public final int hashCode() {
        return this.f151873h.hashCode() + ((this.f151872g.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f151869a.hashCode() * 31, 31, this.f151870b), 31, this.f151871c), 31, this.d), 31, this.e), 31, this.f)) * 31);
    }
}

package m1c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f201441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f201442c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f201443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f201444h;

    public q0(String id10, String title, String subtitle, String points, String assetUrl, String icon, String deeplink, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(assetUrl, "assetUrl");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f201440a = id10;
        this.f201441b = title;
        this.f201442c = subtitle;
        this.d = points;
        this.e = assetUrl;
        this.f = icon;
        this.f201443g = deeplink;
        this.f201444h = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return Intrinsics.f(this.f201440a, q0Var.f201440a) && Intrinsics.f(this.f201441b, q0Var.f201441b) && Intrinsics.f(this.f201442c, q0Var.f201442c) && Intrinsics.f(this.d, q0Var.d) && Intrinsics.f(this.e, q0Var.e) && Intrinsics.f(this.f, q0Var.f) && Intrinsics.f(this.f201443g, q0Var.f201443g) && Intrinsics.f(this.f201444h, q0Var.f201444h);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f201440a.hashCode() * 31, 31, this.f201441b), 31, this.f201442c), 31, this.d), 31, this.e), 31, this.f), 31, this.f201443g);
        String str = this.f201444h;
        return iC + (str == null ? 0 : str.hashCode());
    }
}

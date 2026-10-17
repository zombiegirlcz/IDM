package svi;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Instant f265991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f265992c;
    public final u0 d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f265993g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x0 f265994h;

    public t0(String id10, Instant createdAt, String mainIcon, u0 u0Var, String title, String str, String str2, x0 x0Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(mainIcon, "mainIcon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f265990a = id10;
        this.f265991b = createdAt;
        this.f265992c = mainIcon;
        this.d = u0Var;
        this.e = title;
        this.f = str;
        this.f265993g = str2;
        this.f265994h = x0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return Intrinsics.f(this.f265990a, t0Var.f265990a) && Intrinsics.f(this.f265991b, t0Var.f265991b) && Intrinsics.f(this.f265992c, t0Var.f265992c) && Intrinsics.f(this.d, t0Var.d) && Intrinsics.f(this.e, t0Var.e) && Intrinsics.f(this.f, t0Var.f) && Intrinsics.f(this.f265993g, t0Var.f265993g) && Intrinsics.f(this.f265994h, t0Var.f265994h);
    }

    public final int hashCode() {
        int iC = p.a.c(r6.b.c(this.f265990a.hashCode() * 31, 31, this.f265991b), 31, this.f265992c);
        u0 u0Var = this.d;
        int iC2 = p.a.c((iC + (u0Var == null ? 0 : u0Var.hashCode())) * 31, 31, this.e);
        String str = this.f;
        int iHashCode = (iC2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f265993g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        x0 x0Var = this.f265994h;
        return iHashCode2 + (x0Var != null ? x0Var.hashCode() : 0);
    }
}

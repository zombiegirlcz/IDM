package dx4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class w1 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120811c;
    public final a1 d;
    public final f0 e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f120812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f120813h;
    public final z2 i;

    public w1(String id10, String title, String subtitle, a1 a1Var, f0 f0Var, boolean z, boolean z3, List items, z2 z2Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f120809a = id10;
        this.f120810b = title;
        this.f120811c = subtitle;
        this.d = a1Var;
        this.e = f0Var;
        this.f = z;
        this.f120812g = z3;
        this.f120813h = items;
        this.i = z2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj2;
        return Intrinsics.f(this.f120809a, w1Var.f120809a) && Intrinsics.f(this.f120810b, w1Var.f120810b) && Intrinsics.f(this.f120811c, w1Var.f120811c) && this.d == w1Var.d && this.e == w1Var.e && this.f == w1Var.f && this.f120812g == w1Var.f120812g && Intrinsics.f(this.f120813h, w1Var.f120813h) && Intrinsics.f(this.i, w1Var.i);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f120809a.hashCode() * 31, 31, this.f120810b), 31, this.f120811c);
        a1 a1Var = this.d;
        int iHashCode = (iC + (a1Var == null ? 0 : a1Var.hashCode())) * 31;
        f0 f0Var = this.e;
        int iD = p.a.d(j6.a.c(j6.a.c((iHashCode + (f0Var == null ? 0 : f0Var.hashCode())) * 31, 31, this.f), 31, this.f120812g), 31, this.f120813h);
        z2 z2Var = this.i;
        return iD + (z2Var != null ? z2Var.hashCode() : 0);
    }
}

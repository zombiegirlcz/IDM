package my3;

import dx4.a1;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f210301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f210302c;
    public final String d;
    public final p e;

    public b(String id10, a1 a1Var, String title, String subtitle, p form) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(form, "form");
        this.f210300a = id10;
        this.f210301b = a1Var;
        this.f210302c = title;
        this.d = subtitle;
        this.e = form;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f210300a, bVar.f210300a) && this.f210301b == bVar.f210301b && Intrinsics.f(this.f210302c, bVar.f210302c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f210300a.hashCode() * 31;
        a1 a1Var = this.f210301b;
        return this.e.hashCode() + p.a.c(p.a.c((iHashCode + (a1Var == null ? 0 : a1Var.hashCode())) * 31, 31, this.f210302c), 31, this.d);
    }
}

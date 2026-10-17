package fu3;

import dx4.a1;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f138077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f138078c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a1 f138079g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f138080h;
    public final boolean i;

    public b(String id10, a type, String title, String subtitle, String value, String secondaryValue, a1 a1Var, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(secondaryValue, "secondaryValue");
        this.f138076a = id10;
        this.f138077b = type;
        this.f138078c = title;
        this.d = subtitle;
        this.e = value;
        this.f = secondaryValue;
        this.f138079g = a1Var;
        this.f138080h = z;
        this.i = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f138076a, bVar.f138076a) && this.f138077b == bVar.f138077b && Intrinsics.f(this.f138078c, bVar.f138078c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && this.f138079g == bVar.f138079g && this.f138080h == bVar.f138080h && this.i == bVar.i;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c((this.f138077b.hashCode() + (this.f138076a.hashCode() * 31)) * 31, 31, this.f138078c), 31, this.d), 31, this.e), 31, this.f);
        a1 a1Var = this.f138079g;
        return Boolean.hashCode(this.i) + j6.a.c((iC + (a1Var == null ? 0 : a1Var.hashCode())) * 31, 31, this.f138080h);
    }
}

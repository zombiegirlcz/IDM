package dx4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class t0 implements e1, n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f120772c;
    public final boolean d;
    public final List e;

    public t0(String id10, String title, List links, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(links, "links");
        this.f120770a = id10;
        this.f120771b = title;
        this.f120772c = z;
        this.d = z3;
        this.e = links;
    }

    public static t0 b(t0 t0Var, boolean z) {
        String id10 = t0Var.f120770a;
        String title = t0Var.f120771b;
        boolean z3 = t0Var.f120772c;
        List links = t0Var.e;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(links, "links");
        return new t0(id10, title, links, z3, z);
    }

    @Override // dx4.n1
    public final List a() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return Intrinsics.f(this.f120770a, t0Var.f120770a) && Intrinsics.f(this.f120771b, t0Var.f120771b) && this.f120772c == t0Var.f120772c && this.d == t0Var.d && Intrinsics.f(this.e, t0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(j6.a.c(p.a.c(this.f120770a.hashCode() * 31, 31, this.f120771b), 31, this.f120772c), 31, this.d);
    }
}

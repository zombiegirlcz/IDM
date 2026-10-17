package dx4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a2 implements e1, n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f120545c;
    public final y1 d;
    public final List e;

    public a2(String id10, String text, z1 style, y1 y1Var, List links) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(links, "links");
        this.f120543a = id10;
        this.f120544b = text;
        this.f120545c = style;
        this.d = y1Var;
        this.e = links;
    }

    @Override // dx4.n1
    public final List a() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj2;
        return Intrinsics.f(this.f120543a, a2Var.f120543a) && Intrinsics.f(this.f120544b, a2Var.f120544b) && this.f120545c == a2Var.f120545c && this.d == a2Var.d && Intrinsics.f(this.e, a2Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f120545c.hashCode() + p.a.c(this.f120543a.hashCode() * 31, 31, this.f120544b)) * 31;
        y1 y1Var = this.d;
        return this.e.hashCode() + ((iHashCode + (y1Var == null ? 0 : y1Var.hashCode())) * 31);
    }
}

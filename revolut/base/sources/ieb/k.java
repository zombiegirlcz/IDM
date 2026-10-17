package ieb;

import au0.u0;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f160693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f160694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0 f160695c;
    public final boolean d;
    public final aw0.e e;
    public final boolean f;

    public k(List items, TextClause textClause, u0 header, boolean z, aw0.e footer, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f160693a = items;
        this.f160694b = textClause;
        this.f160695c = header;
        this.d = z;
        this.e = footer;
        this.f = z3;
    }

    @Override // cli.p
    public final List c() {
        return this.f160693a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f160693a, kVar.f160693a) && Intrinsics.f(this.f160694b, kVar.f160694b) && this.f160695c.equals(kVar.f160695c) && this.d == kVar.d && this.e.equals(kVar.e) && this.f == kVar.f;
    }

    public final int hashCode() {
        int iHashCode = this.f160693a.hashCode() * 31;
        Clause clause = this.f160694b;
        return Boolean.hashCode(this.f) + ehe.n.c(this.e, j6.a.c((this.f160695c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31)) * 31, 31, this.d), 31);
    }
}

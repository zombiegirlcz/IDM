package eh9;

import aw0.j8;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f125781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j8 f125782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f125783c;
    public final boolean d;
    public final TextLocalisedClause e;

    public h(List items, j8 j8Var, boolean z, boolean z3, TextLocalisedClause submitButtonClause) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(submitButtonClause, "submitButtonClause");
        this.f125781a = items;
        this.f125782b = j8Var;
        this.f125783c = z;
        this.d = z3;
        this.e = submitButtonClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f125781a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f125781a, hVar.f125781a) && Intrinsics.f(this.f125782b, hVar.f125782b) && this.f125783c == hVar.f125783c && this.d == hVar.d && this.e.equals(hVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f125781a.hashCode() * 31;
        j8 j8Var = this.f125782b;
        return this.e.hashCode() + j6.a.c(j6.a.c((iHashCode + (j8Var == null ? 0 : j8Var.hashCode())) * 31, 31, this.f125783c), 31, this.d);
    }
}

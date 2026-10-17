package au0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NavBarWithContainerBackground f9378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f9379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f9380c;
    public final w0 d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u0(NavBarWithContainerBackground background, Clause title, o0 o0Var) {
        this(background, new z0(title, false), o0Var, null);
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(title, "title");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj2;
        return Intrinsics.f(this.f9378a, u0Var.f9378a) && Intrinsics.f(this.f9379b, u0Var.f9379b) && Intrinsics.f(this.f9380c, u0Var.f9380c) && Intrinsics.f(this.d, u0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f9378a.hashCode() * 31;
        a1 a1Var = this.f9379b;
        int iHashCode2 = (iHashCode + (a1Var == null ? 0 : a1Var.hashCode())) * 31;
        p0 p0Var = this.f9380c;
        int iHashCode3 = (iHashCode2 + (p0Var == null ? 0 : p0Var.hashCode())) * 31;
        w0 w0Var = this.d;
        return iHashCode3 + (w0Var != null ? w0Var.f9412a.hashCode() : 0);
    }

    public u0(NavBarWithContainerBackground background, a1 a1Var, p0 p0Var, w0 w0Var) {
        Intrinsics.checkNotNullParameter(background, "background");
        this.f9378a = background;
        this.f9379b = a1Var;
        this.f9380c = p0Var;
        this.d = w0Var;
    }
}

package dy0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class i0 {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f120993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f120994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f120995c;
    public final boolean d;

    static {
        new i0(new k0(0), null, false, false);
    }

    public i0(l0 slideDistance, h0 h0Var, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(slideDistance, "slideDistance");
        this.f120993a = slideDistance;
        this.f120994b = h0Var;
        this.f120995c = z;
        this.d = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f120993a, i0Var.f120993a) && Intrinsics.f(this.f120994b, i0Var.f120994b) && this.f120995c == i0Var.f120995c && this.d == i0Var.d;
    }

    public final int hashCode() {
        int iHashCode = this.f120993a.hashCode() * 31;
        h0 h0Var = this.f120994b;
        return Boolean.hashCode(this.d) + j6.a.c((iHashCode + (h0Var == null ? 0 : h0Var.hashCode())) * 31, 31, this.f120995c);
    }
}

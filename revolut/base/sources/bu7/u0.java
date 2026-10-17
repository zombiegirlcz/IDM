package bu7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class u0 {

    @NotNull
    public static final q0 Companion = new q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f18741b;

    public /* synthetic */ u0(int i, String str, t0 t0Var) {
        if (1 != (i & 1)) {
            j1.f(p0.f18731a.getDescriptor(), i, 1);
            throw null;
        }
        this.f18740a = str;
        if ((i & 2) == 0) {
            this.f18741b = null;
        } else {
            this.f18741b = t0Var;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj2;
        return Intrinsics.f(this.f18740a, u0Var.f18740a) && Intrinsics.f(this.f18741b, u0Var.f18741b);
    }

    public final int hashCode() {
        int iHashCode = this.f18740a.hashCode() * 31;
        t0 t0Var = this.f18741b;
        return iHashCode + (t0Var == null ? 0 : t0Var.f18737a.hashCode());
    }

    public u0(String text, t0 t0Var) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f18740a = text;
        this.f18741b = t0Var;
    }
}

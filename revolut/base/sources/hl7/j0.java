package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class j0 {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f153155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f153156b;

    public /* synthetic */ j0(int i, boolean z, g0 g0Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(h0.f153123a.getDescriptor(), i, 3);
            throw null;
        }
        this.f153155a = z;
        this.f153156b = g0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return this.f153155a == j0Var.f153155a && Intrinsics.f(this.f153156b, j0Var.f153156b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f153155a) * 31;
        g0 g0Var = this.f153156b;
        return iHashCode + (g0Var == null ? 0 : g0Var.hashCode());
    }
}

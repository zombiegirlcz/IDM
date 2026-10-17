package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class x1 {

    @NotNull
    public static final t1 Companion = new t1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f153362b;

    public /* synthetic */ x1(int i, String str, w1 w1Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(s1.f153294a.getDescriptor(), i, 3);
            throw null;
        }
        this.f153361a = str;
        this.f153362b = w1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj2;
        return Intrinsics.f(this.f153361a, x1Var.f153361a) && Intrinsics.f(this.f153362b, x1Var.f153362b);
    }

    public final int hashCode() {
        int iHashCode = this.f153361a.hashCode() * 31;
        w1 w1Var = this.f153362b;
        return iHashCode + (w1Var == null ? 0 : w1Var.hashCode());
    }
}

package xda;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class o0 {

    @NotNull
    public static final n0 Companion = new n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f304354b;

    public /* synthetic */ o0(int i, String str, u0 u0Var) {
        if (3 != (i & 3)) {
            j1.f(m0.f304349a.getDescriptor(), i, 3);
            throw null;
        }
        this.f304353a = str;
        this.f304354b = u0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.f304353a, o0Var.f304353a) && Intrinsics.f(this.f304354b, o0Var.f304354b);
    }

    public final int hashCode() {
        int iHashCode = this.f304353a.hashCode() * 31;
        u0 u0Var = this.f304354b;
        return iHashCode + (u0Var == null ? 0 : u0Var.hashCode());
    }
}

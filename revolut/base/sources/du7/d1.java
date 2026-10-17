package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class d1 {

    @NotNull
    public static final c1 Companion = new c1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f117628b;

    public /* synthetic */ d1(int i, String str, z0 z0Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(b1.f117607a.getDescriptor(), i, 3);
            throw null;
        }
        this.f117627a = str;
        this.f117628b = z0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj2;
        return Intrinsics.f(this.f117627a, d1Var.f117627a) && Intrinsics.f(this.f117628b, d1Var.f117628b);
    }

    public final int hashCode() {
        int iHashCode = this.f117627a.hashCode() * 31;
        z0 z0Var = this.f117628b;
        return iHashCode + (z0Var == null ? 0 : z0Var.hashCode());
    }
}

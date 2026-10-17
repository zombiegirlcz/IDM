package zda;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class m0 {

    @NotNull
    public static final l0 Companion = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f321400b;

    public /* synthetic */ m0(int i, String str, s0 s0Var) {
        if (3 != (i & 3)) {
            j1.f(k0.f321394a.getDescriptor(), i, 3);
            throw null;
        }
        this.f321399a = str;
        this.f321400b = s0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f321399a, m0Var.f321399a) && Intrinsics.f(this.f321400b, m0Var.f321400b);
    }

    public final int hashCode() {
        int iHashCode = this.f321399a.hashCode() * 31;
        s0 s0Var = this.f321400b;
        return iHashCode + (s0Var == null ? 0 : s0Var.hashCode());
    }

    public m0(String value, s0 s0Var) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f321399a = value;
        this.f321400b = s0Var;
    }
}

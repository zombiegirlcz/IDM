package fkd;

import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class q0 {

    @NotNull
    public static final p0 Companion = new p0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f135787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f135788b;

    public /* synthetic */ q0(int i, int i2, int i3) {
        if (3 != (i & 3)) {
            j1.f(o0.f135783a.getDescriptor(), i, 3);
            throw null;
        }
        this.f135787a = i2;
        this.f135788b = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return this.f135787a == q0Var.f135787a && this.f135788b == q0Var.f135788b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f135788b) + (Integer.hashCode(this.f135787a) * 31);
    }
}

package ekd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class n0 implements q0 {

    @NotNull
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f127015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f127016b;

    public /* synthetic */ n0(int i, h0 h0Var, e0 e0Var) {
        if (3 != (i & 3)) {
            j1.f(a0.f126987a.getDescriptor(), i, 3);
            throw null;
        }
        this.f127015a = h0Var;
        this.f127016b = e0Var;
    }

    @Override // ekd.q0
    public final p0 H() {
        return this.f127015a;
    }

    public final h0 a() {
        return this.f127015a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return Intrinsics.f(this.f127015a, n0Var.f127015a) && Intrinsics.f(this.f127016b, n0Var.f127016b);
    }

    public final int hashCode() {
        return this.f127016b.hashCode() + (this.f127015a.hashCode() * 31);
    }
}

package fkd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class r0 implements w0 {

    @NotNull
    public static final k0 Companion = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f135791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f135792b;

    public /* synthetic */ r0(int i, v0 v0Var, n0 n0Var) {
        if (3 != (i & 3)) {
            j1.f(g0.f135765a.getDescriptor(), i, 3);
            throw null;
        }
        this.f135791a = v0Var;
        this.f135792b = n0Var;
    }

    @Override // fkd.w0
    public final v0 H() {
        return this.f135791a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return Intrinsics.f(this.f135791a, r0Var.f135791a) && Intrinsics.f(this.f135792b, r0Var.f135792b);
    }

    public final int hashCode() {
        return this.f135792b.hashCode() + (this.f135791a.hashCode() * 31);
    }
}

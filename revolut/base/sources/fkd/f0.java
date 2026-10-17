package fkd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class f0 implements w0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f135762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f135763b;

    public /* synthetic */ f0(int i, v0 v0Var, c0 c0Var) {
        if (3 != (i & 3)) {
            j1.f(y.f135804a.getDescriptor(), i, 3);
            throw null;
        }
        this.f135762a = v0Var;
        this.f135763b = c0Var;
    }

    @Override // fkd.w0
    public final v0 H() {
        return this.f135762a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f135762a, f0Var.f135762a) && Intrinsics.f(this.f135763b, f0Var.f135763b);
    }

    public final int hashCode() {
        return this.f135763b.hashCode() + (this.f135762a.hashCode() * 31);
    }
}

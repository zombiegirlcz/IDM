package jl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class n0 {

    @NotNull
    public static final m0 Companion = new m0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f175557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f175558b;

    public /* synthetic */ n0(int i, boolean z, boolean z3) {
        if (3 != (i & 3)) {
            qlm.j1.f(l0.f175553a.getDescriptor(), i, 3);
            throw null;
        }
        this.f175557a = z;
        this.f175558b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return this.f175557a == n0Var.f175557a && this.f175558b == n0Var.f175558b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f175558b) + (Boolean.hashCode(this.f175557a) * 31);
    }

    public final String toString() {
        return "FaceVideoTaskConfig(showIntro=" + this.f175557a + ", showVideoConfirmation=" + this.f175558b + ")";
    }
}

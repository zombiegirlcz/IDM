package jl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class t0 {

    @NotNull
    public static final s0 Companion = new s0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f175570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f175571b;

    public /* synthetic */ t0(int i, boolean z, boolean z3) {
        if (2 != (i & 2)) {
            qlm.j1.f(r0.f175568a.getDescriptor(), i, 2);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f175570a = true;
        } else {
            this.f175570a = z;
        }
        this.f175571b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return this.f175570a == t0Var.f175570a && this.f175571b == t0Var.f175571b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f175571b) + (Boolean.hashCode(this.f175570a) * 31);
    }

    public final String toString() {
        return "MotionTaskConfig(showIntro=" + this.f175570a + ", audioEnabled=" + this.f175571b + ")";
    }
}

package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class m5 {

    @NotNull
    public static final l5 Companion = new l5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f4 f153213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b6 f153214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p5 f153215c;

    public /* synthetic */ m5(int i, f4 f4Var, b6 b6Var, p5 p5Var) {
        if (7 != (i & 7)) {
            qlm.j1.f(k5.f153170a.getDescriptor(), i, 7);
            throw null;
        }
        this.f153213a = f4Var;
        this.f153214b = b6Var;
        this.f153215c = p5Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m5)) {
            return false;
        }
        m5 m5Var = (m5) obj2;
        return Intrinsics.f(this.f153213a, m5Var.f153213a) && Intrinsics.f(this.f153214b, m5Var.f153214b) && Intrinsics.f(this.f153215c, m5Var.f153215c);
    }

    public final int hashCode() {
        f4 f4Var = this.f153213a;
        int iHashCode = (f4Var == null ? 0 : f4Var.hashCode()) * 31;
        b6 b6Var = this.f153214b;
        int iHashCode2 = (iHashCode + (b6Var == null ? 0 : b6Var.hashCode())) * 31;
        p5 p5Var = this.f153215c;
        return iHashCode2 + (p5Var != null ? p5Var.hashCode() : 0);
    }
}

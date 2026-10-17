package jl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class z0 {

    @NotNull
    public static final y0 Companion = new y0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f175581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f175582b;

    public /* synthetic */ z0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(x0.f175579a.getDescriptor(), i, 3);
            throw null;
        }
        this.f175581a = str;
        this.f175582b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj2;
        return Intrinsics.f(this.f175581a, z0Var.f175581a) && Intrinsics.f(this.f175582b, z0Var.f175582b);
    }

    public final int hashCode() {
        return this.f175582b.hashCode() + (this.f175581a.hashCode() * 31);
    }

    public final String toString() {
        return j6.a.s("MotionTaskInputItem(type=", this.f175581a, ", value=", this.f175582b, ")");
    }
}

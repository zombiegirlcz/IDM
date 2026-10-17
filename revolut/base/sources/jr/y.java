package jr;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class y {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f177869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f177870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f177871c;
    public final n0 d;

    public /* synthetic */ y(int i, int i2, long j2, v vVar, n0 n0Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(w.f177858a.getDescriptor(), i, 3);
            throw null;
        }
        this.f177869a = i2;
        this.f177870b = j2;
        if ((i & 4) == 0) {
            this.f177871c = null;
        } else {
            this.f177871c = vVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = n0Var;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return this.f177869a == yVar.f177869a && this.f177870b == yVar.f177870b && Intrinsics.f(this.f177871c, yVar.f177871c) && Intrinsics.f(this.d, yVar.d);
    }

    public final int hashCode() {
        int iC = a0.d.c(Integer.hashCode(this.f177869a) * 31, 31, this.f177870b);
        v vVar = this.f177871c;
        int iHashCode = (iC + (vVar == null ? 0 : vVar.hashCode())) * 31;
        n0 n0Var = this.d;
        return iHashCode + (n0Var != null ? n0Var.hashCode() : 0);
    }
}

package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class g0 {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f153112c;
    public final boolean d;
    public final boolean e;

    public /* synthetic */ g0(int i, dj0.d dVar, String str, String str2, boolean z, boolean z3) {
        if (31 != (i & 31)) {
            qlm.j1.f(e0.f153072a.getDescriptor(), i, 31);
            throw null;
        }
        this.f153110a = str;
        this.f153111b = str2;
        this.f153112c = dVar;
        this.d = z;
        this.e = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f153110a, g0Var.f153110a) && Intrinsics.f(this.f153111b, g0Var.f153111b) && Intrinsics.f(this.f153112c, g0Var.f153112c) && this.d == g0Var.d && this.e == g0Var.e;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f153110a.hashCode() * 31, 31, this.f153111b);
        dj0.d dVar = this.f153112c;
        return Boolean.hashCode(this.e) + j6.a.c((iC + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.d);
    }
}

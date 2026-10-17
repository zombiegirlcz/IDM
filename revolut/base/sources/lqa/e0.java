package lqa;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class e0 {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f199234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f199235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f199236c;
    public final String d;
    public final String e;

    public /* synthetic */ e0(int i, String str, String str2, String str3, boolean z, boolean z3) {
        if (31 != (i & 31)) {
            j1.f(c0.f199226a.getDescriptor(), i, 31);
            throw null;
        }
        this.f199234a = z;
        this.f199235b = z3;
        this.f199236c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return this.f199234a == e0Var.f199234a && this.f199235b == e0Var.f199235b && Intrinsics.f(this.f199236c, e0Var.f199236c) && Intrinsics.f(this.d, e0Var.d) && Intrinsics.f(this.e, e0Var.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(j6.a.c(Boolean.hashCode(this.f199234a) * 31, 31, this.f199235b), 31, this.f199236c), 31, this.d);
        String str = this.e;
        return iC + (str == null ? 0 : str.hashCode());
    }
}

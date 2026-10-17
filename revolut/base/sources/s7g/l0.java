package s7g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class l0 {

    @NotNull
    public static final k0 Companion = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f260758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f260759c;
    public final String d;
    public final String e;
    public final int f;

    public /* synthetic */ l0(int i, String str, String str2, String str3, String str4, String str5, int i2) {
        if (63 != (i & 63)) {
            qlm.j1.f(j0.f260745a.getDescriptor(), i, 63);
            throw null;
        }
        this.f260757a = str;
        this.f260758b = str2;
        this.f260759c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f260757a, l0Var.f260757a) && Intrinsics.f(this.f260758b, l0Var.f260758b) && Intrinsics.f(this.f260759c, l0Var.f260759c) && Intrinsics.f(this.d, l0Var.d) && Intrinsics.f(this.e, l0Var.e) && this.f == l0Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + p.a.c(p.a.c(p.a.c(p.a.c(this.f260757a.hashCode() * 31, 31, this.f260758b), 31, this.f260759c), 31, this.d), 31, this.e);
    }
}

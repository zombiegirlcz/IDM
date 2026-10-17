package dp5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class v0 {

    @NotNull
    public static final u0 Companion = new u0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f116818c;
    public final long d;

    public /* synthetic */ v0(int i, String str, String str2, double d, long j2) {
        if (15 != (i & 15)) {
            qlm.j1.f(t0.f116812a.getDescriptor(), i, 15);
            throw null;
        }
        this.f116816a = str;
        this.f116817b = str2;
        this.f116818c = d;
        this.d = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Intrinsics.f(this.f116816a, v0Var.f116816a) && Intrinsics.f(this.f116817b, v0Var.f116817b) && Double.compare(this.f116818c, v0Var.f116818c) == 0 && this.d == v0Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + m72.b.c(p.a.c(this.f116816a.hashCode() * 31, 31, this.f116817b), this.f116818c, 31);
    }
}

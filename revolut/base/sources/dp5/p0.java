package dp5;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class p0 {

    @NotNull
    public static final o0 Companion = new o0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f116792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f116793b;

    public /* synthetic */ p0(int i, jo3.a aVar, s0 s0Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(n0.f116785a.getDescriptor(), i, 3);
            throw null;
        }
        this.f116792a = aVar;
        this.f116793b = s0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return Intrinsics.f(this.f116792a, p0Var.f116792a) && Intrinsics.f(this.f116793b, p0Var.f116793b);
    }

    public final int hashCode() {
        return this.f116793b.hashCode() + (this.f116792a.hashCode() * 31);
    }
}

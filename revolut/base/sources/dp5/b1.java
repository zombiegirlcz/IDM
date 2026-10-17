package dp5;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class b1 {

    @NotNull
    public static final a1 Companion = new a1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f116729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0 f116730c;
    public final jo3.a d;
    public final jo3.a e;
    public final p0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s0 f116731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f116732h;

    public /* synthetic */ b1(int i, String str, long j2, v0 v0Var, jo3.a aVar, jo3.a aVar2, p0 p0Var, s0 s0Var, boolean z) {
        if (255 != (i & 255)) {
            qlm.j1.f(z0.f116829a.getDescriptor(), i, 255);
            throw null;
        }
        this.f116728a = str;
        this.f116729b = j2;
        this.f116730c = v0Var;
        this.d = aVar;
        this.e = aVar2;
        this.f = p0Var;
        this.f116731g = s0Var;
        this.f116732h = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj2;
        return Intrinsics.f(this.f116728a, b1Var.f116728a) && this.f116729b == b1Var.f116729b && Intrinsics.f(this.f116730c, b1Var.f116730c) && Intrinsics.f(this.d, b1Var.d) && Intrinsics.f(this.e, b1Var.e) && Intrinsics.f(this.f, b1Var.f) && Intrinsics.f(this.f116731g, b1Var.f116731g) && this.f116732h == b1Var.f116732h;
    }

    public final int hashCode() {
        int iC = a0.d.c(this.f116728a.hashCode() * 31, 31, this.f116729b);
        v0 v0Var = this.f116730c;
        int iHashCode = (this.f.hashCode() + v7.j(this.e, v7.j(this.d, (iC + (v0Var == null ? 0 : v0Var.hashCode())) * 31, 31), 31)) * 31;
        s0 s0Var = this.f116731g;
        return Boolean.hashCode(this.f116732h) + ((iHashCode + (s0Var != null ? s0Var.hashCode() : 0)) * 31);
    }
}

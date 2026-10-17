package kr;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class z {

    @NotNull
    public static final y Companion = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f188611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f188612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f188613c;
    public final r d;
    public final m1 e;

    public /* synthetic */ z(int i, long j2, int i2, int i3, r rVar, m1 m1Var) {
        if (31 != (i & 31)) {
            qlm.j1.f(x.f188604a.getDescriptor(), i, 31);
            throw null;
        }
        this.f188611a = j2;
        this.f188612b = i2;
        this.f188613c = i3;
        this.d = rVar;
        this.e = m1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return this.f188611a == zVar.f188611a && this.f188612b == zVar.f188612b && this.f188613c == zVar.f188613c && Intrinsics.f(this.d, zVar.d) && Intrinsics.f(this.e, zVar.e);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f188613c, j6.a.b(this.f188612b, Long.hashCode(this.f188611a) * 31, 31), 31);
        r rVar = this.d;
        int iHashCode = (iB + (rVar == null ? 0 : rVar.hashCode())) * 31;
        m1 m1Var = this.e;
        return iHashCode + (m1Var != null ? m1Var.hashCode() : 0);
    }

    public z(long j2, int i, int i2, r rVar, m1 m1Var) {
        this.f188611a = j2;
        this.f188612b = i;
        this.f188613c = i2;
        this.d = rVar;
        this.e = m1Var;
    }
}

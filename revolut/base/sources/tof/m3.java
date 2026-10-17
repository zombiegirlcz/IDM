package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m3 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f272929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z3l.a f272930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s0 f272931c;

    /* JADX WARN: Multi-variable type inference failed */
    public m3() {
        this((z3l.a) null, (s0) (0 == true ? 1 : 0), 7);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m3)) {
            return false;
        }
        m3 m3Var = (m3) obj2;
        return Intrinsics.f(this.f272929a, m3Var.f272929a) && Intrinsics.f(this.f272930b, m3Var.f272930b) && Intrinsics.f(this.f272931c, m3Var.f272931c);
    }

    public final int hashCode() {
        v0 v0Var = this.f272929a;
        int iHashCode = (v0Var == null ? 0 : v0Var.hashCode()) * 31;
        z3l.a aVar = this.f272930b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        s0 s0Var = this.f272931c;
        return iHashCode2 + (s0Var != null ? s0Var.hashCode() : 0);
    }

    public m3(v0 v0Var, z3l.a aVar, s0 s0Var) {
        this.f272929a = v0Var;
        this.f272930b = aVar;
        this.f272931c = s0Var;
    }

    public /* synthetic */ m3(z3l.a aVar, s0 s0Var, int i) {
        this((v0) null, (i & 2) != 0 ? null : aVar, (i & 4) != 0 ? null : s0Var);
    }
}

package gqc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f145624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f145625c;
    public final o d;

    public /* synthetic */ d0(int i, String str, m0 m0Var, c cVar, o oVar) {
        if (3 != (i & 3)) {
            j1.f(b0.f145619a.getDescriptor(), i, 3);
            throw null;
        }
        this.f145623a = str;
        this.f145624b = m0Var;
        if ((i & 4) == 0) {
            this.f145625c = null;
        } else {
            this.f145625c = cVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = oVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f145623a, d0Var.f145623a) && Intrinsics.f(this.f145624b, d0Var.f145624b) && Intrinsics.f(this.f145625c, d0Var.f145625c) && Intrinsics.f(this.d, d0Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f145624b.hashCode() + (this.f145623a.hashCode() * 31)) * 31;
        c cVar = this.f145625c;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        o oVar = this.d;
        return iHashCode2 + (oVar != null ? oVar.hashCode() : 0);
    }

    public d0(String scheme, m0 sourceAgent, o oVar) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(sourceAgent, "sourceAgent");
        this.f145623a = scheme;
        this.f145624b = sourceAgent;
        this.f145625c = null;
        this.d = oVar;
    }
}

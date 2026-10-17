package as7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class s {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f8866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f8867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f8868c;
    public final k0 d;

    public /* synthetic */ s(int i, v vVar, q0 q0Var, f fVar, k0 k0Var) {
        if (15 != (i & 15)) {
            j1.f(q.f8863a.getDescriptor(), i, 15);
            throw null;
        }
        this.f8866a = vVar;
        this.f8867b = q0Var;
        this.f8868c = fVar;
        this.d = k0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f8866a, sVar.f8866a) && Intrinsics.f(this.f8867b, sVar.f8867b) && Intrinsics.f(this.f8868c, sVar.f8868c) && Intrinsics.f(this.d, sVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f8866a.hashCode() * 31;
        q0 q0Var = this.f8867b;
        int iHashCode2 = (iHashCode + (q0Var == null ? 0 : q0Var.hashCode())) * 31;
        f fVar = this.f8868c;
        int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.f8834a.hashCode())) * 31;
        k0 k0Var = this.d;
        return iHashCode3 + (k0Var != null ? k0Var.hashCode() : 0);
    }

    public s(v screenContent, q0 q0Var, f fVar, k0 k0Var) {
        Intrinsics.checkNotNullParameter(screenContent, "screenContent");
        this.f8866a = screenContent;
        this.f8867b = q0Var;
        this.f8868c = fVar;
        this.d = k0Var;
    }
}

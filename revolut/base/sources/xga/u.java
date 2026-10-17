package xga;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f305662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f305663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f305664c;
    public final boolean d;
    public final s e;

    public /* synthetic */ u(int i, b0 b0Var, o oVar, s sVar, boolean z, s sVar2) {
        if (5 != (i & 5)) {
            j1.f(p.f305657a.getDescriptor(), i, 5);
            throw null;
        }
        this.f305662a = b0Var;
        if ((i & 2) == 0) {
            this.f305663b = null;
        } else {
            this.f305663b = oVar;
        }
        this.f305664c = sVar;
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = sVar2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f305662a, uVar.f305662a) && Intrinsics.f(this.f305663b, uVar.f305663b) && Intrinsics.f(this.f305664c, uVar.f305664c) && this.d == uVar.d && Intrinsics.f(this.e, uVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f305662a.hashCode() * 31;
        o oVar = this.f305663b;
        int iC = j6.a.c((this.f305664c.hashCode() + ((iHashCode + (oVar == null ? 0 : oVar.hashCode())) * 31)) * 31, 31, this.d);
        s sVar = this.e;
        return iC + (sVar != null ? sVar.hashCode() : 0);
    }
}

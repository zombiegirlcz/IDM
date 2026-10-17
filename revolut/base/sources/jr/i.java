package jr;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f177792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f177793c;
    public final n0 d;

    public /* synthetic */ i(int i, String str, String str2, v vVar, n0 n0Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(g.f177787a.getDescriptor(), i, 3);
            throw null;
        }
        this.f177791a = str;
        this.f177792b = str2;
        if ((i & 4) == 0) {
            this.f177793c = null;
        } else {
            this.f177793c = vVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = n0Var;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f177791a, iVar.f177791a) && Intrinsics.f(this.f177792b, iVar.f177792b) && Intrinsics.f(this.f177793c, iVar.f177793c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f177791a.hashCode() * 31, 31, this.f177792b);
        v vVar = this.f177793c;
        int iHashCode = (iC + (vVar == null ? 0 : vVar.hashCode())) * 31;
        n0 n0Var = this.d;
        return iHashCode + (n0Var != null ? n0Var.hashCode() : 0);
    }
}

package wtg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f299957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f299958c;

    public /* synthetic */ i(int i, String str, i0 i0Var, String str2) {
        if (7 != (i & 7)) {
            j1.f(g.f299954a.getDescriptor(), i, 7);
            throw null;
        }
        this.f299956a = str;
        this.f299957b = i0Var;
        this.f299958c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f299956a, iVar.f299956a) && Intrinsics.f(this.f299957b, iVar.f299957b) && Intrinsics.f(this.f299958c, iVar.f299958c);
    }

    public final int hashCode() {
        int iHashCode = this.f299956a.hashCode() * 31;
        i0 i0Var = this.f299957b;
        int iHashCode2 = (iHashCode + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        String str = this.f299958c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public i(String reason, i0 i0Var, String str) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f299956a = reason;
        this.f299957b = i0Var;
        this.f299958c = str;
    }
}

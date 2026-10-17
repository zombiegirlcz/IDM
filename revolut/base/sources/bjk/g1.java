package bjk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class g1 {

    @NotNull
    public static final f1 Companion = new f1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d1 f15872c;

    public /* synthetic */ g1(int i, String str, String str2, d1 d1Var) {
        if (7 != (i & 7)) {
            qlm.j1.f(e1.f15842a.getDescriptor(), i, 7);
            throw null;
        }
        this.f15870a = str;
        this.f15871b = str2;
        this.f15872c = d1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj2;
        return Intrinsics.f(this.f15870a, g1Var.f15870a) && Intrinsics.f(this.f15871b, g1Var.f15871b) && Intrinsics.f(this.f15872c, g1Var.f15872c);
    }

    public final int hashCode() {
        int iHashCode = this.f15870a.hashCode() * 31;
        String str = this.f15871b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        d1 d1Var = this.f15872c;
        return iHashCode2 + (d1Var != null ? d1Var.hashCode() : 0);
    }
}

package bjk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class h3 {

    @NotNull
    public static final g3 Companion = new g3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v2 f15976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15977c;

    public /* synthetic */ h3(int i, v2 v2Var, String str, String str2) {
        if (1 != (i & 1)) {
            qlm.j1.f(f3.f15866a.getDescriptor(), i, 1);
            throw null;
        }
        this.f15975a = str;
        if ((i & 2) == 0) {
            this.f15976b = null;
        } else {
            this.f15976b = v2Var;
        }
        if ((i & 4) == 0) {
            this.f15977c = null;
        } else {
            this.f15977c = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h3)) {
            return false;
        }
        h3 h3Var = (h3) obj2;
        return Intrinsics.f(this.f15975a, h3Var.f15975a) && Intrinsics.f(this.f15976b, h3Var.f15976b) && Intrinsics.f(this.f15977c, h3Var.f15977c);
    }

    public final int hashCode() {
        int iHashCode = this.f15975a.hashCode() * 31;
        v2 v2Var = this.f15976b;
        int iHashCode2 = (iHashCode + (v2Var == null ? 0 : v2Var.hashCode())) * 31;
        String str = this.f15977c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}

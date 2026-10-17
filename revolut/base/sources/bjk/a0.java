package bjk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15695c;
    public final d0 d;

    public /* synthetic */ a0(int i, String str, String str2, String str3, d0 d0Var) {
        if (7 != (i & 7)) {
            qlm.j1.f(y.f16124a.getDescriptor(), i, 7);
            throw null;
        }
        this.f15693a = str;
        this.f15694b = str2;
        this.f15695c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = d0Var;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f15693a, a0Var.f15693a) && Intrinsics.f(this.f15694b, a0Var.f15694b) && Intrinsics.f(this.f15695c, a0Var.f15695c) && Intrinsics.f(this.d, a0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f15693a.hashCode() * 31;
        String str = this.f15694b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f15695c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        d0 d0Var = this.d;
        return iHashCode3 + (d0Var != null ? d0Var.hashCode() : 0);
    }
}

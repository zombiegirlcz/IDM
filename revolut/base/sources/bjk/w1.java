package bjk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class w1 {

    @NotNull
    public static final v1 Companion = new v1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v2 f16104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16105c;

    public /* synthetic */ w1(int i, v2 v2Var, String str, String str2) {
        if (1 != (i & 1)) {
            qlm.j1.f(u1.f16081a.getDescriptor(), i, 1);
            throw null;
        }
        this.f16103a = str;
        if ((i & 2) == 0) {
            this.f16104b = null;
        } else {
            this.f16104b = v2Var;
        }
        if ((i & 4) == 0) {
            this.f16105c = null;
        } else {
            this.f16105c = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj2;
        return Intrinsics.f(this.f16103a, w1Var.f16103a) && Intrinsics.f(this.f16104b, w1Var.f16104b) && Intrinsics.f(this.f16105c, w1Var.f16105c);
    }

    public final int hashCode() {
        int iHashCode = this.f16103a.hashCode() * 31;
        v2 v2Var = this.f16104b;
        int iHashCode2 = (iHashCode + (v2Var == null ? 0 : v2Var.hashCode())) * 31;
        String str = this.f16105c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}

package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class t4 {

    @NotNull
    public static final s4 Companion = new s4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f295022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f295023c;
    public final a0 d;

    public /* synthetic */ t4(int i, String str, String str2, a0 a0Var, a0 a0Var2) {
        if (15 != (i & 15)) {
            qlm.j1.f(r4.f294998a.getDescriptor(), i, 15);
            throw null;
        }
        this.f295021a = str;
        this.f295022b = str2;
        this.f295023c = a0Var;
        this.d = a0Var2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t4)) {
            return false;
        }
        t4 t4Var = (t4) obj2;
        return Intrinsics.f(this.f295021a, t4Var.f295021a) && Intrinsics.f(this.f295022b, t4Var.f295022b) && Intrinsics.f(this.f295023c, t4Var.f295023c) && Intrinsics.f(this.d, t4Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f295023c.hashCode() + p.a.c(this.f295021a.hashCode() * 31, 31, this.f295022b)) * 31;
        a0 a0Var = this.d;
        return iHashCode + (a0Var == null ? 0 : a0Var.hashCode());
    }

    public t4(String productId, String tier, a0 cardConfiguration, a0 a0Var) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(tier, "tier");
        Intrinsics.checkNotNullParameter(cardConfiguration, "cardConfiguration");
        this.f295021a = productId;
        this.f295022b = tier;
        this.f295023c = cardConfiguration;
        this.d = a0Var;
    }
}

package f2e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class a3 {

    @NotNull
    public static final z2 Companion = new z2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a5 f131536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a5 f131537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a5 f131538c;

    public /* synthetic */ a3(int i, a5 a5Var, a5 a5Var2, a5 a5Var3) {
        if (7 != (i & 7)) {
            qlm.j1.f(y2.f131774a.getDescriptor(), i, 7);
            throw null;
        }
        this.f131536a = a5Var;
        this.f131537b = a5Var2;
        this.f131538c = a5Var3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj2;
        return Intrinsics.f(this.f131536a, a3Var.f131536a) && Intrinsics.f(this.f131537b, a3Var.f131537b) && Intrinsics.f(this.f131538c, a3Var.f131538c);
    }

    public final int hashCode() {
        a5 a5Var = this.f131536a;
        int iHashCode = (a5Var == null ? 0 : a5Var.hashCode()) * 31;
        a5 a5Var2 = this.f131537b;
        int iHashCode2 = (iHashCode + (a5Var2 == null ? 0 : a5Var2.hashCode())) * 31;
        a5 a5Var3 = this.f131538c;
        return iHashCode2 + (a5Var3 != null ? a5Var3.hashCode() : 0);
    }

    public a3(a5 a5Var, a5 a5Var2, a5 a5Var3) {
        this.f131536a = a5Var;
        this.f131537b = a5Var2;
        this.f131538c = a5Var3;
    }
}

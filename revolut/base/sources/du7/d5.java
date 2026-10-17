package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class d5 {

    @NotNull
    public static final c5 Companion = new c5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g5 f117644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g5 f117645c;

    public /* synthetic */ d5(int i, String str, g5 g5Var, g5 g5Var2) {
        if (7 != (i & 7)) {
            qlm.j1.f(b5.f117612a.getDescriptor(), i, 7);
            throw null;
        }
        this.f117643a = str;
        this.f117644b = g5Var;
        this.f117645c = g5Var2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d5)) {
            return false;
        }
        d5 d5Var = (d5) obj2;
        return Intrinsics.f(this.f117643a, d5Var.f117643a) && Intrinsics.f(this.f117644b, d5Var.f117644b) && Intrinsics.f(this.f117645c, d5Var.f117645c);
    }

    public final int hashCode() {
        String str = this.f117643a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        g5 g5Var = this.f117644b;
        int iHashCode2 = (iHashCode + (g5Var == null ? 0 : g5Var.hashCode())) * 31;
        g5 g5Var2 = this.f117645c;
        return iHashCode2 + (g5Var2 != null ? g5Var2.hashCode() : 0);
    }
}

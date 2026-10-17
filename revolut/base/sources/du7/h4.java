package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class h4 {

    @NotNull
    public static final e4 Companion = new e4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f4 f117697b;

    public /* synthetic */ h4(int i, String str, f4 f4Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(d4.f117642a.getDescriptor(), i, 3);
            throw null;
        }
        this.f117696a = str;
        this.f117697b = f4Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h4)) {
            return false;
        }
        h4 h4Var = (h4) obj2;
        return Intrinsics.f(this.f117696a, h4Var.f117696a) && Intrinsics.f(this.f117697b, h4Var.f117697b);
    }

    public final int hashCode() {
        int iHashCode = this.f117696a.hashCode() * 31;
        f4 f4Var = this.f117697b;
        return iHashCode + (f4Var == null ? 0 : f4Var.hashCode());
    }
}

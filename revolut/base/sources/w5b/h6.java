package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class h6 {

    @NotNull
    public static final g6 Companion = new g6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x5 f294869b;

    public /* synthetic */ h6(int i, String str, x5 x5Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(f6.f294836a.getDescriptor(), i, 3);
            throw null;
        }
        this.f294868a = str;
        this.f294869b = x5Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h6)) {
            return false;
        }
        h6 h6Var = (h6) obj2;
        return Intrinsics.f(this.f294868a, h6Var.f294868a) && Intrinsics.f(this.f294869b, h6Var.f294869b);
    }

    public final int hashCode() {
        int iHashCode = this.f294868a.hashCode() * 31;
        x5 x5Var = this.f294869b;
        return iHashCode + (x5Var == null ? 0 : x5Var.hashCode());
    }

    public h6(String title, x5 x5Var) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f294868a = title;
        this.f294869b = x5Var;
    }
}

package hyd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class y0 {

    @NotNull
    public static final x0 Companion = new x0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f156842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f156843b;

    public /* synthetic */ y0(int i, String str, String str2) {
        if (1 != (i & 1)) {
            j1.f(w0.f156838a.getDescriptor(), i, 1);
            throw null;
        }
        this.f156842a = str;
        if ((i & 2) == 0) {
            this.f156843b = null;
        } else {
            this.f156843b = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj2;
        return Intrinsics.f(this.f156842a, y0Var.f156842a) && Intrinsics.f(this.f156843b, y0Var.f156843b);
    }

    public final int hashCode() {
        int iHashCode = this.f156842a.hashCode() * 31;
        String str = this.f156843b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}

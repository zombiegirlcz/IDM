package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class j0 {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294883b;

    public /* synthetic */ j0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(h0.f294859a.getDescriptor(), i, 3);
            throw null;
        }
        this.f294882a = str;
        this.f294883b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f294882a, j0Var.f294882a) && Intrinsics.f(this.f294883b, j0Var.f294883b);
    }

    public final int hashCode() {
        int iHashCode = this.f294882a.hashCode() * 31;
        String str = this.f294883b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}

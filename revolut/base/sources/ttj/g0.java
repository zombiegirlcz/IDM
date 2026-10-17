package ttj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class g0 {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f274344b;

    public /* synthetic */ g0(int i, String str, String str2) {
        if (1 != (i & 1)) {
            qlm.j1.f(e0.f274336a.getDescriptor(), i, 1);
            throw null;
        }
        this.f274343a = str;
        if ((i & 2) == 0) {
            this.f274344b = null;
        } else {
            this.f274344b = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f274343a, g0Var.f274343a) && Intrinsics.f(this.f274344b, g0Var.f274344b);
    }

    public final int hashCode() {
        int iHashCode = this.f274343a.hashCode() * 31;
        String str = this.f274344b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}

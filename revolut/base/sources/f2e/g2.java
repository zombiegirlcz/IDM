package f2e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class g2 {

    @NotNull
    public static final f2 Companion = new f2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131600b;

    public /* synthetic */ g2(int i, String str, String str2) {
        if (1 != (i & 1)) {
            qlm.j1.f(e2.f131575a.getDescriptor(), i, 1);
            throw null;
        }
        this.f131599a = str;
        if ((i & 2) == 0) {
            this.f131600b = null;
        } else {
            this.f131600b = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj2;
        return Intrinsics.f(this.f131599a, g2Var.f131599a) && Intrinsics.f(this.f131600b, g2Var.f131600b);
    }

    public final int hashCode() {
        String str = this.f131599a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f131600b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public g2(String str, String str2) {
        this.f131599a = str;
        this.f131600b = str2;
    }
}

package f2e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class g5 {

    @NotNull
    public static final f5 Companion = new f5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131606b;

    public /* synthetic */ g5(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(e5.f131577a.getDescriptor(), i, 3);
            throw null;
        }
        this.f131605a = str;
        this.f131606b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g5)) {
            return false;
        }
        g5 g5Var = (g5) obj2;
        return Intrinsics.f(this.f131605a, g5Var.f131605a) && Intrinsics.f(this.f131606b, g5Var.f131606b);
    }

    public final int hashCode() {
        return this.f131606b.hashCode() + (this.f131605a.hashCode() * 31);
    }

    public g5(String start, String end2) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        this.f131605a = start;
        this.f131606b = end2;
    }
}

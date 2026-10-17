package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class g5 {

    @NotNull
    public static final f5 Companion = new f5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117683b;

    public /* synthetic */ g5(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(e5.f117664a.getDescriptor(), i, 3);
            throw null;
        }
        this.f117682a = str;
        this.f117683b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g5)) {
            return false;
        }
        g5 g5Var = (g5) obj2;
        return Intrinsics.f(this.f117682a, g5Var.f117682a) && Intrinsics.f(this.f117683b, g5Var.f117683b);
    }

    public final int hashCode() {
        String str = this.f117682a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f117683b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}

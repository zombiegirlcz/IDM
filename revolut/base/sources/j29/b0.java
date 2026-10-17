package j29;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class b0 {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170739b;

    public /* synthetic */ b0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(z.f170774a.getDescriptor(), i, 3);
            throw null;
        }
        this.f170738a = str;
        this.f170739b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f170738a, b0Var.f170738a) && Intrinsics.f(this.f170739b, b0Var.f170739b);
    }

    public final int hashCode() {
        int iHashCode = this.f170738a.hashCode() * 31;
        String str = this.f170739b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}

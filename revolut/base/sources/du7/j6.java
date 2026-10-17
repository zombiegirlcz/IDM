package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class j6 {

    @NotNull
    public static final i6 Companion = new i6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117728b;

    public /* synthetic */ j6(int i, String str, String str2) {
        if (1 != (i & 1)) {
            qlm.j1.f(h6.f117701a.getDescriptor(), i, 1);
            throw null;
        }
        this.f117727a = str;
        if ((i & 2) == 0) {
            this.f117728b = null;
        } else {
            this.f117728b = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j6)) {
            return false;
        }
        j6 j6Var = (j6) obj2;
        return Intrinsics.f(this.f117727a, j6Var.f117727a) && Intrinsics.f(this.f117728b, j6Var.f117728b);
    }

    public final int hashCode() {
        int iHashCode = this.f117727a.hashCode() * 31;
        String str = this.f117728b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
